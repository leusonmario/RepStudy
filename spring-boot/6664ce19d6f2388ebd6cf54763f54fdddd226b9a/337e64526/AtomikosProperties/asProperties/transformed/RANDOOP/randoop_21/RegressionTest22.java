import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration5 = properties0.elements();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties7 = atomikosProperties6.asProperties();
        atomikosProperties6.service = "{-1.0=100}";
        long long10 = atomikosProperties6.getDefaultJtaTimeout();
        long long11 = atomikosProperties6.getMaxTimeout();
        java.lang.String str12 = atomikosProperties6.outputDir;
        atomikosProperties6.consoleFileName = "tm.out";
        int int15 = atomikosProperties6.consoleFileCount;
        java.lang.Object obj16 = properties0.get((java.lang.Object) int15);
        int int17 = properties0.size();
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties0.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery19 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery19.retryInterval = (short) 100;
        recovery19.forgetOrphanedLogEntriesDelay = 'a';
        long long24 = recovery19.retryInterval;
        int int25 = recovery19.maxRetries;
        long long26 = recovery19.getForgetOrphanedLogEntriesDelay();
        java.util.Properties properties27 = new java.util.Properties();
        java.lang.String str28 = properties27.toString();
        java.util.Properties properties29 = new java.util.Properties(properties27);
        boolean boolean30 = properties29.isEmpty();
        java.lang.Object obj33 = properties29.setProperty("tmlog", "{}");
        java.lang.Object obj34 = properties29.clone();
        java.util.Properties properties35 = new java.util.Properties();
        java.lang.String str36 = properties35.toString();
        java.lang.Object obj38 = properties35.remove((java.lang.Object) (short) 100);
        java.lang.Object obj41 = properties35.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean43 = properties35.containsKey((java.lang.Object) 0L);
        java.lang.Object obj46 = properties35.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties47 = new java.util.Properties();
        java.lang.String str48 = properties47.toString();
        java.lang.Object obj50 = properties47.remove((java.lang.Object) (short) 100);
        java.lang.Object obj53 = properties47.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj54 = properties47.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration55 = properties47.elements();
        properties35.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties47);
        boolean boolean57 = properties29.containsValue((java.lang.Object) properties35);
        java.lang.Object obj58 = properties0.put((java.lang.Object) recovery19, (java.lang.Object) properties29);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(objEnumeration5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "{tmlog={}}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "{tmlog={}}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "{tmlog={}}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "{}" + "'", str48, "{}");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.remove((java.lang.Object) (-1.0d));
        boolean boolean3 = properties0.isEmpty();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean5 = atomikosProperties4.isSerialJtaTransactions();
        atomikosProperties4.logBaseName = "{-1.0=100}";
        int int8 = atomikosProperties4.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties4.getRecovery();
        atomikosProperties4.setConsoleFileCount((int) (byte) 100);
        java.lang.String str12 = atomikosProperties4.logBaseName;
        atomikosProperties4.setCheckpointInterval((long) 18);
        long long15 = atomikosProperties4.defaultJtaTimeout;
        java.util.Properties properties16 = atomikosProperties4.asProperties();
        boolean boolean17 = properties0.contains((java.lang.Object) atomikosProperties4);
        java.lang.String str18 = atomikosProperties4.outputDir;
        atomikosProperties4.checkpointInterval = (short) 10;
        java.util.Properties properties21 = atomikosProperties4.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties23 = atomikosProperties22.asProperties();
        atomikosProperties22.service = "{-1.0=100}";
        java.lang.String str26 = atomikosProperties22.getTransactionManagerUniqueName();
        atomikosProperties22.consoleFileLimit = (byte) 10;
        java.lang.String str29 = atomikosProperties22.getTransactionManagerUniqueName();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery30 = atomikosProperties22.recovery;
        int int31 = recovery30.getMaxRetries();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties32 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties33 = atomikosProperties32.asProperties();
        atomikosProperties32.service = "{-1.0=100}";
        long long36 = atomikosProperties32.getDefaultJtaTimeout();
        atomikosProperties32.setThreadedTwoPhaseCommit(true);
        boolean boolean39 = atomikosProperties32.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery40 = atomikosProperties32.recovery;
        boolean boolean41 = atomikosProperties32.threadedTwoPhaseCommit;
        atomikosProperties32.setOutputDir("tmlog");
        boolean boolean44 = atomikosProperties32.isAllowSubTransactions();
        atomikosProperties32.transactionManagerUniqueName = "{={-1.0=100}, -1.0=100}";
        atomikosProperties32.logBaseName = "{1.0=-1}";
        java.lang.Object obj49 = properties21.replace((java.lang.Object) recovery30, (java.lang.Object) "{1.0=-1}");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{-1.0=100}" + "'", str12, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(recovery30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10000L + "'", long36 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(recovery40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        int int5 = atomikosProperties0.getMaxActives();
        java.lang.String str6 = atomikosProperties0.getLogBaseDir();
        atomikosProperties0.setDefaultJtaTimeout((long) (byte) 1);
        atomikosProperties0.setAllowSubTransactions(true);
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration5 = properties0.elements();
        java.util.Properties properties6 = new java.util.Properties(properties0);
        java.util.Properties properties7 = new java.util.Properties(properties6);
        java.util.Properties properties8 = new java.util.Properties(properties6);
        java.util.Properties properties9 = new java.util.Properties();
        java.lang.String str10 = properties9.toString();
        java.lang.Object obj12 = properties9.remove((java.lang.Object) (short) 100);
        java.lang.Object obj15 = properties9.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj16 = properties9.clone();
        java.util.Set<java.lang.String> strSet17 = properties9.stringPropertyNames();
        java.util.Properties properties18 = new java.util.Properties(properties9);
        java.lang.String str20 = properties18.getProperty("hi!");
        java.lang.String str22 = properties18.getProperty("{1.0=-1}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties23 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties24 = atomikosProperties23.asProperties();
        atomikosProperties23.service = "{-1.0=100}";
        long long27 = atomikosProperties23.getDefaultJtaTimeout();
        atomikosProperties23.serialJtaTransactions = true;
        long long30 = atomikosProperties23.maxTimeout;
        atomikosProperties23.setLogBaseDir("{-1.0=100}");
        int int33 = atomikosProperties23.getConsoleFileCount();
        atomikosProperties23.maxTimeout = (short) 100;
        boolean boolean36 = properties18.equals((java.lang.Object) atomikosProperties23);
        java.lang.Object obj37 = properties18.clone();
        java.lang.Object obj38 = properties8.get((java.lang.Object) properties18);
        java.util.Properties properties39 = new java.util.Properties();
        java.lang.Object obj41 = properties39.remove((java.lang.Object) (-1.0d));
        boolean boolean42 = properties39.isEmpty();
        java.lang.Object obj45 = properties39.setProperty("hi!", "{}");
        java.util.Collection<java.lang.Object> objCollection46 = properties39.values();
        properties8.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties39);
        java.util.Properties properties48 = new java.util.Properties();
        java.lang.String str49 = properties48.toString();
        java.util.Properties properties50 = new java.util.Properties(properties48);
        java.lang.Object obj53 = properties48.setProperty("", "{={-1.0=100}, -1.0=100}");
        java.util.Properties properties54 = new java.util.Properties();
        java.lang.String str55 = properties54.toString();
        java.lang.Object obj57 = properties54.remove((java.lang.Object) (short) 100);
        java.lang.Object obj60 = properties54.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean62 = properties54.containsKey((java.lang.Object) 0L);
        java.lang.Object obj65 = properties54.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj68 = properties54.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration69 = properties54.keys();
        boolean boolean70 = properties48.equals((java.lang.Object) properties54);
        java.lang.Object obj71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = properties39.replace((java.lang.Object) properties54, obj71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(objEnumeration5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{1.0=-1}");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10000L + "'", long27 == 10000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 300000L + "'", long30 == 300000L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "{}");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objCollection46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{}" + "'", str49, "{}");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{}" + "'", str55, "{}");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(objEnumeration69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties12 = new java.util.Properties();
        java.lang.String str13 = properties12.toString();
        java.lang.Object obj15 = properties12.remove((java.lang.Object) (short) 100);
        java.lang.Object obj18 = properties12.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj19 = properties12.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration20 = properties12.elements();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties12);
        java.lang.Object obj24 = properties12.setProperty("{={-1.0=100}, -1.0=100}", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery25 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery25.retryInterval = (short) 100;
        recovery25.forgetOrphanedLogEntriesDelay = 'a';
        long long30 = recovery25.getDelay();
        int int31 = recovery25.maxRetries;
        recovery25.delay = 1L;
        boolean boolean34 = properties12.contains((java.lang.Object) recovery25);
        java.util.Enumeration<java.lang.Object> objEnumeration35 = properties12.keys();
        java.util.Properties properties36 = new java.util.Properties(properties12);
        java.lang.String str39 = properties36.getProperty("tm.out", "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10000L + "'", long30 == 10000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objEnumeration35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.lang.Object obj5 = properties0.setProperty("", "{={-1.0=100}, -1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties7 = atomikosProperties6.asProperties();
        atomikosProperties6.service = "{-1.0=100}";
        long long10 = atomikosProperties6.getDefaultJtaTimeout();
        atomikosProperties6.serialJtaTransactions = true;
        atomikosProperties6.maxActives = ' ';
        int int15 = atomikosProperties6.maxActives;
        java.util.Properties properties16 = new java.util.Properties();
        java.lang.String str17 = properties16.toString();
        java.lang.Object obj19 = properties16.remove((java.lang.Object) (short) 100);
        java.lang.Object obj22 = properties16.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties24 = new java.util.Properties();
        java.lang.String str25 = properties24.toString();
        java.lang.Object obj27 = properties24.remove((java.lang.Object) (short) 100);
        java.lang.Object obj30 = properties24.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj31 = properties24.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration32 = properties24.elements();
        java.lang.Object obj33 = properties16.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration32);
        java.lang.String str34 = properties16.toString();
        boolean boolean35 = properties0.remove((java.lang.Object) atomikosProperties6, (java.lang.Object) properties16);
        int int36 = atomikosProperties6.getConsoleFileLimit();
        atomikosProperties6.setConsoleFileName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties40 = atomikosProperties39.asProperties();
        atomikosProperties39.service = "{-1.0=100}";
        long long43 = atomikosProperties39.getDefaultJtaTimeout();
        atomikosProperties39.setTransactionManagerUniqueName("{}");
        atomikosProperties39.consoleFileName = "hi!";
        int int48 = atomikosProperties39.getConsoleFileCount();
        boolean boolean49 = atomikosProperties39.isThreadedTwoPhaseCommit();
        atomikosProperties39.maxTimeout = 0;
        atomikosProperties39.setLogBaseName("hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties54 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties54.setAllowSubTransactions(true);
        boolean boolean57 = atomikosProperties54.enableLogging;
        boolean boolean58 = atomikosProperties54.isForceShutdownOnVmExit();
        java.lang.String str59 = atomikosProperties54.getService();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties60 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties60.setAllowSubTransactions(true);
        boolean boolean63 = atomikosProperties60.enableLogging;
        boolean boolean64 = atomikosProperties60.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel65 = atomikosProperties60.consoleLogLevel;
        atomikosProperties54.consoleLogLevel = atomikosLoggingLevel65;
        atomikosProperties39.setConsoleLogLevel(atomikosLoggingLevel65);
        atomikosProperties6.consoleLogLevel = atomikosLoggingLevel65;
        atomikosProperties6.forceShutdownOnVmExit = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10000L + "'", long43 == 10000L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel65 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel65.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        long long7 = atomikosProperties0.getCheckpointInterval();
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        java.lang.String str9 = atomikosProperties0.getLogBaseName();
        java.lang.String str10 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setOutputDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        atomikosProperties0.forceShutdownOnVmExit = true;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tmlog" + "'", str9, "tmlog");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str10, "{={-1.0=100}, -1.0=100}");
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        long long5 = recovery0.retryInterval;
        recovery0.forgetOrphanedLogEntriesDelay = 0L;
        long long8 = recovery0.getForgetOrphanedLogEntriesDelay();
        long long9 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.retryInterval = 0L;
        long long12 = recovery0.retryInterval;
        int int13 = recovery0.maxRetries;
        recovery0.setMaxRetries((int) 'a');
        long long16 = recovery0.getRetryInterval();
        recovery0.delay = ' ';
        long long19 = recovery0.forgetOrphanedLogEntriesDelay;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.service = "tm.out";
        atomikosProperties0.logBaseName = "tm.out";
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        boolean boolean15 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.setService("{100=100}");
        boolean boolean18 = atomikosProperties0.isForceShutdownOnVmExit();
        atomikosProperties0.logBaseDir = "{{1.0=-1}=hi!}";
        java.lang.String str21 = atomikosProperties0.outputDir;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        boolean boolean5 = atomikosProperties0.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel6 = atomikosProperties0.getConsoleLogLevel();
        boolean boolean7 = atomikosProperties0.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.getRecovery();
        long long9 = recovery8.getDelay();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel6 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel6.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.enableLogging = false;
        atomikosProperties0.setMaxTimeout((long) (byte) 0);
        atomikosProperties0.setAllowSubTransactions(true);
        java.util.Properties properties11 = new java.util.Properties();
        java.lang.Object obj13 = properties11.remove((java.lang.Object) (-1.0d));
        boolean boolean14 = properties11.isEmpty();
        java.util.Properties properties15 = new java.util.Properties();
        java.lang.String str16 = properties15.toString();
        java.lang.Object obj18 = properties15.remove((java.lang.Object) (short) 100);
        java.lang.Object obj21 = properties15.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean23 = properties15.containsKey((java.lang.Object) 0L);
        java.lang.Object obj26 = properties15.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj29 = properties15.setProperty("", "{-1.0=100}");
        java.lang.Object obj30 = properties15.clone();
        java.lang.Object obj31 = properties11.get((java.lang.Object) properties15);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery33 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery33.retryInterval = (short) 100;
        recovery33.forgetOrphanedLogEntriesDelay = 'a';
        long long38 = recovery33.getDelay();
        long long39 = recovery33.getRetryInterval();
        recovery33.forgetOrphanedLogEntriesDelay = 10000L;
        atomikosProperties0.set(properties15, "tmlog", (java.lang.Object) recovery33);
        recovery33.retryInterval = 10;
        recovery33.retryInterval = 86400000L;
        recovery33.setRetryInterval(0L);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
// flaky:         org.junit.Assert.assertEquals(obj30.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10000L + "'", long38 == 10000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.remove((java.lang.Object) (-1.0d));
        boolean boolean3 = properties0.isEmpty();
        java.util.Collection<java.lang.Object> objCollection4 = properties0.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties5 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties6 = atomikosProperties5.asProperties();
        atomikosProperties5.service = "{-1.0=100}";
        long long9 = atomikosProperties5.getDefaultJtaTimeout();
        atomikosProperties5.serialJtaTransactions = true;
        long long12 = atomikosProperties5.getDefaultJtaTimeout();
        long long13 = atomikosProperties5.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery14 = atomikosProperties5.getRecovery();
        long long15 = recovery14.delay;
        int int16 = recovery14.maxRetries;
        java.lang.Object obj17 = properties0.get((java.lang.Object) int16);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery18 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery18.retryInterval = (short) 100;
        recovery18.forgetOrphanedLogEntriesDelay = 'a';
        long long23 = recovery18.getDelay();
        int int24 = recovery18.maxRetries;
        int int25 = recovery18.maxRetries;
        recovery18.setDelay((long) (-1));
        long long28 = recovery18.forgetOrphanedLogEntriesDelay;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.lang.String str30 = atomikosProperties29.getOutputDir();
        atomikosProperties29.threadedTwoPhaseCommit = false;
        java.lang.Object obj33 = properties0.getOrDefault((java.lang.Object) recovery18, (java.lang.Object) atomikosProperties29);
        long long34 = recovery18.getForgetOrphanedLogEntriesDelay();
        recovery18.setDelay(0L);
        long long37 = recovery18.getDelay();
        long long38 = recovery18.getDelay();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10000L + "'", long12 == 10000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertNotNull(recovery14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10000L + "'", long23 == 10000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        int int8 = atomikosProperties0.getConsoleFileLimit();
        boolean boolean9 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setMaxTimeout(300000L);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery12 = atomikosProperties0.getRecovery();
        java.lang.String str13 = atomikosProperties0.consoleFileName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery14 = atomikosProperties0.getRecovery();
        atomikosProperties0.setService("hi!");
        java.lang.String str17 = atomikosProperties0.getConsoleFileName();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(recovery12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tm.out" + "'", str13, "tm.out");
        org.junit.Assert.assertNotNull(recovery14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tm.out" + "'", str17, "tm.out");
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.delay = (-1L);
        long long5 = recovery0.delay;
        recovery0.maxRetries = 0;
        recovery0.setDelay((long) (short) 10);
        long long10 = recovery0.getRetryInterval();
        recovery0.retryInterval = 18L;
        recovery0.forgetOrphanedLogEntriesDelay = 1;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.recovery;
        int int9 = atomikosProperties0.getConsoleFileLimit();
        boolean boolean10 = atomikosProperties0.isForceShutdownOnVmExit();
        boolean boolean11 = atomikosProperties0.serialJtaTransactions;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        boolean boolean8 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.allowSubTransactions = false;
        atomikosProperties0.threadedTwoPhaseCommit = true;
        java.lang.String str13 = atomikosProperties0.getLogBaseDir();
        java.util.Properties properties14 = new java.util.Properties();
        java.lang.String str15 = properties14.toString();
        java.lang.Object obj17 = properties14.remove((java.lang.Object) (short) 100);
        java.util.Properties properties18 = new java.util.Properties();
        java.lang.String str19 = properties18.toString();
        boolean boolean20 = properties18.isEmpty();
        java.lang.Object obj23 = properties18.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration24 = properties18.elements();
        boolean boolean25 = properties14.containsKey((java.lang.Object) properties18);
        java.util.Enumeration<?> wildcardEnumeration26 = properties14.propertyNames();
        java.util.Properties properties27 = new java.util.Properties(properties14);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties29 = atomikosProperties28.asProperties();
        atomikosProperties28.service = "{-1.0=100}";
        long long32 = atomikosProperties28.getDefaultJtaTimeout();
        boolean boolean33 = atomikosProperties28.enableLogging;
        boolean boolean34 = atomikosProperties28.isForceShutdownOnVmExit();
        atomikosProperties28.consoleFileLimit = (byte) -1;
        java.lang.String str37 = atomikosProperties28.getService();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel38 = atomikosProperties28.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties40 = atomikosProperties39.asProperties();
        atomikosProperties39.service = "{-1.0=100}";
        long long43 = atomikosProperties39.getDefaultJtaTimeout();
        atomikosProperties39.serialJtaTransactions = true;
        long long46 = atomikosProperties39.maxTimeout;
        atomikosProperties39.setLogBaseDir("{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties49 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties49.setAllowSubTransactions(true);
        atomikosProperties49.maxActives = (short) -1;
        atomikosProperties49.setService("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties56.setAllowSubTransactions(true);
        boolean boolean59 = atomikosProperties56.enableLogging;
        boolean boolean60 = atomikosProperties56.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel61 = atomikosProperties56.consoleLogLevel;
        atomikosProperties49.setConsoleLogLevel(atomikosLoggingLevel61);
        atomikosProperties39.consoleLogLevel = atomikosLoggingLevel61;
        atomikosProperties28.consoleLogLevel = atomikosLoggingLevel61;
        boolean boolean65 = properties27.containsValue((java.lang.Object) atomikosLoggingLevel61);
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel61;
        atomikosProperties0.consoleFileLimit = (short) 10;
        java.util.Properties properties69 = atomikosProperties0.asProperties();
        atomikosProperties0.checkpointInterval = 500L;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objEnumeration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardEnumeration26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10000L + "'", long32 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{-1.0=100}" + "'", str37, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel38 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel38.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10000L + "'", long43 == 10000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 300000L + "'", long46 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel61 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel61.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(properties69);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.maxActives = (short) -1;
        atomikosProperties0.setCheckpointInterval(100L);
        boolean boolean7 = atomikosProperties0.isSerialJtaTransactions();
        java.lang.String str8 = atomikosProperties0.service;
        boolean boolean9 = atomikosProperties0.isForceShutdownOnVmExit();
        java.lang.String str10 = atomikosProperties0.getLogBaseDir();
        long long11 = atomikosProperties0.getCheckpointInterval();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        java.lang.String str15 = properties0.toString();
        java.util.Set<java.lang.String> strSet16 = properties0.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties18 = atomikosProperties17.asProperties();
        atomikosProperties17.service = "{-1.0=100}";
        long long21 = atomikosProperties17.getDefaultJtaTimeout();
        atomikosProperties17.enableLogging = false;
        atomikosProperties17.setMaxTimeout((long) (byte) 0);
        atomikosProperties17.setAllowSubTransactions(true);
        java.util.Properties properties28 = new java.util.Properties();
        java.lang.Object obj30 = properties28.remove((java.lang.Object) (-1.0d));
        boolean boolean31 = properties28.isEmpty();
        java.util.Collection<java.lang.Object> objCollection32 = properties28.values();
        java.lang.Object obj33 = properties0.put((java.lang.Object) true, (java.lang.Object) properties28);
        java.util.Properties properties34 = new java.util.Properties(properties28);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties35 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties36 = atomikosProperties35.asProperties();
        atomikosProperties35.service = "{-1.0=100}";
        long long39 = atomikosProperties35.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel40 = null;
        atomikosProperties35.setConsoleLogLevel(atomikosLoggingLevel40);
        int int42 = atomikosProperties35.maxActives;
        java.util.Properties properties43 = new java.util.Properties();
        java.lang.Object obj45 = properties43.remove((java.lang.Object) (-1.0d));
        java.util.Enumeration<?> wildcardEnumeration46 = properties43.propertyNames();
        java.util.Set<java.lang.Object> objSet47 = properties43.keySet();
        java.util.Set<java.lang.String> strSet48 = properties43.stringPropertyNames();
        java.util.Properties properties50 = new java.util.Properties();
        atomikosProperties35.set(properties43, "tm.out", (java.lang.Object) properties50);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties52 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties53 = atomikosProperties52.asProperties();
        atomikosProperties52.service = "{-1.0=100}";
        long long56 = atomikosProperties52.getDefaultJtaTimeout();
        atomikosProperties52.setThreadedTwoPhaseCommit(true);
        boolean boolean59 = atomikosProperties52.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery60 = atomikosProperties52.recovery;
        atomikosProperties52.setLogBaseDir("");
        atomikosProperties52.setConsoleFileName("");
        atomikosProperties52.setThreadedTwoPhaseCommit(false);
        java.lang.Object obj67 = properties34.getOrDefault((java.lang.Object) "tm.out", (java.lang.Object) false);
        java.lang.String str68 = properties34.toString();
        java.lang.String str70 = properties34.getProperty("{-1.0=100}");
        java.util.Properties properties71 = new java.util.Properties(properties34);
        java.io.OutputStream outputStream72 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties34.storeToXML(outputStream72, "{{1.0=-1, -1.0=100}={1.0=-1}, 1.0=-1}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str15, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10000L + "'", long21 == 10000L);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objCollection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10000L + "'", long39 == 10000L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 50 + "'", int42 == 50);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardEnumeration46);
        org.junit.Assert.assertNotNull(objSet47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10000L + "'", long56 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(recovery60);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "{}" + "'", str68, "{}");
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        boolean boolean2 = properties0.isEmpty();
        java.lang.Object obj5 = properties0.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Properties properties6 = new java.util.Properties();
        java.lang.Object obj8 = properties6.remove((java.lang.Object) (-1.0d));
        boolean boolean9 = properties6.isEmpty();
        java.lang.Object obj12 = properties6.setProperty("hi!", "{}");
        java.lang.Object obj14 = properties0.getOrDefault((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        properties0.clear();
        java.util.Properties properties16 = new java.util.Properties();
        java.lang.String str17 = properties16.toString();
        java.util.Properties properties18 = new java.util.Properties(properties16);
        boolean boolean19 = properties18.isEmpty();
        java.lang.Object obj22 = properties18.setProperty("tmlog", "{}");
        boolean boolean23 = properties0.containsValue((java.lang.Object) properties18);
        java.util.Properties properties24 = new java.util.Properties();
        java.lang.Object obj27 = properties24.setProperty("{}", "{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery28 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery28.retryInterval = (short) 100;
        recovery28.setForgetOrphanedLogEntriesDelay((long) 5);
        recovery28.setForgetOrphanedLogEntriesDelay((long) (short) 0);
        java.util.Properties properties35 = new java.util.Properties();
        java.lang.String str36 = properties35.toString();
        java.lang.Object obj38 = properties35.remove((java.lang.Object) (short) 100);
        java.util.Properties properties39 = new java.util.Properties();
        java.lang.String str40 = properties39.toString();
        boolean boolean41 = properties39.isEmpty();
        java.lang.Object obj44 = properties39.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration45 = properties39.elements();
        boolean boolean46 = properties35.containsKey((java.lang.Object) properties39);
        java.lang.Object obj47 = properties24.putIfAbsent((java.lang.Object) (short) 0, (java.lang.Object) properties39);
        int int48 = properties24.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties49 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties50 = atomikosProperties49.asProperties();
        atomikosProperties49.service = "{-1.0=100}";
        long long53 = atomikosProperties49.getDefaultJtaTimeout();
        atomikosProperties49.outputDir = "{={-1.0=100}, -1.0=100}";
        long long56 = atomikosProperties49.getCheckpointInterval();
        atomikosProperties49.setConsoleFileCount((int) (byte) 1);
        boolean boolean59 = atomikosProperties49.threadedTwoPhaseCommit;
        int int60 = atomikosProperties49.getMaxActives();
        boolean boolean61 = atomikosProperties49.isAllowSubTransactions();
        java.util.Properties properties62 = new java.util.Properties();
        java.lang.Object obj64 = properties62.remove((java.lang.Object) (-1.0d));
        java.util.Enumeration<?> wildcardEnumeration65 = properties62.propertyNames();
        boolean boolean66 = properties0.replace((java.lang.Object) int48, (java.lang.Object) atomikosProperties49, (java.lang.Object) properties62);
        java.util.Enumeration<java.lang.Object> objEnumeration67 = properties62.keys();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{}" + "'", str40, "{}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objEnumeration45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10000L + "'", long53 == 10000L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 500L + "'", long56 == 500L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 50 + "'", int60 == 50);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(wildcardEnumeration65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objEnumeration67);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        boolean boolean6 = atomikosProperties0.serialJtaTransactions;
        atomikosProperties0.forceShutdownOnVmExit = true;
        long long9 = atomikosProperties0.defaultJtaTimeout;
        atomikosProperties0.setSerialJtaTransactions(true);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        boolean boolean8 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.allowSubTransactions = false;
        atomikosProperties0.threadedTwoPhaseCommit = true;
        atomikosProperties0.setLogBaseName("tm.out");
        java.lang.String str15 = atomikosProperties0.getLogBaseDir();
        boolean boolean16 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.checkpointInterval = (short) -1;
        long long19 = atomikosProperties0.maxTimeout;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 300000L + "'", long19 == 300000L);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery4 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery4.retryInterval = (short) 100;
        recovery4.setForgetOrphanedLogEntriesDelay((long) 5);
        recovery4.setForgetOrphanedLogEntriesDelay((long) (short) 0);
        java.util.Properties properties11 = new java.util.Properties();
        java.lang.String str12 = properties11.toString();
        java.lang.Object obj14 = properties11.remove((java.lang.Object) (short) 100);
        java.util.Properties properties15 = new java.util.Properties();
        java.lang.String str16 = properties15.toString();
        boolean boolean17 = properties15.isEmpty();
        java.lang.Object obj20 = properties15.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration21 = properties15.elements();
        boolean boolean22 = properties11.containsKey((java.lang.Object) properties15);
        java.lang.Object obj23 = properties0.putIfAbsent((java.lang.Object) (short) 0, (java.lang.Object) properties15);
        int int24 = properties0.size();
        java.util.Properties properties25 = new java.util.Properties();
        java.lang.String str26 = properties25.toString();
        java.lang.Object obj28 = properties25.remove((java.lang.Object) (short) 100);
        java.lang.Object obj31 = properties25.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean33 = properties25.containsKey((java.lang.Object) 0L);
        java.lang.Object obj36 = properties25.replace((java.lang.Object) false, (java.lang.Object) ' ');
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties38 = atomikosProperties37.asProperties();
        atomikosProperties37.service = "{-1.0=100}";
        java.lang.String str41 = atomikosProperties37.getLogBaseName();
        long long42 = atomikosProperties37.defaultJtaTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel43 = null;
        atomikosProperties37.setConsoleLogLevel(atomikosLoggingLevel43);
        atomikosProperties37.service = "";
        atomikosProperties37.serialJtaTransactions = true;
        java.lang.Object obj49 = properties25.remove((java.lang.Object) atomikosProperties37);
        java.util.Enumeration<java.lang.Object> objEnumeration50 = properties25.keys();
        boolean boolean51 = properties0.contains((java.lang.Object) objEnumeration50);
        java.lang.String str53 = properties0.getProperty("{{}={}}");
        java.io.Reader reader54 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.load(reader54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objEnumeration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "tmlog" + "'", str41, "tmlog");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10000L + "'", long42 == 10000L);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(objEnumeration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties3 = atomikosProperties2.asProperties();
        atomikosProperties2.service = "{-1.0=100}";
        long long6 = atomikosProperties2.getDefaultJtaTimeout();
        atomikosProperties2.consoleFileLimit = '#';
        java.lang.Object obj9 = properties1.get((java.lang.Object) atomikosProperties2);
        boolean boolean10 = atomikosProperties2.forceShutdownOnVmExit;
        atomikosProperties2.setOutputDir("");
        atomikosProperties2.setThreadedTwoPhaseCommit(false);
        atomikosProperties2.maxActives = 35;
        atomikosProperties2.setForceShutdownOnVmExit(false);
        atomikosProperties2.setDefaultJtaTimeout((long) 100);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.setService("tm.out");
        atomikosProperties0.setSerialJtaTransactions(true);
        java.util.Properties properties14 = atomikosProperties0.asProperties();
        java.lang.String str15 = atomikosProperties0.logBaseName;
        java.lang.String str16 = atomikosProperties0.getLogBaseName();
        atomikosProperties0.setSerialJtaTransactions(true);
        java.util.Properties properties19 = atomikosProperties0.asProperties();
        atomikosProperties0.defaultJtaTimeout = 0L;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{-1.0=100}" + "'", str15, "{-1.0=100}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{-1.0=100}" + "'", str16, "{-1.0=100}");
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.enableLogging = false;
        atomikosProperties0.setMaxTimeout((long) (byte) 0);
        atomikosProperties0.setAllowSubTransactions(true);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties12 = atomikosProperties11.asProperties();
        atomikosProperties11.service = "{-1.0=100}";
        java.lang.String str15 = atomikosProperties11.getTransactionManagerUniqueName();
        boolean boolean16 = atomikosProperties11.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel17 = atomikosProperties11.getConsoleLogLevel();
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel17;
        long long19 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery20 = atomikosProperties0.recovery;
        int int21 = atomikosProperties0.consoleFileCount;
        atomikosProperties0.consoleFileLimit = 5;
        atomikosProperties0.setMaxActives((int) (byte) 10);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel17 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel17.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 500L + "'", long19 == 500L);
        org.junit.Assert.assertNotNull(recovery20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel8 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel8;
        java.lang.String str10 = atomikosProperties0.logBaseDir;
        java.lang.String str11 = atomikosProperties0.consoleFileName;
        int int12 = atomikosProperties0.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties13.setAllowSubTransactions(true);
        boolean boolean16 = atomikosProperties13.enableLogging;
        boolean boolean17 = atomikosProperties13.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel18 = atomikosProperties13.consoleLogLevel;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel18);
        java.lang.String str20 = atomikosProperties0.logBaseDir;
        atomikosProperties0.setMaxActives((int) (short) 10);
        atomikosProperties0.serialJtaTransactions = false;
        atomikosProperties0.setTransactionManagerUniqueName("{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        atomikosProperties0.serialJtaTransactions = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tm.out" + "'", str11, "tm.out");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel18 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel18.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.lang.String str9 = properties0.getProperty("{}");
        java.lang.Object obj12 = properties0.put((java.lang.Object) 86400000L, (java.lang.Object) "{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties14 = atomikosProperties13.asProperties();
        atomikosProperties13.service = "{-1.0=100}";
        java.lang.String str17 = atomikosProperties13.getTransactionManagerUniqueName();
        boolean boolean18 = atomikosProperties13.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel19 = atomikosProperties13.getConsoleLogLevel();
        java.lang.Object obj20 = properties0.remove((java.lang.Object) atomikosProperties13);
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        java.lang.Object obj24 = properties21.remove((java.lang.Object) (short) 100);
        java.lang.Object obj27 = properties21.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties29 = atomikosProperties28.asProperties();
        java.lang.Object obj30 = properties21.remove((java.lang.Object) properties29);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties32 = atomikosProperties31.asProperties();
        atomikosProperties31.service = "{-1.0=100}";
        long long35 = atomikosProperties31.getDefaultJtaTimeout();
        atomikosProperties31.setThreadedTwoPhaseCommit(true);
        boolean boolean38 = atomikosProperties31.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery39 = atomikosProperties31.recovery;
        atomikosProperties31.setLogBaseDir("");
        long long42 = atomikosProperties31.maxTimeout;
        boolean boolean43 = atomikosProperties31.forceShutdownOnVmExit;
        boolean boolean44 = properties29.containsValue((java.lang.Object) atomikosProperties31);
        boolean boolean45 = atomikosProperties31.enableLogging;
        int int46 = atomikosProperties31.consoleFileCount;
        long long47 = atomikosProperties31.checkpointInterval;
        java.lang.String str48 = atomikosProperties31.getLogBaseDir();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties49 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties50 = atomikosProperties49.asProperties();
        atomikosProperties49.service = "{-1.0=100}";
        long long53 = atomikosProperties49.getDefaultJtaTimeout();
        long long54 = atomikosProperties49.getMaxTimeout();
        int int55 = atomikosProperties49.consoleFileCount;
        long long56 = atomikosProperties49.getCheckpointInterval();
        java.lang.String str57 = atomikosProperties49.outputDir;
        atomikosProperties49.setEnableLogging(false);
        boolean boolean60 = atomikosProperties49.forceShutdownOnVmExit;
        java.lang.Object obj61 = properties0.getOrDefault((java.lang.Object) atomikosProperties31, (java.lang.Object) atomikosProperties49);
        atomikosProperties49.consoleFileName = "{com.atomikos.icatch.console_file_name=hi!, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=tm.out, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel19 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel19.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10000L + "'", long35 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(recovery39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 300000L + "'", long42 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 500L + "'", long47 == 500L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10000L + "'", long53 == 10000L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 300000L + "'", long54 == 300000L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 500L + "'", long56 == 500L);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties12 = new java.util.Properties();
        java.lang.String str13 = properties12.toString();
        java.lang.Object obj15 = properties12.remove((java.lang.Object) (short) 100);
        java.lang.Object obj18 = properties12.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj19 = properties12.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration20 = properties12.elements();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties12);
        boolean boolean23 = properties0.equals((java.lang.Object) 1.0f);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties24.setAllowSubTransactions(true);
        boolean boolean27 = atomikosProperties24.isSerialJtaTransactions();
        atomikosProperties24.setLogBaseDir("hi!");
        boolean boolean30 = properties0.containsKey((java.lang.Object) atomikosProperties24);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet31 = properties0.entrySet();
        java.util.Properties properties32 = new java.util.Properties();
        java.lang.String str33 = properties32.toString();
        java.lang.Object obj35 = properties32.remove((java.lang.Object) (short) 100);
        java.lang.Object obj38 = properties32.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean40 = properties32.containsKey((java.lang.Object) 0L);
        java.lang.Object obj43 = properties32.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties44 = new java.util.Properties(properties32);
        java.lang.String str46 = properties44.getProperty("hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties48 = atomikosProperties47.asProperties();
        atomikosProperties47.service = "{-1.0=100}";
        java.lang.String str51 = atomikosProperties47.getTransactionManagerUniqueName();
        atomikosProperties47.consoleFileName = "hi!";
        atomikosProperties47.setCheckpointInterval((long) 5);
        atomikosProperties47.setLogBaseDir("{-1.0=100}");
        java.lang.String str58 = atomikosProperties47.getOutputDir();
        boolean boolean59 = atomikosProperties47.isSerialJtaTransactions();
        java.lang.String str60 = atomikosProperties47.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery61 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long62 = recovery61.getRetryInterval();
        long long63 = recovery61.getDelay();
        long long64 = recovery61.getDelay();
        recovery61.setForgetOrphanedLogEntriesDelay(10000L);
        recovery61.retryInterval = '4';
        recovery61.setRetryInterval((long) (short) 0);
        long long71 = recovery61.getForgetOrphanedLogEntriesDelay();
        long long72 = recovery61.getDelay();
        recovery61.setMaxRetries((int) (byte) 0);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties75 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties76 = atomikosProperties75.asProperties();
        atomikosProperties75.service = "{-1.0=100}";
        long long79 = atomikosProperties75.getDefaultJtaTimeout();
        atomikosProperties75.setTransactionManagerUniqueName("{}");
        atomikosProperties75.consoleFileName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel84 = atomikosProperties75.getConsoleLogLevel();
        int int85 = atomikosProperties75.getConsoleFileCount();
        atomikosProperties75.setMaxActives((int) (short) 1);
        boolean boolean88 = properties44.replace((java.lang.Object) atomikosProperties47, (java.lang.Object) (byte) 0, (java.lang.Object) (short) 1);
        java.lang.Object obj89 = properties0.remove((java.lang.Object) atomikosProperties47);
        java.util.Collection<java.lang.Object> objCollection90 = properties0.values();
        java.lang.String str91 = properties0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objEntrySet31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{}" + "'", str33, "{}");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10000L + "'", long62 == 10000L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10000L + "'", long63 == 10000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10000L + "'", long64 == 10000L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10000L + "'", long71 == 10000L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10000L + "'", long72 == 10000L);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10000L + "'", long79 == 10000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel84 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel84.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(objCollection90);
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "{1.0=-1, -1.0=100}" + "'", str91, "{1.0=-1, -1.0=100}");
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties();
        java.lang.String str2 = properties1.toString();
        java.lang.Object obj4 = properties1.remove((java.lang.Object) (short) 100);
        java.lang.Object obj7 = properties1.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        int int8 = properties1.size();
        java.util.Properties properties9 = new java.util.Properties();
        java.lang.Object obj11 = properties9.remove((java.lang.Object) (-1.0d));
        boolean boolean12 = properties9.isEmpty();
        java.lang.Object obj15 = properties9.setProperty("hi!", "{}");
        boolean boolean16 = properties0.remove((java.lang.Object) int8, (java.lang.Object) properties9);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties17.setAllowSubTransactions(true);
        atomikosProperties17.maxActives = (short) -1;
        atomikosProperties17.setService("tm.out");
        boolean boolean24 = properties9.containsValue((java.lang.Object) atomikosProperties17);
        java.util.Set<java.lang.Object> objSet25 = properties9.keySet();
        java.util.Properties properties26 = new java.util.Properties();
        java.lang.String str27 = properties26.toString();
        java.lang.Object obj29 = properties26.remove((java.lang.Object) (short) 100);
        java.lang.Object obj32 = properties26.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean34 = properties26.containsKey((java.lang.Object) 0L);
        java.lang.Object obj37 = properties26.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties38 = new java.util.Properties(properties26);
        java.util.Enumeration<java.lang.Object> objEnumeration39 = properties38.elements();
        java.util.Properties properties40 = new java.util.Properties();
        java.lang.Object obj43 = properties40.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration44 = properties40.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration45 = properties40.elements();
        java.util.Properties properties46 = new java.util.Properties(properties40);
        java.util.Properties properties47 = new java.util.Properties(properties46);
        java.util.Properties properties48 = new java.util.Properties(properties46);
        java.util.Collection<java.lang.Object> objCollection49 = properties46.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties50 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties51 = atomikosProperties50.asProperties();
        atomikosProperties50.service = "{-1.0=100}";
        long long54 = atomikosProperties50.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel55 = null;
        atomikosProperties50.setConsoleLogLevel(atomikosLoggingLevel55);
        atomikosProperties50.setTransactionManagerUniqueName("{-1.0=100}");
        int int59 = atomikosProperties50.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties60 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties60.setAllowSubTransactions(true);
        atomikosProperties60.maxActives = (short) -1;
        atomikosProperties60.setService("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties67 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties67.setAllowSubTransactions(true);
        boolean boolean70 = atomikosProperties67.enableLogging;
        boolean boolean71 = atomikosProperties67.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel72 = atomikosProperties67.consoleLogLevel;
        atomikosProperties60.setConsoleLogLevel(atomikosLoggingLevel72);
        atomikosProperties50.setConsoleLogLevel(atomikosLoggingLevel72);
        java.lang.Object obj75 = properties38.put((java.lang.Object) properties46, (java.lang.Object) atomikosProperties50);
        properties9.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties46);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties77 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties78 = atomikosProperties77.asProperties();
        atomikosProperties77.service = "{-1.0=100}";
        long long81 = atomikosProperties77.getDefaultJtaTimeout();
        atomikosProperties77.setThreadedTwoPhaseCommit(true);
        boolean boolean84 = atomikosProperties77.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery85 = atomikosProperties77.recovery;
        atomikosProperties77.setLogBaseDir("");
        atomikosProperties77.setConsoleFileName("");
        atomikosProperties77.setThreadedTwoPhaseCommit(false);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery92 = atomikosProperties77.getRecovery();
        java.lang.Object obj93 = null;
        java.lang.Object obj94 = properties46.getOrDefault((java.lang.Object) atomikosProperties77, obj93);
        atomikosProperties77.consoleFileLimit = (short) 100;
        java.lang.String str97 = atomikosProperties77.getTransactionManagerUniqueName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objSet25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objEnumeration39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objEnumeration44);
        org.junit.Assert.assertNotNull(objEnumeration45);
        org.junit.Assert.assertNotNull(objCollection49);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10000L + "'", long54 == 10000L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 50 + "'", int59 == 50);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel72 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel72.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(properties78);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10000L + "'", long81 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(recovery85);
        org.junit.Assert.assertNotNull(recovery92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties3 = atomikosProperties2.asProperties();
        atomikosProperties2.service = "{-1.0=100}";
        long long6 = atomikosProperties2.getDefaultJtaTimeout();
        atomikosProperties2.enableLogging = false;
        atomikosProperties2.setMaxActives((int) ' ');
        java.util.Properties properties11 = atomikosProperties2.asProperties();
        java.lang.String str12 = atomikosProperties2.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties14 = atomikosProperties13.asProperties();
        atomikosProperties13.service = "{-1.0=100}";
        long long17 = atomikosProperties13.getDefaultJtaTimeout();
        atomikosProperties13.setMaxActives(0);
        boolean boolean20 = atomikosProperties13.threadedTwoPhaseCommit;
        boolean boolean21 = atomikosProperties13.allowSubTransactions;
        atomikosProperties13.logBaseDir = "{}";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean25 = atomikosProperties24.isSerialJtaTransactions();
        atomikosProperties24.logBaseName = "{-1.0=100}";
        int int28 = atomikosProperties24.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery29 = atomikosProperties24.getRecovery();
        atomikosProperties24.setConsoleFileCount((int) (byte) 100);
        atomikosProperties24.setAllowSubTransactions(true);
        atomikosProperties24.setService("tm.out");
        boolean boolean36 = atomikosProperties24.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel37 = atomikosProperties24.getConsoleLogLevel();
        atomikosProperties13.setConsoleLogLevel(atomikosLoggingLevel37);
        atomikosProperties2.consoleLogLevel = atomikosLoggingLevel37;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel37);
        atomikosProperties0.consoleFileLimit = 0;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties44 = atomikosProperties43.asProperties();
        atomikosProperties43.service = "{-1.0=100}";
        long long47 = atomikosProperties43.getDefaultJtaTimeout();
        atomikosProperties43.serialJtaTransactions = true;
        atomikosProperties43.maxActives = ' ';
        int int52 = atomikosProperties43.getConsoleFileCount();
        long long53 = atomikosProperties43.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel54 = atomikosProperties43.consoleLogLevel;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel54;
        java.util.Properties properties56 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.defaultJtaTimeout = 300000L;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10000L + "'", long17 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertNotNull(recovery29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel37 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel37.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10000L + "'", long47 == 10000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10000L + "'", long53 == 10000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel54 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel54.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties56);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.consoleFileName = "hi!";
        int int9 = atomikosProperties0.getConsoleFileCount();
        boolean boolean10 = atomikosProperties0.isThreadedTwoPhaseCommit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel11 = atomikosProperties0.consoleLogLevel;
        long long12 = atomikosProperties0.getDefaultJtaTimeout();
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        java.util.Map<java.lang.Object, java.lang.Object> objMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties13.putAll(objMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel11 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel11.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10000L + "'", long12 == 10000L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        atomikosProperties0.setAllowSubTransactions(true);
        int int10 = atomikosProperties0.getMaxActives();
        atomikosProperties0.transactionManagerUniqueName = "{-1.0=100}";
        atomikosProperties0.setMaxActives(0);
        atomikosProperties0.setMaxTimeout((long) (short) 100);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties0.getRecovery();
        boolean boolean18 = atomikosProperties0.forceShutdownOnVmExit;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.lang.String str9 = properties0.getProperty("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties11 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "{-1.0=100}";
        long long14 = atomikosProperties10.getDefaultJtaTimeout();
        atomikosProperties10.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties10.setMaxActives(100);
        boolean boolean19 = atomikosProperties10.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery20 = atomikosProperties10.recovery;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties22 = atomikosProperties21.asProperties();
        atomikosProperties21.service = "{-1.0=100}";
        long long25 = atomikosProperties21.getDefaultJtaTimeout();
        atomikosProperties21.setMaxActives(0);
        boolean boolean28 = atomikosProperties21.threadedTwoPhaseCommit;
        boolean boolean29 = atomikosProperties21.allowSubTransactions;
        atomikosProperties21.logBaseDir = "{}";
        atomikosProperties21.service = "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}";
        java.lang.Object obj34 = properties0.put((java.lang.Object) recovery20, (java.lang.Object) atomikosProperties21);
        atomikosProperties21.serialJtaTransactions = true;
        java.lang.String str37 = atomikosProperties21.getLogBaseDir();
        int int38 = atomikosProperties21.getMaxActives();
        java.lang.String str39 = atomikosProperties21.getTransactionManagerUniqueName();
        atomikosProperties21.setForceShutdownOnVmExit(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(recovery20);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10000L + "'", long25 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.consoleFileName = "{-1.0=100}";
        atomikosProperties0.setSerialJtaTransactions(false);
        atomikosProperties0.consoleFileName = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.defaultJtaTimeout = 50;
        long long19 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.defaultJtaTimeout = (byte) -1;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 500L + "'", long19 == 500L);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setMaxActives(100);
        java.lang.String str9 = atomikosProperties0.logBaseDir;
        atomikosProperties0.consoleFileCount = (short) 0;
        atomikosProperties0.defaultJtaTimeout = 10000L;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel14 = atomikosProperties0.consoleLogLevel;
        long long15 = atomikosProperties0.defaultJtaTimeout;
        atomikosProperties0.setConsoleFileCount(0);
        atomikosProperties0.enableLogging = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery20 = atomikosProperties0.recovery;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties22 = atomikosProperties21.asProperties();
        atomikosProperties21.service = "{-1.0=100}";
        long long25 = atomikosProperties21.getDefaultJtaTimeout();
        atomikosProperties21.setThreadedTwoPhaseCommit(true);
        boolean boolean28 = atomikosProperties21.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery29 = atomikosProperties21.recovery;
        boolean boolean30 = atomikosProperties21.threadedTwoPhaseCommit;
        atomikosProperties21.setOutputDir("tmlog");
        boolean boolean33 = atomikosProperties21.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties35 = atomikosProperties34.asProperties();
        atomikosProperties34.service = "{-1.0=100}";
        long long38 = atomikosProperties34.getDefaultJtaTimeout();
        long long39 = atomikosProperties34.getMaxTimeout();
        int int40 = atomikosProperties34.consoleFileCount;
        long long41 = atomikosProperties34.getCheckpointInterval();
        java.lang.String str42 = atomikosProperties34.outputDir;
        long long43 = atomikosProperties34.getCheckpointInterval();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel44 = atomikosProperties34.getConsoleLogLevel();
        atomikosProperties21.consoleLogLevel = atomikosLoggingLevel44;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel44;
        boolean boolean47 = atomikosProperties0.allowSubTransactions;
        java.lang.String str48 = atomikosProperties0.getService();
        atomikosProperties0.forceShutdownOnVmExit = false;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel14 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel14.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertNotNull(recovery20);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10000L + "'", long25 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(recovery29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10000L + "'", long38 == 10000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 300000L + "'", long39 == 300000L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 500L + "'", long41 == 500L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 500L + "'", long43 == 500L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel44 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel44.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "{-1.0=100}" + "'", str48, "{-1.0=100}");
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.threadedTwoPhaseCommit = true;
        long long8 = atomikosProperties0.checkpointInterval;
        boolean boolean9 = atomikosProperties0.allowSubTransactions;
        boolean boolean10 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.defaultJtaTimeout = 10000L;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties8 = atomikosProperties7.asProperties();
        java.lang.Object obj9 = properties0.remove((java.lang.Object) properties8);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean11 = atomikosProperties10.isSerialJtaTransactions();
        atomikosProperties10.logBaseName = "{-1.0=100}";
        int int14 = atomikosProperties10.maxActives;
        atomikosProperties10.setAllowSubTransactions(false);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties10.getRecovery();
        atomikosProperties10.setLogBaseName("tmlog");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.setThreadedTwoPhaseCommit(true);
        boolean boolean27 = atomikosProperties20.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery28 = atomikosProperties20.recovery;
        atomikosProperties20.setLogBaseDir("");
        long long31 = atomikosProperties20.maxTimeout;
        boolean boolean32 = atomikosProperties20.forceShutdownOnVmExit;
        atomikosProperties20.enableLogging = false;
        java.lang.Object obj35 = properties0.putIfAbsent((java.lang.Object) atomikosProperties10, (java.lang.Object) atomikosProperties20);
        atomikosProperties20.maxActives = 35;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(recovery28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 300000L + "'", long31 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.consoleFileCount = 0;
        atomikosProperties0.setService("{={-1.0=100}, -1.0=100}");
        atomikosProperties0.setMaxActives(20);
        java.lang.String str9 = atomikosProperties0.consoleFileName;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tm.out" + "'", str9, "tm.out");
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean5 = atomikosProperties4.isThreadedTwoPhaseCommit();
        long long6 = atomikosProperties4.getCheckpointInterval();
        boolean boolean7 = atomikosProperties4.serialJtaTransactions;
        boolean boolean8 = properties0.contains((java.lang.Object) boolean7);
        java.lang.Object obj9 = properties0.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration10 = properties0.elements();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "{}");
        org.junit.Assert.assertNotNull(objEnumeration10);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.consoleFileName = "{-1.0=100}";
        boolean boolean13 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean14 = atomikosProperties0.isAllowSubTransactions();
        atomikosProperties0.setEnableLogging(true);
        java.util.Properties properties17 = atomikosProperties0.asProperties();
        java.lang.Object obj20 = properties17.setProperty("{{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=, ={-1.0=100}, -1.0=100}", "{1.0=-1, -1.0=100}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        int int5 = recovery0.getMaxRetries();
        recovery0.setForgetOrphanedLogEntriesDelay((long) 97);
        recovery0.setRetryInterval((long) 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.enableLogging = false;
        atomikosProperties0.setMaxActives((int) ' ');
        atomikosProperties0.maxActives = (short) -1;
        atomikosProperties0.setService("hi!");
        atomikosProperties0.consoleFileLimit = (byte) 0;
        atomikosProperties0.setLogBaseName("{0={100=100}, {}={}}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties18 = atomikosProperties17.asProperties();
        atomikosProperties17.service = "{-1.0=100}";
        java.lang.String str21 = atomikosProperties17.getTransactionManagerUniqueName();
        atomikosProperties17.consoleFileName = "hi!";
        atomikosProperties17.setCheckpointInterval((long) 5);
        atomikosProperties17.setConsoleFileCount(0);
        boolean boolean28 = atomikosProperties17.isThreadedTwoPhaseCommit();
        int int29 = atomikosProperties17.maxActives;
        atomikosProperties17.setConsoleFileName("{={-1.0=100}, -1.0=100}");
        atomikosProperties17.setConsoleFileCount(50);
        java.lang.String str34 = atomikosProperties17.getTransactionManagerUniqueName();
        atomikosProperties17.logBaseName = "{}";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties38 = atomikosProperties37.asProperties();
        atomikosProperties37.service = "{-1.0=100}";
        long long41 = atomikosProperties37.getDefaultJtaTimeout();
        boolean boolean42 = atomikosProperties37.threadedTwoPhaseCommit;
        java.lang.String str43 = atomikosProperties37.service;
        atomikosProperties37.maxActives = (byte) 100;
        boolean boolean46 = atomikosProperties37.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties48 = atomikosProperties47.asProperties();
        atomikosProperties47.service = "{-1.0=100}";
        java.lang.String str51 = atomikosProperties47.getTransactionManagerUniqueName();
        atomikosProperties47.consoleFileName = "hi!";
        atomikosProperties47.enableLogging = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties57 = atomikosProperties56.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties58 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties59 = atomikosProperties58.asProperties();
        atomikosProperties58.service = "{-1.0=100}";
        long long62 = atomikosProperties58.getDefaultJtaTimeout();
        atomikosProperties58.consoleFileLimit = '#';
        java.lang.Object obj65 = properties57.get((java.lang.Object) atomikosProperties58);
        boolean boolean66 = atomikosProperties58.forceShutdownOnVmExit;
        atomikosProperties58.setOutputDir("");
        long long69 = atomikosProperties58.defaultJtaTimeout;
        java.lang.String str70 = atomikosProperties58.getLogBaseName();
        java.lang.String str71 = atomikosProperties58.logBaseName;
        atomikosProperties58.setConsoleFileLimit((int) (short) 1);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel74 = atomikosProperties58.getConsoleLogLevel();
        atomikosProperties47.setConsoleLogLevel(atomikosLoggingLevel74);
        atomikosProperties37.consoleLogLevel = atomikosLoggingLevel74;
        atomikosProperties17.consoleLogLevel = atomikosLoggingLevel74;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel74;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 50 + "'", int29 == 50);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10000L + "'", long41 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "{-1.0=100}" + "'", str43, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10000L + "'", long62 == 10000L);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10000L + "'", long69 == 10000L);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "tmlog" + "'", str70, "tmlog");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "tmlog" + "'", str71, "tmlog");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel74 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel74.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.keys();
        java.util.Enumeration<?> wildcardEnumeration5 = properties0.propertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties7 = atomikosProperties6.asProperties();
        atomikosProperties6.service = "{-1.0=100}";
        long long10 = atomikosProperties6.getDefaultJtaTimeout();
        long long11 = atomikosProperties6.getMaxTimeout();
        atomikosProperties6.threadedTwoPhaseCommit = true;
        long long14 = atomikosProperties6.checkpointInterval;
        boolean boolean15 = atomikosProperties6.allowSubTransactions;
        boolean boolean16 = properties0.equals((java.lang.Object) boolean15);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties18 = atomikosProperties17.asProperties();
        atomikosProperties17.service = "{-1.0=100}";
        java.lang.String str21 = atomikosProperties17.getTransactionManagerUniqueName();
        atomikosProperties17.consoleFileName = "hi!";
        atomikosProperties17.service = "tm.out";
        atomikosProperties17.logBaseName = "tm.out";
        atomikosProperties17.setThreadedTwoPhaseCommit(true);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel30 = atomikosProperties17.consoleLogLevel;
        atomikosProperties17.service = "tm.out";
        boolean boolean33 = atomikosProperties17.enableLogging;
        boolean boolean34 = properties0.contains((java.lang.Object) atomikosProperties17);
        atomikosProperties17.logBaseDir = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(wildcardEnumeration5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 500L + "'", long14 == 500L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel30 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel30.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.util.Properties properties7 = new java.util.Properties();
        java.lang.String str8 = properties7.toString();
        java.lang.Object obj10 = properties7.remove((java.lang.Object) (short) 100);
        java.lang.Object obj13 = properties7.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        int int14 = properties7.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery15 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery15.retryInterval = (short) 100;
        recovery15.forgetOrphanedLogEntriesDelay = 'a';
        long long20 = recovery15.retryInterval;
        recovery15.setForgetOrphanedLogEntriesDelay((long) 0);
        java.lang.Object obj23 = properties0.replace((java.lang.Object) int14, (java.lang.Object) recovery15);
        java.util.Enumeration<java.lang.Object> objEnumeration24 = properties0.elements();
        java.util.Properties properties25 = new java.util.Properties();
        java.lang.String str26 = properties25.toString();
        java.lang.Object obj28 = properties25.remove((java.lang.Object) (short) 100);
        java.lang.Object obj31 = properties25.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean33 = properties25.containsKey((java.lang.Object) 0L);
        java.lang.Object obj36 = properties25.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties37 = new java.util.Properties(properties25);
        java.util.Enumeration<java.lang.Object> objEnumeration38 = properties37.elements();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties40 = atomikosProperties39.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties42 = atomikosProperties41.asProperties();
        atomikosProperties41.service = "{-1.0=100}";
        long long45 = atomikosProperties41.getDefaultJtaTimeout();
        atomikosProperties41.consoleFileLimit = '#';
        java.lang.Object obj48 = properties40.get((java.lang.Object) atomikosProperties41);
        boolean boolean49 = atomikosProperties41.forceShutdownOnVmExit;
        atomikosProperties41.setOutputDir("");
        atomikosProperties41.setThreadedTwoPhaseCommit(false);
        long long54 = atomikosProperties41.getMaxTimeout();
        atomikosProperties41.allowSubTransactions = true;
        boolean boolean57 = properties0.remove((java.lang.Object) properties37, (java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objEnumeration24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objEnumeration38);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10000L + "'", long45 == 10000L);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 300000L + "'", long54 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties12.setEnableLogging(true);
        atomikosProperties12.setConsoleFileLimit((int) (short) 0);
        boolean boolean17 = properties0.contains((java.lang.Object) atomikosProperties12);
        java.lang.String str18 = properties0.toString();
        java.lang.Object obj21 = properties0.setProperty("", "tm.out");
        properties0.clear();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{-1.0=100}" + "'", str18, "{-1.0=100}");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.forceShutdownOnVmExit = false;
        java.lang.String str13 = atomikosProperties0.service;
        atomikosProperties0.allowSubTransactions = false;
        atomikosProperties0.forceShutdownOnVmExit = false;
        boolean boolean18 = atomikosProperties0.serialJtaTransactions;
        atomikosProperties0.setMaxTimeout((long) 5);
        atomikosProperties0.setOutputDir("{100=100}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{-1.0=100}" + "'", str13, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj15 = properties8.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties8.elements();
        java.lang.Object obj17 = properties0.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration16);
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.lang.Object obj20 = properties18.clone();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean23 = properties21.isEmpty();
        java.lang.Object obj26 = properties21.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties21.elements();
        java.lang.Object obj28 = properties0.put(obj20, (java.lang.Object) objEnumeration27);
        properties0.clear();
        java.util.Properties properties30 = new java.util.Properties();
        java.lang.Object obj32 = properties30.remove((java.lang.Object) (-1.0d));
        boolean boolean33 = properties30.isEmpty();
        int int34 = properties30.size();
        java.lang.String str36 = properties30.getProperty("{}");
        java.util.Properties properties37 = new java.util.Properties();
        java.lang.String str38 = properties37.toString();
        java.lang.Object obj40 = properties37.remove((java.lang.Object) (short) 100);
        java.lang.Object obj43 = properties37.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean45 = properties37.containsKey((java.lang.Object) 0L);
        java.lang.Object obj48 = properties37.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties49 = new java.util.Properties(properties37);
        java.util.Enumeration<java.lang.Object> objEnumeration50 = properties37.keys();
        java.lang.Object obj51 = properties0.replace((java.lang.Object) properties30, (java.lang.Object) properties37);
        java.util.Properties properties52 = new java.util.Properties();
        java.util.Properties properties53 = new java.util.Properties();
        java.lang.String str54 = properties53.toString();
        java.lang.Object obj56 = properties53.remove((java.lang.Object) (short) 100);
        java.lang.Object obj59 = properties53.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        int int60 = properties53.size();
        java.util.Properties properties61 = new java.util.Properties();
        java.lang.Object obj63 = properties61.remove((java.lang.Object) (-1.0d));
        boolean boolean64 = properties61.isEmpty();
        java.lang.Object obj67 = properties61.setProperty("hi!", "{}");
        boolean boolean68 = properties52.remove((java.lang.Object) int60, (java.lang.Object) properties61);
        java.lang.Object obj69 = properties0.get((java.lang.Object) boolean68);
        java.util.Enumeration<java.lang.Object> objEnumeration70 = properties0.keys();
        properties0.clear();
        java.io.Writer writer72 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.store(writer72, "tm.out");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objEnumeration50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "{}" + "'", str54, "{}");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(objEnumeration70);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.maxTimeout;
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        atomikosProperties0.setCheckpointInterval(1L);
        atomikosProperties0.setOutputDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties13.setEnableLogging(true);
        atomikosProperties13.consoleFileCount = 0;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties19 = atomikosProperties18.asProperties();
        atomikosProperties18.service = "{-1.0=100}";
        long long22 = atomikosProperties18.getDefaultJtaTimeout();
        boolean boolean23 = atomikosProperties18.enableLogging;
        boolean boolean24 = atomikosProperties18.isForceShutdownOnVmExit();
        atomikosProperties18.consoleFileLimit = (byte) -1;
        java.lang.String str27 = atomikosProperties18.getService();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel28 = atomikosProperties18.consoleLogLevel;
        atomikosProperties13.consoleLogLevel = atomikosLoggingLevel28;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel28);
        atomikosProperties0.threadedTwoPhaseCommit = false;
        atomikosProperties0.service = "{100=100}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10000L + "'", long22 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{-1.0=100}" + "'", str27, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel28 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel28.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileLimit = (byte) 10;
        long long7 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setTransactionManagerUniqueName("{{}={}}");
        int int10 = atomikosProperties0.maxActives;
        atomikosProperties0.consoleFileCount = (-1);
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        java.util.Properties properties2 = new java.util.Properties();
        java.lang.Object obj4 = properties2.remove((java.lang.Object) (-1.0d));
        boolean boolean5 = properties2.isEmpty();
        int int6 = properties2.size();
        java.lang.String str8 = properties2.getProperty("{}");
        java.lang.Object obj9 = properties1.remove((java.lang.Object) properties2);
        java.util.Properties properties10 = new java.util.Properties();
        java.util.Properties properties11 = new java.util.Properties();
        java.lang.String str12 = properties11.toString();
        boolean boolean13 = properties11.isEmpty();
        java.util.Properties properties14 = new java.util.Properties();
        java.lang.String str15 = properties14.toString();
        java.lang.Object obj17 = properties14.remove((java.lang.Object) (short) 100);
        java.lang.Object obj20 = properties14.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean22 = properties14.containsKey((java.lang.Object) 0L);
        boolean boolean23 = properties11.containsValue((java.lang.Object) 0L);
        boolean boolean26 = properties10.replace((java.lang.Object) 0L, (java.lang.Object) 0.0f, (java.lang.Object) 10.0d);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties10.elements();
        java.lang.String str28 = properties10.toString();
        java.util.Enumeration<java.lang.Object> objEnumeration29 = properties10.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties31 = atomikosProperties30.asProperties();
        boolean boolean32 = properties1.remove((java.lang.Object) properties10, (java.lang.Object) properties31);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties34 = atomikosProperties33.asProperties();
        atomikosProperties33.service = "{-1.0=100}";
        long long37 = atomikosProperties33.getDefaultJtaTimeout();
        atomikosProperties33.setThreadedTwoPhaseCommit(true);
        boolean boolean40 = atomikosProperties33.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery41 = atomikosProperties33.recovery;
        atomikosProperties33.setLogBaseDir("");
        long long44 = atomikosProperties33.maxTimeout;
        atomikosProperties33.serialJtaTransactions = false;
        atomikosProperties33.transactionManagerUniqueName = "{0={100=100}, {}={}}";
        atomikosProperties33.setMaxTimeout(0L);
        int int51 = atomikosProperties33.getConsoleFileCount();
        boolean boolean52 = properties1.contains((java.lang.Object) atomikosProperties33);
        java.util.Properties properties53 = new java.util.Properties(properties1);
        java.util.Properties properties54 = new java.util.Properties();
        java.lang.String str55 = properties54.toString();
        java.lang.Object obj57 = properties54.remove((java.lang.Object) (short) 100);
        java.lang.Object obj60 = properties54.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean62 = properties54.containsKey((java.lang.Object) 0L);
        java.lang.Object obj65 = properties54.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj68 = properties54.setProperty("", "{-1.0=100}");
        java.lang.Object obj69 = properties54.clone();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery70 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery70.retryInterval = (short) 100;
        recovery70.forgetOrphanedLogEntriesDelay = 'a';
        boolean boolean75 = properties54.equals((java.lang.Object) 'a');
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery76 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long77 = recovery76.getRetryInterval();
        long long78 = recovery76.getDelay();
        long long79 = recovery76.getDelay();
        recovery76.retryInterval = 100L;
        boolean boolean82 = properties54.contains((java.lang.Object) recovery76);
        java.lang.String str83 = properties54.toString();
        properties1.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties54);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertNotNull(objEnumeration29);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10000L + "'", long37 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(recovery41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 300000L + "'", long44 == 300000L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{}" + "'", str55, "{}");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(obj69);
// flaky:         org.junit.Assert.assertEquals(obj69.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10000L + "'", long77 == 10000L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10000L + "'", long78 == 10000L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10000L + "'", long79 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str83, "{={-1.0=100}, -1.0=100}");
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.lang.String str9 = properties0.getProperty("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties11 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "{-1.0=100}";
        long long14 = atomikosProperties10.getDefaultJtaTimeout();
        atomikosProperties10.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties10.setMaxActives(100);
        boolean boolean19 = atomikosProperties10.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery20 = atomikosProperties10.recovery;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties22 = atomikosProperties21.asProperties();
        atomikosProperties21.service = "{-1.0=100}";
        long long25 = atomikosProperties21.getDefaultJtaTimeout();
        atomikosProperties21.setMaxActives(0);
        boolean boolean28 = atomikosProperties21.threadedTwoPhaseCommit;
        boolean boolean29 = atomikosProperties21.allowSubTransactions;
        atomikosProperties21.logBaseDir = "{}";
        atomikosProperties21.service = "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}";
        java.lang.Object obj34 = properties0.put((java.lang.Object) recovery20, (java.lang.Object) atomikosProperties21);
        java.util.Properties properties35 = new java.util.Properties();
        java.lang.Object obj38 = properties35.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration39 = properties35.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration40 = properties35.elements();
        java.util.Properties properties41 = new java.util.Properties(properties35);
        java.util.Properties properties42 = new java.util.Properties(properties41);
        java.util.Properties properties43 = new java.util.Properties(properties41);
        boolean boolean44 = properties0.containsValue((java.lang.Object) properties43);
        java.util.Properties properties45 = new java.util.Properties();
        java.lang.String str46 = properties45.toString();
        java.lang.Object obj48 = properties45.remove((java.lang.Object) (short) 100);
        java.lang.Object obj51 = properties45.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean53 = properties45.containsKey((java.lang.Object) 0L);
        java.lang.Object obj56 = properties45.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties57 = new java.util.Properties();
        java.lang.String str58 = properties57.toString();
        java.lang.Object obj60 = properties57.remove((java.lang.Object) (short) 100);
        java.lang.Object obj63 = properties57.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj64 = properties57.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration65 = properties57.elements();
        properties45.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties57);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery67 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery67.retryInterval = (short) 100;
        recovery67.forgetOrphanedLogEntriesDelay = 'a';
        long long72 = recovery67.getDelay();
        long long73 = recovery67.getRetryInterval();
        recovery67.setRetryInterval((long) 'a');
        long long76 = recovery67.getRetryInterval();
        java.lang.Object obj77 = properties57.remove((java.lang.Object) recovery67);
        java.lang.Object obj80 = properties57.setProperty("{1.0=-1, -1.0=100}", "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        properties57.clear();
        java.util.Set<java.lang.Object> objSet82 = properties57.keySet();
        boolean boolean83 = properties0.containsKey((java.lang.Object) properties57);
        java.lang.String str84 = properties57.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(recovery20);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10000L + "'", long25 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objEnumeration39);
        org.junit.Assert.assertNotNull(objEnumeration40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "{}" + "'", str46, "{}");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "{}" + "'", str58, "{}");
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration65);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10000L + "'", long72 == 10000L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 100L + "'", long73 == 100L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 97L + "'", long76 == 97L);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(objSet82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "{}" + "'", str84, "{}");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        java.lang.String str10 = atomikosProperties0.outputDir;
        int int11 = atomikosProperties0.consoleFileCount;
        atomikosProperties0.setAllowSubTransactions(false);
        java.lang.String str14 = atomikosProperties0.service;
        long long15 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.setLogBaseDir("{{1.0=-1, -1.0=100}={1.0=-1}, 1.0=-1}");
        atomikosProperties0.checkpointInterval = (byte) 10;
        atomikosProperties0.setMaxActives((int) (short) 100);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{-1.0=100}" + "'", str14, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        long long5 = atomikosProperties0.defaultJtaTimeout;
        long long6 = atomikosProperties0.getMaxTimeout();
        boolean boolean7 = atomikosProperties0.forceShutdownOnVmExit;
        java.lang.String str8 = atomikosProperties0.getLogBaseName();
        boolean boolean9 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.setDefaultJtaTimeout((long) (short) 0);
        atomikosProperties0.setDefaultJtaTimeout(52L);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tmlog" + "'", str8, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        atomikosProperties0.logBaseDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        atomikosProperties0.setDefaultJtaTimeout((long) (-1));
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties5 = atomikosProperties4.asProperties();
        atomikosProperties4.service = "{-1.0=100}";
        long long8 = atomikosProperties4.getDefaultJtaTimeout();
        atomikosProperties4.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties4.setMaxActives(100);
        atomikosProperties4.defaultJtaTimeout = ' ';
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties16 = atomikosProperties15.asProperties();
        atomikosProperties15.service = "{-1.0=100}";
        long long19 = atomikosProperties15.getDefaultJtaTimeout();
        atomikosProperties15.outputDir = "{={-1.0=100}, -1.0=100}";
        long long22 = atomikosProperties15.getCheckpointInterval();
        atomikosProperties15.setConsoleFileCount((int) (byte) 1);
        boolean boolean25 = atomikosProperties15.threadedTwoPhaseCommit;
        java.lang.String str26 = atomikosProperties15.getTransactionManagerUniqueName();
        java.lang.Object obj27 = properties0.put((java.lang.Object) ' ', (java.lang.Object) atomikosProperties15);
        java.util.Properties properties28 = new java.util.Properties();
        java.util.Properties properties29 = new java.util.Properties();
        java.lang.String str30 = properties29.toString();
        boolean boolean31 = properties29.isEmpty();
        java.util.Properties properties32 = new java.util.Properties();
        java.lang.String str33 = properties32.toString();
        java.lang.Object obj35 = properties32.remove((java.lang.Object) (short) 100);
        java.lang.Object obj38 = properties32.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean40 = properties32.containsKey((java.lang.Object) 0L);
        boolean boolean41 = properties29.containsValue((java.lang.Object) 0L);
        boolean boolean44 = properties28.replace((java.lang.Object) 0L, (java.lang.Object) 0.0f, (java.lang.Object) 10.0d);
        java.util.Enumeration<java.lang.Object> objEnumeration45 = properties28.elements();
        java.util.Enumeration<java.lang.Object> objEnumeration46 = properties28.elements();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties48 = atomikosProperties47.asProperties();
        boolean boolean49 = properties0.remove((java.lang.Object) properties28, (java.lang.Object) atomikosProperties47);
        int int50 = properties0.size();
        java.util.Enumeration<java.lang.Object> objEnumeration51 = properties0.keys();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet52 = properties0.entrySet();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10000L + "'", long19 == 10000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 500L + "'", long22 == 500L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{}" + "'", str33, "{}");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objEnumeration45);
        org.junit.Assert.assertNotNull(objEnumeration46);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(objEnumeration51);
        org.junit.Assert.assertNotNull(objEntrySet52);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isThreadedTwoPhaseCommit();
        java.lang.String str2 = atomikosProperties0.logBaseDir;
        int int3 = atomikosProperties0.maxActives;
        atomikosProperties0.setAllowSubTransactions(false);
        long long6 = atomikosProperties0.checkpointInterval;
        boolean boolean7 = atomikosProperties0.enableLogging;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        java.lang.String str6 = atomikosProperties0.outputDir;
        atomikosProperties0.consoleFileName = "tm.out";
        boolean boolean9 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.logBaseName = "tm.out";
        atomikosProperties0.threadedTwoPhaseCommit = false;
        boolean boolean14 = atomikosProperties0.forceShutdownOnVmExit;
        int int15 = atomikosProperties0.consoleFileCount;
        atomikosProperties0.outputDir = "{1.0=-1, -1.0=100}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery4 = atomikosProperties0.recovery;
        recovery4.setDelay((long) (short) 0);
        long long7 = recovery4.delay;
        long long8 = recovery4.getForgetOrphanedLogEntriesDelay();
        recovery4.maxRetries = 5;
        recovery4.delay = 300000L;
        long long13 = recovery4.getDelay();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(recovery4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86400000L + "'", long8 == 86400000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.lang.String str9 = properties0.getProperty("{}");
        java.lang.Object obj12 = properties0.put((java.lang.Object) 86400000L, (java.lang.Object) "{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties14 = atomikosProperties13.asProperties();
        atomikosProperties13.service = "{-1.0=100}";
        java.lang.String str17 = atomikosProperties13.getTransactionManagerUniqueName();
        boolean boolean18 = atomikosProperties13.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel19 = atomikosProperties13.getConsoleLogLevel();
        java.lang.Object obj20 = properties0.remove((java.lang.Object) atomikosProperties13);
        atomikosProperties13.setEnableLogging(true);
        java.lang.String str23 = atomikosProperties13.transactionManagerUniqueName;
        java.lang.String str24 = atomikosProperties13.consoleFileName;
        atomikosProperties13.maxTimeout = 21;
        atomikosProperties13.setSerialJtaTransactions(true);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery29 = atomikosProperties13.recovery;
        long long30 = recovery29.delay;
        recovery29.maxRetries = 0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel19 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel19.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "tm.out" + "'", str24, "tm.out");
        org.junit.Assert.assertNotNull(recovery29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10000L + "'", long30 == 10000L);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.threadedTwoPhaseCommit = true;
        long long8 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.logBaseDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setLogBaseName("{1.0=-1, -1.0=100}");
        atomikosProperties0.allowSubTransactions = true;
        java.lang.String str15 = atomikosProperties0.getService();
        atomikosProperties0.defaultJtaTimeout = (short) 0;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{-1.0=100}" + "'", str15, "{-1.0=100}");
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        boolean boolean5 = atomikosProperties0.isSerialJtaTransactions();
        java.lang.String str6 = atomikosProperties0.logBaseName;
        atomikosProperties0.consoleFileLimit = (byte) 10;
        atomikosProperties0.setCheckpointInterval((long) (short) 1);
        atomikosProperties0.setConsoleFileLimit(19);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tmlog" + "'", str6, "tmlog");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties3.keys();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        boolean boolean21 = properties19.isEmpty();
        java.lang.Object obj24 = properties19.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties19.elements();
        java.lang.Object obj26 = properties2.replace((java.lang.Object) objEnumeration18, (java.lang.Object) properties19);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties19.elements();
        java.util.Properties properties28 = new java.util.Properties(properties19);
        java.util.Properties properties29 = new java.util.Properties();
        java.lang.String str30 = properties29.toString();
        java.lang.Object obj32 = properties29.remove((java.lang.Object) (short) 100);
        java.lang.Object obj35 = properties29.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean37 = properties29.containsKey((java.lang.Object) 0L);
        java.lang.Object obj40 = properties29.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties41 = new java.util.Properties();
        java.lang.String str42 = properties41.toString();
        java.lang.Object obj44 = properties41.remove((java.lang.Object) (short) 100);
        java.lang.Object obj47 = properties41.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj48 = properties41.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration49 = properties41.elements();
        properties29.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties41);
        java.lang.Object obj51 = properties41.clone();
        properties41.clear();
        java.util.Enumeration<?> wildcardEnumeration53 = properties41.propertyNames();
        boolean boolean54 = properties19.contains((java.lang.Object) wildcardEnumeration53);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties55 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties56 = atomikosProperties55.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties58 = atomikosProperties57.asProperties();
        atomikosProperties57.service = "{-1.0=100}";
        long long61 = atomikosProperties57.getDefaultJtaTimeout();
        atomikosProperties57.consoleFileLimit = '#';
        java.lang.Object obj64 = properties56.get((java.lang.Object) atomikosProperties57);
        boolean boolean65 = atomikosProperties57.forceShutdownOnVmExit;
        atomikosProperties57.setOutputDir("");
        boolean boolean68 = atomikosProperties57.forceShutdownOnVmExit;
        boolean boolean69 = atomikosProperties57.isThreadedTwoPhaseCommit();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties70 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties71 = atomikosProperties70.asProperties();
        atomikosProperties70.service = "{-1.0=100}";
        long long74 = atomikosProperties70.getDefaultJtaTimeout();
        atomikosProperties70.setThreadedTwoPhaseCommit(true);
        boolean boolean77 = atomikosProperties70.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery78 = atomikosProperties70.recovery;
        atomikosProperties70.setLogBaseDir("");
        java.lang.Object obj81 = properties19.putIfAbsent((java.lang.Object) boolean69, (java.lang.Object) atomikosProperties70);
        java.lang.String str82 = atomikosProperties70.logBaseName;
        atomikosProperties70.logBaseName = "tm.out";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{}" + "'", str42, "{}");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "{1.0=-1}");
        org.junit.Assert.assertNotNull(wildcardEnumeration53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10000L + "'", long61 == 10000L);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 10000L + "'", long74 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(recovery78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "tmlog" + "'", str82, "tmlog");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        boolean boolean8 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.allowSubTransactions = false;
        atomikosProperties0.threadedTwoPhaseCommit = true;
        atomikosProperties0.setLogBaseName("tm.out");
        long long15 = atomikosProperties0.defaultJtaTimeout;
        int int16 = atomikosProperties0.consoleFileLimit;
        java.lang.String str17 = atomikosProperties0.getTransactionManagerUniqueName();
        int int18 = atomikosProperties0.maxActives;
        atomikosProperties0.serialJtaTransactions = true;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties12 = new java.util.Properties();
        java.lang.String str13 = properties12.toString();
        java.lang.Object obj15 = properties12.remove((java.lang.Object) (short) 100);
        java.lang.Object obj18 = properties12.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj19 = properties12.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration20 = properties12.elements();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties12);
        boolean boolean23 = properties0.equals((java.lang.Object) 1.0f);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties25 = atomikosProperties24.asProperties();
        atomikosProperties24.service = "{-1.0=100}";
        long long28 = atomikosProperties24.getDefaultJtaTimeout();
        long long29 = atomikosProperties24.getMaxTimeout();
        int int30 = atomikosProperties24.consoleFileCount;
        int int31 = atomikosProperties24.getMaxActives();
        boolean boolean32 = atomikosProperties24.forceShutdownOnVmExit;
        java.lang.String str33 = atomikosProperties24.getTransactionManagerUniqueName();
        boolean boolean34 = properties0.containsValue((java.lang.Object) atomikosProperties24);
        java.util.Collection<java.lang.Object> objCollection35 = properties0.values();
        java.util.Properties properties36 = new java.util.Properties();
        java.lang.String str37 = properties36.toString();
        java.lang.Object obj39 = properties36.remove((java.lang.Object) (short) 100);
        java.lang.Object obj42 = properties36.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean44 = properties36.containsKey((java.lang.Object) 0L);
        java.lang.Object obj47 = properties36.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties48 = new java.util.Properties();
        java.lang.String str49 = properties48.toString();
        java.lang.Object obj51 = properties48.remove((java.lang.Object) (short) 100);
        java.lang.Object obj54 = properties48.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj55 = properties48.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration56 = properties48.elements();
        properties36.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties48);
        java.lang.Object obj60 = properties48.setProperty("{={-1.0=100}, -1.0=100}", "hi!");
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties48);
        boolean boolean62 = properties48.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10000L + "'", long28 == 10000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 300000L + "'", long29 == 300000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objCollection35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{}" + "'", str49, "{}");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.outputDir = "tm.out";
        int int11 = atomikosProperties0.getConsoleFileLimit();
        int int12 = atomikosProperties0.getMaxActives();
        atomikosProperties0.setForceShutdownOnVmExit(true);
        atomikosProperties0.setConsoleFileName("{0={100=100}, {}={}}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        long long5 = recovery0.retryInterval;
        recovery0.forgetOrphanedLogEntriesDelay = 0L;
        int int8 = recovery0.getMaxRetries();
        recovery0.maxRetries = 100;
        recovery0.setRetryInterval(500L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.getRetryInterval();
        long long2 = recovery0.getDelay();
        recovery0.forgetOrphanedLogEntriesDelay = (short) 100;
        long long5 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.setDelay((long) (byte) 1);
        recovery0.delay = 97L;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj15 = properties8.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties8.elements();
        java.lang.Object obj17 = properties0.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration16);
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.lang.Object obj20 = properties18.clone();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean23 = properties21.isEmpty();
        java.lang.Object obj26 = properties21.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties21.elements();
        java.lang.Object obj28 = properties0.put(obj20, (java.lang.Object) objEnumeration27);
        properties0.clear();
        java.util.Properties properties30 = new java.util.Properties();
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.remove((java.lang.Object) (-1.0d));
        int int34 = properties31.size();
        java.util.Enumeration<java.lang.Object> objEnumeration35 = properties31.elements();
        java.util.Properties properties36 = new java.util.Properties();
        properties36.clear();
        java.lang.String str38 = properties36.toString();
        boolean boolean39 = properties0.replace((java.lang.Object) properties30, (java.lang.Object) properties31, (java.lang.Object) str38);
        java.util.Properties properties40 = new java.util.Properties(properties0);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties41.outputDir = "{={-1.0=100}, -1.0=100}";
        boolean boolean44 = atomikosProperties41.isThreadedTwoPhaseCommit();
        atomikosProperties41.consoleFileLimit = 2;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties47.setEnableLogging(true);
        atomikosProperties47.consoleFileCount = 0;
        int int52 = atomikosProperties47.getMaxActives();
        java.lang.String str53 = atomikosProperties47.getLogBaseDir();
        java.lang.String str54 = atomikosProperties47.service;
        boolean boolean55 = atomikosProperties47.allowSubTransactions;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties57 = atomikosProperties56.asProperties();
        atomikosProperties56.service = "{-1.0=100}";
        long long60 = atomikosProperties56.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel61 = null;
        atomikosProperties56.setConsoleLogLevel(atomikosLoggingLevel61);
        int int63 = atomikosProperties56.maxActives;
        atomikosProperties56.setLogBaseDir("{}");
        atomikosProperties56.serialJtaTransactions = false;
        boolean boolean68 = properties0.replace((java.lang.Object) 2, (java.lang.Object) atomikosProperties47, (java.lang.Object) false);
        java.util.Set<java.lang.Object> objSet69 = properties0.keySet();
        java.lang.String str70 = properties0.toString();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet71 = properties0.entrySet();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objEnumeration35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 50 + "'", int52 == 50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10000L + "'", long60 == 10000L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 50 + "'", int63 == 50);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objSet69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "{}" + "'", str70, "{}");
        org.junit.Assert.assertNotNull(objEntrySet71);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        boolean boolean3 = atomikosProperties0.enableLogging;
        boolean boolean4 = atomikosProperties0.isForceShutdownOnVmExit();
        long long5 = atomikosProperties0.getCheckpointInterval();
        java.lang.String str6 = atomikosProperties0.getTransactionManagerUniqueName();
        long long7 = atomikosProperties0.maxTimeout;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Enumeration<java.lang.Object> objEnumeration9 = properties8.elements();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 500L + "'", long5 == 500L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(objEnumeration9);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileLimit = (byte) 10;
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        java.lang.String str8 = atomikosProperties0.logBaseName;
        atomikosProperties0.setService("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        atomikosProperties0.setOutputDir("{com.atomikos.icatch.tm.out=hi!}");
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel13 = atomikosProperties0.consoleLogLevel;
        atomikosProperties0.setEnableLogging(true);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tmlog" + "'", str8, "tmlog");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel13 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel13.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        boolean boolean2 = properties0.isEmpty();
        boolean boolean3 = properties0.isEmpty();
        java.util.Collection<java.lang.Object> objCollection4 = properties0.values();
        java.util.Properties properties5 = new java.util.Properties();
        java.lang.String str6 = properties5.toString();
        java.lang.Object obj8 = properties5.remove((java.lang.Object) (short) 100);
        java.lang.Object obj11 = properties5.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean13 = properties5.containsKey((java.lang.Object) 0L);
        java.lang.Object obj16 = properties5.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj19 = properties5.setProperty("", "{-1.0=100}");
        java.lang.String str20 = properties5.toString();
        java.util.Set<java.lang.String> strSet21 = properties5.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties23 = atomikosProperties22.asProperties();
        atomikosProperties22.service = "{-1.0=100}";
        long long26 = atomikosProperties22.getDefaultJtaTimeout();
        atomikosProperties22.enableLogging = false;
        atomikosProperties22.setMaxTimeout((long) (byte) 0);
        atomikosProperties22.setAllowSubTransactions(true);
        java.util.Properties properties33 = new java.util.Properties();
        java.lang.Object obj35 = properties33.remove((java.lang.Object) (-1.0d));
        boolean boolean36 = properties33.isEmpty();
        java.util.Collection<java.lang.Object> objCollection37 = properties33.values();
        java.lang.Object obj38 = properties5.put((java.lang.Object) true, (java.lang.Object) properties33);
        java.util.Properties properties39 = new java.util.Properties(properties33);
        properties33.clear();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties33);
        java.io.OutputStream outputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.store(outputStream42, "{hi!={{={-1.0=100}, -1.0=100}=}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str20, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10000L + "'", long26 == 10000L);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objCollection37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        atomikosProperties0.setDefaultJtaTimeout((long) (short) 0);
        atomikosProperties0.setTransactionManagerUniqueName("{-1.0=100}");
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        atomikosProperties0.maxTimeout = 100;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        atomikosProperties0.setAllowSubTransactions(false);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery7 = atomikosProperties0.getRecovery();
        atomikosProperties0.setLogBaseName("tmlog");
        atomikosProperties0.setLogBaseName("{1.0=-1, -1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = atomikosProperties0.consoleLogLevel;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery7);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel12 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel12.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.delay = (-1L);
        long long5 = recovery0.delay;
        recovery0.delay = (short) 1;
        long long8 = recovery0.getRetryInterval();
        long long9 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.setMaxRetries(10);
        int int12 = recovery0.maxRetries;
        long long13 = recovery0.getDelay();
        recovery0.forgetOrphanedLogEntriesDelay = 500L;
        long long16 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.setMaxRetries((int) (short) 0);
        long long19 = recovery0.forgetOrphanedLogEntriesDelay;
        long long20 = recovery0.delay;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400000L + "'", long9 == 86400000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 500L + "'", long16 == 500L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 500L + "'", long19 == 500L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.util.Properties properties0 = new java.util.Properties();
        properties0.clear();
        java.lang.String str2 = properties0.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery3 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery3.retryInterval = (short) 100;
        recovery3.setForgetOrphanedLogEntriesDelay((long) 5);
        recovery3.setRetryInterval((long) (-1));
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery10.retryInterval = (short) 100;
        recovery10.forgetOrphanedLogEntriesDelay = 'a';
        long long15 = recovery10.retryInterval;
        recovery10.forgetOrphanedLogEntriesDelay = 0L;
        java.lang.Object obj18 = properties0.put((java.lang.Object) (-1), (java.lang.Object) recovery10);
        int int19 = recovery10.maxRetries;
        long long20 = recovery10.delay;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10000L + "'", long20 == 10000L);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.consoleFileName = "{-1.0=100}";
        atomikosProperties0.setSerialJtaTransactions(false);
        atomikosProperties0.consoleFileName = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.defaultJtaTimeout = 50;
        long long19 = atomikosProperties0.getCheckpointInterval();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery20 = atomikosProperties0.recovery;
        java.lang.String str21 = atomikosProperties0.transactionManagerUniqueName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 500L + "'", long19 == 500L);
        org.junit.Assert.assertNotNull(recovery20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        java.lang.String str8 = atomikosProperties0.logBaseName;
        atomikosProperties0.setCheckpointInterval((long) 18);
        long long11 = atomikosProperties0.defaultJtaTimeout;
        java.util.Properties properties12 = atomikosProperties0.asProperties();
        java.util.Properties properties13 = new java.util.Properties();
        java.lang.String str14 = properties13.toString();
        java.lang.Object obj16 = properties13.remove((java.lang.Object) (short) 100);
        java.lang.Object obj19 = properties13.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean21 = properties13.containsKey((java.lang.Object) 0L);
        java.lang.Object obj24 = properties13.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties25 = new java.util.Properties(properties13);
        java.util.Enumeration<java.lang.Object> objEnumeration26 = properties25.elements();
        java.util.Properties properties27 = new java.util.Properties();
        java.lang.Object obj30 = properties27.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration31 = properties27.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration32 = properties27.elements();
        java.util.Properties properties33 = new java.util.Properties(properties27);
        java.util.Properties properties34 = new java.util.Properties(properties33);
        java.util.Properties properties35 = new java.util.Properties(properties33);
        java.util.Collection<java.lang.Object> objCollection36 = properties33.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties38 = atomikosProperties37.asProperties();
        atomikosProperties37.service = "{-1.0=100}";
        long long41 = atomikosProperties37.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel42 = null;
        atomikosProperties37.setConsoleLogLevel(atomikosLoggingLevel42);
        atomikosProperties37.setTransactionManagerUniqueName("{-1.0=100}");
        int int46 = atomikosProperties37.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties47.setAllowSubTransactions(true);
        atomikosProperties47.maxActives = (short) -1;
        atomikosProperties47.setService("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties54 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties54.setAllowSubTransactions(true);
        boolean boolean57 = atomikosProperties54.enableLogging;
        boolean boolean58 = atomikosProperties54.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel59 = atomikosProperties54.consoleLogLevel;
        atomikosProperties47.setConsoleLogLevel(atomikosLoggingLevel59);
        atomikosProperties37.setConsoleLogLevel(atomikosLoggingLevel59);
        java.lang.Object obj62 = properties25.put((java.lang.Object) properties33, (java.lang.Object) atomikosProperties37);
        java.util.Enumeration<java.lang.Object> objEnumeration63 = properties33.elements();
        properties12.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties33);
        java.io.OutputStream outputStream65 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties12.storeToXML(outputStream65, "{hi!={{={-1.0=100}, -1.0=100}=}}", "{{1.0=-1}=hi!}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{-1.0=100}" + "'", str8, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objEnumeration31);
        org.junit.Assert.assertNotNull(objEnumeration32);
        org.junit.Assert.assertNotNull(objCollection36);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10000L + "'", long41 == 10000L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 50 + "'", int46 == 50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel59 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel59.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(objEnumeration63);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.serialJtaTransactions = true;
        long long9 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setForceShutdownOnVmExit(false);
        atomikosProperties0.threadedTwoPhaseCommit = false;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj15 = properties8.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties8.elements();
        java.lang.Object obj17 = properties0.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration16);
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.lang.Object obj20 = properties18.clone();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean23 = properties21.isEmpty();
        java.lang.Object obj26 = properties21.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties21.elements();
        java.lang.Object obj28 = properties0.put(obj20, (java.lang.Object) objEnumeration27);
        properties0.clear();
        java.lang.String str30 = properties0.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties32 = atomikosProperties31.asProperties();
        atomikosProperties31.service = "{-1.0=100}";
        long long35 = atomikosProperties31.getDefaultJtaTimeout();
        atomikosProperties31.serialJtaTransactions = true;
        atomikosProperties31.maxActives = ' ';
        int int40 = atomikosProperties31.getConsoleFileCount();
        boolean boolean41 = properties0.equals((java.lang.Object) atomikosProperties31);
        java.lang.Object obj42 = properties0.clone();
        java.util.Enumeration<?> wildcardEnumeration43 = properties0.propertyNames();
        java.lang.Object obj44 = properties0.clone();
        java.util.Enumeration<?> wildcardEnumeration45 = properties0.propertyNames();
        java.io.PrintStream printStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.list(printStream46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10000L + "'", long35 == 10000L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "{}");
        org.junit.Assert.assertNotNull(wildcardEnumeration43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "{}");
        org.junit.Assert.assertNotNull(wildcardEnumeration45);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        java.lang.String str6 = atomikosProperties0.outputDir;
        atomikosProperties0.consoleFileName = "tm.out";
        int int9 = atomikosProperties0.consoleFileCount;
        java.util.Properties properties10 = atomikosProperties0.asProperties();
        java.util.Properties properties11 = new java.util.Properties();
        java.util.Properties properties12 = new java.util.Properties(properties11);
        java.util.Set<java.lang.String> strSet13 = properties12.stringPropertyNames();
        java.lang.Object obj16 = properties12.setProperty("tm.out", "{0={100=100}, {}={}}");
        java.lang.String str18 = properties12.getProperty("{com.atomikos.icatch.{}=5}");
        boolean boolean19 = properties10.contains((java.lang.Object) properties12);
        java.io.PrintStream printStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties12.list(printStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.util.Set<java.lang.String> strSet8 = properties0.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery9.retryInterval = (short) 100;
        recovery9.delay = (-1L);
        long long14 = recovery9.delay;
        recovery9.delay = (short) 1;
        long long17 = recovery9.getRetryInterval();
        int int18 = recovery9.maxRetries;
        int int19 = recovery9.maxRetries;
        long long20 = recovery9.forgetOrphanedLogEntriesDelay;
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.remove((java.lang.Object) (-1.0d));
        boolean boolean24 = properties21.isEmpty();
        int int25 = properties21.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery26 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery26.retryInterval = (short) 100;
        recovery26.forgetOrphanedLogEntriesDelay = 'a';
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.remove((java.lang.Object) (-1.0d));
        boolean boolean34 = properties31.isEmpty();
        int int35 = properties31.size();
        java.lang.String str37 = properties31.getProperty("{}");
        boolean boolean38 = properties21.remove((java.lang.Object) recovery26, (java.lang.Object) properties31);
        java.lang.Object obj39 = properties0.putIfAbsent((java.lang.Object) long20, (java.lang.Object) properties21);
        java.util.Enumeration<java.lang.Object> objEnumeration40 = properties0.keys();
        java.util.Properties properties41 = new java.util.Properties(properties0);
        java.lang.String str42 = properties41.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objEnumeration40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{}" + "'", str42, "{}");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.lang.String str1 = atomikosProperties0.getOutputDir();
        atomikosProperties0.threadedTwoPhaseCommit = true;
        atomikosProperties0.consoleFileName = "{-1.0=100}";
        atomikosProperties0.setMaxActives((int) (byte) 0);
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery4 = atomikosProperties0.recovery;
        atomikosProperties0.enableLogging = true;
        int int7 = atomikosProperties0.getConsoleFileCount();
        atomikosProperties0.outputDir = "hi!";
        java.util.Properties properties10 = new java.util.Properties();
        java.lang.String str11 = properties10.toString();
        java.lang.Object obj13 = properties10.remove((java.lang.Object) (short) 100);
        java.lang.Object obj16 = properties10.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean18 = properties10.containsKey((java.lang.Object) 0L);
        java.lang.Object obj21 = properties10.replace((java.lang.Object) false, (java.lang.Object) ' ');
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties22.setEnableLogging(true);
        atomikosProperties22.setConsoleFileLimit((int) (short) 0);
        boolean boolean27 = properties10.contains((java.lang.Object) atomikosProperties22);
        java.lang.String str29 = properties10.getProperty("{{1.0=-1}=hi!}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties32 = atomikosProperties31.asProperties();
        atomikosProperties31.service = "{-1.0=100}";
        java.lang.String str35 = atomikosProperties31.getTransactionManagerUniqueName();
        atomikosProperties31.consoleFileName = "hi!";
        atomikosProperties31.setCheckpointInterval((long) 5);
        atomikosProperties31.setLogBaseDir("{-1.0=100}");
        java.lang.String str42 = atomikosProperties31.getOutputDir();
        atomikosProperties0.set(properties10, "{1.0=-1}", (java.lang.Object) atomikosProperties31);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery44 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery44.retryInterval = (short) 100;
        recovery44.delay = (-1L);
        long long49 = recovery44.delay;
        recovery44.delay = (short) 1;
        long long52 = recovery44.getRetryInterval();
        long long53 = recovery44.getForgetOrphanedLogEntriesDelay();
        recovery44.setMaxRetries(10);
        int int56 = recovery44.maxRetries;
        long long57 = recovery44.getDelay();
        long long58 = recovery44.getDelay();
        boolean boolean59 = properties10.containsValue((java.lang.Object) long58);
        java.util.Collection<java.lang.Object> objCollection60 = properties10.values();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(recovery4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 86400000L + "'", long53 == 86400000L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objCollection60);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.util.Set<java.lang.String> strSet8 = properties0.stringPropertyNames();
        java.util.Properties properties9 = new java.util.Properties();
        java.lang.String str10 = properties9.toString();
        java.lang.Object obj12 = properties9.remove((java.lang.Object) (short) 100);
        java.lang.Object obj15 = properties9.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean17 = properties9.containsKey((java.lang.Object) 0L);
        java.lang.Object obj20 = properties9.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        java.lang.Object obj24 = properties21.remove((java.lang.Object) (short) 100);
        java.lang.Object obj27 = properties21.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj28 = properties21.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration29 = properties21.elements();
        properties9.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties21);
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.String str32 = properties31.toString();
        java.lang.Object obj34 = properties31.remove((java.lang.Object) (short) 100);
        java.lang.Object obj37 = properties31.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean39 = properties31.containsKey((java.lang.Object) 0L);
        java.lang.Object obj42 = properties31.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties43 = new java.util.Properties();
        java.lang.String str44 = properties43.toString();
        java.lang.Object obj46 = properties43.remove((java.lang.Object) (short) 100);
        java.lang.Object obj49 = properties43.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj50 = properties43.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration51 = properties43.elements();
        properties31.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties43);
        java.lang.Object obj53 = properties0.putIfAbsent((java.lang.Object) properties9, (java.lang.Object) properties43);
        java.util.Properties properties54 = new java.util.Properties();
        java.lang.String str55 = properties54.toString();
        java.lang.Object obj57 = properties54.remove((java.lang.Object) (short) 100);
        java.lang.Object obj60 = properties54.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean62 = properties54.containsKey((java.lang.Object) 0L);
        java.lang.Object obj65 = properties54.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj68 = properties54.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration69 = properties54.keys();
        boolean boolean70 = properties43.contains((java.lang.Object) properties54);
        java.util.Set<java.lang.String> strSet71 = properties54.stringPropertyNames();
        properties54.clear();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery73 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery73.retryInterval = (short) 100;
        recovery73.forgetOrphanedLogEntriesDelay = 'a';
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties78 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties78.setAllowSubTransactions(true);
        atomikosProperties78.maxActives = (short) -1;
        atomikosProperties78.setService("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties85 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties85.setAllowSubTransactions(true);
        boolean boolean88 = atomikosProperties85.enableLogging;
        boolean boolean89 = atomikosProperties85.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel90 = atomikosProperties85.consoleLogLevel;
        atomikosProperties78.setConsoleLogLevel(atomikosLoggingLevel90);
        atomikosProperties78.setThreadedTwoPhaseCommit(true);
        java.lang.Object obj94 = properties54.put((java.lang.Object) recovery73, (java.lang.Object) atomikosProperties78);
        java.lang.String str95 = atomikosProperties78.logBaseDir;
        atomikosProperties78.threadedTwoPhaseCommit = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "{}" + "'", str44, "{}");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{}" + "'", str55, "{}");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(objEnumeration69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel90 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel90.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isEnableLogging();
        long long8 = atomikosProperties0.defaultJtaTimeout;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        boolean boolean10 = atomikosProperties0.serialJtaTransactions;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.lang.String str9 = properties0.getProperty("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties11 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "{-1.0=100}";
        long long14 = atomikosProperties10.getDefaultJtaTimeout();
        atomikosProperties10.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties10.setMaxActives(100);
        boolean boolean19 = atomikosProperties10.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery20 = atomikosProperties10.recovery;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties22 = atomikosProperties21.asProperties();
        atomikosProperties21.service = "{-1.0=100}";
        long long25 = atomikosProperties21.getDefaultJtaTimeout();
        atomikosProperties21.setMaxActives(0);
        boolean boolean28 = atomikosProperties21.threadedTwoPhaseCommit;
        boolean boolean29 = atomikosProperties21.allowSubTransactions;
        atomikosProperties21.logBaseDir = "{}";
        atomikosProperties21.service = "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}";
        java.lang.Object obj34 = properties0.put((java.lang.Object) recovery20, (java.lang.Object) atomikosProperties21);
        atomikosProperties21.serialJtaTransactions = true;
        java.lang.String str37 = atomikosProperties21.getLogBaseDir();
        int int38 = atomikosProperties21.getMaxActives();
        java.lang.String str39 = atomikosProperties21.getTransactionManagerUniqueName();
        atomikosProperties21.setMaxTimeout(0L);
        java.lang.String str42 = atomikosProperties21.service;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(recovery20);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10000L + "'", long25 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}" + "'", str42, "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.consoleFileName = "{-1.0=100}";
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel13 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel13);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel15 = atomikosProperties0.getConsoleLogLevel();
        int int16 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.setDefaultJtaTimeout((long) '#');
        atomikosProperties0.setEnableLogging(true);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertNull(atomikosLoggingLevel15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        boolean boolean12 = properties0.isEmpty();
        int int13 = properties0.size();
        java.lang.Object obj16 = properties0.setProperty("{={-1.0=100}, -1.0=100}", "");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties18 = atomikosProperties17.asProperties();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.Object obj21 = properties19.remove((java.lang.Object) (-1.0d));
        boolean boolean22 = properties19.isEmpty();
        int int23 = properties19.size();
        java.lang.String str25 = properties19.getProperty("{}");
        java.lang.Object obj26 = properties18.remove((java.lang.Object) properties19);
        java.lang.String str28 = properties19.getProperty("tmlog");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties29.setEnableLogging(true);
        atomikosProperties29.consoleFileCount = 0;
        int int34 = atomikosProperties29.getMaxActives();
        java.lang.String str35 = atomikosProperties29.getLogBaseDir();
        java.lang.String str36 = atomikosProperties29.service;
        atomikosProperties29.setConsoleFileCount((int) (byte) 1);
        java.lang.Object obj39 = properties19.get((java.lang.Object) atomikosProperties29);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet40 = properties19.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet41 = properties19.entrySet();
        int int42 = properties19.size();
        java.util.Enumeration<?> wildcardEnumeration43 = properties19.propertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties44 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties45 = atomikosProperties44.asProperties();
        atomikosProperties44.service = "{-1.0=100}";
        long long48 = atomikosProperties44.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel49 = null;
        atomikosProperties44.setConsoleLogLevel(atomikosLoggingLevel49);
        int int51 = atomikosProperties44.maxActives;
        atomikosProperties44.setConsoleFileName("tmlog");
        atomikosProperties44.setConsoleFileCount((int) 'a');
        boolean boolean56 = atomikosProperties44.enableLogging;
        long long57 = atomikosProperties44.checkpointInterval;
        java.lang.Object obj58 = properties0.putIfAbsent((java.lang.Object) wildcardEnumeration43, (java.lang.Object) long57);
        boolean boolean59 = properties0.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 50 + "'", int34 == 50);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objEntrySet40);
        org.junit.Assert.assertNotNull(objEntrySet41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardEnumeration43);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10000L + "'", long48 == 10000L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 50 + "'", int51 == 50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 500L + "'", long57 == 500L);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.remove((java.lang.Object) (-1.0d));
        boolean boolean3 = properties0.isEmpty();
        java.util.Collection<java.lang.Object> objCollection4 = properties0.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties5 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties6 = atomikosProperties5.asProperties();
        atomikosProperties5.service = "{-1.0=100}";
        long long9 = atomikosProperties5.getDefaultJtaTimeout();
        atomikosProperties5.serialJtaTransactions = true;
        long long12 = atomikosProperties5.getDefaultJtaTimeout();
        long long13 = atomikosProperties5.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery14 = atomikosProperties5.getRecovery();
        long long15 = recovery14.delay;
        int int16 = recovery14.maxRetries;
        java.lang.Object obj17 = properties0.get((java.lang.Object) int16);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery18 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery18.retryInterval = (short) 100;
        recovery18.forgetOrphanedLogEntriesDelay = 'a';
        long long23 = recovery18.getDelay();
        int int24 = recovery18.maxRetries;
        int int25 = recovery18.maxRetries;
        recovery18.setDelay((long) (-1));
        long long28 = recovery18.forgetOrphanedLogEntriesDelay;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.lang.String str30 = atomikosProperties29.getOutputDir();
        atomikosProperties29.threadedTwoPhaseCommit = false;
        java.lang.Object obj33 = properties0.getOrDefault((java.lang.Object) recovery18, (java.lang.Object) atomikosProperties29);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel34 = atomikosProperties29.getConsoleLogLevel();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery35 = atomikosProperties29.recovery;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10000L + "'", long12 == 10000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertNotNull(recovery14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10000L + "'", long23 == 10000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel34 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel34.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(recovery35);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        long long7 = atomikosProperties0.getCheckpointInterval();
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        java.lang.String str9 = atomikosProperties0.service;
        int int10 = atomikosProperties0.consoleFileCount;
        atomikosProperties0.logBaseName = "tm.out";
        java.lang.String str13 = atomikosProperties0.getService();
        java.lang.String str14 = atomikosProperties0.logBaseName;
        java.lang.String str15 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.outputDir = "";
        java.lang.String str18 = atomikosProperties0.transactionManagerUniqueName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{-1.0=100}" + "'", str9, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{-1.0=100}" + "'", str13, "{-1.0=100}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tm.out" + "'", str14, "tm.out");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.lang.String str9 = properties0.getProperty("{}");
        java.lang.Object obj12 = properties0.put((java.lang.Object) 86400000L, (java.lang.Object) "{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties14 = atomikosProperties13.asProperties();
        atomikosProperties13.service = "{-1.0=100}";
        java.lang.String str17 = atomikosProperties13.getTransactionManagerUniqueName();
        boolean boolean18 = atomikosProperties13.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel19 = atomikosProperties13.getConsoleLogLevel();
        java.lang.Object obj20 = properties0.remove((java.lang.Object) atomikosProperties13);
        boolean boolean21 = atomikosProperties13.isAllowSubTransactions();
        atomikosProperties13.serialJtaTransactions = false;
        int int24 = atomikosProperties13.getConsoleFileLimit();
        atomikosProperties13.consoleFileName = "{com.atomikos.icatch.tm.out=hi!}";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel19 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel19.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        long long10 = recovery9.delay;
        recovery9.maxRetries = (-1);
        long long13 = recovery9.getRetryInterval();
        long long14 = recovery9.getDelay();
        long long15 = recovery9.delay;
        int int16 = recovery9.getMaxRetries();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10000L + "'", long13 == 10000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setLogBaseDir("{-1.0=100}");
        atomikosProperties0.setEnableLogging(true);
        boolean boolean12 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setMaxTimeout(50L);
        atomikosProperties0.consoleFileLimit = (short) 0;
        atomikosProperties0.logBaseName = "{}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.consoleFileName = "hi!";
        int int9 = atomikosProperties0.getConsoleFileCount();
        boolean boolean10 = atomikosProperties0.isThreadedTwoPhaseCommit();
        atomikosProperties0.maxTimeout = 0;
        atomikosProperties0.setLogBaseName("hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties15.setAllowSubTransactions(true);
        boolean boolean18 = atomikosProperties15.enableLogging;
        boolean boolean19 = atomikosProperties15.isForceShutdownOnVmExit();
        java.lang.String str20 = atomikosProperties15.getService();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.setAllowSubTransactions(true);
        boolean boolean24 = atomikosProperties21.enableLogging;
        boolean boolean25 = atomikosProperties21.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel26 = atomikosProperties21.consoleLogLevel;
        atomikosProperties15.consoleLogLevel = atomikosLoggingLevel26;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel26);
        atomikosProperties0.transactionManagerUniqueName = "{100=100}";
        long long31 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.setService("{1.0=-1, 10000=0}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel26 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel26.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 500L + "'", long31 == 500L);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.forceShutdownOnVmExit = false;
        long long13 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.consoleFileLimit = (short) 0;
        java.util.Properties properties16 = atomikosProperties0.asProperties();
        java.util.Properties properties17 = atomikosProperties0.asProperties();
        java.lang.String str18 = atomikosProperties0.getOutputDir();
        java.lang.String str19 = atomikosProperties0.getService();
        java.lang.String str20 = atomikosProperties0.logBaseName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{-1.0=100}" + "'", str19, "{-1.0=100}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tmlog" + "'", str20, "tmlog");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        boolean boolean15 = properties0.isEmpty();
        java.util.Properties properties16 = new java.util.Properties();
        java.lang.String str17 = properties16.toString();
        java.util.Properties properties18 = new java.util.Properties(properties16);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet19 = properties18.entrySet();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.remove((java.lang.Object) (-1.0d));
        int int24 = properties21.size();
        boolean boolean25 = properties0.replace((java.lang.Object) properties18, (java.lang.Object) 100L, (java.lang.Object) properties21);
        java.util.Enumeration<java.lang.Object> objEnumeration26 = properties18.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean28 = atomikosProperties27.isSerialJtaTransactions();
        atomikosProperties27.logBaseName = "{-1.0=100}";
        int int31 = atomikosProperties27.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery32 = atomikosProperties27.getRecovery();
        atomikosProperties27.setConsoleFileCount((int) (byte) 100);
        atomikosProperties27.maxTimeout = 50;
        java.lang.String str37 = atomikosProperties27.getConsoleFileName();
        boolean boolean38 = properties18.containsValue((java.lang.Object) atomikosProperties27);
        properties18.clear();
        java.util.Properties properties40 = new java.util.Properties(properties18);
        java.util.Properties properties41 = new java.util.Properties();
        java.lang.String str42 = properties41.toString();
        java.lang.Object obj44 = properties41.remove((java.lang.Object) (short) 100);
        java.lang.Object obj47 = properties41.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj48 = properties41.clone();
        java.lang.String str50 = properties41.getProperty("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties51 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties52 = atomikosProperties51.asProperties();
        atomikosProperties51.service = "{-1.0=100}";
        long long55 = atomikosProperties51.getDefaultJtaTimeout();
        atomikosProperties51.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties51.setMaxActives(100);
        boolean boolean60 = atomikosProperties51.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery61 = atomikosProperties51.recovery;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties62 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties63 = atomikosProperties62.asProperties();
        atomikosProperties62.service = "{-1.0=100}";
        long long66 = atomikosProperties62.getDefaultJtaTimeout();
        atomikosProperties62.setMaxActives(0);
        boolean boolean69 = atomikosProperties62.threadedTwoPhaseCommit;
        boolean boolean70 = atomikosProperties62.allowSubTransactions;
        atomikosProperties62.logBaseDir = "{}";
        atomikosProperties62.service = "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}";
        java.lang.Object obj75 = properties41.put((java.lang.Object) recovery61, (java.lang.Object) atomikosProperties62);
        long long76 = recovery61.getDelay();
        recovery61.retryInterval = (short) -1;
        boolean boolean79 = properties40.containsValue((java.lang.Object) recovery61);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertNotNull(objEntrySet19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objEnumeration26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertNotNull(recovery32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "tm.out" + "'", str37, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{}" + "'", str42, "{}");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "{1.0=-1}");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10000L + "'", long55 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(recovery61);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 10000L + "'", long66 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 10000L + "'", long76 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        long long7 = atomikosProperties0.getCheckpointInterval();
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        java.lang.String str9 = atomikosProperties0.service;
        int int10 = atomikosProperties0.consoleFileCount;
        atomikosProperties0.logBaseName = "tm.out";
        java.util.Properties properties13 = new java.util.Properties();
        java.lang.String str14 = properties13.toString();
        java.lang.Object obj16 = properties13.remove((java.lang.Object) (short) 100);
        java.lang.Object obj19 = properties13.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        java.lang.Object obj24 = properties21.remove((java.lang.Object) (short) 100);
        java.lang.Object obj27 = properties21.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj28 = properties21.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration29 = properties21.elements();
        java.lang.Object obj30 = properties13.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration29);
        java.util.Properties properties31 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration32 = properties31.propertyNames();
        java.lang.Object obj33 = properties31.clone();
        java.util.Properties properties34 = new java.util.Properties();
        java.lang.String str35 = properties34.toString();
        boolean boolean36 = properties34.isEmpty();
        java.lang.Object obj39 = properties34.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration40 = properties34.elements();
        java.lang.Object obj41 = properties13.put(obj33, (java.lang.Object) objEnumeration40);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties43 = atomikosProperties42.asProperties();
        atomikosProperties42.service = "{-1.0=100}";
        long long46 = atomikosProperties42.getDefaultJtaTimeout();
        atomikosProperties42.setThreadedTwoPhaseCommit(true);
        java.lang.String str49 = atomikosProperties42.getLogBaseName();
        boolean boolean50 = properties13.equals((java.lang.Object) atomikosProperties42);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties52 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties53 = atomikosProperties52.asProperties();
        atomikosProperties52.service = "{-1.0=100}";
        long long56 = atomikosProperties52.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel57 = null;
        atomikosProperties52.setConsoleLogLevel(atomikosLoggingLevel57);
        atomikosProperties52.setTransactionManagerUniqueName("{-1.0=100}");
        atomikosProperties0.set(properties13, "tmlog", (java.lang.Object) atomikosProperties52);
        long long62 = atomikosProperties0.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel63 = atomikosProperties0.getConsoleLogLevel();
        java.util.Properties properties64 = new java.util.Properties();
        java.lang.String str65 = properties64.toString();
        java.lang.Object obj67 = properties64.remove((java.lang.Object) (short) 100);
        java.lang.Object obj70 = properties64.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean72 = properties64.containsKey((java.lang.Object) 0L);
        java.lang.Object obj75 = properties64.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj78 = properties64.setProperty("", "{-1.0=100}");
        java.lang.Object obj79 = properties64.clone();
        java.util.Collection<java.lang.Object> objCollection80 = properties64.values();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet81 = properties64.entrySet();
        java.lang.String str83 = properties64.getProperty("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet84 = properties64.entrySet();
        java.lang.String str86 = properties64.getProperty("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        java.lang.String str88 = properties64.getProperty("tm.out");
        java.lang.Object obj90 = null;
        atomikosProperties0.set(properties64, "{}", obj90);
        atomikosProperties0.service = "{{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=hi!}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{-1.0=100}" + "'", str9, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardEnumeration32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "{}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{}" + "'", str35, "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objEnumeration40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10000L + "'", long46 == 10000L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "tmlog" + "'", str49, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10000L + "'", long56 == 10000L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 300000L + "'", long62 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel63 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel63.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "{}" + "'", str65, "{}");
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(obj79);
// flaky:         org.junit.Assert.assertEquals(obj79.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(objCollection80);
        org.junit.Assert.assertNotNull(objEntrySet81);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(objEntrySet84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.consoleFileName = "hi!";
        int int11 = atomikosProperties0.consoleFileLimit;
        java.lang.String str12 = atomikosProperties0.consoleFileName;
        java.lang.String str13 = atomikosProperties0.getOutputDir();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.util.Properties properties7 = new java.util.Properties();
        java.lang.String str8 = properties7.toString();
        java.lang.Object obj10 = properties7.remove((java.lang.Object) (short) 100);
        java.lang.Object obj13 = properties7.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        int int14 = properties7.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery15 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery15.retryInterval = (short) 100;
        recovery15.forgetOrphanedLogEntriesDelay = 'a';
        long long20 = recovery15.retryInterval;
        recovery15.setForgetOrphanedLogEntriesDelay((long) 0);
        java.lang.Object obj23 = properties0.replace((java.lang.Object) int14, (java.lang.Object) recovery15);
        java.lang.Object obj26 = properties0.setProperty("{}", "{}");
        java.util.Set<java.lang.Object> objSet27 = properties0.keySet();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objSet27);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        java.lang.String str10 = atomikosProperties0.outputDir;
        atomikosProperties0.setTransactionManagerUniqueName("");
        atomikosProperties0.setTransactionManagerUniqueName("");
        atomikosProperties0.setLogBaseDir("{{}={}}");
        atomikosProperties0.outputDir = "{{}={}}";
        atomikosProperties0.setConsoleFileCount((int) (short) 100);
        boolean boolean21 = atomikosProperties0.allowSubTransactions;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.defaultJtaTimeout = (byte) 10;
        java.lang.String str10 = atomikosProperties0.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery11 = atomikosProperties0.getRecovery();
        atomikosProperties0.setLogBaseName("{={-1.0=100}, -1.0=100}");
        atomikosProperties0.setConsoleFileName("{{}={}}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties17 = atomikosProperties16.asProperties();
        atomikosProperties16.service = "{-1.0=100}";
        long long20 = atomikosProperties16.getDefaultJtaTimeout();
        boolean boolean21 = atomikosProperties16.enableLogging;
        boolean boolean22 = atomikosProperties16.isForceShutdownOnVmExit();
        atomikosProperties16.consoleFileLimit = (byte) -1;
        boolean boolean25 = atomikosProperties16.serialJtaTransactions;
        atomikosProperties16.setThreadedTwoPhaseCommit(false);
        java.lang.String str28 = atomikosProperties16.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel29 = atomikosProperties16.getConsoleLogLevel();
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel29);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(recovery11);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10000L + "'", long20 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel29 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel29.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.maxActives = (short) -1;
        atomikosProperties0.setService("tm.out");
        atomikosProperties0.transactionManagerUniqueName = "{={-1.0=100}, -1.0=100}";
        boolean boolean9 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.setLogBaseDir("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.keys();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet5 = properties0.entrySet();
        java.util.Properties properties6 = new java.util.Properties(properties0);
        int int7 = properties6.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties9 = atomikosProperties8.asProperties();
        atomikosProperties8.service = "{-1.0=100}";
        java.lang.String str12 = atomikosProperties8.getTransactionManagerUniqueName();
        atomikosProperties8.consoleFileName = "hi!";
        atomikosProperties8.setCheckpointInterval((long) 5);
        atomikosProperties8.setConsoleFileCount(0);
        atomikosProperties8.setService("{-1.0=100}");
        atomikosProperties8.setDefaultJtaTimeout((long) 100);
        atomikosProperties8.setLogBaseDir("tmlog");
        atomikosProperties8.setEnableLogging(false);
        java.lang.Class<?> wildcardClass27 = atomikosProperties8.getClass();
        boolean boolean28 = properties6.equals((java.lang.Object) atomikosProperties8);
        java.lang.String str29 = properties6.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(objEntrySet5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        properties0.clear();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties4 = atomikosProperties3.asProperties();
        atomikosProperties3.service = "{-1.0=100}";
        long long7 = atomikosProperties3.getDefaultJtaTimeout();
        atomikosProperties3.enableLogging = false;
        boolean boolean10 = atomikosProperties3.isEnableLogging();
        long long11 = atomikosProperties3.defaultJtaTimeout;
        atomikosProperties3.setLogBaseDir("{com.atomikos.icatch.={}, 100=100}");
        boolean boolean14 = atomikosProperties3.threadedTwoPhaseCommit;
        atomikosProperties3.setTransactionManagerUniqueName("{={={-1.0=100}, -1.0=100}}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean18 = atomikosProperties17.isSerialJtaTransactions();
        atomikosProperties17.logBaseName = "{-1.0=100}";
        int int21 = atomikosProperties17.maxActives;
        atomikosProperties17.setOutputDir("{={-1.0=100}, -1.0=100}");
        java.lang.Object obj24 = properties0.getOrDefault((java.lang.Object) atomikosProperties3, (java.lang.Object) atomikosProperties17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        int int5 = atomikosProperties0.getMaxActives();
        java.lang.String str6 = atomikosProperties0.getLogBaseDir();
        java.lang.String str7 = atomikosProperties0.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.getRecovery();
        long long9 = atomikosProperties0.getDefaultJtaTimeout();
        int int10 = atomikosProperties0.getMaxActives();
        atomikosProperties0.consoleFileLimit = 50;
        boolean boolean13 = atomikosProperties0.isEnableLogging();
        java.lang.String str14 = atomikosProperties0.transactionManagerUniqueName;
        java.lang.String str15 = atomikosProperties0.getTransactionManagerUniqueName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.consoleFileLimit = '#';
        atomikosProperties0.setMaxTimeout((long) 100);
        boolean boolean9 = atomikosProperties0.forceShutdownOnVmExit;
        boolean boolean10 = atomikosProperties0.allowSubTransactions;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties12 = atomikosProperties11.asProperties();
        atomikosProperties11.service = "{-1.0=100}";
        long long15 = atomikosProperties11.getDefaultJtaTimeout();
        atomikosProperties11.serialJtaTransactions = true;
        long long18 = atomikosProperties11.maxTimeout;
        atomikosProperties11.setLogBaseDir("{-1.0=100}");
        int int21 = atomikosProperties11.getConsoleFileCount();
        atomikosProperties11.maxTimeout = (short) 100;
        atomikosProperties11.setConsoleFileCount((int) '#');
        long long26 = atomikosProperties11.defaultJtaTimeout;
        atomikosProperties11.setAllowSubTransactions(true);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel29 = atomikosProperties11.getConsoleLogLevel();
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel29;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 300000L + "'", long18 == 300000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10000L + "'", long26 == 10000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel29 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel29.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        int int6 = atomikosProperties0.consoleFileCount;
        long long7 = atomikosProperties0.getCheckpointInterval();
        java.lang.String str8 = atomikosProperties0.outputDir;
        atomikosProperties0.setEnableLogging(false);
        boolean boolean11 = atomikosProperties0.forceShutdownOnVmExit;
        int int12 = atomikosProperties0.getMaxActives();
        java.lang.String str13 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setMaxTimeout((long) '4');
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        boolean boolean15 = properties0.isEmpty();
        java.util.Properties properties16 = new java.util.Properties();
        java.lang.String str17 = properties16.toString();
        java.util.Properties properties18 = new java.util.Properties(properties16);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet19 = properties18.entrySet();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.remove((java.lang.Object) (-1.0d));
        int int24 = properties21.size();
        boolean boolean25 = properties0.replace((java.lang.Object) properties18, (java.lang.Object) 100L, (java.lang.Object) properties21);
        java.util.Enumeration<java.lang.Object> objEnumeration26 = properties18.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean28 = atomikosProperties27.isSerialJtaTransactions();
        atomikosProperties27.logBaseName = "{-1.0=100}";
        int int31 = atomikosProperties27.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery32 = atomikosProperties27.getRecovery();
        atomikosProperties27.setConsoleFileCount((int) (byte) 100);
        atomikosProperties27.maxTimeout = 50;
        java.lang.String str37 = atomikosProperties27.getConsoleFileName();
        boolean boolean38 = properties18.containsValue((java.lang.Object) atomikosProperties27);
        properties18.clear();
        java.util.Properties properties40 = new java.util.Properties(properties18);
        java.util.Properties properties41 = new java.util.Properties();
        java.lang.String str42 = properties41.toString();
        java.lang.Object obj44 = properties41.remove((java.lang.Object) (short) 100);
        java.lang.Object obj47 = properties41.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties48 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties48.setEnableLogging(true);
        atomikosProperties48.consoleFileCount = 0;
        atomikosProperties48.setSerialJtaTransactions(false);
        java.lang.String str55 = atomikosProperties48.getOutputDir();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties57 = atomikosProperties56.asProperties();
        atomikosProperties56.service = "{-1.0=100}";
        long long60 = atomikosProperties56.getDefaultJtaTimeout();
        atomikosProperties56.serialJtaTransactions = true;
        long long63 = atomikosProperties56.getDefaultJtaTimeout();
        long long64 = atomikosProperties56.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery65 = atomikosProperties56.getRecovery();
        recovery65.setRetryInterval((long) (byte) 0);
        java.lang.Object obj68 = properties41.replace((java.lang.Object) atomikosProperties48, (java.lang.Object) (byte) 0);
        java.lang.String str69 = atomikosProperties48.getLogBaseDir();
        long long70 = atomikosProperties48.getCheckpointInterval();
        java.lang.String str71 = atomikosProperties48.getTransactionManagerUniqueName();
        atomikosProperties48.setForceShutdownOnVmExit(false);
        boolean boolean74 = atomikosProperties48.isAllowSubTransactions();
        java.lang.String str75 = atomikosProperties48.getService();
        int int76 = atomikosProperties48.consoleFileLimit;
        atomikosProperties48.allowSubTransactions = true;
        java.lang.Object obj79 = properties18.get((java.lang.Object) atomikosProperties48);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertNotNull(objEntrySet19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objEnumeration26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertNotNull(recovery32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "tm.out" + "'", str37, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{}" + "'", str42, "{}");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10000L + "'", long60 == 10000L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10000L + "'", long63 == 10000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 500L + "'", long64 == 500L);
        org.junit.Assert.assertNotNull(recovery65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 500L + "'", long70 == 500L);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties3 = atomikosProperties2.asProperties();
        atomikosProperties2.service = "{-1.0=100}";
        long long6 = atomikosProperties2.getDefaultJtaTimeout();
        atomikosProperties2.consoleFileLimit = '#';
        java.lang.Object obj9 = properties1.get((java.lang.Object) atomikosProperties2);
        boolean boolean10 = atomikosProperties2.isForceShutdownOnVmExit();
        atomikosProperties2.consoleFileName = "";
        atomikosProperties2.outputDir = "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}";
        boolean boolean15 = atomikosProperties2.allowSubTransactions;
        java.lang.String str16 = atomikosProperties2.logBaseDir;
        atomikosProperties2.setEnableLogging(false);
        boolean boolean19 = atomikosProperties2.isForceShutdownOnVmExit();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        boolean boolean2 = properties0.isEmpty();
        java.lang.Object obj5 = properties0.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Properties properties6 = new java.util.Properties();
        java.lang.String str7 = properties6.toString();
        java.lang.Object obj9 = properties6.remove((java.lang.Object) (short) 100);
        java.lang.Object obj12 = properties6.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean14 = properties6.containsKey((java.lang.Object) 0L);
        java.lang.Object obj17 = properties6.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties18 = new java.util.Properties(properties6);
        boolean boolean19 = properties0.containsValue((java.lang.Object) properties6);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.serialJtaTransactions = true;
        atomikosProperties20.maxActives = ' ';
        int int29 = atomikosProperties20.getConsoleFileCount();
        atomikosProperties20.setService("{={-1.0=100}, -1.0=100}");
        long long32 = atomikosProperties20.defaultJtaTimeout;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties34 = atomikosProperties33.asProperties();
        atomikosProperties33.service = "{-1.0=100}";
        long long37 = atomikosProperties33.getDefaultJtaTimeout();
        atomikosProperties33.setThreadedTwoPhaseCommit(true);
        java.util.Properties properties40 = new java.util.Properties();
        java.util.Properties properties41 = new java.util.Properties(properties40);
        java.util.Enumeration<java.lang.Object> objEnumeration42 = properties41.elements();
        java.util.Properties properties43 = new java.util.Properties();
        java.lang.String str44 = properties43.toString();
        java.lang.Object obj46 = properties43.remove((java.lang.Object) (short) 100);
        java.lang.Object obj49 = properties43.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean51 = properties43.containsKey((java.lang.Object) 0L);
        java.lang.Object obj54 = properties43.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj57 = properties43.setProperty("", "{-1.0=100}");
        boolean boolean58 = properties43.isEmpty();
        java.util.Properties properties59 = new java.util.Properties();
        java.lang.String str60 = properties59.toString();
        java.util.Properties properties61 = new java.util.Properties(properties59);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet62 = properties61.entrySet();
        java.util.Properties properties64 = new java.util.Properties();
        java.lang.Object obj66 = properties64.remove((java.lang.Object) (-1.0d));
        int int67 = properties64.size();
        boolean boolean68 = properties43.replace((java.lang.Object) properties61, (java.lang.Object) 100L, (java.lang.Object) properties64);
        boolean boolean69 = properties43.isEmpty();
        java.util.Set<java.lang.Object> objSet70 = properties43.keySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties71 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties72 = atomikosProperties71.asProperties();
        atomikosProperties71.service = "{-1.0=100}";
        long long75 = atomikosProperties71.getDefaultJtaTimeout();
        long long76 = atomikosProperties71.getMaxTimeout();
        int int77 = atomikosProperties71.consoleFileCount;
        java.lang.String str78 = atomikosProperties71.getOutputDir();
        boolean boolean79 = properties41.remove((java.lang.Object) properties43, (java.lang.Object) atomikosProperties71);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties80 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties81 = atomikosProperties80.asProperties();
        atomikosProperties80.service = "{-1.0=100}";
        long long84 = atomikosProperties80.getDefaultJtaTimeout();
        long long85 = atomikosProperties80.getMaxTimeout();
        int int86 = atomikosProperties80.consoleFileCount;
        atomikosProperties80.setConsoleFileCount(0);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel89 = atomikosProperties80.getConsoleLogLevel();
        boolean boolean90 = properties43.equals((java.lang.Object) atomikosLoggingLevel89);
        atomikosProperties33.setConsoleLogLevel(atomikosLoggingLevel89);
        int int92 = atomikosProperties33.consoleFileLimit;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel93 = atomikosProperties33.consoleLogLevel;
        boolean boolean94 = atomikosProperties33.isEnableLogging();
        int int95 = atomikosProperties33.getConsoleFileLimit();
        java.lang.Object obj96 = properties0.replace((java.lang.Object) atomikosProperties20, (java.lang.Object) atomikosProperties33);
        java.lang.Object obj99 = properties0.setProperty("{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}", "{com.atomikos.icatch.tm.out=hi!}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10000L + "'", long32 == 10000L);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10000L + "'", long37 == 10000L);
        org.junit.Assert.assertNotNull(objEnumeration42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "{}" + "'", str44, "{}");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "{}" + "'", str60, "{}");
        org.junit.Assert.assertNotNull(objEntrySet62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objSet70);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10000L + "'", long75 == 10000L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 300000L + "'", long76 == 300000L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 10000L + "'", long84 == 10000L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 300000L + "'", long85 == 300000L);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel89 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel89.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel93 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel93.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Enumeration<java.lang.Object> objEnumeration2 = properties1.elements();
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        boolean boolean18 = properties3.isEmpty();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        java.util.Properties properties21 = new java.util.Properties(properties19);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet22 = properties21.entrySet();
        java.util.Properties properties24 = new java.util.Properties();
        java.lang.Object obj26 = properties24.remove((java.lang.Object) (-1.0d));
        int int27 = properties24.size();
        boolean boolean28 = properties3.replace((java.lang.Object) properties21, (java.lang.Object) 100L, (java.lang.Object) properties24);
        boolean boolean29 = properties3.isEmpty();
        java.util.Set<java.lang.Object> objSet30 = properties3.keySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties32 = atomikosProperties31.asProperties();
        atomikosProperties31.service = "{-1.0=100}";
        long long35 = atomikosProperties31.getDefaultJtaTimeout();
        long long36 = atomikosProperties31.getMaxTimeout();
        int int37 = atomikosProperties31.consoleFileCount;
        java.lang.String str38 = atomikosProperties31.getOutputDir();
        boolean boolean39 = properties1.remove((java.lang.Object) properties3, (java.lang.Object) atomikosProperties31);
        java.lang.String str41 = properties1.getProperty("tmlog");
        java.util.Enumeration<java.lang.Object> objEnumeration42 = properties1.elements();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties44 = atomikosProperties43.asProperties();
        atomikosProperties43.service = "{-1.0=100}";
        long long47 = atomikosProperties43.getDefaultJtaTimeout();
        atomikosProperties43.setTransactionManagerUniqueName("{}");
        atomikosProperties43.consoleFileName = "hi!";
        int int52 = atomikosProperties43.getConsoleFileCount();
        boolean boolean53 = atomikosProperties43.isThreadedTwoPhaseCommit();
        atomikosProperties43.maxTimeout = 0;
        atomikosProperties43.setLogBaseName("hi!");
        boolean boolean58 = atomikosProperties43.threadedTwoPhaseCommit;
        java.lang.String str59 = atomikosProperties43.getConsoleFileName();
        atomikosProperties43.setAllowSubTransactions(true);
        long long62 = atomikosProperties43.checkpointInterval;
        java.lang.Object obj63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = properties1.putIfAbsent((java.lang.Object) long62, obj63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objEnumeration2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertNotNull(objEntrySet22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objSet30);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10000L + "'", long35 == 10000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 300000L + "'", long36 == 300000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(objEnumeration42);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10000L + "'", long47 == 10000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 500L + "'", long62 == 500L);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties12 = new java.util.Properties();
        java.lang.String str13 = properties12.toString();
        java.lang.Object obj15 = properties12.remove((java.lang.Object) (short) 100);
        java.lang.Object obj18 = properties12.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj19 = properties12.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration20 = properties12.elements();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties12);
        boolean boolean23 = properties0.equals((java.lang.Object) 1.0f);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean25 = atomikosProperties24.isThreadedTwoPhaseCommit();
        long long26 = atomikosProperties24.getCheckpointInterval();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean28 = atomikosProperties27.isSerialJtaTransactions();
        atomikosProperties27.logBaseName = "{-1.0=100}";
        int int31 = atomikosProperties27.maxActives;
        int int32 = atomikosProperties27.getConsoleFileCount();
        boolean boolean33 = properties0.remove((java.lang.Object) atomikosProperties24, (java.lang.Object) atomikosProperties27);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties34.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties34.setService("tm.out");
        int int39 = atomikosProperties34.consoleFileLimit;
        atomikosProperties34.serialJtaTransactions = true;
        boolean boolean42 = properties0.equals((java.lang.Object) atomikosProperties34);
        java.lang.Object obj45 = properties0.setProperty("{{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=, ={-1.0=100}, -1.0=100}", "{{={-1.0=100}, -1.0=100}=}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties46 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties47 = atomikosProperties46.asProperties();
        atomikosProperties46.service = "{-1.0=100}";
        java.lang.String str50 = atomikosProperties46.getTransactionManagerUniqueName();
        atomikosProperties46.consoleFileLimit = (byte) 10;
        long long53 = atomikosProperties46.getMaxTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel54 = null;
        atomikosProperties46.consoleLogLevel = atomikosLoggingLevel54;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery56 = atomikosProperties46.getRecovery();
        boolean boolean57 = atomikosProperties46.isForceShutdownOnVmExit();
        boolean boolean58 = atomikosProperties46.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties59 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean60 = atomikosProperties59.isSerialJtaTransactions();
        atomikosProperties59.logBaseName = "{-1.0=100}";
        int int63 = atomikosProperties59.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery64 = atomikosProperties59.getRecovery();
        atomikosProperties59.setConsoleFileCount((int) (byte) 100);
        atomikosProperties59.setAllowSubTransactions(true);
        atomikosProperties59.setService("tm.out");
        atomikosProperties59.setSerialJtaTransactions(true);
        java.util.Properties properties73 = atomikosProperties59.asProperties();
        java.lang.Object obj74 = properties0.getOrDefault((java.lang.Object) boolean58, (java.lang.Object) atomikosProperties59);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 500L + "'", long26 == 500L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 300000L + "'", long53 == 300000L);
        org.junit.Assert.assertNotNull(recovery56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 50 + "'", int63 == 50);
        org.junit.Assert.assertNotNull(recovery64);
        org.junit.Assert.assertNotNull(properties73);
        org.junit.Assert.assertNotNull(obj74);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration5 = properties0.elements();
        java.util.Properties properties6 = new java.util.Properties(properties0);
        java.util.Set<java.lang.String> strSet7 = properties6.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties8.setEnableLogging(true);
        atomikosProperties8.consoleFileCount = 0;
        int int13 = atomikosProperties8.getMaxActives();
        java.lang.String str14 = atomikosProperties8.getLogBaseDir();
        java.lang.String str15 = atomikosProperties8.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery16 = atomikosProperties8.getRecovery();
        boolean boolean17 = atomikosProperties8.serialJtaTransactions;
        atomikosProperties8.defaultJtaTimeout = 1;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.setThreadedTwoPhaseCommit(true);
        boolean boolean27 = atomikosProperties20.isEnableLogging();
        atomikosProperties20.defaultJtaTimeout = (byte) 10;
        java.lang.Object obj30 = properties6.getOrDefault((java.lang.Object) 1, (java.lang.Object) atomikosProperties20);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties32 = atomikosProperties31.asProperties();
        atomikosProperties31.service = "{-1.0=100}";
        java.lang.String str35 = atomikosProperties31.getLogBaseName();
        java.lang.String str36 = atomikosProperties31.transactionManagerUniqueName;
        atomikosProperties31.consoleFileName = "";
        atomikosProperties31.forceShutdownOnVmExit = false;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties42 = atomikosProperties41.asProperties();
        atomikosProperties41.service = "{-1.0=100}";
        long long45 = atomikosProperties41.getDefaultJtaTimeout();
        atomikosProperties41.setTransactionManagerUniqueName("{}");
        atomikosProperties41.consoleFileName = "hi!";
        int int50 = atomikosProperties41.getConsoleFileCount();
        boolean boolean51 = atomikosProperties41.isThreadedTwoPhaseCommit();
        atomikosProperties41.maxTimeout = 0;
        atomikosProperties41.setLogBaseName("hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties56.setAllowSubTransactions(true);
        boolean boolean59 = atomikosProperties56.enableLogging;
        boolean boolean60 = atomikosProperties56.isForceShutdownOnVmExit();
        java.lang.String str61 = atomikosProperties56.getService();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties62 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties62.setAllowSubTransactions(true);
        boolean boolean65 = atomikosProperties62.enableLogging;
        boolean boolean66 = atomikosProperties62.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel67 = atomikosProperties62.consoleLogLevel;
        atomikosProperties56.consoleLogLevel = atomikosLoggingLevel67;
        atomikosProperties41.setConsoleLogLevel(atomikosLoggingLevel67);
        atomikosProperties31.consoleLogLevel = atomikosLoggingLevel67;
        atomikosProperties31.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties73 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties74 = atomikosProperties73.asProperties();
        atomikosProperties73.service = "{-1.0=100}";
        long long77 = atomikosProperties73.getDefaultJtaTimeout();
        atomikosProperties73.serialJtaTransactions = true;
        long long80 = atomikosProperties73.getDefaultJtaTimeout();
        long long81 = atomikosProperties73.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery82 = atomikosProperties73.getRecovery();
        long long83 = recovery82.delay;
        recovery82.maxRetries = (-1);
        long long86 = recovery82.getRetryInterval();
        long long87 = recovery82.getDelay();
        boolean boolean88 = properties6.remove((java.lang.Object) "{}", (java.lang.Object) recovery82);
        java.util.Enumeration<?> wildcardEnumeration89 = properties6.propertyNames();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(objEnumeration5);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(recovery16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "tmlog" + "'", str35, "tmlog");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10000L + "'", long45 == 10000L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel67 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel67.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties74);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10000L + "'", long77 == 10000L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 10000L + "'", long80 == 10000L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 500L + "'", long81 == 500L);
        org.junit.Assert.assertNotNull(recovery82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 10000L + "'", long83 == 10000L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 10000L + "'", long86 == 10000L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 10000L + "'", long87 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardEnumeration89);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.remove((java.lang.Object) (-1.0d));
        boolean boolean4 = properties0.contains((java.lang.Object) "{-1.0=100}");
        java.lang.String str5 = properties0.toString();
        properties0.clear();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties8 = atomikosProperties7.asProperties();
        atomikosProperties7.service = "{-1.0=100}";
        long long11 = atomikosProperties7.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = null;
        atomikosProperties7.setConsoleLogLevel(atomikosLoggingLevel12);
        int int14 = atomikosProperties7.maxActives;
        atomikosProperties7.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties7.getRecovery();
        long long18 = recovery17.forgetOrphanedLogEntriesDelay;
        recovery17.setDelay(0L);
        recovery17.forgetOrphanedLogEntriesDelay = 1L;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties23 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean24 = atomikosProperties23.isThreadedTwoPhaseCommit();
        atomikosProperties23.transactionManagerUniqueName = "{}";
        atomikosProperties23.service = "{{1.0=-1, -1.0=100}={1.0=-1}, 1.0=-1}";
        java.lang.Object obj29 = properties0.putIfAbsent((java.lang.Object) 1L, (java.lang.Object) atomikosProperties23);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 86400000L + "'", long18 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        java.lang.String str10 = atomikosProperties0.outputDir;
        atomikosProperties0.consoleFileCount = 32;
        atomikosProperties0.consoleFileLimit = (short) -1;
        int int15 = atomikosProperties0.maxActives;
        int int16 = atomikosProperties0.maxActives;
        java.lang.String str17 = atomikosProperties0.logBaseDir;
        long long18 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setService("{{-1.0=100}=}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 500L + "'", long18 == 500L);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties12 = new java.util.Properties();
        java.lang.String str13 = properties12.toString();
        java.lang.Object obj15 = properties12.remove((java.lang.Object) (short) 100);
        java.lang.Object obj18 = properties12.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj19 = properties12.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration20 = properties12.elements();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties12);
        java.lang.Object obj22 = properties12.clone();
        properties12.clear();
        int int24 = properties12.size();
        java.util.Properties properties25 = new java.util.Properties(properties12);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties27 = atomikosProperties26.asProperties();
        atomikosProperties26.service = "{-1.0=100}";
        long long30 = atomikosProperties26.getDefaultJtaTimeout();
        long long31 = atomikosProperties26.getMaxTimeout();
        int int32 = atomikosProperties26.consoleFileCount;
        atomikosProperties26.setConsoleFileCount(0);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel35 = atomikosProperties26.getConsoleLogLevel();
        java.util.Properties properties36 = new java.util.Properties();
        java.lang.Object obj38 = properties36.remove((java.lang.Object) (-1.0d));
        boolean boolean39 = properties36.isEmpty();
        int int40 = properties36.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery41 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery41.retryInterval = (short) 100;
        recovery41.forgetOrphanedLogEntriesDelay = 'a';
        java.util.Properties properties46 = new java.util.Properties();
        java.lang.Object obj48 = properties46.remove((java.lang.Object) (-1.0d));
        boolean boolean49 = properties46.isEmpty();
        int int50 = properties46.size();
        java.lang.String str52 = properties46.getProperty("{}");
        boolean boolean53 = properties36.remove((java.lang.Object) recovery41, (java.lang.Object) properties46);
        java.util.Set<java.lang.String> strSet54 = properties36.stringPropertyNames();
        java.lang.Object obj55 = properties12.replace((java.lang.Object) atomikosLoggingLevel35, (java.lang.Object) properties36);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties56.setEnableLogging(true);
        atomikosProperties56.consoleFileCount = 0;
        atomikosProperties56.setSerialJtaTransactions(false);
        java.lang.String str63 = atomikosProperties56.getOutputDir();
        boolean boolean64 = atomikosProperties56.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties65 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties66 = atomikosProperties65.asProperties();
        atomikosProperties65.service = "{-1.0=100}";
        long long69 = atomikosProperties65.getDefaultJtaTimeout();
        atomikosProperties65.setThreadedTwoPhaseCommit(true);
        boolean boolean72 = atomikosProperties65.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery73 = atomikosProperties65.recovery;
        atomikosProperties65.setLogBaseDir("");
        long long76 = atomikosProperties65.maxTimeout;
        java.lang.String str77 = atomikosProperties65.logBaseDir;
        java.lang.String str78 = atomikosProperties65.logBaseDir;
        long long79 = atomikosProperties65.getMaxTimeout();
        java.lang.Object obj80 = properties36.getOrDefault((java.lang.Object) atomikosProperties56, (java.lang.Object) long79);
        boolean boolean81 = atomikosProperties56.isAllowSubTransactions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{1.0=-1}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10000L + "'", long30 == 10000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 300000L + "'", long31 == 300000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel35 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel35.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10000L + "'", long69 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(recovery73);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 300000L + "'", long76 == 300000L);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 300000L + "'", long79 == 300000L);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 300000L + "'", obj80, 300000L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("tmlog");
        java.lang.String str10 = atomikosProperties0.logBaseName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery11 = atomikosProperties0.getRecovery();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery12 = atomikosProperties0.recovery;
        recovery12.retryInterval = 0L;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tmlog" + "'", str10, "tmlog");
        org.junit.Assert.assertNotNull(recovery11);
        org.junit.Assert.assertNotNull(recovery12);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.setCheckpointInterval((long) 5);
        atomikosProperties0.setConsoleFileCount(0);
        atomikosProperties0.setService("{-1.0=100}");
        atomikosProperties0.setDefaultJtaTimeout((long) 100);
        atomikosProperties0.defaultJtaTimeout = 32;
        atomikosProperties0.setService("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        long long19 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.maxActives = (-1);
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        atomikosProperties0.defaultJtaTimeout = 52;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5L + "'", long19 == 5L);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        long long5 = recovery0.retryInterval;
        recovery0.setForgetOrphanedLogEntriesDelay((long) 0);
        long long8 = recovery0.retryInterval;
        long long9 = recovery0.getDelay();
        recovery0.maxRetries = (byte) -1;
        int int12 = recovery0.maxRetries;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties8 = atomikosProperties7.asProperties();
        java.lang.Object obj9 = properties0.remove((java.lang.Object) properties8);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties11 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "{-1.0=100}";
        long long14 = atomikosProperties10.getDefaultJtaTimeout();
        atomikosProperties10.setThreadedTwoPhaseCommit(true);
        boolean boolean17 = atomikosProperties10.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery18 = atomikosProperties10.recovery;
        atomikosProperties10.setLogBaseDir("");
        long long21 = atomikosProperties10.maxTimeout;
        boolean boolean22 = atomikosProperties10.forceShutdownOnVmExit;
        boolean boolean23 = properties8.containsValue((java.lang.Object) atomikosProperties10);
        boolean boolean24 = atomikosProperties10.enableLogging;
        atomikosProperties10.logBaseName = "{0={100=100}, {}={}}";
        atomikosProperties10.setAllowSubTransactions(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(recovery18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 300000L + "'", long21 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.util.Set<java.lang.String> strSet8 = properties0.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties10 = atomikosProperties9.asProperties();
        atomikosProperties9.service = "{-1.0=100}";
        java.lang.String str13 = atomikosProperties9.getTransactionManagerUniqueName();
        atomikosProperties9.consoleFileName = "hi!";
        atomikosProperties9.service = "tm.out";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties18.setAllowSubTransactions(true);
        java.lang.String str21 = atomikosProperties18.transactionManagerUniqueName;
        int int22 = atomikosProperties18.getConsoleFileLimit();
        boolean boolean23 = properties0.remove((java.lang.Object) "tm.out", (java.lang.Object) atomikosProperties18);
        boolean boolean24 = properties0.isEmpty();
        java.util.Properties properties25 = new java.util.Properties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties27 = atomikosProperties26.asProperties();
        atomikosProperties26.service = "{-1.0=100}";
        long long30 = atomikosProperties26.getDefaultJtaTimeout();
        long long31 = atomikosProperties26.getMaxTimeout();
        atomikosProperties26.threadedTwoPhaseCommit = true;
        atomikosProperties26.setSerialJtaTransactions(true);
        atomikosProperties26.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties26.logBaseDir = "{1.0=-1, -1.0=100}";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery40 = atomikosProperties26.getRecovery();
        java.lang.Object obj41 = properties0.replace((java.lang.Object) properties25, (java.lang.Object) atomikosProperties26);
        java.util.Enumeration<java.lang.Object> objEnumeration42 = properties0.keys();
        java.io.Writer writer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.store(writer43, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, false={100=100}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10000L + "'", long30 == 10000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 300000L + "'", long31 == 300000L);
        org.junit.Assert.assertNotNull(recovery40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objEnumeration42);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.remove((java.lang.Object) (-1.0d));
        boolean boolean3 = properties0.isEmpty();
        int int4 = properties0.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties5 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties6 = atomikosProperties5.asProperties();
        atomikosProperties5.service = "{-1.0=100}";
        long long9 = atomikosProperties5.getDefaultJtaTimeout();
        atomikosProperties5.enableLogging = false;
        atomikosProperties5.setMaxActives((int) ' ');
        java.util.Properties properties14 = atomikosProperties5.asProperties();
        java.util.Enumeration<java.lang.Object> objEnumeration15 = properties14.elements();
        java.lang.Object obj16 = properties14.clone();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties14);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.storeToXML(outputStream18, "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(objEnumeration15);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.util.Set<java.lang.String> strSet8 = properties0.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery9.retryInterval = (short) 100;
        recovery9.delay = (-1L);
        long long14 = recovery9.delay;
        recovery9.delay = (short) 1;
        long long17 = recovery9.getRetryInterval();
        int int18 = recovery9.maxRetries;
        int int19 = recovery9.maxRetries;
        long long20 = recovery9.forgetOrphanedLogEntriesDelay;
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.remove((java.lang.Object) (-1.0d));
        boolean boolean24 = properties21.isEmpty();
        int int25 = properties21.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery26 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery26.retryInterval = (short) 100;
        recovery26.forgetOrphanedLogEntriesDelay = 'a';
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.remove((java.lang.Object) (-1.0d));
        boolean boolean34 = properties31.isEmpty();
        int int35 = properties31.size();
        java.lang.String str37 = properties31.getProperty("{}");
        boolean boolean38 = properties21.remove((java.lang.Object) recovery26, (java.lang.Object) properties31);
        java.lang.Object obj39 = properties0.putIfAbsent((java.lang.Object) long20, (java.lang.Object) properties21);
        java.util.Enumeration<java.lang.Object> objEnumeration40 = properties0.keys();
        java.util.Properties properties41 = new java.util.Properties();
        java.lang.Object obj43 = properties41.remove((java.lang.Object) (-1.0d));
        boolean boolean44 = properties41.isEmpty();
        java.util.Collection<java.lang.Object> objCollection45 = properties41.values();
        java.util.Properties properties46 = new java.util.Properties();
        java.lang.Object obj49 = properties46.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration50 = properties46.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration51 = properties46.elements();
        java.util.Properties properties52 = new java.util.Properties();
        java.util.Properties properties53 = new java.util.Properties();
        java.lang.String str54 = properties53.toString();
        java.lang.Object obj56 = properties53.remove((java.lang.Object) (short) 100);
        java.lang.Object obj59 = properties53.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        int int60 = properties53.size();
        java.util.Properties properties61 = new java.util.Properties();
        java.lang.Object obj63 = properties61.remove((java.lang.Object) (-1.0d));
        boolean boolean64 = properties61.isEmpty();
        java.lang.Object obj67 = properties61.setProperty("hi!", "{}");
        boolean boolean68 = properties52.remove((java.lang.Object) int60, (java.lang.Object) properties61);
        boolean boolean69 = properties0.replace((java.lang.Object) objCollection45, (java.lang.Object) objEnumeration51, (java.lang.Object) properties61);
        java.util.Set<java.lang.String> strSet70 = properties61.stringPropertyNames();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objEnumeration40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objCollection45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(objEnumeration50);
        org.junit.Assert.assertNotNull(objEnumeration51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "{}" + "'", str54, "{}");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strSet70);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.util.Set<java.lang.String> strSet8 = properties0.stringPropertyNames();
        java.util.Properties properties9 = new java.util.Properties(properties0);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties11 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "{-1.0=100}";
        java.lang.String str14 = atomikosProperties10.getTransactionManagerUniqueName();
        boolean boolean15 = atomikosProperties10.isSerialJtaTransactions();
        int int16 = atomikosProperties10.getConsoleFileLimit();
        java.util.Properties properties17 = new java.util.Properties();
        java.lang.String str18 = properties17.toString();
        java.lang.Object obj20 = properties17.remove((java.lang.Object) (short) 100);
        java.lang.Object obj23 = properties17.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean25 = properties17.containsKey((java.lang.Object) 0L);
        java.lang.Object obj28 = properties17.replace((java.lang.Object) false, (java.lang.Object) ' ');
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties29.setEnableLogging(true);
        atomikosProperties29.setConsoleFileLimit((int) (short) 0);
        boolean boolean34 = properties17.contains((java.lang.Object) atomikosProperties29);
        java.lang.Object obj35 = properties9.putIfAbsent((java.lang.Object) int16, (java.lang.Object) atomikosProperties29);
        java.util.Properties properties36 = new java.util.Properties(properties9);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet37 = properties36.entrySet();
        java.util.Properties properties38 = new java.util.Properties(properties36);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objEntrySet37);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.forceShutdownOnVmExit = false;
        java.lang.String str13 = atomikosProperties0.getConsoleFileName();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties15 = atomikosProperties14.asProperties();
        atomikosProperties14.service = "{-1.0=100}";
        long long18 = atomikosProperties14.getDefaultJtaTimeout();
        atomikosProperties14.enableLogging = false;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.setEnableLogging(true);
        atomikosProperties21.consoleFileCount = 0;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties27 = atomikosProperties26.asProperties();
        atomikosProperties26.service = "{-1.0=100}";
        long long30 = atomikosProperties26.getDefaultJtaTimeout();
        boolean boolean31 = atomikosProperties26.enableLogging;
        boolean boolean32 = atomikosProperties26.isForceShutdownOnVmExit();
        atomikosProperties26.consoleFileLimit = (byte) -1;
        java.lang.String str35 = atomikosProperties26.getService();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel36 = atomikosProperties26.consoleLogLevel;
        atomikosProperties21.consoleLogLevel = atomikosLoggingLevel36;
        atomikosProperties14.setConsoleLogLevel(atomikosLoggingLevel36);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel36);
        atomikosProperties0.outputDir = "tmlog";
        boolean boolean42 = atomikosProperties0.isSerialJtaTransactions();
        java.lang.String str43 = atomikosProperties0.getConsoleFileName();
        atomikosProperties0.outputDir = "{hi!={}}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tm.out" + "'", str13, "tm.out");
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10000L + "'", long18 == 10000L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10000L + "'", long30 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{-1.0=100}" + "'", str35, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel36 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel36.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "tm.out" + "'", str43, "tm.out");
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.logBaseName = "{={-1.0=100}, -1.0=100}";
        int int5 = atomikosProperties0.getConsoleFileLimit();
        int int6 = atomikosProperties0.consoleFileCount;
        atomikosProperties0.setService("{100=100}");
        boolean boolean9 = atomikosProperties0.isForceShutdownOnVmExit();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties8 = atomikosProperties7.asProperties();
        java.lang.Object obj9 = properties0.remove((java.lang.Object) properties8);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean11 = atomikosProperties10.isSerialJtaTransactions();
        atomikosProperties10.logBaseName = "{-1.0=100}";
        int int14 = atomikosProperties10.maxActives;
        atomikosProperties10.setAllowSubTransactions(false);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties10.getRecovery();
        atomikosProperties10.setLogBaseName("tmlog");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.setThreadedTwoPhaseCommit(true);
        boolean boolean27 = atomikosProperties20.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery28 = atomikosProperties20.recovery;
        atomikosProperties20.setLogBaseDir("");
        long long31 = atomikosProperties20.maxTimeout;
        boolean boolean32 = atomikosProperties20.forceShutdownOnVmExit;
        atomikosProperties20.enableLogging = false;
        java.lang.Object obj35 = properties0.putIfAbsent((java.lang.Object) atomikosProperties10, (java.lang.Object) atomikosProperties20);
        java.util.Properties properties36 = new java.util.Properties();
        java.util.Properties properties37 = new java.util.Properties(properties36);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet38 = properties37.entrySet();
        boolean boolean39 = properties37.isEmpty();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties40 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean41 = atomikosProperties40.isSerialJtaTransactions();
        atomikosProperties40.logBaseName = "{-1.0=100}";
        int int44 = atomikosProperties40.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery45 = atomikosProperties40.getRecovery();
        java.lang.String str46 = atomikosProperties40.getOutputDir();
        int int47 = atomikosProperties40.getMaxActives();
        boolean boolean48 = atomikosProperties40.allowSubTransactions;
        int int49 = atomikosProperties40.consoleFileLimit;
        java.lang.String str50 = atomikosProperties40.getService();
        java.util.Properties properties51 = new java.util.Properties();
        java.lang.String str52 = properties51.toString();
        java.lang.Object obj54 = properties51.remove((java.lang.Object) (short) 100);
        java.lang.Object obj57 = properties51.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean59 = properties51.containsKey((java.lang.Object) 0L);
        java.lang.Object obj62 = properties51.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties63 = new java.util.Properties();
        java.lang.String str64 = properties63.toString();
        java.lang.Object obj66 = properties63.remove((java.lang.Object) (short) 100);
        java.lang.Object obj69 = properties63.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj70 = properties63.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration71 = properties63.elements();
        properties51.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties63);
        boolean boolean74 = properties51.equals((java.lang.Object) 1.0f);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties75 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties76 = atomikosProperties75.asProperties();
        atomikosProperties75.service = "{-1.0=100}";
        long long79 = atomikosProperties75.getDefaultJtaTimeout();
        long long80 = atomikosProperties75.getMaxTimeout();
        int int81 = atomikosProperties75.consoleFileCount;
        int int82 = atomikosProperties75.getMaxActives();
        boolean boolean83 = atomikosProperties75.forceShutdownOnVmExit;
        java.lang.String str84 = atomikosProperties75.getTransactionManagerUniqueName();
        boolean boolean85 = properties51.containsValue((java.lang.Object) atomikosProperties75);
        java.util.Collection<java.lang.Object> objCollection86 = properties51.values();
        java.lang.Object obj87 = properties51.clone();
        java.lang.Object obj88 = properties37.getOrDefault((java.lang.Object) atomikosProperties40, (java.lang.Object) properties51);
        java.lang.Object obj91 = properties51.setProperty("{1.0=-1, -1.0=100}", "{-1.0=100}");
        atomikosProperties10.set(properties51, "{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}", (java.lang.Object) "hi!");
        java.lang.String str95 = atomikosProperties10.getLogBaseDir();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery96 = atomikosProperties10.recovery;
        recovery96.setMaxRetries((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(recovery28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 300000L + "'", long31 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objEntrySet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 50 + "'", int44 == 50);
        org.junit.Assert.assertNotNull(recovery45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 50 + "'", int47 == 50);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{}" + "'", str52, "{}");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "{}" + "'", str64, "{}");
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10000L + "'", long79 == 10000L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 300000L + "'", long80 == 300000L);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 50 + "'", int82 == 50);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objCollection86);
        org.junit.Assert.assertNotNull(obj87);
// flaky:         org.junit.Assert.assertEquals(obj87.toString(), "{1.0=-1, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "{1.0=-1, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "{1.0=-1, -1.0=100}");
        org.junit.Assert.assertNotNull(obj88);
// flaky:         org.junit.Assert.assertEquals(obj88.toString(), "{{1.0=-1, -1.0=100}={-1.0=100}, com.atomikos.icatch.{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=hi!, 1.0=-1, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "{{1.0=-1, -1.0=100}={-1.0=100}, com.atomikos.icatch.{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=hi!, 1.0=-1, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "{{1.0=-1, -1.0=100}={-1.0=100}, com.atomikos.icatch.{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=hi!, 1.0=-1, -1.0=100}");
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(recovery96);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel8 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel8;
        java.lang.String str10 = atomikosProperties0.logBaseDir;
        atomikosProperties0.checkpointInterval = (byte) 0;
        java.lang.String str13 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.allowSubTransactions = false;
        atomikosProperties0.setForceShutdownOnVmExit(true);
        java.util.Properties properties18 = new java.util.Properties();
        java.lang.Object obj20 = properties18.remove((java.lang.Object) (-1.0d));
        boolean boolean21 = properties18.isEmpty();
        java.util.Properties properties22 = new java.util.Properties();
        java.lang.String str23 = properties22.toString();
        java.lang.Object obj25 = properties22.remove((java.lang.Object) (short) 100);
        java.lang.Object obj28 = properties22.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean30 = properties22.containsKey((java.lang.Object) 0L);
        java.lang.Object obj33 = properties22.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj36 = properties22.setProperty("", "{-1.0=100}");
        java.lang.Object obj37 = properties22.clone();
        java.lang.Object obj38 = properties18.get((java.lang.Object) properties22);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties39.setEnableLogging(true);
        atomikosProperties39.consoleFileCount = 0;
        int int44 = atomikosProperties39.getMaxActives();
        java.lang.String str45 = atomikosProperties39.getLogBaseDir();
        java.lang.String str46 = atomikosProperties39.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery47 = atomikosProperties39.getRecovery();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties48 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties49 = atomikosProperties48.asProperties();
        atomikosProperties48.service = "{-1.0=100}";
        long long52 = atomikosProperties48.getDefaultJtaTimeout();
        atomikosProperties48.setThreadedTwoPhaseCommit(true);
        boolean boolean55 = atomikosProperties48.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery56 = atomikosProperties48.recovery;
        atomikosProperties48.setLogBaseDir("");
        java.lang.Object obj59 = properties22.replace((java.lang.Object) recovery47, (java.lang.Object) "");
        java.util.Properties properties60 = new java.util.Properties();
        java.lang.Object obj62 = properties60.remove((java.lang.Object) (-1.0d));
        boolean boolean64 = properties60.contains((java.lang.Object) "{-1.0=100}");
        boolean boolean65 = properties22.equals((java.lang.Object) "{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties67 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties68 = atomikosProperties67.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties69 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties70 = atomikosProperties69.asProperties();
        atomikosProperties69.service = "{-1.0=100}";
        long long73 = atomikosProperties69.getDefaultJtaTimeout();
        atomikosProperties69.consoleFileLimit = '#';
        java.lang.Object obj76 = properties68.get((java.lang.Object) atomikosProperties69);
        boolean boolean77 = atomikosProperties69.isForceShutdownOnVmExit();
        atomikosProperties69.consoleFileName = "";
        atomikosProperties69.checkpointInterval = (byte) 100;
        atomikosProperties69.consoleFileLimit = (byte) -1;
        atomikosProperties0.set(properties22, "{={={-1.0=100}, -1.0=100}}", (java.lang.Object) atomikosProperties69);
        java.util.Set<java.lang.String> strSet85 = properties22.stringPropertyNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
// flaky:         org.junit.Assert.assertEquals(obj37.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 50 + "'", int44 == 50);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(recovery47);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10000L + "'", long52 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(recovery56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10000L + "'", long73 == 10000L);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strSet85);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.lang.String str1 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.threadedTwoPhaseCommit = false;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties3.keys();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        boolean boolean21 = properties19.isEmpty();
        java.lang.Object obj24 = properties19.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties19.elements();
        java.lang.Object obj26 = properties2.replace((java.lang.Object) objEnumeration18, (java.lang.Object) properties19);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties2.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties29 = atomikosProperties28.asProperties();
        atomikosProperties28.service = "{-1.0=100}";
        long long32 = atomikosProperties28.getDefaultJtaTimeout();
        atomikosProperties28.setTransactionManagerUniqueName("{}");
        java.lang.String str35 = atomikosProperties28.getService();
        boolean boolean36 = properties2.contains((java.lang.Object) str35);
        properties2.clear();
        java.lang.String str39 = properties2.getProperty("{{-1.0=100}=}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties40 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties41 = atomikosProperties40.asProperties();
        atomikosProperties40.service = "{-1.0=100}";
        java.lang.String str44 = atomikosProperties40.getLogBaseName();
        long long45 = atomikosProperties40.defaultJtaTimeout;
        long long46 = atomikosProperties40.getMaxTimeout();
        boolean boolean47 = atomikosProperties40.forceShutdownOnVmExit;
        atomikosProperties40.setService("{-1.0=100}");
        atomikosProperties40.setOutputDir("{}");
        atomikosProperties40.setSerialJtaTransactions(true);
        atomikosProperties40.setCheckpointInterval((long) '#');
        boolean boolean56 = properties2.containsKey((java.lang.Object) atomikosProperties40);
        java.lang.String str57 = atomikosProperties40.getTransactionManagerUniqueName();
        java.lang.String str58 = atomikosProperties40.getLogBaseName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10000L + "'", long32 == 10000L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{-1.0=100}" + "'", str35, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "tmlog" + "'", str44, "tmlog");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10000L + "'", long45 == 10000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 300000L + "'", long46 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "tmlog" + "'", str58, "tmlog");
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.util.Properties properties7 = new java.util.Properties();
        java.lang.String str8 = properties7.toString();
        java.lang.Object obj10 = properties7.remove((java.lang.Object) (short) 100);
        java.lang.Object obj13 = properties7.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        int int14 = properties7.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery15 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery15.retryInterval = (short) 100;
        recovery15.forgetOrphanedLogEntriesDelay = 'a';
        long long20 = recovery15.retryInterval;
        recovery15.setForgetOrphanedLogEntriesDelay((long) 0);
        java.lang.Object obj23 = properties0.replace((java.lang.Object) int14, (java.lang.Object) recovery15);
        recovery15.forgetOrphanedLogEntriesDelay = 300000L;
        long long26 = recovery15.getForgetOrphanedLogEntriesDelay();
        recovery15.retryInterval = 86400000L;
        recovery15.setForgetOrphanedLogEntriesDelay((long) 3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 300000L + "'", long26 == 300000L);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.forgetOrphanedLogEntriesDelay;
        long long2 = recovery0.getForgetOrphanedLogEntriesDelay();
        long long3 = recovery0.getForgetOrphanedLogEntriesDelay();
        int int4 = recovery0.maxRetries;
        recovery0.retryInterval = 2L;
        long long7 = recovery0.getForgetOrphanedLogEntriesDelay();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 86400000L + "'", long1 == 86400000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86400000L + "'", long2 == 86400000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 86400000L + "'", long3 == 86400000L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration5 = properties0.elements();
        java.util.Properties properties6 = new java.util.Properties(properties0);
        java.util.Properties properties7 = new java.util.Properties(properties6);
        java.util.Properties properties8 = new java.util.Properties(properties6);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties10 = atomikosProperties9.asProperties();
        atomikosProperties9.service = "{-1.0=100}";
        long long13 = atomikosProperties9.getDefaultJtaTimeout();
        atomikosProperties9.setThreadedTwoPhaseCommit(true);
        boolean boolean16 = atomikosProperties9.isAllowSubTransactions();
        boolean boolean17 = atomikosProperties9.isEnableLogging();
        java.lang.String str18 = atomikosProperties9.logBaseDir;
        java.lang.String str19 = atomikosProperties9.getLogBaseDir();
        java.lang.String str20 = atomikosProperties9.getLogBaseName();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean24 = properties21.containsValue((java.lang.Object) (-1L));
        java.lang.Object obj26 = properties21.get((java.lang.Object) 97L);
        properties21.clear();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery28 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery28.retryInterval = (short) 100;
        recovery28.delay = (-1L);
        long long33 = recovery28.delay;
        recovery28.delay = (short) 1;
        long long36 = recovery28.getRetryInterval();
        int int37 = recovery28.maxRetries;
        long long38 = recovery28.getForgetOrphanedLogEntriesDelay();
        recovery28.setMaxRetries(0);
        recovery28.setMaxRetries(0);
        java.util.Properties properties43 = new java.util.Properties();
        java.util.Properties properties44 = new java.util.Properties(properties43);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet45 = properties44.entrySet();
        java.util.Properties properties46 = new java.util.Properties();
        java.lang.Object obj49 = properties46.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration50 = properties46.keys();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet51 = properties46.entrySet();
        properties44.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties46);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery53 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery53.retryInterval = (short) 100;
        recovery53.delay = (-1L);
        long long58 = recovery53.delay;
        recovery53.delay = (short) 1;
        long long61 = recovery53.getRetryInterval();
        java.util.Properties properties62 = new java.util.Properties();
        java.lang.String str63 = properties62.toString();
        properties62.clear();
        java.lang.Object obj65 = properties44.getOrDefault((java.lang.Object) recovery53, (java.lang.Object) properties62);
        java.lang.Object obj66 = properties21.getOrDefault((java.lang.Object) 0, (java.lang.Object) properties44);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties68 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties69 = atomikosProperties68.asProperties();
        atomikosProperties68.service = "{-1.0=100}";
        long long72 = atomikosProperties68.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel73 = null;
        atomikosProperties68.setConsoleLogLevel(atomikosLoggingLevel73);
        int int75 = atomikosProperties68.maxActives;
        atomikosProperties68.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery78 = atomikosProperties68.getRecovery();
        atomikosProperties68.consoleFileName = "{-1.0=100}";
        atomikosProperties68.setSerialJtaTransactions(false);
        atomikosProperties68.consoleFileName = "{={-1.0=100}, -1.0=100}";
        atomikosProperties68.defaultJtaTimeout = 50;
        long long87 = atomikosProperties68.getCheckpointInterval();
        long long88 = atomikosProperties68.defaultJtaTimeout;
        atomikosProperties9.set(properties21, "{}", (java.lang.Object) atomikosProperties68);
        boolean boolean90 = atomikosProperties9.enableLogging;
        java.lang.Object obj91 = properties6.remove((java.lang.Object) atomikosProperties9);
        java.util.Collection<java.lang.Object> objCollection92 = properties6.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(objEnumeration5);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10000L + "'", long13 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tmlog" + "'", str20, "tmlog");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 86400000L + "'", long38 == 86400000L);
        org.junit.Assert.assertNotNull(objEntrySet45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(objEnumeration50);
        org.junit.Assert.assertNotNull(objEntrySet51);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "{}" + "'", str63, "{}");
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "{}");
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "{{}={}}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "{{}={}}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "{{}={}}");
        org.junit.Assert.assertNotNull(properties69);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10000L + "'", long72 == 10000L);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 50 + "'", int75 == 50);
        org.junit.Assert.assertNotNull(recovery78);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 500L + "'", long87 == 500L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 50L + "'", long88 == 50L);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(objCollection92);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.Object obj10 = properties8.remove((java.lang.Object) (-1.0d));
        java.util.Enumeration<?> wildcardEnumeration11 = properties8.propertyNames();
        java.util.Set<java.lang.Object> objSet12 = properties8.keySet();
        java.util.Set<java.lang.String> strSet13 = properties8.stringPropertyNames();
        java.util.Properties properties15 = new java.util.Properties();
        atomikosProperties0.set(properties8, "tm.out", (java.lang.Object) properties15);
        atomikosProperties0.setCheckpointInterval(0L);
        atomikosProperties0.setForceShutdownOnVmExit(false);
        java.util.Properties properties21 = atomikosProperties0.asProperties();
        java.util.Enumeration<?> wildcardEnumeration22 = properties21.propertyNames();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet23 = properties21.entrySet();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardEnumeration11);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(wildcardEnumeration22);
        org.junit.Assert.assertNotNull(objEntrySet23);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties8 = atomikosProperties7.asProperties();
        java.lang.Object obj9 = properties0.remove((java.lang.Object) properties8);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean11 = atomikosProperties10.isSerialJtaTransactions();
        atomikosProperties10.logBaseName = "{-1.0=100}";
        int int14 = atomikosProperties10.maxActives;
        atomikosProperties10.setAllowSubTransactions(false);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties10.getRecovery();
        atomikosProperties10.setLogBaseName("tmlog");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.setThreadedTwoPhaseCommit(true);
        boolean boolean27 = atomikosProperties20.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery28 = atomikosProperties20.recovery;
        atomikosProperties20.setLogBaseDir("");
        long long31 = atomikosProperties20.maxTimeout;
        boolean boolean32 = atomikosProperties20.forceShutdownOnVmExit;
        atomikosProperties20.enableLogging = false;
        java.lang.Object obj35 = properties0.putIfAbsent((java.lang.Object) atomikosProperties10, (java.lang.Object) atomikosProperties20);
        java.util.Properties properties36 = new java.util.Properties();
        java.util.Properties properties37 = new java.util.Properties(properties36);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet38 = properties37.entrySet();
        boolean boolean39 = properties37.isEmpty();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties40 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean41 = atomikosProperties40.isSerialJtaTransactions();
        atomikosProperties40.logBaseName = "{-1.0=100}";
        int int44 = atomikosProperties40.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery45 = atomikosProperties40.getRecovery();
        java.lang.String str46 = atomikosProperties40.getOutputDir();
        int int47 = atomikosProperties40.getMaxActives();
        boolean boolean48 = atomikosProperties40.allowSubTransactions;
        int int49 = atomikosProperties40.consoleFileLimit;
        java.lang.String str50 = atomikosProperties40.getService();
        java.util.Properties properties51 = new java.util.Properties();
        java.lang.String str52 = properties51.toString();
        java.lang.Object obj54 = properties51.remove((java.lang.Object) (short) 100);
        java.lang.Object obj57 = properties51.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean59 = properties51.containsKey((java.lang.Object) 0L);
        java.lang.Object obj62 = properties51.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties63 = new java.util.Properties();
        java.lang.String str64 = properties63.toString();
        java.lang.Object obj66 = properties63.remove((java.lang.Object) (short) 100);
        java.lang.Object obj69 = properties63.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj70 = properties63.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration71 = properties63.elements();
        properties51.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties63);
        boolean boolean74 = properties51.equals((java.lang.Object) 1.0f);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties75 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties76 = atomikosProperties75.asProperties();
        atomikosProperties75.service = "{-1.0=100}";
        long long79 = atomikosProperties75.getDefaultJtaTimeout();
        long long80 = atomikosProperties75.getMaxTimeout();
        int int81 = atomikosProperties75.consoleFileCount;
        int int82 = atomikosProperties75.getMaxActives();
        boolean boolean83 = atomikosProperties75.forceShutdownOnVmExit;
        java.lang.String str84 = atomikosProperties75.getTransactionManagerUniqueName();
        boolean boolean85 = properties51.containsValue((java.lang.Object) atomikosProperties75);
        java.util.Collection<java.lang.Object> objCollection86 = properties51.values();
        java.lang.Object obj87 = properties51.clone();
        java.lang.Object obj88 = properties37.getOrDefault((java.lang.Object) atomikosProperties40, (java.lang.Object) properties51);
        java.lang.Object obj91 = properties51.setProperty("{1.0=-1, -1.0=100}", "{-1.0=100}");
        atomikosProperties10.set(properties51, "{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}", (java.lang.Object) "hi!");
        java.lang.String str95 = atomikosProperties10.getLogBaseDir();
        java.lang.String str96 = atomikosProperties10.getOutputDir();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(recovery28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 300000L + "'", long31 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objEntrySet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 50 + "'", int44 == 50);
        org.junit.Assert.assertNotNull(recovery45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 50 + "'", int47 == 50);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{}" + "'", str52, "{}");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "{}" + "'", str64, "{}");
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10000L + "'", long79 == 10000L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 300000L + "'", long80 == 300000L);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 50 + "'", int82 == 50);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objCollection86);
        org.junit.Assert.assertNotNull(obj87);
// flaky:         org.junit.Assert.assertEquals(obj87.toString(), "{1.0=-1, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "{1.0=-1, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "{1.0=-1, -1.0=100}");
        org.junit.Assert.assertNotNull(obj88);
// flaky:         org.junit.Assert.assertEquals(obj88.toString(), "{{1.0=-1, -1.0=100}={-1.0=100}, com.atomikos.icatch.{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=hi!, 1.0=-1, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "{{1.0=-1, -1.0=100}={-1.0=100}, com.atomikos.icatch.{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=hi!, 1.0=-1, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "{{1.0=-1, -1.0=100}={-1.0=100}, com.atomikos.icatch.{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=hi!, 1.0=-1, -1.0=100}");
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties5 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties6 = atomikosProperties5.asProperties();
        atomikosProperties5.service = "{-1.0=100}";
        long long9 = atomikosProperties5.getDefaultJtaTimeout();
        boolean boolean10 = atomikosProperties5.enableLogging;
        boolean boolean11 = atomikosProperties5.isForceShutdownOnVmExit();
        atomikosProperties5.consoleFileLimit = (byte) -1;
        java.lang.String str14 = atomikosProperties5.getService();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel15 = atomikosProperties5.consoleLogLevel;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel15;
        boolean boolean17 = atomikosProperties0.allowSubTransactions;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery18 = atomikosProperties0.getRecovery();
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{-1.0=100}" + "'", str14, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel15 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel15.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(recovery18);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setMaxActives(100);
        java.lang.String str9 = atomikosProperties0.logBaseDir;
        java.lang.String str10 = atomikosProperties0.getConsoleFileName();
        long long11 = atomikosProperties0.getCheckpointInterval();
        java.lang.String str12 = atomikosProperties0.logBaseName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tm.out" + "'", str10, "tm.out");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 500L + "'", long11 == 500L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tmlog" + "'", str12, "tmlog");
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        java.lang.String str8 = atomikosProperties0.logBaseName;
        atomikosProperties0.setCheckpointInterval((long) 18);
        atomikosProperties0.checkpointInterval = 100;
        atomikosProperties0.setConsoleFileName("hi!");
        atomikosProperties0.setService("");
        atomikosProperties0.setLogBaseName("{{1.0=-1}=hi!}");
        java.util.Properties properties19 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties20.logBaseName = "hi!";
        java.lang.String str29 = atomikosProperties20.transactionManagerUniqueName;
        atomikosProperties20.setLogBaseDir("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel32 = atomikosProperties20.getConsoleLogLevel();
        java.lang.String str33 = atomikosProperties20.consoleFileName;
        long long34 = atomikosProperties20.getCheckpointInterval();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties35 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties36 = atomikosProperties35.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties38 = atomikosProperties37.asProperties();
        atomikosProperties37.service = "{-1.0=100}";
        long long41 = atomikosProperties37.getDefaultJtaTimeout();
        atomikosProperties37.consoleFileLimit = '#';
        java.lang.Object obj44 = properties36.get((java.lang.Object) atomikosProperties37);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties45 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties46 = atomikosProperties45.asProperties();
        atomikosProperties45.service = "{-1.0=100}";
        long long49 = atomikosProperties45.getDefaultJtaTimeout();
        atomikosProperties45.consoleFileLimit = '#';
        atomikosProperties45.setLogBaseName("{={-1.0=100}, -1.0=100}");
        java.lang.String str54 = atomikosProperties45.outputDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties55 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties56 = atomikosProperties55.asProperties();
        atomikosProperties55.service = "{-1.0=100}";
        long long59 = atomikosProperties55.getDefaultJtaTimeout();
        atomikosProperties55.setThreadedTwoPhaseCommit(true);
        boolean boolean62 = atomikosProperties55.isEnableLogging();
        atomikosProperties55.defaultJtaTimeout = (byte) 10;
        int int65 = atomikosProperties55.getMaxActives();
        int int66 = atomikosProperties55.consoleFileCount;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel67 = atomikosProperties55.getConsoleLogLevel();
        atomikosProperties45.setConsoleLogLevel(atomikosLoggingLevel67);
        atomikosProperties37.setConsoleLogLevel(atomikosLoggingLevel67);
        boolean boolean70 = atomikosProperties37.serialJtaTransactions;
        atomikosProperties37.setTransactionManagerUniqueName("");
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel73 = atomikosProperties37.consoleLogLevel;
        atomikosProperties20.setConsoleLogLevel(atomikosLoggingLevel73);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel73);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{-1.0=100}" + "'", str8, "{-1.0=100}");
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel32 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel32.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "tm.out" + "'", str33, "tm.out");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 500L + "'", long34 == 500L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10000L + "'", long41 == 10000L);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10000L + "'", long49 == 10000L);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10000L + "'", long59 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 50 + "'", int65 == 50);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel67 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel67.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel73 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel73.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties3 = atomikosProperties2.asProperties();
        atomikosProperties2.service = "{-1.0=100}";
        long long6 = atomikosProperties2.getDefaultJtaTimeout();
        atomikosProperties2.consoleFileLimit = '#';
        java.lang.Object obj9 = properties1.get((java.lang.Object) atomikosProperties2);
        boolean boolean10 = atomikosProperties2.forceShutdownOnVmExit;
        atomikosProperties2.setOutputDir("");
        long long13 = atomikosProperties2.defaultJtaTimeout;
        atomikosProperties2.setConsoleFileLimit((int) (short) -1);
        boolean boolean16 = atomikosProperties2.serialJtaTransactions;
        atomikosProperties2.setOutputDir("tm.out");
        boolean boolean19 = atomikosProperties2.forceShutdownOnVmExit;
        java.lang.String str20 = atomikosProperties2.consoleFileName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10000L + "'", long13 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tm.out" + "'", str20, "tm.out");
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        boolean boolean3 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.setConsoleFileCount(5);
        int int6 = atomikosProperties0.consoleFileCount;
        boolean boolean7 = atomikosProperties0.forceShutdownOnVmExit;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        long long10 = recovery9.delay;
        int int11 = recovery9.maxRetries;
        recovery9.setMaxRetries((int) '#');
        long long14 = recovery9.getForgetOrphanedLogEntriesDelay();
        recovery9.setDelay(5L);
        recovery9.maxRetries = '4';
        recovery9.setRetryInterval((long) (byte) 1);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86400000L + "'", long14 == 86400000L);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        int int5 = atomikosProperties0.getConsoleFileCount();
        java.lang.String str6 = atomikosProperties0.service;
        java.lang.String str7 = atomikosProperties0.getTransactionManagerUniqueName();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.recovery;
        recovery8.maxRetries = (byte) 1;
        int int11 = recovery8.getMaxRetries();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        boolean boolean3 = atomikosProperties0.enableLogging;
        atomikosProperties0.consoleFileLimit = (byte) 100;
        java.util.Properties properties6 = new java.util.Properties();
        java.lang.String str7 = properties6.toString();
        java.util.Properties properties8 = new java.util.Properties(properties6);
        java.util.Properties properties10 = new java.util.Properties();
        java.lang.String str11 = properties10.toString();
        java.lang.Object obj13 = properties10.remove((java.lang.Object) (short) 100);
        java.lang.Object obj16 = properties10.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean18 = properties10.containsKey((java.lang.Object) 0L);
        java.lang.Object obj21 = properties10.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties22 = new java.util.Properties(properties10);
        java.util.Enumeration<java.lang.Object> objEnumeration23 = properties22.elements();
        atomikosProperties0.set(properties8, "{={-1.0=100}, -1.0=100}", (java.lang.Object) properties22);
        int int25 = properties8.size();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet26 = properties8.entrySet();
        boolean boolean27 = properties8.isEmpty();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties29 = atomikosProperties28.asProperties();
        java.util.Properties properties30 = new java.util.Properties();
        java.lang.Object obj32 = properties30.remove((java.lang.Object) (-1.0d));
        boolean boolean33 = properties30.isEmpty();
        int int34 = properties30.size();
        java.lang.String str36 = properties30.getProperty("{}");
        java.lang.Object obj37 = properties29.remove((java.lang.Object) properties30);
        properties8.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties30);
        java.lang.Object obj39 = properties8.clone();
        java.util.Enumeration<?> wildcardEnumeration40 = properties8.propertyNames();
        boolean boolean41 = properties8.isEmpty();
        java.util.Collection<java.lang.Object> objCollection42 = properties8.values();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objEnumeration23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objEntrySet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        org.junit.Assert.assertNotNull(wildcardEnumeration40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objCollection42);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties3.keys();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        boolean boolean21 = properties19.isEmpty();
        java.lang.Object obj24 = properties19.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties19.elements();
        java.lang.Object obj26 = properties2.replace((java.lang.Object) objEnumeration18, (java.lang.Object) properties19);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties19.elements();
        int int28 = properties19.size();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet29 = properties19.entrySet();
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties19.save(outputStream30, "tm.out");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objEntrySet29);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties();
        java.lang.String str2 = properties1.toString();
        boolean boolean3 = properties1.isEmpty();
        java.util.Properties properties4 = new java.util.Properties();
        java.lang.String str5 = properties4.toString();
        java.lang.Object obj7 = properties4.remove((java.lang.Object) (short) 100);
        java.lang.Object obj10 = properties4.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean12 = properties4.containsKey((java.lang.Object) 0L);
        boolean boolean13 = properties1.containsValue((java.lang.Object) 0L);
        boolean boolean16 = properties0.replace((java.lang.Object) 0L, (java.lang.Object) 0.0f, (java.lang.Object) 10.0d);
        java.util.Enumeration<java.lang.Object> objEnumeration17 = properties0.elements();
        java.lang.String str18 = properties0.toString();
        java.util.Enumeration<java.lang.Object> objEnumeration19 = properties0.elements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objEnumeration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertNotNull(objEnumeration19);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        boolean boolean2 = properties0.isEmpty();
        java.lang.Object obj5 = properties0.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Properties properties6 = new java.util.Properties();
        java.lang.Object obj8 = properties6.remove((java.lang.Object) (-1.0d));
        boolean boolean9 = properties6.isEmpty();
        java.lang.Object obj12 = properties6.setProperty("hi!", "{}");
        java.lang.Object obj14 = properties0.getOrDefault((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        properties0.clear();
        java.util.Properties properties16 = new java.util.Properties();
        java.lang.String str17 = properties16.toString();
        java.util.Properties properties18 = new java.util.Properties(properties16);
        boolean boolean19 = properties18.isEmpty();
        java.lang.Object obj22 = properties18.setProperty("tmlog", "{}");
        boolean boolean23 = properties0.containsValue((java.lang.Object) properties18);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery24 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery24.retryInterval = (short) 100;
        recovery24.setForgetOrphanedLogEntriesDelay((long) 5);
        recovery24.setRetryInterval((long) (-1));
        recovery24.retryInterval = (byte) 100;
        long long33 = recovery24.getDelay();
        long long34 = recovery24.forgetOrphanedLogEntriesDelay;
        long long35 = recovery24.getRetryInterval();
        long long36 = recovery24.getForgetOrphanedLogEntriesDelay();
        boolean boolean37 = properties0.containsValue((java.lang.Object) recovery24);
        java.util.Collection<java.lang.Object> objCollection38 = properties0.values();
        java.lang.Object obj41 = properties0.setProperty("", "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.io.PrintStream printStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.list(printStream42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10000L + "'", long33 == 10000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5L + "'", long34 == 5L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5L + "'", long36 == 5L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objCollection38);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        int int9 = atomikosProperties0.getConsoleFileCount();
        long long10 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties12 = atomikosProperties11.asProperties();
        atomikosProperties11.service = "{-1.0=100}";
        java.lang.String str15 = atomikosProperties11.getTransactionManagerUniqueName();
        boolean boolean16 = atomikosProperties11.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel17 = atomikosProperties11.getConsoleLogLevel();
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel17);
        atomikosProperties0.forceShutdownOnVmExit = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery21 = atomikosProperties0.recovery;
        recovery21.forgetOrphanedLogEntriesDelay = 100L;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel17 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel17.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(recovery21);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.delay = (-1L);
        long long5 = recovery0.delay;
        int int6 = recovery0.getMaxRetries();
        recovery0.setForgetOrphanedLogEntriesDelay((long) (byte) 0);
        long long9 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.setDelay(5L);
        long long12 = recovery0.getRetryInterval();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.threadedTwoPhaseCommit = true;
        long long8 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.enableLogging = false;
        atomikosProperties0.setMaxTimeout((long) (short) 100);
        java.lang.String str13 = atomikosProperties0.getService();
        atomikosProperties0.setMaxTimeout(19L);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{-1.0=100}" + "'", str13, "{-1.0=100}");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.delay = (-1L);
        long long5 = recovery0.delay;
        recovery0.delay = (short) 1;
        long long8 = recovery0.getRetryInterval();
        int int9 = recovery0.maxRetries;
        int int10 = recovery0.getMaxRetries();
        recovery0.setMaxRetries((-1));
        recovery0.setMaxRetries((int) (byte) -1);
        long long15 = recovery0.forgetOrphanedLogEntriesDelay;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 86400000L + "'", long15 == 86400000L);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties3.keys();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        boolean boolean21 = properties19.isEmpty();
        java.lang.Object obj24 = properties19.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties19.elements();
        java.lang.Object obj26 = properties2.replace((java.lang.Object) objEnumeration18, (java.lang.Object) properties19);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties2.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties29 = atomikosProperties28.asProperties();
        atomikosProperties28.service = "{-1.0=100}";
        long long32 = atomikosProperties28.getDefaultJtaTimeout();
        atomikosProperties28.setTransactionManagerUniqueName("{}");
        java.lang.String str35 = atomikosProperties28.getService();
        boolean boolean36 = properties2.contains((java.lang.Object) str35);
        properties2.clear();
        java.lang.String str39 = properties2.getProperty("{{-1.0=100}=}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties40 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties41 = atomikosProperties40.asProperties();
        atomikosProperties40.service = "{-1.0=100}";
        java.lang.String str44 = atomikosProperties40.getLogBaseName();
        long long45 = atomikosProperties40.defaultJtaTimeout;
        long long46 = atomikosProperties40.getMaxTimeout();
        boolean boolean47 = atomikosProperties40.forceShutdownOnVmExit;
        atomikosProperties40.setService("{-1.0=100}");
        atomikosProperties40.setOutputDir("{}");
        atomikosProperties40.setSerialJtaTransactions(true);
        atomikosProperties40.setCheckpointInterval((long) '#');
        boolean boolean56 = properties2.containsKey((java.lang.Object) atomikosProperties40);
        boolean boolean57 = atomikosProperties40.isAllowSubTransactions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10000L + "'", long32 == 10000L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{-1.0=100}" + "'", str35, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "tmlog" + "'", str44, "tmlog");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10000L + "'", long45 == 10000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 300000L + "'", long46 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        long long7 = atomikosProperties0.getCheckpointInterval();
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        java.lang.String str9 = atomikosProperties0.service;
        int int10 = atomikosProperties0.consoleFileCount;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery11 = atomikosProperties0.recovery;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = atomikosProperties0.consoleLogLevel;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{-1.0=100}" + "'", str9, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(recovery11);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel12 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel12.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.defaultJtaTimeout = (byte) 10;
        java.lang.String str10 = atomikosProperties0.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery11 = atomikosProperties0.getRecovery();
        atomikosProperties0.enableLogging = true;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(recovery11);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.Object obj10 = properties8.remove((java.lang.Object) (-1.0d));
        java.util.Enumeration<?> wildcardEnumeration11 = properties8.propertyNames();
        java.util.Set<java.lang.Object> objSet12 = properties8.keySet();
        java.util.Set<java.lang.String> strSet13 = properties8.stringPropertyNames();
        java.util.Properties properties15 = new java.util.Properties();
        atomikosProperties0.set(properties8, "tm.out", (java.lang.Object) properties15);
        atomikosProperties0.defaultJtaTimeout = 18;
        boolean boolean19 = atomikosProperties0.isAllowSubTransactions();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardEnumeration11);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        atomikosProperties0.consoleFileCount = (byte) 0;
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.logBaseName = "{com.atomikos.icatch.{}=5}";
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel10 = atomikosProperties0.consoleLogLevel;
        java.lang.String str11 = atomikosProperties0.outputDir;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel10 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel10.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel12 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel12.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.consoleFileName = "hi!";
        int int9 = atomikosProperties0.getConsoleFileCount();
        long long10 = atomikosProperties0.getMaxTimeout();
        long long11 = atomikosProperties0.defaultJtaTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel12 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel12.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        long long5 = recovery0.retryInterval;
        recovery0.forgetOrphanedLogEntriesDelay = 0L;
        long long8 = recovery0.getForgetOrphanedLogEntriesDelay();
        long long9 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.retryInterval = 0L;
        long long12 = recovery0.retryInterval;
        int int13 = recovery0.maxRetries;
        recovery0.maxRetries = (short) 100;
        int int16 = recovery0.getMaxRetries();
        long long17 = recovery0.retryInterval;
        int int18 = recovery0.getMaxRetries();
        recovery0.forgetOrphanedLogEntriesDelay = 97;
        long long21 = recovery0.getDelay();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10000L + "'", long21 == 10000L);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties3.keys();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        boolean boolean21 = properties19.isEmpty();
        java.lang.Object obj24 = properties19.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties19.elements();
        java.lang.Object obj26 = properties2.replace((java.lang.Object) objEnumeration18, (java.lang.Object) properties19);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties2.keys();
        java.lang.String str28 = properties2.toString();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet29 = properties2.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties31 = atomikosProperties30.asProperties();
        atomikosProperties30.service = "{-1.0=100}";
        long long34 = atomikosProperties30.getDefaultJtaTimeout();
        atomikosProperties30.setTransactionManagerUniqueName("{}");
        atomikosProperties30.consoleFileName = "hi!";
        int int39 = atomikosProperties30.getConsoleFileCount();
        boolean boolean40 = atomikosProperties30.isThreadedTwoPhaseCommit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel41 = atomikosProperties30.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties43 = atomikosProperties42.asProperties();
        atomikosProperties42.service = "{-1.0=100}";
        long long46 = atomikosProperties42.getDefaultJtaTimeout();
        atomikosProperties42.enableLogging = false;
        atomikosProperties42.setMaxActives((int) ' ');
        java.util.Properties properties51 = atomikosProperties42.asProperties();
        java.lang.String str52 = atomikosProperties42.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery53 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery53.retryInterval = (short) 100;
        recovery53.delay = (-1L);
        long long58 = recovery53.delay;
        recovery53.delay = (short) 1;
        boolean boolean61 = properties2.replace((java.lang.Object) atomikosProperties30, (java.lang.Object) atomikosProperties42, (java.lang.Object) recovery53);
        atomikosProperties42.enableLogging = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertNotNull(objEntrySet29);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10000L + "'", long34 == 10000L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel41 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel41.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10000L + "'", long46 == 10000L);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.defaultJtaTimeout = (byte) 10;
        atomikosProperties0.setLogBaseName("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        atomikosProperties0.checkpointInterval = 18L;
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        atomikosProperties0.setLogBaseDir("{hi!={}}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        boolean boolean8 = atomikosProperties0.enableLogging;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.remove((java.lang.Object) (-1.0d));
        boolean boolean3 = properties0.isEmpty();
        java.util.Properties properties4 = new java.util.Properties();
        java.lang.String str5 = properties4.toString();
        java.lang.Object obj7 = properties4.remove((java.lang.Object) (short) 100);
        java.lang.Object obj10 = properties4.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean12 = properties4.containsKey((java.lang.Object) 0L);
        java.lang.Object obj15 = properties4.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj18 = properties4.setProperty("", "{-1.0=100}");
        java.lang.Object obj19 = properties4.clone();
        java.lang.Object obj20 = properties0.get((java.lang.Object) properties4);
        java.lang.Object obj21 = properties4.clone();
        int int22 = properties4.size();
        java.lang.String str23 = properties4.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties25 = atomikosProperties24.asProperties();
        atomikosProperties24.service = "{-1.0=100}";
        long long28 = atomikosProperties24.getDefaultJtaTimeout();
        atomikosProperties24.outputDir = "{={-1.0=100}, -1.0=100}";
        long long31 = atomikosProperties24.getCheckpointInterval();
        boolean boolean32 = atomikosProperties24.isThreadedTwoPhaseCommit();
        java.lang.String str33 = atomikosProperties24.service;
        int int34 = atomikosProperties24.consoleFileCount;
        atomikosProperties24.logBaseName = "tm.out";
        java.lang.String str37 = atomikosProperties24.getService();
        java.lang.String str38 = atomikosProperties24.logBaseName;
        java.lang.String str39 = atomikosProperties24.getTransactionManagerUniqueName();
        java.util.Properties properties40 = new java.util.Properties();
        java.lang.Object obj42 = properties40.remove((java.lang.Object) (-1.0d));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties44 = atomikosProperties43.asProperties();
        atomikosProperties43.service = "{-1.0=100}";
        long long47 = atomikosProperties43.getDefaultJtaTimeout();
        atomikosProperties43.setThreadedTwoPhaseCommit(true);
        boolean boolean50 = atomikosProperties43.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery51 = atomikosProperties43.recovery;
        atomikosProperties43.setLogBaseDir("");
        long long54 = atomikosProperties43.maxTimeout;
        atomikosProperties43.setService("{={-1.0=100}, -1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean58 = atomikosProperties57.isSerialJtaTransactions();
        atomikosProperties57.logBaseName = "{-1.0=100}";
        int int61 = atomikosProperties57.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery62 = atomikosProperties57.getRecovery();
        java.lang.String str63 = atomikosProperties57.getOutputDir();
        boolean boolean64 = atomikosProperties57.isForceShutdownOnVmExit();
        boolean boolean65 = atomikosProperties57.enableLogging;
        java.lang.Class<?> wildcardClass66 = atomikosProperties57.getClass();
        java.lang.Object obj67 = properties40.replace((java.lang.Object) atomikosProperties43, (java.lang.Object) wildcardClass66);
        java.util.Set<java.lang.String> strSet68 = properties40.stringPropertyNames();
        boolean boolean69 = properties4.remove((java.lang.Object) atomikosProperties24, (java.lang.Object) properties40);
        java.util.Set<java.lang.Object> objSet70 = properties4.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals(obj19.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
// flaky:         org.junit.Assert.assertEquals(obj21.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str23, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10000L + "'", long28 == 10000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 500L + "'", long31 == 500L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{-1.0=100}" + "'", str33, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{-1.0=100}" + "'", str37, "{-1.0=100}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "tm.out" + "'", str38, "tm.out");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10000L + "'", long47 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(recovery51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 300000L + "'", long54 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 50 + "'", int61 == 50);
        org.junit.Assert.assertNotNull(recovery62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objSet70);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        int int9 = atomikosProperties0.getConsoleFileCount();
        long long10 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = false;
        java.lang.String str13 = atomikosProperties0.getLogBaseDir();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.defaultJtaTimeout = (byte) 10;
        java.lang.String str10 = atomikosProperties0.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery11 = atomikosProperties0.getRecovery();
        atomikosProperties0.setLogBaseName("{={-1.0=100}, -1.0=100}");
        atomikosProperties0.setAllowSubTransactions(true);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(recovery11);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        java.lang.String str5 = atomikosProperties0.getLogBaseDir();
        boolean boolean6 = atomikosProperties0.threadedTwoPhaseCommit;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties3.keys();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        boolean boolean21 = properties19.isEmpty();
        java.lang.Object obj24 = properties19.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties19.elements();
        java.lang.Object obj26 = properties2.replace((java.lang.Object) objEnumeration18, (java.lang.Object) properties19);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties19.elements();
        java.util.Enumeration<java.lang.Object> objEnumeration28 = properties19.keys();
        java.lang.Object obj29 = properties19.clone();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties31 = atomikosProperties30.asProperties();
        atomikosProperties30.service = "{-1.0=100}";
        long long34 = atomikosProperties30.getDefaultJtaTimeout();
        atomikosProperties30.setThreadedTwoPhaseCommit(true);
        boolean boolean37 = atomikosProperties30.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery38 = atomikosProperties30.recovery;
        atomikosProperties30.setLogBaseDir("");
        atomikosProperties30.setConsoleFileName("");
        atomikosProperties30.setTransactionManagerUniqueName("{100=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties45 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties45.setEnableLogging(true);
        atomikosProperties45.consoleFileCount = 0;
        atomikosProperties45.consoleFileCount = (byte) 0;
        atomikosProperties45.setDefaultJtaTimeout(0L);
        java.lang.Object obj54 = properties19.replace((java.lang.Object) atomikosProperties30, (java.lang.Object) 0L);
        boolean boolean55 = properties19.isEmpty();
        java.lang.Object obj58 = properties19.setProperty("{{-1.0=100}=}", "{WARN={}, 0={100=100}, {}={}}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNotNull(objEnumeration28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "{100=100}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "{100=100}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "{100=100}");
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10000L + "'", long34 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(recovery38);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        int int5 = atomikosProperties0.getMaxActives();
        java.lang.String str6 = atomikosProperties0.getLogBaseDir();
        java.lang.String str7 = atomikosProperties0.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.getRecovery();
        boolean boolean9 = atomikosProperties0.threadedTwoPhaseCommit;
        atomikosProperties0.enableLogging = false;
        atomikosProperties0.checkpointInterval = (byte) 10;
        java.lang.String str14 = atomikosProperties0.getOutputDir();
        atomikosProperties0.allowSubTransactions = false;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        java.lang.Object obj15 = properties0.clone();
        java.util.Collection<java.lang.Object> objCollection16 = properties0.values();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet17 = properties0.entrySet();
        java.lang.String str19 = properties0.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.util.Properties properties20 = new java.util.Properties(properties0);
        boolean boolean21 = properties20.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals(obj15.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertNotNull(objEntrySet17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.setService("tm.out");
        int int12 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.setDefaultJtaTimeout((long) 'a');
        boolean boolean15 = atomikosProperties0.enableLogging;
        atomikosProperties0.outputDir = "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}";
        atomikosProperties0.setMaxActives(5);
        atomikosProperties0.setLogBaseDir("{hi!={}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration5 = properties0.elements();
        java.util.Properties properties6 = new java.util.Properties(properties0);
        boolean boolean7 = properties0.isEmpty();
        java.util.Set<java.lang.Object> objSet8 = properties0.keySet();
        java.util.Properties properties9 = new java.util.Properties();
        java.lang.String str10 = properties9.toString();
        java.lang.Object obj12 = properties9.remove((java.lang.Object) (short) 100);
        java.lang.Object obj15 = properties9.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties17 = atomikosProperties16.asProperties();
        java.lang.Object obj18 = properties9.remove((java.lang.Object) properties17);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties20 = atomikosProperties19.asProperties();
        atomikosProperties19.service = "{-1.0=100}";
        long long23 = atomikosProperties19.getDefaultJtaTimeout();
        atomikosProperties19.setThreadedTwoPhaseCommit(true);
        boolean boolean26 = atomikosProperties19.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery27 = atomikosProperties19.recovery;
        atomikosProperties19.setLogBaseDir("");
        long long30 = atomikosProperties19.maxTimeout;
        boolean boolean31 = atomikosProperties19.forceShutdownOnVmExit;
        boolean boolean32 = properties17.containsValue((java.lang.Object) atomikosProperties19);
        int int33 = atomikosProperties19.getMaxActives();
        atomikosProperties19.threadedTwoPhaseCommit = false;
        boolean boolean36 = atomikosProperties19.serialJtaTransactions;
        boolean boolean37 = atomikosProperties19.isSerialJtaTransactions();
        java.lang.String str38 = atomikosProperties19.getTransactionManagerUniqueName();
        boolean boolean39 = properties0.containsKey((java.lang.Object) atomikosProperties19);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(objEnumeration5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10000L + "'", long23 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(recovery27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 300000L + "'", long30 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 50 + "'", int33 == 50);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj7 = properties0.clone();
        java.lang.String str9 = properties0.getProperty("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties11 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "{-1.0=100}";
        long long14 = atomikosProperties10.getDefaultJtaTimeout();
        atomikosProperties10.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties10.setMaxActives(100);
        boolean boolean19 = atomikosProperties10.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery20 = atomikosProperties10.recovery;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties22 = atomikosProperties21.asProperties();
        atomikosProperties21.service = "{-1.0=100}";
        long long25 = atomikosProperties21.getDefaultJtaTimeout();
        atomikosProperties21.setMaxActives(0);
        boolean boolean28 = atomikosProperties21.threadedTwoPhaseCommit;
        boolean boolean29 = atomikosProperties21.allowSubTransactions;
        atomikosProperties21.logBaseDir = "{}";
        atomikosProperties21.service = "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}";
        java.lang.Object obj34 = properties0.put((java.lang.Object) recovery20, (java.lang.Object) atomikosProperties21);
        atomikosProperties21.serialJtaTransactions = true;
        atomikosProperties21.logBaseName = "hi!";
        java.lang.String str39 = atomikosProperties21.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery40 = atomikosProperties21.getRecovery();
        boolean boolean41 = atomikosProperties21.isForceShutdownOnVmExit();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{1.0=-1}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(recovery20);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10000L + "'", long25 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(recovery40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties();
        java.lang.String str2 = properties1.toString();
        boolean boolean3 = properties1.isEmpty();
        java.util.Properties properties4 = new java.util.Properties();
        java.lang.String str5 = properties4.toString();
        java.lang.Object obj7 = properties4.remove((java.lang.Object) (short) 100);
        java.lang.Object obj10 = properties4.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean12 = properties4.containsKey((java.lang.Object) 0L);
        boolean boolean13 = properties1.containsValue((java.lang.Object) 0L);
        boolean boolean16 = properties0.replace((java.lang.Object) 0L, (java.lang.Object) 0.0f, (java.lang.Object) 10.0d);
        java.util.Enumeration<java.lang.Object> objEnumeration17 = properties0.elements();
        java.lang.String str18 = properties0.toString();
        int int19 = properties0.size();
        java.lang.Object obj22 = properties0.setProperty("{com.atomikos.icatch.={}, 100=100}", "{100=100}");
        java.io.PrintStream printStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.list(printStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objEnumeration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.consoleFileName = "hi!";
        int int9 = atomikosProperties0.getConsoleFileCount();
        boolean boolean10 = atomikosProperties0.allowSubTransactions;
        atomikosProperties0.consoleFileLimit = (short) 10;
        java.lang.String str13 = atomikosProperties0.outputDir;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.forceShutdownOnVmExit = false;
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet14 = properties13.entrySet();
        java.lang.Object obj16 = properties13.get((java.lang.Object) 10.0f);
        java.lang.Object obj17 = properties13.clone();
        int int18 = properties13.size();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(objEntrySet14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
// flaky:         org.junit.Assert.assertEquals(obj17.toString(), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties12 = new java.util.Properties(properties0);
        java.util.Properties properties14 = new java.util.Properties();
        java.lang.String str15 = properties14.toString();
        java.lang.Object obj17 = properties14.remove((java.lang.Object) (short) 100);
        java.lang.Object obj20 = properties14.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean22 = properties14.containsKey((java.lang.Object) 0L);
        java.lang.Object obj25 = properties14.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj28 = properties14.setProperty("", "{-1.0=100}");
        java.lang.String str29 = properties14.toString();
        java.util.Set<java.lang.String> strSet30 = properties14.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties32 = atomikosProperties31.asProperties();
        atomikosProperties31.service = "{-1.0=100}";
        long long35 = atomikosProperties31.getDefaultJtaTimeout();
        atomikosProperties31.enableLogging = false;
        atomikosProperties31.setMaxTimeout((long) (byte) 0);
        atomikosProperties31.setAllowSubTransactions(true);
        java.util.Properties properties42 = new java.util.Properties();
        java.lang.Object obj44 = properties42.remove((java.lang.Object) (-1.0d));
        boolean boolean45 = properties42.isEmpty();
        java.util.Collection<java.lang.Object> objCollection46 = properties42.values();
        java.lang.Object obj47 = properties14.put((java.lang.Object) true, (java.lang.Object) properties42);
        java.lang.Object obj48 = properties12.replace((java.lang.Object) 100.0d, (java.lang.Object) properties42);
        java.util.Enumeration<java.lang.Object> objEnumeration49 = properties12.elements();
        java.util.Properties properties50 = new java.util.Properties();
        java.lang.Object obj53 = properties50.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration54 = properties50.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration55 = properties50.elements();
        java.util.Properties properties56 = new java.util.Properties(properties50);
        java.lang.String str58 = properties50.getProperty("");
        java.util.Set<java.lang.String> strSet59 = properties50.stringPropertyNames();
        java.util.Set<java.lang.Object> objSet60 = properties50.keySet();
        java.util.Properties properties61 = new java.util.Properties();
        java.lang.String str62 = properties61.toString();
        java.lang.Object obj64 = properties61.remove((java.lang.Object) (short) 100);
        java.lang.Object obj67 = properties61.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean69 = properties61.containsKey((java.lang.Object) 0L);
        java.lang.Object obj72 = properties61.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj75 = properties61.setProperty("", "{-1.0=100}");
        boolean boolean76 = properties61.isEmpty();
        java.util.Properties properties77 = new java.util.Properties();
        java.lang.String str78 = properties77.toString();
        java.util.Properties properties79 = new java.util.Properties(properties77);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet80 = properties79.entrySet();
        java.util.Properties properties82 = new java.util.Properties();
        java.lang.Object obj84 = properties82.remove((java.lang.Object) (-1.0d));
        int int85 = properties82.size();
        boolean boolean86 = properties61.replace((java.lang.Object) properties79, (java.lang.Object) 100L, (java.lang.Object) properties82);
        boolean boolean87 = properties12.remove((java.lang.Object) properties50, (java.lang.Object) properties79);
        java.util.Properties properties88 = new java.util.Properties(properties79);
        java.util.Properties properties89 = new java.util.Properties();
        java.lang.Object obj91 = properties89.remove((java.lang.Object) (-1.0d));
        boolean boolean93 = properties89.contains((java.lang.Object) "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration94 = properties89.keys();
        java.lang.Object obj95 = null;
        boolean boolean96 = properties89.equals(obj95);
        boolean boolean97 = properties79.equals((java.lang.Object) properties89);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str29, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10000L + "'", long35 == 10000L);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objCollection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objEnumeration49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(objEnumeration54);
        org.junit.Assert.assertNotNull(objEnumeration55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(objSet60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "{}" + "'", str62, "{}");
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "{}" + "'", str78, "{}");
        org.junit.Assert.assertNotNull(objEntrySet80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(objEnumeration94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties12 = new java.util.Properties();
        java.lang.String str13 = properties12.toString();
        java.lang.Object obj15 = properties12.remove((java.lang.Object) (short) 100);
        java.lang.Object obj18 = properties12.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj19 = properties12.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration20 = properties12.elements();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties12);
        boolean boolean23 = properties0.equals((java.lang.Object) 1.0f);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties25 = atomikosProperties24.asProperties();
        atomikosProperties24.service = "{-1.0=100}";
        long long28 = atomikosProperties24.getDefaultJtaTimeout();
        long long29 = atomikosProperties24.getMaxTimeout();
        int int30 = atomikosProperties24.consoleFileCount;
        int int31 = atomikosProperties24.getMaxActives();
        boolean boolean32 = atomikosProperties24.forceShutdownOnVmExit;
        java.lang.String str33 = atomikosProperties24.getTransactionManagerUniqueName();
        boolean boolean34 = properties0.containsValue((java.lang.Object) atomikosProperties24);
        java.util.Collection<java.lang.Object> objCollection35 = properties0.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties36 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties37 = atomikosProperties36.asProperties();
        atomikosProperties36.service = "{-1.0=100}";
        long long40 = atomikosProperties36.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel41 = null;
        atomikosProperties36.setConsoleLogLevel(atomikosLoggingLevel41);
        int int43 = atomikosProperties36.maxActives;
        atomikosProperties36.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery46 = atomikosProperties36.getRecovery();
        atomikosProperties36.outputDir = "hi!";
        java.lang.String str49 = atomikosProperties36.getLogBaseName();
        atomikosProperties36.setService("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        boolean boolean52 = properties0.equals((java.lang.Object) atomikosProperties36);
        java.util.Properties properties53 = new java.util.Properties();
        java.lang.Object obj55 = properties53.remove((java.lang.Object) (-1.0d));
        boolean boolean56 = properties53.isEmpty();
        java.util.Collection<java.lang.Object> objCollection57 = properties53.values();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet58 = properties53.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties59 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties60 = atomikosProperties59.asProperties();
        atomikosProperties59.service = "{-1.0=100}";
        long long63 = atomikosProperties59.getDefaultJtaTimeout();
        long long64 = atomikosProperties59.getMaxTimeout();
        int int65 = atomikosProperties59.consoleFileCount;
        long long66 = atomikosProperties59.getCheckpointInterval();
        java.lang.String str67 = atomikosProperties59.outputDir;
        long long68 = atomikosProperties59.getCheckpointInterval();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel69 = atomikosProperties59.getConsoleLogLevel();
        java.lang.Object obj70 = properties53.remove((java.lang.Object) atomikosProperties59);
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties53);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet72 = properties0.entrySet();
        int int73 = properties0.size();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10000L + "'", long28 == 10000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 300000L + "'", long29 == 300000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objCollection35);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10000L + "'", long40 == 10000L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 50 + "'", int43 == 50);
        org.junit.Assert.assertNotNull(recovery46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "tmlog" + "'", str49, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objCollection57);
        org.junit.Assert.assertNotNull(objEntrySet58);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10000L + "'", long63 == 10000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 300000L + "'", long64 == 300000L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 500L + "'", long66 == 500L);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 500L + "'", long68 == 500L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel69 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel69.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(objEntrySet72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.lang.Object obj5 = properties0.setProperty("", "{={-1.0=100}, -1.0=100}");
        java.util.Enumeration<?> wildcardEnumeration6 = properties0.propertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties8 = atomikosProperties7.asProperties();
        atomikosProperties7.service = "{-1.0=100}";
        long long11 = atomikosProperties7.getDefaultJtaTimeout();
        atomikosProperties7.setThreadedTwoPhaseCommit(true);
        boolean boolean14 = atomikosProperties7.isAllowSubTransactions();
        boolean boolean15 = atomikosProperties7.isEnableLogging();
        atomikosProperties7.allowSubTransactions = false;
        boolean boolean18 = properties0.containsKey((java.lang.Object) atomikosProperties7);
        boolean boolean19 = atomikosProperties7.isForceShutdownOnVmExit();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardEnumeration6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.allowSubTransactions = true;
        atomikosProperties0.setDefaultJtaTimeout((long) (short) -1);
        int int7 = atomikosProperties0.maxActives;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.recovery;
        long long9 = recovery8.getForgetOrphanedLogEntriesDelay();
        recovery8.delay = 3;
        long long12 = recovery8.getRetryInterval();
        recovery8.forgetOrphanedLogEntriesDelay = 19L;
        int int15 = recovery8.maxRetries;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400000L + "'", long9 == 86400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10000L + "'", long12 == 10000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.threadedTwoPhaseCommit = true;
        boolean boolean4 = atomikosProperties0.allowSubTransactions;
        java.util.Properties properties5 = new java.util.Properties();
        java.lang.Object obj7 = properties5.remove((java.lang.Object) (-1.0d));
        boolean boolean8 = properties5.isEmpty();
        java.util.Collection<java.lang.Object> objCollection9 = properties5.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties11 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "{-1.0=100}";
        long long14 = atomikosProperties10.getDefaultJtaTimeout();
        atomikosProperties10.serialJtaTransactions = true;
        long long17 = atomikosProperties10.getDefaultJtaTimeout();
        long long18 = atomikosProperties10.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery19 = atomikosProperties10.getRecovery();
        long long20 = recovery19.delay;
        int int21 = recovery19.maxRetries;
        java.lang.Object obj22 = properties5.get((java.lang.Object) int21);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery23 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery23.retryInterval = (short) 100;
        recovery23.forgetOrphanedLogEntriesDelay = 'a';
        long long28 = recovery23.getDelay();
        int int29 = recovery23.maxRetries;
        int int30 = recovery23.maxRetries;
        recovery23.setDelay((long) (-1));
        long long33 = recovery23.forgetOrphanedLogEntriesDelay;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.lang.String str35 = atomikosProperties34.getOutputDir();
        atomikosProperties34.threadedTwoPhaseCommit = false;
        java.lang.Object obj38 = properties5.getOrDefault((java.lang.Object) recovery23, (java.lang.Object) atomikosProperties34);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel39 = atomikosProperties34.getConsoleLogLevel();
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel39;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10000L + "'", long17 == 10000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 500L + "'", long18 == 500L);
        org.junit.Assert.assertNotNull(recovery19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10000L + "'", long20 == 10000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10000L + "'", long28 == 10000L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 97L + "'", long33 == 97L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel39 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel39.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        int int5 = atomikosProperties0.getMaxActives();
        java.lang.String str6 = atomikosProperties0.getLogBaseDir();
        java.lang.String str7 = atomikosProperties0.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.getRecovery();
        long long9 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.allowSubTransactions = false;
        java.util.Properties properties12 = atomikosProperties0.asProperties();
        java.util.Set<java.lang.String> strSet13 = properties12.stringPropertyNames();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties12.list(printWriter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        atomikosProperties0.consoleFileLimit = 32;
        atomikosProperties0.setEnableLogging(true);
        java.lang.String str9 = atomikosProperties0.getLogBaseName();
        java.util.Properties properties10 = new java.util.Properties();
        java.lang.String str11 = properties10.toString();
        java.util.Properties properties12 = new java.util.Properties(properties10);
        java.util.Properties properties13 = new java.util.Properties();
        java.lang.String str14 = properties13.toString();
        java.lang.Object obj16 = properties13.remove((java.lang.Object) (short) 100);
        java.lang.Object obj19 = properties13.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean21 = properties13.containsKey((java.lang.Object) 0L);
        java.lang.Object obj24 = properties13.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj27 = properties13.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration28 = properties13.keys();
        java.util.Properties properties29 = new java.util.Properties();
        java.lang.String str30 = properties29.toString();
        boolean boolean31 = properties29.isEmpty();
        java.lang.Object obj34 = properties29.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration35 = properties29.elements();
        java.lang.Object obj36 = properties12.replace((java.lang.Object) objEnumeration28, (java.lang.Object) properties29);
        java.util.Enumeration<java.lang.Object> objEnumeration37 = properties29.elements();
        java.util.Properties properties38 = new java.util.Properties(properties29);
        java.util.Properties properties40 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration41 = properties40.propertyNames();
        java.lang.Object obj42 = properties40.clone();
        java.util.Collection<java.lang.Object> objCollection43 = properties40.values();
        java.util.Properties properties44 = new java.util.Properties();
        java.lang.String str45 = properties44.toString();
        java.lang.Object obj47 = properties44.remove((java.lang.Object) (short) 100);
        java.lang.Object obj50 = properties44.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj51 = properties44.clone();
        java.util.Set<java.lang.String> strSet52 = properties44.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery53 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery53.retryInterval = (short) 100;
        recovery53.delay = (-1L);
        long long58 = recovery53.delay;
        recovery53.delay = (short) 1;
        long long61 = recovery53.getRetryInterval();
        int int62 = recovery53.maxRetries;
        int int63 = recovery53.maxRetries;
        long long64 = recovery53.forgetOrphanedLogEntriesDelay;
        java.util.Properties properties65 = new java.util.Properties();
        java.lang.Object obj67 = properties65.remove((java.lang.Object) (-1.0d));
        boolean boolean68 = properties65.isEmpty();
        int int69 = properties65.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery70 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery70.retryInterval = (short) 100;
        recovery70.forgetOrphanedLogEntriesDelay = 'a';
        java.util.Properties properties75 = new java.util.Properties();
        java.lang.Object obj77 = properties75.remove((java.lang.Object) (-1.0d));
        boolean boolean78 = properties75.isEmpty();
        int int79 = properties75.size();
        java.lang.String str81 = properties75.getProperty("{}");
        boolean boolean82 = properties65.remove((java.lang.Object) recovery70, (java.lang.Object) properties75);
        java.lang.Object obj83 = properties44.putIfAbsent((java.lang.Object) long64, (java.lang.Object) properties65);
        properties40.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties65);
        atomikosProperties0.set(properties29, "", (java.lang.Object) properties40);
        java.util.Set<java.lang.Object> objSet86 = properties29.keySet();
        java.lang.String str87 = properties29.toString();
        java.util.Collection<java.lang.Object> objCollection88 = properties29.values();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{-1.0=100}" + "'", str9, "{-1.0=100}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{}" + "'", str14, "{}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objEnumeration28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objEnumeration35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objEnumeration37);
        org.junit.Assert.assertNotNull(wildcardEnumeration41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "{}");
        org.junit.Assert.assertNotNull(objCollection43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "{}" + "'", str45, "{}");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "{1.0=-1}");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 5 + "'", int62 == 5);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 86400000L + "'", long64 == 86400000L);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(objSet86);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "{com.atomikos.icatch.={}, 100=100}" + "'", str87, "{com.atomikos.icatch.={}, 100=100}");
        org.junit.Assert.assertNotNull(objCollection88);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        long long5 = atomikosProperties0.defaultJtaTimeout;
        long long6 = atomikosProperties0.getMaxTimeout();
        boolean boolean7 = atomikosProperties0.forceShutdownOnVmExit;
        java.lang.String str8 = atomikosProperties0.getLogBaseName();
        boolean boolean9 = atomikosProperties0.isEnableLogging();
        java.lang.String str10 = atomikosProperties0.getTransactionManagerUniqueName();
        int int11 = atomikosProperties0.getConsoleFileLimit();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tmlog" + "'", str8, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        atomikosProperties0.maxActives = (byte) 10;
        atomikosProperties0.serialJtaTransactions = false;
        atomikosProperties0.setCheckpointInterval((long) 5);
        long long15 = atomikosProperties0.defaultJtaTimeout;
        java.lang.String str16 = atomikosProperties0.getConsoleFileName();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tm.out" + "'", str16, "tm.out");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.delay = (-1L);
        long long5 = recovery0.delay;
        recovery0.delay = (short) 1;
        long long8 = recovery0.getRetryInterval();
        int int9 = recovery0.maxRetries;
        long long10 = recovery0.getForgetOrphanedLogEntriesDelay();
        long long11 = recovery0.delay;
        long long12 = recovery0.getRetryInterval();
        long long13 = recovery0.retryInterval;
        recovery0.maxRetries = (byte) -1;
        recovery0.setMaxRetries(5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery4 = atomikosProperties0.recovery;
        atomikosProperties0.enableLogging = true;
        int int7 = atomikosProperties0.getConsoleFileCount();
        boolean boolean8 = atomikosProperties0.isEnableLogging();
        int int9 = atomikosProperties0.getMaxActives();
        boolean boolean10 = atomikosProperties0.isThreadedTwoPhaseCommit();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(recovery4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        long long5 = recovery0.retryInterval;
        recovery0.forgetOrphanedLogEntriesDelay = 0L;
        long long8 = recovery0.getForgetOrphanedLogEntriesDelay();
        long long9 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.retryInterval = 0L;
        long long12 = recovery0.retryInterval;
        int int13 = recovery0.maxRetries;
        recovery0.maxRetries = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = '4';
        int int18 = recovery0.maxRetries;
        recovery0.maxRetries = 20;
        recovery0.forgetOrphanedLogEntriesDelay = 18L;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.enableLogging = true;
        java.lang.String str9 = atomikosProperties0.getService();
        atomikosProperties0.setTransactionManagerUniqueName("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileName = "{{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=, ={-1.0=100}, -1.0=100}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{-1.0=100}" + "'", str9, "{-1.0=100}");
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        atomikosProperties0.setAllowSubTransactions(true);
        int int10 = atomikosProperties0.getMaxActives();
        boolean boolean11 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.setOutputDir("");
        java.lang.String str14 = atomikosProperties0.getTransactionManagerUniqueName();
        java.lang.String str15 = atomikosProperties0.getLogBaseDir();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel16 = atomikosProperties0.consoleLogLevel;
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.setConsoleFileCount(50);
        atomikosProperties0.setConsoleFileLimit((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel16 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel16.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties();
        java.lang.String str2 = properties1.toString();
        java.lang.Object obj4 = properties1.remove((java.lang.Object) (short) 100);
        java.lang.Object obj7 = properties1.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        int int8 = properties1.size();
        java.util.Properties properties9 = new java.util.Properties();
        java.lang.Object obj11 = properties9.remove((java.lang.Object) (-1.0d));
        boolean boolean12 = properties9.isEmpty();
        java.lang.Object obj15 = properties9.setProperty("hi!", "{}");
        boolean boolean16 = properties0.remove((java.lang.Object) int8, (java.lang.Object) properties9);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties17.setAllowSubTransactions(true);
        atomikosProperties17.maxActives = (short) -1;
        atomikosProperties17.setService("tm.out");
        boolean boolean24 = properties9.containsValue((java.lang.Object) atomikosProperties17);
        java.util.Set<java.lang.Object> objSet25 = properties9.keySet();
        int int26 = properties9.size();
        java.util.Set<java.lang.String> strSet27 = properties9.stringPropertyNames();
        java.util.Enumeration<java.lang.Object> objEnumeration28 = properties9.elements();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(objEnumeration28);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setLogBaseDir("{-1.0=100}");
        atomikosProperties0.setEnableLogging(true);
        boolean boolean12 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setMaxTimeout(50L);
        atomikosProperties0.consoleFileLimit = (short) 0;
        atomikosProperties0.setService("{}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.recovery;
        boolean boolean9 = atomikosProperties0.threadedTwoPhaseCommit;
        atomikosProperties0.setOutputDir("tmlog");
        atomikosProperties0.threadedTwoPhaseCommit = false;
        long long14 = atomikosProperties0.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel15 = atomikosProperties0.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel16 = atomikosProperties0.getConsoleLogLevel();
        java.lang.String str17 = atomikosProperties0.getConsoleFileName();
        java.util.Properties properties18 = null;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties20.setMaxActives(100);
        java.lang.String str29 = atomikosProperties20.logBaseDir;
        atomikosProperties20.consoleFileCount = (short) 0;
        atomikosProperties20.defaultJtaTimeout = 10000L;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel34 = atomikosProperties20.consoleLogLevel;
        long long35 = atomikosProperties20.defaultJtaTimeout;
        atomikosProperties20.setConsoleFileCount(0);
        atomikosProperties20.enableLogging = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery40 = atomikosProperties20.recovery;
        recovery40.setMaxRetries((int) (short) 0);
        recovery40.maxRetries = (byte) 0;
        recovery40.setMaxRetries(5);
        // The following exception was thrown during execution in test generation
        try {
            atomikosProperties0.set(properties18, "{{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=hi!}", (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel15 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel15.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel16 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel16.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tm.out" + "'", str17, "tm.out");
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel34 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel34.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10000L + "'", long35 == 10000L);
        org.junit.Assert.assertNotNull(recovery40);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel7 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel7);
        boolean boolean9 = atomikosProperties0.enableLogging;
        int int10 = atomikosProperties0.getConsoleFileLimit();
        atomikosProperties0.serialJtaTransactions = false;
        atomikosProperties0.setLogBaseName("");
        atomikosProperties0.checkpointInterval = (byte) -1;
        long long17 = atomikosProperties0.defaultJtaTimeout;
        atomikosProperties0.setService("{1.0=-1}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.setMaxActives(0);
        boolean boolean27 = atomikosProperties20.threadedTwoPhaseCommit;
        boolean boolean28 = atomikosProperties20.allowSubTransactions;
        atomikosProperties20.logBaseDir = "{}";
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel31 = atomikosProperties20.getConsoleLogLevel();
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel31);
        boolean boolean33 = atomikosProperties0.allowSubTransactions;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10000L + "'", long17 == 10000L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel31 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel31.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.enableLogging = true;
        atomikosProperties0.outputDir = "tmlog";
        long long10 = atomikosProperties0.getMaxTimeout();
        boolean boolean11 = atomikosProperties0.allowSubTransactions;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties13 = atomikosProperties12.asProperties();
        atomikosProperties12.service = "{-1.0=100}";
        long long16 = atomikosProperties12.getDefaultJtaTimeout();
        atomikosProperties12.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties12.setMaxActives(100);
        boolean boolean21 = atomikosProperties12.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery22 = atomikosProperties12.recovery;
        atomikosProperties12.checkpointInterval = 300000L;
        int int25 = atomikosProperties12.consoleFileCount;
        atomikosProperties12.enableLogging = true;
        atomikosProperties12.setLogBaseName("hi!");
        atomikosProperties12.setLogBaseDir("hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties32 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties33 = atomikosProperties32.asProperties();
        atomikosProperties32.service = "{-1.0=100}";
        long long36 = atomikosProperties32.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel37 = null;
        atomikosProperties32.setConsoleLogLevel(atomikosLoggingLevel37);
        int int39 = atomikosProperties32.maxActives;
        atomikosProperties32.setLogBaseDir("{}");
        java.lang.String str42 = atomikosProperties32.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties44 = atomikosProperties43.asProperties();
        atomikosProperties43.service = "{-1.0=100}";
        long long47 = atomikosProperties43.getDefaultJtaTimeout();
        boolean boolean48 = atomikosProperties43.enableLogging;
        boolean boolean49 = atomikosProperties43.isForceShutdownOnVmExit();
        atomikosProperties43.consoleFileLimit = (byte) -1;
        java.lang.String str52 = atomikosProperties43.getService();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel53 = atomikosProperties43.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties54 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties55 = atomikosProperties54.asProperties();
        atomikosProperties54.service = "{-1.0=100}";
        long long58 = atomikosProperties54.getDefaultJtaTimeout();
        atomikosProperties54.serialJtaTransactions = true;
        long long61 = atomikosProperties54.maxTimeout;
        atomikosProperties54.setLogBaseDir("{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties64.setAllowSubTransactions(true);
        atomikosProperties64.maxActives = (short) -1;
        atomikosProperties64.setService("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties71 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties71.setAllowSubTransactions(true);
        boolean boolean74 = atomikosProperties71.enableLogging;
        boolean boolean75 = atomikosProperties71.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel76 = atomikosProperties71.consoleLogLevel;
        atomikosProperties64.setConsoleLogLevel(atomikosLoggingLevel76);
        atomikosProperties54.consoleLogLevel = atomikosLoggingLevel76;
        atomikosProperties43.consoleLogLevel = atomikosLoggingLevel76;
        atomikosProperties32.setConsoleLogLevel(atomikosLoggingLevel76);
        atomikosProperties12.setConsoleLogLevel(atomikosLoggingLevel76);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel76);
        atomikosProperties0.setConsoleFileCount(2);
        atomikosProperties0.logBaseDir = "{hi!={}}";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10000L + "'", long16 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(recovery22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10000L + "'", long36 == 10000L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 50 + "'", int39 == 50);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{}" + "'", str42, "{}");
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10000L + "'", long47 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{-1.0=100}" + "'", str52, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel53 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel53.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10000L + "'", long58 == 10000L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 300000L + "'", long61 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel76 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel76.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        int int6 = atomikosProperties0.consoleFileCount;
        int int7 = atomikosProperties0.getMaxActives();
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.transactionManagerUniqueName = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.allowSubTransactions = true;
        boolean boolean14 = atomikosProperties0.allowSubTransactions;
        atomikosProperties0.enableLogging = true;
        atomikosProperties0.setDefaultJtaTimeout((long) 5);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj15 = properties8.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties8.elements();
        java.lang.Object obj17 = properties0.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration16);
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.lang.Object obj20 = properties18.clone();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean23 = properties21.isEmpty();
        java.lang.Object obj26 = properties21.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties21.elements();
        java.lang.Object obj28 = properties0.put(obj20, (java.lang.Object) objEnumeration27);
        properties0.clear();
        java.util.Properties properties30 = new java.util.Properties();
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.remove((java.lang.Object) (-1.0d));
        int int34 = properties31.size();
        java.util.Enumeration<java.lang.Object> objEnumeration35 = properties31.elements();
        java.util.Properties properties36 = new java.util.Properties();
        properties36.clear();
        java.lang.String str38 = properties36.toString();
        boolean boolean39 = properties0.replace((java.lang.Object) properties30, (java.lang.Object) properties31, (java.lang.Object) str38);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet40 = properties31.entrySet();
        int int41 = properties31.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties43 = atomikosProperties42.asProperties();
        atomikosProperties42.service = "{-1.0=100}";
        long long46 = atomikosProperties42.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel47 = null;
        atomikosProperties42.setConsoleLogLevel(atomikosLoggingLevel47);
        int int49 = atomikosProperties42.maxActives;
        atomikosProperties42.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery52 = atomikosProperties42.getRecovery();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel53 = atomikosProperties42.consoleLogLevel;
        java.lang.String str54 = atomikosProperties42.consoleFileName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery55 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long56 = recovery55.getRetryInterval();
        long long57 = recovery55.getDelay();
        int int58 = recovery55.maxRetries;
        recovery55.setForgetOrphanedLogEntriesDelay(10L);
        long long61 = recovery55.getDelay();
        long long62 = recovery55.forgetOrphanedLogEntriesDelay;
        java.util.Properties properties63 = new java.util.Properties();
        java.util.Properties properties64 = new java.util.Properties();
        java.lang.String str65 = properties64.toString();
        java.lang.Object obj67 = properties64.remove((java.lang.Object) (short) 100);
        java.lang.Object obj70 = properties64.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        int int71 = properties64.size();
        java.util.Properties properties72 = new java.util.Properties();
        java.lang.Object obj74 = properties72.remove((java.lang.Object) (-1.0d));
        boolean boolean75 = properties72.isEmpty();
        java.lang.Object obj78 = properties72.setProperty("hi!", "{}");
        boolean boolean79 = properties63.remove((java.lang.Object) int71, (java.lang.Object) properties72);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties80 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties80.outputDir = "{={-1.0=100}, -1.0=100}";
        boolean boolean83 = properties63.contains((java.lang.Object) atomikosProperties80);
        boolean boolean84 = atomikosProperties80.serialJtaTransactions;
        boolean boolean85 = properties31.replace((java.lang.Object) str54, (java.lang.Object) long62, (java.lang.Object) atomikosProperties80);
        boolean boolean86 = properties31.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objEnumeration35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objEntrySet40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10000L + "'", long46 == 10000L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 50 + "'", int49 == 50);
        org.junit.Assert.assertNotNull(recovery52);
        org.junit.Assert.assertNull(atomikosLoggingLevel53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "tm.out" + "'", str54, "tm.out");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10000L + "'", long56 == 10000L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10000L + "'", long57 == 10000L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10000L + "'", long61 == 10000L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "{}" + "'", str65, "{}");
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.lang.String str1 = atomikosProperties0.getOutputDir();
        java.lang.String str2 = atomikosProperties0.outputDir;
        atomikosProperties0.setConsoleFileName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        atomikosProperties0.setDefaultJtaTimeout(18L);
        atomikosProperties0.setTransactionManagerUniqueName("{{-1.0=100}=}");
        java.lang.String str9 = atomikosProperties0.getConsoleFileName();
        long long10 = atomikosProperties0.getCheckpointInterval();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}" + "'", str9, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 500L + "'", long10 == 500L);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        java.lang.String str6 = atomikosProperties0.getLogBaseName();
        atomikosProperties0.setCheckpointInterval((long) 32);
        boolean boolean9 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setConsoleFileName("{={-1.0=100}, -1.0=100}");
        atomikosProperties0.setTransactionManagerUniqueName("{{1.0=-1}=hi!}");
        atomikosProperties0.setOutputDir("{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{-1.0=100}" + "'", str6, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.maxActives = (short) -1;
        atomikosProperties0.setService("tm.out");
        java.lang.String str7 = atomikosProperties0.getService();
        atomikosProperties0.defaultJtaTimeout = 50;
        atomikosProperties0.threadedTwoPhaseCommit = false;
        boolean boolean12 = atomikosProperties0.isForceShutdownOnVmExit();
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        java.util.Properties properties14 = new java.util.Properties();
        java.lang.String str15 = properties14.toString();
        java.util.Properties properties16 = new java.util.Properties(properties14);
        java.util.Properties properties17 = new java.util.Properties();
        java.lang.String str18 = properties17.toString();
        java.lang.Object obj20 = properties17.remove((java.lang.Object) (short) 100);
        java.lang.Object obj23 = properties17.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean25 = properties17.containsKey((java.lang.Object) 0L);
        java.lang.Object obj28 = properties17.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj31 = properties17.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration32 = properties17.keys();
        java.util.Properties properties33 = new java.util.Properties();
        java.lang.String str34 = properties33.toString();
        boolean boolean35 = properties33.isEmpty();
        java.lang.Object obj38 = properties33.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration39 = properties33.elements();
        java.lang.Object obj40 = properties16.replace((java.lang.Object) objEnumeration32, (java.lang.Object) properties33);
        java.util.Enumeration<java.lang.Object> objEnumeration41 = properties16.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties43 = atomikosProperties42.asProperties();
        atomikosProperties42.service = "{-1.0=100}";
        long long46 = atomikosProperties42.getDefaultJtaTimeout();
        atomikosProperties42.setTransactionManagerUniqueName("{}");
        java.lang.String str49 = atomikosProperties42.getService();
        boolean boolean50 = properties16.contains((java.lang.Object) str49);
        properties16.clear();
        java.util.Properties properties52 = new java.util.Properties();
        java.lang.String str53 = properties52.toString();
        java.util.Enumeration<java.lang.Object> objEnumeration54 = properties52.keys();
        boolean boolean55 = properties16.containsKey((java.lang.Object) properties52);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet56 = properties52.entrySet();
        java.lang.Object obj59 = properties52.setProperty("{com.atomikos.icatch.{}=5}", "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.util.Properties properties60 = new java.util.Properties();
        java.lang.String str61 = properties60.toString();
        boolean boolean63 = properties60.containsValue((java.lang.Object) (-1L));
        java.lang.Object obj65 = properties60.get((java.lang.Object) 97L);
        properties60.clear();
        java.lang.String str68 = properties60.getProperty("{1.0=-1}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery69 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery69.retryInterval = (short) 100;
        recovery69.setForgetOrphanedLogEntriesDelay((long) 5);
        recovery69.setForgetOrphanedLogEntriesDelay((long) (short) 0);
        boolean boolean76 = properties60.containsValue((java.lang.Object) recovery69);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery77 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery77.retryInterval = (byte) 0;
        int int80 = recovery77.maxRetries;
        recovery77.setForgetOrphanedLogEntriesDelay(86400000L);
        java.lang.Object obj83 = properties60.get((java.lang.Object) recovery77);
        recovery77.maxRetries = (short) -1;
        int int86 = recovery77.maxRetries;
        recovery77.setMaxRetries((int) '#');
        long long89 = recovery77.getRetryInterval();
        java.lang.Object obj90 = properties52.get((java.lang.Object) recovery77);
        recovery77.setForgetOrphanedLogEntriesDelay((long) (short) 0);
        boolean boolean93 = properties13.containsKey((java.lang.Object) recovery77);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tm.out" + "'", str7, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objEnumeration32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objEnumeration39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objEnumeration41);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10000L + "'", long46 == 10000L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{-1.0=100}" + "'", str49, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "{}" + "'", str53, "{}");
        org.junit.Assert.assertNotNull(objEnumeration54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objEntrySet56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "{}" + "'", str61, "{}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 5 + "'", int80 == 5);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.delay = (-1L);
        long long5 = recovery0.delay;
        int int6 = recovery0.getMaxRetries();
        long long7 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.setRetryInterval((long) 2);
        recovery0.setForgetOrphanedLogEntriesDelay((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setLogBaseDir("{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties10.setAllowSubTransactions(true);
        atomikosProperties10.maxActives = (short) -1;
        atomikosProperties10.setService("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties17.setAllowSubTransactions(true);
        boolean boolean20 = atomikosProperties17.enableLogging;
        boolean boolean21 = atomikosProperties17.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel22 = atomikosProperties17.consoleLogLevel;
        atomikosProperties10.setConsoleLogLevel(atomikosLoggingLevel22);
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel22;
        atomikosProperties0.setConsoleFileCount((int) (byte) 0);
        atomikosProperties0.setForceShutdownOnVmExit(true);
        atomikosProperties0.transactionManagerUniqueName = "{com.atomikos.icatch.{}=5}";
        java.lang.String str31 = atomikosProperties0.getLogBaseDir();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel22 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel22.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{-1.0=100}" + "'", str31, "{-1.0=100}");
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.service = "tm.out";
        atomikosProperties0.logBaseName = "tm.out";
        atomikosProperties0.setForceShutdownOnVmExit(false);
        boolean boolean13 = atomikosProperties0.serialJtaTransactions;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.threadedTwoPhaseCommit = true;
        atomikosProperties0.setSerialJtaTransactions(true);
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.logBaseDir = "{1.0=-1, -1.0=100}";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery14 = atomikosProperties0.getRecovery();
        recovery14.setForgetOrphanedLogEntriesDelay((long) '4');
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(recovery14);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.recovery;
        boolean boolean9 = atomikosProperties0.threadedTwoPhaseCommit;
        atomikosProperties0.setOutputDir("tmlog");
        boolean boolean12 = atomikosProperties0.isAllowSubTransactions();
        atomikosProperties0.logBaseName = "";
        long long15 = atomikosProperties0.checkpointInterval;
        java.lang.String str16 = atomikosProperties0.getConsoleFileName();
        boolean boolean17 = atomikosProperties0.threadedTwoPhaseCommit;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tm.out" + "'", str16, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        long long5 = atomikosProperties0.defaultJtaTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel6 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel6);
        java.lang.String str8 = atomikosProperties0.consoleFileName;
        java.lang.String str9 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.setConsoleFileName("tmlog");
        boolean boolean12 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.forceShutdownOnVmExit = false;
        atomikosProperties0.setForceShutdownOnVmExit(true);
        atomikosProperties0.setService("{com.atomikos.icatch.{}=5}");
        long long19 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setMaxActives((int) '4');
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tm.out" + "'", str8, "tm.out");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 500L + "'", long19 == 500L);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        java.lang.String str6 = atomikosProperties0.getOutputDir();
        int int7 = atomikosProperties0.getMaxActives();
        boolean boolean8 = atomikosProperties0.allowSubTransactions;
        int int9 = atomikosProperties0.consoleFileLimit;
        int int10 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.setCheckpointInterval((long) (byte) 0);
        atomikosProperties0.maxTimeout = (-1);
        java.lang.String str15 = atomikosProperties0.consoleFileName;
        int int16 = atomikosProperties0.consoleFileCount;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "tm.out" + "'", str15, "tm.out");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        int int6 = atomikosProperties0.getMaxActives();
        atomikosProperties0.setConsoleFileLimit(1);
        java.lang.String str9 = atomikosProperties0.transactionManagerUniqueName;
        boolean boolean10 = atomikosProperties0.enableLogging;
        atomikosProperties0.consoleFileName = "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.enableLogging = false;
        atomikosProperties0.setMaxTimeout((long) (byte) 0);
        atomikosProperties0.setService("tm.out");
        atomikosProperties0.setMaxActives((-1));
        atomikosProperties0.maxActives = 0;
        long long15 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.outputDir = "{com.atomikos.icatch.={}, 100=100}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        long long10 = recovery9.delay;
        int int11 = recovery9.maxRetries;
        recovery9.setMaxRetries((int) '#');
        long long14 = recovery9.forgetOrphanedLogEntriesDelay;
        long long15 = recovery9.getRetryInterval();
        int int16 = recovery9.maxRetries;
        recovery9.setRetryInterval((long) (short) 0);
        long long19 = recovery9.forgetOrphanedLogEntriesDelay;
        long long20 = recovery9.getDelay();
        recovery9.setDelay(2L);
        recovery9.setDelay(0L);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86400000L + "'", long14 == 86400000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 86400000L + "'", long19 == 86400000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10000L + "'", long20 == 10000L);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        java.lang.Object obj15 = properties0.clone();
        java.lang.Object obj18 = properties0.setProperty("hi!", "{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties20 = atomikosProperties19.asProperties();
        atomikosProperties19.service = "{-1.0=100}";
        long long23 = atomikosProperties19.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel24 = null;
        atomikosProperties19.setConsoleLogLevel(atomikosLoggingLevel24);
        int int26 = atomikosProperties19.maxActives;
        atomikosProperties19.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery29 = atomikosProperties19.getRecovery();
        long long30 = recovery29.forgetOrphanedLogEntriesDelay;
        recovery29.delay = (byte) 1;
        long long33 = recovery29.forgetOrphanedLogEntriesDelay;
        java.lang.Object obj34 = properties0.get((java.lang.Object) recovery29);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties35 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties36 = atomikosProperties35.asProperties();
        atomikosProperties35.service = "{-1.0=100}";
        long long39 = atomikosProperties35.getDefaultJtaTimeout();
        atomikosProperties35.serialJtaTransactions = true;
        atomikosProperties35.maxActives = ' ';
        int int44 = atomikosProperties35.maxActives;
        int int45 = atomikosProperties35.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery46 = atomikosProperties35.getRecovery();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel47 = atomikosProperties35.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties48 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties49 = atomikosProperties48.asProperties();
        atomikosProperties48.service = "{-1.0=100}";
        java.lang.String str52 = atomikosProperties48.getTransactionManagerUniqueName();
        boolean boolean53 = atomikosProperties48.isSerialJtaTransactions();
        boolean boolean54 = atomikosProperties48.isAllowSubTransactions();
        java.lang.Object obj55 = properties0.getOrDefault((java.lang.Object) atomikosLoggingLevel47, (java.lang.Object) boolean54);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals(obj15.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10000L + "'", long23 == 10000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
        org.junit.Assert.assertNotNull(recovery29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 86400000L + "'", long30 == 86400000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 86400000L + "'", long33 == 86400000L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10000L + "'", long39 == 10000L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(recovery46);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel47 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel47.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + true + "'", obj55, true);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        int int5 = atomikosProperties0.getConsoleFileCount();
        java.lang.String str6 = atomikosProperties0.service;
        java.lang.String str7 = atomikosProperties0.getTransactionManagerUniqueName();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.recovery;
        long long9 = recovery8.forgetOrphanedLogEntriesDelay;
        recovery8.delay = (-1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 86400000L + "'", long9 == 86400000L);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        long long5 = recovery0.retryInterval;
        recovery0.forgetOrphanedLogEntriesDelay = 0L;
        long long8 = recovery0.getForgetOrphanedLogEntriesDelay();
        long long9 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.retryInterval = 0L;
        long long12 = recovery0.retryInterval;
        int int13 = recovery0.getMaxRetries();
        long long14 = recovery0.delay;
        recovery0.retryInterval = 100L;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.remove((java.lang.Object) (-1.0d));
        boolean boolean3 = properties0.isEmpty();
        java.util.Properties properties4 = new java.util.Properties();
        java.lang.String str5 = properties4.toString();
        java.lang.Object obj7 = properties4.remove((java.lang.Object) (short) 100);
        java.lang.Object obj10 = properties4.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean12 = properties4.containsKey((java.lang.Object) 0L);
        java.lang.Object obj15 = properties4.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj18 = properties4.setProperty("", "{-1.0=100}");
        java.lang.Object obj19 = properties4.clone();
        java.lang.Object obj20 = properties0.get((java.lang.Object) properties4);
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        java.lang.Object obj24 = properties21.remove((java.lang.Object) (short) 100);
        java.lang.Object obj27 = properties21.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean29 = properties21.containsKey((java.lang.Object) 0L);
        java.lang.Object obj32 = properties21.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties33 = new java.util.Properties(properties21);
        java.util.Enumeration<java.lang.Object> objEnumeration34 = properties33.elements();
        java.util.Properties properties35 = new java.util.Properties();
        java.lang.Object obj38 = properties35.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration39 = properties35.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration40 = properties35.elements();
        java.util.Properties properties41 = new java.util.Properties(properties35);
        java.util.Set<java.lang.Object> objSet42 = properties35.keySet();
        java.util.Set<java.lang.String> strSet43 = properties35.stringPropertyNames();
        boolean boolean44 = properties33.contains((java.lang.Object) properties35);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery45 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery45.retryInterval = (short) 100;
        recovery45.forgetOrphanedLogEntriesDelay = 'a';
        long long50 = recovery45.retryInterval;
        recovery45.forgetOrphanedLogEntriesDelay = 0L;
        int int53 = recovery45.getMaxRetries();
        recovery45.maxRetries = 100;
        boolean boolean56 = properties4.remove((java.lang.Object) properties35, (java.lang.Object) recovery45);
        java.util.Properties properties57 = new java.util.Properties(properties4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals(obj19.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objEnumeration34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objEnumeration39);
        org.junit.Assert.assertNotNull(objEnumeration40);
        org.junit.Assert.assertNotNull(objSet42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties3 = atomikosProperties2.asProperties();
        atomikosProperties2.service = "{-1.0=100}";
        long long6 = atomikosProperties2.getDefaultJtaTimeout();
        atomikosProperties2.consoleFileLimit = '#';
        java.lang.Object obj9 = properties1.get((java.lang.Object) atomikosProperties2);
        boolean boolean10 = atomikosProperties2.forceShutdownOnVmExit;
        atomikosProperties2.setOutputDir("");
        long long13 = atomikosProperties2.defaultJtaTimeout;
        atomikosProperties2.setConsoleFileLimit((int) (short) -1);
        boolean boolean16 = atomikosProperties2.serialJtaTransactions;
        long long17 = atomikosProperties2.getDefaultJtaTimeout();
        boolean boolean18 = atomikosProperties2.isThreadedTwoPhaseCommit();
        atomikosProperties2.setSerialJtaTransactions(false);
        java.lang.String str21 = atomikosProperties2.getConsoleFileName();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10000L + "'", long13 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10000L + "'", long17 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "tm.out" + "'", str21, "tm.out");
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        java.util.Properties properties7 = new java.util.Properties();
        java.util.Properties properties8 = new java.util.Properties(properties7);
        java.util.Enumeration<java.lang.Object> objEnumeration9 = properties8.elements();
        java.util.Properties properties10 = new java.util.Properties();
        java.lang.String str11 = properties10.toString();
        java.lang.Object obj13 = properties10.remove((java.lang.Object) (short) 100);
        java.lang.Object obj16 = properties10.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean18 = properties10.containsKey((java.lang.Object) 0L);
        java.lang.Object obj21 = properties10.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj24 = properties10.setProperty("", "{-1.0=100}");
        boolean boolean25 = properties10.isEmpty();
        java.util.Properties properties26 = new java.util.Properties();
        java.lang.String str27 = properties26.toString();
        java.util.Properties properties28 = new java.util.Properties(properties26);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet29 = properties28.entrySet();
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.remove((java.lang.Object) (-1.0d));
        int int34 = properties31.size();
        boolean boolean35 = properties10.replace((java.lang.Object) properties28, (java.lang.Object) 100L, (java.lang.Object) properties31);
        boolean boolean36 = properties10.isEmpty();
        java.util.Set<java.lang.Object> objSet37 = properties10.keySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties38 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties39 = atomikosProperties38.asProperties();
        atomikosProperties38.service = "{-1.0=100}";
        long long42 = atomikosProperties38.getDefaultJtaTimeout();
        long long43 = atomikosProperties38.getMaxTimeout();
        int int44 = atomikosProperties38.consoleFileCount;
        java.lang.String str45 = atomikosProperties38.getOutputDir();
        boolean boolean46 = properties8.remove((java.lang.Object) properties10, (java.lang.Object) atomikosProperties38);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties48 = atomikosProperties47.asProperties();
        atomikosProperties47.service = "{-1.0=100}";
        long long51 = atomikosProperties47.getDefaultJtaTimeout();
        long long52 = atomikosProperties47.getMaxTimeout();
        int int53 = atomikosProperties47.consoleFileCount;
        atomikosProperties47.setConsoleFileCount(0);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel56 = atomikosProperties47.getConsoleLogLevel();
        boolean boolean57 = properties10.equals((java.lang.Object) atomikosLoggingLevel56);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel56);
        int int59 = atomikosProperties0.consoleFileLimit;
        java.util.Properties properties60 = new java.util.Properties();
        java.lang.String str61 = properties60.toString();
        java.util.Properties properties62 = new java.util.Properties(properties60);
        java.util.Set<java.lang.String> strSet63 = properties62.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties65 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties65.setEnableLogging(true);
        atomikosProperties65.consoleFileCount = 0;
        int int70 = atomikosProperties65.getMaxActives();
        java.lang.String str71 = atomikosProperties65.getLogBaseDir();
        java.lang.String str72 = atomikosProperties65.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery73 = atomikosProperties65.getRecovery();
        boolean boolean74 = atomikosProperties65.serialJtaTransactions;
        atomikosProperties65.setCheckpointInterval(10000L);
        boolean boolean77 = atomikosProperties65.threadedTwoPhaseCommit;
        atomikosProperties0.set(properties62, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}", (java.lang.Object) atomikosProperties65);
        atomikosProperties65.transactionManagerUniqueName = "{com.atomikos.icatch.tm.out=hi!}";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNotNull(objEnumeration9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
        org.junit.Assert.assertNotNull(objEntrySet29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objSet37);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10000L + "'", long42 == 10000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 300000L + "'", long43 == 300000L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10000L + "'", long51 == 10000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 300000L + "'", long52 == 300000L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel56 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel56.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "{}" + "'", str61, "{}");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 50 + "'", int70 == 50);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(recovery73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties7 = new java.util.Properties();
        java.lang.String str8 = properties7.toString();
        properties7.clear();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet10 = properties7.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties12 = atomikosProperties11.asProperties();
        atomikosProperties11.service = "{-1.0=100}";
        long long15 = atomikosProperties11.getDefaultJtaTimeout();
        atomikosProperties11.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties11.setMaxActives(100);
        java.lang.String str20 = atomikosProperties11.logBaseDir;
        atomikosProperties11.consoleFileCount = (short) 0;
        atomikosProperties11.defaultJtaTimeout = 10000L;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel25 = atomikosProperties11.consoleLogLevel;
        java.lang.Object obj26 = properties0.putIfAbsent((java.lang.Object) properties7, (java.lang.Object) atomikosLoggingLevel25);
        boolean boolean27 = properties0.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(objEntrySet10);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel25 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel25.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.service = "tm.out";
        atomikosProperties0.logBaseName = "tm.out";
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        boolean boolean15 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean16 = atomikosProperties0.enableLogging;
        java.lang.String str17 = atomikosProperties0.logBaseDir;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration1 = properties0.propertyNames();
        java.lang.Object obj4 = properties0.setProperty("{={-1.0=100}, -1.0=100}", "{={-1.0=100}, -1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long6 = recovery5.getRetryInterval();
        long long7 = recovery5.getDelay();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties9 = atomikosProperties8.asProperties();
        atomikosProperties8.service = "{-1.0=100}";
        java.lang.String str12 = atomikosProperties8.getTransactionManagerUniqueName();
        atomikosProperties8.consoleFileName = "hi!";
        atomikosProperties8.serialJtaTransactions = true;
        atomikosProperties8.outputDir = "tm.out";
        boolean boolean19 = atomikosProperties8.isAllowSubTransactions();
        atomikosProperties8.consoleFileName = "";
        atomikosProperties8.transactionManagerUniqueName = "";
        java.lang.Object obj24 = properties0.replace((java.lang.Object) long7, (java.lang.Object) atomikosProperties8);
        boolean boolean25 = properties0.isEmpty();
        properties0.clear();
        java.lang.Object obj29 = properties0.setProperty("{com.atomikos.icatch.={}, 100=100}", "{100=100}");
        java.lang.String str32 = properties0.getProperty("{{1.0=-1}=hi!}", "{com.atomikos.icatch.tm.out={}}");
        org.junit.Assert.assertNotNull(wildcardEnumeration1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{com.atomikos.icatch.tm.out={}}" + "'", str32, "{com.atomikos.icatch.tm.out={}}");
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.allowSubTransactions = true;
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.setCheckpointInterval((long) 'a');
        atomikosProperties0.forceShutdownOnVmExit = true;
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        int int9 = atomikosProperties0.getConsoleFileCount();
        long long10 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties12 = atomikosProperties11.asProperties();
        atomikosProperties11.service = "{-1.0=100}";
        java.lang.String str15 = atomikosProperties11.getTransactionManagerUniqueName();
        boolean boolean16 = atomikosProperties11.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel17 = atomikosProperties11.getConsoleLogLevel();
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel17);
        java.lang.String str19 = atomikosProperties0.getLogBaseDir();
        long long20 = atomikosProperties0.maxTimeout;
        long long21 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.consoleFileName = "hi!";
        int int24 = atomikosProperties0.getMaxActives();
        atomikosProperties0.setOutputDir("{WARN={}, 0={100=100}, {}={}}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel17 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel17.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 300000L + "'", long20 == 300000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 500L + "'", long21 == 500L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj15 = properties8.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties8.elements();
        java.lang.Object obj17 = properties0.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration16);
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.lang.Object obj20 = properties18.clone();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean23 = properties21.isEmpty();
        java.lang.Object obj26 = properties21.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties21.elements();
        java.lang.Object obj28 = properties0.put(obj20, (java.lang.Object) objEnumeration27);
        properties0.clear();
        java.util.Properties properties30 = new java.util.Properties();
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.remove((java.lang.Object) (-1.0d));
        int int34 = properties31.size();
        java.util.Enumeration<java.lang.Object> objEnumeration35 = properties31.elements();
        java.util.Properties properties36 = new java.util.Properties();
        properties36.clear();
        java.lang.String str38 = properties36.toString();
        boolean boolean39 = properties0.replace((java.lang.Object) properties30, (java.lang.Object) properties31, (java.lang.Object) str38);
        java.util.Set<java.lang.String> strSet40 = properties0.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties42 = atomikosProperties41.asProperties();
        atomikosProperties41.service = "{-1.0=100}";
        long long45 = atomikosProperties41.getDefaultJtaTimeout();
        atomikosProperties41.enableLogging = false;
        atomikosProperties41.setMaxTimeout((long) (byte) 0);
        atomikosProperties41.setAllowSubTransactions(true);
        java.util.Properties properties52 = new java.util.Properties();
        java.lang.Object obj54 = properties52.remove((java.lang.Object) (-1.0d));
        boolean boolean55 = properties52.isEmpty();
        java.util.Properties properties56 = new java.util.Properties();
        java.lang.String str57 = properties56.toString();
        java.lang.Object obj59 = properties56.remove((java.lang.Object) (short) 100);
        java.lang.Object obj62 = properties56.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean64 = properties56.containsKey((java.lang.Object) 0L);
        java.lang.Object obj67 = properties56.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj70 = properties56.setProperty("", "{-1.0=100}");
        java.lang.Object obj71 = properties56.clone();
        java.lang.Object obj72 = properties52.get((java.lang.Object) properties56);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery74 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery74.retryInterval = (short) 100;
        recovery74.forgetOrphanedLogEntriesDelay = 'a';
        long long79 = recovery74.getDelay();
        long long80 = recovery74.getRetryInterval();
        recovery74.forgetOrphanedLogEntriesDelay = 10000L;
        atomikosProperties41.set(properties56, "tmlog", (java.lang.Object) recovery74);
        java.lang.Object obj84 = properties0.get((java.lang.Object) properties56);
        java.io.InputStream inputStream85 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.load(inputStream85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objEnumeration35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10000L + "'", long45 == 10000L);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "{}" + "'", str57, "{}");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(obj71);
// flaky:         org.junit.Assert.assertEquals(obj71.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10000L + "'", long79 == 10000L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 100L + "'", long80 == 100L);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.recovery;
        boolean boolean9 = atomikosProperties0.threadedTwoPhaseCommit;
        atomikosProperties0.setOutputDir("tmlog");
        atomikosProperties0.threadedTwoPhaseCommit = false;
        long long14 = atomikosProperties0.maxTimeout;
        atomikosProperties0.serialJtaTransactions = true;
        java.lang.String str17 = atomikosProperties0.consoleFileName;
        atomikosProperties0.threadedTwoPhaseCommit = false;
        atomikosProperties0.threadedTwoPhaseCommit = false;
        boolean boolean22 = atomikosProperties0.isEnableLogging();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tm.out" + "'", str17, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties12.setEnableLogging(true);
        atomikosProperties12.setConsoleFileLimit((int) (short) 0);
        boolean boolean17 = properties0.contains((java.lang.Object) atomikosProperties12);
        atomikosProperties12.consoleFileName = "";
        boolean boolean20 = atomikosProperties12.serialJtaTransactions;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties22 = atomikosProperties21.asProperties();
        atomikosProperties21.service = "{-1.0=100}";
        long long25 = atomikosProperties21.getDefaultJtaTimeout();
        atomikosProperties21.setTransactionManagerUniqueName("{}");
        atomikosProperties21.consoleFileName = "hi!";
        int int30 = atomikosProperties21.getConsoleFileCount();
        boolean boolean31 = atomikosProperties21.isThreadedTwoPhaseCommit();
        atomikosProperties21.maxTimeout = 0;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean35 = atomikosProperties34.isSerialJtaTransactions();
        atomikosProperties34.logBaseName = "{-1.0=100}";
        int int38 = atomikosProperties34.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery39 = atomikosProperties34.getRecovery();
        atomikosProperties34.setConsoleFileCount((int) (byte) 100);
        atomikosProperties34.setAllowSubTransactions(true);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties44 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean45 = atomikosProperties44.isThreadedTwoPhaseCommit();
        long long46 = atomikosProperties44.getCheckpointInterval();
        atomikosProperties44.setCheckpointInterval((long) 5);
        java.util.Properties properties49 = new java.util.Properties();
        java.lang.String str50 = properties49.toString();
        java.lang.Object obj52 = properties49.remove((java.lang.Object) (short) 100);
        java.lang.Object obj55 = properties49.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean57 = properties49.containsKey((java.lang.Object) 0L);
        java.lang.String str58 = properties49.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties59 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties60 = atomikosProperties59.asProperties();
        atomikosProperties59.service = "{-1.0=100}";
        long long63 = atomikosProperties59.getDefaultJtaTimeout();
        atomikosProperties59.setMaxActives(0);
        atomikosProperties59.maxActives = 'a';
        boolean boolean68 = atomikosProperties59.isThreadedTwoPhaseCommit();
        boolean boolean69 = atomikosProperties59.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel70 = atomikosProperties59.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties71 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties72 = atomikosProperties71.asProperties();
        atomikosProperties71.service = "{-1.0=100}";
        long long75 = atomikosProperties71.getDefaultJtaTimeout();
        atomikosProperties71.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties71.setMaxActives(100);
        java.lang.String str80 = atomikosProperties71.logBaseDir;
        java.lang.String str81 = atomikosProperties71.outputDir;
        java.lang.Object obj82 = properties49.replace((java.lang.Object) atomikosLoggingLevel70, (java.lang.Object) atomikosProperties71);
        atomikosProperties44.consoleLogLevel = atomikosLoggingLevel70;
        atomikosProperties34.setConsoleLogLevel(atomikosLoggingLevel70);
        atomikosProperties21.consoleLogLevel = atomikosLoggingLevel70;
        atomikosProperties12.consoleLogLevel = atomikosLoggingLevel70;
        java.lang.String str87 = atomikosProperties12.consoleFileName;
        boolean boolean88 = atomikosProperties12.threadedTwoPhaseCommit;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10000L + "'", long25 == 10000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50 + "'", int38 == 50);
        org.junit.Assert.assertNotNull(recovery39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 500L + "'", long46 == 500L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "{}" + "'", str50, "{}");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "{-1.0=100}" + "'", str58, "{-1.0=100}");
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10000L + "'", long63 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel70 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel70.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10000L + "'", long75 == 10000L);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str81, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.enableLogging = true;
        atomikosProperties0.checkpointInterval = 300000L;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel13 = atomikosProperties0.getConsoleLogLevel();
        long long14 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setLogBaseName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.util.Properties properties17 = atomikosProperties0.asProperties();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel13 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel13.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        atomikosProperties0.setTransactionManagerUniqueName("{-1.0=100}");
        atomikosProperties0.consoleFileCount = 0;
        long long11 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.consoleFileLimit = 100;
        boolean boolean14 = atomikosProperties0.allowSubTransactions;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery15 = atomikosProperties0.getRecovery();
        boolean boolean16 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.setLogBaseDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={1.0=-1}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(recovery15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.setService("tm.out");
        int int12 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.consoleFileLimit = 18;
        atomikosProperties0.enableLogging = false;
        atomikosProperties0.setDefaultJtaTimeout((long) (-1));
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        java.lang.Object obj22 = properties19.remove((java.lang.Object) (short) 100);
        java.lang.Object obj25 = properties19.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean27 = properties19.containsKey((java.lang.Object) 0L);
        java.lang.Object obj30 = properties19.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.String str32 = properties31.toString();
        java.lang.Object obj34 = properties31.remove((java.lang.Object) (short) 100);
        java.lang.Object obj37 = properties31.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj38 = properties31.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration39 = properties31.elements();
        properties19.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties31);
        boolean boolean42 = properties19.equals((java.lang.Object) 1.0f);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean44 = atomikosProperties43.isThreadedTwoPhaseCommit();
        long long45 = atomikosProperties43.getCheckpointInterval();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties46 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean47 = atomikosProperties46.isSerialJtaTransactions();
        atomikosProperties46.logBaseName = "{-1.0=100}";
        int int50 = atomikosProperties46.maxActives;
        int int51 = atomikosProperties46.getConsoleFileCount();
        boolean boolean52 = properties19.remove((java.lang.Object) atomikosProperties43, (java.lang.Object) atomikosProperties46);
        java.lang.Object obj55 = properties19.setProperty("tm.out", "{{1.0=-1}=hi!}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties58 = atomikosProperties57.asProperties();
        atomikosProperties57.service = "{-1.0=100}";
        long long61 = atomikosProperties57.getDefaultJtaTimeout();
        atomikosProperties57.setTransactionManagerUniqueName("{}");
        atomikosProperties57.consoleFileName = "hi!";
        atomikosProperties57.transactionManagerUniqueName = "hi!";
        atomikosProperties57.setLogBaseName("{}");
        atomikosProperties0.set(properties19, "{}", (java.lang.Object) atomikosProperties57);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 500L + "'", long45 == 500L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 50 + "'", int50 == 50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10000L + "'", long61 == 10000L);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.String str9 = properties0.toString();
        int int10 = properties0.size();
        java.util.Properties properties11 = new java.util.Properties();
        java.lang.Object obj13 = properties11.remove((java.lang.Object) (-1.0d));
        boolean boolean14 = properties11.isEmpty();
        int int15 = properties11.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery16 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery16.retryInterval = (short) 100;
        recovery16.forgetOrphanedLogEntriesDelay = 'a';
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.remove((java.lang.Object) (-1.0d));
        boolean boolean24 = properties21.isEmpty();
        int int25 = properties21.size();
        java.lang.String str27 = properties21.getProperty("{}");
        boolean boolean28 = properties11.remove((java.lang.Object) recovery16, (java.lang.Object) properties21);
        java.lang.Object obj29 = properties11.clone();
        boolean boolean30 = properties0.containsValue(obj29);
        java.lang.String str32 = properties0.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.lang.String str33 = properties0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{-1.0=100}" + "'", str9, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{-1.0=100}" + "'", str33, "{-1.0=100}");
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.Object obj10 = properties8.remove((java.lang.Object) (-1.0d));
        java.util.Enumeration<?> wildcardEnumeration11 = properties8.propertyNames();
        java.util.Set<java.lang.Object> objSet12 = properties8.keySet();
        java.util.Set<java.lang.String> strSet13 = properties8.stringPropertyNames();
        java.util.Properties properties15 = new java.util.Properties();
        atomikosProperties0.set(properties8, "tm.out", (java.lang.Object) properties15);
        java.util.Set<java.lang.Object> objSet17 = properties15.keySet();
        java.lang.String str18 = properties15.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties20 = atomikosProperties19.asProperties();
        atomikosProperties19.service = "{-1.0=100}";
        java.lang.String str23 = atomikosProperties19.getTransactionManagerUniqueName();
        atomikosProperties19.consoleFileName = "hi!";
        atomikosProperties19.service = "tm.out";
        atomikosProperties19.logBaseName = "tm.out";
        atomikosProperties19.setThreadedTwoPhaseCommit(true);
        atomikosProperties19.setThreadedTwoPhaseCommit(false);
        boolean boolean34 = atomikosProperties19.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel35 = atomikosProperties19.getConsoleLogLevel();
        atomikosProperties19.setMaxActives(32);
        atomikosProperties19.setService("{{}={}}");
        boolean boolean40 = properties15.containsValue((java.lang.Object) "{{}={}}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardEnumeration11);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel35 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel35.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.consoleFileLimit = '#';
        int int7 = atomikosProperties0.getConsoleFileCount();
        atomikosProperties0.consoleFileLimit = 5;
        atomikosProperties0.setConsoleFileCount((int) (byte) -1);
        atomikosProperties0.setCheckpointInterval((long) (byte) 10);
        long long14 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setConsoleFileLimit((int) ' ');
        atomikosProperties0.setEnableLogging(false);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.getRetryInterval();
        recovery0.setRetryInterval(0L);
        recovery0.forgetOrphanedLogEntriesDelay = 18;
        recovery0.setForgetOrphanedLogEntriesDelay((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.getRetryInterval();
        long long2 = recovery0.getDelay();
        long long3 = recovery0.getDelay();
        recovery0.setForgetOrphanedLogEntriesDelay(10000L);
        recovery0.retryInterval = '4';
        recovery0.setMaxRetries(3);
        recovery0.retryInterval = 3;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10000L + "'", long3 == 10000L);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        boolean boolean3 = atomikosProperties0.enableLogging;
        atomikosProperties0.consoleFileLimit = (byte) 100;
        java.util.Properties properties6 = new java.util.Properties();
        java.lang.String str7 = properties6.toString();
        java.util.Properties properties8 = new java.util.Properties(properties6);
        java.util.Properties properties10 = new java.util.Properties();
        java.lang.String str11 = properties10.toString();
        java.lang.Object obj13 = properties10.remove((java.lang.Object) (short) 100);
        java.lang.Object obj16 = properties10.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean18 = properties10.containsKey((java.lang.Object) 0L);
        java.lang.Object obj21 = properties10.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties22 = new java.util.Properties(properties10);
        java.util.Enumeration<java.lang.Object> objEnumeration23 = properties22.elements();
        atomikosProperties0.set(properties8, "{={-1.0=100}, -1.0=100}", (java.lang.Object) properties22);
        int int25 = properties8.size();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet26 = properties8.entrySet();
        java.lang.String str27 = properties8.toString();
        int int28 = properties8.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties30 = atomikosProperties29.asProperties();
        atomikosProperties29.service = "{-1.0=100}";
        long long33 = atomikosProperties29.getDefaultJtaTimeout();
        atomikosProperties29.setThreadedTwoPhaseCommit(true);
        boolean boolean36 = atomikosProperties29.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery37 = atomikosProperties29.recovery;
        long long38 = recovery37.getForgetOrphanedLogEntriesDelay();
        long long39 = recovery37.forgetOrphanedLogEntriesDelay;
        int int40 = recovery37.getMaxRetries();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties42 = atomikosProperties41.asProperties();
        atomikosProperties41.service = "{-1.0=100}";
        long long45 = atomikosProperties41.getDefaultJtaTimeout();
        atomikosProperties41.serialJtaTransactions = true;
        atomikosProperties41.setDefaultJtaTimeout(500L);
        java.util.Properties properties50 = atomikosProperties41.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties51 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties52 = atomikosProperties51.asProperties();
        atomikosProperties51.service = "{-1.0=100}";
        long long55 = atomikosProperties51.getDefaultJtaTimeout();
        atomikosProperties51.serialJtaTransactions = true;
        long long58 = atomikosProperties51.maxTimeout;
        atomikosProperties51.setLogBaseDir("{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties61 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties61.setAllowSubTransactions(true);
        atomikosProperties61.maxActives = (short) -1;
        atomikosProperties61.setService("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties68 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties68.setAllowSubTransactions(true);
        boolean boolean71 = atomikosProperties68.enableLogging;
        boolean boolean72 = atomikosProperties68.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel73 = atomikosProperties68.consoleLogLevel;
        atomikosProperties61.setConsoleLogLevel(atomikosLoggingLevel73);
        atomikosProperties51.consoleLogLevel = atomikosLoggingLevel73;
        atomikosProperties51.setConsoleFileCount((int) (byte) 0);
        atomikosProperties51.setForceShutdownOnVmExit(true);
        boolean boolean80 = properties8.replace((java.lang.Object) recovery37, (java.lang.Object) atomikosProperties41, (java.lang.Object) true);
        recovery37.forgetOrphanedLogEntriesDelay = 18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objEnumeration23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objEntrySet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}" + "'", str27, "{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10000L + "'", long33 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(recovery37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 86400000L + "'", long38 == 86400000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 86400000L + "'", long39 == 86400000L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10000L + "'", long45 == 10000L);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10000L + "'", long55 == 10000L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 300000L + "'", long58 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel73 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel73.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        long long7 = atomikosProperties0.getCheckpointInterval();
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        java.lang.String str9 = atomikosProperties0.service;
        int int10 = atomikosProperties0.consoleFileCount;
        atomikosProperties0.defaultJtaTimeout = (-1L);
        java.lang.String str13 = atomikosProperties0.getLogBaseName();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{-1.0=100}" + "'", str9, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tmlog" + "'", str13, "tmlog");
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("{}", "{}");
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.keys();
        java.util.Enumeration<java.lang.Object> objEnumeration5 = properties0.elements();
        java.util.Properties properties6 = new java.util.Properties(properties0);
        java.util.Set<java.lang.Object> objSet7 = properties0.keySet();
        java.lang.String str9 = properties0.getProperty("tmlog");
        java.util.Properties properties10 = new java.util.Properties();
        java.util.Enumeration<java.lang.Object> objEnumeration11 = properties10.elements();
        boolean boolean12 = properties0.containsValue((java.lang.Object) objEnumeration11);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties14 = atomikosProperties13.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties16 = atomikosProperties15.asProperties();
        atomikosProperties15.service = "{-1.0=100}";
        long long19 = atomikosProperties15.getDefaultJtaTimeout();
        atomikosProperties15.consoleFileLimit = '#';
        java.lang.Object obj22 = properties14.get((java.lang.Object) atomikosProperties15);
        boolean boolean23 = atomikosProperties15.forceShutdownOnVmExit;
        atomikosProperties15.setOutputDir("");
        boolean boolean26 = atomikosProperties15.forceShutdownOnVmExit;
        atomikosProperties15.consoleFileCount = (byte) -1;
        java.lang.Object obj29 = properties0.get((java.lang.Object) atomikosProperties15);
        properties0.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(objEnumeration5);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(objEnumeration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10000L + "'", long19 == 10000L);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        java.util.Properties properties5 = atomikosProperties0.asProperties();
        java.util.Set<java.lang.Object> objSet6 = properties5.keySet();
        java.util.Set<java.lang.Object> objSet7 = properties5.keySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties9 = atomikosProperties8.asProperties();
        atomikosProperties8.service = "{-1.0=100}";
        java.lang.String str12 = atomikosProperties8.getTransactionManagerUniqueName();
        atomikosProperties8.consoleFileLimit = (byte) 10;
        long long15 = atomikosProperties8.getMaxTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel16 = null;
        atomikosProperties8.consoleLogLevel = atomikosLoggingLevel16;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery18 = atomikosProperties8.getRecovery();
        boolean boolean19 = properties5.contains((java.lang.Object) recovery18);
        recovery18.setDelay((long) (byte) 0);
        recovery18.delay = 52;
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(objSet6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
        org.junit.Assert.assertNotNull(recovery18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.setCheckpointInterval((long) 5);
        atomikosProperties0.setConsoleFileCount(0);
        boolean boolean11 = atomikosProperties0.isThreadedTwoPhaseCommit();
        atomikosProperties0.consoleFileLimit = 5;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties15 = atomikosProperties14.asProperties();
        atomikosProperties14.service = "{-1.0=100}";
        long long18 = atomikosProperties14.getDefaultJtaTimeout();
        atomikosProperties14.enableLogging = false;
        atomikosProperties14.setMaxTimeout((long) (byte) 0);
        atomikosProperties14.setAllowSubTransactions(true);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties26 = atomikosProperties25.asProperties();
        atomikosProperties25.service = "{-1.0=100}";
        java.lang.String str29 = atomikosProperties25.getTransactionManagerUniqueName();
        boolean boolean30 = atomikosProperties25.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel31 = atomikosProperties25.getConsoleLogLevel();
        atomikosProperties14.consoleLogLevel = atomikosLoggingLevel31;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel31;
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        java.util.Properties properties36 = atomikosProperties0.asProperties();
        java.lang.String str38 = properties36.getProperty("{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10000L + "'", long18 == 10000L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel31 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel31.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.service = "tm.out";
        java.lang.String str9 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setCheckpointInterval((long) ' ');
        atomikosProperties0.forceShutdownOnVmExit = true;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        long long11 = recovery10.forgetOrphanedLogEntriesDelay;
        long long12 = recovery10.delay;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 86400000L + "'", long11 == 86400000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10000L + "'", long12 == 10000L);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        long long5 = recovery0.retryInterval;
        recovery0.forgetOrphanedLogEntriesDelay = 0L;
        long long8 = recovery0.getForgetOrphanedLogEntriesDelay();
        long long9 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.retryInterval = 0L;
        long long12 = recovery0.retryInterval;
        int int13 = recovery0.maxRetries;
        recovery0.setMaxRetries((int) 'a');
        long long16 = recovery0.getRetryInterval();
        long long17 = recovery0.delay;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10000L + "'", long17 == 10000L);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        java.lang.Object obj15 = properties0.clone();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery16 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery16.retryInterval = (short) 100;
        recovery16.forgetOrphanedLogEntriesDelay = 'a';
        boolean boolean21 = properties0.equals((java.lang.Object) 'a');
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery22 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long23 = recovery22.getRetryInterval();
        long long24 = recovery22.getDelay();
        long long25 = recovery22.getDelay();
        recovery22.retryInterval = 100L;
        boolean boolean28 = properties0.contains((java.lang.Object) recovery22);
        java.lang.String str29 = properties0.toString();
        java.util.Set<java.lang.String> strSet30 = properties0.stringPropertyNames();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet31 = properties0.entrySet();
        java.lang.Object obj34 = properties0.setProperty("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}", "");
        java.lang.String str35 = properties0.toString();
        java.lang.String str37 = properties0.getProperty("{tmlog=hi!, com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals(obj15.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10000L + "'", long23 == 10000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10000L + "'", long25 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str29, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(objEntrySet31);
        org.junit.Assert.assertNull(obj34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=, ={-1.0=100}, -1.0=100}" + "'", str35, "{{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}=, ={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.defaultJtaTimeout = (byte) 10;
        atomikosProperties0.logBaseDir = "tm.out";
        int int12 = atomikosProperties0.maxActives;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        atomikosProperties0.setForceShutdownOnVmExit(false);
        int int7 = atomikosProperties0.getConsoleFileCount();
        boolean boolean8 = atomikosProperties0.isEnableLogging();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.setService("tm.out");
        int int12 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.setDefaultJtaTimeout((long) ' ');
        java.lang.String str15 = atomikosProperties0.getConsoleFileName();
        atomikosProperties0.setConsoleFileLimit(1);
        java.lang.String str18 = atomikosProperties0.service;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "tm.out" + "'", str15, "tm.out");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "tm.out" + "'", str18, "tm.out");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.getRetryInterval();
        long long2 = recovery0.getDelay();
        int int3 = recovery0.maxRetries;
        long long4 = recovery0.getRetryInterval();
        recovery0.setRetryInterval(500L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.defaultJtaTimeout = (byte) 10;
        atomikosProperties0.setLogBaseName("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        atomikosProperties0.setTransactionManagerUniqueName("{1.0=-1, -1.0=100}");
        boolean boolean14 = atomikosProperties0.serialJtaTransactions;
        int int15 = atomikosProperties0.getMaxActives();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        long long7 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setConsoleFileCount((int) (byte) 1);
        boolean boolean10 = atomikosProperties0.threadedTwoPhaseCommit;
        atomikosProperties0.setAllowSubTransactions(false);
        atomikosProperties0.allowSubTransactions = false;
        atomikosProperties0.setCheckpointInterval((long) 5);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setMaxActives(100);
        java.lang.String str9 = atomikosProperties0.logBaseDir;
        java.lang.String str10 = atomikosProperties0.getConsoleFileName();
        boolean boolean11 = atomikosProperties0.isForceShutdownOnVmExit();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tm.out" + "'", str10, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        atomikosProperties0.setForceShutdownOnVmExit(false);
        int int7 = atomikosProperties0.getConsoleFileCount();
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties16 = atomikosProperties15.asProperties();
        java.lang.Object obj17 = properties8.remove((java.lang.Object) properties16);
        java.util.Properties properties18 = new java.util.Properties(properties16);
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.util.Properties properties21 = new java.util.Properties();
        java.util.Properties properties22 = new java.util.Properties();
        java.lang.String str23 = properties22.toString();
        boolean boolean24 = properties22.isEmpty();
        java.util.Properties properties25 = new java.util.Properties();
        java.lang.String str26 = properties25.toString();
        java.lang.Object obj28 = properties25.remove((java.lang.Object) (short) 100);
        java.lang.Object obj31 = properties25.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean33 = properties25.containsKey((java.lang.Object) 0L);
        boolean boolean34 = properties22.containsValue((java.lang.Object) 0L);
        boolean boolean37 = properties21.replace((java.lang.Object) 0L, (java.lang.Object) 0.0f, (java.lang.Object) 10.0d);
        java.util.Enumeration<java.lang.Object> objEnumeration38 = properties21.elements();
        java.lang.String str39 = properties21.toString();
        atomikosProperties0.set(properties18, "{100=100}", (java.lang.Object) properties21);
        atomikosProperties0.allowSubTransactions = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties44 = atomikosProperties43.asProperties();
        atomikosProperties43.service = "{-1.0=100}";
        java.lang.String str47 = atomikosProperties43.getTransactionManagerUniqueName();
        atomikosProperties43.consoleFileName = "hi!";
        atomikosProperties43.setCheckpointInterval((long) 5);
        atomikosProperties43.setConsoleFileCount(0);
        boolean boolean54 = atomikosProperties43.isThreadedTwoPhaseCommit();
        int int55 = atomikosProperties43.maxActives;
        atomikosProperties43.setConsoleFileName("{={-1.0=100}, -1.0=100}");
        atomikosProperties43.setConsoleFileCount(50);
        java.lang.String str60 = atomikosProperties43.getTransactionManagerUniqueName();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel61 = atomikosProperties43.getConsoleLogLevel();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery62 = atomikosProperties43.getRecovery();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel63 = atomikosProperties43.consoleLogLevel;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel63);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objEnumeration38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{}" + "'", str39, "{}");
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 50 + "'", int55 == 50);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel61 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel61.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(recovery62);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel63 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel63.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        int int9 = atomikosProperties0.getConsoleFileCount();
        int int10 = atomikosProperties0.consoleFileLimit;
        java.util.Properties properties11 = atomikosProperties0.asProperties();
        boolean boolean12 = properties11.isEmpty();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties11.list(printWriter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel7 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel7);
        atomikosProperties0.setLogBaseName("{={-1.0=100}, -1.0=100}");
        java.lang.String str11 = atomikosProperties0.outputDir;
        atomikosProperties0.setMaxActives(21);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.checkpointInterval = 86400000L;
        java.lang.String str4 = atomikosProperties0.logBaseDir;
        boolean boolean5 = atomikosProperties0.isEnableLogging();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.setCheckpointInterval((long) 5);
        atomikosProperties0.setConsoleFileCount(0);
        atomikosProperties0.setService("{-1.0=100}");
        atomikosProperties0.setDefaultJtaTimeout((long) 100);
        atomikosProperties0.setLogBaseDir("tmlog");
        atomikosProperties0.setAllowSubTransactions(false);
        atomikosProperties0.setLogBaseDir("{{-1.0=100}=}");
        long long21 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.transactionManagerUniqueName = "{}";
        atomikosProperties0.setConsoleFileLimit((int) '4');
        boolean boolean26 = atomikosProperties0.isEnableLogging();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5L + "'", long21 == 5L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        int int5 = atomikosProperties0.getMaxActives();
        java.lang.String str6 = atomikosProperties0.getLogBaseDir();
        java.lang.String str7 = atomikosProperties0.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery8 = atomikosProperties0.getRecovery();
        long long9 = atomikosProperties0.getDefaultJtaTimeout();
        int int10 = atomikosProperties0.getMaxActives();
        atomikosProperties0.consoleFileLimit = 50;
        boolean boolean13 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.maxActives = (short) 10;
        java.lang.String str16 = atomikosProperties0.getLogBaseName();
        atomikosProperties0.forceShutdownOnVmExit = true;
        atomikosProperties0.setOutputDir("{hi!={{={-1.0=100}, -1.0=100}=}}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(recovery8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tmlog" + "'", str16, "tmlog");
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel7 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel7);
        atomikosProperties0.setLogBaseName("{={-1.0=100}, -1.0=100}");
        atomikosProperties0.setConsoleFileLimit((-1));
        java.lang.String str13 = atomikosProperties0.logBaseDir;
        atomikosProperties0.enableLogging = true;
        atomikosProperties0.setConsoleFileLimit((int) '#');
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.consoleFileName = "hi!";
        java.lang.String str9 = atomikosProperties0.getConsoleFileName();
        atomikosProperties0.setAllowSubTransactions(false);
        atomikosProperties0.consoleFileName = "{{}={}}";
        atomikosProperties0.setDefaultJtaTimeout(32L);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties3 = atomikosProperties2.asProperties();
        atomikosProperties2.service = "{-1.0=100}";
        long long6 = atomikosProperties2.getDefaultJtaTimeout();
        atomikosProperties2.consoleFileLimit = '#';
        java.lang.Object obj9 = properties1.get((java.lang.Object) atomikosProperties2);
        boolean boolean10 = atomikosProperties2.forceShutdownOnVmExit;
        atomikosProperties2.setOutputDir("");
        atomikosProperties2.setThreadedTwoPhaseCommit(false);
        boolean boolean15 = atomikosProperties2.isEnableLogging();
        java.util.Properties properties16 = new java.util.Properties();
        java.lang.String str17 = properties16.toString();
        java.lang.Object obj19 = properties16.remove((java.lang.Object) (short) 100);
        boolean boolean21 = properties16.containsKey((java.lang.Object) 0L);
        properties16.clear();
        java.util.Set<java.lang.Object> objSet23 = properties16.keySet();
        java.util.Enumeration<java.lang.Object> objEnumeration24 = properties16.elements();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties27 = atomikosProperties26.asProperties();
        atomikosProperties26.service = "{-1.0=100}";
        long long30 = atomikosProperties26.getDefaultJtaTimeout();
        atomikosProperties26.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties26.setMaxActives(100);
        boolean boolean35 = atomikosProperties26.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery36 = atomikosProperties26.recovery;
        atomikosProperties26.checkpointInterval = 300000L;
        int int39 = atomikosProperties26.consoleFileCount;
        atomikosProperties26.enableLogging = true;
        atomikosProperties26.setLogBaseName("hi!");
        atomikosProperties26.setLogBaseDir("hi!");
        atomikosProperties2.set(properties16, "tm.out", (java.lang.Object) "hi!");
        java.lang.String str47 = properties16.toString();
        java.lang.Object obj48 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = properties16.containsValue(obj48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertNotNull(objEnumeration24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10000L + "'", long30 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(recovery36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{com.atomikos.icatch.tm.out=hi!}" + "'", str47, "{com.atomikos.icatch.tm.out=hi!}");
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.service = "{com.atomikos.icatch.tm.out=hi!}";
        atomikosProperties0.setOutputDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        int int6 = atomikosProperties0.getMaxActives();
        atomikosProperties0.setConsoleFileLimit(1);
        java.lang.String str9 = atomikosProperties0.transactionManagerUniqueName;
        atomikosProperties0.setCheckpointInterval(1L);
        boolean boolean12 = atomikosProperties0.enableLogging;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel7 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel7);
        atomikosProperties0.setLogBaseName("{={-1.0=100}, -1.0=100}");
        atomikosProperties0.setConsoleFileLimit(0);
        java.lang.String str13 = atomikosProperties0.consoleFileName;
        java.lang.String str14 = atomikosProperties0.getConsoleFileName();
        atomikosProperties0.setMaxTimeout(100L);
        atomikosProperties0.setLogBaseDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=32, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tm.out" + "'", str13, "tm.out");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tm.out" + "'", str14, "tm.out");
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        java.lang.Object obj15 = properties0.clone();
        java.util.Collection<java.lang.Object> objCollection16 = properties0.values();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet17 = properties0.entrySet();
        java.lang.String str19 = properties0.getProperty("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet20 = properties0.entrySet();
        java.lang.String str22 = properties0.getProperty("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}");
        java.lang.String str24 = properties0.getProperty("tm.out");
        java.util.Properties properties25 = new java.util.Properties(properties0);
        properties25.clear();
        java.util.Collection<java.lang.Object> objCollection27 = properties25.values();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals(obj15.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertNotNull(objEntrySet17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(objEntrySet20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(objCollection27);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        java.lang.String str15 = properties0.toString();
        java.util.Properties properties16 = new java.util.Properties();
        java.lang.String str17 = properties16.toString();
        java.lang.Object obj19 = properties16.remove((java.lang.Object) (short) 100);
        java.lang.Object obj22 = properties16.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean24 = properties16.containsKey((java.lang.Object) 0L);
        java.lang.Object obj27 = properties16.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties28 = new java.util.Properties(properties16);
        java.util.Enumeration<java.lang.Object> objEnumeration29 = properties16.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean31 = atomikosProperties30.isSerialJtaTransactions();
        atomikosProperties30.logBaseName = "{-1.0=100}";
        int int34 = atomikosProperties30.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery35 = atomikosProperties30.getRecovery();
        atomikosProperties30.setConsoleFileCount((int) (byte) 100);
        java.lang.String str38 = atomikosProperties30.logBaseName;
        atomikosProperties30.setCheckpointInterval((long) 18);
        long long41 = atomikosProperties30.defaultJtaTimeout;
        java.util.Properties properties42 = atomikosProperties30.asProperties();
        atomikosProperties30.setAllowSubTransactions(false);
        java.util.Properties properties45 = new java.util.Properties();
        java.lang.String str46 = properties45.toString();
        java.util.Properties properties47 = new java.util.Properties(properties45);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet48 = properties47.entrySet();
        boolean boolean49 = properties0.replace((java.lang.Object) objEnumeration29, (java.lang.Object) atomikosProperties30, (java.lang.Object) objEntrySet48);
        boolean boolean50 = atomikosProperties30.allowSubTransactions;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str15, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objEnumeration29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 50 + "'", int34 == 50);
        org.junit.Assert.assertNotNull(recovery35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{-1.0=100}" + "'", str38, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10000L + "'", long41 == 10000L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "{}" + "'", str46, "{}");
        org.junit.Assert.assertNotNull(objEntrySet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj15 = properties8.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties8.elements();
        java.lang.Object obj17 = properties0.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration16);
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.lang.Object obj20 = properties18.clone();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean23 = properties21.isEmpty();
        java.lang.Object obj26 = properties21.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties21.elements();
        java.lang.Object obj28 = properties0.put(obj20, (java.lang.Object) objEnumeration27);
        properties0.clear();
        java.util.Properties properties30 = new java.util.Properties();
        java.lang.Object obj32 = properties30.remove((java.lang.Object) (-1.0d));
        boolean boolean33 = properties30.isEmpty();
        int int34 = properties30.size();
        java.lang.String str36 = properties30.getProperty("{}");
        java.util.Properties properties37 = new java.util.Properties();
        java.lang.String str38 = properties37.toString();
        java.lang.Object obj40 = properties37.remove((java.lang.Object) (short) 100);
        java.lang.Object obj43 = properties37.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean45 = properties37.containsKey((java.lang.Object) 0L);
        java.lang.Object obj48 = properties37.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties49 = new java.util.Properties(properties37);
        java.util.Enumeration<java.lang.Object> objEnumeration50 = properties37.keys();
        java.lang.Object obj51 = properties0.replace((java.lang.Object) properties30, (java.lang.Object) properties37);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties52 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties53 = atomikosProperties52.asProperties();
        atomikosProperties52.service = "{-1.0=100}";
        long long56 = atomikosProperties52.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel57 = null;
        atomikosProperties52.setConsoleLogLevel(atomikosLoggingLevel57);
        int int59 = atomikosProperties52.maxActives;
        atomikosProperties52.setLogBaseDir("{}");
        java.lang.String str62 = atomikosProperties52.logBaseDir;
        atomikosProperties52.logBaseDir = "hi!";
        java.lang.String str65 = atomikosProperties52.getConsoleFileName();
        atomikosProperties52.setEnableLogging(false);
        boolean boolean68 = properties0.equals((java.lang.Object) atomikosProperties52);
        java.util.Collection<java.lang.Object> objCollection69 = properties0.values();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objEnumeration50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10000L + "'", long56 == 10000L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 50 + "'", int59 == 50);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "{}" + "'", str62, "{}");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "tm.out" + "'", str65, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objCollection69);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.delay = (-1L);
        long long5 = recovery0.delay;
        recovery0.delay = (short) 1;
        long long8 = recovery0.getRetryInterval();
        int int9 = recovery0.maxRetries;
        long long10 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.setRetryInterval((long) 10);
        recovery0.delay = '4';
        long long15 = recovery0.retryInterval;
        int int16 = recovery0.getMaxRetries();
        recovery0.retryInterval = (byte) -1;
        recovery0.delay = 0L;
        long long21 = recovery0.delay;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.retryInterval = (short) 100;
        recovery0.forgetOrphanedLogEntriesDelay = 'a';
        long long5 = recovery0.retryInterval;
        recovery0.forgetOrphanedLogEntriesDelay = 0L;
        long long8 = recovery0.getForgetOrphanedLogEntriesDelay();
        long long9 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.retryInterval = 0L;
        long long12 = recovery0.retryInterval;
        int int13 = recovery0.getMaxRetries();
        recovery0.setMaxRetries((int) (byte) 100);
        long long16 = recovery0.forgetOrphanedLogEntriesDelay;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean7 = atomikosProperties0.isAllowSubTransactions();
        boolean boolean8 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.allowSubTransactions = false;
        atomikosProperties0.threadedTwoPhaseCommit = true;
        java.lang.String str13 = atomikosProperties0.getLogBaseDir();
        java.util.Properties properties14 = new java.util.Properties();
        java.lang.String str15 = properties14.toString();
        java.lang.Object obj17 = properties14.remove((java.lang.Object) (short) 100);
        java.util.Properties properties18 = new java.util.Properties();
        java.lang.String str19 = properties18.toString();
        boolean boolean20 = properties18.isEmpty();
        java.lang.Object obj23 = properties18.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration24 = properties18.elements();
        boolean boolean25 = properties14.containsKey((java.lang.Object) properties18);
        java.util.Enumeration<?> wildcardEnumeration26 = properties14.propertyNames();
        java.util.Properties properties27 = new java.util.Properties(properties14);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties29 = atomikosProperties28.asProperties();
        atomikosProperties28.service = "{-1.0=100}";
        long long32 = atomikosProperties28.getDefaultJtaTimeout();
        boolean boolean33 = atomikosProperties28.enableLogging;
        boolean boolean34 = atomikosProperties28.isForceShutdownOnVmExit();
        atomikosProperties28.consoleFileLimit = (byte) -1;
        java.lang.String str37 = atomikosProperties28.getService();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel38 = atomikosProperties28.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties40 = atomikosProperties39.asProperties();
        atomikosProperties39.service = "{-1.0=100}";
        long long43 = atomikosProperties39.getDefaultJtaTimeout();
        atomikosProperties39.serialJtaTransactions = true;
        long long46 = atomikosProperties39.maxTimeout;
        atomikosProperties39.setLogBaseDir("{-1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties49 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties49.setAllowSubTransactions(true);
        atomikosProperties49.maxActives = (short) -1;
        atomikosProperties49.setService("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties56.setAllowSubTransactions(true);
        boolean boolean59 = atomikosProperties56.enableLogging;
        boolean boolean60 = atomikosProperties56.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel61 = atomikosProperties56.consoleLogLevel;
        atomikosProperties49.setConsoleLogLevel(atomikosLoggingLevel61);
        atomikosProperties39.consoleLogLevel = atomikosLoggingLevel61;
        atomikosProperties28.consoleLogLevel = atomikosLoggingLevel61;
        boolean boolean65 = properties27.containsValue((java.lang.Object) atomikosLoggingLevel61);
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel61;
        atomikosProperties0.consoleFileLimit = (byte) 1;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{}" + "'", str19, "{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objEnumeration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardEnumeration26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10000L + "'", long32 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{-1.0=100}" + "'", str37, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel38 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel38.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10000L + "'", long43 == 10000L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 300000L + "'", long46 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel61 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel61.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.setService("tm.out");
        int int12 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.setDefaultJtaTimeout((long) 'a');
        boolean boolean15 = atomikosProperties0.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel16 = atomikosProperties0.consoleLogLevel;
        atomikosProperties0.setForceShutdownOnVmExit(false);
        long long19 = atomikosProperties0.getMaxTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel16 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel16.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 300000L + "'", long19 == 300000L);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setMaxActives(100);
        java.lang.String str9 = atomikosProperties0.logBaseDir;
        atomikosProperties0.consoleFileCount = (short) 0;
        atomikosProperties0.defaultJtaTimeout = 10000L;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel14 = atomikosProperties0.consoleLogLevel;
        atomikosProperties0.setConsoleFileLimit((int) ' ');
        atomikosProperties0.setService("");
        atomikosProperties0.setConsoleFileName("{com.atomikos.icatch.tm.out={}}");
        int int21 = atomikosProperties0.consoleFileCount;
        java.lang.String str22 = atomikosProperties0.consoleFileName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel14 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel14.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{com.atomikos.icatch.tm.out={}}" + "'", str22, "{com.atomikos.icatch.tm.out={}}");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.logBaseName = "{={-1.0=100}, -1.0=100}";
        int int5 = atomikosProperties0.getConsoleFileLimit();
        java.lang.String str6 = atomikosProperties0.getLogBaseDir();
        java.lang.String str7 = atomikosProperties0.getLogBaseDir();
        int int8 = atomikosProperties0.getMaxActives();
        java.lang.String str9 = atomikosProperties0.consoleFileName;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tm.out" + "'", str9, "tm.out");
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        java.lang.String str15 = properties0.toString();
        java.util.Set<java.lang.String> strSet16 = properties0.stringPropertyNames();
        java.util.Properties properties17 = new java.util.Properties(properties0);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties19 = atomikosProperties18.asProperties();
        atomikosProperties18.service = "{-1.0=100}";
        long long22 = atomikosProperties18.getDefaultJtaTimeout();
        atomikosProperties18.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties18.logBaseName = "hi!";
        java.lang.String str27 = atomikosProperties18.transactionManagerUniqueName;
        atomikosProperties18.setLogBaseDir("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel30 = atomikosProperties18.getConsoleLogLevel();
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.remove((java.lang.Object) (-1.0d));
        boolean boolean34 = properties31.isEmpty();
        java.util.Properties properties35 = new java.util.Properties();
        java.lang.String str36 = properties35.toString();
        java.lang.Object obj38 = properties35.remove((java.lang.Object) (short) 100);
        java.lang.Object obj41 = properties35.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean43 = properties35.containsKey((java.lang.Object) 0L);
        java.lang.Object obj46 = properties35.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj49 = properties35.setProperty("", "{-1.0=100}");
        java.lang.Object obj50 = properties35.clone();
        java.lang.Object obj51 = properties31.get((java.lang.Object) properties35);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties52 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties52.setEnableLogging(true);
        atomikosProperties52.consoleFileCount = 0;
        int int57 = atomikosProperties52.getMaxActives();
        java.lang.String str58 = atomikosProperties52.getLogBaseDir();
        java.lang.String str59 = atomikosProperties52.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery60 = atomikosProperties52.getRecovery();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties61 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties62 = atomikosProperties61.asProperties();
        atomikosProperties61.service = "{-1.0=100}";
        long long65 = atomikosProperties61.getDefaultJtaTimeout();
        atomikosProperties61.setThreadedTwoPhaseCommit(true);
        boolean boolean68 = atomikosProperties61.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery69 = atomikosProperties61.recovery;
        atomikosProperties61.setLogBaseDir("");
        java.lang.Object obj72 = properties35.replace((java.lang.Object) recovery60, (java.lang.Object) "");
        java.util.Properties properties73 = new java.util.Properties();
        java.lang.Object obj75 = properties73.remove((java.lang.Object) (-1.0d));
        boolean boolean77 = properties73.contains((java.lang.Object) "{-1.0=100}");
        boolean boolean78 = properties35.equals((java.lang.Object) "{-1.0=100}");
        properties35.clear();
        java.lang.Object obj80 = properties0.getOrDefault((java.lang.Object) atomikosProperties18, (java.lang.Object) properties35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<?> wildcardEnumeration81 = properties0.propertyNames();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str15, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10000L + "'", long22 == 10000L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel30 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel30.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
// flaky:         org.junit.Assert.assertEquals(obj50.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 50 + "'", int57 == 50);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(recovery60);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10000L + "'", long65 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(recovery69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals(obj80.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "{}");
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        long long10 = recovery9.delay;
        long long11 = recovery9.delay;
        recovery9.setMaxRetries(32);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileLimit = (byte) 10;
        long long7 = atomikosProperties0.getMaxTimeout();
        boolean boolean8 = atomikosProperties0.allowSubTransactions;
        java.lang.String str9 = atomikosProperties0.getTransactionManagerUniqueName();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.consoleFileName = "hi!";
        atomikosProperties0.setCheckpointInterval((long) 5);
        atomikosProperties0.setConsoleFileCount(0);
        boolean boolean11 = atomikosProperties0.isThreadedTwoPhaseCommit();
        int int12 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("{={-1.0=100}, -1.0=100}");
        atomikosProperties0.setConsoleFileCount(50);
        java.lang.String str17 = atomikosProperties0.getTransactionManagerUniqueName();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel18 = atomikosProperties0.getConsoleLogLevel();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery19 = atomikosProperties0.getRecovery();
        long long20 = atomikosProperties0.getMaxTimeout();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel18 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel18.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(recovery19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 300000L + "'", long20 == 300000L);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.forgetOrphanedLogEntriesDelay;
        recovery0.setMaxRetries(50);
        recovery0.forgetOrphanedLogEntriesDelay = 300000L;
        recovery0.retryInterval = 18L;
        long long8 = recovery0.getRetryInterval();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 86400000L + "'", long1 == 86400000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18L + "'", long8 == 18L);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        long long5 = atomikosProperties0.defaultJtaTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel6 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel6);
        atomikosProperties0.service = "";
        atomikosProperties0.serialJtaTransactions = true;
        java.lang.String str12 = atomikosProperties0.getLogBaseName();
        boolean boolean13 = atomikosProperties0.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery14 = atomikosProperties0.recovery;
        recovery14.delay = 21;
        recovery14.forgetOrphanedLogEntriesDelay = 'a';
        recovery14.maxRetries = 18;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tmlog" + "'", str12, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(recovery14);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.consoleFileName = "{-1.0=100}";
        atomikosProperties0.setSerialJtaTransactions(false);
        atomikosProperties0.consoleFileName = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.defaultJtaTimeout = 50;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel19 = atomikosProperties0.getConsoleLogLevel();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery20 = atomikosProperties0.recovery;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.setAllowSubTransactions(true);
        atomikosProperties21.maxActives = (short) -1;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel26 = atomikosProperties21.getConsoleLogLevel();
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel26;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertNull(atomikosLoggingLevel19);
        org.junit.Assert.assertNotNull(recovery20);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel26 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel26.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        recovery5.setForgetOrphanedLogEntriesDelay(1L);
        recovery5.retryInterval = (-1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        long long5 = atomikosProperties0.getMaxTimeout();
        int int6 = atomikosProperties0.consoleFileCount;
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        boolean boolean8 = atomikosProperties0.isForceShutdownOnVmExit();
        atomikosProperties0.setSerialJtaTransactions(true);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel11 = atomikosProperties0.consoleLogLevel;
        atomikosProperties0.transactionManagerUniqueName = "{-1.0=100}";
        java.util.Properties properties14 = new java.util.Properties();
        java.lang.String str15 = properties14.toString();
        java.util.Properties properties16 = new java.util.Properties(properties14);
        java.lang.Object obj19 = properties14.setProperty("", "{={-1.0=100}, -1.0=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.serialJtaTransactions = true;
        atomikosProperties20.maxActives = ' ';
        int int29 = atomikosProperties20.maxActives;
        java.util.Properties properties30 = new java.util.Properties();
        java.lang.String str31 = properties30.toString();
        java.lang.Object obj33 = properties30.remove((java.lang.Object) (short) 100);
        java.lang.Object obj36 = properties30.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties38 = new java.util.Properties();
        java.lang.String str39 = properties38.toString();
        java.lang.Object obj41 = properties38.remove((java.lang.Object) (short) 100);
        java.lang.Object obj44 = properties38.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj45 = properties38.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration46 = properties38.elements();
        java.lang.Object obj47 = properties30.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration46);
        java.lang.String str48 = properties30.toString();
        boolean boolean49 = properties14.remove((java.lang.Object) atomikosProperties20, (java.lang.Object) properties30);
        java.lang.String str50 = atomikosProperties20.logBaseDir;
        atomikosProperties20.transactionManagerUniqueName = "{}";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties53 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties54 = atomikosProperties53.asProperties();
        atomikosProperties53.service = "{-1.0=100}";
        java.lang.String str57 = atomikosProperties53.getTransactionManagerUniqueName();
        atomikosProperties53.consoleFileName = "hi!";
        atomikosProperties53.serialJtaTransactions = true;
        atomikosProperties53.enableLogging = true;
        atomikosProperties53.checkpointInterval = 300000L;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel66 = atomikosProperties53.getConsoleLogLevel();
        atomikosProperties20.consoleLogLevel = atomikosLoggingLevel66;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel66;
        atomikosProperties0.service = "{{={-1.0=100}, -1.0=100}=}";
        atomikosProperties0.serialJtaTransactions = false;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel11 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel11.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{}" + "'", str39, "{}");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel66 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel66.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj15 = properties8.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties8.elements();
        java.lang.Object obj17 = properties0.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration16);
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.lang.Object obj20 = properties18.clone();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean23 = properties21.isEmpty();
        java.lang.Object obj26 = properties21.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties21.elements();
        java.lang.Object obj28 = properties0.put(obj20, (java.lang.Object) objEnumeration27);
        properties0.clear();
        java.lang.String str30 = properties0.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties32 = atomikosProperties31.asProperties();
        atomikosProperties31.service = "{-1.0=100}";
        long long35 = atomikosProperties31.getDefaultJtaTimeout();
        atomikosProperties31.serialJtaTransactions = true;
        atomikosProperties31.maxActives = ' ';
        int int40 = atomikosProperties31.getConsoleFileCount();
        boolean boolean41 = properties0.equals((java.lang.Object) atomikosProperties31);
        java.lang.Object obj42 = properties0.clone();
        java.util.Set<java.lang.Object> objSet43 = properties0.keySet();
        java.lang.Object obj44 = properties0.clone();
        boolean boolean45 = properties0.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10000L + "'", long35 == 10000L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "{}");
        org.junit.Assert.assertNotNull(objSet43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "{}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration1 = properties0.propertyNames();
        java.lang.Object obj2 = properties0.clone();
        java.util.Collection<java.lang.Object> objCollection3 = properties0.values();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.store(outputStream4, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={1.0=-1}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardEnumeration1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "{}");
        org.junit.Assert.assertNotNull(objCollection3);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setMaxActives(100);
        boolean boolean9 = atomikosProperties0.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.recovery;
        long long11 = atomikosProperties0.maxTimeout;
        java.lang.String str12 = atomikosProperties0.transactionManagerUniqueName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        long long5 = atomikosProperties0.defaultJtaTimeout;
        long long6 = atomikosProperties0.getMaxTimeout();
        boolean boolean7 = atomikosProperties0.forceShutdownOnVmExit;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        atomikosProperties0.setService("{1.0=-1}");
        boolean boolean11 = atomikosProperties0.forceShutdownOnVmExit;
        java.lang.String str12 = atomikosProperties0.service;
        boolean boolean13 = atomikosProperties0.enableLogging;
        long long14 = atomikosProperties0.checkpointInterval;
        java.util.Properties properties15 = atomikosProperties0.asProperties();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{1.0=-1}" + "'", str12, "{1.0=-1}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 500L + "'", long14 == 500L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties7.setEnableLogging(true);
        atomikosProperties7.consoleFileCount = 0;
        atomikosProperties7.setSerialJtaTransactions(false);
        java.lang.String str14 = atomikosProperties7.getOutputDir();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties16 = atomikosProperties15.asProperties();
        atomikosProperties15.service = "{-1.0=100}";
        long long19 = atomikosProperties15.getDefaultJtaTimeout();
        atomikosProperties15.serialJtaTransactions = true;
        long long22 = atomikosProperties15.getDefaultJtaTimeout();
        long long23 = atomikosProperties15.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery24 = atomikosProperties15.getRecovery();
        recovery24.setRetryInterval((long) (byte) 0);
        java.lang.Object obj27 = properties0.replace((java.lang.Object) atomikosProperties7, (java.lang.Object) (byte) 0);
        java.lang.String str28 = atomikosProperties7.getLogBaseDir();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel29 = atomikosProperties7.consoleLogLevel;
        atomikosProperties7.defaultJtaTimeout = 86400000L;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10000L + "'", long19 == 10000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10000L + "'", long22 == 10000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 500L + "'", long23 == 500L);
        org.junit.Assert.assertNotNull(recovery24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel29 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel29.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.allowSubTransactions = true;
        atomikosProperties0.setEnableLogging(true);
        java.lang.String str7 = atomikosProperties0.getTransactionManagerUniqueName();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean8 = properties0.containsKey((java.lang.Object) 0L);
        java.lang.Object obj11 = properties0.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj14 = properties0.setProperty("", "{-1.0=100}");
        java.lang.Object obj15 = properties0.clone();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery16 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery16.retryInterval = (short) 100;
        recovery16.forgetOrphanedLogEntriesDelay = 'a';
        boolean boolean21 = properties0.equals((java.lang.Object) 'a');
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery22 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery22.retryInterval = (short) 100;
        recovery22.forgetOrphanedLogEntriesDelay = 'a';
        long long27 = recovery22.getDelay();
        int int28 = recovery22.maxRetries;
        int int29 = recovery22.maxRetries;
        long long30 = recovery22.getRetryInterval();
        java.util.Properties properties31 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration32 = properties31.propertyNames();
        java.lang.Object obj33 = properties0.put((java.lang.Object) long30, (java.lang.Object) wildcardEnumeration32);
        java.util.Properties properties34 = new java.util.Properties(properties0);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet35 = properties34.entrySet();
        java.lang.Object obj36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = properties34.contains(obj36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals(obj15.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10000L + "'", long27 == 10000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(wildcardEnumeration32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objEntrySet35);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setLogBaseDir("{-1.0=100}");
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.setConsoleFileLimit(18);
        boolean boolean14 = atomikosProperties0.isEnableLogging();
        java.lang.String str15 = atomikosProperties0.getLogBaseDir();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{-1.0=100}" + "'", str15, "{-1.0=100}");
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        java.lang.String str4 = atomikosProperties0.getTransactionManagerUniqueName();
        boolean boolean5 = atomikosProperties0.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel6 = atomikosProperties0.getConsoleLogLevel();
        atomikosProperties0.consoleFileCount = (byte) 1;
        atomikosProperties0.transactionManagerUniqueName = "{{-1.0=100}=}";
        long long11 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel6 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel6.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.getDefaultJtaTimeout();
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        java.lang.String str10 = atomikosProperties0.outputDir;
        atomikosProperties0.setSerialJtaTransactions(true);
        atomikosProperties0.consoleFileCount = (short) 0;
        atomikosProperties0.consoleFileLimit = 19;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties8 = new java.util.Properties();
        java.lang.String str9 = properties8.toString();
        java.lang.Object obj11 = properties8.remove((java.lang.Object) (short) 100);
        java.lang.Object obj14 = properties8.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj15 = properties8.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties8.elements();
        java.lang.Object obj17 = properties0.putIfAbsent((java.lang.Object) 10.0f, (java.lang.Object) objEnumeration16);
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Enumeration<?> wildcardEnumeration19 = properties18.propertyNames();
        java.lang.Object obj20 = properties18.clone();
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.String str22 = properties21.toString();
        boolean boolean23 = properties21.isEmpty();
        java.lang.Object obj26 = properties21.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties21.elements();
        java.lang.Object obj28 = properties0.put(obj20, (java.lang.Object) objEnumeration27);
        properties0.clear();
        java.util.Properties properties30 = new java.util.Properties();
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.remove((java.lang.Object) (-1.0d));
        int int34 = properties31.size();
        java.util.Enumeration<java.lang.Object> objEnumeration35 = properties31.elements();
        java.util.Properties properties36 = new java.util.Properties();
        properties36.clear();
        java.lang.String str38 = properties36.toString();
        boolean boolean39 = properties0.replace((java.lang.Object) properties30, (java.lang.Object) properties31, (java.lang.Object) str38);
        java.util.Set<java.lang.String> strSet40 = properties0.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties42 = atomikosProperties41.asProperties();
        atomikosProperties41.service = "{-1.0=100}";
        long long45 = atomikosProperties41.getDefaultJtaTimeout();
        atomikosProperties41.enableLogging = false;
        atomikosProperties41.setMaxTimeout((long) (byte) 0);
        atomikosProperties41.setAllowSubTransactions(true);
        java.util.Properties properties52 = new java.util.Properties();
        java.lang.Object obj54 = properties52.remove((java.lang.Object) (-1.0d));
        boolean boolean55 = properties52.isEmpty();
        java.util.Properties properties56 = new java.util.Properties();
        java.lang.String str57 = properties56.toString();
        java.lang.Object obj59 = properties56.remove((java.lang.Object) (short) 100);
        java.lang.Object obj62 = properties56.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean64 = properties56.containsKey((java.lang.Object) 0L);
        java.lang.Object obj67 = properties56.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj70 = properties56.setProperty("", "{-1.0=100}");
        java.lang.Object obj71 = properties56.clone();
        java.lang.Object obj72 = properties52.get((java.lang.Object) properties56);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery74 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery74.retryInterval = (short) 100;
        recovery74.forgetOrphanedLogEntriesDelay = 'a';
        long long79 = recovery74.getDelay();
        long long80 = recovery74.getRetryInterval();
        recovery74.forgetOrphanedLogEntriesDelay = 10000L;
        atomikosProperties41.set(properties56, "tmlog", (java.lang.Object) recovery74);
        java.lang.Object obj84 = properties0.get((java.lang.Object) properties56);
        java.lang.String str86 = properties0.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={={-1.0=100}, -1.0=100}, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir={1.0=-1, -1.0=100}, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={-1.0=100}, com.atomikos.icatch.force_shutdown_on_vm_exit=true, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardEnumeration19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objEnumeration35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10000L + "'", long45 == 10000L);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "{}" + "'", str57, "{}");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(obj71);
// flaky:         org.junit.Assert.assertEquals(obj71.toString(), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "{={-1.0=100}, -1.0=100}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10000L + "'", long79 == 10000L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 100L + "'", long80 == 100L);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery5 = atomikosProperties0.getRecovery();
        atomikosProperties0.setConsoleFileCount((int) (byte) 100);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel8 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel8;
        java.lang.String str10 = atomikosProperties0.logBaseDir;
        java.lang.String str11 = atomikosProperties0.consoleFileName;
        int int12 = atomikosProperties0.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties13.setAllowSubTransactions(true);
        boolean boolean16 = atomikosProperties13.enableLogging;
        boolean boolean17 = atomikosProperties13.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel18 = atomikosProperties13.consoleLogLevel;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel18);
        java.lang.String str20 = atomikosProperties0.getService();
        atomikosProperties0.consoleFileCount = 0;
        atomikosProperties0.logBaseName = "{1.0=-1}";
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.setConsoleFileName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service={1.0=-1}, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        boolean boolean29 = atomikosProperties0.threadedTwoPhaseCommit;
        long long30 = atomikosProperties0.checkpointInterval;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(recovery5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tm.out" + "'", str11, "tm.out");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel18 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel18.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 500L + "'", long30 == 500L);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties3.keys();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        boolean boolean21 = properties19.isEmpty();
        java.lang.Object obj24 = properties19.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties19.elements();
        java.lang.Object obj26 = properties2.replace((java.lang.Object) objEnumeration18, (java.lang.Object) properties19);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties19.elements();
        java.util.Properties properties28 = new java.util.Properties(properties19);
        java.util.Properties properties29 = new java.util.Properties();
        java.lang.String str30 = properties29.toString();
        java.lang.Object obj32 = properties29.remove((java.lang.Object) (short) 100);
        java.lang.Object obj35 = properties29.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean37 = properties29.containsKey((java.lang.Object) 0L);
        java.lang.Object obj40 = properties29.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties41 = new java.util.Properties();
        java.lang.String str42 = properties41.toString();
        java.lang.Object obj44 = properties41.remove((java.lang.Object) (short) 100);
        java.lang.Object obj47 = properties41.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        java.lang.Object obj48 = properties41.clone();
        java.util.Enumeration<java.lang.Object> objEnumeration49 = properties41.elements();
        properties29.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties41);
        java.lang.Object obj51 = properties41.clone();
        properties41.clear();
        java.util.Enumeration<?> wildcardEnumeration53 = properties41.propertyNames();
        boolean boolean54 = properties19.contains((java.lang.Object) wildcardEnumeration53);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties55 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties56 = atomikosProperties55.asProperties();
        atomikosProperties55.service = "{-1.0=100}";
        long long59 = atomikosProperties55.getDefaultJtaTimeout();
        atomikosProperties55.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties55.setMaxActives(100);
        java.lang.String str64 = atomikosProperties55.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties65 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean66 = atomikosProperties65.isSerialJtaTransactions();
        boolean boolean67 = atomikosProperties65.allowSubTransactions;
        java.lang.Object obj68 = properties19.getOrDefault((java.lang.Object) atomikosProperties55, (java.lang.Object) atomikosProperties65);
        atomikosProperties65.setSerialJtaTransactions(true);
        java.lang.String str71 = atomikosProperties65.logBaseName;
        atomikosProperties65.setConsoleFileLimit((int) '4');
        atomikosProperties65.setCheckpointInterval(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{}" + "'", str42, "{}");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "{1.0=-1}");
        org.junit.Assert.assertNotNull(objEnumeration49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "{1.0=-1}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "{1.0=-1}");
        org.junit.Assert.assertNotNull(wildcardEnumeration53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10000L + "'", long59 == 10000L);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "tmlog" + "'", str71, "tmlog");
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        java.util.Properties properties2 = new java.util.Properties();
        java.lang.Object obj4 = properties2.remove((java.lang.Object) (-1.0d));
        boolean boolean5 = properties2.isEmpty();
        int int6 = properties2.size();
        java.lang.String str8 = properties2.getProperty("{}");
        java.lang.Object obj9 = properties1.remove((java.lang.Object) properties2);
        java.util.Properties properties10 = new java.util.Properties();
        java.util.Properties properties11 = new java.util.Properties();
        java.lang.String str12 = properties11.toString();
        boolean boolean13 = properties11.isEmpty();
        java.util.Properties properties14 = new java.util.Properties();
        java.lang.String str15 = properties14.toString();
        java.lang.Object obj17 = properties14.remove((java.lang.Object) (short) 100);
        java.lang.Object obj20 = properties14.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean22 = properties14.containsKey((java.lang.Object) 0L);
        boolean boolean23 = properties11.containsValue((java.lang.Object) 0L);
        boolean boolean26 = properties10.replace((java.lang.Object) 0L, (java.lang.Object) 0.0f, (java.lang.Object) 10.0d);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties10.elements();
        java.lang.String str28 = properties10.toString();
        java.util.Enumeration<java.lang.Object> objEnumeration29 = properties10.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties31 = atomikosProperties30.asProperties();
        boolean boolean32 = properties1.remove((java.lang.Object) properties10, (java.lang.Object) properties31);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties34 = atomikosProperties33.asProperties();
        atomikosProperties33.service = "{-1.0=100}";
        long long37 = atomikosProperties33.getDefaultJtaTimeout();
        atomikosProperties33.setThreadedTwoPhaseCommit(true);
        boolean boolean40 = atomikosProperties33.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery41 = atomikosProperties33.recovery;
        atomikosProperties33.setLogBaseDir("");
        long long44 = atomikosProperties33.maxTimeout;
        atomikosProperties33.serialJtaTransactions = false;
        atomikosProperties33.transactionManagerUniqueName = "{0={100=100}, {}={}}";
        atomikosProperties33.setMaxTimeout(0L);
        int int51 = atomikosProperties33.getConsoleFileCount();
        boolean boolean52 = properties1.contains((java.lang.Object) atomikosProperties33);
        java.util.Properties properties53 = new java.util.Properties(properties1);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties54 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties55 = atomikosProperties54.asProperties();
        atomikosProperties54.service = "{-1.0=100}";
        long long58 = atomikosProperties54.getDefaultJtaTimeout();
        atomikosProperties54.setThreadedTwoPhaseCommit(true);
        boolean boolean61 = atomikosProperties54.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery62 = atomikosProperties54.recovery;
        atomikosProperties54.setLogBaseDir("");
        long long65 = atomikosProperties54.maxTimeout;
        java.lang.String str66 = atomikosProperties54.logBaseDir;
        java.lang.String str67 = atomikosProperties54.logBaseDir;
        boolean boolean68 = properties53.contains((java.lang.Object) atomikosProperties54);
        atomikosProperties54.maxActives = 0;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertNotNull(objEnumeration29);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10000L + "'", long37 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(recovery41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 300000L + "'", long44 == 300000L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10000L + "'", long58 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(recovery62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 300000L + "'", long65 == 300000L);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.util.Properties properties2 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.String str4 = properties3.toString();
        java.lang.Object obj6 = properties3.remove((java.lang.Object) (short) 100);
        java.lang.Object obj9 = properties3.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean11 = properties3.containsKey((java.lang.Object) 0L);
        java.lang.Object obj14 = properties3.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.lang.Object obj17 = properties3.setProperty("", "{-1.0=100}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties3.keys();
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.String str20 = properties19.toString();
        boolean boolean21 = properties19.isEmpty();
        java.lang.Object obj24 = properties19.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        java.util.Enumeration<java.lang.Object> objEnumeration25 = properties19.elements();
        java.lang.Object obj26 = properties2.replace((java.lang.Object) objEnumeration18, (java.lang.Object) properties19);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties19.elements();
        java.util.Enumeration<java.lang.Object> objEnumeration28 = properties19.keys();
        java.lang.Object obj29 = properties19.clone();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties31 = atomikosProperties30.asProperties();
        atomikosProperties30.service = "{-1.0=100}";
        long long34 = atomikosProperties30.getDefaultJtaTimeout();
        atomikosProperties30.setThreadedTwoPhaseCommit(true);
        boolean boolean37 = atomikosProperties30.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery38 = atomikosProperties30.recovery;
        atomikosProperties30.setLogBaseDir("");
        atomikosProperties30.setConsoleFileName("");
        atomikosProperties30.setTransactionManagerUniqueName("{100=100}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties45 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties45.setEnableLogging(true);
        atomikosProperties45.consoleFileCount = 0;
        atomikosProperties45.consoleFileCount = (byte) 0;
        atomikosProperties45.setDefaultJtaTimeout(0L);
        java.lang.Object obj54 = properties19.replace((java.lang.Object) atomikosProperties30, (java.lang.Object) 0L);
        int int55 = atomikosProperties30.consoleFileLimit;
        atomikosProperties30.allowSubTransactions = true;
        java.lang.String str58 = atomikosProperties30.transactionManagerUniqueName;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objEnumeration25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNotNull(objEnumeration28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "{100=100}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "{100=100}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "{100=100}");
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10000L + "'", long34 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(recovery38);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "{100=100}" + "'", str58, "{100=100}");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        java.util.Properties properties7 = new java.util.Properties();
        java.lang.String str8 = properties7.toString();
        properties7.clear();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet10 = properties7.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties12 = atomikosProperties11.asProperties();
        atomikosProperties11.service = "{-1.0=100}";
        long long15 = atomikosProperties11.getDefaultJtaTimeout();
        atomikosProperties11.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties11.setMaxActives(100);
        java.lang.String str20 = atomikosProperties11.logBaseDir;
        atomikosProperties11.consoleFileCount = (short) 0;
        atomikosProperties11.defaultJtaTimeout = 10000L;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel25 = atomikosProperties11.consoleLogLevel;
        java.lang.Object obj26 = properties0.putIfAbsent((java.lang.Object) properties7, (java.lang.Object) atomikosLoggingLevel25);
        java.lang.String str27 = properties7.toString();
        int int28 = properties7.size();
        java.lang.String str30 = properties7.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.util.Enumeration<java.lang.Object> objEnumeration31 = properties7.keys();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(objEntrySet10);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel25 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel25.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{}" + "'", str27, "{}");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(objEnumeration31);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = atomikosProperties0.consoleLogLevel;
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel3 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel3.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.setLogBaseName("");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery13 = atomikosProperties0.getRecovery();
        recovery13.maxRetries = (short) 1;
        long long16 = recovery13.getRetryInterval();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertNotNull(recovery13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10000L + "'", long16 == 10000L);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        atomikosProperties0.maxActives = (byte) 10;
        atomikosProperties0.serialJtaTransactions = false;
        atomikosProperties0.setCheckpointInterval((long) 5);
        boolean boolean15 = atomikosProperties0.isSerialJtaTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean17 = atomikosProperties16.enableLogging;
        long long18 = atomikosProperties16.getDefaultJtaTimeout();
        atomikosProperties16.enableLogging = false;
        int int21 = atomikosProperties16.getConsoleFileCount();
        long long22 = atomikosProperties16.getDefaultJtaTimeout();
        atomikosProperties16.consoleFileLimit = (-1);
        atomikosProperties16.transactionManagerUniqueName = "{{-1.0=100}=}";
        java.util.Properties properties27 = new java.util.Properties();
        java.lang.String str28 = properties27.toString();
        java.lang.Object obj30 = properties27.remove((java.lang.Object) (short) 100);
        java.lang.Object obj33 = properties27.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean35 = properties27.containsKey((java.lang.Object) 0L);
        java.lang.String str36 = properties27.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties38 = atomikosProperties37.asProperties();
        atomikosProperties37.service = "{-1.0=100}";
        long long41 = atomikosProperties37.getDefaultJtaTimeout();
        atomikosProperties37.setMaxActives(0);
        atomikosProperties37.maxActives = 'a';
        boolean boolean46 = atomikosProperties37.isThreadedTwoPhaseCommit();
        boolean boolean47 = atomikosProperties37.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel48 = atomikosProperties37.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties49 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties50 = atomikosProperties49.asProperties();
        atomikosProperties49.service = "{-1.0=100}";
        long long53 = atomikosProperties49.getDefaultJtaTimeout();
        atomikosProperties49.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties49.setMaxActives(100);
        java.lang.String str58 = atomikosProperties49.logBaseDir;
        java.lang.String str59 = atomikosProperties49.outputDir;
        java.lang.Object obj60 = properties27.replace((java.lang.Object) atomikosLoggingLevel48, (java.lang.Object) atomikosProperties49);
        java.lang.String str61 = atomikosProperties49.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties62 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties63 = atomikosProperties62.asProperties();
        atomikosProperties62.service = "{-1.0=100}";
        java.lang.String str66 = atomikosProperties62.getTransactionManagerUniqueName();
        atomikosProperties62.consoleFileName = "hi!";
        atomikosProperties62.serialJtaTransactions = true;
        long long71 = atomikosProperties62.maxTimeout;
        atomikosProperties62.setForceShutdownOnVmExit(false);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel74 = atomikosProperties62.getConsoleLogLevel();
        atomikosProperties49.consoleLogLevel = atomikosLoggingLevel74;
        atomikosProperties16.setConsoleLogLevel(atomikosLoggingLevel74);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel74);
        atomikosProperties0.consoleFileName = "tm.out";
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10000L + "'", long18 == 10000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10000L + "'", long22 == 10000L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{-1.0=100}" + "'", str36, "{-1.0=100}");
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10000L + "'", long41 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel48 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel48.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10000L + "'", long53 == 10000L);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "{={-1.0=100}, -1.0=100}" + "'", str59, "{={-1.0=100}, -1.0=100}");
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 300000L + "'", long71 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel74 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel74.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        long long7 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setLogBaseDir("{-1.0=100}");
        int int10 = atomikosProperties0.getConsoleFileCount();
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties14 = atomikosProperties13.asProperties();
        atomikosProperties13.service = "{-1.0=100}";
        long long17 = atomikosProperties13.getDefaultJtaTimeout();
        atomikosProperties13.setTransactionManagerUniqueName("{}");
        atomikosProperties13.consoleFileName = "hi!";
        int int22 = atomikosProperties13.getConsoleFileCount();
        boolean boolean23 = atomikosProperties13.isThreadedTwoPhaseCommit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel24 = atomikosProperties13.consoleLogLevel;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel24;
        atomikosProperties0.setMaxTimeout(500L);
        atomikosProperties0.consoleFileLimit = 18;
        atomikosProperties0.setMaxTimeout((long) (short) 0);
        java.lang.String str32 = atomikosProperties0.getLogBaseName();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean34 = atomikosProperties33.isSerialJtaTransactions();
        atomikosProperties33.logBaseName = "{-1.0=100}";
        int int37 = atomikosProperties33.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery38 = atomikosProperties33.getRecovery();
        atomikosProperties33.setConsoleFileCount((int) (byte) 100);
        atomikosProperties33.setAllowSubTransactions(true);
        atomikosProperties33.setService("tm.out");
        int int45 = atomikosProperties33.consoleFileLimit;
        atomikosProperties33.setLogBaseName("");
        java.lang.String str48 = atomikosProperties33.logBaseDir;
        atomikosProperties33.transactionManagerUniqueName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel51 = atomikosProperties33.consoleLogLevel;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel51;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel53 = atomikosProperties0.consoleLogLevel;
        java.lang.String str54 = atomikosProperties0.transactionManagerUniqueName;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10000L + "'", long17 == 10000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel24 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel24.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "tmlog" + "'", str32, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 50 + "'", int37 == 50);
        org.junit.Assert.assertNotNull(recovery38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel51 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel51.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel53 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel53.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        int int9 = atomikosProperties0.getConsoleFileCount();
        int int10 = atomikosProperties0.consoleFileLimit;
        java.util.Properties properties11 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean13 = atomikosProperties12.isSerialJtaTransactions();
        atomikosProperties12.logBaseName = "{-1.0=100}";
        int int16 = atomikosProperties12.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties12.getRecovery();
        atomikosProperties12.setConsoleFileCount((int) (byte) 100);
        atomikosProperties12.setAllowSubTransactions(true);
        atomikosProperties12.setService("tm.out");
        boolean boolean24 = atomikosProperties12.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel25 = atomikosProperties12.getConsoleLogLevel();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties26.setAllowSubTransactions(true);
        boolean boolean29 = atomikosProperties26.enableLogging;
        atomikosProperties26.consoleFileLimit = (byte) 100;
        java.util.Properties properties32 = new java.util.Properties();
        java.lang.String str33 = properties32.toString();
        java.util.Properties properties34 = new java.util.Properties(properties32);
        java.util.Properties properties36 = new java.util.Properties();
        java.lang.String str37 = properties36.toString();
        java.lang.Object obj39 = properties36.remove((java.lang.Object) (short) 100);
        java.lang.Object obj42 = properties36.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean44 = properties36.containsKey((java.lang.Object) 0L);
        java.lang.Object obj47 = properties36.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties48 = new java.util.Properties(properties36);
        java.util.Enumeration<java.lang.Object> objEnumeration49 = properties48.elements();
        atomikosProperties26.set(properties34, "{={-1.0=100}, -1.0=100}", (java.lang.Object) properties48);
        atomikosProperties26.allowSubTransactions = false;
        java.lang.Object obj53 = properties11.put((java.lang.Object) atomikosProperties12, (java.lang.Object) false);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel54 = atomikosProperties12.consoleLogLevel;
        boolean boolean55 = atomikosProperties12.isEnableLogging();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel25 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel25.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{}" + "'", str33, "{}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objEnumeration49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel54 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel54.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        atomikosProperties0.setTransactionManagerUniqueName("{-1.0=100}");
        atomikosProperties0.consoleFileCount = 0;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery11 = atomikosProperties0.getRecovery();
        recovery11.maxRetries = 35;
        recovery11.setMaxRetries(18);
        int int16 = recovery11.getMaxRetries();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertNotNull(recovery11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 18 + "'", int16 == 18);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.getRetryInterval();
        long long2 = recovery0.getDelay();
        int int3 = recovery0.maxRetries;
        long long4 = recovery0.getRetryInterval();
        long long5 = recovery0.getRetryInterval();
        long long6 = recovery0.getForgetOrphanedLogEntriesDelay();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86400000L + "'", long6 == 86400000L);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery7 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery7.retryInterval = (short) 100;
        recovery7.delay = (-1L);
        long long12 = recovery7.delay;
        boolean boolean13 = properties0.equals((java.lang.Object) long12);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery14 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery14.retryInterval = (short) 100;
        recovery14.forgetOrphanedLogEntriesDelay = 'a';
        long long19 = recovery14.retryInterval;
        recovery14.forgetOrphanedLogEntriesDelay = 0L;
        long long22 = recovery14.getForgetOrphanedLogEntriesDelay();
        recovery14.setRetryInterval((long) 0);
        boolean boolean25 = properties0.contains((java.lang.Object) recovery14);
        recovery14.setMaxRetries((int) ' ');
        recovery14.setForgetOrphanedLogEntriesDelay(500L);
        recovery14.setRetryInterval((long) '#');
        recovery14.setMaxRetries(21);
        int int34 = recovery14.maxRetries;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 21 + "'", int34 == 21);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean1 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.logBaseName = "{-1.0=100}";
        int int4 = atomikosProperties0.maxActives;
        int int5 = atomikosProperties0.consoleFileCount;
        atomikosProperties0.transactionManagerUniqueName = "tm.out";
        atomikosProperties0.consoleFileName = "tm.out";
        atomikosProperties0.allowSubTransactions = false;
        atomikosProperties0.setLogBaseName("{={-1.0=100}, -1.0=100}");
        boolean boolean14 = atomikosProperties0.enableLogging;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setEnableLogging(true);
        atomikosProperties0.consoleFileCount = 0;
        int int5 = atomikosProperties0.getMaxActives();
        int int6 = atomikosProperties0.getConsoleFileCount();
        java.lang.String str7 = atomikosProperties0.service;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties9 = atomikosProperties8.asProperties();
        atomikosProperties8.service = "{-1.0=100}";
        long long12 = atomikosProperties8.getDefaultJtaTimeout();
        atomikosProperties8.setMaxActives(0);
        boolean boolean15 = atomikosProperties8.threadedTwoPhaseCommit;
        boolean boolean16 = atomikosProperties8.allowSubTransactions;
        atomikosProperties8.logBaseDir = "{}";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean20 = atomikosProperties19.isSerialJtaTransactions();
        atomikosProperties19.logBaseName = "{-1.0=100}";
        int int23 = atomikosProperties19.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery24 = atomikosProperties19.getRecovery();
        atomikosProperties19.setConsoleFileCount((int) (byte) 100);
        atomikosProperties19.setAllowSubTransactions(true);
        atomikosProperties19.setService("tm.out");
        boolean boolean31 = atomikosProperties19.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel32 = atomikosProperties19.getConsoleLogLevel();
        atomikosProperties8.setConsoleLogLevel(atomikosLoggingLevel32);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel32);
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        java.lang.String str37 = atomikosProperties0.getService();
        atomikosProperties0.setConsoleFileCount(5);
        atomikosProperties0.defaultJtaTimeout = 20;
        atomikosProperties0.threadedTwoPhaseCommit = true;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10000L + "'", long12 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50 + "'", int23 == 50);
        org.junit.Assert.assertNotNull(recovery24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel32 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel32.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel7 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel7);
        atomikosProperties0.setLogBaseName("{={-1.0=100}, -1.0=100}");
        atomikosProperties0.setConsoleFileLimit(0);
        java.lang.String str13 = atomikosProperties0.consoleFileName;
        atomikosProperties0.checkpointInterval = (short) 0;
        int int16 = atomikosProperties0.getConsoleFileLimit();
        java.util.Properties properties17 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery18 = atomikosProperties0.recovery;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tm.out" + "'", str13, "tm.out");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(recovery18);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.remove((java.lang.Object) (-1.0d));
        boolean boolean4 = properties0.contains((java.lang.Object) "{-1.0=100}");
        java.lang.Object obj7 = properties0.setProperty("{={-1.0=100}, -1.0=100}", "");
        java.lang.String str8 = properties0.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.setEnableLogging(true);
        atomikosProperties9.consoleFileCount = 0;
        int int14 = atomikosProperties9.getMaxActives();
        java.lang.String str15 = atomikosProperties9.getLogBaseDir();
        java.lang.String str16 = atomikosProperties9.service;
        atomikosProperties9.transactionManagerUniqueName = "tmlog";
        int int19 = atomikosProperties9.maxActives;
        atomikosProperties9.logBaseName = "{1.0=-1}";
        atomikosProperties9.allowSubTransactions = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties25 = atomikosProperties24.asProperties();
        atomikosProperties24.service = "{-1.0=100}";
        long long28 = atomikosProperties24.getDefaultJtaTimeout();
        atomikosProperties24.setTransactionManagerUniqueName("{}");
        atomikosProperties24.consoleFileName = "hi!";
        int int33 = atomikosProperties24.getConsoleFileLimit();
        java.lang.Object obj34 = properties0.put((java.lang.Object) true, (java.lang.Object) int33);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties35 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties36 = atomikosProperties35.asProperties();
        atomikosProperties35.service = "{-1.0=100}";
        java.lang.String str39 = atomikosProperties35.getLogBaseName();
        long long40 = atomikosProperties35.defaultJtaTimeout;
        long long41 = atomikosProperties35.getMaxTimeout();
        boolean boolean42 = atomikosProperties35.forceShutdownOnVmExit;
        java.util.Properties properties43 = atomikosProperties35.asProperties();
        int int44 = atomikosProperties35.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery45 = atomikosProperties35.recovery;
        java.util.Properties properties46 = new java.util.Properties();
        java.lang.String str47 = properties46.toString();
        boolean boolean48 = properties46.isEmpty();
        java.lang.Object obj51 = properties46.putIfAbsent((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery52 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long53 = recovery52.getRetryInterval();
        long long54 = recovery52.retryInterval;
        long long55 = recovery52.forgetOrphanedLogEntriesDelay;
        boolean boolean56 = properties46.equals((java.lang.Object) recovery52);
        boolean boolean57 = properties0.remove((java.lang.Object) recovery45, (java.lang.Object) properties46);
        long long58 = recovery45.getForgetOrphanedLogEntriesDelay();
        recovery45.setMaxRetries(50);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{{={-1.0=100}, -1.0=100}=}" + "'", str8, "{{={-1.0=100}, -1.0=100}=}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10000L + "'", long28 == 10000L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "tmlog" + "'", str39, "tmlog");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10000L + "'", long40 == 10000L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 300000L + "'", long41 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 50 + "'", int44 == 50);
        org.junit.Assert.assertNotNull(recovery45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{}" + "'", str47, "{}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10000L + "'", long53 == 10000L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10000L + "'", long54 == 10000L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 86400000L + "'", long55 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 86400000L + "'", long58 == 86400000L);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setMaxActives(100);
        boolean boolean9 = atomikosProperties0.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.recovery;
        atomikosProperties0.checkpointInterval = 300000L;
        boolean boolean13 = atomikosProperties0.isForceShutdownOnVmExit();
        boolean boolean14 = atomikosProperties0.enableLogging;
        atomikosProperties0.outputDir = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, false={100=100}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        atomikosProperties0.setLogBaseDir("{WARN={}, 0={100=100}, {}={}}");
        atomikosProperties0.allowSubTransactions = true;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.outputDir = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.setService("tm.out");
        int int5 = atomikosProperties0.consoleFileLimit;
        java.util.Properties properties6 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties8 = atomikosProperties7.asProperties();
        atomikosProperties7.service = "{-1.0=100}";
        long long11 = atomikosProperties7.getDefaultJtaTimeout();
        atomikosProperties7.serialJtaTransactions = true;
        long long14 = atomikosProperties7.maxTimeout;
        atomikosProperties7.setLogBaseDir("{-1.0=100}");
        int int17 = atomikosProperties7.getConsoleFileCount();
        atomikosProperties7.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties21 = atomikosProperties20.asProperties();
        atomikosProperties20.service = "{-1.0=100}";
        long long24 = atomikosProperties20.getDefaultJtaTimeout();
        atomikosProperties20.setTransactionManagerUniqueName("{}");
        atomikosProperties20.consoleFileName = "hi!";
        int int29 = atomikosProperties20.getConsoleFileCount();
        boolean boolean30 = atomikosProperties20.isThreadedTwoPhaseCommit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel31 = atomikosProperties20.consoleLogLevel;
        atomikosProperties7.consoleLogLevel = atomikosLoggingLevel31;
        int int33 = atomikosProperties7.getMaxActives();
        boolean boolean34 = properties6.contains((java.lang.Object) int33);
        java.lang.Object obj37 = properties6.setProperty("{com.atomikos.icatch.{={-1.0=100}, -1.0=100}={}}", "tmlog");
        int int38 = properties6.size();
        java.io.Writer writer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties6.store(writer39, "{{={-1.0=100}, -1.0=100}=}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10000L + "'", long24 == 10000L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel31 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel31.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 50 + "'", int33 == 50);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 21 + "'", int38 == 21);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.String str1 = properties0.toString();
        java.lang.Object obj3 = properties0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj6 = properties0.put((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties8 = atomikosProperties7.asProperties();
        java.lang.Object obj9 = properties0.remove((java.lang.Object) properties8);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties11 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "{-1.0=100}";
        long long14 = atomikosProperties10.getDefaultJtaTimeout();
        atomikosProperties10.setThreadedTwoPhaseCommit(true);
        boolean boolean17 = atomikosProperties10.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery18 = atomikosProperties10.recovery;
        atomikosProperties10.setLogBaseDir("");
        long long21 = atomikosProperties10.maxTimeout;
        boolean boolean22 = atomikosProperties10.forceShutdownOnVmExit;
        boolean boolean23 = properties8.containsValue((java.lang.Object) atomikosProperties10);
        java.lang.String str24 = atomikosProperties10.getService();
        atomikosProperties10.allowSubTransactions = true;
        boolean boolean27 = atomikosProperties10.enableLogging;
        atomikosProperties10.checkpointInterval = '4';
        java.lang.String str30 = atomikosProperties10.getService();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(recovery18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 300000L + "'", long21 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{-1.0=100}" + "'", str24, "{-1.0=100}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{-1.0=100}" + "'", str30, "{-1.0=100}");
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        int int9 = atomikosProperties0.getConsoleFileCount();
        int int10 = atomikosProperties0.consoleFileLimit;
        java.util.Properties properties11 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean13 = atomikosProperties12.isSerialJtaTransactions();
        atomikosProperties12.logBaseName = "{-1.0=100}";
        int int16 = atomikosProperties12.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties12.getRecovery();
        atomikosProperties12.setConsoleFileCount((int) (byte) 100);
        atomikosProperties12.setAllowSubTransactions(true);
        atomikosProperties12.setService("tm.out");
        boolean boolean24 = atomikosProperties12.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel25 = atomikosProperties12.getConsoleLogLevel();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties26.setAllowSubTransactions(true);
        boolean boolean29 = atomikosProperties26.enableLogging;
        atomikosProperties26.consoleFileLimit = (byte) 100;
        java.util.Properties properties32 = new java.util.Properties();
        java.lang.String str33 = properties32.toString();
        java.util.Properties properties34 = new java.util.Properties(properties32);
        java.util.Properties properties36 = new java.util.Properties();
        java.lang.String str37 = properties36.toString();
        java.lang.Object obj39 = properties36.remove((java.lang.Object) (short) 100);
        java.lang.Object obj42 = properties36.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean44 = properties36.containsKey((java.lang.Object) 0L);
        java.lang.Object obj47 = properties36.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties48 = new java.util.Properties(properties36);
        java.util.Enumeration<java.lang.Object> objEnumeration49 = properties48.elements();
        atomikosProperties26.set(properties34, "{={-1.0=100}, -1.0=100}", (java.lang.Object) properties48);
        atomikosProperties26.allowSubTransactions = false;
        java.lang.Object obj53 = properties11.put((java.lang.Object) atomikosProperties12, (java.lang.Object) false);
        atomikosProperties12.setService("{1.0=-1, -1.0=100}");
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel25 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel25.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{}" + "'", str33, "{}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objEnumeration49);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel5 = null;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel5);
        int int7 = atomikosProperties0.maxActives;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.getRecovery();
        atomikosProperties0.consoleFileName = "{-1.0=100}";
        atomikosProperties0.setSerialJtaTransactions(false);
        atomikosProperties0.consoleFileName = "{={-1.0=100}, -1.0=100}";
        atomikosProperties0.defaultJtaTimeout = 50;
        java.lang.String str19 = atomikosProperties0.getTransactionManagerUniqueName();
        java.lang.String str20 = atomikosProperties0.logBaseDir;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.consoleFileLimit = '#';
        atomikosProperties0.setMaxTimeout((long) 100);
        boolean boolean9 = atomikosProperties0.forceShutdownOnVmExit;
        long long10 = atomikosProperties0.maxTimeout;
        java.lang.String str11 = atomikosProperties0.getService();
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{-1.0=100}" + "'", str11, "{-1.0=100}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties1 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{-1.0=100}";
        long long4 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.maxActives = ' ';
        int int9 = atomikosProperties0.getConsoleFileCount();
        int int10 = atomikosProperties0.consoleFileLimit;
        java.util.Properties properties11 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        boolean boolean13 = atomikosProperties12.isSerialJtaTransactions();
        atomikosProperties12.logBaseName = "{-1.0=100}";
        int int16 = atomikosProperties12.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties12.getRecovery();
        atomikosProperties12.setConsoleFileCount((int) (byte) 100);
        atomikosProperties12.setAllowSubTransactions(true);
        atomikosProperties12.setService("tm.out");
        boolean boolean24 = atomikosProperties12.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel25 = atomikosProperties12.getConsoleLogLevel();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties26.setAllowSubTransactions(true);
        boolean boolean29 = atomikosProperties26.enableLogging;
        atomikosProperties26.consoleFileLimit = (byte) 100;
        java.util.Properties properties32 = new java.util.Properties();
        java.lang.String str33 = properties32.toString();
        java.util.Properties properties34 = new java.util.Properties(properties32);
        java.util.Properties properties36 = new java.util.Properties();
        java.lang.String str37 = properties36.toString();
        java.lang.Object obj39 = properties36.remove((java.lang.Object) (short) 100);
        java.lang.Object obj42 = properties36.put((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
        boolean boolean44 = properties36.containsKey((java.lang.Object) 0L);
        java.lang.Object obj47 = properties36.replace((java.lang.Object) false, (java.lang.Object) ' ');
        java.util.Properties properties48 = new java.util.Properties(properties36);
        java.util.Enumeration<java.lang.Object> objEnumeration49 = properties48.elements();
        atomikosProperties26.set(properties34, "{={-1.0=100}, -1.0=100}", (java.lang.Object) properties48);
        atomikosProperties26.allowSubTransactions = false;
        java.lang.Object obj53 = properties11.put((java.lang.Object) atomikosProperties12, (java.lang.Object) false);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties54 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties55 = atomikosProperties54.asProperties();
        atomikosProperties54.service = "{-1.0=100}";
        long long58 = atomikosProperties54.getDefaultJtaTimeout();
        long long59 = atomikosProperties54.getMaxTimeout();
        int int60 = atomikosProperties54.consoleFileCount;
        atomikosProperties54.setConsoleFileCount(0);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties63 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        java.util.Properties properties64 = atomikosProperties63.asProperties();
        atomikosProperties63.service = "{-1.0=100}";
        long long67 = atomikosProperties63.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel68 = null;
        atomikosProperties63.setConsoleLogLevel(atomikosLoggingLevel68);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel70 = null;
        atomikosProperties63.setConsoleLogLevel(atomikosLoggingLevel70);
        atomikosProperties63.setLogBaseName("{={-1.0=100}, -1.0=100}");
        boolean boolean74 = atomikosProperties63.enableLogging;
        java.lang.Object obj75 = properties11.replace((java.lang.Object) atomikosProperties54, (java.lang.Object) atomikosProperties63);
        atomikosProperties54.setLogBaseName("");
        atomikosProperties54.maxTimeout = 'a';
        boolean boolean80 = atomikosProperties54.isSerialJtaTransactions();
        atomikosProperties54.setEnableLogging(false);
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10000L + "'", long4 == 10000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel25 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel25.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{}" + "'", str33, "{}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objEnumeration49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10000L + "'", long58 == 10000L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 300000L + "'", long59 == 300000L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10000L + "'", long67 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }
}
