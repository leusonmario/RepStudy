import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList7 = client1.recv_get_paged_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):12", (int) (short) 34);
        java.lang.String str3 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":9160(:9160)(:9160(:9160)):34" + "'", str3, ":9160(:9160)(:9160(:9160)):34");
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        long long3 = atomicLong0.getAndDecrement();
        long long4 = atomicLong0.getAndDecrement();
        java.lang.String str5 = atomicLong0.toString();
        boolean boolean8 = atomicLong0.weakCompareAndSet(10L, 10154L);
        atomicLong0.set((long) (short) 62);
        atomicLong0.lazySet(101L);
        long long13 = atomicLong0.decrementAndGet();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("101");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_slice(byteBuffer10, columnParent11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange9 = null;
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client1.get_paged_slice(":97(:97)(:97(:97)):51", keyRange9, byteBuffer10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (short) 64);
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        javax.security.auth.Subject subject3 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet4 = subject3.getPrincipals();
        java.security.Principal[] principalArray5 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet6 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet6, principalArray5);
        java.security.Principal[] principalArray8 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet9 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet9, principalArray8);
        javax.security.auth.Subject subject11 = new javax.security.auth.Subject(false, principalSet4, (java.util.Set<java.security.Principal>) principalSet6, (java.util.Set<java.security.Principal>) principalSet9);
        javax.security.auth.Subject subject12 = new javax.security.auth.Subject();
        boolean boolean13 = subject12.isReadOnly();
        java.lang.String str14 = subject12.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong();
        double double16 = atomicLong15.doubleValue();
        long long17 = atomicLong15.incrementAndGet();
        boolean boolean18 = subject12.equals((java.lang.Object) long17);
        java.lang.String str19 = subject12.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong21 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean22 = subject12.equals((java.lang.Object) atomicLong21);
        java.util.Set<java.lang.Object> objSet23 = subject12.getPrivateCredentials();
        java.lang.String str24 = subject12.toString();
        javax.security.auth.Subject subject25 = new javax.security.auth.Subject();
        boolean boolean26 = subject25.isReadOnly();
        java.lang.String str27 = subject25.toString();
        java.util.Set<java.security.Principal> principalSet28 = subject25.getPrincipals();
        boolean boolean29 = subject12.equals((java.lang.Object) principalSet28);
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet32 = subject31.getPrincipals();
        javax.security.auth.Subject subject33 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet34 = subject33.getPrincipals();
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet38 = subject37.getPrincipals();
        java.security.Principal[] principalArray39 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet40 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet40, principalArray39);
        java.security.Principal[] principalArray42 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet43 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet43, principalArray42);
        javax.security.auth.Subject subject45 = new javax.security.auth.Subject(false, principalSet38, (java.util.Set<java.security.Principal>) principalSet40, (java.util.Set<java.security.Principal>) principalSet43);
        javax.security.auth.Subject subject47 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet48 = subject47.getPrincipals();
        java.security.Principal[] principalArray49 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet50 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet50, principalArray49);
        java.security.Principal[] principalArray52 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet53 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet53, principalArray52);
        javax.security.auth.Subject subject55 = new javax.security.auth.Subject(false, principalSet48, (java.util.Set<java.security.Principal>) principalSet50, (java.util.Set<java.security.Principal>) principalSet53);
        javax.security.auth.Subject subject57 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet58 = subject57.getPrincipals();
        java.security.Principal[] principalArray59 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet60 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet60, principalArray59);
        java.security.Principal[] principalArray62 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet63 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet63, principalArray62);
        javax.security.auth.Subject subject65 = new javax.security.auth.Subject(false, principalSet58, (java.util.Set<java.security.Principal>) principalSet60, (java.util.Set<java.security.Principal>) principalSet63);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet40, (java.util.Set<java.security.Principal>) principalSet50, principalSet58);
        javax.security.auth.Subject subject67 = new javax.security.auth.Subject(false, principalSet32, principalSet34, principalSet58);
        java.util.Set<java.security.Principal> principalSet68 = subject67.getPrincipals();
        javax.security.auth.Subject subject69 = new javax.security.auth.Subject(true, (java.util.Set<java.security.Principal>) principalSet6, principalSet28, principalSet68);
        javax.security.auth.Subject subject70 = new javax.security.auth.Subject();
        boolean boolean71 = subject70.isReadOnly();
        java.lang.String str72 = subject70.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong73 = new java.util.concurrent.atomic.AtomicLong();
        double double74 = atomicLong73.doubleValue();
        long long75 = atomicLong73.incrementAndGet();
        boolean boolean76 = subject70.equals((java.lang.Object) long75);
        java.lang.String str77 = subject70.toString();
        java.util.Set<java.security.Principal> principalSet78 = subject70.getPrincipals();
        javax.security.auth.Subject subject79 = new javax.security.auth.Subject();
        boolean boolean80 = subject79.isReadOnly();
        java.lang.String str81 = subject79.toString();
        java.util.Set<java.security.Principal> principalSet82 = subject79.getPrincipals();
        java.util.Set<java.lang.Object> objSet83 = subject79.getPublicCredentials();
        boolean boolean84 = subject70.equals((java.lang.Object) objSet83);
        java.lang.String str85 = subject70.toString();
        java.util.Set<java.security.Principal> principalSet86 = subject70.getPrincipals();
        java.util.Set<java.security.Principal> principalSet87 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.Subject subject88 = new javax.security.auth.Subject(true, principalSet28, principalSet86, principalSet87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: invalid null input(s)");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(principalSet4);
        org.junit.Assert.assertNotNull(principalArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(principalArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Subject:\n" + "'", str14, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Subject:\n" + "'", str19, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Subject:\n" + "'", str24, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Subject:\n" + "'", str27, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(principalSet32);
        org.junit.Assert.assertNotNull(principalSet34);
        org.junit.Assert.assertNotNull(principalSet38);
        org.junit.Assert.assertNotNull(principalArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(principalArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(principalSet48);
        org.junit.Assert.assertNotNull(principalArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(principalArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(principalSet58);
        org.junit.Assert.assertNotNull(principalArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(principalArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(principalSet68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Subject:\n" + "'", str72, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Subject:\n" + "'", str77, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Subject:\n" + "'", str81, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet82);
        org.junit.Assert.assertNotNull(objSet83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Subject:\n" + "'", str85, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet86);
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        int int2 = atomicLong0.intValue();
        float float3 = atomicLong0.floatValue();
        boolean boolean6 = atomicLong0.compareAndSet((long) 2147483647, (-1L));
        long long7 = atomicLong0.get();
        java.lang.String str8 = atomicLong0.toString();
        atomicLong0.lazySet((long) 110);
        boolean boolean13 = atomicLong0.compareAndSet(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(1L);
        boolean boolean4 = atomicLong1.weakCompareAndSet(0L, (long) (short) 100);
        boolean boolean7 = atomicLong1.weakCompareAndSet((long) 50, 2L);
        atomicLong1.lazySet(103L);
        boolean boolean12 = atomicLong1.weakCompareAndSet((long) (-121), (long) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        double double2 = atomicLong1.doubleValue();
        double double3 = atomicLong1.doubleValue();
        long long5 = atomicLong1.addAndGet((long) ' ');
        long long6 = atomicLong1.getAndIncrement();
        long long7 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 64L + "'", long5 == 64L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 64L + "'", long6 == 64L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 65L + "'", long7 == 65L);
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet9 = subject0.getPrivateCredentials();
        boolean boolean11 = subject0.equals((java.lang.Object) (short) 152);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Subject:\n" + "'", str7, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet8);
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(136L);
        long long3 = atomicLong1.getAndAdd(50L);
        java.util.function.LongBinaryOperator longBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.accumulateAndGet((long) (byte) 3, longBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 136L + "'", long3 == 136L);
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        java.lang.String str4 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean7 = cassandraHost6.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.equals((java.lang.Object) boolean7);
        int int9 = cassandraHost1.getMaxActive();
        boolean boolean10 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str11 = cassandraHost1.getUrl();
        java.lang.String str12 = cassandraHost1.getHost();
        java.lang.String str13 = cassandraHost1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":9160" + "'", str4, ":9160");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":9160" + "'", str11, ":9160");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(127.0.0.1):9160" + "'", str13, "(127.0.0.1):9160");
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        float float3 = atomicLong0.floatValue();
        long long5 = atomicLong0.getAndSet((long) 'a');
        long long7 = atomicLong0.addAndGet(10L);
        long long9 = atomicLong0.getAndSet((long) 10);
        boolean boolean12 = atomicLong0.weakCompareAndSet((long) 102, (long) (byte) 34);
        double double13 = atomicLong0.doubleValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 107L + "'", long7 == 107L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 107L + "'", long9 == 107L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef8 = client2.recv_describe_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client2.recv_get_paged_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove_counter(byteBuffer8, columnPath9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):-1", (int) (byte) 88);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 98);
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((-3L));
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        long long3 = atomicLong0.getAndDecrement();
        long long4 = atomicLong0.getAndDecrement();
        java.lang.String str5 = atomicLong0.toString();
        long long6 = atomicLong0.get();
        boolean boolean9 = atomicLong0.compareAndSet(250L, 9179L);
        atomicLong0.lazySet((long) (byte) 104);
        long long12 = atomicLong0.longValue();
        long long13 = atomicLong0.getAndDecrement();
        long long14 = atomicLong0.longValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 104L + "'", long12 == 104L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 104L + "'", long13 == 104L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 103L + "'", long14 == 103L);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        atomicLong1.set(4L);
        boolean boolean6 = atomicLong1.weakCompareAndSet(86L, (long) (byte) 101);
        long long7 = atomicLong1.decrementAndGet();
        long long8 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", 2147483647);
        cassandraHost2.setMaxFrameSize(0);
        cassandraHost2.setMaxActive((int) (byte) 0);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        java.util.Set<java.security.Principal> principalSet1 = null;
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet3 = subject2.getPrincipals();
        javax.security.auth.Subject subject4 = new javax.security.auth.Subject();
        boolean boolean5 = subject4.isReadOnly();
        java.lang.String str6 = subject4.toString();
        java.util.Set<java.security.Principal> principalSet7 = subject4.getPrincipals();
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.Subject subject8 = new javax.security.auth.Subject(true, principalSet1, principalSet3, principalSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: invalid null input(s)");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Subject:\n" + "'", str6, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet7);
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet3 = subject2.getPrincipals();
        java.security.Principal[] principalArray4 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet5 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet5, principalArray4);
        java.security.Principal[] principalArray7 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet8 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet8, principalArray7);
        javax.security.auth.Subject subject10 = new javax.security.auth.Subject(false, principalSet3, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet8);
        subject10.setReadOnly();
        boolean boolean12 = subject10.isReadOnly();
        java.util.Set<java.security.Principal> principalSet13 = subject10.getPrincipals();
        javax.security.auth.Subject subject17 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet18 = subject17.getPrincipals();
        java.security.Principal[] principalArray19 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet20 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet20, principalArray19);
        java.security.Principal[] principalArray22 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet23 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet23, principalArray22);
        javax.security.auth.Subject subject25 = new javax.security.auth.Subject(false, principalSet18, (java.util.Set<java.security.Principal>) principalSet20, (java.util.Set<java.security.Principal>) principalSet23);
        javax.security.auth.Subject subject27 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet28 = subject27.getPrincipals();
        java.security.Principal[] principalArray29 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet30 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet30, principalArray29);
        java.security.Principal[] principalArray32 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet33 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet33, principalArray32);
        javax.security.auth.Subject subject35 = new javax.security.auth.Subject(false, principalSet28, (java.util.Set<java.security.Principal>) principalSet30, (java.util.Set<java.security.Principal>) principalSet33);
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet38 = subject37.getPrincipals();
        java.security.Principal[] principalArray39 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet40 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet40, principalArray39);
        java.security.Principal[] principalArray42 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet43 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet43, principalArray42);
        javax.security.auth.Subject subject45 = new javax.security.auth.Subject(false, principalSet38, (java.util.Set<java.security.Principal>) principalSet40, (java.util.Set<java.security.Principal>) principalSet43);
        javax.security.auth.Subject subject46 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet20, (java.util.Set<java.security.Principal>) principalSet30, principalSet38);
        java.util.Set<java.security.Principal> principalSet47 = subject46.getPrincipals();
        javax.security.auth.Subject subject48 = new javax.security.auth.Subject();
        boolean boolean49 = subject48.isReadOnly();
        java.lang.String str50 = subject48.toString();
        java.util.Set<java.security.Principal> principalSet51 = subject48.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost54 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong56 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean57 = cassandraHost54.equals((java.lang.Object) (short) 100);
        int int58 = cassandraHost54.getCassandraThriftSocketTimeout();
        boolean boolean59 = subject48.equals((java.lang.Object) cassandraHost54);
        boolean boolean60 = subject48.isReadOnly();
        java.util.Set<java.security.Principal> principalSet61 = subject48.getPrincipals();
        javax.security.auth.Subject subject62 = new javax.security.auth.Subject();
        boolean boolean63 = subject62.isReadOnly();
        java.lang.String str64 = subject62.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong65 = new java.util.concurrent.atomic.AtomicLong();
        double double66 = atomicLong65.doubleValue();
        long long67 = atomicLong65.incrementAndGet();
        boolean boolean68 = subject62.equals((java.lang.Object) long67);
        java.lang.String str69 = subject62.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong71 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean72 = subject62.equals((java.lang.Object) atomicLong71);
        java.util.Set<java.lang.Object> objSet73 = subject62.getPrivateCredentials();
        boolean boolean74 = subject62.isReadOnly();
        java.util.Set<java.security.Principal> principalSet75 = subject62.getPrincipals();
        java.util.Set<java.lang.Object> objSet76 = subject62.getPublicCredentials();
        subject62.setReadOnly();
        java.util.Set<java.security.Principal> principalSet78 = subject62.getPrincipals();
        javax.security.auth.Subject subject79 = new javax.security.auth.Subject(true, principalSet47, principalSet61, principalSet78);
        javax.security.auth.Subject subject80 = new javax.security.auth.Subject();
        boolean boolean81 = subject80.isReadOnly();
        java.lang.String str82 = subject80.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong83 = new java.util.concurrent.atomic.AtomicLong();
        double double84 = atomicLong83.doubleValue();
        long long85 = atomicLong83.incrementAndGet();
        boolean boolean86 = subject80.equals((java.lang.Object) long85);
        subject80.setReadOnly();
        java.util.Set<java.security.Principal> principalSet88 = subject80.getPrincipals();
        javax.security.auth.Subject subject89 = new javax.security.auth.Subject(false, principalSet13, principalSet47, principalSet88);
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertNotNull(principalArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(principalArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(principalSet13);
        org.junit.Assert.assertNotNull(principalSet18);
        org.junit.Assert.assertNotNull(principalArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(principalArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(principalSet28);
        org.junit.Assert.assertNotNull(principalArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(principalArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(principalSet38);
        org.junit.Assert.assertNotNull(principalArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(principalArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(principalSet47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Subject:\n" + "'", str50, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(principalSet61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Subject:\n" + "'", str64, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Subject:\n" + "'", str69, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objSet73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(principalSet75);
        org.junit.Assert.assertNotNull(objSet76);
        org.junit.Assert.assertNotNull(principalSet78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Subject:\n" + "'", str82, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(principalSet88);
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.lang.Object> objSet8 = subject0.getPrivateCredentials();
        boolean boolean9 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet11 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet12 = subject0.getPrivateCredentials();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Subject:\n" + "'", str7, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(principalSet11);
        org.junit.Assert.assertNotNull(objSet12);
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspace("hi!(hi!)(hi!(hi!)):98");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9693", (int) (short) 9160);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9693:9160" + "'", str4, "9693:9160");
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
        javax.security.auth.Subject subject4 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet5 = subject4.getPrincipals();
        java.security.Principal[] principalArray6 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet7 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet7, principalArray6);
        java.security.Principal[] principalArray9 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet10 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet10, principalArray9);
        javax.security.auth.Subject subject12 = new javax.security.auth.Subject(false, principalSet5, (java.util.Set<java.security.Principal>) principalSet7, (java.util.Set<java.security.Principal>) principalSet10);
        javax.security.auth.Subject subject14 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet15 = subject14.getPrincipals();
        java.security.Principal[] principalArray16 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet17 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet17, principalArray16);
        java.security.Principal[] principalArray19 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet20 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet20, principalArray19);
        javax.security.auth.Subject subject22 = new javax.security.auth.Subject(false, principalSet15, (java.util.Set<java.security.Principal>) principalSet17, (java.util.Set<java.security.Principal>) principalSet20);
        javax.security.auth.Subject subject24 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet25 = subject24.getPrincipals();
        java.security.Principal[] principalArray26 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet27 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet27, principalArray26);
        java.security.Principal[] principalArray29 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet30 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet30, principalArray29);
        javax.security.auth.Subject subject32 = new javax.security.auth.Subject(false, principalSet25, (java.util.Set<java.security.Principal>) principalSet27, (java.util.Set<java.security.Principal>) principalSet30);
        javax.security.auth.Subject subject33 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet7, (java.util.Set<java.security.Principal>) principalSet17, principalSet25);
        java.util.Set<java.security.Principal> principalSet34 = subject33.getPrincipals();
        javax.security.auth.Subject subject35 = new javax.security.auth.Subject();
        boolean boolean36 = subject35.isReadOnly();
        java.lang.String str37 = subject35.toString();
        java.util.Set<java.security.Principal> principalSet38 = subject35.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost41 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong43 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean44 = cassandraHost41.equals((java.lang.Object) (short) 100);
        int int45 = cassandraHost41.getCassandraThriftSocketTimeout();
        boolean boolean46 = subject35.equals((java.lang.Object) cassandraHost41);
        boolean boolean47 = subject35.isReadOnly();
        java.util.Set<java.security.Principal> principalSet48 = subject35.getPrincipals();
        javax.security.auth.Subject subject49 = new javax.security.auth.Subject();
        boolean boolean50 = subject49.isReadOnly();
        java.lang.String str51 = subject49.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong52 = new java.util.concurrent.atomic.AtomicLong();
        double double53 = atomicLong52.doubleValue();
        long long54 = atomicLong52.incrementAndGet();
        boolean boolean55 = subject49.equals((java.lang.Object) long54);
        java.lang.String str56 = subject49.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong58 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean59 = subject49.equals((java.lang.Object) atomicLong58);
        java.util.Set<java.lang.Object> objSet60 = subject49.getPrivateCredentials();
        boolean boolean61 = subject49.isReadOnly();
        java.util.Set<java.security.Principal> principalSet62 = subject49.getPrincipals();
        java.util.Set<java.lang.Object> objSet63 = subject49.getPublicCredentials();
        subject49.setReadOnly();
        java.util.Set<java.security.Principal> principalSet65 = subject49.getPrincipals();
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject(true, principalSet34, principalSet48, principalSet65);
        javax.security.auth.Subject subject67 = new javax.security.auth.Subject();
        boolean boolean68 = subject67.isReadOnly();
        java.lang.String str69 = subject67.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong70 = new java.util.concurrent.atomic.AtomicLong();
        double double71 = atomicLong70.doubleValue();
        long long72 = atomicLong70.incrementAndGet();
        boolean boolean73 = subject67.equals((java.lang.Object) long72);
        java.lang.String str74 = subject67.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong76 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean77 = subject67.equals((java.lang.Object) atomicLong76);
        java.util.Set<java.lang.Object> objSet78 = subject67.getPrivateCredentials();
        java.lang.String str79 = subject67.toString();
        javax.security.auth.Subject subject80 = new javax.security.auth.Subject();
        boolean boolean81 = subject80.isReadOnly();
        java.lang.String str82 = subject80.toString();
        java.util.Set<java.security.Principal> principalSet83 = subject80.getPrincipals();
        boolean boolean84 = subject67.equals((java.lang.Object) principalSet83);
        javax.security.auth.Subject subject86 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet87 = subject86.getPrincipals();
        java.security.Principal[] principalArray88 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet89 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet89, principalArray88);
        java.security.Principal[] principalArray91 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet92 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet92, principalArray91);
        javax.security.auth.Subject subject94 = new javax.security.auth.Subject(false, principalSet87, (java.util.Set<java.security.Principal>) principalSet89, (java.util.Set<java.security.Principal>) principalSet92);
        javax.security.auth.Subject subject95 = new javax.security.auth.Subject(true, principalSet34, principalSet83, principalSet87);
        org.junit.Assert.assertNotNull(principalSet5);
        org.junit.Assert.assertNotNull(principalArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(principalArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(principalSet15);
        org.junit.Assert.assertNotNull(principalArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(principalArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(principalSet25);
        org.junit.Assert.assertNotNull(principalArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(principalArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(principalSet34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Subject:\n" + "'", str37, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(principalSet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Subject:\n" + "'", str51, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Subject:\n" + "'", str56, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objSet60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(principalSet62);
        org.junit.Assert.assertNotNull(objSet63);
        org.junit.Assert.assertNotNull(principalSet65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Subject:\n" + "'", str69, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Subject:\n" + "'", str74, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objSet78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Subject:\n" + "'", str79, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Subject:\n" + "'", str82, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(principalSet87);
        org.junit.Assert.assertNotNull(principalArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(principalArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = client1.describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 10);
        long long3 = atomicLong1.getAndSet(34L);
        boolean boolean6 = atomicLong1.weakCompareAndSet(1L, (long) 9160);
        long long7 = atomicLong1.getAndDecrement();
        long long8 = atomicLong1.getAndIncrement();
        int int9 = atomicLong1.intValue();
        double double10 = atomicLong1.doubleValue();
        boolean boolean13 = atomicLong1.compareAndSet(198L, (long) '#');
        long long15 = atomicLong1.addAndGet(222L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 34L + "'", long7 == 34L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 33L + "'", long8 == 33L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 34.0d + "'", double10 == 34.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 256L + "'", long15 == 256L);
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):101");
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_login(authenticationRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap14 = client2.recv_multiget_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList11 = client1.describe_ring("9895");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("127.0.0.1(127.0.0.1):10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange11 = null;
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("Subject(Subject)(Subject(Subject)):34", keyRange11, byteBuffer12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100", 3);
        java.lang.String str3 = cassandraHost2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:3" + "'", str3, "hi!:3");
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("0.0.0.101");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 1);
        long long2 = atomicLong1.getAndIncrement();
        long long3 = atomicLong1.getAndIncrement();
        boolean boolean6 = atomicLong1.compareAndSet(64L, 9754L);
        int int7 = atomicLong1.intValue();
        long long9 = atomicLong1.getAndSet(9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) (short) 100);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        boolean boolean4 = atomicLong0.compareAndSet(65L, (long) (short) 0);
        atomicLong0.set(0L);
        atomicLong0.lazySet((long) (short) 101);
        boolean boolean11 = atomicLong0.compareAndSet(3L, (long) (short) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_add();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("Subject(Subject)(Subject(Subject)):34");
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
        java.util.Set<java.security.Principal> principalSet1 = null;
        javax.security.auth.Subject subject3 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet4 = subject3.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet6 = subject5.getPrincipals();
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet10 = subject9.getPrincipals();
        java.security.Principal[] principalArray11 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet12 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet12, principalArray11);
        java.security.Principal[] principalArray14 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet15 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet15, principalArray14);
        javax.security.auth.Subject subject17 = new javax.security.auth.Subject(false, principalSet10, (java.util.Set<java.security.Principal>) principalSet12, (java.util.Set<java.security.Principal>) principalSet15);
        javax.security.auth.Subject subject19 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet20 = subject19.getPrincipals();
        java.security.Principal[] principalArray21 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet22 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet22, principalArray21);
        java.security.Principal[] principalArray24 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet25 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet25, principalArray24);
        javax.security.auth.Subject subject27 = new javax.security.auth.Subject(false, principalSet20, (java.util.Set<java.security.Principal>) principalSet22, (java.util.Set<java.security.Principal>) principalSet25);
        javax.security.auth.Subject subject29 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet30 = subject29.getPrincipals();
        java.security.Principal[] principalArray31 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet32 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet32, principalArray31);
        java.security.Principal[] principalArray34 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet35 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet35, principalArray34);
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject(false, principalSet30, (java.util.Set<java.security.Principal>) principalSet32, (java.util.Set<java.security.Principal>) principalSet35);
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet12, (java.util.Set<java.security.Principal>) principalSet22, principalSet30);
        javax.security.auth.Subject subject39 = new javax.security.auth.Subject(false, principalSet4, principalSet6, principalSet30);
        javax.security.auth.Subject subject40 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet41 = subject40.getPrivateCredentials();
        boolean boolean42 = subject40.isReadOnly();
        java.util.Set<java.security.Principal> principalSet43 = subject40.getPrincipals();
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.Subject subject44 = new javax.security.auth.Subject(false, principalSet1, principalSet4, principalSet43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: invalid null input(s)");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(principalSet4);
        org.junit.Assert.assertNotNull(principalSet6);
        org.junit.Assert.assertNotNull(principalSet10);
        org.junit.Assert.assertNotNull(principalArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(principalArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(principalSet20);
        org.junit.Assert.assertNotNull(principalArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(principalArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(principalSet30);
        org.junit.Assert.assertNotNull(principalArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(principalArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(principalSet43);
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":52", 0);
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.system_drop_keyspace("1(0.0.0.1):97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("103(0.0.0.103):0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList8 = client1.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove(byteBuffer10, columnPath11, 201L, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.Column column17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer15, columnParent16, column17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(158L);
        atomicLong1.set((long) 100);
        atomicLong1.lazySet((long) (byte) 50);
        long long7 = atomicLong1.getAndSet(107L);
        short short8 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 50L + "'", long7 == 50L);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 107 + "'", short8 == (short) 107);
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1", (int) (byte) 34);
        java.lang.String str3 = cassandraHost2.getIp();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(127.0.0.1)" + "'", str3, "(127.0.0.1)");
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        // The following exception was thrown during execution in test generation
        try {
            client1.send_execute_prepared_cql_query((int) (byte) 35, (java.util.List<java.nio.ByteBuffer>) byteBufferList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_set_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList15 = client2.get_slice(byteBuffer11, columnParent12, slicePredicate13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_cql_version("223");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.system_drop_keyspace("hi!(hi!)(hi!(hi!)):97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray15 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList16 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList16, byteBufferArray15);
        org.apache.cassandra.thrift.ColumnParent columnParent18 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate19 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList16, columnParent18, slicePredicate19, consistencyLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNotNull(byteBufferArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove(byteBuffer8, columnPath9, (long) (short) 0, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("Subject");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_add(byteBuffer12, columnParent13, counterColumn14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("31:35", "198", "109", (int) (short) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("hi!(hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):50");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99):9160", (int) (byte) 100);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        java.lang.String str5 = cassandraHost2.getName();
        cassandraHost2.setUseSocketKeepalive(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "99(0.0.0.99)(99(0.0.0.99)):100" + "'", str5, "99(0.0.0.99)(99(0.0.0.99)):100");
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.recv_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        float float1 = atomicLong0.floatValue();
        long long2 = atomicLong0.get();
        long long3 = atomicLong0.longValue();
        long long4 = atomicLong0.longValue();
        long long5 = atomicLong0.getAndIncrement();
        long long7 = atomicLong0.addAndGet(109L);
        double double8 = atomicLong0.doubleValue();
        long long9 = atomicLong0.getAndIncrement();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 110.0d + "'", double8 == 110.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):-1", (int) (short) 104);
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_remove_counter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = client1.get_count(byteBuffer11, columnParent12, slicePredicate13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxActive((int) (byte) 34);
        java.lang.String str9 = cassandraHost2.toString();
        boolean boolean10 = cassandraHost2.getUseThriftFramedTransport();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!(hi!):100" + "'", str9, "hi!(hi!):100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList12 = client2.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 'a');
        java.lang.String str2 = atomicLong1.toString();
        long long3 = atomicLong1.decrementAndGet();
        java.util.function.LongBinaryOperator longBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.accumulateAndGet((long) 36, longBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 96L + "'", long3 == 96L);
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)", (int) (byte) 98);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":9160(" + "'", str4, ":9160(");
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList10 = client2.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":97(:97):9160");
        int int2 = cassandraHost1.getPort();
        cassandraHost1.setMaxFrameSize((int) (short) 162);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9160 + "'", int2 == 9160);
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = client2.get_count(byteBuffer13, columnParent14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_splits("97", "99(0.0.0.99)(99(0.0.0.99)):100", "99(0.0.0.99)(99(0.0.0.99))(99(0.0.0.99)(99(0.0.0.99))):1", (int) (byte) -91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = client2.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_batch_mutate(byteBufferMap9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str3 = cassandraHost1.getUrl();
        cassandraHost1.setMaxFrameSize(100);
        java.lang.String str6 = cassandraHost1.toString();
        java.lang.String str7 = cassandraHost1.getIp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CassandraClient<%s-%d>:9160" + "'", str3, "CassandraClient<%s-%d>:9160");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160" + "'", str6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CassandraClient<%s-%d>" + "'", str7, "CassandraClient<%s-%d>");
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (byte) 0);
        cassandraHost2.setMaxActive((int) (byte) 2);
        cassandraHost2.setMaxWaitTimeWhenExhausted((-3L));
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 10);
        byte byte2 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.recv_system_add_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap10 = client1.recv_multiget_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_column_family(cfDef9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.batch_mutate(byteBufferMap8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("Subject(Subject):101", (int) (byte) -44);
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray8 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList9 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList9, byteBufferArray8);
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap14 = client1.multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList9, columnParent11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNotNull(byteBufferArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult17 = client2.execute_prepared_cql_query((int) (short) 0, byteBufferList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef10 = client1.recv_describe_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str6 = cassandraHost1.getIp();
        cassandraHost1.setMaxActive(103);
        java.lang.String str9 = cassandraHost1.getName();
        cassandraHost1.setMaxFrameSize((int) (short) 105);
        int int12 = cassandraHost1.getMaxActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1" + "'", str6, "127.0.0.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):9160" + "'", str9, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList13 = client2.describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        long long4 = atomicLong0.getAndSet((long) '#');
        long long5 = atomicLong0.get();
        java.lang.String str6 = atomicLong0.toString();
        long long8 = atomicLong0.getAndSet(0L);
        java.lang.String str9 = atomicLong0.toString();
        java.lang.String str10 = atomicLong0.toString();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35" + "'", str6, "35");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = client2.recv_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("(127.0.0.1)((127.0.0.1)):10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_update_column_family(cfDef12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
        java.security.Principal[] principalArray1 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet2 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet2, principalArray1);
        javax.security.auth.Subject subject6 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet7 = subject6.getPrincipals();
        java.security.Principal[] principalArray8 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet9 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet9, principalArray8);
        java.security.Principal[] principalArray11 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet12 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet12, principalArray11);
        javax.security.auth.Subject subject14 = new javax.security.auth.Subject(false, principalSet7, (java.util.Set<java.security.Principal>) principalSet9, (java.util.Set<java.security.Principal>) principalSet12);
        javax.security.auth.Subject subject16 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet17 = subject16.getPrincipals();
        java.security.Principal[] principalArray18 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet19 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet19, principalArray18);
        java.security.Principal[] principalArray21 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet22 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet22, principalArray21);
        javax.security.auth.Subject subject24 = new javax.security.auth.Subject(false, principalSet17, (java.util.Set<java.security.Principal>) principalSet19, (java.util.Set<java.security.Principal>) principalSet22);
        javax.security.auth.Subject subject26 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet27 = subject26.getPrincipals();
        java.security.Principal[] principalArray28 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet29 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet29, principalArray28);
        java.security.Principal[] principalArray31 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet32 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet32, principalArray31);
        javax.security.auth.Subject subject34 = new javax.security.auth.Subject(false, principalSet27, (java.util.Set<java.security.Principal>) principalSet29, (java.util.Set<java.security.Principal>) principalSet32);
        javax.security.auth.Subject subject35 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet9, (java.util.Set<java.security.Principal>) principalSet19, principalSet27);
        java.util.Set<java.security.Principal> principalSet36 = subject35.getPrincipals();
        javax.security.auth.Subject subject39 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet40 = subject39.getPrincipals();
        java.security.Principal[] principalArray41 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet42 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet42, principalArray41);
        java.security.Principal[] principalArray44 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet45 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet45, principalArray44);
        javax.security.auth.Subject subject47 = new javax.security.auth.Subject(false, principalSet40, (java.util.Set<java.security.Principal>) principalSet42, (java.util.Set<java.security.Principal>) principalSet45);
        javax.security.auth.Subject subject49 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet50 = subject49.getPrincipals();
        java.security.Principal[] principalArray51 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet52 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet52, principalArray51);
        java.security.Principal[] principalArray54 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet55 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet55, principalArray54);
        javax.security.auth.Subject subject57 = new javax.security.auth.Subject(false, principalSet50, (java.util.Set<java.security.Principal>) principalSet52, (java.util.Set<java.security.Principal>) principalSet55);
        javax.security.auth.Subject subject59 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet60 = subject59.getPrincipals();
        java.security.Principal[] principalArray61 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet62 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet62, principalArray61);
        java.security.Principal[] principalArray64 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet65 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet65, principalArray64);
        javax.security.auth.Subject subject67 = new javax.security.auth.Subject(false, principalSet60, (java.util.Set<java.security.Principal>) principalSet62, (java.util.Set<java.security.Principal>) principalSet65);
        javax.security.auth.Subject subject68 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet42, (java.util.Set<java.security.Principal>) principalSet52, principalSet60);
        javax.security.auth.Subject subject69 = new javax.security.auth.Subject(true, (java.util.Set<java.security.Principal>) principalSet2, principalSet36, (java.util.Set<java.security.Principal>) principalSet42);
        javax.security.auth.Subject subject70 = new javax.security.auth.Subject();
        subject70.setReadOnly();
        java.util.Set<java.lang.Object> objSet72 = subject70.getPublicCredentials();
        boolean boolean73 = subject69.equals((java.lang.Object) objSet72);
        org.junit.Assert.assertNotNull(principalArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(principalSet7);
        org.junit.Assert.assertNotNull(principalArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(principalArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(principalSet17);
        org.junit.Assert.assertNotNull(principalArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(principalArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(principalSet27);
        org.junit.Assert.assertNotNull(principalArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(principalArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(principalSet36);
        org.junit.Assert.assertNotNull(principalSet40);
        org.junit.Assert.assertNotNull(principalArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(principalArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(principalSet50);
        org.junit.Assert.assertNotNull(principalArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(principalArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(principalSet60);
        org.junit.Assert.assertNotNull(principalArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(principalArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objSet72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer8, columnPath9, 18863L, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList16 = client2.describe_splits("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):9160", "0.0.0.99", "", 36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer5 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent6 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate7 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_slice(byteBuffer5, columnParent6, slicePredicate7, consistencyLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("hi!(hi!)(hi!(hi!))(hi!(hi!)(hi!(hi!))):0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        java.lang.String str2 = cassandraHost1.getIp();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 0);
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setLifo(true);
        long long8 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "127.0.0.1" + "'", str2, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = client2.recv_get_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange8 = null;
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_paged_slice("CassandraClient<%s-%d>(CassandraClient<%s-%d>):35", keyRange8, byteBuffer9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long3 = atomicLong1.getAndAdd((-1L));
        boolean boolean6 = atomicLong1.compareAndSet(89L, 134L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family("50");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_update_keyspace(ksDef12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef15 = client2.recv_describe_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 101);
        boolean boolean4 = atomicLong1.weakCompareAndSet(49L, (long) (short) 102);
        double double5 = atomicLong1.doubleValue();
        java.util.function.LongBinaryOperator longBinaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = atomicLong1.getAndAccumulate(221L, longBinaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160((:9160():98", (int) (short) -1);
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97(:97)(:97(:97)):51", 109);
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(1L);
        boolean boolean4 = atomicLong1.weakCompareAndSet(0L, (long) (short) 100);
        boolean boolean7 = atomicLong1.weakCompareAndSet((long) 50, 2L);
        boolean boolean10 = atomicLong1.compareAndSet((long) 0, (long) (byte) 10);
        boolean boolean13 = atomicLong1.weakCompareAndSet((long) (short) 100, 0L);
        long long15 = atomicLong1.getAndAdd((long) 9160);
        long long16 = atomicLong1.get();
        float float17 = atomicLong1.floatValue();
        java.util.function.LongBinaryOperator longBinaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = atomicLong1.getAndAccumulate(630L, longBinaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9161L + "'", long16 == 9161L);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 9161.0f + "'", float17 == 9161.0f);
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_slice(byteBuffer13, columnParent14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_cql_version("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_column_family("127.0.0.1:2147483647");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        float float3 = atomicLong0.floatValue();
        long long5 = atomicLong0.getAndSet((long) 'a');
        long long6 = atomicLong0.incrementAndGet();
        int int7 = atomicLong0.intValue();
        boolean boolean10 = atomicLong0.compareAndSet((long) 2147483647, 0L);
        atomicLong0.lazySet((long) (short) -1);
        boolean boolean15 = atomicLong0.weakCompareAndSet((long) (short) 49, (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 102);
        cassandraHost2.setUseSocketKeepalive(true);
        int int5 = cassandraHost2.getMaxFrameSize();
        java.lang.String str6 = cassandraHost2.getIp();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1" + "'", str6, "127.0.0.1");
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean3 = cassandraHost1.getLifo();
        java.lang.String str4 = cassandraHost1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!(hi!):100" + "'", str4, "hi!(hi!):100");
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
        java.security.Principal[] principalArray2 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet3 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet3, principalArray2);
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet6 = subject5.getPrincipals();
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet10 = subject9.getPrincipals();
        java.security.Principal[] principalArray11 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet12 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet12, principalArray11);
        java.security.Principal[] principalArray14 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet15 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet15, principalArray14);
        javax.security.auth.Subject subject17 = new javax.security.auth.Subject(false, principalSet10, (java.util.Set<java.security.Principal>) principalSet12, (java.util.Set<java.security.Principal>) principalSet15);
        javax.security.auth.Subject subject19 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet20 = subject19.getPrincipals();
        java.security.Principal[] principalArray21 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet22 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet22, principalArray21);
        java.security.Principal[] principalArray24 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet25 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet25, principalArray24);
        javax.security.auth.Subject subject27 = new javax.security.auth.Subject(false, principalSet20, (java.util.Set<java.security.Principal>) principalSet22, (java.util.Set<java.security.Principal>) principalSet25);
        javax.security.auth.Subject subject29 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet30 = subject29.getPrincipals();
        java.security.Principal[] principalArray31 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet32 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet32, principalArray31);
        java.security.Principal[] principalArray34 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet35 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet35, principalArray34);
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject(false, principalSet30, (java.util.Set<java.security.Principal>) principalSet32, (java.util.Set<java.security.Principal>) principalSet35);
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet12, (java.util.Set<java.security.Principal>) principalSet22, principalSet30);
        javax.security.auth.Subject subject39 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet3, principalSet6, (java.util.Set<java.security.Principal>) principalSet22);
        java.util.Set<java.security.Principal> principalSet40 = subject39.getPrincipals();
        javax.security.auth.Subject subject42 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet43 = subject42.getPrincipals();
        javax.security.auth.Subject subject44 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet45 = subject44.getPrincipals();
        javax.security.auth.Subject subject48 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet49 = subject48.getPrincipals();
        java.security.Principal[] principalArray50 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet51 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet51, principalArray50);
        java.security.Principal[] principalArray53 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet54 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet54, principalArray53);
        javax.security.auth.Subject subject56 = new javax.security.auth.Subject(false, principalSet49, (java.util.Set<java.security.Principal>) principalSet51, (java.util.Set<java.security.Principal>) principalSet54);
        javax.security.auth.Subject subject58 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet59 = subject58.getPrincipals();
        java.security.Principal[] principalArray60 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet61 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet61, principalArray60);
        java.security.Principal[] principalArray63 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet64 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet64, principalArray63);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject(false, principalSet59, (java.util.Set<java.security.Principal>) principalSet61, (java.util.Set<java.security.Principal>) principalSet64);
        javax.security.auth.Subject subject68 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet69 = subject68.getPrincipals();
        java.security.Principal[] principalArray70 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet71 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet71, principalArray70);
        java.security.Principal[] principalArray73 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet74 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet74, principalArray73);
        javax.security.auth.Subject subject76 = new javax.security.auth.Subject(false, principalSet69, (java.util.Set<java.security.Principal>) principalSet71, (java.util.Set<java.security.Principal>) principalSet74);
        javax.security.auth.Subject subject77 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet51, (java.util.Set<java.security.Principal>) principalSet61, principalSet69);
        javax.security.auth.Subject subject78 = new javax.security.auth.Subject(false, principalSet43, principalSet45, principalSet69);
        java.util.Set<java.security.Principal> principalSet79 = subject78.getPrincipals();
        javax.security.auth.Subject subject81 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet82 = subject81.getPrincipals();
        java.security.Principal[] principalArray83 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet84 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet84, principalArray83);
        java.security.Principal[] principalArray86 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet87 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet87, principalArray86);
        javax.security.auth.Subject subject89 = new javax.security.auth.Subject(false, principalSet82, (java.util.Set<java.security.Principal>) principalSet84, (java.util.Set<java.security.Principal>) principalSet87);
        javax.security.auth.Subject subject90 = new javax.security.auth.Subject(true, principalSet40, principalSet79, (java.util.Set<java.security.Principal>) principalSet87);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost93 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):10", (int) (short) 102);
        boolean boolean94 = subject90.equals((java.lang.Object) "127.0.0.1(127.0.0.1):10");
        java.util.Set<java.security.Principal> principalSet95 = subject90.getPrincipals();
        java.lang.String str96 = subject90.toString();
        java.util.Set<java.lang.Object> objSet97 = subject90.getPrivateCredentials();
        org.junit.Assert.assertNotNull(principalArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(principalSet6);
        org.junit.Assert.assertNotNull(principalSet10);
        org.junit.Assert.assertNotNull(principalArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(principalArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(principalSet20);
        org.junit.Assert.assertNotNull(principalArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(principalArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(principalSet30);
        org.junit.Assert.assertNotNull(principalArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(principalArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(principalSet40);
        org.junit.Assert.assertNotNull(principalSet43);
        org.junit.Assert.assertNotNull(principalSet45);
        org.junit.Assert.assertNotNull(principalSet49);
        org.junit.Assert.assertNotNull(principalArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(principalArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(principalSet59);
        org.junit.Assert.assertNotNull(principalArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(principalArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(principalSet69);
        org.junit.Assert.assertNotNull(principalArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(principalArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(principalSet79);
        org.junit.Assert.assertNotNull(principalSet82);
        org.junit.Assert.assertNotNull(principalArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(principalArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(principalSet95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Subject:\n" + "'", str96, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet97);
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl("52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52" + "'", str1, "52");
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef8 = client1.recv_describe_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList7 = client2.describe_ring("36");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.recv_get_indexed_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove_counter(byteBuffer9, columnPath10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate13 = null;
        org.apache.cassandra.thrift.KeyRange keyRange14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList16 = client2.get_range_slices(columnParent12, slicePredicate13, keyRange14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        boolean boolean4 = atomicLong1.weakCompareAndSet((long) 100, (long) (byte) 102);
        long long6 = atomicLong1.addAndGet(101L);
        long long7 = atomicLong1.getAndIncrement();
        float float8 = atomicLong1.floatValue();
        long long9 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 111L + "'", long6 == 111L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 112.0f + "'", float8 == 112.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 112L + "'", long9 == 112L);
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_batch_mutate(byteBufferMap8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 64);
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("99(0.0.0.99):32");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_cql_version("31(0.0.0.31):35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList6 = client1.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer10, columnPath11, (long) (byte) 96, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14151");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap11 = client2.recv_multiget_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14152");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = client2.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14153");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList17 = client2.describe_splits("9693:9160", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):2147483647", "1(0.0.0.1):97", 151);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14154");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str3 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 35);
        cassandraHost1.setUseSocketKeepalive(false);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong();
        double double9 = atomicLong8.doubleValue();
        long long10 = atomicLong8.incrementAndGet();
        long long12 = atomicLong8.getAndSet((long) 100);
        boolean boolean15 = atomicLong8.compareAndSet((-1L), 1L);
        boolean boolean18 = atomicLong8.weakCompareAndSet((long) (short) 0, (long) 50);
        long long19 = atomicLong8.incrementAndGet();
        double double20 = atomicLong8.doubleValue();
        long long21 = atomicLong8.getAndIncrement();
        boolean boolean22 = cassandraHost1.equals((java.lang.Object) atomicLong8);
        float float23 = atomicLong8.floatValue();
        atomicLong8.set(9479L);
        java.util.function.LongBinaryOperator longBinaryOperator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = atomicLong8.getAndAccumulate(297L, longBinaryOperator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 101.0d + "'", double20 == 101.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 101L + "'", long21 == 101L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 102.0f + "'", float23 == 102.0f);
    }

    @Test
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14155");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        java.lang.String str2 = cassandraHost1.getIp();
        java.lang.String str3 = cassandraHost1.toString();
        java.lang.String str4 = cassandraHost1.getIp();
        java.lang.String str5 = cassandraHost1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!(hi!):9160" + "'", str3, "hi!(hi!):9160");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!(hi!):9160" + "'", str5, "hi!(hi!):9160");
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14156");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = client1.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14157");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList14 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14158");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        long long2 = atomicLong1.decrementAndGet();
        long long4 = atomicLong1.getAndAdd(9891L);
        int int5 = atomicLong1.intValue();
        java.lang.String str6 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9L + "'", long4 == 9L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9900 + "'", int5 == 9900);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9900" + "'", str6, "9900");
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14159");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = client1.recv_system_update_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14160");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("Subject", (int) (short) 12);
        boolean boolean3 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14161");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("9644");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9160 + "'", int1 == 9160);
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14162");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 1);
        long long2 = atomicLong1.getAndIncrement();
        long long3 = atomicLong1.get();
        long long5 = atomicLong1.getAndAdd(633L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14163");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList12 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList12, byteBufferArray11);
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap17 = client2.multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList12, columnParent14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14164");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 0);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        boolean boolean8 = atomicLong5.compareAndSet(34L, 0L);
        atomicLong5.set(10L);
        boolean boolean11 = cassandraHost2.equals((java.lang.Object) atomicLong5);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str14 = cassandraHost2.getHost();
        cassandraHost2.setMaxActive((int) (short) 100);
        long long17 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.Class<?> wildcardClass18 = cassandraHost2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":9160" + "'", str14, ":9160");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14165");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("3", (int) ' ');
        cassandraHost2.setUseThriftFramedTransport(true);
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14166");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList18 = client2.describe_splits("hi!(hi!)(hi!(hi!)):99", "268", ":9160(:9160):10", (int) (short) 36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14167");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        float float3 = atomicLong0.floatValue();
        long long5 = atomicLong0.getAndAdd((long) (short) 10);
        long long6 = atomicLong0.getAndIncrement();
        long long8 = atomicLong0.addAndGet((long) (short) 34);
        boolean boolean11 = atomicLong0.compareAndSet((long) (short) 98, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6 == 11L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 46L + "'", long8 == 46L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14168");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:9160", (int) (byte) 100);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100" + "'", str4, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14169");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 14);
        int int2 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14170");
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet3 = subject2.getPrincipals();
        javax.security.auth.Subject subject4 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet5 = subject4.getPrincipals();
        javax.security.auth.Subject subject8 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet9 = subject8.getPrincipals();
        java.security.Principal[] principalArray10 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet11 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet11, principalArray10);
        java.security.Principal[] principalArray13 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet14 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet14, principalArray13);
        javax.security.auth.Subject subject16 = new javax.security.auth.Subject(false, principalSet9, (java.util.Set<java.security.Principal>) principalSet11, (java.util.Set<java.security.Principal>) principalSet14);
        javax.security.auth.Subject subject18 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet19 = subject18.getPrincipals();
        java.security.Principal[] principalArray20 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet21 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet21, principalArray20);
        java.security.Principal[] principalArray23 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet24 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet24, principalArray23);
        javax.security.auth.Subject subject26 = new javax.security.auth.Subject(false, principalSet19, (java.util.Set<java.security.Principal>) principalSet21, (java.util.Set<java.security.Principal>) principalSet24);
        javax.security.auth.Subject subject28 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet29 = subject28.getPrincipals();
        java.security.Principal[] principalArray30 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet31 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet31, principalArray30);
        java.security.Principal[] principalArray33 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet34 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet34, principalArray33);
        javax.security.auth.Subject subject36 = new javax.security.auth.Subject(false, principalSet29, (java.util.Set<java.security.Principal>) principalSet31, (java.util.Set<java.security.Principal>) principalSet34);
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet11, (java.util.Set<java.security.Principal>) principalSet21, principalSet29);
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(false, principalSet3, principalSet5, principalSet29);
        java.util.Set<java.security.Principal> principalSet39 = subject38.getPrincipals();
        javax.security.auth.Subject subject41 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet42 = subject41.getPrincipals();
        java.security.Principal[] principalArray43 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet44 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet44, principalArray43);
        java.security.Principal[] principalArray46 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet47 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet47, principalArray46);
        javax.security.auth.Subject subject49 = new javax.security.auth.Subject(false, principalSet42, (java.util.Set<java.security.Principal>) principalSet44, (java.util.Set<java.security.Principal>) principalSet47);
        java.security.Principal[] principalArray51 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet52 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet52, principalArray51);
        javax.security.auth.Subject subject54 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet55 = subject54.getPrincipals();
        javax.security.auth.Subject subject58 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet59 = subject58.getPrincipals();
        java.security.Principal[] principalArray60 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet61 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet61, principalArray60);
        java.security.Principal[] principalArray63 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet64 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet64, principalArray63);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject(false, principalSet59, (java.util.Set<java.security.Principal>) principalSet61, (java.util.Set<java.security.Principal>) principalSet64);
        javax.security.auth.Subject subject68 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet69 = subject68.getPrincipals();
        java.security.Principal[] principalArray70 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet71 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet71, principalArray70);
        java.security.Principal[] principalArray73 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet74 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet74, principalArray73);
        javax.security.auth.Subject subject76 = new javax.security.auth.Subject(false, principalSet69, (java.util.Set<java.security.Principal>) principalSet71, (java.util.Set<java.security.Principal>) principalSet74);
        javax.security.auth.Subject subject78 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet79 = subject78.getPrincipals();
        java.security.Principal[] principalArray80 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet81 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet81, principalArray80);
        java.security.Principal[] principalArray83 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet84 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet84, principalArray83);
        javax.security.auth.Subject subject86 = new javax.security.auth.Subject(false, principalSet79, (java.util.Set<java.security.Principal>) principalSet81, (java.util.Set<java.security.Principal>) principalSet84);
        javax.security.auth.Subject subject87 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet61, (java.util.Set<java.security.Principal>) principalSet71, principalSet79);
        javax.security.auth.Subject subject88 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet52, principalSet55, (java.util.Set<java.security.Principal>) principalSet71);
        javax.security.auth.Subject subject89 = new javax.security.auth.Subject(true, principalSet39, principalSet42, (java.util.Set<java.security.Principal>) principalSet71);
        subject89.setReadOnly();
        java.util.Set<java.lang.Object> objSet91 = subject89.getPublicCredentials();
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertNotNull(principalSet5);
        org.junit.Assert.assertNotNull(principalSet9);
        org.junit.Assert.assertNotNull(principalArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(principalArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(principalSet19);
        org.junit.Assert.assertNotNull(principalArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(principalArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(principalSet29);
        org.junit.Assert.assertNotNull(principalArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(principalArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(principalSet39);
        org.junit.Assert.assertNotNull(principalSet42);
        org.junit.Assert.assertNotNull(principalArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(principalArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(principalArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(principalSet55);
        org.junit.Assert.assertNotNull(principalSet59);
        org.junit.Assert.assertNotNull(principalArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(principalArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(principalSet69);
        org.junit.Assert.assertNotNull(principalArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(principalArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(principalSet79);
        org.junit.Assert.assertNotNull(principalArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(principalArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objSet91);
    }

    @Test
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14171");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14172");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet9 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet10 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Subject:\n" + "'", str7, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet8);
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertNotNull(objSet10);
    }

    @Test
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14173");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(101L);
        long long3 = atomicLong1.getAndAdd((long) (short) 100);
        boolean boolean6 = atomicLong1.weakCompareAndSet(8L, 96L);
        short short7 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 201 + "'", short7 == (short) 201);
    }

    @Test
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14174");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        int int2 = atomicLong0.intValue();
        float float3 = atomicLong0.floatValue();
        boolean boolean6 = atomicLong0.compareAndSet((long) 2147483647, (-1L));
        java.lang.String str7 = atomicLong0.toString();
        long long8 = atomicLong0.getAndDecrement();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14175");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) (short) 100);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 50);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 3);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setCassandraThriftSocketTimeout(103);
        java.lang.String str16 = cassandraHost2.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":9160(:9160):10" + "'", str16, ":9160(:9160):10");
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14176");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("103", (int) (byte) 97);
        java.lang.String str3 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103(0.0.0.103):97" + "'", str3, "103(0.0.0.103):97");
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14177");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.login(authenticationRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14178");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.AuthenticationRequest authenticationRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_login(authenticationRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14179");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.lang.String str2 = subject1.toString();
        java.lang.String str3 = subject1.toString();
        java.util.Set<java.lang.Object> objSet4 = subject1.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject1.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost7.setCassandraThriftSocketTimeout(0);
        java.lang.String str10 = cassandraHost7.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean13 = cassandraHost12.getUseSocketKeepalive();
        boolean boolean14 = cassandraHost7.equals((java.lang.Object) boolean13);
        boolean boolean16 = cassandraHost7.equals((java.lang.Object) (-1L));
        cassandraHost7.setMaxFrameSize((int) (byte) 1);
        cassandraHost7.setUseThriftFramedTransport(false);
        javax.security.auth.Subject subject21 = new javax.security.auth.Subject();
        boolean boolean22 = subject21.isReadOnly();
        java.lang.String str23 = subject21.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong24 = new java.util.concurrent.atomic.AtomicLong();
        double double25 = atomicLong24.doubleValue();
        long long26 = atomicLong24.incrementAndGet();
        boolean boolean27 = subject21.equals((java.lang.Object) long26);
        java.lang.String str28 = subject21.toString();
        java.util.Set<java.security.Principal> principalSet29 = subject21.getPrincipals();
        boolean boolean30 = cassandraHost7.equals((java.lang.Object) principalSet29);
        javax.security.auth.Subject subject32 = new javax.security.auth.Subject();
        boolean boolean33 = subject32.isReadOnly();
        java.lang.String str34 = subject32.toString();
        subject32.setReadOnly();
        java.util.Set<java.security.Principal> principalSet36 = subject32.getPrincipals();
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet39 = subject38.getPrincipals();
        java.security.Principal[] principalArray40 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet41 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet41, principalArray40);
        java.security.Principal[] principalArray43 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet44 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet44, principalArray43);
        javax.security.auth.Subject subject46 = new javax.security.auth.Subject(false, principalSet39, (java.util.Set<java.security.Principal>) principalSet41, (java.util.Set<java.security.Principal>) principalSet44);
        javax.security.auth.Subject subject47 = new javax.security.auth.Subject();
        boolean boolean48 = subject47.isReadOnly();
        java.lang.String str49 = subject47.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong50 = new java.util.concurrent.atomic.AtomicLong();
        double double51 = atomicLong50.doubleValue();
        long long52 = atomicLong50.incrementAndGet();
        boolean boolean53 = subject47.equals((java.lang.Object) long52);
        java.lang.String str54 = subject47.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong56 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean57 = subject47.equals((java.lang.Object) atomicLong56);
        java.util.Set<java.lang.Object> objSet58 = subject47.getPrivateCredentials();
        boolean boolean59 = subject47.isReadOnly();
        java.util.Set<java.security.Principal> principalSet60 = subject47.getPrincipals();
        javax.security.auth.Subject subject61 = new javax.security.auth.Subject(true, principalSet36, (java.util.Set<java.security.Principal>) principalSet41, principalSet60);
        javax.security.auth.Subject subject62 = new javax.security.auth.Subject(false, principalSet5, principalSet29, principalSet60);
        subject62.setReadOnly();
        subject62.setReadOnly();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(principalSet5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":9160" + "'", str10, ":9160");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Subject:\n" + "'", str23, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Subject:\n" + "'", str28, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Subject:\n" + "'", str34, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet36);
        org.junit.Assert.assertNotNull(principalSet39);
        org.junit.Assert.assertNotNull(principalArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(principalArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Subject:\n" + "'", str49, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Subject:\n" + "'", str54, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objSet58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(principalSet60);
    }

    @Test
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14180");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef14 = client2.describe_keyspace("32");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14181");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14182");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99):32", 2);
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14183");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_add_keyspace(ksDef8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14184");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client2.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14185");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_add_keyspace(ksDef9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14186");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList7 = client1.recv_describe_ring();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14187");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList9 = client1.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14188");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_drop_column_family("Subject(Subject):101");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14189");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = client1.describe_splits("101(0.0.0.101):9160", "hi!(hi!):101", ":97(", (int) (short) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14190");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.1.60");
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14191");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client1.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14192");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        float float2 = atomicLong1.floatValue();
        long long3 = atomicLong1.decrementAndGet();
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndUpdate(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14193");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        java.lang.String str4 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean7 = cassandraHost6.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.equals((java.lang.Object) boolean7);
        boolean boolean10 = cassandraHost1.equals((java.lang.Object) (-1L));
        cassandraHost1.setMaxFrameSize((int) (byte) 1);
        long long13 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (short) 52);
        int int16 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String str17 = cassandraHost1.getHost();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":9160" + "'", str4, ":9160");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14194");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long3 = atomicLong1.getAndAdd((-1L));
        long long5 = atomicLong1.getAndAdd(52L);
        long long6 = atomicLong1.getAndIncrement();
        boolean boolean9 = atomicLong1.weakCompareAndSet(4L, (long) (short) 10);
        long long10 = atomicLong1.incrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
    }

    @Test
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14195");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 51);
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.accumulateAndGet(0L, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14196");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97(:97):9160", (int) (short) 9595);
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14197");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        atomicLong0.set(0L);
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14198");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(1L);
        java.lang.String str2 = atomicLong1.toString();
        long long3 = atomicLong1.getAndDecrement();
        long long5 = atomicLong1.getAndAdd(209L);
        boolean boolean8 = atomicLong1.compareAndSet(209L, (long) (short) 35);
        long long10 = atomicLong1.addAndGet(0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14199");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList12 = client2.describe_ring(":97(:97):2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14200");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -1);
        long long3 = atomicLong1.getAndSet((long) (byte) 100);
        long long4 = atomicLong1.getAndDecrement();
        long long6 = atomicLong1.addAndGet(152L);
        boolean boolean9 = atomicLong1.weakCompareAndSet(50L, (long) 2147483647);
        long long11 = atomicLong1.getAndSet(225L);
        long long13 = atomicLong1.getAndAdd(395L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 251L + "'", long6 == 251L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 251L + "'", long11 == 251L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 225L + "'", long13 == 225L);
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14201");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove_counter(byteBuffer8, columnPath9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14202");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_splits("12:103", "9197", "", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14203");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14204");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14205");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14206");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.Compression compression8 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_cql_query(byteBuffer7, compression8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14207");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9693", 102);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14208");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client1.system_drop_column_family("103");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14209");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList16 = client2.describe_splits("234", "0.0.0.99(0.0.0.99):100", "31:35", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14210");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(98L);
        long long3 = atomicLong1.getAndSet((long) 'a');
        long long4 = atomicLong1.decrementAndGet();
        long long6 = atomicLong1.getAndSet(109L);
        long long8 = atomicLong1.getAndSet(520L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 98L + "'", long3 == 98L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 96L + "'", long4 == 96L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 96L + "'", long6 == 96L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 109L + "'", long8 == 109L);
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14211");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):97");
    }

    @Test
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14212");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("106");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14213");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_ring(":97(:97):1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14214");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList14 = client2.get_slice(byteBuffer10, columnParent11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14215");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray9 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList10 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList10, byteBufferArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult12 = client2.execute_prepared_cql_query((int) (short) -1, (java.util.List<java.nio.ByteBuffer>) byteBufferList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14216");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_ring(":9160:99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14217");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14218");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str6 = cassandraHost1.getIp();
        long long7 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str8 = cassandraHost1.getUrl();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1" + "'", str6, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":9160" + "'", str8, ":9160");
    }

    @Test
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14219");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14220");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client1.describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14221");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14222");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace(":97(:97)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14223");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14224");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.recv_get_paged_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14225");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        long long4 = atomicLong0.getAndSet((long) '#');
        long long5 = atomicLong0.get();
        java.lang.String str6 = atomicLong0.toString();
        long long8 = atomicLong0.getAndSet(0L);
        boolean boolean11 = atomicLong0.compareAndSet(0L, 9L);
        boolean boolean14 = atomicLong0.compareAndSet(2L, 50L);
        long long15 = atomicLong0.getAndIncrement();
        long long17 = atomicLong0.getAndSet(130L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35" + "'", str6, "35");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14226");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14227");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):9160", (int) (short) 10);
        cassandraHost2.setMaxActive((int) (short) 99);
        cassandraHost2.setUseThriftFramedTransport(true);
        int int7 = cassandraHost2.getPort();
        java.lang.String str8 = cassandraHost2.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):10" + "'", str8, "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):10");
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14228");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):100", (int) (byte) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14229");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        java.lang.String str4 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean7 = cassandraHost6.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.equals((java.lang.Object) boolean7);
        boolean boolean10 = cassandraHost1.equals((java.lang.Object) (-1L));
        cassandraHost1.setMaxFrameSize((int) (byte) 1);
        int int13 = cassandraHost1.getMaxActive();
        cassandraHost1.setMaxActive((int) (byte) 59);
        java.lang.String str16 = cassandraHost1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":9160" + "'", str4, ":9160");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(127.0.0.1):9160" + "'", str16, "(127.0.0.1):9160");
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14230");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -1);
        long long3 = atomicLong1.getAndSet((long) (byte) 100);
        long long4 = atomicLong1.getAndDecrement();
        double double5 = atomicLong1.doubleValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14231");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.Column column10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.insert(byteBuffer8, columnParent9, column10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14232");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.add(byteBuffer15, columnParent16, counterColumn17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14233");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean10 = subject0.equals((java.lang.Object) atomicLong9);
        java.util.Set<java.lang.Object> objSet11 = subject0.getPrivateCredentials();
        boolean boolean12 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet13 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet15 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet16 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost(":97(:97):9160", (int) (byte) 32);
        boolean boolean20 = subject0.equals((java.lang.Object) ":97(:97):9160");
        java.lang.Class<?> wildcardClass21 = subject0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Subject:\n" + "'", str7, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14234");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 35);
    }

    @Test
    public void test14235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14235");
        java.util.Set<java.security.Principal> principalSet1 = null;
        java.security.Principal[] principalArray4 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet5 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet5, principalArray4);
        javax.security.auth.Subject subject7 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet8 = subject7.getPrincipals();
        javax.security.auth.Subject subject11 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet12 = subject11.getPrincipals();
        java.security.Principal[] principalArray13 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet14 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet14, principalArray13);
        java.security.Principal[] principalArray16 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet17 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet17, principalArray16);
        javax.security.auth.Subject subject19 = new javax.security.auth.Subject(false, principalSet12, (java.util.Set<java.security.Principal>) principalSet14, (java.util.Set<java.security.Principal>) principalSet17);
        javax.security.auth.Subject subject21 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet22 = subject21.getPrincipals();
        java.security.Principal[] principalArray23 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet24 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet24, principalArray23);
        java.security.Principal[] principalArray26 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet27 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet27, principalArray26);
        javax.security.auth.Subject subject29 = new javax.security.auth.Subject(false, principalSet22, (java.util.Set<java.security.Principal>) principalSet24, (java.util.Set<java.security.Principal>) principalSet27);
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet32 = subject31.getPrincipals();
        java.security.Principal[] principalArray33 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet34 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet34, principalArray33);
        java.security.Principal[] principalArray36 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet37 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet37, principalArray36);
        javax.security.auth.Subject subject39 = new javax.security.auth.Subject(false, principalSet32, (java.util.Set<java.security.Principal>) principalSet34, (java.util.Set<java.security.Principal>) principalSet37);
        javax.security.auth.Subject subject40 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet14, (java.util.Set<java.security.Principal>) principalSet24, principalSet32);
        javax.security.auth.Subject subject41 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet5, principalSet8, (java.util.Set<java.security.Principal>) principalSet24);
        java.util.Set<java.security.Principal> principalSet42 = subject41.getPrincipals();
        javax.security.auth.Subject subject44 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet45 = subject44.getPrincipals();
        java.security.Principal[] principalArray46 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet47 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet47, principalArray46);
        java.security.Principal[] principalArray49 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet50 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet50, principalArray49);
        javax.security.auth.Subject subject52 = new javax.security.auth.Subject(false, principalSet45, (java.util.Set<java.security.Principal>) principalSet47, (java.util.Set<java.security.Principal>) principalSet50);
        subject52.setReadOnly();
        boolean boolean54 = subject52.isReadOnly();
        java.util.Set<java.security.Principal> principalSet55 = subject52.getPrincipals();
        javax.security.auth.Subject subject58 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet59 = subject58.getPrincipals();
        java.security.Principal[] principalArray60 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet61 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet61, principalArray60);
        java.security.Principal[] principalArray63 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet64 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet64, principalArray63);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject(false, principalSet59, (java.util.Set<java.security.Principal>) principalSet61, (java.util.Set<java.security.Principal>) principalSet64);
        javax.security.auth.Subject subject68 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet69 = subject68.getPrincipals();
        java.security.Principal[] principalArray70 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet71 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet71, principalArray70);
        java.security.Principal[] principalArray73 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet74 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet74, principalArray73);
        javax.security.auth.Subject subject76 = new javax.security.auth.Subject(false, principalSet69, (java.util.Set<java.security.Principal>) principalSet71, (java.util.Set<java.security.Principal>) principalSet74);
        javax.security.auth.Subject subject78 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet79 = subject78.getPrincipals();
        java.security.Principal[] principalArray80 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet81 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet81, principalArray80);
        java.security.Principal[] principalArray83 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet84 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet84, principalArray83);
        javax.security.auth.Subject subject86 = new javax.security.auth.Subject(false, principalSet79, (java.util.Set<java.security.Principal>) principalSet81, (java.util.Set<java.security.Principal>) principalSet84);
        javax.security.auth.Subject subject87 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet61, (java.util.Set<java.security.Principal>) principalSet71, principalSet79);
        subject87.setReadOnly();
        java.util.Set<java.lang.Object> objSet89 = subject87.getPublicCredentials();
        java.lang.String str90 = subject87.toString();
        java.util.Set<java.security.Principal> principalSet91 = subject87.getPrincipals();
        javax.security.auth.Subject subject92 = new javax.security.auth.Subject(true, principalSet42, principalSet55, principalSet91);
        java.util.Set<java.security.Principal> principalSet93 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.Subject subject94 = new javax.security.auth.Subject(true, principalSet1, principalSet55, principalSet93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: invalid null input(s)");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(principalArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(principalSet8);
        org.junit.Assert.assertNotNull(principalSet12);
        org.junit.Assert.assertNotNull(principalArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(principalArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(principalSet22);
        org.junit.Assert.assertNotNull(principalArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(principalArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(principalSet32);
        org.junit.Assert.assertNotNull(principalArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(principalArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(principalSet42);
        org.junit.Assert.assertNotNull(principalSet45);
        org.junit.Assert.assertNotNull(principalArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(principalArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(principalSet55);
        org.junit.Assert.assertNotNull(principalSet59);
        org.junit.Assert.assertNotNull(principalArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(principalArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(principalSet69);
        org.junit.Assert.assertNotNull(principalArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(principalArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(principalSet79);
        org.junit.Assert.assertNotNull(principalArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(principalArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objSet89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Subject:\n" + "'", str90, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet91);
    }

    @Test
    public void test14236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14236");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10", 202);
    }

    @Test
    public void test14237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14237");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_drop_keyspace("223");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test14238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14238");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client1.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14239");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent12 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.add(byteBuffer11, columnParent12, counterColumn13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14240");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.recv_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14241");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(101L);
        atomicLong1.lazySet(3L);
        atomicLong1.lazySet(101L);
        float float6 = atomicLong1.floatValue();
        long long7 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 101.0f + "'", float6 == 101.0f);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test14242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14242");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange12 = null;
        java.nio.ByteBuffer byteBuffer13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList15 = client2.get_paged_slice("269", keyRange12, byteBuffer13, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14243");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent13 = null;
        org.apache.cassandra.thrift.Column column14 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer12, columnParent13, column14, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14244");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.KeyRange keyRange12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_range_slices(columnParent10, slicePredicate11, keyRange12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14245");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 10);
        long long3 = atomicLong1.getAndSet(34L);
        long long4 = atomicLong1.incrementAndGet();
        boolean boolean7 = atomicLong1.compareAndSet((long) (byte) 98, (long) (short) 35);
        atomicLong1.lazySet(9752L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14246");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef6 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_add_keyspace(ksDef6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14247");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList12 = client2.recv_get_paged_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14248");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -1);
        long long3 = atomicLong1.getAndSet((long) (byte) 100);
        long long4 = atomicLong1.getAndDecrement();
        long long6 = atomicLong1.addAndGet(152L);
        boolean boolean9 = atomicLong1.weakCompareAndSet(50L, (long) 2147483647);
        short short10 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 251L + "'", long6 == 251L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 251 + "'", short10 == (short) 251);
    }

    @Test
    public void test14249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14249");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("97", (int) (byte) 53);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.getUrl();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "97:53" + "'", str4, "97:53");
    }

    @Test
    public void test14250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14250");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList8 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14251");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray8 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList9 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList9, byteBufferArray8);
        org.apache.cassandra.thrift.ColumnParent columnParent11 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap14 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList9, columnParent11, slicePredicate12, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNotNull(byteBufferArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14252");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList8 = client1.recv_get_paged_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14253");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        atomicLong0.set((long) (byte) 1);
        atomicLong0.lazySet((long) 1);
        atomicLong0.lazySet(2L);
        long long9 = atomicLong0.decrementAndGet();
        atomicLong0.lazySet(9164L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test14254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14254");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 99);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxWaitTimeWhenExhausted(98L);
        int int6 = cassandraHost2.getMaxActive();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
    }

    @Test
    public void test14255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14255");
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet3 = subject2.getPrincipals();
        java.security.Principal[] principalArray4 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet5 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet5, principalArray4);
        java.security.Principal[] principalArray7 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet8 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet8, principalArray7);
        javax.security.auth.Subject subject10 = new javax.security.auth.Subject(false, principalSet3, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet8);
        javax.security.auth.Subject subject12 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet13 = subject12.getPrincipals();
        java.security.Principal[] principalArray14 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet15 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet15, principalArray14);
        java.security.Principal[] principalArray17 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet18 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet18, principalArray17);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject(false, principalSet13, (java.util.Set<java.security.Principal>) principalSet15, (java.util.Set<java.security.Principal>) principalSet18);
        javax.security.auth.Subject subject22 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet23 = subject22.getPrincipals();
        java.security.Principal[] principalArray24 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet25 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet25, principalArray24);
        java.security.Principal[] principalArray27 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet28 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet28, principalArray27);
        javax.security.auth.Subject subject30 = new javax.security.auth.Subject(false, principalSet23, (java.util.Set<java.security.Principal>) principalSet25, (java.util.Set<java.security.Principal>) principalSet28);
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet15, principalSet23);
        subject31.setReadOnly();
        java.util.Set<java.lang.Object> objSet33 = subject31.getPublicCredentials();
        boolean boolean34 = subject31.isReadOnly();
        java.lang.String str35 = subject31.toString();
        subject31.setReadOnly();
        java.util.Set<java.security.Principal> principalSet37 = subject31.getPrincipals();
        subject31.setReadOnly();
        java.util.Set<java.lang.Object> objSet39 = subject31.getPrivateCredentials();
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertNotNull(principalArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(principalArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(principalSet13);
        org.junit.Assert.assertNotNull(principalArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(principalArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(principalSet23);
        org.junit.Assert.assertNotNull(principalArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(principalArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Subject:\n" + "'", str35, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet37);
        org.junit.Assert.assertNotNull(objSet39);
    }

    @Test
    public void test14256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14256");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0", (int) (short) 18860);
        cassandraHost2.setMaxActive((int) (short) 110);
    }

    @Test
    public void test14257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14257");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(1L);
        boolean boolean4 = atomicLong1.weakCompareAndSet(0L, (long) (short) 100);
        long long5 = atomicLong1.incrementAndGet();
        int int6 = atomicLong1.intValue();
        long long8 = atomicLong1.getAndAdd(51L);
        boolean boolean11 = atomicLong1.weakCompareAndSet(9492L, (long) (byte) 101);
        long long12 = atomicLong1.decrementAndGet();
        long long13 = atomicLong1.getAndDecrement();
        double double14 = atomicLong1.doubleValue();
        long long15 = atomicLong1.incrementAndGet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 51.0d + "'", double14 == 51.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test14258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14258");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent8 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn> columnOrSuperColumnList11 = client1.get_slice(byteBuffer7, columnParent8, slicePredicate9, consistencyLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14259");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.truncate("101");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14260");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):99", 10);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxWaitTimeWhenExhausted(9161L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test14261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14261");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        boolean boolean4 = atomicLong1.weakCompareAndSet((long) 100, (long) (byte) 102);
        long long5 = atomicLong1.getAndIncrement();
        float float6 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 11.0f + "'", float6 == 11.0f);
    }

    @Test
    public void test14262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14262");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) 3);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("106", (int) (short) 11);
        cassandraHost5.setLifo(false);
        java.lang.String str8 = cassandraHost5.getHost();
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) str8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "106" + "'", str8, "106");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14263");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("103(0.0.0.103):1", (int) (byte) 0);
        int int3 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14264");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("CassandraClient<%s-%d>:0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14265");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("104");
    }

    @Test
    public void test14266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14266");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList15 = client2.describe_ring("64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14267");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14268");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("82");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14269");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97(", 31);
    }

    @Test
    public void test14270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14270");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("3", 3);
        boolean boolean3 = cassandraHost2.getLifo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test14271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14271");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray15 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList16 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList16, byteBufferArray15);
        org.apache.cassandra.thrift.ColumnParent columnParent18 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate19 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap21 = client2.multiget_count((java.util.List<java.nio.ByteBuffer>) byteBufferList16, columnParent18, slicePredicate19, consistencyLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNotNull(byteBufferArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14272");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        long long4 = atomicLong0.getAndSet((long) 100);
        boolean boolean7 = atomicLong0.compareAndSet((-1L), 1L);
        boolean boolean10 = atomicLong0.weakCompareAndSet((long) (short) 0, (long) 50);
        long long11 = atomicLong0.incrementAndGet();
        double double12 = atomicLong0.doubleValue();
        long long13 = atomicLong0.getAndIncrement();
        long long14 = atomicLong0.getAndIncrement();
        boolean boolean17 = atomicLong0.compareAndSet(102L, (long) (byte) 1);
        long long19 = atomicLong0.getAndAdd(100L);
        long long20 = atomicLong0.getAndDecrement();
        float float21 = atomicLong0.floatValue();
        long long23 = atomicLong0.addAndGet(9179L);
        java.lang.String str24 = atomicLong0.toString();
        boolean boolean27 = atomicLong0.compareAndSet(53L, 359L);
        float float28 = atomicLong0.floatValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 101L + "'", long11 == 101L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 101L + "'", long13 == 101L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 102L + "'", long14 == 102L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 103L + "'", long19 == 103L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 203L + "'", long20 == 203L);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 202.0f + "'", float21 == 202.0f);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9381L + "'", long23 == 9381L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "9381" + "'", str24, "9381");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 9381.0f + "'", float28 == 9381.0f);
    }

    @Test
    public void test14273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14273");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol15 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer16 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove_counter(byteBuffer16, columnPath17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNull(tProtocol15);
    }

    @Test
    public void test14274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14274");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_cql_version("106");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14275");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_truncate("533");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14276");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("50");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9160 + "'", int1 == 9160);
    }

    @Test
    public void test14277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14277");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = client1.recv_system_add_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test14278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14278");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer10 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer10, columnPath11, (long) 1, consistencyLevel13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14279");
        java.lang.String str1 = me.prettyprint.cassandra.service.CassandraHost.parseHostFromUrl(":9160(:9160)(:9160(:9160)):34");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":9160(:9160)(:9160(:9160))" + "'", str1, ":9160(:9160)(:9160(:9160))");
    }

    @Test
    public void test14280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14280");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client2.recv_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14281");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_truncate("52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14282");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = client2.recv_describe_splits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14283");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client2.recv_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14284");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14285");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList9 = client2.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14286");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.99(0.0.0.99):100", (int) 'a');
        java.lang.String str3 = cassandraHost2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0.0.99(0.0.0.99)(0.0.0.99(0.0.0.99)):97" + "'", str3, "0.0.0.99(0.0.0.99)(0.0.0.99(0.0.0.99)):97");
    }

    @Test
    public void test14287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14287");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family(":97(:97)(:97(:97)):3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14288");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        boolean boolean4 = atomicLong1.weakCompareAndSet((long) 100, (long) (byte) 102);
        long long6 = atomicLong1.addAndGet(101L);
        boolean boolean9 = atomicLong1.weakCompareAndSet((long) (short) 34, (long) (short) 11);
        java.util.function.LongBinaryOperator longBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = atomicLong1.getAndAccumulate(18863L, longBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 111L + "'", long6 == 111L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14289");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer4 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath5 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove(byteBuffer4, columnPath5, (long) 202, consistencyLevel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test14290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14290");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        double double2 = atomicLong1.doubleValue();
        java.util.function.LongBinaryOperator longBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndAccumulate(314L, longBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test14291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14291");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.system_drop_keyspace(":97(:97):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14292");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) (byte) 10);
    }

    @Test
    public void test14293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14293");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent15 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_add(byteBuffer14, columnParent15, counterColumn16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14294");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        int int2 = atomicLong0.intValue();
        float float3 = atomicLong0.floatValue();
        boolean boolean6 = atomicLong0.compareAndSet((long) '4', (long) 'a');
        long long7 = atomicLong0.longValue();
        boolean boolean10 = atomicLong0.compareAndSet(99L, (long) (short) 34);
        boolean boolean13 = atomicLong0.weakCompareAndSet(0L, 63L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14295");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String str6 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test14296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14296");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        int int2 = atomicLong0.intValue();
        float float3 = atomicLong0.floatValue();
        boolean boolean6 = atomicLong0.compareAndSet((long) 2147483647, (-1L));
        long long7 = atomicLong0.get();
        long long8 = atomicLong0.longValue();
        long long10 = atomicLong0.getAndAdd(4L);
        long long12 = atomicLong0.getAndSet(102L);
        java.util.function.LongBinaryOperator longBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = atomicLong0.accumulateAndGet((long) (byte) 12, longBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4L + "'", long12 == 4L);
    }

    @Test
    public void test14297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14297");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99", 100);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted(204L);
        int int6 = cassandraHost2.getPort();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0.0.99" + "'", str3, "0.0.0.99");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test14298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14298");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_remove_counter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14299");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        int int3 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String str4 = cassandraHost1.getName();
        int int5 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setUseSocketKeepalive(true);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong(102L);
        boolean boolean12 = atomicLong9.compareAndSet((long) '4', 101L);
        long long14 = atomicLong9.getAndSet((long) 34);
        double double15 = atomicLong9.doubleValue();
        boolean boolean16 = cassandraHost1.equals((java.lang.Object) atomicLong9);
        cassandraHost1.setMaxFrameSize((int) (short) 9160);
        cassandraHost1.setMaxFrameSize((int) (byte) 10);
        cassandraHost1.setMaxActive(135);
        java.lang.String str23 = cassandraHost1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):9160" + "'", str4, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 102L + "'", long14 == 102L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 34.0d + "'", double15 == 34.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(127.0.0.1):9160" + "'", str23, "(127.0.0.1):9160");
    }

    @Test
    public void test14300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14300");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove(byteBuffer8, columnPath9, 204L, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14301");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef6 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_keyspace(ksDef6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14302");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace(":9160(:9160):34");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14303");
        int int1 = me.prettyprint.cassandra.service.CassandraHost.parsePortFromUrl("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test14304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14304");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long3 = atomicLong1.getAndAdd((-1L));
        long long5 = atomicLong1.getAndAdd(52L);
        long long6 = atomicLong1.getAndIncrement();
        boolean boolean9 = atomicLong1.weakCompareAndSet(4L, (long) (short) 10);
        long long10 = atomicLong1.longValue();
        long long11 = atomicLong1.getAndDecrement();
        long long12 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 53L + "'", long10 == 53L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 53L + "'", long11 == 53L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 51L + "'", long12 == 51L);
    }

    @Test
    public void test14305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14305");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.ColumnOrSuperColumn columnOrSuperColumn10 = client2.recv_get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14306");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList15 = client2.describe_ring("86");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14307");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) "0.0.0.99");
        int int6 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test14308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14308");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 105);
    }

    @Test
    public void test14309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14309");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97:1", (int) (byte) 100);
    }

    @Test
    public void test14310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14310");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.IndexClause indexClause15 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_indexed_slices(columnParent14, indexClause15, slicePredicate16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14311");
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet3 = subject2.getPrincipals();
        javax.security.auth.Subject subject4 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet5 = subject4.getPrincipals();
        javax.security.auth.Subject subject8 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet9 = subject8.getPrincipals();
        java.security.Principal[] principalArray10 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet11 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet11, principalArray10);
        java.security.Principal[] principalArray13 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet14 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet14, principalArray13);
        javax.security.auth.Subject subject16 = new javax.security.auth.Subject(false, principalSet9, (java.util.Set<java.security.Principal>) principalSet11, (java.util.Set<java.security.Principal>) principalSet14);
        javax.security.auth.Subject subject18 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet19 = subject18.getPrincipals();
        java.security.Principal[] principalArray20 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet21 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet21, principalArray20);
        java.security.Principal[] principalArray23 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet24 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet24, principalArray23);
        javax.security.auth.Subject subject26 = new javax.security.auth.Subject(false, principalSet19, (java.util.Set<java.security.Principal>) principalSet21, (java.util.Set<java.security.Principal>) principalSet24);
        javax.security.auth.Subject subject28 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet29 = subject28.getPrincipals();
        java.security.Principal[] principalArray30 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet31 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet31, principalArray30);
        java.security.Principal[] principalArray33 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet34 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet34, principalArray33);
        javax.security.auth.Subject subject36 = new javax.security.auth.Subject(false, principalSet29, (java.util.Set<java.security.Principal>) principalSet31, (java.util.Set<java.security.Principal>) principalSet34);
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet11, (java.util.Set<java.security.Principal>) principalSet21, principalSet29);
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(false, principalSet3, principalSet5, principalSet29);
        java.util.Set<java.security.Principal> principalSet39 = subject38.getPrincipals();
        javax.security.auth.Subject subject41 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet42 = subject41.getPrincipals();
        java.security.Principal[] principalArray43 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet44 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet44, principalArray43);
        java.security.Principal[] principalArray46 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet47 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet47, principalArray46);
        javax.security.auth.Subject subject49 = new javax.security.auth.Subject(false, principalSet42, (java.util.Set<java.security.Principal>) principalSet44, (java.util.Set<java.security.Principal>) principalSet47);
        java.security.Principal[] principalArray51 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet52 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet52, principalArray51);
        javax.security.auth.Subject subject54 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet55 = subject54.getPrincipals();
        javax.security.auth.Subject subject58 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet59 = subject58.getPrincipals();
        java.security.Principal[] principalArray60 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet61 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet61, principalArray60);
        java.security.Principal[] principalArray63 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet64 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet64, principalArray63);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject(false, principalSet59, (java.util.Set<java.security.Principal>) principalSet61, (java.util.Set<java.security.Principal>) principalSet64);
        javax.security.auth.Subject subject68 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet69 = subject68.getPrincipals();
        java.security.Principal[] principalArray70 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet71 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet71, principalArray70);
        java.security.Principal[] principalArray73 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet74 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet74, principalArray73);
        javax.security.auth.Subject subject76 = new javax.security.auth.Subject(false, principalSet69, (java.util.Set<java.security.Principal>) principalSet71, (java.util.Set<java.security.Principal>) principalSet74);
        javax.security.auth.Subject subject78 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet79 = subject78.getPrincipals();
        java.security.Principal[] principalArray80 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet81 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet81, principalArray80);
        java.security.Principal[] principalArray83 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet84 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet84, principalArray83);
        javax.security.auth.Subject subject86 = new javax.security.auth.Subject(false, principalSet79, (java.util.Set<java.security.Principal>) principalSet81, (java.util.Set<java.security.Principal>) principalSet84);
        javax.security.auth.Subject subject87 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet61, (java.util.Set<java.security.Principal>) principalSet71, principalSet79);
        javax.security.auth.Subject subject88 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet52, principalSet55, (java.util.Set<java.security.Principal>) principalSet71);
        javax.security.auth.Subject subject89 = new javax.security.auth.Subject(true, principalSet39, principalSet42, (java.util.Set<java.security.Principal>) principalSet71);
        java.util.Set<java.security.Principal> principalSet90 = subject89.getPrincipals();
        java.util.Set<java.security.Principal> principalSet91 = subject89.getPrincipals();
        java.util.Set<java.lang.Object> objSet92 = subject89.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet93 = subject89.getPrivateCredentials();
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertNotNull(principalSet5);
        org.junit.Assert.assertNotNull(principalSet9);
        org.junit.Assert.assertNotNull(principalArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(principalArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(principalSet19);
        org.junit.Assert.assertNotNull(principalArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(principalArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(principalSet29);
        org.junit.Assert.assertNotNull(principalArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(principalArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(principalSet39);
        org.junit.Assert.assertNotNull(principalSet42);
        org.junit.Assert.assertNotNull(principalArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(principalArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(principalArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(principalSet55);
        org.junit.Assert.assertNotNull(principalSet59);
        org.junit.Assert.assertNotNull(principalArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(principalArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(principalSet69);
        org.junit.Assert.assertNotNull(principalArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(principalArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(principalSet79);
        org.junit.Assert.assertNotNull(principalArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(principalArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(principalSet90);
        org.junit.Assert.assertNotNull(principalSet91);
        org.junit.Assert.assertNotNull(objSet92);
        org.junit.Assert.assertNotNull(objSet93);
    }

    @Test
    public void test14312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14312");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.cassandra.thrift.ColumnParent columnParent6 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate7 = null;
        org.apache.cassandra.thrift.KeyRange keyRange8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList10 = client1.get_range_slices(columnParent6, slicePredicate7, keyRange8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14313");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 2);
        byte byte2 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2 == (byte) 2);
    }

    @Test
    public void test14314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14314");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14315");
        javax.security.auth.Subject subject3 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet4 = subject3.getPrincipals();
        java.security.Principal[] principalArray5 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet6 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet6, principalArray5);
        java.security.Principal[] principalArray8 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet9 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet9, principalArray8);
        javax.security.auth.Subject subject11 = new javax.security.auth.Subject(false, principalSet4, (java.util.Set<java.security.Principal>) principalSet6, (java.util.Set<java.security.Principal>) principalSet9);
        javax.security.auth.Subject subject13 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet14 = subject13.getPrincipals();
        java.security.Principal[] principalArray15 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet16 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet16, principalArray15);
        java.security.Principal[] principalArray18 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet19 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet19, principalArray18);
        javax.security.auth.Subject subject21 = new javax.security.auth.Subject(false, principalSet14, (java.util.Set<java.security.Principal>) principalSet16, (java.util.Set<java.security.Principal>) principalSet19);
        javax.security.auth.Subject subject23 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet24 = subject23.getPrincipals();
        java.security.Principal[] principalArray25 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet26 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet26, principalArray25);
        java.security.Principal[] principalArray28 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet29 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet29, principalArray28);
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject(false, principalSet24, (java.util.Set<java.security.Principal>) principalSet26, (java.util.Set<java.security.Principal>) principalSet29);
        javax.security.auth.Subject subject32 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet6, (java.util.Set<java.security.Principal>) principalSet16, principalSet24);
        java.util.Set<java.security.Principal> principalSet33 = subject32.getPrincipals();
        javax.security.auth.Subject subject34 = new javax.security.auth.Subject();
        boolean boolean35 = subject34.isReadOnly();
        java.lang.String str36 = subject34.toString();
        java.util.Set<java.security.Principal> principalSet37 = subject34.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost40 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean43 = cassandraHost40.equals((java.lang.Object) (short) 100);
        int int44 = cassandraHost40.getCassandraThriftSocketTimeout();
        boolean boolean45 = subject34.equals((java.lang.Object) cassandraHost40);
        boolean boolean46 = subject34.isReadOnly();
        java.util.Set<java.security.Principal> principalSet47 = subject34.getPrincipals();
        javax.security.auth.Subject subject48 = new javax.security.auth.Subject();
        boolean boolean49 = subject48.isReadOnly();
        java.lang.String str50 = subject48.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong51 = new java.util.concurrent.atomic.AtomicLong();
        double double52 = atomicLong51.doubleValue();
        long long53 = atomicLong51.incrementAndGet();
        boolean boolean54 = subject48.equals((java.lang.Object) long53);
        java.lang.String str55 = subject48.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong57 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean58 = subject48.equals((java.lang.Object) atomicLong57);
        java.util.Set<java.lang.Object> objSet59 = subject48.getPrivateCredentials();
        boolean boolean60 = subject48.isReadOnly();
        java.util.Set<java.security.Principal> principalSet61 = subject48.getPrincipals();
        java.util.Set<java.lang.Object> objSet62 = subject48.getPublicCredentials();
        subject48.setReadOnly();
        java.util.Set<java.security.Principal> principalSet64 = subject48.getPrincipals();
        javax.security.auth.Subject subject65 = new javax.security.auth.Subject(true, principalSet33, principalSet47, principalSet64);
        java.lang.Class<?> wildcardClass66 = principalSet47.getClass();
        org.junit.Assert.assertNotNull(principalSet4);
        org.junit.Assert.assertNotNull(principalArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(principalArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(principalSet14);
        org.junit.Assert.assertNotNull(principalArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(principalArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(principalSet24);
        org.junit.Assert.assertNotNull(principalArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(principalArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(principalSet33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Subject:\n" + "'", str36, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(principalSet47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Subject:\n" + "'", str50, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Subject:\n" + "'", str55, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objSet59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(principalSet61);
        org.junit.Assert.assertNotNull(objSet62);
        org.junit.Assert.assertNotNull(principalSet64);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test14316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14316");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):-1", 63);
    }

    @Test
    public void test14317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14317");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        atomicLong0.set((long) (byte) 1);
        long long5 = atomicLong0.longValue();
        long long6 = atomicLong0.longValue();
        long long7 = atomicLong0.incrementAndGet();
        atomicLong0.lazySet((long) (byte) 102);
        long long10 = atomicLong0.longValue();
        float float11 = atomicLong0.floatValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 102L + "'", long10 == 102L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 102.0f + "'", float11 == 102.0f);
    }

    @Test
    public void test14318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14318");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test14319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14319");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client1.system_drop_keyspace("135");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14320");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str3 = cassandraHost1.getHost();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 35);
        cassandraHost1.setUseSocketKeepalive(false);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong();
        double double9 = atomicLong8.doubleValue();
        long long10 = atomicLong8.incrementAndGet();
        long long12 = atomicLong8.getAndSet((long) 100);
        boolean boolean15 = atomicLong8.compareAndSet((-1L), 1L);
        boolean boolean18 = atomicLong8.weakCompareAndSet((long) (short) 0, (long) 50);
        long long19 = atomicLong8.incrementAndGet();
        double double20 = atomicLong8.doubleValue();
        long long21 = atomicLong8.getAndIncrement();
        boolean boolean22 = cassandraHost1.equals((java.lang.Object) atomicLong8);
        atomicLong8.lazySet((long) (byte) 100);
        long long26 = atomicLong8.getAndSet(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 101.0d + "'", double20 == 101.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 101L + "'", long21 == 101L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
    }

    @Test
    public void test14321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14321");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray15 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList16 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList16, byteBufferArray15);
        org.apache.cassandra.thrift.ColumnParent columnParent18 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate19 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap21 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList16, columnParent18, slicePredicate19, consistencyLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNotNull(byteBufferArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14322");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(98L);
        long long3 = atomicLong1.getAndSet((long) 'a');
        long long4 = atomicLong1.decrementAndGet();
        byte byte5 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 98L + "'", long3 == 98L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 96L + "'", long4 == 96L);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 96 + "'", byte5 == (byte) 96);
    }

    @Test
    public void test14323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14323");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14324");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList14 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList14, byteBufferArray13);
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_prepared_cql_query(31, (java.util.List<java.nio.ByteBuffer>) byteBufferList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14325");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
        cassandraHost1.setMaxActive((int) (byte) 35);
    }

    @Test
    public void test14326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14326");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.system_add_column_family(cfDef5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test14327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14327");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath16 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get(byteBuffer15, columnPath16, consistencyLevel17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14328");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) 'a');
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String str4 = cassandraHost2.getIp();
        int int5 = cassandraHost2.getMaxFrameSize();
        java.lang.Class<?> wildcardClass6 = cassandraHost2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14329");
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet3 = subject2.getPrincipals();
        java.security.Principal[] principalArray4 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet5 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet5, principalArray4);
        java.security.Principal[] principalArray7 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet8 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet8, principalArray7);
        javax.security.auth.Subject subject10 = new javax.security.auth.Subject(false, principalSet3, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet8);
        javax.security.auth.Subject subject12 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet13 = subject12.getPrincipals();
        java.security.Principal[] principalArray14 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet15 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet15, principalArray14);
        java.security.Principal[] principalArray17 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet18 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet18, principalArray17);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject(false, principalSet13, (java.util.Set<java.security.Principal>) principalSet15, (java.util.Set<java.security.Principal>) principalSet18);
        javax.security.auth.Subject subject22 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet23 = subject22.getPrincipals();
        java.security.Principal[] principalArray24 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet25 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet25, principalArray24);
        java.security.Principal[] principalArray27 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet28 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet28, principalArray27);
        javax.security.auth.Subject subject30 = new javax.security.auth.Subject(false, principalSet23, (java.util.Set<java.security.Principal>) principalSet25, (java.util.Set<java.security.Principal>) principalSet28);
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet15, principalSet23);
        subject31.setReadOnly();
        java.util.Set<java.lang.Object> objSet33 = subject31.getPublicCredentials();
        java.lang.String str34 = subject31.toString();
        boolean boolean35 = subject31.isReadOnly();
        java.lang.Object obj36 = null;
        boolean boolean37 = subject31.equals(obj36);
        subject31.setReadOnly();
        subject31.setReadOnly();
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertNotNull(principalArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(principalArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(principalSet13);
        org.junit.Assert.assertNotNull(principalArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(principalArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(principalSet23);
        org.junit.Assert.assertNotNull(principalArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(principalArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Subject:\n" + "'", str34, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test14330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14330");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        boolean boolean3 = subject1.isReadOnly();
        java.lang.String str4 = subject1.toString();
        java.lang.String str5 = subject1.toString();
        java.util.Set<java.lang.Object> objSet6 = subject1.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet7 = subject1.getPrincipals();
        javax.security.auth.Subject subject8 = new javax.security.auth.Subject();
        boolean boolean9 = subject8.isReadOnly();
        java.lang.String str10 = subject8.toString();
        java.util.Set<java.security.Principal> principalSet11 = subject8.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong16 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean17 = cassandraHost14.equals((java.lang.Object) (short) 100);
        int int18 = cassandraHost14.getCassandraThriftSocketTimeout();
        boolean boolean19 = subject8.equals((java.lang.Object) cassandraHost14);
        boolean boolean20 = subject8.isReadOnly();
        java.util.Set<java.security.Principal> principalSet21 = subject8.getPrincipals();
        javax.security.auth.Subject subject23 = new javax.security.auth.Subject();
        boolean boolean24 = subject23.isReadOnly();
        java.lang.String str25 = subject23.toString();
        subject23.setReadOnly();
        subject23.setReadOnly();
        boolean boolean28 = subject23.isReadOnly();
        java.util.Set<java.security.Principal> principalSet29 = subject23.getPrincipals();
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet32 = subject31.getPrincipals();
        javax.security.auth.Subject subject33 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet34 = subject33.getPrincipals();
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet38 = subject37.getPrincipals();
        java.security.Principal[] principalArray39 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet40 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet40, principalArray39);
        java.security.Principal[] principalArray42 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet43 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet43, principalArray42);
        javax.security.auth.Subject subject45 = new javax.security.auth.Subject(false, principalSet38, (java.util.Set<java.security.Principal>) principalSet40, (java.util.Set<java.security.Principal>) principalSet43);
        javax.security.auth.Subject subject47 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet48 = subject47.getPrincipals();
        java.security.Principal[] principalArray49 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet50 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet50, principalArray49);
        java.security.Principal[] principalArray52 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet53 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet53, principalArray52);
        javax.security.auth.Subject subject55 = new javax.security.auth.Subject(false, principalSet48, (java.util.Set<java.security.Principal>) principalSet50, (java.util.Set<java.security.Principal>) principalSet53);
        javax.security.auth.Subject subject57 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet58 = subject57.getPrincipals();
        java.security.Principal[] principalArray59 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet60 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet60, principalArray59);
        java.security.Principal[] principalArray62 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet63 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet63, principalArray62);
        javax.security.auth.Subject subject65 = new javax.security.auth.Subject(false, principalSet58, (java.util.Set<java.security.Principal>) principalSet60, (java.util.Set<java.security.Principal>) principalSet63);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet40, (java.util.Set<java.security.Principal>) principalSet50, principalSet58);
        javax.security.auth.Subject subject67 = new javax.security.auth.Subject(false, principalSet32, principalSet34, principalSet58);
        java.util.Set<java.security.Principal> principalSet68 = subject67.getPrincipals();
        javax.security.auth.Subject subject69 = new javax.security.auth.Subject();
        boolean boolean70 = subject69.isReadOnly();
        java.lang.String str71 = subject69.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong72 = new java.util.concurrent.atomic.AtomicLong();
        double double73 = atomicLong72.doubleValue();
        long long74 = atomicLong72.incrementAndGet();
        boolean boolean75 = subject69.equals((java.lang.Object) long74);
        java.lang.String str76 = subject69.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong78 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean79 = subject69.equals((java.lang.Object) atomicLong78);
        java.util.Set<java.lang.Object> objSet80 = subject69.getPrivateCredentials();
        boolean boolean81 = subject69.isReadOnly();
        java.util.Set<java.lang.Object> objSet82 = subject69.getPrivateCredentials();
        subject69.setReadOnly();
        java.util.Set<java.security.Principal> principalSet84 = subject69.getPrincipals();
        javax.security.auth.Subject subject85 = new javax.security.auth.Subject(true, principalSet29, principalSet68, principalSet84);
        javax.security.auth.Subject subject86 = new javax.security.auth.Subject(true, principalSet7, principalSet21, principalSet29);
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Subject:\n" + "'", str4, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Subject:\n" + "'", str5, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet6);
        org.junit.Assert.assertNotNull(principalSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Subject:\n" + "'", str10, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(principalSet21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Subject:\n" + "'", str25, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(principalSet29);
        org.junit.Assert.assertNotNull(principalSet32);
        org.junit.Assert.assertNotNull(principalSet34);
        org.junit.Assert.assertNotNull(principalSet38);
        org.junit.Assert.assertNotNull(principalArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(principalArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(principalSet48);
        org.junit.Assert.assertNotNull(principalArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(principalArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(principalSet58);
        org.junit.Assert.assertNotNull(principalArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(principalArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(principalSet68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Subject:\n" + "'", str71, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Subject:\n" + "'", str76, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objSet80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objSet82);
        org.junit.Assert.assertNotNull(principalSet84);
    }

    @Test
    public void test14331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14331");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97(:97)", 107);
    }

    @Test
    public void test14332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14332");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160((:9160()", (int) (short) 251);
    }

    @Test
    public void test14333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14333");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = client2.describe_splits("31(0.0.0.31):35", "hi!(hi!):102", ":9160:99", (int) (byte) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14334");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1", 9160);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14335");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(105L);
        long long2 = atomicLong1.incrementAndGet();
        long long3 = atomicLong1.getAndIncrement();
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndUpdate(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 106L + "'", long3 == 106L);
    }

    @Test
    public void test14336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14336");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove(byteBuffer8, columnPath9, 10151L, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14337");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 99);
        atomicLong1.lazySet((long) (short) 65);
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndUpdate(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14338");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult15 = client2.recv_execute_prepared_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14339");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspace("127.0.0.1(127.0.0.1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
    }

    @Test
    public void test14340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14340");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_set_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14341");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        boolean boolean2 = subject1.isReadOnly();
        java.lang.String str3 = subject1.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        double double5 = atomicLong4.doubleValue();
        long long6 = atomicLong4.incrementAndGet();
        boolean boolean7 = subject1.equals((java.lang.Object) long6);
        java.lang.String str8 = subject1.toString();
        java.util.Set<java.security.Principal> principalSet9 = subject1.getPrincipals();
        javax.security.auth.Subject subject12 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet13 = subject12.getPrincipals();
        java.security.Principal[] principalArray14 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet15 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet15, principalArray14);
        java.security.Principal[] principalArray17 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet18 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet18, principalArray17);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject(false, principalSet13, (java.util.Set<java.security.Principal>) principalSet15, (java.util.Set<java.security.Principal>) principalSet18);
        javax.security.auth.Subject subject22 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet23 = subject22.getPrincipals();
        java.security.Principal[] principalArray24 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet25 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet25, principalArray24);
        java.security.Principal[] principalArray27 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet28 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet28, principalArray27);
        javax.security.auth.Subject subject30 = new javax.security.auth.Subject(false, principalSet23, (java.util.Set<java.security.Principal>) principalSet25, (java.util.Set<java.security.Principal>) principalSet28);
        javax.security.auth.Subject subject32 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet33 = subject32.getPrincipals();
        java.security.Principal[] principalArray34 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet35 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet35, principalArray34);
        java.security.Principal[] principalArray37 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet38 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet38, principalArray37);
        javax.security.auth.Subject subject40 = new javax.security.auth.Subject(false, principalSet33, (java.util.Set<java.security.Principal>) principalSet35, (java.util.Set<java.security.Principal>) principalSet38);
        javax.security.auth.Subject subject41 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet15, (java.util.Set<java.security.Principal>) principalSet25, principalSet33);
        java.util.Set<java.security.Principal> principalSet42 = subject41.getPrincipals();
        javax.security.auth.Subject subject45 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet46 = subject45.getPrincipals();
        java.security.Principal[] principalArray47 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet48 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet48, principalArray47);
        java.security.Principal[] principalArray50 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet51 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet51, principalArray50);
        javax.security.auth.Subject subject53 = new javax.security.auth.Subject(false, principalSet46, (java.util.Set<java.security.Principal>) principalSet48, (java.util.Set<java.security.Principal>) principalSet51);
        javax.security.auth.Subject subject55 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet56 = subject55.getPrincipals();
        java.security.Principal[] principalArray57 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet58 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet58, principalArray57);
        java.security.Principal[] principalArray60 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet61 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet61, principalArray60);
        javax.security.auth.Subject subject63 = new javax.security.auth.Subject(false, principalSet56, (java.util.Set<java.security.Principal>) principalSet58, (java.util.Set<java.security.Principal>) principalSet61);
        javax.security.auth.Subject subject65 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet66 = subject65.getPrincipals();
        java.security.Principal[] principalArray67 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet68 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet68, principalArray67);
        java.security.Principal[] principalArray70 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet71 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet71, principalArray70);
        javax.security.auth.Subject subject73 = new javax.security.auth.Subject(false, principalSet66, (java.util.Set<java.security.Principal>) principalSet68, (java.util.Set<java.security.Principal>) principalSet71);
        javax.security.auth.Subject subject74 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet48, (java.util.Set<java.security.Principal>) principalSet58, principalSet66);
        javax.security.auth.Subject subject75 = new javax.security.auth.Subject(true, principalSet9, principalSet42, (java.util.Set<java.security.Principal>) principalSet58);
        subject75.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost79 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        int int80 = cassandraHost79.getMaxActive();
        cassandraHost79.setLifo(true);
        cassandraHost79.setLifo(true);
        int int85 = cassandraHost79.getPort();
        boolean boolean86 = subject75.equals((java.lang.Object) int85);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost89 = new me.prettyprint.cassandra.service.CassandraHost("Subject:9160", 3);
        boolean boolean90 = subject75.equals((java.lang.Object) "Subject:9160");
        subject75.setReadOnly();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Subject:\n" + "'", str8, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet9);
        org.junit.Assert.assertNotNull(principalSet13);
        org.junit.Assert.assertNotNull(principalArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(principalArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(principalSet23);
        org.junit.Assert.assertNotNull(principalArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(principalArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(principalSet33);
        org.junit.Assert.assertNotNull(principalArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(principalArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(principalSet42);
        org.junit.Assert.assertNotNull(principalSet46);
        org.junit.Assert.assertNotNull(principalArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(principalArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(principalSet56);
        org.junit.Assert.assertNotNull(principalArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(principalArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(principalSet66);
        org.junit.Assert.assertNotNull(principalArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(principalArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 50 + "'", int80 == 50);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 52 + "'", int85 == 52);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test14342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14342");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14343");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_update_column_family(cfDef10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14344");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(88L);
        long long3 = atomicLong1.getAndAdd((long) (byte) 98);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 88L + "'", long3 == 88L);
    }

    @Test
    public void test14345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14345");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 99);
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setMaxWaitTimeWhenExhausted(73L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test14346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14346");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_set_cql_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14347");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):0", (int) (short) 103);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test14348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14348");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setLifo(false);
        java.lang.String str10 = cassandraHost2.getHost();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test14349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14349");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(102L);
        boolean boolean4 = atomicLong1.compareAndSet((long) '4', 101L);
        long long5 = atomicLong1.decrementAndGet();
        boolean boolean8 = atomicLong1.weakCompareAndSet(0L, 0L);
        boolean boolean11 = atomicLong1.compareAndSet((long) (short) 103, (long) (byte) 88);
        double double12 = atomicLong1.doubleValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
    }

    @Test
    public void test14350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14350");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("9381(0.0.36.165):52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14351");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = client2.describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14352");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14353");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        boolean boolean8 = subject0.isReadOnly();
        subject0.setReadOnly();
        javax.security.auth.Subject subject10 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet11 = subject10.getPrivateCredentials();
        boolean boolean12 = subject10.isReadOnly();
        boolean boolean13 = subject10.isReadOnly();
        subject10.setReadOnly();
        java.util.Set<java.lang.Object> objSet15 = subject10.getPublicCredentials();
        boolean boolean16 = subject0.equals((java.lang.Object) objSet15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14354");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer7 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_remove_counter(byteBuffer7, columnPath8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14355");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("103(0.0.0.103)", 14);
    }

    @Test
    public void test14356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14356");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):99", (int) (byte) 50);
        cassandraHost2.setMaxActive((int) '#');
    }

    @Test
    public void test14357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14357");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client1.system_drop_keyspace("9740");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14358");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.truncate("105");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14359");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:10", 2147483647);
        boolean boolean4 = cassandraHost2.equals((java.lang.Object) 102L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14360");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath9 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.remove(byteBuffer8, columnPath9, 107L, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14361");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        boolean boolean2 = subject0.isReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 1);
        cassandraHost6.setUseThriftFramedTransport(false);
        java.lang.String str9 = cassandraHost6.getName();
        java.lang.String str10 = cassandraHost6.getUrl();
        boolean boolean11 = subject0.equals((java.lang.Object) str10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Subject:\n" + "'", str1, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Subject:\n" + "'", str3, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(127.0.0.1):1" + "'", str9, "(127.0.0.1):1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":1" + "'", str10, ":1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14362");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_keyspace("101:9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14363");
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet3 = subject2.getPrincipals();
        java.security.Principal[] principalArray4 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet5 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet5, principalArray4);
        java.security.Principal[] principalArray7 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet8 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet8, principalArray7);
        javax.security.auth.Subject subject10 = new javax.security.auth.Subject(false, principalSet3, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet8);
        javax.security.auth.Subject subject12 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet13 = subject12.getPrincipals();
        java.security.Principal[] principalArray14 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet15 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet15, principalArray14);
        java.security.Principal[] principalArray17 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet18 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet18, principalArray17);
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject(false, principalSet13, (java.util.Set<java.security.Principal>) principalSet15, (java.util.Set<java.security.Principal>) principalSet18);
        javax.security.auth.Subject subject22 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet23 = subject22.getPrincipals();
        java.security.Principal[] principalArray24 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet25 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet25, principalArray24);
        java.security.Principal[] principalArray27 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet28 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet28, principalArray27);
        javax.security.auth.Subject subject30 = new javax.security.auth.Subject(false, principalSet23, (java.util.Set<java.security.Principal>) principalSet25, (java.util.Set<java.security.Principal>) principalSet28);
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet15, principalSet23);
        java.util.Set<java.security.Principal> principalSet32 = subject31.getPrincipals();
        java.util.Set<java.security.Principal> principalSet33 = subject31.getPrincipals();
        java.util.Set<java.lang.Object> objSet34 = subject31.getPublicCredentials();
        java.lang.Object obj35 = null;
        boolean boolean36 = subject31.equals(obj35);
        java.lang.String str37 = subject31.toString();
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertNotNull(principalArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(principalArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(principalSet13);
        org.junit.Assert.assertNotNull(principalArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(principalArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(principalSet23);
        org.junit.Assert.assertNotNull(principalArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(principalArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(principalSet32);
        org.junit.Assert.assertNotNull(principalSet33);
        org.junit.Assert.assertNotNull(objSet34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Subject:\n" + "'", str37, "Subject:\n");
    }

    @Test
    public void test14364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14364");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray12 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList13 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList13, byteBufferArray12);
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_prepared_cql_query((int) (byte) -93, (java.util.List<java.nio.ByteBuffer>) byteBufferList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNotNull(byteBufferArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14365");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        java.lang.String str2 = cassandraHost1.getIp();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 0);
        cassandraHost1.setMaxWaitTimeWhenExhausted(0L);
        java.lang.String str7 = cassandraHost1.getHost();
        boolean boolean8 = cassandraHost1.getLifo();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (byte) 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "127.0.0.1" + "'", str2, "127.0.0.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "127.0.0.1" + "'", str7, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14366");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        java.util.List<java.nio.ByteBuffer> byteBufferList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult12 = client2.execute_prepared_cql_query((int) (byte) 100, byteBufferList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14367");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer12 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath13 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_remove(byteBuffer12, columnPath13, (long) 109, consistencyLevel15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14368");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(97L);
        long long2 = atomicLong1.getAndIncrement();
        double double3 = atomicLong1.doubleValue();
        long long4 = atomicLong1.incrementAndGet();
        atomicLong1.lazySet(110L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 98.0d + "'", double3 == 98.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
    }

    @Test
    public void test14369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14369");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap14 = client2.recv_multiget_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14370");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = client1.recv_system_drop_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test14371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14371");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 9160);
        java.lang.String str2 = atomicLong1.toString();
        byte byte3 = atomicLong1.byteValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9160" + "'", str2, "9160");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -56 + "'", byte3 == (byte) -56);
    }

    @Test
    public void test14372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14372");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList15 = client2.describe_splits("CassandraClient<%s-%d>:0", "533", "100", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14373");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("223");
        java.lang.Object obj2 = null;
        boolean boolean3 = cassandraHost1.equals(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test14374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14374");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100", 0);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        int int7 = cassandraHost6.getMaxActive();
        java.lang.String str8 = cassandraHost6.toString();
        cassandraHost6.setMaxActive((int) (short) 101);
        cassandraHost6.setUseThriftFramedTransport(true);
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) cassandraHost6);
        cassandraHost6.setMaxActive((int) (byte) -106);
        java.lang.String str16 = cassandraHost6.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160" + "'", str8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160" + "'", str16, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
    }

    @Test
    public void test14375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14375");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9644L);
    }

    @Test
    public void test14376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14376");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.91");
    }

    @Test
    public void test14377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14377");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(209L);
    }

    @Test
    public void test14378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14378");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef7 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_keyspace(ksDef7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14379");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14380");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):-1");
    }

    @Test
    public void test14381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14381");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        java.nio.ByteBuffer[] byteBufferArray15 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList16 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList16, byteBufferArray15);
        // The following exception was thrown during execution in test generation
        try {
            client2.send_execute_prepared_cql_query(101, (java.util.List<java.nio.ByteBuffer>) byteBufferList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNotNull(byteBufferArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14382");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = client2.recv_system_drop_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14383");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14384");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test14385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14385");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 99);
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive((int) (byte) 58);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test14386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14386");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.KsDef ksDef10 = client1.describe_keyspace("127.0.0.1(127.0.0.1):9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14387");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        int int3 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String str4 = cassandraHost1.getName();
        int int5 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setUseSocketKeepalive(true);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong(102L);
        boolean boolean12 = atomicLong9.compareAndSet((long) '4', 101L);
        long long14 = atomicLong9.getAndSet((long) 34);
        double double15 = atomicLong9.doubleValue();
        boolean boolean16 = cassandraHost1.equals((java.lang.Object) atomicLong9);
        java.lang.String str17 = cassandraHost1.getIp();
        int int18 = cassandraHost1.getMaxFrameSize();
        int int19 = cassandraHost1.getMaxActive();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(127.0.0.1):9160" + "'", str4, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 102L + "'", long14 == 102L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 34.0d + "'", double15 == 34.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "127.0.0.1" + "'", str17, "127.0.0.1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 50 + "'", int19 == 50);
    }

    @Test
    public void test14388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14388");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = client2.system_update_column_family(cfDef11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14389");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.CfDef cfDef4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = client1.system_add_column_family(cfDef4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test14390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14390");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet8 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        int int12 = cassandraHost11.getMaxActive();
        boolean boolean13 = cassandraHost11.isPerformNameResolution();
        java.lang.String str14 = cassandraHost11.getHost();
        boolean boolean15 = subject0.equals((java.lang.Object) cassandraHost11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Subject:\n" + "'", str1, "Subject:\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(principalSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objSet6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14391");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_keyspace("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14392");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath12 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove(byteBuffer11, columnPath12, (long) (short) 65, consistencyLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14393");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):34", 0);
    }

    @Test
    public void test14394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14394");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        float float3 = atomicLong0.floatValue();
        long long5 = atomicLong0.getAndSet((long) 'a');
        long long6 = atomicLong0.incrementAndGet();
        int int7 = atomicLong0.intValue();
        boolean boolean10 = atomicLong0.compareAndSet((long) 2147483647, 0L);
        atomicLong0.lazySet((long) (short) -1);
        long long13 = atomicLong0.decrementAndGet();
        int int14 = atomicLong0.intValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test14395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14395");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("99(0.0.0.99)(99(0.0.0.99)):100", (int) (byte) 59);
    }

    @Test
    public void test14396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14396");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("198");
        cassandraHost1.setCassandraThriftSocketTimeout((int) (byte) 32);
        javax.security.auth.Subject subject4 = new javax.security.auth.Subject();
        boolean boolean5 = subject4.isReadOnly();
        java.lang.String str6 = subject4.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong();
        double double8 = atomicLong7.doubleValue();
        long long9 = atomicLong7.incrementAndGet();
        boolean boolean10 = subject4.equals((java.lang.Object) long9);
        java.lang.String str11 = subject4.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean14 = subject4.equals((java.lang.Object) atomicLong13);
        subject4.setReadOnly();
        subject4.setReadOnly();
        boolean boolean17 = subject4.isReadOnly();
        java.util.Set<java.security.Principal> principalSet18 = subject4.getPrincipals();
        subject4.setReadOnly();
        java.util.Set<java.security.Principal> principalSet20 = subject4.getPrincipals();
        boolean boolean21 = cassandraHost1.equals((java.lang.Object) subject4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Subject:\n" + "'", str6, "Subject:\n");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Subject:\n" + "'", str11, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(principalSet18);
        org.junit.Assert.assertNotNull(principalSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test14397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14397");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("9693:9160");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14398");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):99", (int) (short) 52);
        java.lang.String str3 = cassandraHost2.getIp();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!(hi!)(hi!(hi!))" + "'", str3, "hi!(hi!)(hi!(hi!))");
    }

    @Test
    public void test14399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14399");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100", 0);
        cassandraHost2.setUseThriftFramedTransport(true);
        int int5 = cassandraHost2.getMaxFrameSize();
        cassandraHost2.setLifo(false);
        int int8 = cassandraHost2.getMaxFrameSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test14400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14400");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("9197");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14401");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14402");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap8 = client2.recv_multiget_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14403");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        long long2 = atomicLong1.decrementAndGet();
        atomicLong1.lazySet(0L);
        float float5 = atomicLong1.floatValue();
        java.util.function.LongUnaryOperator longUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = atomicLong1.getAndUpdate(longUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test14404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14404");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("91");
        cassandraHost1.setMaxWaitTimeWhenExhausted(136L);
        cassandraHost1.setUseThriftFramedTransport(true);
    }

    @Test
    public void test14405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14405");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) (byte) 0);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str6 = cassandraHost2.getHost();
        java.lang.String str7 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        int int10 = cassandraHost2.getPort();
        int int11 = cassandraHost2.getMaxActive();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(127.0.0.1)" + "'", str6, "(127.0.0.1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(127.0.0.1)((127.0.0.1)):0" + "'", str7, "(127.0.0.1)((127.0.0.1)):0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
    }

    @Test
    public void test14406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14406");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.describe_snitch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14407");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_batch_mutate(byteBufferMap10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14408");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_splits("99(0.0.0.99)(99(0.0.0.99)):100", "", "hi!(hi!)(hi!(hi!))(hi!(hi!)(hi!(hi!))):0", 103);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14409");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_drop_column_family("9692");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14410");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer9 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_get_count(byteBuffer9, columnParent10, slicePredicate11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14411");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList8 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList8, byteBufferArray7);
        org.apache.cassandra.thrift.ColumnParent columnParent10 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap13 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList8, columnParent10, slicePredicate11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14412");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("35");
        int int2 = cassandraHost1.getMaxActive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test14413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14413");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_update_keyspace(ksDef11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14414");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean9 = cassandraHost6.equals((java.lang.Object) (short) 100);
        int int10 = cassandraHost6.getCassandraThriftSocketTimeout();
        boolean boolean11 = subject0.equals((java.lang.Object) cassandraHost6);
        java.util.Set<java.security.Principal> principalSet12 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet13 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet14 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = new java.util.concurrent.atomic.AtomicLong();
        double double17 = atomicLong16.doubleValue();
        long long18 = atomicLong16.incrementAndGet();
        long long20 = atomicLong16.getAndSet((long) 100);
        boolean boolean23 = atomicLong16.weakCompareAndSet(46L, (long) (byte) -121);
        boolean boolean24 = subject0.equals((java.lang.Object) atomicLong16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(principalSet12);
        org.junit.Assert.assertNotNull(principalSet13);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test14415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14415");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList7 = client1.recv_describe_ring();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14416");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.recv_system_add_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14417");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = client1.recv_system_update_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14418");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef6 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_keyspace(ksDef6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14419");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        java.util.Map<java.nio.ByteBuffer, java.util.Map<java.lang.String, java.util.List<org.apache.cassandra.thrift.Mutation>>> byteBufferMap8 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_batch_mutate(byteBufferMap8, consistencyLevel9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14420");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9629L);
    }

    @Test
    public void test14421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14421");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97(:97):1", 88);
    }

    @Test
    public void test14422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14422");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        atomicLong0.set((long) (byte) 1);
        atomicLong0.lazySet((long) 1);
        long long7 = atomicLong0.get();
        atomicLong0.lazySet((long) 103);
        short short10 = atomicLong0.shortValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 103 + "'", short10 == (short) 103);
    }

    @Test
    public void test14423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14423");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14424");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(62L);
        short short2 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 62 + "'", short2 == (short) 62);
    }

    @Test
    public void test14425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14425");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = client2.system_drop_column_family("127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14426");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.set_keyspace("0.0.1.60");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14427");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_set_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14428");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:98");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        int int3 = cassandraHost1.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost1.isPerformNameResolution();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test14429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14429");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(99L);
        long long2 = atomicLong1.getAndIncrement();
        float float3 = atomicLong1.floatValue();
        long long5 = atomicLong1.addAndGet(9965L);
        long long6 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10065L + "'", long5 == 10065L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10064L + "'", long6 == 10064L);
    }

    @Test
    public void test14430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14430");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_ring("34");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
    }

    @Test
    public void test14431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14431");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_set_keyspace("9693(0.0.37.221):102");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14432");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer15 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent16 = null;
        org.apache.cassandra.thrift.Column column17 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_insert(byteBuffer15, columnParent16, column17, consistencyLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14433");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult14 = client2.recv_execute_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14434");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_system_drop_column_family(":9160(");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
    }

    @Test
    public void test14435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14435");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":97", (int) (byte) 100);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":97(:97):100" + "'", str3, ":97(:97):100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":97" + "'", str4, ":97");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test14436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14436");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray10 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList11 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList11, byteBufferArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult13 = client1.execute_prepared_cql_query((int) (short) 104, (java.util.List<java.nio.ByteBuffer>) byteBufferList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNotNull(byteBufferArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14437");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList14 = client2.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14438");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList12 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList12, byteBufferArray11);
        org.apache.cassandra.thrift.ColumnParent columnParent14 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap17 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList12, columnParent14, slicePredicate15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14439");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("99");
        java.lang.String str2 = cassandraHost1.getName();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):100");
        int int5 = cassandraHost4.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost1.equals((java.lang.Object) int5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "99(0.0.0.99):9160" + "'", str2, "99(0.0.0.99):9160");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14440");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)(:9160(:9160)):88");
        boolean boolean2 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setUseThriftFramedTransport(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14441");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        java.lang.String str2 = atomicLong0.toString();
        long long4 = atomicLong0.getAndAdd(102L);
        long long6 = atomicLong0.getAndSet(105L);
        float float7 = atomicLong0.floatValue();
        long long9 = atomicLong0.getAndAdd((long) (byte) 104);
        long long10 = atomicLong0.decrementAndGet();
        boolean boolean13 = atomicLong0.compareAndSet(158L, 249L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 102L + "'", long6 == 102L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 105.0f + "'", float7 == 105.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 105L + "'", long9 == 105L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 208L + "'", long10 == 208L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14442");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        boolean boolean4 = atomicLong1.compareAndSet(34L, 0L);
        atomicLong1.set(10L);
        long long8 = atomicLong1.getAndAdd((long) (byte) -1);
        long long9 = atomicLong1.getAndIncrement();
        atomicLong1.set((long) (short) 50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
    }

    @Test
    public void test14443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14443");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)(:9160(:9160)):34");
    }

    @Test
    public void test14444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14444");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        cassandraHost1.setUseSocketKeepalive(false);
        int int6 = cassandraHost1.getPort();
        cassandraHost1.setLifo(false);
        int int9 = cassandraHost1.getPort();
        boolean boolean10 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setUseSocketKeepalive(true);
        cassandraHost1.setMaxFrameSize((int) (byte) 34);
        int int15 = cassandraHost1.getMaxActive();
        cassandraHost1.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean20 = cassandraHost19.getUseSocketKeepalive();
        java.lang.String str21 = cassandraHost19.getHost();
        cassandraHost19.setCassandraThriftSocketTimeout((int) (short) 35);
        cassandraHost19.setUseSocketKeepalive(false);
        java.util.concurrent.atomic.AtomicLong atomicLong26 = new java.util.concurrent.atomic.AtomicLong();
        double double27 = atomicLong26.doubleValue();
        long long28 = atomicLong26.incrementAndGet();
        long long30 = atomicLong26.getAndSet((long) 100);
        boolean boolean33 = atomicLong26.compareAndSet((-1L), 1L);
        boolean boolean36 = atomicLong26.weakCompareAndSet((long) (short) 0, (long) 50);
        long long37 = atomicLong26.incrementAndGet();
        double double38 = atomicLong26.doubleValue();
        long long39 = atomicLong26.getAndIncrement();
        boolean boolean40 = cassandraHost19.equals((java.lang.Object) atomicLong26);
        float float41 = atomicLong26.floatValue();
        atomicLong26.set(3L);
        long long44 = atomicLong26.decrementAndGet();
        long long45 = atomicLong26.getAndDecrement();
        int int46 = atomicLong26.intValue();
        long long48 = atomicLong26.addAndGet(151L);
        boolean boolean49 = cassandraHost1.equals((java.lang.Object) atomicLong26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9160 + "'", int6 == 9160);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9160 + "'", int9 == 9160);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 101L + "'", long37 == 101L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 101.0d + "'", double38 == 101.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 101L + "'", long39 == 101L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 102.0f + "'", float41 == 102.0f);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 2L + "'", long44 == 2L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2L + "'", long45 == 2L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 152L + "'", long48 == 152L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test14445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14445");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client1.recv_describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14446");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_keyspace("CassandraClient<%s-%d>:100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14447");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 101);
        long long2 = atomicLong1.getAndDecrement();
        boolean boolean5 = atomicLong1.weakCompareAndSet(4L, 34L);
        java.lang.Class<?> wildcardClass6 = atomicLong1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14448");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_system_drop_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14449");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean9 = cassandraHost6.equals((java.lang.Object) (short) 100);
        int int10 = cassandraHost6.getCassandraThriftSocketTimeout();
        boolean boolean11 = subject0.equals((java.lang.Object) cassandraHost6);
        java.lang.String str12 = subject0.toString();
        boolean boolean13 = subject0.isReadOnly();
        boolean boolean14 = subject0.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Subject:\n" + "'", str2, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Subject:\n" + "'", str12, "Subject:\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14450");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult10 = client2.recv_prepare_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14451");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.Compression compression12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlPreparedResult cqlPreparedResult13 = client2.prepare_cql_query(byteBuffer11, compression12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14452");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str6 = cassandraHost1.getIp();
        java.lang.String str7 = cassandraHost1.getUrl();
        cassandraHost1.setMaxFrameSize(10);
        int int10 = cassandraHost1.getMaxActive();
        cassandraHost1.setMaxActive((int) (byte) 0);
        int int13 = cassandraHost1.getMaxActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "127.0.0.1" + "'", str6, "127.0.0.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":9160" + "'", str7, ":9160");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test14453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14453");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        atomicLong0.set((long) (byte) 1);
        atomicLong0.lazySet((long) 1);
        atomicLong0.lazySet(2L);
        long long9 = atomicLong0.incrementAndGet();
        boolean boolean12 = atomicLong0.weakCompareAndSet((long) (short) 10, 0L);
        boolean boolean15 = atomicLong0.weakCompareAndSet((long) (short) 110, 9629L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14454");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.set_keyspace("9381:52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
    }

    @Test
    public void test14455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14455");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        int int3 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setMaxActive(110);
        cassandraHost1.setMaxActive((int) (short) 12);
        long long8 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test14456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14456");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol15 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = client2.describe_cluster_name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNull(tProtocol15);
    }

    @Test
    public void test14457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14457");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("164");
    }

    @Test
    public void test14458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14458");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        java.lang.String str4 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean7 = cassandraHost6.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.equals((java.lang.Object) boolean7);
        int int9 = cassandraHost1.getMaxActive();
        boolean boolean10 = cassandraHost1.isPerformNameResolution();
        java.lang.String str11 = cassandraHost1.getName();
        java.lang.String str12 = cassandraHost1.toString();
        long long13 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setMaxWaitTimeWhenExhausted(51L);
        boolean boolean16 = cassandraHost1.getLifo();
        java.lang.String str17 = cassandraHost1.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":9160" + "'", str4, ":9160");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(127.0.0.1):9160" + "'", str11, "(127.0.0.1):9160");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(127.0.0.1):9160" + "'", str12, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":9160" + "'", str17, ":9160");
    }

    @Test
    public void test14459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14459");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str3 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 50);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("99", (int) ' ');
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) cassandraHost8);
        cassandraHost8.setMaxFrameSize(2);
        cassandraHost8.setMaxFrameSize((int) (byte) 89);
        int int14 = cassandraHost8.getMaxActive();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
    }

    @Test
    public void test14460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14460");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KsDef> ksDefList11 = client2.recv_describe_keyspaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14461");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) (short) 100);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 50);
        cassandraHost2.setUseSocketKeepalive(false);
        int int12 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int13 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        long long16 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str17 = cassandraHost2.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 50L + "'", long16 == 50L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":9160(:9160):10" + "'", str17, ":9160(:9160):10");
    }

    @Test
    public void test14462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14462");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KeyRange keyRange10 = null;
        java.nio.ByteBuffer byteBuffer11 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_get_paged_slice("52", keyRange10, byteBuffer11, consistencyLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14463");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("104", (int) (short) 98);
    }

    @Test
    public void test14464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14464");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_set_cql_version("hi!(hi!)(hi!(hi!)):36");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14465");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList7 = client1.recv_get_paged_slice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14466");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(1L);
        boolean boolean4 = atomicLong1.weakCompareAndSet(0L, (long) (short) 100);
        boolean boolean7 = atomicLong1.weakCompareAndSet((long) 50, 2L);
        boolean boolean10 = atomicLong1.compareAndSet((long) 0, (long) (byte) 10);
        boolean boolean13 = atomicLong1.weakCompareAndSet((long) (short) 100, 0L);
        boolean boolean16 = atomicLong1.compareAndSet((long) (short) 35, 0L);
        java.lang.String str17 = atomicLong1.toString();
        long long18 = atomicLong1.get();
        long long19 = atomicLong1.longValue();
        int int20 = atomicLong1.intValue();
        boolean boolean23 = atomicLong1.weakCompareAndSet(151L, (long) 130);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test14467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14467");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = client2.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
    }

    @Test
    public void test14468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14468");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_insert();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14469");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client2.send_describe_partitioner();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14470");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.system_drop_keyspace("316");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
    }

    @Test
    public void test14471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14471");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.lang.Integer> byteBufferMap8 = client1.recv_multiget_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14472");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(9491L);
        double double2 = atomicLong1.doubleValue();
        long long4 = atomicLong1.getAndSet(9491L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9491.0d + "'", double2 == 9491.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9491L + "'", long4 == 9491L);
    }

    @Test
    public void test14473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14473");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.TokenRange> tokenRangeList8 = client2.describe_ring("(127.0.0.1):0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14474");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(251L);
        long long3 = atomicLong1.getAndSet(10L);
        long long4 = atomicLong1.longValue();
        long long6 = atomicLong1.getAndAdd((long) (short) 110);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 251L + "'", long3 == 251L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test14475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14475");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("223");
        java.lang.String str2 = cassandraHost1.getHost();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "223" + "'", str2, "223");
    }

    @Test
    public void test14476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14476");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) (short) 100);
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(false);
        int int9 = cassandraHost2.getMaxFrameSize();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost11.setCassandraThriftSocketTimeout(0);
        cassandraHost11.setUseSocketKeepalive(false);
        cassandraHost11.setUseSocketKeepalive(false);
        int int18 = cassandraHost11.getPort();
        cassandraHost11.setMaxFrameSize((int) (byte) -1);
        boolean boolean21 = cassandraHost2.equals((java.lang.Object) cassandraHost11);
        int int22 = cassandraHost2.getPort();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9160 + "'", int18 == 9160);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test14477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14477");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.recv_add();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
    }

    @Test
    public void test14478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14478");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.cassandra.thrift.CqlResult cqlResult14 = client2.recv_execute_prepared_cql_query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14479");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(359L);
        boolean boolean4 = atomicLong1.weakCompareAndSet(50L, 8L);
        byte byte5 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 103 + "'", byte5 == (byte) 103);
    }

    @Test
    public void test14480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14480");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol14 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol15 = client2.getInputProtocol();
        java.nio.ByteBuffer[] byteBufferArray16 = new java.nio.ByteBuffer[] {};
        java.util.ArrayList<java.nio.ByteBuffer> byteBufferList17 = new java.util.ArrayList<java.nio.ByteBuffer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.nio.ByteBuffer>) byteBufferList17, byteBufferArray16);
        org.apache.cassandra.thrift.ColumnParent columnParent19 = null;
        org.apache.cassandra.thrift.SlicePredicate slicePredicate20 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.nio.ByteBuffer, java.util.List<org.apache.cassandra.thrift.ColumnOrSuperColumn>> byteBufferMap22 = client2.multiget_slice((java.util.List<java.nio.ByteBuffer>) byteBufferList17, columnParent19, slicePredicate20, consistencyLevel21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
        org.junit.Assert.assertNull(tProtocol14);
        org.junit.Assert.assertNull(tProtocol15);
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14481");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = client2.recv_get_count();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14482");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_system_update_column_family();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14483");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        int int2 = cassandraHost1.getMaxActive();
        int int3 = cassandraHost1.getMaxActive();
        java.lang.String str4 = cassandraHost1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 50 + "'", int3 == 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160" + "'", str4, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
    }

    @Test
    public void test14484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14484");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        double double1 = atomicLong0.doubleValue();
        long long2 = atomicLong0.incrementAndGet();
        float float3 = atomicLong0.floatValue();
        long long5 = atomicLong0.getAndSet((long) 'a');
        long long6 = atomicLong0.incrementAndGet();
        int int7 = atomicLong0.intValue();
        long long9 = atomicLong0.getAndSet((long) (byte) 2);
        double double10 = atomicLong0.doubleValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 98L + "'", long9 == 98L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
    }

    @Test
    public void test14485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14485");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = client2.recv_system_drop_keyspace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14486");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.cassandra.thrift.KeySlice> keySliceList11 = client2.recv_get_range_slices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
    }

    @Test
    public void test14487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14487");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol10 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol11 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol12 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol13 = client2.getOutputProtocol();
        java.nio.ByteBuffer byteBuffer14 = null;
        org.apache.cassandra.thrift.ColumnPath columnPath15 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.remove_counter(byteBuffer14, columnPath15, consistencyLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
        org.junit.Assert.assertNull(tProtocol10);
        org.junit.Assert.assertNull(tProtocol11);
        org.junit.Assert.assertNull(tProtocol12);
        org.junit.Assert.assertNull(tProtocol13);
    }

    @Test
    public void test14488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14488");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        long long3 = atomicLong1.getAndAdd((-1L));
        long long5 = atomicLong1.getAndAdd(52L);
        long long6 = atomicLong1.getAndIncrement();
        boolean boolean9 = atomicLong1.weakCompareAndSet(4L, (long) (short) 10);
        long long10 = atomicLong1.longValue();
        long long11 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 53L + "'", long10 == 53L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 53L + "'", long11 == 53L);
    }

    @Test
    public void test14489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14489");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_schema_versions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14490");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost1.setCassandraThriftSocketTimeout(0);
        java.lang.String str4 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean7 = cassandraHost6.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.equals((java.lang.Object) boolean7);
        int int9 = cassandraHost1.getMaxActive();
        cassandraHost1.setMaxFrameSize((int) 'a');
        boolean boolean12 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str15 = cassandraHost1.getUrl();
        cassandraHost1.setCassandraThriftSocketTimeout((-1));
        cassandraHost1.setUseSocketKeepalive(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":9160" + "'", str4, ":9160");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":9160" + "'", str15, ":9160");
    }

    @Test
    public void test14491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14491");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol3 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client1.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client1.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client1.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            client1.send_describe_splits("Subject(Subject)(Subject(Subject)):9160", "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):10", "127.0.0.1:10", (int) (short) 105);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
    }

    @Test
    public void test14492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14492");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", 0);
    }

    @Test
    public void test14493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14493");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("34", (int) (byte) 10);
    }

    @Test
    public void test14494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14494");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol8 = client2.getInputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol9 = client2.getInputProtocol();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = client2.recv_describe_version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
        org.junit.Assert.assertNull(tProtocol8);
        org.junit.Assert.assertNull(tProtocol9);
    }

    @Test
    public void test14495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14495");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(52L);
        long long3 = atomicLong1.getAndSet((long) 1);
        boolean boolean6 = atomicLong1.weakCompareAndSet(96L, (long) (byte) 53);
        long long7 = atomicLong1.incrementAndGet();
        java.lang.String str8 = atomicLong1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2" + "'", str8, "2");
    }

    @Test
    public void test14496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14496");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 52);
        atomicLong1.lazySet((long) (-1));
        atomicLong1.set((long) 9160);
        long long6 = atomicLong1.longValue();
        long long7 = atomicLong1.longValue();
        int int8 = atomicLong1.intValue();
        float float9 = atomicLong1.floatValue();
        boolean boolean12 = atomicLong1.weakCompareAndSet(10049L, (long) (short) 135);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9160L + "'", long6 == 9160L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9160L + "'", long7 == 9160L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9160 + "'", int8 == 9160);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9160.0f + "'", float9 == 9160.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14497");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.thrift.protocol.TProtocol tProtocol1 = null;
        org.apache.cassandra.thrift.Cassandra.Client client2 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0, tProtocol1);
        org.apache.thrift.protocol.TProtocol tProtocol3 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol4 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol5 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol6 = client2.getOutputProtocol();
        org.apache.thrift.protocol.TProtocol tProtocol7 = client2.getInputProtocol();
        java.nio.ByteBuffer byteBuffer8 = null;
        org.apache.cassandra.thrift.ColumnParent columnParent9 = null;
        org.apache.cassandra.thrift.CounterColumn counterColumn10 = null;
        org.apache.cassandra.thrift.ConsistencyLevel consistencyLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            client2.send_add(byteBuffer8, columnParent9, counterColumn10, consistencyLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol3);
        org.junit.Assert.assertNull(tProtocol4);
        org.junit.Assert.assertNull(tProtocol5);
        org.junit.Assert.assertNull(tProtocol6);
        org.junit.Assert.assertNull(tProtocol7);
    }

    @Test
    public void test14498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14498");
        org.apache.thrift.protocol.TProtocol tProtocol0 = null;
        org.apache.cassandra.thrift.Cassandra.Client client1 = new org.apache.cassandra.thrift.Cassandra.Client(tProtocol0);
        org.apache.thrift.protocol.TProtocol tProtocol2 = client1.getOutputProtocol();
        org.apache.cassandra.thrift.KsDef ksDef3 = null;
        // The following exception was thrown during execution in test generation
        try {
            client1.send_system_update_keyspace(ksDef3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(tProtocol2);
    }

    @Test
    public void test14499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14499");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(485L);
        java.util.function.LongUnaryOperator longUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = atomicLong1.updateAndGet(longUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14500");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("88");
        cassandraHost1.setUseThriftFramedTransport(true);
    }
}

