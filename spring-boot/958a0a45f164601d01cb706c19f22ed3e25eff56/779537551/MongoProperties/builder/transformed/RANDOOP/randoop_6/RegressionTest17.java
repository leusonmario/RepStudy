import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8501");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.getDatabase();
        char[] charArray10 = mongoProperties0.password;
        java.lang.String str11 = mongoProperties0.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass13 = mongoProperties12.fieldNamingStrategy;
        mongoProperties12.host = "hi!";
        java.lang.Class<?> wildcardClass16 = mongoProperties12.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass17 = mongoProperties12.getFieldNamingStrategy();
        char[] charArray20 = new char[] { '#', 'a' };
        mongoProperties12.password = charArray20;
        mongoProperties12.authenticationDatabase = "";
        mongoProperties12.setPort((java.lang.Integer) 5000);
        java.lang.String str26 = mongoProperties12.database;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass28 = mongoProperties27.fieldNamingStrategy;
        java.lang.String str29 = mongoProperties27.username;
        java.lang.String str30 = mongoProperties27.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass32 = mongoProperties31.fieldNamingStrategy;
        java.lang.String str33 = mongoProperties31.getAuthenticationDatabase();
        boolean boolean34 = mongoProperties31.hasCustomCredentials();
        boolean boolean35 = mongoProperties31.hasCustomAddress();
        java.lang.String str36 = mongoProperties31.uri;
        mongoProperties31.setDatabase("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass40 = mongoProperties39.fieldNamingStrategy;
        java.lang.String str41 = mongoProperties39.getAuthenticationDatabase();
        char[] charArray42 = mongoProperties39.getPassword();
        mongoProperties39.host = "hi!";
        mongoProperties39.setUsername("hi!");
        char[] charArray48 = new char[] { '4' };
        mongoProperties39.password = charArray48;
        mongoProperties31.setPassword(charArray48);
        mongoProperties27.setPassword(charArray48);
        mongoProperties12.setPassword(charArray48);
        mongoProperties0.setPassword(charArray48);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, a]");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "mongodb://localhost/test" + "'", str36, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(charArray42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4]");
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.username;
        java.lang.String str3 = mongoProperties0.uri;
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        java.lang.String str5 = mongoProperties0.getMongoClientDatabase();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        char[] charArray7 = mongoProperties0.password;
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass10 = mongoProperties9.fieldNamingStrategy;
        java.lang.String str11 = mongoProperties9.getAuthenticationDatabase();
        boolean boolean12 = mongoProperties9.hasCustomCredentials();
        int int13 = mongoProperties9.getDEFAULT_PORT();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        int int22 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.description("");
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.autoConnectRetry(false);
        boolean boolean30 = mongoClientOptions21.equals((java.lang.Object) false);
        int int31 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties9.builder(mongoClientOptions21);
        int int33 = mongoClientOptions21.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory34 = mongoClientOptions21.getDbDecoderFactory();
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties0.createMongoClient(mongoClientOptions21, environment35);
        int int37 = mongoClientOptions21.getMaxConnectionIdleTime();
        javax.net.SocketFactory socketFactory38 = mongoClientOptions21.getSocketFactory();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb://localhost/test" + "'", str3, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 500 + "'", int33 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(socketFactory38);
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str9 = mongoProperties0.database;
        java.lang.String str10 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.acceptableLatencyDifference((int) ' ');
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass17;
        java.lang.String str19 = mongoProperties0.uri;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory17 = mongoClientOptions14.getSocketFactory();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions14, environment18);
        java.lang.String str20 = mongoProperties0.uri;
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        boolean boolean29 = mongoClientOptions28.isSocketKeepAlive();
        boolean boolean30 = mongoClientOptions28.isSocketKeepAlive();
        org.springframework.core.env.Environment environment31 = null;
        com.mongodb.MongoClient mongoClient32 = mongoProperties0.createMongoClient(mongoClientOptions28, environment31);
        java.lang.Integer int33 = mongoProperties0.getPort();
        java.lang.String str34 = mongoProperties0.getUsername();
        int int35 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.uri = "";
        java.lang.String str38 = mongoProperties0.host;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mongoClient32);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 27017 + "'", int35 == 27017);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }
}

