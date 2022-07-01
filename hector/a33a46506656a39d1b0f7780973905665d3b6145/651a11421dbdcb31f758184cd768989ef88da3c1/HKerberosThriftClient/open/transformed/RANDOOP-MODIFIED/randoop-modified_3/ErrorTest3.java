import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        boolean boolean3 = subject2.isReadOnly();
        java.lang.String str4 = subject2.toString();
        subject2.setReadOnly();
        java.util.Set<java.security.Principal> principalSet6 = subject2.getPrincipals();
        javax.security.auth.Subject subject8 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet9 = subject8.getPrincipals();
        java.security.Principal[] principalArray10 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet11 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet11, principalArray10);
        java.security.Principal[] principalArray13 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet14 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet14, principalArray13);
        javax.security.auth.Subject subject16 = new javax.security.auth.Subject(false, principalSet9, (java.util.Set<java.security.Principal>) principalSet11, (java.util.Set<java.security.Principal>) principalSet14);
        javax.security.auth.Subject subject17 = new javax.security.auth.Subject();
        boolean boolean18 = subject17.isReadOnly();
        java.lang.String str19 = subject17.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong20 = new java.util.concurrent.atomic.AtomicLong();
        double double21 = atomicLong20.doubleValue();
        long long22 = atomicLong20.incrementAndGet();
        boolean boolean23 = subject17.equals((java.lang.Object) long22);
        java.lang.String str24 = subject17.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong26 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean27 = subject17.equals((java.lang.Object) atomicLong26);
        java.util.Set<java.lang.Object> objSet28 = subject17.getPrivateCredentials();
        boolean boolean29 = subject17.isReadOnly();
        java.util.Set<java.security.Principal> principalSet30 = subject17.getPrincipals();
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject(true, principalSet6, (java.util.Set<java.security.Principal>) principalSet11, principalSet30);
        javax.security.auth.Subject subject32 = new javax.security.auth.Subject();
        java.lang.String str33 = subject32.toString();
        java.lang.String str34 = subject32.toString();
        java.util.Set<java.security.Principal> principalSet35 = subject32.getPrincipals();
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet39 = subject38.getPrincipals();
        java.security.Principal[] principalArray40 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet41 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet41, principalArray40);
        java.security.Principal[] principalArray43 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet44 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet44, principalArray43);
        javax.security.auth.Subject subject46 = new javax.security.auth.Subject(false, principalSet39, (java.util.Set<java.security.Principal>) principalSet41, (java.util.Set<java.security.Principal>) principalSet44);
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
        javax.security.auth.Subject subject67 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet41, (java.util.Set<java.security.Principal>) principalSet51, principalSet59);
        subject67.setReadOnly();
        java.util.Set<java.lang.Object> objSet69 = subject67.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet70 = subject67.getPrivateCredentials();
        boolean boolean71 = subject67.isReadOnly();
        java.util.Set<java.security.Principal> principalSet72 = subject67.getPrincipals();
        javax.security.auth.Subject subject73 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet11, principalSet35, principalSet72);
        subject73.setReadOnly();
        subject73.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost78 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", 99);
        cassandraHost78.setCassandraThriftSocketTimeout((int) (byte) 53);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient82 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject73, cassandraHost78, ":9160(:98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient82.equals(null)", !hKerberosThriftClient82.equals(null));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
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
        boolean boolean36 = subject31.isReadOnly();
        java.util.Set<java.lang.Object> objSet37 = subject31.getPrivateCredentials();
        boolean boolean38 = subject31.isReadOnly();
        boolean boolean39 = subject31.isReadOnly();
        java.util.Set<java.lang.Object> objSet40 = subject31.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost42 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost42.setCassandraThriftSocketTimeout(0);
        java.lang.String str45 = cassandraHost42.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost47 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean48 = cassandraHost47.getUseSocketKeepalive();
        boolean boolean49 = cassandraHost42.equals((java.lang.Object) boolean48);
        int int50 = cassandraHost42.getMaxFrameSize();
        int int51 = cassandraHost42.getPort();
        int int52 = cassandraHost42.getCassandraThriftSocketTimeout();
        java.lang.String str53 = cassandraHost42.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient55 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject31, cassandraHost42, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient55.equals(null)", !hKerberosThriftClient55.equals(null));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        boolean boolean2 = subject1.isReadOnly();
        java.lang.String str3 = subject1.toString();
        java.util.Set<java.security.Principal> principalSet4 = subject1.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject1.getPrincipals();
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
        javax.security.auth.Subject subject40 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet41 = subject40.getPrincipals();
        java.security.Principal[] principalArray42 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet43 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet43, principalArray42);
        java.security.Principal[] principalArray45 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet46 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet46, principalArray45);
        javax.security.auth.Subject subject48 = new javax.security.auth.Subject(false, principalSet41, (java.util.Set<java.security.Principal>) principalSet43, (java.util.Set<java.security.Principal>) principalSet46);
        javax.security.auth.Subject subject50 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet51 = subject50.getPrincipals();
        java.security.Principal[] principalArray52 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet53 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet53, principalArray52);
        java.security.Principal[] principalArray55 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet56 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet56, principalArray55);
        javax.security.auth.Subject subject58 = new javax.security.auth.Subject(false, principalSet51, (java.util.Set<java.security.Principal>) principalSet53, (java.util.Set<java.security.Principal>) principalSet56);
        javax.security.auth.Subject subject60 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet61 = subject60.getPrincipals();
        java.security.Principal[] principalArray62 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet63 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet63, principalArray62);
        java.security.Principal[] principalArray65 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet66 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet66, principalArray65);
        javax.security.auth.Subject subject68 = new javax.security.auth.Subject(false, principalSet61, (java.util.Set<java.security.Principal>) principalSet63, (java.util.Set<java.security.Principal>) principalSet66);
        javax.security.auth.Subject subject69 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet43, (java.util.Set<java.security.Principal>) principalSet53, principalSet61);
        subject69.setReadOnly();
        java.util.Set<java.lang.Object> objSet71 = subject69.getPublicCredentials();
        boolean boolean72 = subject69.isReadOnly();
        java.lang.String str73 = subject69.toString();
        subject69.setReadOnly();
        java.util.Set<java.security.Principal> principalSet75 = subject69.getPrincipals();
        javax.security.auth.Subject subject76 = new javax.security.auth.Subject(false, principalSet5, (java.util.Set<java.security.Principal>) principalSet11, principalSet75);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost79 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong81 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean82 = cassandraHost79.equals((java.lang.Object) (short) 100);
        cassandraHost79.setUseSocketKeepalive(false);
        long long85 = cassandraHost79.getMaxWaitTimeWhenExhausted();
        cassandraHost79.setMaxActive((int) '4');
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient89 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject76, cassandraHost79, "(127.0.0.1):52");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient89.equals(null)", !hKerberosThriftClient89.equals(null));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.lang.String str8 = subject0.toString();
        java.util.Set<java.lang.Object> objSet9 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet10 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean16 = cassandraHost13.equals((java.lang.Object) (short) 100);
        cassandraHost13.setUseSocketKeepalive(true);
        boolean boolean19 = cassandraHost13.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "9");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        java.security.Principal[] principalArray3 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet4 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet4, principalArray3);
        java.security.Principal[] principalArray6 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet7 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet7, principalArray6);
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject(false, principalSet2, (java.util.Set<java.security.Principal>) principalSet4, (java.util.Set<java.security.Principal>) principalSet7);
        subject9.setReadOnly();
        boolean boolean11 = subject9.isReadOnly();
        subject9.setReadOnly();
        java.util.Set<java.lang.Object> objSet13 = subject9.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("Subject:0", (int) (byte) 98);
        int int17 = cassandraHost16.getMaxActive();
        int int18 = cassandraHost16.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject9, cassandraHost16, "105");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
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
        java.util.Set<java.lang.Object> objSet12 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str16 = cassandraHost15.getHost();
        cassandraHost15.setMaxWaitTimeWhenExhausted((long) (byte) 50);
        java.lang.String str19 = cassandraHost15.getIp();
        java.lang.String str20 = cassandraHost15.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost15, "9197");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost38 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong40 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean41 = cassandraHost38.equals((java.lang.Object) (short) 100);
        int int42 = cassandraHost38.getCassandraThriftSocketTimeout();
        cassandraHost38.setLifo(false);
        cassandraHost38.setUseSocketKeepalive(false);
        boolean boolean47 = subject31.equals((java.lang.Object) false);
        java.util.Set<java.lang.Object> objSet48 = subject31.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet49 = subject31.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost51 = new me.prettyprint.cassandra.service.CassandraHost("3");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost53 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean54 = cassandraHost53.getUseSocketKeepalive();
        boolean boolean55 = cassandraHost53.getUseSocketKeepalive();
        boolean boolean56 = cassandraHost51.equals((java.lang.Object) boolean55);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient58 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject31, cassandraHost51, "(127.0.0.1):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient58.equals(null)", !hKerberosThriftClient58.equals(null));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
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
        java.util.Set<java.security.Principal> principalSet13 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost16.setCassandraThriftSocketTimeout(0);
        java.lang.String str19 = cassandraHost16.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean22 = cassandraHost21.getUseSocketKeepalive();
        boolean boolean23 = cassandraHost16.equals((java.lang.Object) boolean22);
        int int24 = cassandraHost16.getMaxActive();
        boolean boolean25 = cassandraHost16.getUseSocketKeepalive();
        java.lang.String str26 = cassandraHost16.getUrl();
        javax.security.auth.Subject subject27 = new javax.security.auth.Subject();
        boolean boolean28 = subject27.isReadOnly();
        java.lang.String str29 = subject27.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong30 = new java.util.concurrent.atomic.AtomicLong();
        double double31 = atomicLong30.doubleValue();
        long long32 = atomicLong30.incrementAndGet();
        boolean boolean33 = subject27.equals((java.lang.Object) long32);
        java.lang.String str34 = subject27.toString();
        java.lang.String str35 = subject27.toString();
        boolean boolean36 = subject27.isReadOnly();
        boolean boolean37 = cassandraHost16.equals((java.lang.Object) boolean36);
        boolean boolean38 = subject0.equals((java.lang.Object) boolean37);
        java.util.Set<java.security.Principal> principalSet39 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet41 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet42 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost44 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost44.setCassandraThriftSocketTimeout(0);
        cassandraHost44.setUseSocketKeepalive(false);
        int int49 = cassandraHost44.getMaxActive();
        java.lang.String str50 = cassandraHost44.getUrl();
        cassandraHost44.setMaxActive((int) (short) 10);
        boolean boolean53 = cassandraHost44.isPerformNameResolution();
        int int54 = cassandraHost44.getMaxActive();
        boolean boolean55 = cassandraHost44.getLifo();
        int int56 = cassandraHost44.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient58 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost44, "127.0.0.1(127.0.0.1):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient58.equals(null)", !hKerberosThriftClient58.equals(null));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject();
        boolean boolean10 = subject9.isReadOnly();
        java.lang.String str11 = subject9.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        double double13 = atomicLong12.doubleValue();
        long long14 = atomicLong12.incrementAndGet();
        boolean boolean15 = subject9.equals((java.lang.Object) long14);
        java.lang.String str16 = subject9.toString();
        java.lang.String str17 = subject9.toString();
        java.util.Set<java.security.Principal> principalSet18 = subject9.getPrincipals();
        boolean boolean19 = subject9.isReadOnly();
        subject9.setReadOnly();
        java.util.Set<java.lang.Object> objSet21 = subject9.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost23 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost23.setCassandraThriftSocketTimeout(0);
        cassandraHost23.setUseSocketKeepalive(false);
        int int28 = cassandraHost23.getMaxActive();
        java.lang.String str29 = cassandraHost23.getUrl();
        cassandraHost23.setMaxActive((int) (short) 10);
        boolean boolean32 = cassandraHost23.isPerformNameResolution();
        int int33 = cassandraHost23.getMaxActive();
        boolean boolean34 = cassandraHost23.getLifo();
        int int35 = cassandraHost23.getCassandraThriftSocketTimeout();
        int int36 = cassandraHost23.getMaxActive();
        int int37 = cassandraHost23.getPort();
        boolean boolean38 = cassandraHost23.getLifo();
        boolean boolean39 = subject9.equals((java.lang.Object) cassandraHost23);
        boolean boolean40 = subject0.equals((java.lang.Object) boolean39);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost43 = new me.prettyprint.cassandra.service.CassandraHost("106", 51);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient45 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost43, "hi!(hi!)(hi!(hi!)):36");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient45.equals(null)", !hKerberosThriftClient45.equals(null));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        boolean boolean2 = subject1.isReadOnly();
        java.lang.String str3 = subject1.toString();
        java.util.Set<java.security.Principal> principalSet4 = subject1.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject1.getPrincipals();
        javax.security.auth.Subject subject6 = new javax.security.auth.Subject();
        boolean boolean7 = subject6.isReadOnly();
        java.lang.String str8 = subject6.toString();
        java.util.Set<java.security.Principal> principalSet9 = subject6.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong14 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean15 = cassandraHost12.equals((java.lang.Object) (short) 100);
        int int16 = cassandraHost12.getCassandraThriftSocketTimeout();
        boolean boolean17 = subject6.equals((java.lang.Object) cassandraHost12);
        java.util.Set<java.security.Principal> principalSet18 = subject6.getPrincipals();
        java.util.Set<java.security.Principal> principalSet19 = subject6.getPrincipals();
        javax.security.auth.Subject subject20 = new javax.security.auth.Subject();
        boolean boolean21 = subject20.isReadOnly();
        java.lang.String str22 = subject20.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong23 = new java.util.concurrent.atomic.AtomicLong();
        double double24 = atomicLong23.doubleValue();
        long long25 = atomicLong23.incrementAndGet();
        boolean boolean26 = subject20.equals((java.lang.Object) long25);
        java.lang.String str27 = subject20.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong29 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean30 = subject20.equals((java.lang.Object) atomicLong29);
        java.util.Set<java.lang.Object> objSet31 = subject20.getPrivateCredentials();
        java.lang.String str32 = subject20.toString();
        javax.security.auth.Subject subject33 = new javax.security.auth.Subject();
        boolean boolean34 = subject33.isReadOnly();
        java.lang.String str35 = subject33.toString();
        java.util.Set<java.security.Principal> principalSet36 = subject33.getPrincipals();
        boolean boolean37 = subject20.equals((java.lang.Object) principalSet36);
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(true, principalSet5, principalSet19, principalSet36);
        java.util.Set<java.lang.Object> objSet39 = subject38.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost41 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):9160");
        int int42 = cassandraHost41.getMaxFrameSize();
        boolean boolean43 = subject38.equals((java.lang.Object) cassandraHost41);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost45 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        int int46 = cassandraHost45.getMaxActive();
        cassandraHost45.setMaxActive((int) (byte) 86);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient50 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject38, cassandraHost45, "0.0.1.60");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient50.equals(null)", !hKerberosThriftClient50.equals(null));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean9 = cassandraHost6.equals((java.lang.Object) (short) 100);
        int int10 = cassandraHost6.getCassandraThriftSocketTimeout();
        boolean boolean11 = subject0.equals((java.lang.Object) cassandraHost6);
        boolean boolean12 = subject0.isReadOnly();
        java.util.Set<java.security.Principal> principalSet13 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("Subject:105", 36);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost16, "(127.0.0.1)((127.0.0.1)):-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
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
        java.util.Set<java.security.Principal> principalSet13 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet14 = subject0.getPublicCredentials();
        java.lang.String str15 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 0);
        cassandraHost18.setLifo(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "Subject:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet1 = subject0.getPrincipals();
        boolean boolean2 = subject0.isReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):10", (int) (byte) 98);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost13.setCassandraThriftSocketTimeout(0);
        java.lang.String str16 = cassandraHost13.getUrl();
        cassandraHost13.setLifo(false);
        boolean boolean19 = cassandraHost11.equals((java.lang.Object) false);
        boolean boolean20 = cassandraHost11.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "268");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.lang.String str16 = cassandraHost15.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost15, ":9160(:9160):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
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
        javax.security.auth.Subject subject40 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet41 = subject40.getPrincipals();
        javax.security.auth.Subject subject42 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet43 = subject42.getPrincipals();
        javax.security.auth.Subject subject46 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet47 = subject46.getPrincipals();
        java.security.Principal[] principalArray48 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet49 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet49, principalArray48);
        java.security.Principal[] principalArray51 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet52 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet52, principalArray51);
        javax.security.auth.Subject subject54 = new javax.security.auth.Subject(false, principalSet47, (java.util.Set<java.security.Principal>) principalSet49, (java.util.Set<java.security.Principal>) principalSet52);
        javax.security.auth.Subject subject56 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet57 = subject56.getPrincipals();
        java.security.Principal[] principalArray58 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet59 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet59, principalArray58);
        java.security.Principal[] principalArray61 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet62 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet62, principalArray61);
        javax.security.auth.Subject subject64 = new javax.security.auth.Subject(false, principalSet57, (java.util.Set<java.security.Principal>) principalSet59, (java.util.Set<java.security.Principal>) principalSet62);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet67 = subject66.getPrincipals();
        java.security.Principal[] principalArray68 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet69 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet69, principalArray68);
        java.security.Principal[] principalArray71 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet72 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet72, principalArray71);
        javax.security.auth.Subject subject74 = new javax.security.auth.Subject(false, principalSet67, (java.util.Set<java.security.Principal>) principalSet69, (java.util.Set<java.security.Principal>) principalSet72);
        javax.security.auth.Subject subject75 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet49, (java.util.Set<java.security.Principal>) principalSet59, principalSet67);
        javax.security.auth.Subject subject76 = new javax.security.auth.Subject(false, principalSet41, principalSet43, principalSet67);
        javax.security.auth.Subject subject78 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet79 = subject78.getPrincipals();
        java.security.Principal[] principalArray80 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet81 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet81, principalArray80);
        java.security.Principal[] principalArray83 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet84 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet84, principalArray83);
        javax.security.auth.Subject subject86 = new javax.security.auth.Subject(false, principalSet79, (java.util.Set<java.security.Principal>) principalSet81, (java.util.Set<java.security.Principal>) principalSet84);
        javax.security.auth.Subject subject87 = new javax.security.auth.Subject(false, principalSet3, principalSet41, principalSet79);
        java.util.Set<java.security.Principal> principalSet88 = subject87.getPrincipals();
        java.util.Set<java.security.Principal> principalSet89 = subject87.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost91 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        java.lang.String str92 = cassandraHost91.getIp();
        cassandraHost91.setMaxWaitTimeWhenExhausted((long) 0);
        cassandraHost91.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean97 = cassandraHost91.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient99 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject87, cassandraHost91, "99(0.0.0.99):-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient99.equals(null)", !hKerberosThriftClient99.equals(null));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean9 = cassandraHost6.equals((java.lang.Object) (short) 100);
        int int10 = cassandraHost6.getCassandraThriftSocketTimeout();
        boolean boolean11 = subject0.equals((java.lang.Object) cassandraHost6);
        boolean boolean12 = subject0.isReadOnly();
        java.util.Set<java.security.Principal> principalSet13 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet14 = subject0.getPublicCredentials();
        java.lang.String str15 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("101");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost17, "101(0.0.0.101)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
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
        javax.security.auth.Subject subject40 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet41 = subject40.getPrincipals();
        javax.security.auth.Subject subject42 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet43 = subject42.getPrincipals();
        javax.security.auth.Subject subject46 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet47 = subject46.getPrincipals();
        java.security.Principal[] principalArray48 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet49 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet49, principalArray48);
        java.security.Principal[] principalArray51 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet52 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet52, principalArray51);
        javax.security.auth.Subject subject54 = new javax.security.auth.Subject(false, principalSet47, (java.util.Set<java.security.Principal>) principalSet49, (java.util.Set<java.security.Principal>) principalSet52);
        javax.security.auth.Subject subject56 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet57 = subject56.getPrincipals();
        java.security.Principal[] principalArray58 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet59 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet59, principalArray58);
        java.security.Principal[] principalArray61 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet62 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet62, principalArray61);
        javax.security.auth.Subject subject64 = new javax.security.auth.Subject(false, principalSet57, (java.util.Set<java.security.Principal>) principalSet59, (java.util.Set<java.security.Principal>) principalSet62);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet67 = subject66.getPrincipals();
        java.security.Principal[] principalArray68 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet69 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet69, principalArray68);
        java.security.Principal[] principalArray71 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet72 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet72, principalArray71);
        javax.security.auth.Subject subject74 = new javax.security.auth.Subject(false, principalSet67, (java.util.Set<java.security.Principal>) principalSet69, (java.util.Set<java.security.Principal>) principalSet72);
        javax.security.auth.Subject subject75 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet49, (java.util.Set<java.security.Principal>) principalSet59, principalSet67);
        javax.security.auth.Subject subject76 = new javax.security.auth.Subject(false, principalSet41, principalSet43, principalSet67);
        javax.security.auth.Subject subject78 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet79 = subject78.getPrincipals();
        java.security.Principal[] principalArray80 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet81 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet81, principalArray80);
        java.security.Principal[] principalArray83 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet84 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet84, principalArray83);
        javax.security.auth.Subject subject86 = new javax.security.auth.Subject(false, principalSet79, (java.util.Set<java.security.Principal>) principalSet81, (java.util.Set<java.security.Principal>) principalSet84);
        javax.security.auth.Subject subject87 = new javax.security.auth.Subject(false, principalSet3, principalSet41, principalSet79);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost89 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):9160");
        boolean boolean90 = cassandraHost89.getUseSocketKeepalive();
        cassandraHost89.setMaxActive(2147483647);
        java.lang.String str93 = cassandraHost89.getName();
        boolean boolean94 = cassandraHost89.getUseSocketKeepalive();
        boolean boolean95 = cassandraHost89.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient97 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject87, cassandraHost89, "(127.0.0.1)((127.0.0.1)):-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient97.equals(null)", !hKerberosThriftClient97.equals(null));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        boolean boolean2 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("97", 0);
        java.lang.String str7 = cassandraHost6.getHost();
        int int8 = cassandraHost6.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, ":9160((:9160():109");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        java.security.Principal[] principalArray3 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet4 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet4, principalArray3);
        java.security.Principal[] principalArray6 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet7 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet7, principalArray6);
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject(false, principalSet2, (java.util.Set<java.security.Principal>) principalSet4, (java.util.Set<java.security.Principal>) principalSet7);
        subject9.setReadOnly();
        boolean boolean11 = subject9.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("3", (int) (short) 9160);
        boolean boolean15 = subject9.equals((java.lang.Object) "3");
        java.util.Set<java.lang.Object> objSet16 = subject9.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) 100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject9, cassandraHost19, "hi!(hi!)(hi!(hi!)):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean10 = cassandraHost7.equals((java.lang.Object) (short) 100);
        cassandraHost7.setUseSocketKeepalive(false);
        long long13 = cassandraHost7.getMaxWaitTimeWhenExhausted();
        cassandraHost7.setCassandraThriftSocketTimeout((int) (short) 35);
        java.lang.String str16 = cassandraHost7.getIp();
        boolean boolean17 = cassandraHost7.isPerformNameResolution();
        cassandraHost7.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "9692");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong16 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean17 = cassandraHost14.equals((java.lang.Object) (short) 100);
        long long18 = cassandraHost14.getMaxWaitTimeWhenExhausted();
        boolean boolean19 = cassandraHost14.getUseThriftFramedTransport();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost22 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 10);
        boolean boolean23 = cassandraHost14.equals((java.lang.Object) cassandraHost22);
        cassandraHost22.setMaxWaitTimeWhenExhausted((long) (byte) 100);
        cassandraHost22.setMaxWaitTimeWhenExhausted((long) (short) 35);
        int int28 = cassandraHost22.getMaxFrameSize();
        cassandraHost22.setMaxWaitTimeWhenExhausted((long) (byte) -1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient32 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost22, "Subject(Subject):34");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient32.equals(null)", !hKerberosThriftClient32.equals(null));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.lang.String str8 = subject0.toString();
        boolean boolean9 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet11 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet12 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        boolean boolean17 = cassandraHost16.getUseSocketKeepalive();
        cassandraHost16.setUseSocketKeepalive(true);
        cassandraHost16.setMaxActive(2147483647);
        cassandraHost16.setLifo(false);
        cassandraHost16.setLifo(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost16, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):34");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", 101);
        boolean boolean8 = subject0.equals((java.lang.Object) cassandraHost7);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.99", 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient13 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "91(0.0.0.91)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient13.equals(null)", !hKerberosThriftClient13.equals(null));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        java.security.Principal[] principalArray1 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet2 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet2, principalArray1);
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
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet2, principalSet5, (java.util.Set<java.security.Principal>) principalSet21);
        java.util.Set<java.security.Principal> principalSet39 = subject38.getPrincipals();
        java.util.Set<java.lang.Object> objSet40 = subject38.getPublicCredentials();
        subject38.setReadOnly();
        subject38.setReadOnly();
        java.util.Set<java.security.Principal> principalSet43 = subject38.getPrincipals();
        boolean boolean44 = subject38.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost46 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):0");
        int int47 = cassandraHost46.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient49 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject38, cassandraHost46, ":52");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient49.equals(null)", !hKerberosThriftClient49.equals(null));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet3 = subject2.getPrincipals();
        java.security.Principal[] principalArray4 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet5 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet5, principalArray4);
        java.security.Principal[] principalArray7 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet8 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet8, principalArray7);
        javax.security.auth.Subject subject10 = new javax.security.auth.Subject(false, principalSet3, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet8);
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
        javax.security.auth.Subject subject33 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet34 = subject33.getPrincipals();
        java.security.Principal[] principalArray35 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet36 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet36, principalArray35);
        java.security.Principal[] principalArray38 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet39 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet39, principalArray38);
        javax.security.auth.Subject subject41 = new javax.security.auth.Subject(false, principalSet34, (java.util.Set<java.security.Principal>) principalSet36, (java.util.Set<java.security.Principal>) principalSet39);
        javax.security.auth.Subject subject42 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet16, (java.util.Set<java.security.Principal>) principalSet26, principalSet34);
        javax.security.auth.Subject subject43 = new javax.security.auth.Subject();
        boolean boolean44 = subject43.isReadOnly();
        java.lang.String str45 = subject43.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong46 = new java.util.concurrent.atomic.AtomicLong();
        double double47 = atomicLong46.doubleValue();
        long long48 = atomicLong46.incrementAndGet();
        boolean boolean49 = subject43.equals((java.lang.Object) long48);
        java.lang.String str50 = subject43.toString();
        java.lang.String str51 = subject43.toString();
        java.util.Set<java.security.Principal> principalSet52 = subject43.getPrincipals();
        javax.security.auth.Subject subject53 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet5, (java.util.Set<java.security.Principal>) principalSet26, principalSet52);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost56 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong58 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean59 = cassandraHost56.equals((java.lang.Object) (short) 100);
        cassandraHost56.setUseSocketKeepalive(false);
        long long62 = cassandraHost56.getMaxWaitTimeWhenExhausted();
        cassandraHost56.setMaxActive((int) '4');
        cassandraHost56.setCassandraThriftSocketTimeout((int) (short) 1);
        boolean boolean67 = cassandraHost56.getUseThriftFramedTransport();
        cassandraHost56.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient71 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject53, cassandraHost56, "1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient71.equals(null)", !hKerberosThriftClient71.equals(null));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:98");
        java.lang.String str2 = cassandraHost1.getIp();
        javax.security.auth.Subject subject3 = new javax.security.auth.Subject();
        boolean boolean4 = subject3.isReadOnly();
        java.lang.String str5 = subject3.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong();
        double double7 = atomicLong6.doubleValue();
        long long8 = atomicLong6.incrementAndGet();
        boolean boolean9 = subject3.equals((java.lang.Object) long8);
        java.lang.String str10 = subject3.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong((long) (short) 1);
        boolean boolean13 = subject3.equals((java.lang.Object) atomicLong12);
        java.util.Set<java.lang.Object> objSet14 = subject3.getPrivateCredentials();
        boolean boolean15 = subject3.isReadOnly();
        java.util.Set<java.security.Principal> principalSet16 = subject3.getPrincipals();
        subject3.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost19.setCassandraThriftSocketTimeout(0);
        java.lang.String str22 = cassandraHost19.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean25 = cassandraHost24.getUseSocketKeepalive();
        boolean boolean26 = cassandraHost19.equals((java.lang.Object) boolean25);
        int int27 = cassandraHost19.getMaxActive();
        boolean boolean28 = cassandraHost19.getUseSocketKeepalive();
        java.lang.String str29 = cassandraHost19.getUrl();
        javax.security.auth.Subject subject30 = new javax.security.auth.Subject();
        boolean boolean31 = subject30.isReadOnly();
        java.lang.String str32 = subject30.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong33 = new java.util.concurrent.atomic.AtomicLong();
        double double34 = atomicLong33.doubleValue();
        long long35 = atomicLong33.incrementAndGet();
        boolean boolean36 = subject30.equals((java.lang.Object) long35);
        java.lang.String str37 = subject30.toString();
        java.lang.String str38 = subject30.toString();
        boolean boolean39 = subject30.isReadOnly();
        boolean boolean40 = cassandraHost19.equals((java.lang.Object) boolean39);
        boolean boolean41 = subject3.equals((java.lang.Object) boolean40);
        java.util.Set<java.security.Principal> principalSet42 = subject3.getPrincipals();
        boolean boolean43 = cassandraHost1.equals((java.lang.Object) subject3);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost46 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 0);
        boolean boolean47 = cassandraHost46.isPerformNameResolution();
        java.lang.String str48 = cassandraHost46.getHost();
        cassandraHost46.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient52 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject3, cassandraHost46, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient52.equals(null)", !hKerberosThriftClient52.equals(null));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
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
        javax.security.auth.Subject subject40 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet41 = subject40.getPrincipals();
        javax.security.auth.Subject subject42 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet43 = subject42.getPrincipals();
        javax.security.auth.Subject subject46 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet47 = subject46.getPrincipals();
        java.security.Principal[] principalArray48 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet49 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet49, principalArray48);
        java.security.Principal[] principalArray51 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet52 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet52, principalArray51);
        javax.security.auth.Subject subject54 = new javax.security.auth.Subject(false, principalSet47, (java.util.Set<java.security.Principal>) principalSet49, (java.util.Set<java.security.Principal>) principalSet52);
        javax.security.auth.Subject subject56 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet57 = subject56.getPrincipals();
        java.security.Principal[] principalArray58 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet59 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet59, principalArray58);
        java.security.Principal[] principalArray61 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet62 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet62, principalArray61);
        javax.security.auth.Subject subject64 = new javax.security.auth.Subject(false, principalSet57, (java.util.Set<java.security.Principal>) principalSet59, (java.util.Set<java.security.Principal>) principalSet62);
        javax.security.auth.Subject subject66 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet67 = subject66.getPrincipals();
        java.security.Principal[] principalArray68 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet69 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet69, principalArray68);
        java.security.Principal[] principalArray71 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet72 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet72, principalArray71);
        javax.security.auth.Subject subject74 = new javax.security.auth.Subject(false, principalSet67, (java.util.Set<java.security.Principal>) principalSet69, (java.util.Set<java.security.Principal>) principalSet72);
        javax.security.auth.Subject subject75 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet49, (java.util.Set<java.security.Principal>) principalSet59, principalSet67);
        javax.security.auth.Subject subject76 = new javax.security.auth.Subject(false, principalSet41, principalSet43, principalSet67);
        javax.security.auth.Subject subject78 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet79 = subject78.getPrincipals();
        java.security.Principal[] principalArray80 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet81 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet81, principalArray80);
        java.security.Principal[] principalArray83 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet84 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet84, principalArray83);
        javax.security.auth.Subject subject86 = new javax.security.auth.Subject(false, principalSet79, (java.util.Set<java.security.Principal>) principalSet81, (java.util.Set<java.security.Principal>) principalSet84);
        javax.security.auth.Subject subject87 = new javax.security.auth.Subject(false, principalSet3, principalSet41, principalSet79);
        subject87.setReadOnly();
        java.util.Set<java.security.Principal> principalSet89 = subject87.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost92 = new me.prettyprint.cassandra.service.CassandraHost(":9160:100", (int) (short) 1);
        boolean boolean93 = cassandraHost92.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient95 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject87, cassandraHost92, ":97:10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient95.equals(null)", !hKerberosThriftClient95.equals(null));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet1 = subject0.getPrincipals();
        boolean boolean2 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("9492", (int) (short) 9161);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        int int9 = cassandraHost7.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, ":9160(:9160):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        java.security.Principal[] principalArray3 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet4 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet4, principalArray3);
        java.security.Principal[] principalArray6 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet7 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet7, principalArray6);
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject(false, principalSet2, (java.util.Set<java.security.Principal>) principalSet4, (java.util.Set<java.security.Principal>) principalSet7);
        java.util.Set<java.lang.Object> objSet10 = subject9.getPublicCredentials();
        boolean boolean11 = subject9.isReadOnly();
        boolean boolean12 = subject9.isReadOnly();
        java.util.Set<java.security.Principal> principalSet13 = subject9.getPrincipals();
        java.util.Set<java.lang.Object> objSet14 = subject9.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet15 = subject9.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):9160", 103);
        cassandraHost18.setMaxFrameSize((int) '4');
        int int21 = cassandraHost18.getMaxActive();
        int int22 = cassandraHost18.getCassandraThriftSocketTimeout();
        boolean boolean23 = cassandraHost18.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject9, cassandraHost18, "(127.0.0.1):52");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        subject0.setReadOnly();
        subject0.setReadOnly();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.security.Principal> principalSet6 = subject0.getPrincipals();
        boolean boolean7 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet9 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("Subject(Subject):105", (int) (short) 99);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "hi!(hi!):101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
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
        boolean boolean38 = subject31.isReadOnly();
        java.lang.String str39 = subject31.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost42 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (short) 152);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient44 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject31, cassandraHost42, ":9160(:9160):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient44.equals(null)", !hKerberosThriftClient44.equals(null));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet8 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet10 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean16 = cassandraHost13.equals((java.lang.Object) (short) 100);
        long long17 = cassandraHost13.getMaxWaitTimeWhenExhausted();
        boolean boolean18 = cassandraHost13.getUseThriftFramedTransport();
        cassandraHost13.setMaxWaitTimeWhenExhausted((long) 50);
        cassandraHost13.setUseSocketKeepalive(false);
        int int23 = cassandraHost13.getCassandraThriftSocketTimeout();
        int int24 = cassandraHost13.getCassandraThriftSocketTimeout();
        cassandraHost13.setCassandraThriftSocketTimeout(0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient28 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "9693(0.0.37.221)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient28.equals(null)", !hKerberosThriftClient28.equals(null));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        subject0.setReadOnly();
        subject0.setReadOnly();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):-1", (int) (byte) 88);
        int int12 = cassandraHost11.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "99(0.0.0.99)(99(0.0.0.99))(99(0.0.0.99)(99(0.0.0.99))):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject();
        boolean boolean10 = subject9.isReadOnly();
        java.lang.String str11 = subject9.toString();
        java.util.Set<java.security.Principal> principalSet12 = subject9.getPrincipals();
        java.util.Set<java.lang.Object> objSet13 = subject9.getPublicCredentials();
        boolean boolean14 = subject0.equals((java.lang.Object) objSet13);
        java.lang.String str15 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost17.setCassandraThriftSocketTimeout(0);
        cassandraHost17.setUseSocketKeepalive(false);
        java.lang.String str22 = cassandraHost17.getIp();
        java.lang.String str23 = cassandraHost17.getUrl();
        cassandraHost17.setMaxFrameSize(10);
        java.lang.String str26 = cassandraHost17.toString();
        long long27 = cassandraHost17.getMaxWaitTimeWhenExhausted();
        cassandraHost17.setMaxActive((int) (short) 65);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost17, "Subject(Subject)(Subject(Subject)):34");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
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
        java.lang.String str37 = subject31.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost40 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):12", 31);
        boolean boolean41 = subject31.equals((java.lang.Object) cassandraHost40);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost44 = new me.prettyprint.cassandra.service.CassandraHost("91", (int) (byte) 1);
        cassandraHost44.setCassandraThriftSocketTimeout((int) (short) -1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient48 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject31, cassandraHost44, "127.0.0.1(127.0.0.1):3");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient48.equals(null)", !hKerberosThriftClient48.equals(null));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        java.security.Principal[] principalArray3 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet4 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet4, principalArray3);
        java.security.Principal[] principalArray6 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet7 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet7, principalArray6);
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject(false, principalSet2, (java.util.Set<java.security.Principal>) principalSet4, (java.util.Set<java.security.Principal>) principalSet7);
        java.util.Set<java.lang.Object> objSet10 = subject9.getPublicCredentials();
        boolean boolean11 = subject9.isReadOnly();
        boolean boolean12 = subject9.isReadOnly();
        java.util.Set<java.security.Principal> principalSet13 = subject9.getPrincipals();
        subject9.setReadOnly();
        java.util.Set<java.lang.Object> objSet15 = subject9.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("Subject");
        long long18 = cassandraHost17.getMaxWaitTimeWhenExhausted();
        java.lang.String str19 = cassandraHost17.getHost();
        boolean boolean20 = cassandraHost17.getUseThriftFramedTransport();
        int int21 = cassandraHost17.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject9, cassandraHost17, "0(0.0.0.0):50");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
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
        boolean boolean36 = subject31.isReadOnly();
        java.util.Set<java.security.Principal> principalSet37 = subject31.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost40 = new me.prettyprint.cassandra.service.CassandraHost("103", 63);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject31, cassandraHost40, "127.0.0.1(127.0.0.1):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        java.lang.String str7 = subject0.toString();
        java.util.Set<java.lang.Object> objSet8 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet9 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet10 = subject0.getPrivateCredentials();
        java.lang.String str11 = subject0.toString();
        java.util.Set<java.lang.Object> objSet12 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):34");
        boolean boolean15 = cassandraHost14.getLifo();
        cassandraHost14.setMaxWaitTimeWhenExhausted(346L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost14, ":1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean7 = cassandraHost6.getUseSocketKeepalive();
        int int8 = cassandraHost6.getCassandraThriftSocketTimeout();
        java.lang.String str9 = cassandraHost6.getName();
        int int10 = cassandraHost6.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "103(0.0.0.103)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet1 = subject0.getPrincipals();
        boolean boolean2 = subject0.isReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.lang.String str7 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean10 = cassandraHost9.isPerformNameResolution();
        long long11 = cassandraHost9.getMaxWaitTimeWhenExhausted();
        cassandraHost9.setCassandraThriftSocketTimeout((int) (byte) 102);
        boolean boolean14 = cassandraHost9.getUseSocketKeepalive();
        java.lang.String str15 = cassandraHost9.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "10402");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1)", (int) (byte) 50);
        java.lang.String str3 = cassandraHost2.toString();
        java.security.Principal[] principalArray5 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet6 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet6, principalArray5);
        javax.security.auth.Subject subject8 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet9 = subject8.getPrincipals();
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
        javax.security.auth.Subject subject42 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet6, principalSet9, (java.util.Set<java.security.Principal>) principalSet25);
        java.util.Set<java.security.Principal> principalSet43 = subject42.getPrincipals();
        java.util.Set<java.lang.Object> objSet44 = subject42.getPublicCredentials();
        subject42.setReadOnly();
        subject42.setReadOnly();
        java.util.Set<java.lang.Object> objSet47 = subject42.getPublicCredentials();
        boolean boolean48 = cassandraHost2.equals((java.lang.Object) subject42);
        java.util.Set<java.security.Principal> principalSet49 = subject42.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost52 = new me.prettyprint.cassandra.service.CassandraHost(":9160:1", (int) (byte) 52);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient54 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject42, cassandraHost52, "9693(0.0.37.221):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient54.equals(null)", !hKerberosThriftClient54.equals(null));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        java.security.Principal[] principalArray1 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet2 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet2, principalArray1);
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
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet2, principalSet5, (java.util.Set<java.security.Principal>) principalSet21);
        java.util.Set<java.security.Principal> principalSet39 = subject38.getPrincipals();
        java.util.Set<java.lang.Object> objSet40 = subject38.getPublicCredentials();
        subject38.setReadOnly();
        subject38.setReadOnly();
        java.lang.String str43 = subject38.toString();
        boolean boolean44 = subject38.isReadOnly();
        java.util.Set<java.lang.Object> objSet45 = subject38.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost48 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        boolean boolean49 = cassandraHost48.getUseSocketKeepalive();
        boolean boolean50 = cassandraHost48.isPerformNameResolution();
        long long51 = cassandraHost48.getMaxWaitTimeWhenExhausted();
        cassandraHost48.setUseThriftFramedTransport(false);
        boolean boolean54 = cassandraHost48.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient56 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject38, cassandraHost48, "12:103");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient56.equals(null)", !hKerberosThriftClient56.equals(null));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean9 = cassandraHost6.equals((java.lang.Object) (short) 100);
        int int10 = cassandraHost6.getCassandraThriftSocketTimeout();
        boolean boolean11 = subject0.equals((java.lang.Object) cassandraHost6);
        boolean boolean12 = subject0.isReadOnly();
        java.util.Set<java.security.Principal> principalSet13 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet14 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("91", (int) (byte) 1);
        int int18 = cassandraHost17.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost17, "0.0.0.101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        javax.security.auth.Subject subject3 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet4 = subject3.getPrincipals();
        javax.security.auth.Subject subject7 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet8 = subject7.getPrincipals();
        java.security.Principal[] principalArray9 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet10 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet10, principalArray9);
        java.security.Principal[] principalArray12 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet13 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet13, principalArray12);
        javax.security.auth.Subject subject15 = new javax.security.auth.Subject(false, principalSet8, (java.util.Set<java.security.Principal>) principalSet10, (java.util.Set<java.security.Principal>) principalSet13);
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
        javax.security.auth.Subject subject36 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet10, (java.util.Set<java.security.Principal>) principalSet20, principalSet28);
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject(false, principalSet2, principalSet4, principalSet28);
        boolean boolean38 = subject37.isReadOnly();
        java.util.Set<java.lang.Object> objSet39 = subject37.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost42 = new me.prettyprint.cassandra.service.CassandraHost("9492", 102);
        boolean boolean43 = cassandraHost42.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient45 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject37, cassandraHost42, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient45.equals(null)", !hKerberosThriftClient45.equals(null));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.lang.String str2 = subject0.toString();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        boolean boolean8 = subject0.isReadOnly();
        boolean boolean9 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        boolean boolean13 = cassandraHost12.getUseSocketKeepalive();
        cassandraHost12.setUseSocketKeepalive(true);
        cassandraHost12.setMaxActive(2147483647);
        cassandraHost12.setLifo(false);
        java.lang.String str20 = cassandraHost12.toString();
        cassandraHost12.setLifo(true);
        java.lang.String str23 = cassandraHost12.getName();
        java.lang.String str24 = cassandraHost12.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, ":97(:97):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        javax.security.auth.Subject subject3 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet4 = subject3.getPrincipals();
        javax.security.auth.Subject subject7 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet8 = subject7.getPrincipals();
        java.security.Principal[] principalArray9 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet10 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet10, principalArray9);
        java.security.Principal[] principalArray12 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet13 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet13, principalArray12);
        javax.security.auth.Subject subject15 = new javax.security.auth.Subject(false, principalSet8, (java.util.Set<java.security.Principal>) principalSet10, (java.util.Set<java.security.Principal>) principalSet13);
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
        javax.security.auth.Subject subject36 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet10, (java.util.Set<java.security.Principal>) principalSet20, principalSet28);
        javax.security.auth.Subject subject37 = new javax.security.auth.Subject(false, principalSet2, principalSet4, principalSet28);
        java.util.Set<java.lang.Object> objSet38 = subject37.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost40 = new me.prettyprint.cassandra.service.CassandraHost("101(0.0.0.101):9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject37, cassandraHost40, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
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
        java.lang.String str32 = subject31.toString();
        java.util.Set<java.lang.Object> objSet33 = subject31.getPublicCredentials();
        java.lang.String str34 = subject31.toString();
        subject31.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost37 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost37.setCassandraThriftSocketTimeout(0);
        cassandraHost37.setUseSocketKeepalive(false);
        java.lang.String str42 = cassandraHost37.getIp();
        java.lang.String str43 = cassandraHost37.getUrl();
        cassandraHost37.setMaxFrameSize(10);
        int int46 = cassandraHost37.getMaxActive();
        cassandraHost37.setMaxActive((int) (byte) 0);
        java.lang.String str49 = cassandraHost37.getUrl();
        java.lang.Class<?> wildcardClass50 = cassandraHost37.getClass();
        boolean boolean51 = subject31.equals((java.lang.Object) cassandraHost37);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost54 = new me.prettyprint.cassandra.service.CassandraHost("97", 10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient56 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject31, cassandraHost54, "10154");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient56.equals(null)", !hKerberosThriftClient56.equals(null));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        java.security.Principal[] principalArray1 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet2 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet2, principalArray1);
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
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet2, principalSet5, (java.util.Set<java.security.Principal>) principalSet21);
        boolean boolean39 = subject38.isReadOnly();
        java.lang.String str40 = subject38.toString();
        boolean boolean42 = subject38.equals((java.lang.Object) 103.0f);
        java.lang.String str43 = subject38.toString();
        boolean boolean44 = subject38.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost46 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost46.setCassandraThriftSocketTimeout(0);
        cassandraHost46.setUseSocketKeepalive(false);
        java.lang.String str51 = cassandraHost46.getIp();
        java.lang.String str52 = cassandraHost46.getUrl();
        cassandraHost46.setMaxFrameSize(10);
        java.lang.String str55 = cassandraHost46.toString();
        long long56 = cassandraHost46.getMaxWaitTimeWhenExhausted();
        int int57 = cassandraHost46.getPort();
        cassandraHost46.setCassandraThriftSocketTimeout((int) (short) 9160);
        int int60 = cassandraHost46.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient62 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject38, cassandraHost46, ":9160((:9160():98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient62.equals(null)", !hKerberosThriftClient62.equals(null));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.lang.String str2 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):32");
        int int6 = cassandraHost5.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "hi!(hi!)(hi!(hi!)):99");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1:10", 2147483647);
        java.lang.String str8 = cassandraHost7.getIp();
        cassandraHost7.setUseThriftFramedTransport(true);
        boolean boolean11 = subject0.equals((java.lang.Object) true);
        java.util.Set<java.lang.Object> objSet12 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost14.setCassandraThriftSocketTimeout(0);
        java.lang.String str17 = cassandraHost14.getUrl();
        long long18 = cassandraHost14.getMaxWaitTimeWhenExhausted();
        cassandraHost14.setMaxFrameSize((int) (short) 100);
        int int21 = cassandraHost14.getMaxActive();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str25 = cassandraHost24.getHost();
        cassandraHost24.setMaxWaitTimeWhenExhausted((long) (byte) 50);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost30 = new me.prettyprint.cassandra.service.CassandraHost("99", (int) ' ');
        boolean boolean31 = cassandraHost24.equals((java.lang.Object) cassandraHost30);
        long long32 = cassandraHost24.getMaxWaitTimeWhenExhausted();
        boolean boolean33 = cassandraHost14.equals((java.lang.Object) cassandraHost24);
        cassandraHost24.setLifo(true);
        java.lang.String str36 = cassandraHost24.getName();
        boolean boolean37 = cassandraHost24.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, "32(0.0.0.32):2");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet1 = subject0.getPrincipals();
        boolean boolean2 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("99", (int) '#');
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "9159");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        java.security.Principal[] principalArray3 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet4 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet4, principalArray3);
        java.security.Principal[] principalArray6 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet7 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet7, principalArray6);
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject(false, principalSet2, (java.util.Set<java.security.Principal>) principalSet4, (java.util.Set<java.security.Principal>) principalSet7);
        subject9.setReadOnly();
        java.lang.String str11 = subject9.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost13.setCassandraThriftSocketTimeout(0);
        java.lang.String str16 = cassandraHost13.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean19 = cassandraHost18.getUseSocketKeepalive();
        boolean boolean20 = cassandraHost13.equals((java.lang.Object) boolean19);
        int int21 = cassandraHost13.getMaxActive();
        boolean boolean22 = cassandraHost13.isPerformNameResolution();
        java.lang.String str23 = cassandraHost13.getName();
        java.lang.String str24 = cassandraHost13.getHost();
        java.lang.String str25 = cassandraHost13.getHost();
        long long26 = cassandraHost13.getMaxWaitTimeWhenExhausted();
        int int27 = cassandraHost13.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject9, cassandraHost13, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100", 0);
        int int17 = cassandraHost16.getPort();
        boolean boolean18 = cassandraHost16.isPerformNameResolution();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        int int21 = cassandraHost20.getMaxActive();
        java.lang.String str22 = cassandraHost20.toString();
        cassandraHost20.setMaxActive((int) (short) 101);
        cassandraHost20.setUseThriftFramedTransport(true);
        boolean boolean27 = cassandraHost16.equals((java.lang.Object) cassandraHost20);
        boolean boolean28 = cassandraHost16.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost16, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        java.security.Principal[] principalArray3 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet4 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet4, principalArray3);
        java.security.Principal[] principalArray6 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet7 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet7, principalArray6);
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject(false, principalSet2, (java.util.Set<java.security.Principal>) principalSet4, (java.util.Set<java.security.Principal>) principalSet7);
        subject9.setReadOnly();
        java.util.Set<java.lang.Object> objSet11 = subject9.getPrivateCredentials();
        subject9.setReadOnly();
        java.lang.String str13 = subject9.toString();
        java.util.Set<java.lang.Object> objSet14 = subject9.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) 'a');
        boolean boolean18 = cassandraHost17.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject9, cassandraHost17, ":9160:100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.lang.String str2 = subject0.toString();
        boolean boolean3 = subject0.isReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost(":97(:97):100", 3);
        boolean boolean8 = cassandraHost7.getUseSocketKeepalive();
        java.lang.String str9 = cassandraHost7.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        boolean boolean2 = subject0.isReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 1);
        cassandraHost6.setUseThriftFramedTransport(false);
        java.lang.String str9 = cassandraHost6.getName();
        java.lang.String str10 = cassandraHost6.getUrl();
        boolean boolean11 = subject0.equals((java.lang.Object) str10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong16 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean17 = cassandraHost14.equals((java.lang.Object) (short) 100);
        long long18 = cassandraHost14.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost14, "52:32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        java.security.Principal[] principalArray1 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet2 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet2, principalArray1);
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
        javax.security.auth.Subject subject38 = new javax.security.auth.Subject(false, (java.util.Set<java.security.Principal>) principalSet2, principalSet5, (java.util.Set<java.security.Principal>) principalSet21);
        boolean boolean39 = subject38.isReadOnly();
        java.lang.String str40 = subject38.toString();
        boolean boolean42 = subject38.equals((java.lang.Object) 103.0f);
        java.lang.String str43 = subject38.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost46 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong48 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
        boolean boolean49 = cassandraHost46.equals((java.lang.Object) (short) 100);
        boolean boolean50 = cassandraHost46.getUseThriftFramedTransport();
        cassandraHost46.setLifo(true);
        cassandraHost46.setMaxActive((int) (short) 1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient56 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject38, cassandraHost46, "0.0.0.99(0.0.0.99)(0.0.0.99(0.0.0.99))");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient56.equals(null)", !hKerberosThriftClient56.equals(null));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        javax.security.auth.Subject subject1 = new javax.security.auth.Subject();
        java.util.Set<java.security.Principal> principalSet2 = subject1.getPrincipals();
        java.security.Principal[] principalArray3 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet4 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet4, principalArray3);
        java.security.Principal[] principalArray6 = new java.security.Principal[] {};
        java.util.LinkedHashSet<java.security.Principal> principalSet7 = new java.util.LinkedHashSet<java.security.Principal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.security.Principal>) principalSet7, principalArray6);
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject(false, principalSet2, (java.util.Set<java.security.Principal>) principalSet4, (java.util.Set<java.security.Principal>) principalSet7);
        subject9.setReadOnly();
        boolean boolean11 = subject9.isReadOnly();
        java.util.Set<java.security.Principal> principalSet12 = subject9.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost(":9160:100", (int) (short) 1);
        boolean boolean16 = cassandraHost15.getUseThriftFramedTransport();
        int int17 = cassandraHost15.getCassandraThriftSocketTimeout();
        cassandraHost15.setMaxWaitTimeWhenExhausted((long) (short) 12);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject9, cassandraHost15, "(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.lang.String str2 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        double double4 = atomicLong3.doubleValue();
        long long5 = atomicLong3.incrementAndGet();
        boolean boolean6 = subject0.equals((java.lang.Object) long5);
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        boolean boolean9 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost11.setCassandraThriftSocketTimeout(0);
        java.lang.String str14 = cassandraHost11.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        boolean boolean17 = cassandraHost16.getUseSocketKeepalive();
        boolean boolean18 = cassandraHost11.equals((java.lang.Object) boolean17);
        int int19 = cassandraHost11.getMaxActive();
        boolean boolean20 = cassandraHost11.getUseSocketKeepalive();
        java.lang.String str21 = cassandraHost11.getUrl();
        javax.security.auth.Subject subject22 = new javax.security.auth.Subject();
        boolean boolean23 = subject22.isReadOnly();
        java.lang.String str24 = subject22.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong();
        double double26 = atomicLong25.doubleValue();
        long long27 = atomicLong25.incrementAndGet();
        boolean boolean28 = subject22.equals((java.lang.Object) long27);
        java.lang.String str29 = subject22.toString();
        java.lang.String str30 = subject22.toString();
        boolean boolean31 = subject22.isReadOnly();
        boolean boolean32 = cassandraHost11.equals((java.lang.Object) boolean31);
        boolean boolean33 = cassandraHost11.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient35 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "9381(0.0.36.165)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient35.equals(null)", !hKerberosThriftClient35.equals(null));
    }
}

