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
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel3;
        boolean boolean5 = atomikosProperties0.enableLogging;
        atomikosProperties0.maxTimeout = ' ';
        atomikosProperties0.logBaseName = "tm.out";
        java.lang.String str10 = atomikosProperties0.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel11 = atomikosProperties0.consoleLogLevel;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(atomikosLoggingLevel11);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        java.util.Set<java.lang.String> strSet8 = properties7.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int10 = atomikosProperties9.getConsoleFileCount();
        int int11 = atomikosProperties9.maxActives;
        atomikosProperties9.setConsoleFileName("");
        atomikosProperties9.transactionManagerUniqueName = "{}";
        java.util.Properties properties16 = atomikosProperties9.asProperties();
        boolean boolean17 = atomikosProperties9.threadedTwoPhaseCommit;
        atomikosProperties9.enableLogging = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int21 = atomikosProperties20.getConsoleFileCount();
        int int22 = atomikosProperties20.maxActives;
        atomikosProperties20.setConsoleFileName("");
        atomikosProperties20.transactionManagerUniqueName = "{}";
        atomikosProperties20.setMaxActives(0);
        boolean boolean29 = atomikosProperties20.forceShutdownOnVmExit;
        java.lang.Object obj30 = properties7.put((java.lang.Object) atomikosProperties9, (java.lang.Object) atomikosProperties20);
        atomikosProperties9.setConsoleFileCount((int) '4');
        int int33 = atomikosProperties9.getConsoleFileLimit();
        java.util.Properties properties34 = atomikosProperties9.asProperties();
        long long35 = atomikosProperties9.maxTimeout;
        atomikosProperties9.forceShutdownOnVmExit = true;
        long long38 = atomikosProperties9.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery39 = atomikosProperties9.getRecovery();
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 300000L + "'", long35 == 300000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 300000L + "'", long38 == 300000L);
        org.junit.Assert.assertNotNull(recovery39);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        int int3 = atomikosProperties0.getConsoleFileLimit();
        java.util.Properties properties4 = atomikosProperties0.asProperties();
        boolean boolean5 = atomikosProperties0.forceShutdownOnVmExit;
        boolean boolean6 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setOutputDir("tmlog");
        atomikosProperties0.setCheckpointInterval((long) (-1));
        java.util.Properties properties11 = atomikosProperties0.asProperties();
        int int12 = atomikosProperties0.getMaxActives();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        boolean boolean6 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean7 = atomikosProperties0.enableLogging;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        atomikosProperties0.threadedTwoPhaseCommit = false;
        atomikosProperties0.setDefaultJtaTimeout(5L);
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.get((java.lang.Object) 0.0d);
        java.lang.Object obj3 = properties0.clone();
        java.lang.String str4 = properties0.toString();
        java.util.Properties properties5 = new java.util.Properties(properties0);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties6.setDefaultJtaTimeout((-1L));
        int int9 = atomikosProperties6.getConsoleFileLimit();
        java.util.Properties properties10 = atomikosProperties6.asProperties();
        java.util.Properties properties11 = new java.util.Properties(properties10);
        java.util.Properties properties12 = new java.util.Properties();
        java.util.Properties properties13 = new java.util.Properties(properties12);
        java.util.Collection<java.lang.Object> objCollection14 = properties13.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties15.enableLogging = true;
        long long18 = atomikosProperties15.getCheckpointInterval();
        boolean boolean20 = properties13.remove((java.lang.Object) long18, (java.lang.Object) (byte) 100);
        boolean boolean22 = properties13.equals((java.lang.Object) (short) 1);
        java.util.Properties properties23 = new java.util.Properties(properties13);
        java.lang.Class<?> wildcardClass24 = properties23.getClass();
        java.lang.Object obj25 = properties0.put((java.lang.Object) properties10, (java.lang.Object) wildcardClass24);
        java.util.Properties properties26 = new java.util.Properties(properties10);
        java.lang.Object obj29 = properties10.setProperty("{com.atomikos.icatch.console_file_name={}, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={com.atomikos.icatch.hi!=-1.0}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service=tmlog, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}", "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, tmlog=tmlog, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}");
        java.util.Set<java.lang.String> strSet30 = properties10.stringPropertyNames();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 500L + "'", long18 == 500L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.Object obj5 = properties3.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = properties3.clone();
        java.lang.String str7 = properties3.toString();
        boolean boolean10 = properties3.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj11 = properties1.replace((java.lang.Object) 10.0d, (java.lang.Object) properties3);
        java.lang.String str12 = properties3.toString();
        java.util.Properties properties13 = new java.util.Properties(properties3);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties14.logBaseDir = "";
        atomikosProperties14.setConsoleFileCount((int) (short) 10);
        long long19 = atomikosProperties14.getMaxTimeout();
        java.util.Properties properties20 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet21 = properties20.keySet();
        atomikosProperties14.set(properties20, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj27 = properties20.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties28.setDefaultJtaTimeout((-1L));
        java.util.Properties properties31 = new java.util.Properties();
        java.lang.Object obj33 = properties31.get((java.lang.Object) 0.0d);
        java.lang.Object obj34 = properties31.clone();
        boolean boolean36 = properties20.replace((java.lang.Object) (-1L), obj34, (java.lang.Object) 100.0d);
        java.util.Properties properties37 = new java.util.Properties();
        java.util.Properties properties38 = new java.util.Properties(properties37);
        properties38.clear();
        properties20.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties38);
        boolean boolean41 = properties3.equals((java.lang.Object) properties20);
        java.util.Set<java.lang.Object> objSet42 = properties3.keySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties43.logBaseDir = "";
        atomikosProperties43.setConsoleFileCount((int) (short) 10);
        long long48 = atomikosProperties43.getMaxTimeout();
        atomikosProperties43.service = "";
        java.lang.String str51 = atomikosProperties43.logBaseDir;
        java.lang.String str52 = atomikosProperties43.getLogBaseDir();
        atomikosProperties43.setMaxActives(0);
        boolean boolean55 = atomikosProperties43.isEnableLogging();
        int int56 = atomikosProperties43.getMaxActives();
        java.lang.Object obj57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = properties3.putIfAbsent((java.lang.Object) atomikosProperties43, obj57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 300000L + "'", long19 == 300000L);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objSet42);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 300000L + "'", long48 == 300000L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        int int9 = atomikosProperties0.getConsoleFileLimit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel10 = atomikosProperties0.consoleLogLevel;
        java.lang.String str11 = atomikosProperties0.logBaseName;
        boolean boolean12 = atomikosProperties0.serialJtaTransactions;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel10 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel10.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tmlog" + "'", str11, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "";
        boolean boolean10 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.maxActives = (byte) 1;
        atomikosProperties0.setConsoleFileCount(100);
        atomikosProperties0.outputDir = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}";
        atomikosProperties0.setService("tmlog");
        atomikosProperties0.consoleFileCount = 0;
        atomikosProperties0.maxTimeout = (byte) 1;
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setLogBaseName("hi!");
        boolean boolean10 = atomikosProperties0.isAllowSubTransactions();
        boolean boolean11 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean12 = atomikosProperties0.forceShutdownOnVmExit;
        boolean boolean13 = atomikosProperties0.enableLogging;
        atomikosProperties0.setTransactionManagerUniqueName("");
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        java.lang.String str18 = atomikosProperties0.consoleFileName;
        atomikosProperties0.setLogBaseDir("{{}=tmlog}");
        atomikosProperties0.consoleFileLimit = (short) -1;
        java.lang.String str23 = atomikosProperties0.getLogBaseDir();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "tm.out" + "'", str18, "tm.out");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{{}=tmlog}" + "'", str23, "{{}=tmlog}");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        java.util.Set<java.lang.String> strSet8 = properties7.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int10 = atomikosProperties9.getConsoleFileCount();
        int int11 = atomikosProperties9.maxActives;
        atomikosProperties9.setConsoleFileName("");
        atomikosProperties9.transactionManagerUniqueName = "{}";
        java.util.Properties properties16 = atomikosProperties9.asProperties();
        java.util.Properties properties17 = new java.util.Properties(properties16);
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties17.keys();
        boolean boolean20 = properties17.containsKey((java.lang.Object) 86400000L);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.logBaseDir = "";
        atomikosProperties21.setConsoleFileCount((int) (short) 10);
        long long26 = atomikosProperties21.getMaxTimeout();
        atomikosProperties21.service = "";
        boolean boolean29 = atomikosProperties21.isSerialJtaTransactions();
        boolean boolean30 = atomikosProperties21.enableLogging;
        boolean boolean31 = properties7.remove((java.lang.Object) boolean20, (java.lang.Object) boolean30);
        java.util.Set<java.lang.String> strSet32 = properties7.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties33.logBaseDir = "";
        atomikosProperties33.setConsoleFileCount((int) (short) 10);
        long long38 = atomikosProperties33.getMaxTimeout();
        java.util.Properties properties39 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet40 = properties39.keySet();
        atomikosProperties33.set(properties39, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj46 = properties39.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties47.setDefaultJtaTimeout((-1L));
        java.util.Properties properties50 = new java.util.Properties();
        java.lang.Object obj52 = properties50.get((java.lang.Object) 0.0d);
        java.lang.Object obj53 = properties50.clone();
        boolean boolean55 = properties39.replace((java.lang.Object) (-1L), obj53, (java.lang.Object) 100.0d);
        java.util.Properties properties56 = new java.util.Properties();
        java.util.Properties properties57 = new java.util.Properties(properties56);
        properties57.clear();
        properties39.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties57);
        java.util.Enumeration<java.lang.Object> objEnumeration60 = properties57.elements();
        java.lang.String str62 = properties57.getProperty("");
        java.util.Properties properties63 = new java.util.Properties(properties57);
        java.util.Enumeration<java.lang.Object> objEnumeration64 = properties63.elements();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet65 = properties63.entrySet();
        java.util.Properties properties66 = new java.util.Properties(properties63);
        boolean boolean67 = properties7.containsValue((java.lang.Object) properties63);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 300000L + "'", long26 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 300000L + "'", long38 == 300000L);
        org.junit.Assert.assertNotNull(objSet40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "{}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objEnumeration60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(objEnumeration64);
        org.junit.Assert.assertNotNull(objEntrySet65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        boolean boolean6 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean7 = atomikosProperties0.enableLogging;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Properties properties9 = new java.util.Properties(properties8);
        boolean boolean11 = properties9.containsValue((java.lang.Object) 100.0f);
        java.util.Properties properties12 = new java.util.Properties(properties9);
        java.util.Set<java.lang.Object> objSet13 = properties12.keySet();
        java.util.Enumeration<?> wildcardEnumeration14 = properties12.propertyNames();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(wildcardEnumeration14);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.service = "";
        boolean boolean8 = atomikosProperties0.isSerialJtaTransactions();
        boolean boolean9 = atomikosProperties0.isForceShutdownOnVmExit();
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        atomikosProperties0.threadedTwoPhaseCommit = true;
        atomikosProperties0.setForceShutdownOnVmExit(false);
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.setForceShutdownOnVmExit(false);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery22 = atomikosProperties0.getRecovery();
        atomikosProperties0.service = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(recovery22);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.maxRetries = (-1);
        recovery0.setDelay((long) (short) 0);
        recovery0.maxRetries = 0;
        recovery0.setMaxRetries((int) '#');
        int int9 = recovery0.maxRetries;
        recovery0.setRetryInterval((long) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = properties6.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties14.setDefaultJtaTimeout((-1L));
        java.util.Properties properties17 = new java.util.Properties();
        java.lang.Object obj19 = properties17.get((java.lang.Object) 0.0d);
        java.lang.Object obj20 = properties17.clone();
        boolean boolean22 = properties6.replace((java.lang.Object) (-1L), obj20, (java.lang.Object) 100.0d);
        java.util.Properties properties23 = new java.util.Properties();
        java.util.Properties properties24 = new java.util.Properties(properties23);
        properties24.clear();
        properties6.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties24);
        java.util.Enumeration<java.lang.Object> objEnumeration27 = properties24.elements();
        java.lang.String str29 = properties24.getProperty("");
        java.util.Properties properties30 = new java.util.Properties(properties24);
        java.util.Enumeration<java.lang.Object> objEnumeration31 = properties30.elements();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet32 = properties30.entrySet();
        java.util.Properties properties33 = new java.util.Properties(properties30);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties34.setDefaultJtaTimeout((-1L));
        int int37 = atomikosProperties34.getConsoleFileLimit();
        java.util.Properties properties38 = atomikosProperties34.asProperties();
        boolean boolean39 = atomikosProperties34.forceShutdownOnVmExit;
        boolean boolean40 = atomikosProperties34.forceShutdownOnVmExit;
        atomikosProperties34.setOutputDir("tmlog");
        long long43 = atomikosProperties34.maxTimeout;
        atomikosProperties34.defaultJtaTimeout = 'a';
        boolean boolean46 = atomikosProperties34.isSerialJtaTransactions();
        atomikosProperties34.consoleFileCount = '#';
        java.lang.Object obj49 = properties33.get((java.lang.Object) atomikosProperties34);
        atomikosProperties34.checkpointInterval = 100;
        atomikosProperties34.consoleFileCount = 19;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objEnumeration27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(objEnumeration31);
        org.junit.Assert.assertNotNull(objEntrySet32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 300000L + "'", long43 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.service = "";
        java.lang.String str8 = atomikosProperties0.logBaseDir;
        boolean boolean9 = atomikosProperties0.threadedTwoPhaseCommit;
        java.lang.String str10 = atomikosProperties0.getService();
        java.lang.String str11 = atomikosProperties0.consoleFileName;
        boolean boolean12 = atomikosProperties0.serialJtaTransactions;
        java.lang.String str13 = atomikosProperties0.getLogBaseDir();
        int int14 = atomikosProperties0.maxActives;
        int int15 = atomikosProperties0.maxActives;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tm.out" + "'", str11, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setSerialJtaTransactions(false);
        boolean boolean6 = atomikosProperties0.enableLogging;
        int int7 = atomikosProperties0.getMaxActives();
        java.lang.String str8 = atomikosProperties0.logBaseName;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel9 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tmlog" + "'", str8, "tmlog");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel9 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel9.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Properties properties9 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties10.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel13 = null;
        atomikosProperties10.consoleLogLevel = atomikosLoggingLevel13;
        atomikosProperties10.outputDir = "";
        int int17 = atomikosProperties10.maxActives;
        boolean boolean18 = atomikosProperties10.isThreadedTwoPhaseCommit();
        atomikosProperties10.consoleFileLimit = (short) 10;
        java.util.Properties properties21 = atomikosProperties10.asProperties();
        java.util.Properties properties22 = new java.util.Properties(properties21);
        java.util.Properties properties23 = new java.util.Properties(properties22);
        properties9.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties23);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties25.logBaseDir = "";
        atomikosProperties25.setConsoleFileCount((int) (short) 10);
        long long30 = atomikosProperties25.getMaxTimeout();
        atomikosProperties25.service = "";
        java.lang.String str33 = atomikosProperties25.logBaseDir;
        atomikosProperties25.logBaseName = "tmlog";
        atomikosProperties25.transactionManagerUniqueName = "{}";
        boolean boolean38 = atomikosProperties25.isForceShutdownOnVmExit();
        java.util.Properties properties39 = atomikosProperties25.asProperties();
        java.util.Properties properties40 = new java.util.Properties(properties39);
        properties23.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties39);
        java.lang.Object obj42 = properties39.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 300000L + "'", long30 == 300000L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(obj42);
// flaky:         org.junit.Assert.assertEquals(obj42.toString(), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service=, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service=, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service=, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        atomikosProperties0.transactionManagerUniqueName = "{}";
        java.lang.String str7 = atomikosProperties0.logBaseDir;
        atomikosProperties0.setConsoleFileCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        int int7 = atomikosProperties0.getConsoleFileLimit();
        int int8 = atomikosProperties0.getConsoleFileCount();
        boolean boolean9 = atomikosProperties0.enableLogging;
        atomikosProperties0.allowSubTransactions = true;
        boolean boolean12 = atomikosProperties0.isAllowSubTransactions();
        atomikosProperties0.setSerialJtaTransactions(true);
        boolean boolean15 = atomikosProperties0.allowSubTransactions;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.lang.String str13 = atomikosProperties0.logBaseDir;
        boolean boolean14 = atomikosProperties0.isEnableLogging();
        long long15 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.setOutputDir("hi!");
        long long18 = atomikosProperties0.maxTimeout;
        atomikosProperties0.outputDir = "tmlog";
        java.lang.String str21 = atomikosProperties0.logBaseDir;
        java.lang.String str22 = atomikosProperties0.getService();
        long long23 = atomikosProperties0.maxTimeout;
        int int24 = atomikosProperties0.getConsoleFileLimit();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 300000L + "'", long18 == 300000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 300000L + "'", long23 == 300000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        long long7 = atomikosProperties0.defaultJtaTimeout;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Properties properties9 = atomikosProperties0.asProperties();
        java.util.Properties properties10 = new java.util.Properties(properties9);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties9.load(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = properties6.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties14.setDefaultJtaTimeout((-1L));
        java.util.Properties properties17 = new java.util.Properties();
        java.lang.Object obj19 = properties17.get((java.lang.Object) 0.0d);
        java.lang.Object obj20 = properties17.clone();
        boolean boolean22 = properties6.replace((java.lang.Object) (-1L), obj20, (java.lang.Object) 100.0d);
        java.util.Properties properties23 = new java.util.Properties();
        java.util.Properties properties24 = new java.util.Properties(properties23);
        properties24.clear();
        properties6.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties24);
        java.util.Properties properties27 = new java.util.Properties(properties6);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int29 = atomikosProperties28.getConsoleFileCount();
        int int30 = atomikosProperties28.maxActives;
        atomikosProperties28.setConsoleFileName("");
        atomikosProperties28.transactionManagerUniqueName = "{}";
        java.util.Properties properties35 = atomikosProperties28.asProperties();
        java.util.Properties properties36 = new java.util.Properties(properties35);
        java.util.Enumeration<java.lang.Object> objEnumeration37 = properties36.keys();
        boolean boolean38 = properties27.equals((java.lang.Object) properties36);
        java.lang.Object obj39 = properties27.clone();
        java.util.Properties properties40 = new java.util.Properties();
        java.util.Properties properties41 = new java.util.Properties(properties40);
        java.util.Properties properties43 = new java.util.Properties();
        java.lang.Object obj45 = properties43.get((java.lang.Object) 0.0d);
        java.lang.Object obj46 = properties43.clone();
        java.lang.String str47 = properties43.toString();
        boolean boolean50 = properties43.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj51 = properties41.replace((java.lang.Object) 10.0d, (java.lang.Object) properties43);
        java.lang.Object obj52 = properties41.clone();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties53 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties53.logBaseDir = "";
        atomikosProperties53.setConsoleFileCount((int) (short) 10);
        atomikosProperties53.setLogBaseDir("{}");
        java.lang.String str60 = atomikosProperties53.getOutputDir();
        atomikosProperties53.setLogBaseName("hi!");
        boolean boolean63 = atomikosProperties53.isAllowSubTransactions();
        int int64 = atomikosProperties53.getConsoleFileCount();
        java.util.Properties properties65 = atomikosProperties53.asProperties();
        java.util.Enumeration<java.lang.Object> objEnumeration66 = properties65.keys();
        java.util.Properties properties67 = new java.util.Properties(properties65);
        java.lang.Object obj68 = properties27.replace(obj52, (java.lang.Object) properties67);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(objEnumeration37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "{}");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "{}");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{}" + "'", str47, "{}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "{}");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNotNull(objEnumeration66);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setLogBaseName("hi!");
        atomikosProperties0.serialJtaTransactions = true;
        long long12 = atomikosProperties0.checkpointInterval;
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        atomikosProperties0.setMaxTimeout((long) (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 500L + "'", long12 == 500L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        long long3 = atomikosProperties0.checkpointInterval;
        boolean boolean4 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        atomikosProperties0.setOutputDir("");
        atomikosProperties0.setConsoleFileName("hi!");
        atomikosProperties0.setConsoleFileName("hi!");
        java.lang.String str13 = atomikosProperties0.service;
        atomikosProperties0.setMaxActives(97);
        atomikosProperties0.defaultJtaTimeout = 0L;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel18 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel18 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel18.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties2.logBaseDir = "";
        atomikosProperties2.setConsoleFileCount((int) (short) 10);
        atomikosProperties2.setCheckpointInterval(10000L);
        long long9 = atomikosProperties2.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel10 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties2.consoleLogLevel = atomikosLoggingLevel10;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel10;
        java.lang.String str13 = atomikosProperties0.getService();
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        long long16 = atomikosProperties0.getMaxTimeout();
        boolean boolean17 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.setAllowSubTransactions(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel10 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel10.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        long long7 = atomikosProperties0.defaultJtaTimeout;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Properties properties9 = atomikosProperties0.asProperties();
        java.util.Properties properties10 = new java.util.Properties(properties9);
        java.lang.Object obj11 = properties9.clone();
        java.util.Properties properties12 = new java.util.Properties(properties9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "";
        boolean boolean10 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.maxActives = (byte) 1;
        atomikosProperties0.setConsoleFileCount(100);
        atomikosProperties0.outputDir = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}";
        atomikosProperties0.setService("tmlog");
        boolean boolean19 = atomikosProperties0.threadedTwoPhaseCommit;
        int int20 = atomikosProperties0.consoleFileCount;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.logBaseDir = "";
        atomikosProperties21.setConsoleFileCount((int) (short) 10);
        long long26 = atomikosProperties21.getMaxTimeout();
        java.util.Properties properties27 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet28 = properties27.keySet();
        atomikosProperties21.set(properties27, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str32 = atomikosProperties21.logBaseDir;
        java.lang.String str33 = atomikosProperties21.logBaseDir;
        java.util.Properties properties34 = atomikosProperties21.asProperties();
        atomikosProperties21.consoleFileLimit = (byte) 10;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties37.logBaseDir = "";
        boolean boolean40 = atomikosProperties37.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties41.logBaseDir = "";
        atomikosProperties41.setConsoleFileCount((int) (short) 10);
        long long46 = atomikosProperties41.getMaxTimeout();
        java.util.Properties properties47 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet48 = properties47.keySet();
        atomikosProperties41.set(properties47, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj54 = properties47.setProperty("", "hi!");
        java.util.Properties properties55 = new java.util.Properties();
        java.util.Properties properties56 = new java.util.Properties(properties55);
        java.util.Collection<java.lang.Object> objCollection57 = properties55.values();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel58 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        boolean boolean59 = properties47.remove((java.lang.Object) objCollection57, (java.lang.Object) atomikosLoggingLevel58);
        atomikosProperties37.setConsoleLogLevel(atomikosLoggingLevel58);
        atomikosProperties21.setConsoleLogLevel(atomikosLoggingLevel58);
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel58;
        java.lang.String str63 = atomikosProperties0.getOutputDir();
        java.util.Properties properties64 = atomikosProperties0.asProperties();
        java.io.Writer writer65 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties64.store(writer65, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=hi!, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 300000L + "'", long26 == 300000L);
        org.junit.Assert.assertNotNull(objSet28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 300000L + "'", long46 == 300000L);
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(objCollection57);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel58 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel58.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}" + "'", str63, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}");
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Set<java.lang.String> strSet9 = properties8.stringPropertyNames();
        java.util.Enumeration<java.lang.Object> objEnumeration10 = properties8.elements();
        java.util.Properties properties11 = new java.util.Properties(properties8);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet12 = properties8.entrySet();
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties8.save(outputStream13, "{{com.atomikos.icatch.hi!=-1.0}=tmlog}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(objEnumeration10);
        org.junit.Assert.assertNotNull(objEntrySet12);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int7 = atomikosProperties6.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties8.logBaseDir = "";
        atomikosProperties8.setConsoleFileCount((int) (short) 10);
        atomikosProperties8.setCheckpointInterval(10000L);
        long long15 = atomikosProperties8.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel16 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties8.consoleLogLevel = atomikosLoggingLevel16;
        atomikosProperties6.consoleLogLevel = atomikosLoggingLevel16;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel16;
        boolean boolean20 = atomikosProperties0.isAllowSubTransactions();
        java.lang.String str21 = atomikosProperties0.getTransactionManagerUniqueName();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel22 = atomikosProperties0.consoleLogLevel;
        boolean boolean23 = atomikosProperties0.serialJtaTransactions;
        boolean boolean24 = atomikosProperties0.serialJtaTransactions;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel16 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel16.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel22 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel22.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        boolean boolean6 = atomikosProperties0.forceShutdownOnVmExit;
        boolean boolean7 = atomikosProperties0.enableLogging;
        atomikosProperties0.consoleFileName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.hi!=-1.0, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000, =hi!}";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        long long7 = atomikosProperties0.defaultJtaTimeout;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        long long14 = atomikosProperties9.getMaxTimeout();
        java.util.Properties properties15 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet16 = properties15.keySet();
        atomikosProperties9.set(properties15, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj22 = properties15.setProperty("", "hi!");
        java.util.Set<java.lang.String> strSet23 = properties15.stringPropertyNames();
        properties8.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties15);
        java.util.Properties properties25 = new java.util.Properties(properties15);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties26.logBaseDir = "";
        atomikosProperties26.checkpointInterval = 0;
        boolean boolean31 = atomikosProperties26.isThreadedTwoPhaseCommit();
        atomikosProperties26.setSerialJtaTransactions(false);
        long long34 = atomikosProperties26.getMaxTimeout();
        atomikosProperties26.maxTimeout = 100;
        java.lang.Class<?> wildcardClass37 = atomikosProperties26.getClass();
        boolean boolean38 = properties25.containsValue((java.lang.Object) wildcardClass37);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        long long40 = atomikosProperties39.defaultJtaTimeout;
        atomikosProperties39.logBaseName = "tm.out";
        java.lang.String str43 = atomikosProperties39.consoleFileName;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties44 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties44.logBaseDir = "";
        atomikosProperties44.setConsoleFileCount((int) (short) 10);
        java.lang.String str49 = atomikosProperties44.logBaseName;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel50 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN;
        atomikosProperties44.consoleLogLevel = atomikosLoggingLevel50;
        atomikosProperties39.setConsoleLogLevel(atomikosLoggingLevel50);
        java.lang.String str53 = atomikosProperties39.getLogBaseDir();
        atomikosProperties39.logBaseName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}";
        boolean boolean56 = atomikosProperties39.enableLogging;
        atomikosProperties39.setConsoleFileName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, {}={}, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.lang.Object obj59 = properties25.remove((java.lang.Object) atomikosProperties39);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 300000L + "'", long34 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10000L + "'", long40 == 10000L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "tm.out" + "'", str43, "tm.out");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "tmlog" + "'", str49, "tmlog");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel50 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel50.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        int int9 = atomikosProperties0.getConsoleFileLimit();
        boolean boolean10 = atomikosProperties0.threadedTwoPhaseCommit;
        atomikosProperties0.logBaseName = "{com.atomikos.icatch.hi!=-1.0}";
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.maxRetries = (-1);
        recovery0.setDelay((long) (short) 0);
        long long5 = recovery0.forgetOrphanedLogEntriesDelay;
        recovery0.setDelay((long) 1);
        long long8 = recovery0.getDelay();
        recovery0.maxRetries = 0;
        long long11 = recovery0.getRetryInterval();
        recovery0.setRetryInterval((long) (byte) 10);
        int int14 = recovery0.maxRetries;
        long long15 = recovery0.getRetryInterval();
        long long16 = recovery0.forgetOrphanedLogEntriesDelay;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 86400000L + "'", long5 == 86400000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 86400000L + "'", long16 == 86400000L);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.maxRetries = (-1);
        recovery0.setDelay((long) (short) 0);
        long long5 = recovery0.forgetOrphanedLogEntriesDelay;
        recovery0.setDelay((long) 1);
        long long8 = recovery0.getDelay();
        long long9 = recovery0.getRetryInterval();
        long long10 = recovery0.getRetryInterval();
        recovery0.delay = 5;
        int int13 = recovery0.maxRetries;
        int int14 = recovery0.maxRetries;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 86400000L + "'", long5 == 86400000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setLogBaseName("hi!");
        boolean boolean10 = atomikosProperties0.isAllowSubTransactions();
        boolean boolean11 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean12 = atomikosProperties0.forceShutdownOnVmExit;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery13 = atomikosProperties0.getRecovery();
        java.util.Properties properties14 = atomikosProperties0.asProperties();
        properties14.clear();
        java.lang.String str18 = properties14.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}", "{{}={}}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(recovery13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{{}={}}" + "'", str18, "{{}={}}");
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel3;
        atomikosProperties0.outputDir = "";
        int int7 = atomikosProperties0.maxActives;
        java.lang.String str8 = atomikosProperties0.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = atomikosProperties0.getRecovery();
        long long10 = recovery9.getForgetOrphanedLogEntriesDelay();
        int int11 = recovery9.getMaxRetries();
        long long12 = recovery9.getForgetOrphanedLogEntriesDelay();
        recovery9.setDelay(5L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(recovery9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 86400000L + "'", long12 == 86400000L);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        long long1 = atomikosProperties0.defaultJtaTimeout;
        atomikosProperties0.logBaseName = "tm.out";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties4.logBaseDir = "";
        atomikosProperties4.setConsoleFileCount((int) (short) 10);
        long long9 = atomikosProperties4.getMaxTimeout();
        java.util.Properties properties10 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet11 = properties10.keySet();
        atomikosProperties4.set(properties10, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj17 = properties10.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties18.setDefaultJtaTimeout((-1L));
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = properties21.clone();
        boolean boolean26 = properties10.replace((java.lang.Object) (-1L), obj24, (java.lang.Object) 100.0d);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties28.logBaseDir = "";
        atomikosProperties28.setConsoleFileCount((int) (short) 10);
        long long33 = atomikosProperties28.getMaxTimeout();
        java.util.Properties properties34 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet35 = properties34.keySet();
        atomikosProperties28.set(properties34, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj41 = properties34.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties42.setDefaultJtaTimeout((-1L));
        java.util.Properties properties45 = new java.util.Properties();
        java.lang.Object obj47 = properties45.get((java.lang.Object) 0.0d);
        java.lang.Object obj48 = properties45.clone();
        boolean boolean50 = properties34.replace((java.lang.Object) (-1L), obj48, (java.lang.Object) 100.0d);
        java.util.Properties properties51 = new java.util.Properties();
        java.util.Properties properties52 = new java.util.Properties(properties51);
        properties52.clear();
        properties34.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties52);
        java.util.Enumeration<java.lang.Object> objEnumeration55 = properties52.elements();
        java.lang.String str57 = properties52.getProperty("");
        java.util.Properties properties58 = new java.util.Properties();
        java.lang.Object obj60 = properties58.get((java.lang.Object) 0.0d);
        java.lang.Object obj61 = properties58.clone();
        java.lang.String str62 = properties58.toString();
        boolean boolean64 = properties52.remove((java.lang.Object) properties58, (java.lang.Object) 0);
        java.util.Enumeration<?> wildcardEnumeration65 = properties52.propertyNames();
        atomikosProperties0.set(properties10, "hi!", (java.lang.Object) wildcardEnumeration65);
        java.lang.String str67 = atomikosProperties0.transactionManagerUniqueName;
        atomikosProperties0.setForceShutdownOnVmExit(false);
        java.lang.String str70 = atomikosProperties0.outputDir;
        boolean boolean71 = atomikosProperties0.isEnableLogging();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 300000L + "'", long33 == 300000L);
        org.junit.Assert.assertNotNull(objSet35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "{}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objEnumeration55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "{}");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "{}" + "'", str62, "{}");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardEnumeration65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.transactionManagerUniqueName;
        atomikosProperties0.setService("{}");
        atomikosProperties0.consoleFileName = "tm.out";
        atomikosProperties0.service = "{com.atomikos.icatch.hi!=-1.0, =hi!}";
        atomikosProperties0.setLogBaseDir("{{{}={}}={com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}}");
        java.util.Properties properties14 = atomikosProperties0.asProperties();
        java.util.Properties properties15 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{{{}={}}={com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}}";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setSerialJtaTransactions(false);
        boolean boolean6 = atomikosProperties0.enableLogging;
        atomikosProperties0.setTransactionManagerUniqueName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        boolean boolean9 = atomikosProperties0.enableLogging;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setService("tmlog");
        atomikosProperties0.setConsoleFileLimit((int) (short) 0);
        atomikosProperties0.setDefaultJtaTimeout((long) 19);
        atomikosProperties0.threadedTwoPhaseCommit = false;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        java.lang.String str5 = atomikosProperties0.getOutputDir();
        atomikosProperties0.service = "tmlog";
        java.lang.String str8 = atomikosProperties0.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.setDefaultJtaTimeout((-1L));
        long long12 = atomikosProperties9.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int14 = atomikosProperties13.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties15.logBaseDir = "";
        atomikosProperties15.setConsoleFileCount((int) (short) 10);
        atomikosProperties15.setCheckpointInterval(10000L);
        long long22 = atomikosProperties15.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel23 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties15.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties13.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties9.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel23);
        java.lang.String str28 = atomikosProperties0.transactionManagerUniqueName;
        java.util.Properties properties29 = atomikosProperties0.asProperties();
        java.util.Properties properties30 = new java.util.Properties();
        java.lang.Object obj32 = properties30.get((java.lang.Object) 0.0d);
        java.lang.Object obj33 = properties30.clone();
        java.lang.String str34 = properties30.toString();
        java.util.Properties properties35 = new java.util.Properties(properties30);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties36 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties36.setDefaultJtaTimeout((-1L));
        int int39 = atomikosProperties36.getConsoleFileLimit();
        java.util.Properties properties40 = atomikosProperties36.asProperties();
        java.util.Properties properties41 = new java.util.Properties(properties40);
        java.util.Properties properties42 = new java.util.Properties();
        java.util.Properties properties43 = new java.util.Properties(properties42);
        java.util.Collection<java.lang.Object> objCollection44 = properties43.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties45 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties45.enableLogging = true;
        long long48 = atomikosProperties45.getCheckpointInterval();
        boolean boolean50 = properties43.remove((java.lang.Object) long48, (java.lang.Object) (byte) 100);
        boolean boolean52 = properties43.equals((java.lang.Object) (short) 1);
        java.util.Properties properties53 = new java.util.Properties(properties43);
        java.lang.Class<?> wildcardClass54 = properties53.getClass();
        java.lang.Object obj55 = properties30.put((java.lang.Object) properties40, (java.lang.Object) wildcardClass54);
        java.util.Properties properties56 = new java.util.Properties(properties40);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery57 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery57.maxRetries = (-1);
        recovery57.retryInterval = 10000L;
        long long62 = recovery57.getRetryInterval();
        recovery57.setRetryInterval(52L);
        long long65 = recovery57.getRetryInterval();
        java.lang.Object obj66 = properties29.getOrDefault((java.lang.Object) properties40, (java.lang.Object) recovery57);
        long long67 = recovery57.forgetOrphanedLogEntriesDelay;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 500L + "'", long12 == 500L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 300000L + "'", long22 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel23 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel23.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "{}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(objCollection44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 500L + "'", long48 == 500L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10000L + "'", long62 == 10000L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 52L + "'", long65 == 52L);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 86400000L + "'", long67 == 86400000L);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties0.values();
        java.util.Properties properties3 = new java.util.Properties(properties0);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet4 = properties3.entrySet();
        java.util.Enumeration<java.lang.Object> objEnumeration5 = properties3.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties6.logBaseDir = "";
        atomikosProperties6.checkpointInterval = 0;
        boolean boolean11 = atomikosProperties6.isThreadedTwoPhaseCommit();
        atomikosProperties6.setSerialJtaTransactions(false);
        java.util.Properties properties14 = new java.util.Properties();
        java.util.Properties properties15 = new java.util.Properties(properties14);
        java.util.Properties properties16 = new java.util.Properties();
        java.util.Properties properties17 = new java.util.Properties(properties16);
        java.util.Properties properties19 = new java.util.Properties();
        java.lang.Object obj21 = properties19.get((java.lang.Object) 0.0d);
        java.lang.Object obj22 = properties19.clone();
        java.lang.String str23 = properties19.toString();
        boolean boolean26 = properties19.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj27 = properties17.replace((java.lang.Object) 10.0d, (java.lang.Object) properties19);
        java.lang.String str28 = properties19.toString();
        java.util.Properties properties29 = new java.util.Properties(properties19);
        java.util.Properties properties30 = new java.util.Properties();
        java.util.Properties properties31 = new java.util.Properties(properties30);
        java.util.Properties properties33 = new java.util.Properties();
        java.lang.Object obj35 = properties33.get((java.lang.Object) 0.0d);
        java.lang.Object obj36 = properties33.clone();
        java.lang.String str37 = properties33.toString();
        boolean boolean40 = properties33.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj41 = properties31.replace((java.lang.Object) 10.0d, (java.lang.Object) properties33);
        java.util.Properties properties42 = new java.util.Properties(properties31);
        properties29.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties42);
        boolean boolean44 = properties14.contains((java.lang.Object) properties29);
        boolean boolean45 = properties29.isEmpty();
        java.util.Properties properties46 = new java.util.Properties();
        java.util.Properties properties47 = new java.util.Properties(properties46);
        java.util.Collection<java.lang.Object> objCollection48 = properties47.values();
        java.lang.Object obj51 = properties47.setProperty("hi!", "{}");
        java.lang.String str53 = properties47.getProperty("tmlog");
        properties47.clear();
        java.util.Set<java.lang.String> strSet55 = properties47.stringPropertyNames();
        properties29.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties47);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties58 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties58.enableLogging = true;
        int int61 = atomikosProperties58.consoleFileLimit;
        atomikosProperties58.logBaseName = "hi!";
        atomikosProperties58.enableLogging = false;
        atomikosProperties58.setMaxTimeout((long) '4');
        atomikosProperties58.setMaxTimeout((long) 1);
        atomikosProperties6.set(properties29, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}", (java.lang.Object) 1);
        atomikosProperties6.setConsoleFileLimit(10);
        boolean boolean73 = properties3.containsValue((java.lang.Object) atomikosProperties6);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties74 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties74.enableLogging = true;
        int int77 = atomikosProperties74.consoleFileLimit;
        atomikosProperties74.logBaseName = "hi!";
        atomikosProperties74.setEnableLogging(false);
        atomikosProperties74.setTransactionManagerUniqueName("");
        atomikosProperties74.forceShutdownOnVmExit = true;
        atomikosProperties74.setLogBaseName("hi!");
        atomikosProperties74.setLogBaseName("{{}=tmlog}");
        atomikosProperties74.enableLogging = false;
        java.util.Properties properties92 = atomikosProperties74.asProperties();
        java.lang.Object obj93 = properties3.get((java.lang.Object) properties92);
        java.io.OutputStream outputStream94 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties92.save(outputStream94, "{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertNotNull(objEnumeration5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{}" + "'", str28, "{}");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "{}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objCollection48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(properties92);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        java.lang.String str4 = atomikosProperties0.getService();
        java.lang.String str5 = atomikosProperties0.logBaseDir;
        atomikosProperties0.setEnableLogging(false);
        atomikosProperties0.consoleFileCount = 0;
        long long10 = atomikosProperties0.getMaxTimeout();
        boolean boolean11 = atomikosProperties0.isEnableLogging();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = atomikosProperties0.consoleLogLevel;
        atomikosProperties0.setLogBaseDir("{true=10000}");
        atomikosProperties0.forceShutdownOnVmExit = false;
        long long17 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.setAllowSubTransactions(false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel12 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel12.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300000L + "'", long17 == 300000L);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel3;
        atomikosProperties0.outputDir = "";
        boolean boolean7 = atomikosProperties0.forceShutdownOnVmExit;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        atomikosProperties0.outputDir = "{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        atomikosProperties0.logBaseName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=hi!, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery6 = atomikosProperties0.getRecovery();
        recovery6.setDelay((long) (byte) -1);
        recovery6.forgetOrphanedLogEntriesDelay = 5L;
        recovery6.maxRetries = '4';
        long long13 = recovery6.delay;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(recovery6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        java.lang.String str3 = atomikosProperties0.getService();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties4.logBaseDir = "";
        atomikosProperties4.setConsoleFileCount((int) (short) 10);
        atomikosProperties4.setCheckpointInterval(10000L);
        long long11 = atomikosProperties4.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = atomikosProperties4.getConsoleLogLevel();
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel12;
        java.lang.String str14 = atomikosProperties0.consoleFileName;
        atomikosProperties0.forceShutdownOnVmExit = false;
        atomikosProperties0.setConsoleFileLimit((int) (byte) 1);
        atomikosProperties0.allowSubTransactions = false;
        boolean boolean21 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.setConsoleFileLimit((int) (short) 0);
        long long24 = atomikosProperties0.checkpointInterval;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel12 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel12.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tm.out" + "'", str14, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 500L + "'", long24 == 500L);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties0.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties3.enableLogging = true;
        long long6 = atomikosProperties3.getCheckpointInterval();
        atomikosProperties3.setSerialJtaTransactions(false);
        atomikosProperties3.consoleFileLimit = 'a';
        boolean boolean11 = atomikosProperties3.isEnableLogging();
        long long12 = atomikosProperties3.getMaxTimeout();
        java.lang.Object obj13 = properties0.get((java.lang.Object) atomikosProperties3);
        java.lang.String str14 = atomikosProperties3.getService();
        atomikosProperties3.setTransactionManagerUniqueName("{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=52, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=0, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name={com.atomikos.icatch.hi!=-1.0}, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.get((java.lang.Object) 0.0d);
        java.lang.Object obj3 = properties0.clone();
        java.lang.String str4 = properties0.toString();
        boolean boolean7 = properties0.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj8 = null;
        boolean boolean9 = properties0.equals(obj8);
        java.util.Properties properties10 = new java.util.Properties();
        java.lang.Object obj12 = properties10.get((java.lang.Object) 0.0d);
        java.lang.Object obj13 = properties10.clone();
        java.lang.Object obj16 = properties10.setProperty("{}", "{}");
        int int17 = properties10.size();
        properties0.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties10);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties19.logBaseDir = "";
        boolean boolean22 = atomikosProperties19.isForceShutdownOnVmExit();
        atomikosProperties19.allowSubTransactions = false;
        boolean boolean25 = atomikosProperties19.serialJtaTransactions;
        boolean boolean26 = properties0.containsKey((java.lang.Object) boolean25);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties27.logBaseDir = "";
        atomikosProperties27.setConsoleFileCount((int) (short) 10);
        atomikosProperties27.setLogBaseDir("{}");
        java.util.Properties properties34 = atomikosProperties27.asProperties();
        java.util.Set<java.lang.String> strSet35 = properties34.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties36 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int37 = atomikosProperties36.getConsoleFileCount();
        int int38 = atomikosProperties36.maxActives;
        atomikosProperties36.setConsoleFileName("");
        atomikosProperties36.transactionManagerUniqueName = "{}";
        java.util.Properties properties43 = atomikosProperties36.asProperties();
        boolean boolean44 = atomikosProperties36.threadedTwoPhaseCommit;
        atomikosProperties36.enableLogging = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int48 = atomikosProperties47.getConsoleFileCount();
        int int49 = atomikosProperties47.maxActives;
        atomikosProperties47.setConsoleFileName("");
        atomikosProperties47.transactionManagerUniqueName = "{}";
        atomikosProperties47.setMaxActives(0);
        boolean boolean56 = atomikosProperties47.forceShutdownOnVmExit;
        java.lang.Object obj57 = properties34.put((java.lang.Object) atomikosProperties36, (java.lang.Object) atomikosProperties47);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties58 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties58.logBaseDir = "";
        boolean boolean61 = atomikosProperties58.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery62 = atomikosProperties58.getRecovery();
        boolean boolean63 = properties34.contains((java.lang.Object) atomikosProperties58);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int65 = atomikosProperties64.getConsoleFileCount();
        int int66 = atomikosProperties64.maxActives;
        int int67 = atomikosProperties64.getMaxActives();
        boolean boolean68 = properties0.remove((java.lang.Object) atomikosProperties58, (java.lang.Object) int67);
        int int69 = atomikosProperties58.getConsoleFileLimit();
        atomikosProperties58.setDefaultJtaTimeout((long) 0);
        java.util.Properties properties72 = atomikosProperties58.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel73 = atomikosProperties58.consoleLogLevel;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50 + "'", int38 == 50);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 50 + "'", int49 == 50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(recovery62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 50 + "'", int66 == 50);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 50 + "'", int67 == 50);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel73 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel73.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        long long3 = atomikosProperties0.checkpointInterval;
        boolean boolean4 = atomikosProperties0.forceShutdownOnVmExit;
        int int5 = atomikosProperties0.getMaxActives();
        java.lang.String str6 = atomikosProperties0.getTransactionManagerUniqueName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.service = "hi!";
        atomikosProperties0.consoleFileLimit = 5;
        long long8 = atomikosProperties0.getDefaultJtaTimeout();
        boolean boolean9 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setAllowSubTransactions(false);
        atomikosProperties0.setSerialJtaTransactions(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel3;
        atomikosProperties0.outputDir = "";
        atomikosProperties0.maxActives = (short) 100;
        atomikosProperties0.maxActives = 100;
        java.util.Properties properties11 = atomikosProperties0.asProperties();
        java.util.Properties properties12 = atomikosProperties0.asProperties();
        atomikosProperties0.consoleFileCount = 21;
        java.lang.String str15 = atomikosProperties0.getService();
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.lang.String str6 = atomikosProperties0.getLogBaseName();
        atomikosProperties0.service = "tmlog";
        atomikosProperties0.setTransactionManagerUniqueName("{com.atomikos.icatch.hi!=-1.0}");
        int int11 = atomikosProperties0.getConsoleFileCount();
        java.lang.String str12 = atomikosProperties0.outputDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int14 = atomikosProperties13.getConsoleFileCount();
        int int15 = atomikosProperties13.maxActives;
        java.lang.String str16 = atomikosProperties13.getService();
        atomikosProperties13.setConsoleFileLimit((int) (short) 0);
        java.util.Properties properties19 = atomikosProperties13.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties20.setDefaultJtaTimeout((-1L));
        int int23 = atomikosProperties20.getConsoleFileLimit();
        atomikosProperties20.serialJtaTransactions = false;
        atomikosProperties20.logBaseName = "{com.atomikos.icatch.hi!=-1.0}";
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel28 = atomikosProperties20.consoleLogLevel;
        atomikosProperties20.setEnableLogging(true);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties31.logBaseDir = "";
        atomikosProperties31.setConsoleFileCount((int) (short) 10);
        java.lang.String str36 = atomikosProperties31.logBaseName;
        atomikosProperties31.outputDir = "";
        java.util.Properties properties39 = atomikosProperties31.asProperties();
        long long40 = atomikosProperties31.getDefaultJtaTimeout();
        atomikosProperties31.logBaseDir = "{true=10000}";
        java.util.Properties properties43 = atomikosProperties31.asProperties();
        java.lang.Object obj44 = properties19.putIfAbsent((java.lang.Object) atomikosProperties20, (java.lang.Object) atomikosProperties31);
        int int45 = properties19.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties47.logBaseDir = "";
        atomikosProperties47.setConsoleFileCount((int) (short) 10);
        java.lang.String str52 = atomikosProperties47.logBaseName;
        atomikosProperties47.outputDir = "";
        java.util.Properties properties55 = atomikosProperties47.asProperties();
        java.util.Properties properties56 = atomikosProperties47.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties57.enableLogging = true;
        long long60 = atomikosProperties57.getCheckpointInterval();
        atomikosProperties57.setService("tmlog");
        atomikosProperties57.setCheckpointInterval((long) (short) 0);
        long long65 = atomikosProperties57.getCheckpointInterval();
        java.lang.String str66 = atomikosProperties57.getService();
        atomikosProperties57.setMaxActives((int) (short) 100);
        java.lang.Object obj69 = properties56.remove((java.lang.Object) atomikosProperties57);
        atomikosProperties57.maxTimeout = 5;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel72 = atomikosProperties57.getConsoleLogLevel();
        atomikosProperties0.set(properties19, "{com.atomikos.icatch.hi!=-1.0}", (java.lang.Object) atomikosLoggingLevel72);
        java.util.Collection<java.lang.Object> objCollection74 = properties19.values();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "tmlog" + "'", str6, "tmlog");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel28 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel28.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "tmlog" + "'", str36, "tmlog");
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10000L + "'", long40 == 10000L);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 19 + "'", int45 == 19);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "tmlog" + "'", str52, "tmlog");
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 500L + "'", long60 == 500L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "tmlog" + "'", str66, "tmlog");
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel72 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel72.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(objCollection74);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.service = "";
        java.lang.String str8 = atomikosProperties0.logBaseDir;
        boolean boolean9 = atomikosProperties0.threadedTwoPhaseCommit;
        java.lang.String str10 = atomikosProperties0.getTransactionManagerUniqueName();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel11 = atomikosProperties0.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel11 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel11.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel12 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel12.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        long long1 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.setLogBaseDir("{}");
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel4 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.DEBUG;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel4);
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        int int8 = atomikosProperties0.maxActives;
        atomikosProperties0.setSerialJtaTransactions(false);
        atomikosProperties0.maxTimeout = 10000L;
        boolean boolean13 = atomikosProperties0.serialJtaTransactions;
        atomikosProperties0.setSerialJtaTransactions(false);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 500L + "'", long1 == 500L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel4 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.DEBUG + "'", atomikosLoggingLevel4.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.DEBUG));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Properties properties9 = atomikosProperties0.asProperties();
        java.util.Properties properties10 = new java.util.Properties(properties9);
        java.util.Properties properties11 = new java.util.Properties(properties9);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties12.enableLogging = true;
        long long15 = atomikosProperties12.getCheckpointInterval();
        java.lang.String str16 = atomikosProperties12.getOutputDir();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel17 = atomikosProperties12.getConsoleLogLevel();
        long long18 = atomikosProperties12.defaultJtaTimeout;
        java.lang.Object obj19 = properties9.remove((java.lang.Object) atomikosProperties12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel17 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel17.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10000L + "'", long18 == 10000L);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties1.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties3.enableLogging = true;
        long long6 = atomikosProperties3.getCheckpointInterval();
        boolean boolean8 = properties1.remove((java.lang.Object) long6, (java.lang.Object) (byte) 100);
        boolean boolean10 = properties1.equals((java.lang.Object) (short) 1);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet11 = properties1.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties12.setDefaultJtaTimeout((-1L));
        long long15 = atomikosProperties12.checkpointInterval;
        boolean boolean16 = atomikosProperties12.forceShutdownOnVmExit;
        atomikosProperties12.setThreadedTwoPhaseCommit(true);
        boolean boolean19 = properties1.contains((java.lang.Object) true);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties20.logBaseDir = "";
        atomikosProperties20.setConsoleFileCount((int) (short) 10);
        long long25 = atomikosProperties20.getMaxTimeout();
        java.util.Properties properties26 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet27 = properties26.keySet();
        atomikosProperties20.set(properties26, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str31 = atomikosProperties20.logBaseDir;
        java.lang.String str32 = atomikosProperties20.logBaseDir;
        java.lang.String str33 = atomikosProperties20.logBaseDir;
        boolean boolean34 = atomikosProperties20.isEnableLogging();
        boolean boolean35 = atomikosProperties20.forceShutdownOnVmExit;
        boolean boolean36 = properties1.containsValue((java.lang.Object) atomikosProperties20);
        boolean boolean37 = properties1.isEmpty();
        java.util.Properties properties38 = new java.util.Properties(properties1);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties39.logBaseDir = "";
        atomikosProperties39.setConsoleFileCount((int) (short) 10);
        long long44 = atomikosProperties39.getMaxTimeout();
        java.util.Properties properties45 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet46 = properties45.keySet();
        atomikosProperties39.set(properties45, "hi!", (java.lang.Object) (-1.0f));
        java.util.Enumeration<java.lang.Object> objEnumeration50 = properties45.keys();
        java.util.Properties properties51 = new java.util.Properties(properties45);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties52 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties52.logBaseDir = "";
        atomikosProperties52.setConsoleFileCount((int) (short) 10);
        atomikosProperties52.setLogBaseDir("{}");
        java.lang.String str59 = atomikosProperties52.getOutputDir();
        atomikosProperties52.setLogBaseName("hi!");
        boolean boolean62 = atomikosProperties52.isAllowSubTransactions();
        int int63 = atomikosProperties52.consoleFileCount;
        atomikosProperties52.setLogBaseDir("tm.out");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties66 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties66.logBaseDir = "";
        atomikosProperties66.setConsoleFileCount((int) (short) 10);
        long long71 = atomikosProperties66.getMaxTimeout();
        boolean boolean72 = atomikosProperties66.enableLogging;
        java.lang.String str73 = atomikosProperties66.logBaseDir;
        boolean boolean74 = properties1.replace((java.lang.Object) properties45, (java.lang.Object) "tm.out", (java.lang.Object) str73);
        java.lang.Object obj77 = properties1.setProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, tmlog=tmlog, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}", "{{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}={com.atomikos.icatch.hi!=-1.0, =hi!}}");
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objEntrySet11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 300000L + "'", long25 == 300000L);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 300000L + "'", long44 == 300000L);
        org.junit.Assert.assertNotNull(objSet46);
        org.junit.Assert.assertNotNull(objEnumeration50);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 300000L + "'", long71 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "";
        boolean boolean10 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.defaultJtaTimeout = 0L;
        atomikosProperties0.serialJtaTransactions = false;
        long long15 = atomikosProperties0.defaultJtaTimeout;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties16.logBaseDir = "";
        atomikosProperties16.setConsoleFileCount((int) (short) 10);
        atomikosProperties16.setLogBaseDir("{}");
        java.lang.String str23 = atomikosProperties16.getOutputDir();
        atomikosProperties16.setLogBaseName("hi!");
        atomikosProperties16.serialJtaTransactions = true;
        long long28 = atomikosProperties16.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int30 = atomikosProperties29.getConsoleFileCount();
        int int31 = atomikosProperties29.maxActives;
        atomikosProperties29.setEnableLogging(false);
        atomikosProperties29.threadedTwoPhaseCommit = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties36 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties36.enableLogging = true;
        long long39 = atomikosProperties36.getCheckpointInterval();
        java.lang.String str40 = atomikosProperties36.getService();
        java.lang.String str41 = atomikosProperties36.logBaseDir;
        atomikosProperties36.setEnableLogging(false);
        atomikosProperties36.consoleFileCount = 0;
        long long46 = atomikosProperties36.getMaxTimeout();
        boolean boolean47 = atomikosProperties36.isEnableLogging();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel48 = atomikosProperties36.consoleLogLevel;
        atomikosProperties29.consoleLogLevel = atomikosLoggingLevel48;
        atomikosProperties16.setConsoleLogLevel(atomikosLoggingLevel48);
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel48;
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 500L + "'", long28 == 500L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 500L + "'", long39 == 500L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 300000L + "'", long46 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel48 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel48.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        atomikosProperties0.transactionManagerUniqueName = "{}";
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        atomikosProperties0.consoleFileName = "hi!";
        long long10 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.checkpointInterval = ' ';
        atomikosProperties0.defaultJtaTimeout = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.service = "";
        java.lang.String str8 = atomikosProperties0.logBaseDir;
        atomikosProperties0.logBaseName = "tmlog";
        atomikosProperties0.transactionManagerUniqueName = "{}";
        boolean boolean13 = atomikosProperties0.isForceShutdownOnVmExit();
        java.util.Properties properties14 = atomikosProperties0.asProperties();
        boolean boolean15 = atomikosProperties0.allowSubTransactions;
        boolean boolean16 = atomikosProperties0.enableLogging;
        java.lang.String str17 = atomikosProperties0.getOutputDir();
        boolean boolean18 = atomikosProperties0.isForceShutdownOnVmExit();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.get((java.lang.Object) 0.0d);
        java.lang.Object obj3 = properties0.clone();
        java.lang.String str4 = properties0.toString();
        java.util.Properties properties5 = new java.util.Properties(properties0);
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Properties properties7 = new java.util.Properties(properties6);
        java.util.Collection<java.lang.Object> objCollection8 = properties6.values();
        int int9 = properties6.size();
        java.util.Enumeration<java.lang.Object> objEnumeration10 = properties6.elements();
        boolean boolean11 = properties5.equals((java.lang.Object) objEnumeration10);
        properties5.clear();
        java.util.Properties properties13 = new java.util.Properties();
        java.lang.Object obj15 = properties13.get((java.lang.Object) 0.0d);
        java.lang.Object obj16 = properties13.clone();
        java.lang.String str17 = properties13.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties18.logBaseDir = "";
        atomikosProperties18.setConsoleFileCount((int) (short) 10);
        atomikosProperties18.setLogBaseDir("{}");
        boolean boolean25 = atomikosProperties18.isSerialJtaTransactions();
        java.lang.Object obj27 = properties13.putIfAbsent((java.lang.Object) boolean25, (java.lang.Object) 10000L);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet28 = properties13.entrySet();
        java.util.Properties properties29 = new java.util.Properties(properties13);
        java.lang.Object obj30 = properties5.remove((java.lang.Object) properties13);
        java.io.InputStream inputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties13.load(inputStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objEnumeration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{}" + "'", str17, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objEntrySet28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties1.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties3.enableLogging = true;
        long long6 = atomikosProperties3.getCheckpointInterval();
        boolean boolean8 = properties1.remove((java.lang.Object) long6, (java.lang.Object) (byte) 100);
        boolean boolean10 = properties1.equals((java.lang.Object) (short) 1);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet11 = properties1.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties12.setDefaultJtaTimeout((-1L));
        long long15 = atomikosProperties12.checkpointInterval;
        boolean boolean16 = atomikosProperties12.forceShutdownOnVmExit;
        atomikosProperties12.setThreadedTwoPhaseCommit(true);
        boolean boolean19 = properties1.contains((java.lang.Object) true);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties20.logBaseDir = "";
        atomikosProperties20.setConsoleFileCount((int) (short) 10);
        long long25 = atomikosProperties20.getMaxTimeout();
        java.util.Properties properties26 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet27 = properties26.keySet();
        atomikosProperties20.set(properties26, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str31 = atomikosProperties20.logBaseDir;
        java.lang.String str32 = atomikosProperties20.logBaseDir;
        java.lang.String str33 = atomikosProperties20.logBaseDir;
        boolean boolean34 = atomikosProperties20.isEnableLogging();
        boolean boolean35 = atomikosProperties20.forceShutdownOnVmExit;
        boolean boolean36 = properties1.containsValue((java.lang.Object) atomikosProperties20);
        boolean boolean37 = properties1.isEmpty();
        java.util.Properties properties38 = new java.util.Properties();
        java.lang.Object obj40 = properties38.get((java.lang.Object) 0.0d);
        java.lang.Object obj41 = properties38.clone();
        java.lang.String str42 = properties38.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties43.logBaseDir = "";
        atomikosProperties43.setConsoleFileCount((int) (short) 10);
        atomikosProperties43.setLogBaseDir("{}");
        boolean boolean50 = atomikosProperties43.isSerialJtaTransactions();
        java.lang.Object obj52 = properties38.putIfAbsent((java.lang.Object) boolean50, (java.lang.Object) 10000L);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet53 = properties38.entrySet();
        java.lang.String str54 = properties38.toString();
        boolean boolean55 = properties1.containsValue((java.lang.Object) str54);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties56.enableLogging = true;
        int int59 = atomikosProperties56.consoleFileLimit;
        atomikosProperties56.logBaseName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery62 = atomikosProperties56.getRecovery();
        long long63 = recovery62.getDelay();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int65 = atomikosProperties64.getConsoleFileCount();
        int int66 = atomikosProperties64.maxActives;
        atomikosProperties64.setConsoleFileName("");
        atomikosProperties64.transactionManagerUniqueName = "{}";
        java.util.Properties properties71 = atomikosProperties64.asProperties();
        java.util.Properties properties72 = new java.util.Properties(properties71);
        java.util.Enumeration<java.lang.Object> objEnumeration73 = properties72.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties74 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties74.logBaseDir = "";
        atomikosProperties74.setConsoleFileCount((int) (short) 10);
        atomikosProperties74.setCheckpointInterval(10000L);
        long long81 = atomikosProperties74.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel82 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties74.consoleLogLevel = atomikosLoggingLevel82;
        atomikosProperties74.consoleFileLimit = (byte) 1;
        atomikosProperties74.setDefaultJtaTimeout((long) (byte) -1);
        boolean boolean88 = atomikosProperties74.serialJtaTransactions;
        boolean boolean89 = properties1.replace((java.lang.Object) recovery62, (java.lang.Object) objEnumeration73, (java.lang.Object) boolean88);
        recovery62.retryInterval = (byte) -1;
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objEntrySet11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 300000L + "'", long25 == 300000L);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "{}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{}" + "'", str42, "{}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objEntrySet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "{true=10000}" + "'", str54, "{true=10000}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(recovery62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10000L + "'", long63 == 10000L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 50 + "'", int66 == 50);
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertNotNull(objEnumeration73);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 300000L + "'", long81 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel82 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel82.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.Object obj5 = properties3.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = properties3.clone();
        java.lang.String str7 = properties3.toString();
        boolean boolean10 = properties3.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj11 = properties1.replace((java.lang.Object) 10.0d, (java.lang.Object) properties3);
        java.lang.String str12 = properties3.toString();
        java.util.Properties properties13 = new java.util.Properties(properties3);
        java.lang.Object obj16 = properties13.getOrDefault((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        boolean boolean17 = properties13.isEmpty();
        boolean boolean18 = properties13.isEmpty();
        java.util.Properties properties19 = new java.util.Properties(properties13);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties20.logBaseDir = "";
        atomikosProperties20.setConsoleFileCount((int) (short) 10);
        long long25 = atomikosProperties20.getMaxTimeout();
        java.util.Properties properties26 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet27 = properties26.keySet();
        atomikosProperties20.set(properties26, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str31 = atomikosProperties20.logBaseDir;
        java.lang.String str32 = atomikosProperties20.logBaseDir;
        java.lang.String str33 = atomikosProperties20.logBaseDir;
        boolean boolean34 = atomikosProperties20.isEnableLogging();
        int int35 = atomikosProperties20.getMaxActives();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel36 = atomikosProperties20.getConsoleLogLevel();
        atomikosProperties20.threadedTwoPhaseCommit = true;
        boolean boolean39 = properties19.contains((java.lang.Object) atomikosProperties20);
        atomikosProperties20.setConsoleFileCount((int) (byte) -1);
        java.lang.String str42 = atomikosProperties20.logBaseName;
        int int43 = atomikosProperties20.getConsoleFileLimit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel44 = atomikosProperties20.consoleLogLevel;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 300000L + "'", long25 == 300000L);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 50 + "'", int35 == 50);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel36 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel36.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "tmlog" + "'", str42, "tmlog");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel44 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel44.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        long long7 = atomikosProperties0.defaultJtaTimeout;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        atomikosProperties0.enableLogging = true;
        atomikosProperties0.forceShutdownOnVmExit = false;
        atomikosProperties0.serialJtaTransactions = false;
        atomikosProperties0.service = "{hi!={}}";
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel17 = atomikosProperties0.consoleLogLevel;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel17 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel17.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.lang.String str13 = atomikosProperties0.logBaseDir;
        java.lang.String str14 = atomikosProperties0.getService();
        java.lang.String str15 = atomikosProperties0.outputDir;
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        int int18 = atomikosProperties0.maxActives;
        boolean boolean19 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.maxActives = (byte) 1;
        atomikosProperties0.maxTimeout = 0L;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setLogBaseName("hi!");
        boolean boolean10 = atomikosProperties0.isAllowSubTransactions();
        boolean boolean11 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean12 = atomikosProperties0.forceShutdownOnVmExit;
        boolean boolean13 = atomikosProperties0.enableLogging;
        atomikosProperties0.setTransactionManagerUniqueName("");
        atomikosProperties0.service = "";
        boolean boolean18 = atomikosProperties0.isSerialJtaTransactions();
        atomikosProperties0.serialJtaTransactions = true;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.service = "";
        java.lang.String str8 = atomikosProperties0.logBaseDir;
        atomikosProperties0.logBaseName = "tmlog";
        atomikosProperties0.setForceShutdownOnVmExit(false);
        atomikosProperties0.forceShutdownOnVmExit = true;
        atomikosProperties0.setConsoleFileLimit((int) (short) 1);
        long long17 = atomikosProperties0.defaultJtaTimeout;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10000L + "'", long17 == 10000L);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setLogBaseName("hi!");
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.setOutputDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}");
        atomikosProperties0.consoleFileName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        java.lang.String str16 = atomikosProperties0.logBaseDir;
        atomikosProperties0.setConsoleFileLimit((-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{}" + "'", str16, "{}");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setCheckpointInterval(10000L);
        long long7 = atomikosProperties0.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel8 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel8;
        atomikosProperties0.setMaxActives((int) (byte) 1);
        int int12 = atomikosProperties0.consoleFileCount;
        int int13 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.setConsoleFileLimit(18);
        atomikosProperties0.setMaxTimeout((long) 3);
        atomikosProperties0.logBaseDir = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel8 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel8.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        atomikosProperties0.transactionManagerUniqueName = "{}";
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        atomikosProperties0.setDefaultJtaTimeout((long) 0);
        boolean boolean10 = atomikosProperties0.enableLogging;
        atomikosProperties0.logBaseName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}";
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties13.load(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.lang.String str13 = atomikosProperties0.logBaseDir;
        java.lang.String str14 = atomikosProperties0.getService();
        java.lang.String str15 = atomikosProperties0.outputDir;
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        int int18 = atomikosProperties0.maxActives;
        atomikosProperties0.setForceShutdownOnVmExit(false);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel21 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel21 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel21.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        int int3 = atomikosProperties0.getConsoleFileLimit();
        java.util.Properties properties4 = atomikosProperties0.asProperties();
        boolean boolean5 = atomikosProperties0.forceShutdownOnVmExit;
        boolean boolean6 = atomikosProperties0.allowSubTransactions;
        long long7 = atomikosProperties0.checkpointInterval;
        boolean boolean8 = atomikosProperties0.isEnableLogging();
        long long9 = atomikosProperties0.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties10.enableLogging = true;
        long long13 = atomikosProperties10.getCheckpointInterval();
        java.lang.String str14 = atomikosProperties10.getOutputDir();
        java.lang.String str15 = atomikosProperties10.service;
        atomikosProperties10.maxTimeout = 100;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel18 = atomikosProperties10.consoleLogLevel;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel18;
        atomikosProperties0.setOutputDir("{{{}={}}={com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 500L + "'", long13 == 500L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel18 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel18.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.maxRetries = (-1);
        recovery0.setDelay((long) (short) 0);
        recovery0.maxRetries = (short) -1;
        recovery0.setForgetOrphanedLogEntriesDelay(500L);
        recovery0.retryInterval = 100;
        int int11 = recovery0.getMaxRetries();
        long long12 = recovery0.getDelay();
        long long13 = recovery0.retryInterval;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        long long7 = atomikosProperties0.defaultJtaTimeout;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        long long14 = atomikosProperties9.getMaxTimeout();
        java.util.Properties properties15 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet16 = properties15.keySet();
        atomikosProperties9.set(properties15, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj22 = properties15.setProperty("", "hi!");
        java.util.Set<java.lang.String> strSet23 = properties15.stringPropertyNames();
        properties8.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties15);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties25.logBaseDir = "";
        atomikosProperties25.setConsoleFileCount((int) (short) 10);
        atomikosProperties25.setCheckpointInterval(10000L);
        long long32 = atomikosProperties25.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel33 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties25.consoleLogLevel = atomikosLoggingLevel33;
        atomikosProperties25.consoleFileLimit = (byte) 1;
        boolean boolean37 = atomikosProperties25.isSerialJtaTransactions();
        java.lang.String str38 = atomikosProperties25.getLogBaseDir();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties39.logBaseDir = "";
        atomikosProperties39.setConsoleFileCount((int) (short) 10);
        java.lang.String str44 = atomikosProperties39.logBaseName;
        java.lang.String str45 = atomikosProperties39.logBaseDir;
        java.lang.String str46 = atomikosProperties39.getOutputDir();
        java.util.Properties properties47 = atomikosProperties39.asProperties();
        java.util.Collection<java.lang.Object> objCollection48 = properties47.values();
        java.lang.String str49 = properties47.toString();
        java.lang.Object obj50 = properties15.put((java.lang.Object) str38, (java.lang.Object) properties47);
        java.lang.String str52 = properties15.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=true, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 300000L + "'", long32 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel33 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel33.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "tmlog" + "'", str44, "tmlog");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNotNull(objCollection48);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}" + "'", str49, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        long long3 = atomikosProperties0.checkpointInterval;
        boolean boolean4 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        atomikosProperties0.setOutputDir("");
        java.lang.String str9 = atomikosProperties0.getService();
        long long10 = atomikosProperties0.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel11 = atomikosProperties0.consoleLogLevel;
        atomikosProperties0.service = "tm.out";
        int int14 = atomikosProperties0.getMaxActives();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel11 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel11.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setService("tmlog");
        atomikosProperties0.setConsoleFileName("{}");
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet9 = properties8.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet10 = properties8.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties11.enableLogging = true;
        long long14 = atomikosProperties11.getCheckpointInterval();
        atomikosProperties11.setSerialJtaTransactions(false);
        atomikosProperties11.consoleFileLimit = 'a';
        boolean boolean19 = atomikosProperties11.isThreadedTwoPhaseCommit();
        java.lang.String str20 = atomikosProperties11.getTransactionManagerUniqueName();
        java.lang.String str21 = atomikosProperties11.getOutputDir();
        atomikosProperties11.setMaxActives((int) '4');
        atomikosProperties11.outputDir = "";
        int int26 = atomikosProperties11.consoleFileCount;
        boolean boolean27 = atomikosProperties11.allowSubTransactions;
        boolean boolean28 = properties8.contains((java.lang.Object) atomikosProperties11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(objEntrySet9);
        org.junit.Assert.assertNotNull(objEntrySet10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 500L + "'", long14 == 500L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.get((java.lang.Object) 0.0d);
        java.lang.Object obj3 = properties0.clone();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties4.enableLogging = true;
        long long7 = atomikosProperties4.getCheckpointInterval();
        java.lang.String str8 = atomikosProperties4.getService();
        java.lang.String str9 = atomikosProperties4.logBaseDir;
        atomikosProperties4.setEnableLogging(false);
        boolean boolean12 = atomikosProperties4.isEnableLogging();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties13.enableLogging = true;
        long long16 = atomikosProperties13.getCheckpointInterval();
        atomikosProperties13.setService("tmlog");
        atomikosProperties13.setConsoleFileName("{}");
        java.util.Properties properties21 = atomikosProperties13.asProperties();
        atomikosProperties13.setCheckpointInterval((long) (short) 10);
        atomikosProperties13.logBaseName = "";
        java.lang.Object obj26 = properties0.put((java.lang.Object) boolean12, (java.lang.Object) atomikosProperties13);
        atomikosProperties13.setLogBaseName("{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.lang.String str29 = atomikosProperties13.getConsoleFileName();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel30 = atomikosProperties13.consoleLogLevel;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 500L + "'", long16 == 500L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel30 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel30.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        long long7 = atomikosProperties0.defaultJtaTimeout;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        long long14 = atomikosProperties9.getMaxTimeout();
        java.util.Properties properties15 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet16 = properties15.keySet();
        atomikosProperties9.set(properties15, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj22 = properties15.setProperty("", "hi!");
        java.util.Set<java.lang.String> strSet23 = properties15.stringPropertyNames();
        properties8.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties15);
        java.util.Set<java.lang.Object> objSet25 = properties8.keySet();
        java.util.Set<java.lang.Object> objSet26 = properties8.keySet();
        java.lang.String str27 = properties8.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties28.logBaseDir = "";
        atomikosProperties28.setConsoleFileCount((int) (short) 10);
        atomikosProperties28.setLogBaseDir("{}");
        java.lang.String str35 = atomikosProperties28.getOutputDir();
        atomikosProperties28.setLogBaseName("hi!");
        boolean boolean38 = atomikosProperties28.isAllowSubTransactions();
        int int39 = atomikosProperties28.getConsoleFileCount();
        java.util.Properties properties40 = atomikosProperties28.asProperties();
        java.util.Properties properties41 = atomikosProperties28.asProperties();
        java.util.Properties properties42 = new java.util.Properties();
        java.util.Properties properties43 = new java.util.Properties(properties42);
        java.util.Properties properties45 = new java.util.Properties();
        java.lang.Object obj47 = properties45.get((java.lang.Object) 0.0d);
        java.lang.Object obj48 = properties45.clone();
        java.lang.String str49 = properties45.toString();
        boolean boolean52 = properties45.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj53 = properties43.replace((java.lang.Object) 10.0d, (java.lang.Object) properties45);
        java.util.Properties properties54 = new java.util.Properties(properties43);
        java.util.Enumeration<java.lang.Object> objEnumeration55 = properties54.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties56.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel59 = null;
        atomikosProperties56.consoleLogLevel = atomikosLoggingLevel59;
        atomikosProperties56.outputDir = "";
        int int63 = atomikosProperties56.maxActives;
        boolean boolean64 = atomikosProperties56.isThreadedTwoPhaseCommit();
        atomikosProperties56.consoleFileLimit = (short) 10;
        java.util.Properties properties67 = atomikosProperties56.asProperties();
        java.lang.Object obj68 = properties54.get((java.lang.Object) properties67);
        java.util.Properties properties69 = new java.util.Properties(properties67);
        boolean boolean70 = properties41.equals((java.lang.Object) properties67);
        java.util.Enumeration<?> wildcardEnumeration71 = properties67.propertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties72 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties72.logBaseDir = "";
        boolean boolean75 = atomikosProperties72.isForceShutdownOnVmExit();
        int int76 = atomikosProperties72.consoleFileLimit;
        atomikosProperties72.setLogBaseDir("{}");
        atomikosProperties72.setThreadedTwoPhaseCommit(false);
        atomikosProperties72.maxTimeout = 35L;
        atomikosProperties72.consoleFileName = "hi!";
        boolean boolean85 = properties8.remove((java.lang.Object) wildcardEnumeration71, (java.lang.Object) atomikosProperties72);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(objSet25);
        org.junit.Assert.assertNotNull(objSet26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.hi!=-1.0, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000, =hi!}" + "'", str27, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.hi!=-1.0, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000, =hi!}");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "{}");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{}" + "'", str49, "{}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(objEnumeration55);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 50 + "'", int63 == 50);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardEnumeration71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        long long3 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int5 = atomikosProperties4.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties6.logBaseDir = "";
        atomikosProperties6.setConsoleFileCount((int) (short) 10);
        atomikosProperties6.setCheckpointInterval(10000L);
        long long13 = atomikosProperties6.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel14 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties6.consoleLogLevel = atomikosLoggingLevel14;
        atomikosProperties4.consoleLogLevel = atomikosLoggingLevel14;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel14;
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Properties properties19 = new java.util.Properties(properties18);
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = properties21.clone();
        java.lang.String str25 = properties21.toString();
        boolean boolean28 = properties21.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj29 = properties19.replace((java.lang.Object) 10.0d, (java.lang.Object) properties21);
        java.util.Properties properties30 = new java.util.Properties(properties19);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties32 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties32.setDefaultJtaTimeout((-1L));
        int int35 = atomikosProperties32.getConsoleFileLimit();
        java.util.Properties properties36 = atomikosProperties32.asProperties();
        java.util.Properties properties37 = new java.util.Properties(properties36);
        atomikosProperties0.set(properties30, "hi!", (java.lang.Object) properties36);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties39.setDefaultJtaTimeout((-1L));
        long long42 = atomikosProperties39.checkpointInterval;
        boolean boolean43 = atomikosProperties39.forceShutdownOnVmExit;
        atomikosProperties39.setThreadedTwoPhaseCommit(true);
        atomikosProperties39.setOutputDir("");
        atomikosProperties39.setConsoleFileName("hi!");
        boolean boolean50 = properties30.containsValue((java.lang.Object) atomikosProperties39);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery51 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery51.maxRetries = (-1);
        recovery51.setDelay((long) (short) 0);
        recovery51.maxRetries = 0;
        recovery51.forgetOrphanedLogEntriesDelay = 100;
        recovery51.setMaxRetries((int) (byte) -1);
        recovery51.retryInterval = '4';
        recovery51.setForgetOrphanedLogEntriesDelay((long) '4');
        long long66 = recovery51.forgetOrphanedLogEntriesDelay;
        recovery51.setMaxRetries(5);
        recovery51.forgetOrphanedLogEntriesDelay = 5L;
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = properties30.getOrDefault((java.lang.Object) recovery51, obj71);
        java.util.Enumeration<?> wildcardEnumeration73 = properties30.propertyNames();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel14 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel14.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 500L + "'", long42 == 500L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 52L + "'", long66 == 52L);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(wildcardEnumeration73);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.util.Enumeration<java.lang.Object> objEnumeration11 = properties6.keys();
        int int12 = properties6.size();
        java.util.Enumeration<java.lang.Object> objEnumeration13 = properties6.elements();
        java.util.Set<java.lang.String> strSet14 = properties6.stringPropertyNames();
        java.util.Properties properties15 = new java.util.Properties(properties6);
        java.util.Enumeration<java.lang.Object> objEnumeration16 = properties6.elements();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties17.logBaseDir = "";
        atomikosProperties17.setConsoleFileCount((int) (short) 10);
        long long22 = atomikosProperties17.getMaxTimeout();
        java.util.Properties properties23 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet24 = properties23.keySet();
        atomikosProperties17.set(properties23, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str28 = atomikosProperties17.logBaseDir;
        java.lang.String str29 = atomikosProperties17.logBaseDir;
        java.lang.String str30 = atomikosProperties17.logBaseDir;
        boolean boolean31 = atomikosProperties17.isAllowSubTransactions();
        java.lang.String str32 = atomikosProperties17.logBaseDir;
        java.lang.String str33 = atomikosProperties17.outputDir;
        java.lang.String str34 = atomikosProperties17.getOutputDir();
        java.util.Properties properties35 = atomikosProperties17.asProperties();
        java.lang.Object obj36 = properties6.get((java.lang.Object) properties35);
        java.lang.String str39 = properties35.getProperty("", "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objEnumeration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objEnumeration13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(objEnumeration16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 300000L + "'", long22 == 300000L);
        org.junit.Assert.assertNotNull(objSet24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.lang.String str13 = atomikosProperties0.logBaseDir;
        boolean boolean14 = atomikosProperties0.isEnableLogging();
        java.lang.String str15 = atomikosProperties0.getTransactionManagerUniqueName();
        atomikosProperties0.enableLogging = false;
        boolean boolean18 = atomikosProperties0.serialJtaTransactions;
        atomikosProperties0.enableLogging = false;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        boolean boolean3 = atomikosProperties0.isForceShutdownOnVmExit();
        int int4 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.setLogBaseDir("{}");
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        atomikosProperties0.maxTimeout = 35L;
        atomikosProperties0.checkpointInterval = 1;
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        boolean boolean3 = atomikosProperties0.isForceShutdownOnVmExit();
        int int4 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.consoleFileCount = 100;
        java.lang.String str7 = atomikosProperties0.getLogBaseName();
        atomikosProperties0.consoleFileLimit = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tmlog" + "'", str7, "tmlog");
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        long long1 = atomikosProperties0.defaultJtaTimeout;
        atomikosProperties0.logBaseName = "tm.out";
        java.lang.String str4 = atomikosProperties0.consoleFileName;
        java.lang.String str5 = atomikosProperties0.getLogBaseDir();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel6 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tm.out" + "'", str4, "tm.out");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel6 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel6.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.service;
        java.lang.String str12 = atomikosProperties0.outputDir;
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        java.lang.String str14 = atomikosProperties0.logBaseName;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tmlog" + "'", str14, "tmlog");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = properties6.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties14.setDefaultJtaTimeout((-1L));
        java.util.Properties properties17 = new java.util.Properties();
        java.lang.Object obj19 = properties17.get((java.lang.Object) 0.0d);
        java.lang.Object obj20 = properties17.clone();
        boolean boolean22 = properties6.replace((java.lang.Object) (-1L), obj20, (java.lang.Object) 100.0d);
        java.util.Properties properties23 = new java.util.Properties();
        java.util.Properties properties24 = new java.util.Properties(properties23);
        properties24.clear();
        properties6.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties24);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int28 = atomikosProperties27.getConsoleFileCount();
        int int29 = atomikosProperties27.maxActives;
        atomikosProperties27.setConsoleFileName("");
        boolean boolean32 = atomikosProperties27.forceShutdownOnVmExit;
        atomikosProperties27.service = "{}";
        boolean boolean35 = properties6.containsValue((java.lang.Object) "{}");
        java.util.Properties properties36 = new java.util.Properties(properties6);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties37.logBaseDir = "";
        atomikosProperties37.setConsoleFileCount((int) (short) 10);
        java.lang.String str42 = atomikosProperties37.logBaseName;
        java.lang.String str43 = atomikosProperties37.logBaseDir;
        java.lang.String str44 = atomikosProperties37.getOutputDir();
        java.util.Properties properties45 = atomikosProperties37.asProperties();
        atomikosProperties37.logBaseName = "{com.atomikos.icatch.hi!=-1.0}";
        atomikosProperties37.setMaxActives((int) (short) 100);
        java.lang.String str50 = atomikosProperties37.consoleFileName;
        java.lang.String str51 = atomikosProperties37.logBaseDir;
        java.lang.Object obj52 = properties6.remove((java.lang.Object) str51);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties53 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int54 = atomikosProperties53.getConsoleFileCount();
        int int55 = atomikosProperties53.maxActives;
        int int56 = atomikosProperties53.getMaxActives();
        atomikosProperties53.checkpointInterval = 2L;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties59 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int60 = atomikosProperties59.getConsoleFileCount();
        atomikosProperties59.outputDir = "";
        int int63 = atomikosProperties59.getMaxActives();
        boolean boolean64 = atomikosProperties59.threadedTwoPhaseCommit;
        int int65 = atomikosProperties59.getConsoleFileCount();
        java.lang.Object obj66 = properties6.replace((java.lang.Object) atomikosProperties53, (java.lang.Object) atomikosProperties59);
        java.util.Set<java.lang.Object> objSet67 = properties6.keySet();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 50 + "'", int29 == 50);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "tmlog" + "'", str42, "tmlog");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "tm.out" + "'", str50, "tm.out");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "hi!" + "'", obj52, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 50 + "'", int55 == 50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 50 + "'", int56 == 50);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 50 + "'", int63 == 50);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(objSet67);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties1.values();
        java.util.Properties properties3 = new java.util.Properties();
        java.util.Properties properties4 = new java.util.Properties(properties3);
        java.util.Collection<java.lang.Object> objCollection5 = properties3.values();
        java.util.Enumeration<java.lang.Object> objEnumeration6 = properties3.keys();
        boolean boolean7 = properties1.contains((java.lang.Object) properties3);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        java.lang.String str14 = atomikosProperties9.logBaseName;
        atomikosProperties9.outputDir = "";
        java.util.Properties properties17 = atomikosProperties9.asProperties();
        java.util.Properties properties18 = atomikosProperties9.asProperties();
        boolean boolean19 = properties1.remove((java.lang.Object) (byte) 10, (java.lang.Object) atomikosProperties9);
        atomikosProperties9.maxTimeout = (short) 10;
        int int22 = atomikosProperties9.consoleFileLimit;
        long long23 = atomikosProperties9.checkpointInterval;
        java.lang.String str24 = atomikosProperties9.getLogBaseName();
        atomikosProperties9.setService("{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        atomikosProperties9.setLogBaseDir("{hi!={}}");
        atomikosProperties9.setLogBaseName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir={com.atomikos.icatch.hi!=-1.0, =hi!}, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}");
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objEnumeration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tmlog" + "'", str14, "tmlog");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 500L + "'", long23 == 500L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "tmlog" + "'", str24, "tmlog");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int15 = atomikosProperties14.getConsoleFileCount();
        int int16 = atomikosProperties14.maxActives;
        atomikosProperties14.setConsoleFileName("");
        atomikosProperties14.transactionManagerUniqueName = "{}";
        java.util.Properties properties21 = atomikosProperties14.asProperties();
        java.util.Properties properties22 = new java.util.Properties(properties21);
        properties13.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties22);
        java.lang.String str25 = properties22.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.lang.String str27 = properties22.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={true=10000}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        java.util.Set<java.lang.String> strSet8 = properties7.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int10 = atomikosProperties9.getConsoleFileCount();
        int int11 = atomikosProperties9.maxActives;
        atomikosProperties9.setConsoleFileName("");
        atomikosProperties9.transactionManagerUniqueName = "{}";
        java.util.Properties properties16 = atomikosProperties9.asProperties();
        boolean boolean17 = atomikosProperties9.threadedTwoPhaseCommit;
        atomikosProperties9.enableLogging = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int21 = atomikosProperties20.getConsoleFileCount();
        int int22 = atomikosProperties20.maxActives;
        atomikosProperties20.setConsoleFileName("");
        atomikosProperties20.transactionManagerUniqueName = "{}";
        atomikosProperties20.setMaxActives(0);
        boolean boolean29 = atomikosProperties20.forceShutdownOnVmExit;
        java.lang.Object obj30 = properties7.put((java.lang.Object) atomikosProperties9, (java.lang.Object) atomikosProperties20);
        atomikosProperties9.setConsoleFileCount((int) '4');
        int int33 = atomikosProperties9.getConsoleFileLimit();
        int int34 = atomikosProperties9.maxActives;
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 50 + "'", int34 == 50);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        boolean boolean6 = atomikosProperties0.isThreadedTwoPhaseCommit();
        java.lang.String str7 = atomikosProperties0.service;
        java.lang.String str8 = atomikosProperties0.getConsoleFileName();
        boolean boolean9 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setMaxActives((int) (byte) 10);
        atomikosProperties0.setEnableLogging(false);
        int int14 = atomikosProperties0.consoleFileCount;
        boolean boolean15 = atomikosProperties0.allowSubTransactions;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tm.out" + "'", str8, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        atomikosProperties0.transactionManagerUniqueName = "{}";
        java.lang.String str7 = atomikosProperties0.logBaseDir;
        atomikosProperties0.logBaseDir = "{{}={}}";
        atomikosProperties0.setTransactionManagerUniqueName("{{}=tmlog}");
        boolean boolean12 = atomikosProperties0.serialJtaTransactions;
        int int13 = atomikosProperties0.getConsoleFileLimit();
        long long14 = atomikosProperties0.getCheckpointInterval();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 500L + "'", long14 == 500L);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        int int9 = atomikosProperties0.getConsoleFileLimit();
        atomikosProperties0.setConsoleFileName("{true=10000}");
        atomikosProperties0.setTransactionManagerUniqueName("hi!");
        atomikosProperties0.setConsoleFileCount((int) 'a');
        atomikosProperties0.consoleFileName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=true, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        java.util.Properties properties18 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "{{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}={com.atomikos.icatch.hi!=-1.0, =hi!}}";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.lang.String str13 = atomikosProperties0.logBaseDir;
        boolean boolean14 = atomikosProperties0.isEnableLogging();
        long long15 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.setOutputDir("hi!");
        long long18 = atomikosProperties0.maxTimeout;
        java.lang.String str19 = atomikosProperties0.logBaseName;
        java.util.Properties properties20 = atomikosProperties0.asProperties();
        java.util.Collection<java.lang.Object> objCollection21 = properties20.values();
        java.util.Enumeration<java.lang.Object> objEnumeration22 = properties20.elements();
        java.util.Properties properties23 = new java.util.Properties(properties20);
        java.util.Collection<java.lang.Object> objCollection24 = properties23.values();
        java.util.Properties properties25 = new java.util.Properties(properties23);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 300000L + "'", long18 == 300000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tmlog" + "'", str19, "tmlog");
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(objCollection21);
        org.junit.Assert.assertNotNull(objEnumeration22);
        org.junit.Assert.assertNotNull(objCollection24);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.maxActives = 50;
        atomikosProperties0.transactionManagerUniqueName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}";
        atomikosProperties0.setAllowSubTransactions(true);
        atomikosProperties0.setOutputDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.lang.String str11 = atomikosProperties0.outputDir;
        java.lang.String str12 = atomikosProperties0.consoleFileName;
        atomikosProperties0.setCheckpointInterval(0L);
        atomikosProperties0.setSerialJtaTransactions(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}" + "'", str11, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tm.out" + "'", str12, "tm.out");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.util.Properties properties11 = new java.util.Properties();
        java.lang.Object obj13 = properties11.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = properties11.clone();
        java.lang.String str15 = properties11.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties16.logBaseDir = "";
        atomikosProperties16.setConsoleFileCount((int) (short) 10);
        long long21 = atomikosProperties16.getMaxTimeout();
        java.util.Properties properties22 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet23 = properties22.keySet();
        atomikosProperties16.set(properties22, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj29 = properties22.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties30.setDefaultJtaTimeout((-1L));
        java.util.Properties properties33 = new java.util.Properties();
        java.lang.Object obj35 = properties33.get((java.lang.Object) 0.0d);
        java.lang.Object obj36 = properties33.clone();
        boolean boolean38 = properties22.replace((java.lang.Object) (-1L), obj36, (java.lang.Object) 100.0d);
        java.util.Properties properties39 = new java.util.Properties();
        java.util.Properties properties40 = new java.util.Properties(properties39);
        properties40.clear();
        properties22.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties40);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties43.logBaseDir = "";
        atomikosProperties43.setConsoleFileCount((int) (short) 10);
        long long48 = atomikosProperties43.getMaxTimeout();
        java.util.Properties properties49 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet50 = properties49.keySet();
        atomikosProperties43.set(properties49, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str54 = atomikosProperties43.logBaseDir;
        java.lang.String str55 = atomikosProperties43.logBaseDir;
        java.util.Properties properties56 = atomikosProperties43.asProperties();
        java.lang.Object obj57 = properties11.replace((java.lang.Object) properties40, (java.lang.Object) atomikosProperties43);
        boolean boolean58 = properties6.contains((java.lang.Object) atomikosProperties43);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel59 = atomikosProperties43.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery60 = atomikosProperties43.recovery;
        atomikosProperties43.consoleFileLimit = (byte) -1;
        java.lang.String str63 = atomikosProperties43.getLogBaseDir();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties64.logBaseDir = "";
        atomikosProperties64.setConsoleFileCount((int) (short) 10);
        atomikosProperties64.setCheckpointInterval(10000L);
        long long71 = atomikosProperties64.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel72 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties64.consoleLogLevel = atomikosLoggingLevel72;
        atomikosProperties43.consoleLogLevel = atomikosLoggingLevel72;
        atomikosProperties43.setLogBaseName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=true, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        atomikosProperties43.setLogBaseDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=hi!, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.lang.String str79 = atomikosProperties43.getTransactionManagerUniqueName();
        atomikosProperties43.setService("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}");
        boolean boolean82 = atomikosProperties43.isSerialJtaTransactions();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 300000L + "'", long21 == 300000L);
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "{}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 300000L + "'", long48 == 300000L);
        org.junit.Assert.assertNotNull(objSet50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel59 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel59.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(recovery60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 300000L + "'", long71 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel72 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel72.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel3;
        atomikosProperties0.outputDir = "";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties7.logBaseDir = "";
        atomikosProperties7.setConsoleFileCount((int) (short) 10);
        java.lang.String str12 = atomikosProperties7.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel13 = atomikosProperties7.getConsoleLogLevel();
        java.lang.String str14 = atomikosProperties7.transactionManagerUniqueName;
        atomikosProperties7.consoleFileLimit = (byte) 100;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int18 = atomikosProperties17.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties19.logBaseDir = "";
        atomikosProperties19.setConsoleFileCount((int) (short) 10);
        atomikosProperties19.setCheckpointInterval(10000L);
        long long26 = atomikosProperties19.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel27 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties19.consoleLogLevel = atomikosLoggingLevel27;
        atomikosProperties17.consoleLogLevel = atomikosLoggingLevel27;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel30 = atomikosProperties17.getConsoleLogLevel();
        atomikosProperties7.consoleLogLevel = atomikosLoggingLevel30;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel30;
        boolean boolean33 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setSerialJtaTransactions(false);
        java.lang.String str36 = atomikosProperties0.logBaseName;
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel13 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel13.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 300000L + "'", long26 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel27 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel27.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel30 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel30.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "tmlog" + "'", str36, "tmlog");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.Object obj5 = properties3.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = properties3.clone();
        java.lang.String str7 = properties3.toString();
        boolean boolean10 = properties3.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj11 = properties1.replace((java.lang.Object) 10.0d, (java.lang.Object) properties3);
        java.lang.String str12 = properties3.toString();
        java.util.Properties properties13 = new java.util.Properties(properties3);
        java.lang.Object obj16 = properties13.getOrDefault((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.util.Properties properties17 = new java.util.Properties(properties13);
        java.util.Set<java.lang.Object> objSet18 = properties13.keySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int20 = atomikosProperties19.getConsoleFileCount();
        int int21 = atomikosProperties19.maxActives;
        int int22 = atomikosProperties19.getMaxActives();
        int int23 = atomikosProperties19.getConsoleFileCount();
        boolean boolean24 = atomikosProperties19.allowSubTransactions;
        atomikosProperties19.consoleFileCount = (short) 1;
        boolean boolean27 = atomikosProperties19.allowSubTransactions;
        java.util.Properties properties28 = new java.util.Properties();
        java.lang.Object obj30 = properties28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = properties28.clone();
        java.lang.String str32 = properties28.toString();
        java.util.Properties properties33 = new java.util.Properties(properties28);
        java.lang.String str34 = properties33.toString();
        java.util.Properties properties35 = new java.util.Properties(properties33);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties36 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties36.logBaseDir = "";
        atomikosProperties36.setConsoleFileCount((int) (short) 10);
        atomikosProperties36.setLogBaseDir("{}");
        java.lang.String str43 = atomikosProperties36.getOutputDir();
        atomikosProperties36.setLogBaseName("hi!");
        boolean boolean46 = atomikosProperties36.isAllowSubTransactions();
        boolean boolean47 = atomikosProperties36.isThreadedTwoPhaseCommit();
        boolean boolean48 = atomikosProperties36.isForceShutdownOnVmExit();
        java.lang.String str49 = atomikosProperties36.getLogBaseDir();
        boolean boolean50 = atomikosProperties36.isAllowSubTransactions();
        boolean boolean51 = properties13.replace((java.lang.Object) atomikosProperties19, (java.lang.Object) properties35, (java.lang.Object) atomikosProperties36);
        long long52 = atomikosProperties19.checkpointInterval;
        java.lang.String str53 = atomikosProperties19.getService();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel54 = atomikosProperties19.consoleLogLevel;
        java.lang.String str55 = atomikosProperties19.transactionManagerUniqueName;
        atomikosProperties19.service = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={true=10000}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{}" + "'", str34, "{}");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{}" + "'", str49, "{}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 500L + "'", long52 == 500L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel54 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel54.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setCheckpointInterval(10000L);
        atomikosProperties0.checkpointInterval = 100;
        int int9 = atomikosProperties0.getConsoleFileCount();
        int int10 = atomikosProperties0.getMaxActives();
        atomikosProperties0.setMaxTimeout(22L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        int int3 = atomikosProperties0.getConsoleFileLimit();
        java.util.Properties properties4 = atomikosProperties0.asProperties();
        boolean boolean5 = atomikosProperties0.forceShutdownOnVmExit;
        boolean boolean6 = atomikosProperties0.allowSubTransactions;
        long long7 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.setService("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}");
        java.lang.String str10 = atomikosProperties0.service;
        int int11 = atomikosProperties0.getConsoleFileLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}" + "'", str10, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj2 = properties0.get((java.lang.Object) 0.0d);
        java.lang.Object obj3 = properties0.clone();
        java.lang.String str4 = properties0.toString();
        java.util.Properties properties5 = new java.util.Properties(properties0);
        java.util.Enumeration<java.lang.Object> objEnumeration6 = properties5.keys();
        java.util.Collection<java.lang.Object> objCollection7 = properties5.values();
        java.util.Properties properties8 = new java.util.Properties();
        java.util.Properties properties9 = new java.util.Properties(properties8);
        java.util.Collection<java.lang.Object> objCollection10 = properties8.values();
        int int11 = properties8.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery12 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery12.maxRetries = (-1);
        recovery12.setDelay((long) (short) 0);
        recovery12.maxRetries = 0;
        boolean boolean20 = properties8.remove((java.lang.Object) 0, (java.lang.Object) (-1));
        java.util.Enumeration<?> wildcardEnumeration21 = properties8.propertyNames();
        java.lang.Object obj22 = properties5.get((java.lang.Object) properties8);
        java.lang.String str25 = properties8.getProperty("{{{}={}}={com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}}", "{{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}={com.atomikos.icatch.hi!=-1.0, =hi!}}");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNotNull(objEnumeration6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardEnumeration21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}={com.atomikos.icatch.hi!=-1.0, =hi!}}" + "'", str25, "{{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}={com.atomikos.icatch.hi!=-1.0, =hi!}}");
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = properties6.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties14.setDefaultJtaTimeout((-1L));
        java.util.Properties properties17 = new java.util.Properties();
        java.lang.Object obj19 = properties17.get((java.lang.Object) 0.0d);
        java.lang.Object obj20 = properties17.clone();
        boolean boolean22 = properties6.replace((java.lang.Object) (-1L), obj20, (java.lang.Object) 100.0d);
        java.util.Properties properties23 = new java.util.Properties();
        java.util.Properties properties24 = new java.util.Properties(properties23);
        properties24.clear();
        properties6.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties24);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet27 = properties6.entrySet();
        java.util.Properties properties28 = new java.util.Properties(properties6);
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties6.store(writer29, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objEntrySet27);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel3;
        boolean boolean5 = atomikosProperties0.enableLogging;
        atomikosProperties0.maxTimeout = ' ';
        atomikosProperties0.setLogBaseName("{com.atomikos.icatch.hi!=-1.0, =hi!}");
        atomikosProperties0.setDefaultJtaTimeout((long) 97);
        atomikosProperties0.setTransactionManagerUniqueName("{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        long long14 = atomikosProperties0.getDefaultJtaTimeout();
        atomikosProperties0.setLogBaseDir("");
        int int17 = atomikosProperties0.maxActives;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.checkpointInterval = 0;
        boolean boolean5 = atomikosProperties0.isThreadedTwoPhaseCommit();
        atomikosProperties0.setSerialJtaTransactions(false);
        long long8 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.maxTimeout = 'a';
        java.lang.String str11 = atomikosProperties0.transactionManagerUniqueName;
        boolean boolean12 = atomikosProperties0.isEnableLogging();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.util.Properties properties0 = new java.util.Properties();
        int int1 = properties0.size();
        properties0.clear();
        java.util.Properties properties3 = new java.util.Properties(properties0);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties4.setDefaultJtaTimeout((-1L));
        long long7 = atomikosProperties4.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int9 = atomikosProperties8.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties10.logBaseDir = "";
        atomikosProperties10.setConsoleFileCount((int) (short) 10);
        atomikosProperties10.setCheckpointInterval(10000L);
        long long17 = atomikosProperties10.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel18 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties10.consoleLogLevel = atomikosLoggingLevel18;
        atomikosProperties8.consoleLogLevel = atomikosLoggingLevel18;
        atomikosProperties4.consoleLogLevel = atomikosLoggingLevel18;
        java.util.Properties properties22 = new java.util.Properties();
        java.util.Properties properties23 = new java.util.Properties(properties22);
        java.util.Properties properties25 = new java.util.Properties();
        java.lang.Object obj27 = properties25.get((java.lang.Object) 0.0d);
        java.lang.Object obj28 = properties25.clone();
        java.lang.String str29 = properties25.toString();
        boolean boolean32 = properties25.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj33 = properties23.replace((java.lang.Object) 10.0d, (java.lang.Object) properties25);
        java.util.Properties properties34 = new java.util.Properties(properties23);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties36 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties36.setDefaultJtaTimeout((-1L));
        int int39 = atomikosProperties36.getConsoleFileLimit();
        java.util.Properties properties40 = atomikosProperties36.asProperties();
        java.util.Properties properties41 = new java.util.Properties(properties40);
        atomikosProperties4.set(properties34, "hi!", (java.lang.Object) properties40);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet43 = properties34.entrySet();
        java.util.Properties properties44 = new java.util.Properties(properties34);
        java.util.Properties properties45 = new java.util.Properties();
        int int46 = properties45.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery47 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long48 = recovery47.getRetryInterval();
        long long49 = recovery47.getDelay();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties50 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties50.setDefaultJtaTimeout((-1L));
        int int53 = atomikosProperties50.getConsoleFileLimit();
        java.util.Properties properties54 = atomikosProperties50.asProperties();
        boolean boolean55 = atomikosProperties50.forceShutdownOnVmExit;
        long long56 = atomikosProperties50.getDefaultJtaTimeout();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        long long58 = atomikosProperties57.defaultJtaTimeout;
        atomikosProperties57.logBaseName = "tm.out";
        boolean boolean61 = properties45.replace((java.lang.Object) recovery47, (java.lang.Object) long56, (java.lang.Object) atomikosProperties57);
        java.util.Properties properties62 = new java.util.Properties(properties45);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties63 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int64 = atomikosProperties63.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties65 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties65.logBaseDir = "";
        atomikosProperties65.setConsoleFileCount((int) (short) 10);
        atomikosProperties65.setCheckpointInterval(10000L);
        long long72 = atomikosProperties65.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel73 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties65.consoleLogLevel = atomikosLoggingLevel73;
        atomikosProperties63.consoleLogLevel = atomikosLoggingLevel73;
        java.lang.String str76 = atomikosProperties63.getService();
        atomikosProperties63.setThreadedTwoPhaseCommit(false);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery79 = atomikosProperties63.recovery;
        boolean boolean80 = properties0.replace((java.lang.Object) properties34, (java.lang.Object) properties45, (java.lang.Object) atomikosProperties63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 500L + "'", long7 == 500L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300000L + "'", long17 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel18 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel18.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "{}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{}" + "'", str29, "{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10000L + "'", long48 == 10000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10000L + "'", long49 == 10000L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10000L + "'", long58 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 300000L + "'", long72 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel73 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel73.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(recovery79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setService("tmlog");
        atomikosProperties0.setConsoleFileName("{}");
        java.lang.String str8 = atomikosProperties0.getConsoleFileName();
        atomikosProperties0.logBaseName = "tmlog";
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        atomikosProperties0.setMaxActives(19);
        java.lang.String str14 = atomikosProperties0.getOutputDir();
        int int15 = atomikosProperties0.consoleFileLimit;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties1.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties3.enableLogging = true;
        long long6 = atomikosProperties3.getCheckpointInterval();
        boolean boolean8 = properties1.remove((java.lang.Object) long6, (java.lang.Object) (byte) 100);
        boolean boolean10 = properties1.equals((java.lang.Object) (short) 1);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet11 = properties1.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties12.setDefaultJtaTimeout((-1L));
        long long15 = atomikosProperties12.checkpointInterval;
        boolean boolean16 = atomikosProperties12.forceShutdownOnVmExit;
        atomikosProperties12.setThreadedTwoPhaseCommit(true);
        boolean boolean19 = properties1.contains((java.lang.Object) true);
        java.util.Properties properties20 = new java.util.Properties(properties1);
        java.util.Properties properties21 = new java.util.Properties(properties1);
        java.lang.Object obj24 = properties21.setProperty("hi!", "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=true, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objEntrySet11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.getRetryInterval();
        recovery0.delay = 10L;
        long long4 = recovery0.getDelay();
        long long5 = recovery0.delay;
        recovery0.setForgetOrphanedLogEntriesDelay((long) 0);
        long long8 = recovery0.getDelay();
        int int9 = recovery0.maxRetries;
        long long10 = recovery0.retryInterval;
        long long11 = recovery0.getForgetOrphanedLogEntriesDelay();
        recovery0.forgetOrphanedLogEntriesDelay = 1;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int7 = atomikosProperties6.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties8.logBaseDir = "";
        atomikosProperties8.setConsoleFileCount((int) (short) 10);
        atomikosProperties8.setCheckpointInterval(10000L);
        long long15 = atomikosProperties8.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel16 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties8.consoleLogLevel = atomikosLoggingLevel16;
        atomikosProperties6.consoleLogLevel = atomikosLoggingLevel16;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel16;
        atomikosProperties0.checkpointInterval = 35;
        atomikosProperties0.checkpointInterval = 32L;
        java.util.Properties properties24 = atomikosProperties0.asProperties();
        java.lang.String str25 = atomikosProperties0.getTransactionManagerUniqueName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel16 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel16.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Set<java.lang.String> strSet9 = properties8.stringPropertyNames();
        java.util.Enumeration<java.lang.Object> objEnumeration10 = properties8.elements();
        java.util.Properties properties11 = new java.util.Properties(properties8);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties12.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel15 = null;
        atomikosProperties12.consoleLogLevel = atomikosLoggingLevel15;
        atomikosProperties12.outputDir = "";
        int int19 = atomikosProperties12.maxActives;
        boolean boolean20 = atomikosProperties12.isThreadedTwoPhaseCommit();
        long long21 = atomikosProperties12.defaultJtaTimeout;
        java.lang.String str22 = atomikosProperties12.logBaseName;
        java.lang.String str23 = atomikosProperties12.getTransactionManagerUniqueName();
        boolean boolean24 = properties11.containsValue((java.lang.Object) atomikosProperties12);
        java.util.Properties properties25 = new java.util.Properties(properties11);
        java.util.Enumeration<java.lang.Object> objEnumeration26 = properties25.elements();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(objEnumeration10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "tmlog" + "'", str22, "tmlog");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objEnumeration26);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.util.Properties properties11 = new java.util.Properties();
        java.lang.Object obj13 = properties11.get((java.lang.Object) 0.0d);
        java.lang.Object obj14 = properties11.clone();
        java.lang.String str15 = properties11.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties16.logBaseDir = "";
        atomikosProperties16.setConsoleFileCount((int) (short) 10);
        long long21 = atomikosProperties16.getMaxTimeout();
        java.util.Properties properties22 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet23 = properties22.keySet();
        atomikosProperties16.set(properties22, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj29 = properties22.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties30.setDefaultJtaTimeout((-1L));
        java.util.Properties properties33 = new java.util.Properties();
        java.lang.Object obj35 = properties33.get((java.lang.Object) 0.0d);
        java.lang.Object obj36 = properties33.clone();
        boolean boolean38 = properties22.replace((java.lang.Object) (-1L), obj36, (java.lang.Object) 100.0d);
        java.util.Properties properties39 = new java.util.Properties();
        java.util.Properties properties40 = new java.util.Properties(properties39);
        properties40.clear();
        properties22.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties40);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties43.logBaseDir = "";
        atomikosProperties43.setConsoleFileCount((int) (short) 10);
        long long48 = atomikosProperties43.getMaxTimeout();
        java.util.Properties properties49 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet50 = properties49.keySet();
        atomikosProperties43.set(properties49, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str54 = atomikosProperties43.logBaseDir;
        java.lang.String str55 = atomikosProperties43.logBaseDir;
        java.util.Properties properties56 = atomikosProperties43.asProperties();
        java.lang.Object obj57 = properties11.replace((java.lang.Object) properties40, (java.lang.Object) atomikosProperties43);
        boolean boolean58 = properties6.contains((java.lang.Object) atomikosProperties43);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel59 = atomikosProperties43.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery60 = atomikosProperties43.recovery;
        atomikosProperties43.setCheckpointInterval((long) 22);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 300000L + "'", long21 == 300000L);
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "{}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 300000L + "'", long48 == 300000L);
        org.junit.Assert.assertNotNull(objSet50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(properties56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel59 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel59.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(recovery60);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getMaxActives();
        atomikosProperties0.serialJtaTransactions = true;
        java.util.Properties properties4 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties5 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties5.logBaseDir = "";
        atomikosProperties5.setConsoleFileCount((int) (short) 10);
        atomikosProperties5.setLogBaseDir("{}");
        java.lang.String str12 = atomikosProperties5.getOutputDir();
        atomikosProperties5.setLogBaseName("hi!");
        boolean boolean15 = atomikosProperties5.isAllowSubTransactions();
        boolean boolean16 = atomikosProperties5.isThreadedTwoPhaseCommit();
        boolean boolean17 = atomikosProperties5.isForceShutdownOnVmExit();
        java.lang.String str18 = atomikosProperties5.getOutputDir();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel19 = atomikosProperties5.getConsoleLogLevel();
        atomikosProperties5.setForceShutdownOnVmExit(true);
        java.lang.Object obj22 = properties4.get((java.lang.Object) atomikosProperties5);
        atomikosProperties5.setLogBaseName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel19 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel19.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        int int3 = atomikosProperties0.getConsoleFileLimit();
        java.util.Properties properties4 = atomikosProperties0.asProperties();
        boolean boolean5 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setLogBaseDir("{com.atomikos.icatch.hi!=-1.0}");
        boolean boolean8 = atomikosProperties0.isForceShutdownOnVmExit();
        int int9 = atomikosProperties0.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery10 = atomikosProperties0.recovery;
        long long11 = recovery10.retryInterval;
        long long12 = recovery10.forgetOrphanedLogEntriesDelay;
        recovery10.setRetryInterval(19L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(recovery10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10000L + "'", long11 == 10000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 86400000L + "'", long12 == 86400000L);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setCheckpointInterval(10000L);
        long long7 = atomikosProperties0.maxTimeout;
        int int8 = atomikosProperties0.maxActives;
        long long9 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setMaxTimeout(10L);
        long long12 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.setAllowSubTransactions(false);
        atomikosProperties0.defaultJtaTimeout = (byte) 10;
        boolean boolean17 = atomikosProperties0.isThreadedTwoPhaseCommit();
        long long18 = atomikosProperties0.maxTimeout;
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10000L + "'", long12 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        boolean boolean4 = atomikosProperties0.isThreadedTwoPhaseCommit();
        long long5 = atomikosProperties0.defaultJtaTimeout;
        atomikosProperties0.setEnableLogging(false);
        atomikosProperties0.transactionManagerUniqueName = "tmlog";
        atomikosProperties0.maxTimeout = (short) 10;
        boolean boolean12 = atomikosProperties0.serialJtaTransactions;
        atomikosProperties0.setDefaultJtaTimeout((long) (short) 10);
        atomikosProperties0.threadedTwoPhaseCommit = true;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        boolean boolean6 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean7 = atomikosProperties0.enableLogging;
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Properties properties9 = new java.util.Properties(properties8);
        java.util.Set<java.lang.Object> objSet10 = properties8.keySet();
        java.util.Collection<java.lang.Object> objCollection11 = properties8.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int13 = atomikosProperties12.getConsoleFileCount();
        int int14 = atomikosProperties12.maxActives;
        atomikosProperties12.setEnableLogging(false);
        atomikosProperties12.threadedTwoPhaseCommit = true;
        atomikosProperties12.setConsoleFileLimit((int) (byte) 100);
        atomikosProperties12.maxActives = 52;
        boolean boolean23 = properties8.containsValue((java.lang.Object) 52);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet24 = properties8.entrySet();
        java.util.Properties properties25 = new java.util.Properties(properties8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(objSet10);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objEntrySet24);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        int int3 = atomikosProperties0.getConsoleFileLimit();
        java.util.Properties properties4 = atomikosProperties0.asProperties();
        atomikosProperties0.setAllowSubTransactions(false);
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties8.enableLogging = true;
        long long11 = atomikosProperties8.getCheckpointInterval();
        atomikosProperties8.setService("tmlog");
        atomikosProperties8.setConsoleFileName("{}");
        java.util.Properties properties16 = atomikosProperties8.asProperties();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet17 = properties16.entrySet();
        boolean boolean18 = properties7.contains((java.lang.Object) properties16);
        boolean boolean19 = properties7.isEmpty();
        java.util.Enumeration<java.lang.Object> objEnumeration20 = properties7.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.logBaseDir = "";
        atomikosProperties21.setConsoleFileCount((int) (short) 10);
        long long26 = atomikosProperties21.getMaxTimeout();
        java.util.Properties properties27 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet28 = properties27.keySet();
        atomikosProperties21.set(properties27, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str32 = atomikosProperties21.service;
        java.lang.String str33 = atomikosProperties21.getService();
        boolean boolean34 = atomikosProperties21.enableLogging;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel35 = atomikosProperties21.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties36 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties36.logBaseDir = "";
        atomikosProperties36.setConsoleFileCount((int) (short) 10);
        atomikosProperties36.setLogBaseDir("{}");
        java.lang.String str43 = atomikosProperties36.getOutputDir();
        atomikosProperties36.setLogBaseName("hi!");
        boolean boolean46 = atomikosProperties36.isAllowSubTransactions();
        boolean boolean47 = atomikosProperties36.isThreadedTwoPhaseCommit();
        boolean boolean48 = atomikosProperties36.forceShutdownOnVmExit;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery49 = atomikosProperties36.getRecovery();
        recovery49.setRetryInterval((long) (byte) 100);
        recovery49.delay = 2;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery54 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery54.maxRetries = (-1);
        recovery54.setDelay((long) (short) 0);
        recovery54.maxRetries = 0;
        recovery54.setMaxRetries((int) '#');
        int int63 = recovery54.maxRetries;
        int int64 = recovery54.getMaxRetries();
        long long65 = recovery54.getForgetOrphanedLogEntriesDelay();
        long long66 = recovery54.getDelay();
        recovery54.retryInterval = 'a';
        int int69 = recovery54.getMaxRetries();
        boolean boolean70 = properties7.replace((java.lang.Object) atomikosLoggingLevel35, (java.lang.Object) recovery49, (java.lang.Object) int69);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties71 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties71.logBaseDir = "";
        atomikosProperties71.setConsoleFileCount((int) (short) 10);
        atomikosProperties71.setService("");
        java.lang.String str78 = atomikosProperties71.getOutputDir();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties79 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties79.enableLogging = true;
        int int82 = atomikosProperties79.consoleFileLimit;
        atomikosProperties79.logBaseName = "hi!";
        atomikosProperties79.setEnableLogging(false);
        atomikosProperties79.forceShutdownOnVmExit = false;
        boolean boolean89 = atomikosProperties79.isForceShutdownOnVmExit();
        java.lang.Object obj90 = properties7.putIfAbsent((java.lang.Object) atomikosProperties71, (java.lang.Object) atomikosProperties79);
        java.util.Properties properties91 = new java.util.Properties(properties7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 500L + "'", long11 == 500L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(objEntrySet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objEnumeration20);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 300000L + "'", long26 == 300000L);
        org.junit.Assert.assertNotNull(objSet28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel35 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel35.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(recovery49);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 86400000L + "'", long65 == 86400000L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 35 + "'", int69 == 35);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties0.values();
        int int3 = properties0.size();
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.elements();
        java.util.Properties properties5 = new java.util.Properties(properties0);
        java.lang.Object obj6 = properties0.clone();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery7 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long8 = recovery7.getRetryInterval();
        recovery7.delay = 10L;
        recovery7.setForgetOrphanedLogEntriesDelay(0L);
        long long13 = recovery7.getRetryInterval();
        recovery7.maxRetries = 1;
        long long16 = recovery7.getRetryInterval();
        recovery7.setForgetOrphanedLogEntriesDelay(500L);
        recovery7.maxRetries = (byte) -1;
        recovery7.forgetOrphanedLogEntriesDelay = (short) 10;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties23 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties23.setDefaultJtaTimeout((-1L));
        java.lang.String str26 = atomikosProperties23.getTransactionManagerUniqueName();
        java.util.Properties properties27 = atomikosProperties23.asProperties();
        java.lang.String str28 = atomikosProperties23.getService();
        java.lang.String str29 = atomikosProperties23.logBaseDir;
        atomikosProperties23.defaultJtaTimeout = 21L;
        boolean boolean32 = atomikosProperties23.isThreadedTwoPhaseCommit();
        java.lang.Object obj33 = properties0.put((java.lang.Object) (short) 10, (java.lang.Object) atomikosProperties23);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10000L + "'", long13 == 10000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10000L + "'", long16 == 10000L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        java.lang.String str5 = atomikosProperties0.getOutputDir();
        atomikosProperties0.service = "tmlog";
        java.util.Properties properties8 = new java.util.Properties();
        java.util.Properties properties9 = new java.util.Properties(properties8);
        java.util.Collection<java.lang.Object> objCollection10 = properties9.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties11.enableLogging = true;
        long long14 = atomikosProperties11.getCheckpointInterval();
        boolean boolean16 = properties9.remove((java.lang.Object) long14, (java.lang.Object) (byte) 100);
        boolean boolean18 = properties9.equals((java.lang.Object) (short) 1);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet19 = properties9.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties20.setDefaultJtaTimeout((-1L));
        long long23 = atomikosProperties20.checkpointInterval;
        boolean boolean24 = atomikosProperties20.forceShutdownOnVmExit;
        atomikosProperties20.setThreadedTwoPhaseCommit(true);
        boolean boolean27 = properties9.contains((java.lang.Object) true);
        java.util.Properties properties28 = new java.util.Properties(properties9);
        boolean boolean30 = properties28.containsValue((java.lang.Object) (short) -1);
        java.util.Properties properties32 = new java.util.Properties();
        java.util.Properties properties33 = new java.util.Properties(properties32);
        java.util.Properties properties35 = new java.util.Properties();
        java.lang.Object obj37 = properties35.get((java.lang.Object) 0.0d);
        java.lang.Object obj38 = properties35.clone();
        java.lang.String str39 = properties35.toString();
        boolean boolean42 = properties35.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj43 = properties33.replace((java.lang.Object) 10.0d, (java.lang.Object) properties35);
        java.lang.String str44 = properties35.toString();
        java.util.Properties properties45 = new java.util.Properties(properties35);
        java.util.Properties properties46 = new java.util.Properties();
        java.util.Properties properties47 = new java.util.Properties(properties46);
        java.util.Properties properties49 = new java.util.Properties();
        java.lang.Object obj51 = properties49.get((java.lang.Object) 0.0d);
        java.lang.Object obj52 = properties49.clone();
        java.lang.String str53 = properties49.toString();
        boolean boolean56 = properties49.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj57 = properties47.replace((java.lang.Object) 10.0d, (java.lang.Object) properties49);
        java.util.Properties properties58 = new java.util.Properties(properties47);
        properties45.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties58);
        atomikosProperties0.set(properties28, "{com.atomikos.icatch.hi!=-1.0}", (java.lang.Object) properties45);
        java.lang.String str61 = atomikosProperties0.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery62 = atomikosProperties0.getRecovery();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 500L + "'", long14 == 500L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objEntrySet19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 500L + "'", long23 == 500L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "{}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{}" + "'", str39, "{}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "{}" + "'", str44, "{}");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "{}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "{}" + "'", str53, "{}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(recovery62);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        atomikosProperties0.setEnableLogging(false);
        atomikosProperties0.setTransactionManagerUniqueName("");
        atomikosProperties0.forceShutdownOnVmExit = true;
        atomikosProperties0.setLogBaseName("hi!");
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel14 = atomikosProperties0.consoleLogLevel;
        atomikosProperties0.setLogBaseDir("{tmlog={com.atomikos.icatch.hi!=-1.0}}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel14 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel14.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        boolean boolean9 = atomikosProperties0.serialJtaTransactions;
        int int10 = atomikosProperties0.getConsoleFileLimit();
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        int int13 = atomikosProperties0.consoleFileCount;
        java.lang.String str14 = atomikosProperties0.getConsoleFileName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tm.out" + "'", str14, "tm.out");
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        boolean boolean12 = atomikosProperties0.enableLogging;
        atomikosProperties0.setLogBaseDir("");
        atomikosProperties0.setAllowSubTransactions(true);
        java.lang.String str17 = atomikosProperties0.logBaseDir;
        atomikosProperties0.setConsoleFileCount(0);
        atomikosProperties0.maxTimeout = 5;
        boolean boolean22 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.logBaseName = "";
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long1 = recovery0.getRetryInterval();
        int int2 = recovery0.maxRetries;
        recovery0.forgetOrphanedLogEntriesDelay = 52;
        long long5 = recovery0.delay;
        long long6 = recovery0.delay;
        long long7 = recovery0.getForgetOrphanedLogEntriesDelay();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setLogBaseName("hi!");
        boolean boolean10 = atomikosProperties0.isAllowSubTransactions();
        int int11 = atomikosProperties0.getConsoleFileCount();
        java.util.Properties properties12 = atomikosProperties0.asProperties();
        atomikosProperties0.setService("{com.atomikos.icatch.hi!=-1.0, =hi!}");
        boolean boolean15 = atomikosProperties0.isEnableLogging();
        int int16 = atomikosProperties0.getConsoleFileCount();
        atomikosProperties0.consoleFileName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        atomikosProperties0.setConsoleFileLimit((int) (short) 100);
        atomikosProperties0.setForceShutdownOnVmExit(false);
        java.lang.String str15 = atomikosProperties0.logBaseName;
        atomikosProperties0.checkpointInterval = 50;
        atomikosProperties0.consoleFileLimit = (byte) -1;
        java.lang.String str20 = atomikosProperties0.getLogBaseDir();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "tmlog" + "'", str15, "tmlog");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        boolean boolean5 = atomikosProperties0.forceShutdownOnVmExit;
        long long6 = atomikosProperties0.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery7 = atomikosProperties0.getRecovery();
        recovery7.maxRetries = (short) 1;
        recovery7.setRetryInterval((long) 97);
        long long12 = recovery7.getRetryInterval();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertNotNull(recovery7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.service = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties6.logBaseDir = "";
        atomikosProperties6.setConsoleFileCount((int) (short) 10);
        long long11 = atomikosProperties6.getMaxTimeout();
        java.util.Properties properties12 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet13 = properties12.keySet();
        atomikosProperties6.set(properties12, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj19 = properties12.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties20.setDefaultJtaTimeout((-1L));
        java.util.Properties properties23 = new java.util.Properties();
        java.lang.Object obj25 = properties23.get((java.lang.Object) 0.0d);
        java.lang.Object obj26 = properties23.clone();
        boolean boolean28 = properties12.replace((java.lang.Object) (-1L), obj26, (java.lang.Object) 100.0d);
        java.util.Properties properties29 = new java.util.Properties();
        java.util.Properties properties30 = new java.util.Properties(properties29);
        properties30.clear();
        properties12.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties30);
        java.util.Enumeration<java.lang.Object> objEnumeration33 = properties30.elements();
        java.lang.String str35 = properties30.getProperty("");
        java.util.Properties properties36 = new java.util.Properties(properties30);
        java.util.Enumeration<java.lang.Object> objEnumeration37 = properties36.elements();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties38 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int39 = atomikosProperties38.getConsoleFileCount();
        int int40 = atomikosProperties38.maxActives;
        atomikosProperties38.setEnableLogging(true);
        boolean boolean43 = atomikosProperties38.isThreadedTwoPhaseCommit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel44 = atomikosProperties38.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties45 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties45.logBaseDir = "";
        atomikosProperties45.setConsoleFileCount((int) (short) 10);
        long long50 = atomikosProperties45.getMaxTimeout();
        java.util.Properties properties51 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet52 = properties51.keySet();
        atomikosProperties45.set(properties51, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str56 = atomikosProperties45.logBaseDir;
        boolean boolean57 = atomikosProperties45.enableLogging;
        java.lang.Object obj58 = properties36.putIfAbsent((java.lang.Object) atomikosLoggingLevel44, (java.lang.Object) atomikosProperties45);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel44);
        boolean boolean60 = atomikosProperties0.isAllowSubTransactions();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery61 = atomikosProperties0.recovery;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objEnumeration33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(objEnumeration37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 50 + "'", int40 == 50);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel44 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel44.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 300000L + "'", long50 == 300000L);
        org.junit.Assert.assertNotNull(objSet52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(recovery61);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        atomikosProperties0.setConsoleFileCount((int) (byte) 0);
        atomikosProperties0.setDefaultJtaTimeout(50L);
        boolean boolean18 = atomikosProperties0.isThreadedTwoPhaseCommit();
        int int19 = atomikosProperties0.consoleFileLimit;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.lang.String str7 = atomikosProperties0.getOutputDir();
        atomikosProperties0.setLogBaseName("hi!");
        boolean boolean10 = atomikosProperties0.isAllowSubTransactions();
        boolean boolean11 = atomikosProperties0.isThreadedTwoPhaseCommit();
        boolean boolean12 = atomikosProperties0.forceShutdownOnVmExit;
        boolean boolean13 = atomikosProperties0.enableLogging;
        atomikosProperties0.setTransactionManagerUniqueName("");
        atomikosProperties0.setThreadedTwoPhaseCommit(true);
        boolean boolean18 = atomikosProperties0.isThreadedTwoPhaseCommit();
        atomikosProperties0.transactionManagerUniqueName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}";
        java.util.Properties properties21 = atomikosProperties0.asProperties();
        java.lang.String str23 = properties21.getProperty("tmlog");
        java.util.Properties properties24 = new java.util.Properties(properties21);
        java.util.Enumeration<?> wildcardEnumeration25 = properties24.propertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties26.enableLogging = true;
        long long29 = atomikosProperties26.getCheckpointInterval();
        java.lang.String str30 = atomikosProperties26.getService();
        java.lang.String str31 = atomikosProperties26.logBaseDir;
        atomikosProperties26.setEnableLogging(false);
        atomikosProperties26.consoleFileCount = 0;
        long long36 = atomikosProperties26.getMaxTimeout();
        boolean boolean37 = atomikosProperties26.isEnableLogging();
        atomikosProperties26.maxTimeout = ' ';
        java.util.Properties properties40 = atomikosProperties26.asProperties();
        java.lang.String str41 = atomikosProperties26.getTransactionManagerUniqueName();
        atomikosProperties26.setLogBaseDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=hi!, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties44 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties44.logBaseDir = "";
        atomikosProperties44.setConsoleFileCount((int) (short) 10);
        java.lang.String str49 = atomikosProperties44.logBaseName;
        atomikosProperties44.outputDir = "";
        java.util.Properties properties52 = atomikosProperties44.asProperties();
        int int53 = atomikosProperties44.getConsoleFileLimit();
        java.util.Properties properties54 = atomikosProperties44.asProperties();
        long long55 = atomikosProperties44.getCheckpointInterval();
        java.lang.Object obj56 = properties24.getOrDefault((java.lang.Object) atomikosProperties26, (java.lang.Object) atomikosProperties44);
        boolean boolean57 = atomikosProperties26.serialJtaTransactions;
        java.lang.String str58 = atomikosProperties26.getService();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardEnumeration25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 500L + "'", long29 == 500L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 300000L + "'", long36 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "tmlog" + "'", str49, "tmlog");
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 500L + "'", long55 == 500L);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Properties properties9 = atomikosProperties0.asProperties();
        java.util.Properties properties10 = atomikosProperties0.asProperties();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet11 = properties10.entrySet();
        java.lang.String str14 = properties10.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}", "{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=52, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(objEntrySet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=52, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}" + "'", str14, "{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=52, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.service = "";
        java.lang.String str8 = atomikosProperties0.logBaseDir;
        java.lang.String str9 = atomikosProperties0.getOutputDir();
        java.lang.String str10 = atomikosProperties0.getLogBaseDir();
        atomikosProperties0.setTransactionManagerUniqueName("hi!");
        java.lang.String str13 = atomikosProperties0.getLogBaseDir();
        atomikosProperties0.setConsoleFileCount(5);
        atomikosProperties0.setForceShutdownOnVmExit(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.service = "";
        atomikosProperties0.forceShutdownOnVmExit = true;
        long long10 = atomikosProperties0.maxTimeout;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        java.lang.String str5 = atomikosProperties0.getOutputDir();
        atomikosProperties0.service = "tmlog";
        java.lang.String str8 = atomikosProperties0.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.setDefaultJtaTimeout((-1L));
        long long12 = atomikosProperties9.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int14 = atomikosProperties13.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties15.logBaseDir = "";
        atomikosProperties15.setConsoleFileCount((int) (short) 10);
        atomikosProperties15.setCheckpointInterval(10000L);
        long long22 = atomikosProperties15.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel23 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties15.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties13.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties9.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel23);
        java.lang.String str28 = atomikosProperties0.transactionManagerUniqueName;
        atomikosProperties0.setThreadedTwoPhaseCommit(false);
        atomikosProperties0.setService("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir={}, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.util.Properties properties33 = atomikosProperties0.asProperties();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 500L + "'", long12 == 500L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 300000L + "'", long22 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel23 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel23.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = properties6.setProperty("", "hi!");
        java.util.Set<java.lang.String> strSet14 = properties6.stringPropertyNames();
        java.util.Properties properties15 = new java.util.Properties(properties6);
        java.util.Properties properties16 = new java.util.Properties(properties15);
        java.util.Collection<java.lang.Object> objCollection17 = properties16.values();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(objCollection17);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties0.values();
        int int3 = properties0.size();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery4 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery4.maxRetries = (-1);
        recovery4.setDelay((long) (short) 0);
        recovery4.maxRetries = 0;
        boolean boolean12 = properties0.remove((java.lang.Object) 0, (java.lang.Object) (-1));
        java.util.Set<java.lang.Object> objSet13 = properties0.keySet();
        java.util.Enumeration<java.lang.Object> objEnumeration14 = properties0.keys();
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objEnumeration14);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setCheckpointInterval(10000L);
        long long7 = atomikosProperties0.maxTimeout;
        int int8 = atomikosProperties0.maxActives;
        atomikosProperties0.setCheckpointInterval((long) 0);
        java.util.Properties properties11 = atomikosProperties0.asProperties();
        java.util.Properties properties12 = atomikosProperties0.asProperties();
        java.lang.Object obj13 = properties12.clone();
        java.util.Properties properties14 = new java.util.Properties(properties12);
        java.lang.Object obj17 = properties14.setProperty("{com.atomikos.icatch.tmlog=-1}", "{{{}={}}={com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}}");
        java.util.Enumeration<java.lang.Object> objEnumeration18 = properties14.elements();
        boolean boolean19 = properties14.isEmpty();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals(obj13.toString(), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=0, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=0, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=0, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objEnumeration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties0.values();
        int int3 = properties0.size();
        int int4 = properties0.size();
        java.util.Set<java.lang.Object> objSet5 = properties0.keySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties6.logBaseDir = "";
        atomikosProperties6.setConsoleFileCount((int) (short) 10);
        long long11 = atomikosProperties6.getMaxTimeout();
        java.util.Properties properties12 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet13 = properties12.keySet();
        atomikosProperties6.set(properties12, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str17 = atomikosProperties6.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery18 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery18.maxRetries = (-1);
        recovery18.setDelay((long) (short) 1);
        long long23 = recovery18.getForgetOrphanedLogEntriesDelay();
        long long24 = recovery18.getForgetOrphanedLogEntriesDelay();
        java.lang.Object obj25 = properties0.put((java.lang.Object) atomikosProperties6, (java.lang.Object) long24);
        java.util.Properties properties26 = new java.util.Properties(properties0);
        java.util.Properties properties27 = new java.util.Properties(properties26);
        java.util.Properties properties28 = new java.util.Properties();
        java.lang.Object obj30 = properties28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = properties28.clone();
        java.lang.String str32 = properties28.toString();
        java.util.Properties properties33 = new java.util.Properties(properties28);
        java.util.Properties properties34 = new java.util.Properties(properties33);
        java.util.Properties properties35 = new java.util.Properties(properties34);
        properties26.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties35);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 86400000L + "'", long23 == 86400000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 86400000L + "'", long24 == 86400000L);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        long long1 = atomikosProperties0.defaultJtaTimeout;
        atomikosProperties0.logBaseName = "tm.out";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties4.logBaseDir = "";
        atomikosProperties4.setConsoleFileCount((int) (short) 10);
        long long9 = atomikosProperties4.getMaxTimeout();
        java.util.Properties properties10 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet11 = properties10.keySet();
        atomikosProperties4.set(properties10, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj17 = properties10.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties18.setDefaultJtaTimeout((-1L));
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = properties21.clone();
        boolean boolean26 = properties10.replace((java.lang.Object) (-1L), obj24, (java.lang.Object) 100.0d);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties28.logBaseDir = "";
        atomikosProperties28.setConsoleFileCount((int) (short) 10);
        long long33 = atomikosProperties28.getMaxTimeout();
        java.util.Properties properties34 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet35 = properties34.keySet();
        atomikosProperties28.set(properties34, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj41 = properties34.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties42.setDefaultJtaTimeout((-1L));
        java.util.Properties properties45 = new java.util.Properties();
        java.lang.Object obj47 = properties45.get((java.lang.Object) 0.0d);
        java.lang.Object obj48 = properties45.clone();
        boolean boolean50 = properties34.replace((java.lang.Object) (-1L), obj48, (java.lang.Object) 100.0d);
        java.util.Properties properties51 = new java.util.Properties();
        java.util.Properties properties52 = new java.util.Properties(properties51);
        properties52.clear();
        properties34.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties52);
        java.util.Enumeration<java.lang.Object> objEnumeration55 = properties52.elements();
        java.lang.String str57 = properties52.getProperty("");
        java.util.Properties properties58 = new java.util.Properties();
        java.lang.Object obj60 = properties58.get((java.lang.Object) 0.0d);
        java.lang.Object obj61 = properties58.clone();
        java.lang.String str62 = properties58.toString();
        boolean boolean64 = properties52.remove((java.lang.Object) properties58, (java.lang.Object) 0);
        java.util.Enumeration<?> wildcardEnumeration65 = properties52.propertyNames();
        atomikosProperties0.set(properties10, "hi!", (java.lang.Object) wildcardEnumeration65);
        java.lang.String str67 = atomikosProperties0.transactionManagerUniqueName;
        boolean boolean68 = atomikosProperties0.isThreadedTwoPhaseCommit();
        java.lang.String str69 = atomikosProperties0.logBaseName;
        java.lang.String str70 = atomikosProperties0.getOutputDir();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L + "'", long1 == 10000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 300000L + "'", long33 == 300000L);
        org.junit.Assert.assertNotNull(objSet35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "{}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objEnumeration55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "{}");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "{}" + "'", str62, "{}");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardEnumeration65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "tm.out" + "'", str69, "tm.out");
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "";
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.setTransactionManagerUniqueName("{}");
        atomikosProperties0.checkpointInterval = (-1L);
        int int16 = atomikosProperties0.consoleFileCount;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = atomikosProperties0.recovery;
        long long18 = atomikosProperties0.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel19 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(recovery17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 300000L + "'", long18 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel19 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel19.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setService("tmlog");
        atomikosProperties0.setConsoleFileName("{}");
        java.lang.String str8 = atomikosProperties0.getConsoleFileName();
        atomikosProperties0.transactionManagerUniqueName = "{com.atomikos.icatch.hi!=-1.0}";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery11 = atomikosProperties0.getRecovery();
        recovery11.maxRetries = 52;
        recovery11.maxRetries = 0;
        int int16 = recovery11.maxRetries;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(recovery11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        java.lang.String str4 = atomikosProperties0.getOutputDir();
        java.lang.String str5 = atomikosProperties0.service;
        java.lang.String str6 = atomikosProperties0.service;
        atomikosProperties0.serialJtaTransactions = false;
        boolean boolean9 = atomikosProperties0.serialJtaTransactions;
        atomikosProperties0.outputDir = "{true=10000}";
        atomikosProperties0.setConsoleFileCount((int) (byte) 1);
        atomikosProperties0.transactionManagerUniqueName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=0, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties1.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties3.enableLogging = true;
        long long6 = atomikosProperties3.getCheckpointInterval();
        boolean boolean8 = properties1.remove((java.lang.Object) long6, (java.lang.Object) (byte) 100);
        boolean boolean10 = properties1.equals((java.lang.Object) (short) 1);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet11 = properties1.entrySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties12.setDefaultJtaTimeout((-1L));
        long long15 = atomikosProperties12.checkpointInterval;
        boolean boolean16 = atomikosProperties12.forceShutdownOnVmExit;
        atomikosProperties12.setThreadedTwoPhaseCommit(true);
        boolean boolean19 = properties1.contains((java.lang.Object) true);
        java.util.Properties properties20 = new java.util.Properties(properties1);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel24 = null;
        atomikosProperties21.consoleLogLevel = atomikosLoggingLevel24;
        long long26 = atomikosProperties21.checkpointInterval;
        java.lang.String str27 = atomikosProperties21.getLogBaseName();
        atomikosProperties21.setDefaultJtaTimeout((long) 0);
        atomikosProperties21.setAllowSubTransactions(false);
        boolean boolean32 = atomikosProperties21.isSerialJtaTransactions();
        java.util.Properties properties33 = atomikosProperties21.asProperties();
        boolean boolean34 = properties33.isEmpty();
        java.util.Properties properties35 = new java.util.Properties(properties33);
        properties20.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties35);
        java.util.Properties properties37 = new java.util.Properties();
        java.util.Properties properties38 = new java.util.Properties(properties37);
        java.util.Properties properties40 = new java.util.Properties();
        java.lang.Object obj42 = properties40.get((java.lang.Object) 0.0d);
        java.lang.Object obj43 = properties40.clone();
        java.lang.String str44 = properties40.toString();
        boolean boolean47 = properties40.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj48 = properties38.replace((java.lang.Object) 10.0d, (java.lang.Object) properties40);
        java.lang.String str49 = properties40.toString();
        java.util.Properties properties50 = new java.util.Properties(properties40);
        java.lang.Object obj53 = properties50.getOrDefault((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        boolean boolean54 = properties50.isEmpty();
        boolean boolean55 = properties50.isEmpty();
        java.util.Properties properties56 = new java.util.Properties(properties50);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties57.logBaseDir = "";
        atomikosProperties57.setConsoleFileCount((int) (short) 10);
        long long62 = atomikosProperties57.getMaxTimeout();
        atomikosProperties57.service = "";
        java.lang.String str65 = atomikosProperties57.logBaseDir;
        boolean boolean66 = atomikosProperties57.threadedTwoPhaseCommit;
        java.lang.String str67 = atomikosProperties57.getService();
        java.lang.String str68 = atomikosProperties57.consoleFileName;
        boolean boolean69 = atomikosProperties57.serialJtaTransactions;
        atomikosProperties57.service = "{com.atomikos.icatch.hi!=-1.0}";
        int int72 = atomikosProperties57.getConsoleFileCount();
        boolean boolean73 = atomikosProperties57.isEnableLogging();
        atomikosProperties57.transactionManagerUniqueName = "{{}=tmlog}";
        atomikosProperties57.maxTimeout = 5;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties78 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties78.setDefaultJtaTimeout((-1L));
        long long81 = atomikosProperties78.checkpointInterval;
        java.lang.Object obj82 = properties56.replace((java.lang.Object) 5, (java.lang.Object) atomikosProperties78);
        java.lang.Object obj83 = properties20.remove((java.lang.Object) atomikosProperties78);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 500L + "'", long6 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objEntrySet11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 500L + "'", long15 == 500L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 500L + "'", long26 == 500L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "tmlog" + "'", str27, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "{}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "{}" + "'", str44, "{}");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{}" + "'", str49, "{}");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) -1 + "'", obj53, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 300000L + "'", long62 == 300000L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "tm.out" + "'", str68, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 500L + "'", long81 == 500L);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        long long3 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int5 = atomikosProperties4.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties6.logBaseDir = "";
        atomikosProperties6.setConsoleFileCount((int) (short) 10);
        atomikosProperties6.setCheckpointInterval(10000L);
        long long13 = atomikosProperties6.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel14 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties6.consoleLogLevel = atomikosLoggingLevel14;
        atomikosProperties4.consoleLogLevel = atomikosLoggingLevel14;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel14;
        java.util.Properties properties18 = new java.util.Properties();
        java.util.Properties properties19 = new java.util.Properties(properties18);
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = properties21.clone();
        java.lang.String str25 = properties21.toString();
        boolean boolean28 = properties21.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj29 = properties19.replace((java.lang.Object) 10.0d, (java.lang.Object) properties21);
        java.util.Properties properties30 = new java.util.Properties(properties19);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties32 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties32.setDefaultJtaTimeout((-1L));
        int int35 = atomikosProperties32.getConsoleFileLimit();
        java.util.Properties properties36 = atomikosProperties32.asProperties();
        java.util.Properties properties37 = new java.util.Properties(properties36);
        atomikosProperties0.set(properties30, "hi!", (java.lang.Object) properties36);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties39.enableLogging = true;
        long long42 = atomikosProperties39.getCheckpointInterval();
        atomikosProperties39.setService("tmlog");
        atomikosProperties39.setCheckpointInterval((long) (short) 0);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties47.logBaseDir = "";
        atomikosProperties47.setConsoleFileCount((int) (short) 10);
        atomikosProperties47.setCheckpointInterval(10000L);
        long long54 = atomikosProperties47.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel55 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties47.consoleLogLevel = atomikosLoggingLevel55;
        java.lang.Object obj57 = properties36.put((java.lang.Object) (short) 0, (java.lang.Object) atomikosLoggingLevel55);
        java.lang.String str58 = properties36.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties59 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties59.logBaseDir = "";
        atomikosProperties59.setConsoleFileCount((int) (short) 10);
        long long64 = atomikosProperties59.getMaxTimeout();
        atomikosProperties59.service = "";
        java.lang.String str67 = atomikosProperties59.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties68 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties68.logBaseDir = "";
        atomikosProperties68.setConsoleFileCount((int) (short) 10);
        java.lang.String str73 = atomikosProperties68.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel74 = atomikosProperties68.getConsoleLogLevel();
        atomikosProperties59.consoleLogLevel = atomikosLoggingLevel74;
        boolean boolean76 = properties36.containsValue((java.lang.Object) atomikosProperties59);
        java.lang.String str77 = atomikosProperties59.getConsoleFileName();
        atomikosProperties59.setDefaultJtaTimeout((long) 100);
        boolean boolean80 = atomikosProperties59.threadedTwoPhaseCommit;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel14 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel14.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 500L + "'", long42 == 500L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 300000L + "'", long54 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel55 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel55.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertNull(obj57);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}" + "'", str58, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 300000L + "'", long64 == 300000L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel74 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel74.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "tm.out" + "'", str77, "tm.out");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet1 = properties0.keySet();
        properties0.clear();
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.Object obj5 = properties3.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = properties3.clone();
        java.lang.String str7 = properties3.toString();
        boolean boolean10 = properties3.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        properties3.clear();
        java.util.Properties properties12 = new java.util.Properties(properties3);
        java.lang.Object obj13 = properties0.get((java.lang.Object) properties3);
        java.io.PrintStream printStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties3.list(printStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel3;
        boolean boolean5 = atomikosProperties0.enableLogging;
        atomikosProperties0.logBaseDir = "{}";
        long long8 = atomikosProperties0.maxTimeout;
        java.util.Properties properties9 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties10.logBaseDir = "";
        atomikosProperties10.setConsoleFileCount((int) (short) 10);
        atomikosProperties10.setLogBaseDir("{}");
        java.util.Properties properties17 = atomikosProperties10.asProperties();
        atomikosProperties10.service = "";
        boolean boolean20 = atomikosProperties10.isEnableLogging();
        atomikosProperties10.maxActives = (byte) 1;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery23 = atomikosProperties10.recovery;
        java.util.Properties properties24 = new java.util.Properties();
        java.util.Properties properties25 = new java.util.Properties(properties24);
        properties24.clear();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery27 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery27.maxRetries = (-1);
        recovery27.setDelay((long) (short) 0);
        recovery27.maxRetries = 0;
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery34 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long35 = recovery34.getRetryInterval();
        long long36 = recovery34.retryInterval;
        boolean boolean37 = properties24.remove((java.lang.Object) 0, (java.lang.Object) long36);
        java.lang.String str38 = properties24.toString();
        java.lang.Object obj39 = properties9.putIfAbsent((java.lang.Object) recovery23, (java.lang.Object) str38);
        java.util.Properties properties40 = new java.util.Properties(properties9);
        java.lang.String str42 = properties9.getProperty("{{}=tmlog}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(recovery23);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10000L + "'", long35 == 10000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10000L + "'", long36 == 10000L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{}" + "'", str38, "{}");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        java.util.Properties properties8 = new java.util.Properties(properties7);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        atomikosProperties9.setCheckpointInterval(10000L);
        long long16 = atomikosProperties9.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel17 = atomikosProperties9.getConsoleLogLevel();
        boolean boolean18 = properties8.containsValue((java.lang.Object) atomikosProperties9);
        java.lang.String str20 = properties8.getProperty("{{}={}}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.logBaseDir = "";
        atomikosProperties21.setConsoleFileCount((int) (short) 10);
        java.lang.String str26 = atomikosProperties21.logBaseName;
        atomikosProperties21.outputDir = "";
        java.util.Properties properties29 = atomikosProperties21.asProperties();
        java.util.Properties properties30 = new java.util.Properties(properties29);
        java.util.Properties properties31 = new java.util.Properties();
        java.util.Properties properties32 = new java.util.Properties(properties31);
        java.util.Collection<java.lang.Object> objCollection33 = properties31.values();
        int int34 = properties31.size();
        java.util.Enumeration<java.lang.Object> objEnumeration35 = properties31.elements();
        java.util.Properties properties36 = new java.util.Properties(properties31);
        boolean boolean37 = properties29.containsKey((java.lang.Object) properties31);
        java.util.Collection<java.lang.Object> objCollection38 = properties29.values();
        boolean boolean39 = properties8.equals((java.lang.Object) properties29);
        java.util.Properties properties40 = new java.util.Properties();
        java.util.Properties properties41 = new java.util.Properties(properties40);
        java.util.Collection<java.lang.Object> objCollection42 = properties41.values();
        boolean boolean43 = properties41.isEmpty();
        java.util.Set<java.lang.String> strSet44 = properties41.stringPropertyNames();
        java.lang.String str46 = properties41.getProperty("");
        java.util.Properties properties47 = new java.util.Properties();
        java.lang.Object obj49 = properties47.get((java.lang.Object) 0.0d);
        java.lang.Object obj50 = properties47.clone();
        java.lang.String str51 = properties47.toString();
        boolean boolean54 = properties47.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj55 = null;
        boolean boolean56 = properties47.equals(obj55);
        java.util.Set<java.lang.Object> objSet57 = properties47.keySet();
        boolean boolean58 = properties41.contains((java.lang.Object) properties47);
        java.util.Set<java.lang.Object> objSet59 = properties41.keySet();
        java.util.Enumeration<java.lang.Object> objEnumeration60 = properties41.keys();
        properties8.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties41);
        java.io.InputStream inputStream62 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties8.load(inputStream62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel17 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel17.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "tmlog" + "'", str26, "tmlog");
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(objCollection33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objEnumeration35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objCollection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objCollection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "{}");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "{}" + "'", str51, "{}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objSet57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objSet59);
        org.junit.Assert.assertNotNull(objEnumeration60);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        int int3 = atomikosProperties0.consoleFileLimit;
        atomikosProperties0.logBaseName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery6 = atomikosProperties0.getRecovery();
        atomikosProperties0.checkpointInterval = (byte) 100;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        atomikosProperties9.setCheckpointInterval(10000L);
        long long16 = atomikosProperties9.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel17 = atomikosProperties9.getConsoleLogLevel();
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel17;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties19.logBaseDir = "";
        atomikosProperties19.setConsoleFileCount((int) (short) 10);
        long long24 = atomikosProperties19.getMaxTimeout();
        java.util.Properties properties25 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet26 = properties25.keySet();
        atomikosProperties19.set(properties25, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj32 = properties25.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties33.setDefaultJtaTimeout((-1L));
        java.util.Properties properties36 = new java.util.Properties();
        java.lang.Object obj38 = properties36.get((java.lang.Object) 0.0d);
        java.lang.Object obj39 = properties36.clone();
        boolean boolean41 = properties25.replace((java.lang.Object) (-1L), obj39, (java.lang.Object) 100.0d);
        java.util.Properties properties42 = new java.util.Properties();
        java.util.Properties properties43 = new java.util.Properties(properties42);
        properties43.clear();
        properties25.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties43);
        java.util.Enumeration<java.lang.Object> objEnumeration46 = properties43.elements();
        java.lang.String str48 = properties43.getProperty("");
        java.util.Properties properties49 = new java.util.Properties(properties43);
        java.util.Properties properties50 = new java.util.Properties(properties49);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties52 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties52.setDefaultJtaTimeout((-1L));
        long long55 = atomikosProperties52.checkpointInterval;
        boolean boolean56 = atomikosProperties52.forceShutdownOnVmExit;
        atomikosProperties52.setThreadedTwoPhaseCommit(true);
        atomikosProperties52.setOutputDir("");
        atomikosProperties52.setConsoleFileName("hi!");
        atomikosProperties52.setDefaultJtaTimeout((long) (byte) 1);
        atomikosProperties0.set(properties49, "", (java.lang.Object) atomikosProperties52);
        java.util.Properties properties66 = atomikosProperties52.asProperties();
        boolean boolean67 = atomikosProperties52.forceShutdownOnVmExit;
        atomikosProperties52.setService("{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=INFO, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.service=tmlog, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(recovery6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel17 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel17.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 300000L + "'", long24 == 300000L);
        org.junit.Assert.assertNotNull(objSet26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "{}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objEnumeration46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 500L + "'", long55 == 500L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        int int3 = atomikosProperties0.getMaxActives();
        atomikosProperties0.logBaseDir = "hi!";
        atomikosProperties0.allowSubTransactions = false;
        int int8 = atomikosProperties0.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        long long14 = atomikosProperties9.getMaxTimeout();
        java.util.Properties properties15 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet16 = properties15.keySet();
        atomikosProperties9.set(properties15, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str20 = atomikosProperties9.logBaseDir;
        java.lang.String str21 = atomikosProperties9.logBaseDir;
        java.lang.String str22 = atomikosProperties9.logBaseDir;
        java.lang.String str23 = atomikosProperties9.getService();
        atomikosProperties9.checkpointInterval = 100L;
        atomikosProperties9.enableLogging = false;
        int int28 = atomikosProperties9.getConsoleFileLimit();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties29.logBaseDir = "";
        atomikosProperties29.setConsoleFileCount((int) (short) 10);
        atomikosProperties29.setCheckpointInterval(10000L);
        long long36 = atomikosProperties29.maxTimeout;
        int int37 = atomikosProperties29.maxActives;
        long long38 = atomikosProperties29.getCheckpointInterval();
        atomikosProperties29.setMaxTimeout(10L);
        java.util.Properties properties41 = atomikosProperties29.asProperties();
        java.lang.String str42 = atomikosProperties29.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties43.logBaseDir = "";
        atomikosProperties43.setConsoleFileCount((int) (short) 10);
        atomikosProperties43.setCheckpointInterval(10000L);
        long long50 = atomikosProperties43.maxTimeout;
        int int51 = atomikosProperties43.maxActives;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties52 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties52.logBaseDir = "";
        boolean boolean55 = atomikosProperties52.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties56.logBaseDir = "";
        atomikosProperties56.setConsoleFileCount((int) (short) 10);
        long long61 = atomikosProperties56.getMaxTimeout();
        java.util.Properties properties62 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet63 = properties62.keySet();
        atomikosProperties56.set(properties62, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj69 = properties62.setProperty("", "hi!");
        java.util.Properties properties70 = new java.util.Properties();
        java.util.Properties properties71 = new java.util.Properties(properties70);
        java.util.Collection<java.lang.Object> objCollection72 = properties70.values();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel73 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        boolean boolean74 = properties62.remove((java.lang.Object) objCollection72, (java.lang.Object) atomikosLoggingLevel73);
        atomikosProperties52.setConsoleLogLevel(atomikosLoggingLevel73);
        atomikosProperties43.setConsoleLogLevel(atomikosLoggingLevel73);
        atomikosProperties29.setConsoleLogLevel(atomikosLoggingLevel73);
        atomikosProperties9.setConsoleLogLevel(atomikosLoggingLevel73);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel73);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 300000L + "'", long36 == 300000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 50 + "'", int37 == 50);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10000L + "'", long38 == 10000L);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 300000L + "'", long50 == 300000L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 50 + "'", int51 == 50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 300000L + "'", long61 == 300000L);
        org.junit.Assert.assertNotNull(objSet63);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(objCollection72);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel73 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel73.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setEnableLogging(true);
        boolean boolean5 = atomikosProperties0.isThreadedTwoPhaseCommit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel6 = atomikosProperties0.consoleLogLevel;
        boolean boolean7 = atomikosProperties0.isEnableLogging();
        boolean boolean8 = atomikosProperties0.forceShutdownOnVmExit;
        int int9 = atomikosProperties0.consoleFileLimit;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel6 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel6.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties1.values();
        java.lang.Object obj5 = properties1.setProperty("hi!", "{}");
        java.lang.String str7 = properties1.getProperty("tmlog");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties8.enableLogging = true;
        int int11 = atomikosProperties8.consoleFileLimit;
        atomikosProperties8.logBaseName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        long long15 = atomikosProperties14.defaultJtaTimeout;
        java.lang.String str16 = atomikosProperties14.getLogBaseName();
        atomikosProperties14.allowSubTransactions = true;
        boolean boolean19 = atomikosProperties14.enableLogging;
        java.lang.Object obj20 = properties1.getOrDefault((java.lang.Object) "hi!", (java.lang.Object) boolean19);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties21.logBaseDir = "";
        atomikosProperties21.setConsoleFileCount((int) (short) 10);
        atomikosProperties21.setLogBaseDir("{}");
        java.lang.String str28 = atomikosProperties21.getOutputDir();
        atomikosProperties21.setLogBaseName("hi!");
        boolean boolean31 = atomikosProperties21.isAllowSubTransactions();
        boolean boolean32 = atomikosProperties21.isThreadedTwoPhaseCommit();
        boolean boolean33 = atomikosProperties21.forceShutdownOnVmExit;
        boolean boolean34 = properties1.containsValue((java.lang.Object) atomikosProperties21);
        boolean boolean35 = atomikosProperties21.isEnableLogging();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel36 = atomikosProperties21.getConsoleLogLevel();
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tmlog" + "'", str16, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "{}" + "'", obj20, "{}");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel36 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel36.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setService("tmlog");
        atomikosProperties0.setCheckpointInterval((long) (short) 0);
        long long8 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setConsoleFileName("{{}={}}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties11.logBaseDir = "";
        atomikosProperties11.setConsoleFileCount((int) (short) 10);
        long long16 = atomikosProperties11.getMaxTimeout();
        java.util.Properties properties17 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet18 = properties17.keySet();
        atomikosProperties11.set(properties17, "hi!", (java.lang.Object) (-1.0f));
        java.util.Properties properties22 = new java.util.Properties();
        java.lang.Object obj24 = properties22.get((java.lang.Object) 0.0d);
        java.lang.Object obj25 = properties22.clone();
        java.lang.String str26 = properties22.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties27.logBaseDir = "";
        atomikosProperties27.setConsoleFileCount((int) (short) 10);
        long long32 = atomikosProperties27.getMaxTimeout();
        java.util.Properties properties33 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet34 = properties33.keySet();
        atomikosProperties27.set(properties33, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj40 = properties33.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties41.setDefaultJtaTimeout((-1L));
        java.util.Properties properties44 = new java.util.Properties();
        java.lang.Object obj46 = properties44.get((java.lang.Object) 0.0d);
        java.lang.Object obj47 = properties44.clone();
        boolean boolean49 = properties33.replace((java.lang.Object) (-1L), obj47, (java.lang.Object) 100.0d);
        java.util.Properties properties50 = new java.util.Properties();
        java.util.Properties properties51 = new java.util.Properties(properties50);
        properties51.clear();
        properties33.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties51);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties54 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties54.logBaseDir = "";
        atomikosProperties54.setConsoleFileCount((int) (short) 10);
        long long59 = atomikosProperties54.getMaxTimeout();
        java.util.Properties properties60 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet61 = properties60.keySet();
        atomikosProperties54.set(properties60, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str65 = atomikosProperties54.logBaseDir;
        java.lang.String str66 = atomikosProperties54.logBaseDir;
        java.util.Properties properties67 = atomikosProperties54.asProperties();
        java.lang.Object obj68 = properties22.replace((java.lang.Object) properties51, (java.lang.Object) atomikosProperties54);
        boolean boolean69 = properties17.contains((java.lang.Object) atomikosProperties54);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel70 = atomikosProperties54.consoleLogLevel;
        long long71 = atomikosProperties54.getMaxTimeout();
        boolean boolean72 = atomikosProperties54.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel73 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.DEBUG;
        atomikosProperties54.setConsoleLogLevel(atomikosLoggingLevel73);
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel73;
        atomikosProperties0.forceShutdownOnVmExit = true;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "{}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{}" + "'", str26, "{}");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 300000L + "'", long32 == 300000L);
        org.junit.Assert.assertNotNull(objSet34);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "{}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 300000L + "'", long59 == 300000L);
        org.junit.Assert.assertNotNull(objSet61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel70 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel70.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 300000L + "'", long71 == 300000L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel73 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.DEBUG + "'", atomikosLoggingLevel73.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.DEBUG));
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        java.lang.String str4 = atomikosProperties0.getOutputDir();
        java.lang.String str5 = atomikosProperties0.service;
        atomikosProperties0.maxTimeout = 100;
        atomikosProperties0.enableLogging = false;
        atomikosProperties0.forceShutdownOnVmExit = true;
        atomikosProperties0.setTransactionManagerUniqueName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=0, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}");
        atomikosProperties0.setOutputDir("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=hi!, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.util.Properties properties16 = atomikosProperties0.asProperties();
        java.lang.String str17 = atomikosProperties0.consoleFileName;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tm.out" + "'", str17, "tm.out");
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        java.lang.String str12 = atomikosProperties0.logBaseDir;
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        java.util.Enumeration<?> wildcardEnumeration14 = properties13.propertyNames();
        java.util.Set<java.lang.Object> objSet15 = properties13.keySet();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties16.enableLogging = true;
        long long19 = atomikosProperties16.getCheckpointInterval();
        atomikosProperties16.setService("tmlog");
        atomikosProperties16.setConsoleFileLimit((int) (short) 0);
        java.util.Properties properties24 = new java.util.Properties();
        java.util.Properties properties25 = new java.util.Properties(properties24);
        java.util.Collection<java.lang.Object> objCollection26 = properties25.values();
        java.util.Properties properties27 = new java.util.Properties();
        java.util.Properties properties28 = new java.util.Properties(properties27);
        java.util.Collection<java.lang.Object> objCollection29 = properties27.values();
        java.util.Enumeration<java.lang.Object> objEnumeration30 = properties27.keys();
        boolean boolean31 = properties25.contains((java.lang.Object) properties27);
        boolean boolean32 = properties25.isEmpty();
        boolean boolean33 = properties25.isEmpty();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery35 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery35.maxRetries = (-1);
        recovery35.setDelay((long) (short) 0);
        recovery35.maxRetries = (short) -1;
        long long42 = recovery35.retryInterval;
        int int43 = recovery35.getMaxRetries();
        atomikosProperties16.set(properties25, "tmlog", (java.lang.Object) int43);
        java.util.Properties properties45 = new java.util.Properties(properties25);
        java.lang.Object obj46 = properties13.remove((java.lang.Object) properties45);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(wildcardEnumeration14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 500L + "'", long19 == 500L);
        org.junit.Assert.assertNotNull(objCollection26);
        org.junit.Assert.assertNotNull(objCollection29);
        org.junit.Assert.assertNotNull(objEnumeration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10000L + "'", long42 == 10000L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setService("tmlog");
        atomikosProperties0.setConsoleFileName("{}");
        java.lang.String str8 = atomikosProperties0.getConsoleFileName();
        atomikosProperties0.transactionManagerUniqueName = "{com.atomikos.icatch.hi!=-1.0}";
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery11 = atomikosProperties0.getRecovery();
        recovery11.maxRetries = 52;
        long long14 = recovery11.forgetOrphanedLogEntriesDelay;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertNotNull(recovery11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86400000L + "'", long14 == 86400000L);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        int int3 = atomikosProperties0.getMaxActives();
        atomikosProperties0.logBaseDir = "hi!";
        atomikosProperties0.allowSubTransactions = false;
        int int8 = atomikosProperties0.getConsoleFileCount();
        atomikosProperties0.serialJtaTransactions = true;
        atomikosProperties0.forceShutdownOnVmExit = false;
        java.lang.String str13 = atomikosProperties0.transactionManagerUniqueName;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties14.logBaseDir = "";
        atomikosProperties14.setConsoleFileCount((int) (short) 10);
        long long19 = atomikosProperties14.getMaxTimeout();
        java.util.Properties properties20 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet21 = properties20.keySet();
        atomikosProperties14.set(properties20, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str25 = atomikosProperties14.logBaseDir;
        java.lang.String str26 = atomikosProperties14.logBaseDir;
        java.lang.String str27 = atomikosProperties14.logBaseDir;
        boolean boolean28 = atomikosProperties14.isEnableLogging();
        java.lang.String str29 = atomikosProperties14.getTransactionManagerUniqueName();
        atomikosProperties14.threadedTwoPhaseCommit = true;
        boolean boolean32 = atomikosProperties14.serialJtaTransactions;
        atomikosProperties14.forceShutdownOnVmExit = false;
        java.util.Properties properties35 = atomikosProperties14.asProperties();
        java.lang.String str36 = properties35.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties37.logBaseDir = "";
        atomikosProperties37.setConsoleFileCount((int) (short) 10);
        java.lang.String str42 = atomikosProperties37.logBaseName;
        atomikosProperties37.outputDir = "";
        java.util.Properties properties45 = atomikosProperties37.asProperties();
        int int46 = atomikosProperties37.getConsoleFileLimit();
        java.util.Properties properties47 = atomikosProperties37.asProperties();
        int int48 = properties47.size();
        properties35.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties47);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties50 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int51 = atomikosProperties50.getConsoleFileCount();
        int int52 = atomikosProperties50.maxActives;
        java.lang.String str53 = atomikosProperties50.getService();
        int int54 = atomikosProperties50.consoleFileLimit;
        long long55 = atomikosProperties50.maxTimeout;
        java.lang.String str56 = atomikosProperties50.getService();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel57 = atomikosProperties50.getConsoleLogLevel();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties58 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties58.logBaseDir = "";
        atomikosProperties58.setConsoleFileCount((int) (short) 10);
        atomikosProperties58.setLogBaseDir("{}");
        java.lang.String str65 = atomikosProperties58.getOutputDir();
        atomikosProperties58.setLogBaseName("hi!");
        boolean boolean68 = atomikosProperties58.isAllowSubTransactions();
        int int69 = atomikosProperties58.getConsoleFileCount();
        java.util.Properties properties70 = atomikosProperties58.asProperties();
        java.lang.String str71 = atomikosProperties58.getLogBaseName();
        atomikosProperties58.setCheckpointInterval(10L);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel74 = atomikosProperties58.getConsoleLogLevel();
        atomikosProperties50.consoleLogLevel = atomikosLoggingLevel74;
        java.lang.Object obj76 = properties47.get((java.lang.Object) atomikosLoggingLevel74);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel74);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 300000L + "'", long19 == 300000L);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(properties35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=true, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}" + "'", str36, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=true, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "tmlog" + "'", str42, "tmlog");
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20 + "'", int48 == 20);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 50 + "'", int52 == 50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 300000L + "'", long55 == 300000L);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel57 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel57.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel74 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel74.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        java.lang.String str3 = atomikosProperties0.getService();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties4.logBaseDir = "";
        atomikosProperties4.setConsoleFileCount((int) (short) 10);
        atomikosProperties4.setCheckpointInterval(10000L);
        long long11 = atomikosProperties4.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel12 = atomikosProperties4.getConsoleLogLevel();
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel12;
        java.util.Properties properties14 = atomikosProperties0.asProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties15.logBaseDir = "";
        atomikosProperties15.setConsoleFileCount((int) (short) 10);
        long long20 = atomikosProperties15.getMaxTimeout();
        java.util.Properties properties21 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet22 = properties21.keySet();
        atomikosProperties15.set(properties21, "hi!", (java.lang.Object) (-1.0f));
        atomikosProperties15.setConsoleFileLimit((int) (short) 100);
        atomikosProperties15.setForceShutdownOnVmExit(false);
        java.lang.String str30 = atomikosProperties15.logBaseName;
        boolean boolean31 = properties14.contains((java.lang.Object) atomikosProperties15);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery32 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery32.maxRetries = (-1);
        recovery32.setDelay((long) (short) 0);
        recovery32.maxRetries = 0;
        recovery32.forgetOrphanedLogEntriesDelay = 100;
        recovery32.setMaxRetries((int) (byte) -1);
        long long43 = recovery32.forgetOrphanedLogEntriesDelay;
        boolean boolean44 = properties14.contains((java.lang.Object) recovery32);
        int int45 = recovery32.getMaxRetries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel12 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel12.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 300000L + "'", long20 == 300000L);
        org.junit.Assert.assertNotNull(objSet22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "tmlog" + "'", str30, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet7 = properties6.keySet();
        atomikosProperties0.set(properties6, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str11 = atomikosProperties0.logBaseDir;
        boolean boolean12 = atomikosProperties0.enableLogging;
        int int13 = atomikosProperties0.maxActives;
        java.lang.String str14 = atomikosProperties0.service;
        atomikosProperties0.setDefaultJtaTimeout((long) (short) 100);
        atomikosProperties0.setConsoleFileLimit(100);
        atomikosProperties0.setMaxActives(22);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties0.values();
        java.util.Properties properties3 = new java.util.Properties(properties0);
        java.lang.Object obj6 = properties0.setProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}", "{{}={}}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties7.setDefaultJtaTimeout((-1L));
        java.lang.String str10 = atomikosProperties7.getTransactionManagerUniqueName();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int12 = atomikosProperties11.getConsoleFileCount();
        int int13 = atomikosProperties11.maxActives;
        atomikosProperties11.setEnableLogging(true);
        boolean boolean16 = atomikosProperties11.isThreadedTwoPhaseCommit();
        atomikosProperties11.setMaxTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties19.logBaseDir = "";
        atomikosProperties19.checkpointInterval = 0;
        boolean boolean24 = atomikosProperties19.isThreadedTwoPhaseCommit();
        atomikosProperties19.setSerialJtaTransactions(false);
        java.util.Properties properties27 = new java.util.Properties();
        java.util.Properties properties28 = new java.util.Properties(properties27);
        java.util.Properties properties29 = new java.util.Properties();
        java.util.Properties properties30 = new java.util.Properties(properties29);
        java.util.Properties properties32 = new java.util.Properties();
        java.lang.Object obj34 = properties32.get((java.lang.Object) 0.0d);
        java.lang.Object obj35 = properties32.clone();
        java.lang.String str36 = properties32.toString();
        boolean boolean39 = properties32.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj40 = properties30.replace((java.lang.Object) 10.0d, (java.lang.Object) properties32);
        java.lang.String str41 = properties32.toString();
        java.util.Properties properties42 = new java.util.Properties(properties32);
        java.util.Properties properties43 = new java.util.Properties();
        java.util.Properties properties44 = new java.util.Properties(properties43);
        java.util.Properties properties46 = new java.util.Properties();
        java.lang.Object obj48 = properties46.get((java.lang.Object) 0.0d);
        java.lang.Object obj49 = properties46.clone();
        java.lang.String str50 = properties46.toString();
        boolean boolean53 = properties46.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj54 = properties44.replace((java.lang.Object) 10.0d, (java.lang.Object) properties46);
        java.util.Properties properties55 = new java.util.Properties(properties44);
        properties42.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties55);
        boolean boolean57 = properties27.contains((java.lang.Object) properties42);
        boolean boolean58 = properties42.isEmpty();
        java.util.Properties properties59 = new java.util.Properties();
        java.util.Properties properties60 = new java.util.Properties(properties59);
        java.util.Collection<java.lang.Object> objCollection61 = properties60.values();
        java.lang.Object obj64 = properties60.setProperty("hi!", "{}");
        java.lang.String str66 = properties60.getProperty("tmlog");
        properties60.clear();
        java.util.Set<java.lang.String> strSet68 = properties60.stringPropertyNames();
        properties42.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties60);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties71 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties71.enableLogging = true;
        int int74 = atomikosProperties71.consoleFileLimit;
        atomikosProperties71.logBaseName = "hi!";
        atomikosProperties71.enableLogging = false;
        atomikosProperties71.setMaxTimeout((long) '4');
        atomikosProperties71.setMaxTimeout((long) 1);
        atomikosProperties19.set(properties42, "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}", (java.lang.Object) 1);
        boolean boolean84 = properties0.replace((java.lang.Object) atomikosProperties7, (java.lang.Object) atomikosProperties11, (java.lang.Object) properties42);
        atomikosProperties7.logBaseName = "{}";
        atomikosProperties7.setTransactionManagerUniqueName("");
        boolean boolean89 = atomikosProperties7.enableLogging;
        boolean boolean90 = atomikosProperties7.isEnableLogging();
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "{}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{}" + "'", str36, "{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{}" + "'", str41, "{}");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "{}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "{}" + "'", str50, "{}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objCollection61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setLogBaseDir("{}");
        java.util.Properties properties7 = atomikosProperties0.asProperties();
        atomikosProperties0.service = "";
        boolean boolean10 = atomikosProperties0.isEnableLogging();
        atomikosProperties0.defaultJtaTimeout = 0L;
        atomikosProperties0.serialJtaTransactions = false;
        long long15 = atomikosProperties0.defaultJtaTimeout;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties16.logBaseDir = "";
        atomikosProperties16.setConsoleFileCount((int) (short) 10);
        long long21 = atomikosProperties16.getMaxTimeout();
        java.util.Properties properties22 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet23 = properties22.keySet();
        atomikosProperties16.set(properties22, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj29 = properties22.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties30.setDefaultJtaTimeout((-1L));
        java.util.Properties properties33 = new java.util.Properties();
        java.lang.Object obj35 = properties33.get((java.lang.Object) 0.0d);
        java.lang.Object obj36 = properties33.clone();
        boolean boolean38 = properties22.replace((java.lang.Object) (-1L), obj36, (java.lang.Object) 100.0d);
        java.util.Properties properties39 = new java.util.Properties();
        java.util.Properties properties40 = new java.util.Properties(properties39);
        properties40.clear();
        properties22.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties40);
        java.util.Enumeration<java.lang.Object> objEnumeration43 = properties40.elements();
        java.lang.String str45 = properties40.getProperty("");
        java.util.Properties properties46 = new java.util.Properties(properties40);
        java.util.Enumeration<java.lang.Object> objEnumeration47 = properties46.elements();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties48 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int49 = atomikosProperties48.getConsoleFileCount();
        int int50 = atomikosProperties48.maxActives;
        atomikosProperties48.setEnableLogging(true);
        boolean boolean53 = atomikosProperties48.isThreadedTwoPhaseCommit();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel54 = atomikosProperties48.consoleLogLevel;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties55 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties55.logBaseDir = "";
        atomikosProperties55.setConsoleFileCount((int) (short) 10);
        long long60 = atomikosProperties55.getMaxTimeout();
        java.util.Properties properties61 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet62 = properties61.keySet();
        atomikosProperties55.set(properties61, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str66 = atomikosProperties55.logBaseDir;
        boolean boolean67 = atomikosProperties55.enableLogging;
        java.lang.Object obj68 = properties46.putIfAbsent((java.lang.Object) atomikosLoggingLevel54, (java.lang.Object) atomikosProperties55);
        atomikosProperties0.setConsoleLogLevel(atomikosLoggingLevel54);
        atomikosProperties0.outputDir = "{com.atomikos.icatch.console_file_name=, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=52, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=0, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name={com.atomikos.icatch.hi!=-1.0}, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.tm_unique_name={}, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}";
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 300000L + "'", long21 == 300000L);
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "{}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objEnumeration43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(objEnumeration47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 50 + "'", int50 == 50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel54 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel54.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 300000L + "'", long60 == 300000L);
        org.junit.Assert.assertNotNull(objSet62);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Set<java.lang.String> strSet9 = properties8.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties10.logBaseDir = "";
        atomikosProperties10.setConsoleFileCount((int) (short) 10);
        long long15 = atomikosProperties10.getMaxTimeout();
        java.util.Properties properties16 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet17 = properties16.keySet();
        atomikosProperties10.set(properties16, "hi!", (java.lang.Object) (-1.0f));
        java.util.Properties properties21 = new java.util.Properties();
        java.lang.Object obj23 = properties21.get((java.lang.Object) 0.0d);
        java.lang.Object obj24 = properties21.clone();
        java.lang.String str25 = properties21.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties26.logBaseDir = "";
        atomikosProperties26.setConsoleFileCount((int) (short) 10);
        long long31 = atomikosProperties26.getMaxTimeout();
        java.util.Properties properties32 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet33 = properties32.keySet();
        atomikosProperties26.set(properties32, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj39 = properties32.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties40 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties40.setDefaultJtaTimeout((-1L));
        java.util.Properties properties43 = new java.util.Properties();
        java.lang.Object obj45 = properties43.get((java.lang.Object) 0.0d);
        java.lang.Object obj46 = properties43.clone();
        boolean boolean48 = properties32.replace((java.lang.Object) (-1L), obj46, (java.lang.Object) 100.0d);
        java.util.Properties properties49 = new java.util.Properties();
        java.util.Properties properties50 = new java.util.Properties(properties49);
        properties50.clear();
        properties32.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties50);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties53 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties53.logBaseDir = "";
        atomikosProperties53.setConsoleFileCount((int) (short) 10);
        long long58 = atomikosProperties53.getMaxTimeout();
        java.util.Properties properties59 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet60 = properties59.keySet();
        atomikosProperties53.set(properties59, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str64 = atomikosProperties53.logBaseDir;
        java.lang.String str65 = atomikosProperties53.logBaseDir;
        java.util.Properties properties66 = atomikosProperties53.asProperties();
        java.lang.Object obj67 = properties21.replace((java.lang.Object) properties50, (java.lang.Object) atomikosProperties53);
        boolean boolean68 = properties16.contains((java.lang.Object) atomikosProperties53);
        java.lang.Object obj69 = properties8.get((java.lang.Object) properties16);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties70 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        long long71 = atomikosProperties70.defaultJtaTimeout;
        java.lang.String str72 = atomikosProperties70.getLogBaseName();
        atomikosProperties70.allowSubTransactions = true;
        boolean boolean75 = atomikosProperties70.enableLogging;
        atomikosProperties70.service = "";
        atomikosProperties70.setMaxActives((int) '#');
        boolean boolean80 = atomikosProperties70.isEnableLogging();
        boolean boolean81 = properties8.contains((java.lang.Object) atomikosProperties70);
        boolean boolean82 = properties8.isEmpty();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{}" + "'", str25, "{}");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 300000L + "'", long31 == 300000L);
        org.junit.Assert.assertNotNull(objSet33);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "{}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 300000L + "'", long58 == 300000L);
        org.junit.Assert.assertNotNull(objSet60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10000L + "'", long71 == 10000L);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "tmlog" + "'", str72, "tmlog");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setConsoleFileName("");
        boolean boolean5 = atomikosProperties0.forceShutdownOnVmExit;
        long long6 = atomikosProperties0.maxTimeout;
        atomikosProperties0.setEnableLogging(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel3 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel3;
        atomikosProperties0.outputDir = "";
        int int7 = atomikosProperties0.maxActives;
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        atomikosProperties0.outputDir = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}";
        java.lang.String str11 = atomikosProperties0.getLogBaseName();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery12 = atomikosProperties0.getRecovery();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tmlog" + "'", str11, "tmlog");
        org.junit.Assert.assertNotNull(recovery12);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties2.logBaseDir = "";
        atomikosProperties2.setConsoleFileCount((int) (short) 10);
        atomikosProperties2.setCheckpointInterval(10000L);
        long long9 = atomikosProperties2.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel10 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties2.consoleLogLevel = atomikosLoggingLevel10;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel10;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel13 = atomikosProperties0.getConsoleLogLevel();
        atomikosProperties0.consoleFileName = "{com.atomikos.icatch.hi!=-1.0}";
        int int16 = atomikosProperties0.getMaxActives();
        atomikosProperties0.setOutputDir("{{}=tmlog}");
        int int19 = atomikosProperties0.getConsoleFileCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel10 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel10.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel13 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel13.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        atomikosProperties0.setSerialJtaTransactions(false);
        atomikosProperties0.consoleFileLimit = 'a';
        boolean boolean8 = atomikosProperties0.isThreadedTwoPhaseCommit();
        atomikosProperties0.logBaseName = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, tmlog=tmlog, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.output_dir=, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=10, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1}";
        atomikosProperties0.setConsoleFileCount((int) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties0.values();
        int int3 = properties0.size();
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.elements();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet5 = properties0.entrySet();
        java.util.Properties properties6 = new java.util.Properties();
        java.util.Properties properties7 = new java.util.Properties(properties6);
        java.util.Collection<java.lang.Object> objCollection8 = properties6.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        atomikosProperties9.setLogBaseDir("{}");
        java.util.Properties properties16 = atomikosProperties9.asProperties();
        atomikosProperties9.service = "";
        atomikosProperties9.setTransactionManagerUniqueName("{}");
        boolean boolean21 = properties6.equals((java.lang.Object) "{}");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties22.logBaseDir = "";
        atomikosProperties22.setConsoleFileCount((int) (short) 10);
        atomikosProperties22.setLogBaseDir("{}");
        java.util.Properties properties29 = atomikosProperties22.asProperties();
        java.util.Set<java.lang.String> strSet30 = properties29.stringPropertyNames();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int32 = atomikosProperties31.getConsoleFileCount();
        int int33 = atomikosProperties31.maxActives;
        atomikosProperties31.setConsoleFileName("");
        atomikosProperties31.transactionManagerUniqueName = "{}";
        java.util.Properties properties38 = atomikosProperties31.asProperties();
        boolean boolean39 = atomikosProperties31.threadedTwoPhaseCommit;
        atomikosProperties31.enableLogging = true;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int43 = atomikosProperties42.getConsoleFileCount();
        int int44 = atomikosProperties42.maxActives;
        atomikosProperties42.setConsoleFileName("");
        atomikosProperties42.transactionManagerUniqueName = "{}";
        atomikosProperties42.setMaxActives(0);
        boolean boolean51 = atomikosProperties42.forceShutdownOnVmExit;
        java.lang.Object obj52 = properties29.put((java.lang.Object) atomikosProperties31, (java.lang.Object) atomikosProperties42);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties53 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties53.logBaseDir = "";
        boolean boolean56 = atomikosProperties53.isForceShutdownOnVmExit();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery57 = atomikosProperties53.getRecovery();
        boolean boolean58 = properties29.contains((java.lang.Object) atomikosProperties53);
        java.lang.Object obj59 = properties0.put((java.lang.Object) boolean21, (java.lang.Object) properties29);
        java.util.Properties properties60 = new java.util.Properties();
        java.util.Properties properties61 = new java.util.Properties(properties60);
        java.util.Collection<java.lang.Object> objCollection62 = properties60.values();
        java.util.Properties properties63 = new java.util.Properties();
        java.util.Properties properties64 = new java.util.Properties(properties63);
        java.util.Collection<java.lang.Object> objCollection65 = properties64.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties66 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties66.enableLogging = true;
        long long69 = atomikosProperties66.getCheckpointInterval();
        boolean boolean71 = properties64.remove((java.lang.Object) long69, (java.lang.Object) (byte) 100);
        boolean boolean73 = properties64.equals((java.lang.Object) (short) 1);
        java.lang.Object obj76 = properties64.setProperty("{}", "tmlog");
        java.util.Enumeration<java.lang.Object> objEnumeration77 = properties64.keys();
        java.util.Properties properties78 = new java.util.Properties();
        java.util.Properties properties79 = new java.util.Properties(properties78);
        boolean boolean80 = properties78.isEmpty();
        boolean boolean81 = properties60.remove((java.lang.Object) objEnumeration77, (java.lang.Object) properties78);
        java.lang.String str83 = properties78.getProperty("{true=10000}");
        java.util.Enumeration<java.lang.Object> objEnumeration84 = properties78.elements();
        java.lang.Object obj85 = properties29.remove((java.lang.Object) objEnumeration84);
        java.util.Properties properties86 = new java.util.Properties(properties29);
        java.util.Set<java.lang.Object> objSet87 = properties86.keySet();
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNotNull(objEntrySet5);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 50 + "'", int33 == 50);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 50 + "'", int44 == 50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(recovery57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(objCollection62);
        org.junit.Assert.assertNotNull(objCollection65);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 500L + "'", long69 == 500L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(objEnumeration77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(objEnumeration84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(objSet87);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        atomikosProperties0.setEnableLogging(false);
        java.util.Properties properties5 = new java.util.Properties();
        java.util.Properties properties6 = new java.util.Properties(properties5);
        java.util.Collection<java.lang.Object> objCollection7 = properties5.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery9 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        long long10 = recovery9.getRetryInterval();
        recovery9.delay = 10L;
        recovery9.setForgetOrphanedLogEntriesDelay(0L);
        int int15 = recovery9.maxRetries;
        atomikosProperties0.set(properties5, "hi!", (java.lang.Object) recovery9);
        recovery9.setRetryInterval((long) 'a');
        int int19 = recovery9.getMaxRetries();
        long long20 = recovery9.getRetryInterval();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        atomikosProperties0.setCheckpointInterval(10000L);
        atomikosProperties0.checkpointInterval = 100;
        java.lang.String str9 = atomikosProperties0.consoleFileName;
        java.lang.String str10 = atomikosProperties0.getOutputDir();
        atomikosProperties0.transactionManagerUniqueName = "{com.atomikos.icatch.hi!=-1.0, =hi!}";
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tm.out" + "'", str9, "tm.out");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.enableLogging = true;
        long long3 = atomikosProperties0.getCheckpointInterval();
        java.lang.String str4 = atomikosProperties0.getOutputDir();
        atomikosProperties0.logBaseDir = "{}";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties7.setDefaultJtaTimeout((-1L));
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel10 = null;
        atomikosProperties7.consoleLogLevel = atomikosLoggingLevel10;
        atomikosProperties7.outputDir = "";
        int int14 = atomikosProperties7.maxActives;
        boolean boolean15 = atomikosProperties7.isThreadedTwoPhaseCommit();
        atomikosProperties7.consoleFileLimit = (short) 10;
        java.util.Properties properties18 = atomikosProperties7.asProperties();
        java.util.Enumeration<java.lang.Object> objEnumeration19 = properties18.keys();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties20.checkpointInterval = (byte) 1;
        atomikosProperties20.setAllowSubTransactions(true);
        java.lang.String str25 = atomikosProperties20.outputDir;
        java.lang.Object obj26 = properties18.remove((java.lang.Object) atomikosProperties20);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties28.logBaseDir = "";
        atomikosProperties28.setConsoleFileCount((int) (short) 10);
        java.lang.String str33 = atomikosProperties28.logBaseName;
        atomikosProperties28.setMaxTimeout((long) '4');
        long long36 = atomikosProperties28.getDefaultJtaTimeout();
        atomikosProperties0.set(properties18, "{true=10000}", (java.lang.Object) atomikosProperties28);
        java.util.Properties properties38 = atomikosProperties0.asProperties();
        atomikosProperties0.serialJtaTransactions = true;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 500L + "'", long3 == 500L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(objEnumeration19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "tmlog" + "'", str33, "tmlog");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10000L + "'", long36 == 10000L);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        atomikosProperties0.outputDir = "";
        java.util.Properties properties8 = atomikosProperties0.asProperties();
        java.util.Properties properties9 = new java.util.Properties(properties8);
        java.util.Properties properties10 = new java.util.Properties();
        java.util.Properties properties11 = new java.util.Properties(properties10);
        java.util.Collection<java.lang.Object> objCollection12 = properties10.values();
        int int13 = properties10.size();
        java.util.Enumeration<java.lang.Object> objEnumeration14 = properties10.elements();
        java.util.Properties properties15 = new java.util.Properties(properties10);
        boolean boolean16 = properties8.containsKey((java.lang.Object) properties10);
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery17 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery17.maxRetries = (-1);
        recovery17.setDelay((long) (short) 0);
        recovery17.maxRetries = 0;
        recovery17.setMaxRetries((int) '#');
        recovery17.setMaxRetries((int) '#');
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery28 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery28.maxRetries = (-1);
        recovery28.setDelay((long) (short) 0);
        long long33 = recovery28.forgetOrphanedLogEntriesDelay;
        recovery28.retryInterval = 500L;
        long long36 = recovery28.delay;
        recovery28.setRetryInterval(10000L);
        java.lang.Object obj39 = properties10.put((java.lang.Object) recovery17, (java.lang.Object) 10000L);
        long long40 = recovery17.getForgetOrphanedLogEntriesDelay();
        recovery17.setForgetOrphanedLogEntriesDelay((long) 100);
        long long43 = recovery17.getRetryInterval();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objEnumeration14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 86400000L + "'", long33 == 86400000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 86400000L + "'", long40 == 86400000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10000L + "'", long43 == 10000L);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        long long5 = atomikosProperties0.getMaxTimeout();
        atomikosProperties0.service = "";
        java.lang.String str8 = atomikosProperties0.logBaseDir;
        boolean boolean9 = atomikosProperties0.threadedTwoPhaseCommit;
        long long10 = atomikosProperties0.checkpointInterval;
        atomikosProperties0.setTransactionManagerUniqueName("{{}={}}");
        java.util.Properties properties13 = atomikosProperties0.asProperties();
        java.lang.String str14 = atomikosProperties0.transactionManagerUniqueName;
        atomikosProperties0.setCheckpointInterval((long) (byte) 1);
        atomikosProperties0.setAllowSubTransactions(false);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel19 = atomikosProperties0.getConsoleLogLevel();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 500L + "'", long10 == 500L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{{}={}}" + "'", str14, "{{}={}}");
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel19 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel19.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties0.logBaseDir = "";
        atomikosProperties0.setConsoleFileCount((int) (short) 10);
        java.lang.String str5 = atomikosProperties0.logBaseName;
        java.lang.String str6 = atomikosProperties0.logBaseDir;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties7.enableLogging = true;
        int int10 = atomikosProperties7.consoleFileLimit;
        atomikosProperties7.logBaseName = "hi!";
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int14 = atomikosProperties13.getConsoleFileCount();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties15.logBaseDir = "";
        atomikosProperties15.setConsoleFileCount((int) (short) 10);
        atomikosProperties15.setCheckpointInterval(10000L);
        long long22 = atomikosProperties15.maxTimeout;
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel23 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties15.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties13.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties7.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel23;
        atomikosProperties0.forceShutdownOnVmExit = true;
        boolean boolean30 = atomikosProperties0.forceShutdownOnVmExit;
        atomikosProperties0.setLogBaseName("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}");
        java.lang.String str33 = atomikosProperties0.getOutputDir();
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel34 = null;
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel34;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tmlog" + "'", str5, "tmlog");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 300000L + "'", long22 == 300000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel23 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel23.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.Object obj5 = properties3.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = properties3.clone();
        java.lang.String str7 = properties3.toString();
        boolean boolean10 = properties3.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj11 = properties1.replace((java.lang.Object) 10.0d, (java.lang.Object) properties3);
        java.util.Properties properties12 = new java.util.Properties(properties1);
        java.util.Properties properties13 = new java.util.Properties();
        java.util.Properties properties14 = new java.util.Properties(properties13);
        java.util.Collection<java.lang.Object> objCollection15 = properties14.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties16.enableLogging = true;
        long long19 = atomikosProperties16.getCheckpointInterval();
        boolean boolean21 = properties14.remove((java.lang.Object) long19, (java.lang.Object) (byte) 100);
        boolean boolean23 = properties14.equals((java.lang.Object) (short) 1);
        java.util.Properties properties24 = new java.util.Properties(properties14);
        java.lang.Object obj25 = properties12.remove((java.lang.Object) properties24);
        java.util.Properties properties26 = new java.util.Properties(properties24);
        java.lang.String str29 = properties26.getProperty("{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=0, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=false, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}", "{true=10000}");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 500L + "'", long19 == 500L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{true=10000}" + "'", str29, "{true=10000}");
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Properties properties3 = new java.util.Properties();
        java.lang.Object obj5 = properties3.get((java.lang.Object) 0.0d);
        java.lang.Object obj6 = properties3.clone();
        java.lang.String str7 = properties3.toString();
        boolean boolean10 = properties3.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj11 = properties1.replace((java.lang.Object) 10.0d, (java.lang.Object) properties3);
        java.lang.String str12 = properties3.toString();
        java.util.Properties properties13 = new java.util.Properties(properties3);
        java.lang.Object obj16 = properties13.getOrDefault((java.lang.Object) (byte) 10, (java.lang.Object) (short) -1);
        java.lang.String str18 = properties13.getProperty("{{}=tmlog}");
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties13.storeToXML(outputStream19, "{{{}={}}={com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=10, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.log_base_dir=, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=10000}}", "{com.atomikos.icatch.tmlog=-1}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties0 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int1 = atomikosProperties0.getConsoleFileCount();
        int int2 = atomikosProperties0.maxActives;
        int int3 = atomikosProperties0.getMaxActives();
        java.lang.String str4 = atomikosProperties0.getLogBaseName();
        java.lang.String str5 = atomikosProperties0.getService();
        atomikosProperties0.logBaseDir = "{com.atomikos.icatch.console_file_name=tm.out, com.atomikos.icatch.allow_subtransactions=true, com.atomikos.icatch.recovery_delay=10000, com.atomikos.icatch.console_file_count=1, com.atomikos.icatch.oltp_max_retries=5, com.atomikos.icatch.threaded_2pc=false, com.atomikos.icatch.serial_jta_transactions=true, com.atomikos.icatch.console_log_level=WARN, com.atomikos.icatch.max_actives=50, com.atomikos.icatch.checkpoint_interval=500, com.atomikos.icatch.enable_logging=true, com.atomikos.icatch.log_base_name=tmlog, com.atomikos.icatch.console_file_limit=-1, com.atomikos.icatch.max_timeout=300000, com.atomikos.icatch.forget_orphaned_log_entries_delay=86400000, com.atomikos.icatch.oltp_retry_interval=10000, com.atomikos.icatch.force_shutdown_on_vm_exit=false, com.atomikos.icatch.default_jta_timeout=-1, 0=INFO}";
        long long8 = atomikosProperties0.checkpointInterval;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties9.logBaseDir = "";
        atomikosProperties9.setConsoleFileCount((int) (short) 10);
        long long14 = atomikosProperties9.getMaxTimeout();
        java.util.Properties properties15 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet16 = properties15.keySet();
        atomikosProperties9.set(properties15, "hi!", (java.lang.Object) (-1.0f));
        java.util.Properties properties20 = new java.util.Properties();
        java.lang.Object obj22 = properties20.get((java.lang.Object) 0.0d);
        java.lang.Object obj23 = properties20.clone();
        java.lang.String str24 = properties20.toString();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties25.logBaseDir = "";
        atomikosProperties25.setConsoleFileCount((int) (short) 10);
        long long30 = atomikosProperties25.getMaxTimeout();
        java.util.Properties properties31 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet32 = properties31.keySet();
        atomikosProperties25.set(properties31, "hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj38 = properties31.setProperty("", "hi!");
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties39.setDefaultJtaTimeout((-1L));
        java.util.Properties properties42 = new java.util.Properties();
        java.lang.Object obj44 = properties42.get((java.lang.Object) 0.0d);
        java.lang.Object obj45 = properties42.clone();
        boolean boolean47 = properties31.replace((java.lang.Object) (-1L), obj45, (java.lang.Object) 100.0d);
        java.util.Properties properties48 = new java.util.Properties();
        java.util.Properties properties49 = new java.util.Properties(properties48);
        properties49.clear();
        properties31.putAll((java.util.Map<java.lang.Object, java.lang.Object>) properties49);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties52 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties52.logBaseDir = "";
        atomikosProperties52.setConsoleFileCount((int) (short) 10);
        long long57 = atomikosProperties52.getMaxTimeout();
        java.util.Properties properties58 = new java.util.Properties();
        java.util.Set<java.lang.Object> objSet59 = properties58.keySet();
        atomikosProperties52.set(properties58, "hi!", (java.lang.Object) (-1.0f));
        java.lang.String str63 = atomikosProperties52.logBaseDir;
        java.lang.String str64 = atomikosProperties52.logBaseDir;
        java.util.Properties properties65 = atomikosProperties52.asProperties();
        java.lang.Object obj66 = properties20.replace((java.lang.Object) properties49, (java.lang.Object) atomikosProperties52);
        boolean boolean67 = properties15.contains((java.lang.Object) atomikosProperties52);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel68 = atomikosProperties52.consoleLogLevel;
        long long69 = atomikosProperties52.defaultJtaTimeout;
        atomikosProperties52.setConsoleFileLimit(10);
        org.springframework.boot.jta.atomikos.AtomikosLoggingLevel atomikosLoggingLevel72 = org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO;
        atomikosProperties52.setConsoleLogLevel(atomikosLoggingLevel72);
        atomikosProperties0.consoleLogLevel = atomikosLoggingLevel72;
        atomikosProperties0.setSerialJtaTransactions(true);
        atomikosProperties0.setSerialJtaTransactions(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tmlog" + "'", str4, "tmlog");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 500L + "'", long8 == 500L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 300000L + "'", long30 == 300000L);
        org.junit.Assert.assertNotNull(objSet32);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "{}");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 300000L + "'", long57 == 300000L);
        org.junit.Assert.assertNotNull(objSet59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(properties65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel68 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN + "'", atomikosLoggingLevel68.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.WARN));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10000L + "'", long69 == 10000L);
        org.junit.Assert.assertTrue("'" + atomikosLoggingLevel72 + "' != '" + org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO + "'", atomikosLoggingLevel72.equals(org.springframework.boot.jta.atomikos.AtomikosLoggingLevel.INFO));
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery recovery0 = new org.springframework.boot.jta.atomikos.AtomikosProperties.Recovery();
        recovery0.maxRetries = (-1);
        recovery0.setDelay((long) (short) 0);
        long long5 = recovery0.forgetOrphanedLogEntriesDelay;
        recovery0.setDelay((long) 1);
        int int8 = recovery0.getMaxRetries();
        recovery0.setMaxRetries((int) '4');
        long long11 = recovery0.getDelay();
        int int12 = recovery0.getMaxRetries();
        long long13 = recovery0.getDelay();
        long long14 = recovery0.getForgetOrphanedLogEntriesDelay();
        int int15 = recovery0.getMaxRetries();
        recovery0.setForgetOrphanedLogEntriesDelay(500L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 86400000L + "'", long5 == 86400000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 86400000L + "'", long14 == 86400000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        java.util.Properties properties0 = new java.util.Properties();
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.util.Collection<java.lang.Object> objCollection2 = properties0.values();
        int int3 = properties0.size();
        java.util.Enumeration<java.lang.Object> objEnumeration4 = properties0.elements();
        java.util.Properties properties5 = new java.util.Properties(properties0);
        java.util.Properties properties6 = new java.util.Properties(properties0);
        java.util.Properties properties7 = new java.util.Properties();
        java.lang.Object obj9 = properties7.get((java.lang.Object) 0.0d);
        java.lang.Object obj10 = properties7.clone();
        java.lang.String str11 = properties7.toString();
        java.util.Properties properties12 = new java.util.Properties(properties7);
        java.util.Enumeration<java.lang.Object> objEnumeration13 = properties12.keys();
        java.util.Collection<java.lang.Object> objCollection14 = properties12.values();
        java.util.Properties properties15 = new java.util.Properties();
        java.util.Properties properties16 = new java.util.Properties(properties15);
        java.util.Properties properties18 = new java.util.Properties();
        java.lang.Object obj20 = properties18.get((java.lang.Object) 0.0d);
        java.lang.Object obj21 = properties18.clone();
        java.lang.String str22 = properties18.toString();
        boolean boolean25 = properties18.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        java.lang.Object obj26 = properties16.replace((java.lang.Object) 10.0d, (java.lang.Object) properties18);
        java.util.Properties properties27 = new java.util.Properties(properties16);
        java.util.Properties properties28 = new java.util.Properties();
        java.lang.Object obj30 = properties28.get((java.lang.Object) 0.0d);
        java.lang.Object obj31 = properties28.clone();
        java.lang.String str32 = properties28.toString();
        boolean boolean35 = properties28.remove((java.lang.Object) 0, (java.lang.Object) 'a');
        properties28.clear();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        int int38 = atomikosProperties37.getConsoleFileCount();
        int int39 = atomikosProperties37.maxActives;
        atomikosProperties37.maxActives = 50;
        java.util.Properties properties42 = new java.util.Properties();
        java.util.Properties properties43 = new java.util.Properties(properties42);
        java.util.Collection<java.lang.Object> objCollection44 = properties42.values();
        java.util.Properties properties45 = new java.util.Properties();
        java.util.Properties properties46 = new java.util.Properties(properties45);
        java.util.Collection<java.lang.Object> objCollection47 = properties46.values();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties48 = new org.springframework.boot.jta.atomikos.AtomikosProperties();
        atomikosProperties48.enableLogging = true;
        long long51 = atomikosProperties48.getCheckpointInterval();
        boolean boolean53 = properties46.remove((java.lang.Object) long51, (java.lang.Object) (byte) 100);
        boolean boolean55 = properties46.equals((java.lang.Object) (short) 1);
        java.lang.Object obj58 = properties46.setProperty("{}", "tmlog");
        java.util.Enumeration<java.lang.Object> objEnumeration59 = properties46.keys();
        java.util.Properties properties60 = new java.util.Properties();
        java.util.Properties properties61 = new java.util.Properties(properties60);
        boolean boolean62 = properties60.isEmpty();
        boolean boolean63 = properties42.remove((java.lang.Object) objEnumeration59, (java.lang.Object) properties60);
        boolean boolean64 = properties28.remove((java.lang.Object) 50, (java.lang.Object) properties60);
        java.lang.String str65 = properties60.toString();
        java.util.Properties properties66 = new java.util.Properties(properties60);
        boolean boolean67 = properties16.contains((java.lang.Object) properties66);
        boolean boolean69 = properties16.containsKey((java.lang.Object) 0);
        java.util.Properties properties70 = new java.util.Properties();
        java.util.Properties properties71 = new java.util.Properties(properties70);
        java.util.Collection<java.lang.Object> objCollection72 = properties71.values();
        java.lang.Object obj75 = properties71.setProperty("hi!", "{}");
        java.lang.String str77 = properties71.getProperty("tmlog");
        java.util.Enumeration<java.lang.Object> objEnumeration78 = properties71.elements();
        java.lang.Object obj79 = properties12.put((java.lang.Object) boolean69, (java.lang.Object) properties71);
        boolean boolean80 = properties0.containsKey((java.lang.Object) properties12);
        java.io.OutputStream outputStream81 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.storeToXML(outputStream81, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objEnumeration4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{}" + "'", str11, "{}");
        org.junit.Assert.assertNotNull(objEnumeration13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{}" + "'", str32, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 50 + "'", int39 == 50);
        org.junit.Assert.assertNotNull(objCollection44);
        org.junit.Assert.assertNotNull(objCollection47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 500L + "'", long51 == 500L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(objEnumeration59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "{}" + "'", str65, "{}");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objCollection72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(objEnumeration78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }
}
