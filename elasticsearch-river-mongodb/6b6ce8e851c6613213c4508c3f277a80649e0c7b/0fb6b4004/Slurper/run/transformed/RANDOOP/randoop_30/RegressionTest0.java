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
        com.mongodb.ServerAddress[] serverAddressArray0 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList1 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList1, serverAddressArray0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext4 = null;
        org.elasticsearch.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper6 = new org.elasticsearch.river.mongodb.Slurper((java.util.List<com.mongodb.ServerAddress>) serverAddressList1, mongoDBRiverDefinition3, sharedContext4, client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverAddressArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException1 = slurper0.new SlurperException();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.elasticsearch.common.logging.ESLogger eSLogger0 = org.elasticsearch.river.mongodb.Slurper.logger;
        java.lang.Class<?> wildcardClass1 = eSLogger0.getClass();
        org.junit.Assert.assertNotNull(eSLogger0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        long long0 = org.elasticsearch.river.mongodb.Slurper.SlurperException.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        java.util.List<com.mongodb.ServerAddress> serverAddressList0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext2 = null;
        org.elasticsearch.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper4 = new org.elasticsearch.river.mongodb.Slurper(serverAddressList0, mongoDBRiverDefinition1, sharedContext2, client3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

