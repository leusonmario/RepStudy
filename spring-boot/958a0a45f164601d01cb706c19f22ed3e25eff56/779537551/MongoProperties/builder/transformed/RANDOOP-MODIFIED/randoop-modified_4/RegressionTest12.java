import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        java.lang.Class<?> wildcardClass26 = mongoProperties0.fieldNamingStrategy;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str28 = mongoProperties27.host;
        java.lang.String str29 = mongoProperties27.host;
        java.lang.String str30 = mongoProperties27.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str32 = mongoProperties31.host;
        mongoProperties31.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass35 = mongoProperties31.fieldNamingStrategy;
        java.lang.String str36 = mongoProperties31.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.getUri();
        char[] charArray39 = new char[] {};
        mongoProperties37.setPassword(charArray39);
        mongoProperties31.setPassword(charArray39);
        mongoProperties27.setPassword(charArray39);
        mongoProperties0.password = charArray39;
        java.lang.String str44 = mongoProperties0.getUri();
        mongoProperties0.setGridFsDatabase("-804206260");
        java.lang.String str47 = mongoProperties0.database;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "mongodb://localhost/test" + "'", str44, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.database = "27017";
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        mongoProperties0.port = 1000;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        java.lang.String str1 = java.lang.Integer.toHexString(416);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1a0" + "'", str1, "1a0");
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("12", (-2146433021));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2146433021 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder27 = builder9.socketFactory(socketFactory26);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        int int32 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int33 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int34 = mongoClientOptions31.getLocalThreshold();
        int int35 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str36 = mongoClientOptions31.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions31.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder27.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.description("22");
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.heartbeatSocketTimeout(103872);
        com.mongodb.MongoClientOptions.Builder builder43 = builder42.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.connectionsPerHost(10010000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties0.getHost();
        boolean boolean13 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setDatabase("-2147483648");
        mongoProperties0.gridFsDatabase = "111";
        java.lang.String str18 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int19 = mongoProperties0.port;
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        mongoProperties0.setPort((java.lang.Integer) 10000);
        java.lang.String str11 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "369098752";
        java.lang.String str14 = mongoProperties0.host;
        java.lang.String str15 = mongoProperties0.getGridFsDatabase();
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str17 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("12000000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "803801" + "'", str15, "803801");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "803801" + "'", str17, "803801");
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.String str8 = mongoProperties0.getHost();
        mongoProperties0.setUri("90");
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (-2147483648));
        int int17 = mongoClientOptions14.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions14.getDbDecoderFactory();
        int int19 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatThreadCount(9485312);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        java.lang.String str2 = java.lang.Integer.toString(1437335554, 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1437335554" + "'", str2, "1437335554");
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.gridFsDatabase = "hi!";
        char[] charArray16 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties9.setPassword(charArray16);
        mongoProperties8.setPassword(charArray16);
        java.lang.String str19 = mongoProperties8.getHost();
        java.lang.String str20 = mongoProperties8.getUsername();
        mongoProperties8.uri = "11610";
        char[] charArray23 = mongoProperties8.password;
        char[] charArray24 = mongoProperties8.password;
        mongoProperties0.setPassword(charArray24);
        java.lang.String str26 = mongoProperties0.host;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("33", 985);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 985 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        mongoProperties6.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass10 = mongoProperties6.fieldNamingStrategy;
        mongoProperties6.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions18);
        int int22 = mongoClientOptions18.getConnectTimeout();
        int int23 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions18);
        java.lang.String str25 = mongoProperties0.database;
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        java.lang.String str30 = mongoClientOptions29.toString();
        int int31 = mongoClientOptions29.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions29);
        boolean boolean33 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.gridFsDatabase = "7fffffff";
        java.lang.String str36 = mongoProperties0.getUri();
        java.lang.String str37 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) (-2147483648));
        mongoProperties0.database = "1071000000";
        mongoProperties0.setUri("1p7082k");
        java.lang.String str44 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 120000 + "'", int31 == 120000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "mongodb://localhost/test" + "'", str36, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.host = "2";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        char[] charArray9 = mongoProperties0.getPassword();
        mongoProperties0.database = "4000000";
        mongoProperties0.username = "97";
        mongoProperties0.clearPassword();
        char[] charArray15 = mongoProperties0.password;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(charArray15);
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.acceptableLatencyDifference(16777215);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("2147483960", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 2147483960");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime(4);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minHeartbeatFrequency(100663114);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatConnectRetryFrequency(80803801);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.maxWaitTime(578813952);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.port = 441108803;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        int int2 = java.lang.Integer.compareUnsigned(100663114, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        java.lang.String str2 = java.lang.Integer.toString(352256, 217);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "352256" + "'", str2, "352256");
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "4e20";
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        boolean boolean13 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.WriteConcern writeConcern14 = mongoClientOptions11.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions11);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.host;
        mongoProperties16.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass20 = mongoProperties16.fieldNamingStrategy;
        mongoProperties16.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str24 = mongoProperties23.getUri();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        int int29 = mongoClientOptions28.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties23.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties16.builder(mongoClientOptions28);
        int int32 = mongoClientOptions28.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern33 = mongoClientOptions28.getWriteConcern();
        int int34 = mongoClientOptions28.getLocalThreshold();
        javax.net.SocketFactory socketFactory35 = mongoClientOptions28.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = builder15.socketFactory(socketFactory35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(writeConcern14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb://localhost/test" + "'", str24, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(writeConcern33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertNotNull(socketFactory35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        int int2 = java.lang.Integer.compareUnsigned(100059, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUri("10");
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.build();
        int int9 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int10 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions8.getLocalThreshold();
        int int12 = mongoClientOptions8.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions8.getDbEncoderFactory();
        int int14 = mongoClientOptions8.getSocketTimeout();
        int int15 = mongoClientOptions8.getHeartbeatFrequency();
        boolean boolean16 = mongoClientOptions8.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions8);
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions8.getReadPreference();
        int int19 = mongoClientOptions8.getHeartbeatConnectRetryFrequency();
        int int20 = mongoClientOptions8.getAcceptableLatencyDifference();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5000 + "'", int15 == 5000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1000000000000000000000000000100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1000000000000000000000000000100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("149159936", 69);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 69 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        java.lang.String str1 = java.lang.Integer.toOctalString(1000101);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3641245" + "'", str1, "3641245");
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1342177280");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.gridFsDatabase = "1101011";
        mongoProperties0.setUri("88130000");
        java.lang.String str11 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        int int1 = java.lang.Integer.signum(60060000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.clearPassword();
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setUsername("20040034001");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder13 = builder8.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        mongoProperties14.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass18 = mongoProperties14.fieldNamingStrategy;
        mongoProperties14.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.getUri();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        int int27 = mongoClientOptions26.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties21.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties14.builder(mongoClientOptions26);
        javax.net.SocketFactory socketFactory30 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = builder13.socketFactory(socketFactory30);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions32);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str35 = mongoProperties34.host;
        org.springframework.core.env.Environment environment36 = null;
        int int37 = mongoProperties34.determinePort(environment36);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        boolean boolean42 = mongoClientOptions41.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory43 = mongoClientOptions41.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties34.builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder45.build();
        int int49 = mongoClientOptions48.getMaxConnectionLifeTime();
        int int50 = mongoClientOptions48.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties34.builder(mongoClientOptions48);
        int int52 = mongoClientOptions48.getHeartbeatFrequency();
        boolean boolean53 = mongoClientOptions48.isCursorFinalizerEnabled();
        int int54 = mongoClientOptions48.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern55 = mongoClientOptions48.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder56 = builder33.writeConcern(writeConcern55);
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder60 = builder56.maxConnectionLifeTime(1306597376);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 27017 + "'", int37 == 27017);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5000 + "'", int52 == 5000);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1342177280 + "'", int54 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.toString();
        int int16 = mongoClientOptions14.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties5.builder(mongoClientOptions14);
        int int18 = mongoClientOptions14.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.String str20 = mongoProperties0.host;
        char[] charArray21 = new char[] {};
        mongoProperties0.password = charArray21;
        mongoProperties0.database = "144";
        java.lang.String str25 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass26 = mongoProperties0.fieldNamingStrategy;
        boolean boolean27 = mongoProperties0.hasCustomAddress();
        mongoProperties0.port = (-1681772544);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "144" + "'", str25, "144");
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        int int1 = java.lang.Integer.highestOneBit(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.threadsAllowedToBlockForConnectionMultiplier(1);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder10 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        com.mongodb.MongoClientOptions.Builder builder24 = builder19.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder26 = builder19.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int30 = mongoProperties29.getDEFAULT_PORT();
        mongoProperties29.setHost("hi!");
        mongoProperties29.host = "";
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        java.lang.String str39 = mongoClientOptions38.toString();
        int int40 = mongoClientOptions38.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties29.builder(mongoClientOptions38);
        int int42 = mongoClientOptions38.getConnectTimeout();
        javax.net.SocketFactory socketFactory43 = mongoClientOptions38.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory44 = mongoClientOptions38.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder28.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder10.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder47 = builder0.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.heartbeatThreadCount(6);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.maxAutoConnectRetryTime((long) 40000);
        com.mongodb.MongoClientOptions.Builder builder53 = builder49.maxConnectionLifeTime(82595524);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.requiredReplicaSetName("10110000");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27017 + "'", int30 == 27017);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10000 + "'", int42 == 10000);
        org.junit.Assert.assertNotNull(socketFactory43);
        org.junit.Assert.assertNotNull(dBDecoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.getUri();
        char[] charArray10 = mongoProperties8.password;
        char[] charArray11 = mongoProperties8.password;
        char[] charArray12 = mongoProperties8.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        mongoProperties13.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        mongoProperties13.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.getUri();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties20.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties13.builder(mongoClientOptions25);
        int int29 = mongoClientOptions25.getConnectTimeout();
        int int30 = mongoClientOptions25.getConnectTimeout();
        int int31 = mongoClientOptions25.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties8.builder(mongoClientOptions25);
        java.lang.String str33 = mongoClientOptions25.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties0.builder(mongoClientOptions25);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str36 = mongoProperties35.host;
        mongoProperties35.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass39 = mongoProperties35.fieldNamingStrategy;
        mongoProperties35.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.getUri();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        int int48 = mongoClientOptions47.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties42.builder(mongoClientOptions47);
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties35.builder(mongoClientOptions47);
        int int51 = mongoClientOptions47.getMaxConnectionLifeTime();
        int int52 = mongoClientOptions47.getMinHeartbeatFrequency();
        boolean boolean53 = mongoClientOptions47.isAlwaysUseMBeans();
        com.mongodb.DBDecoderFactory dBDecoderFactory54 = mongoClientOptions47.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder55 = builder34.dbDecoderFactory(dBDecoderFactory54);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "mongodb://localhost/test" + "'", str43, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 500 + "'", int52 == 500);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.setPort((java.lang.Integer) 27017);
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions15.getWriteConcern();
        int int19 = mongoClientOptions15.getConnectionsPerHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        java.lang.String str1 = java.lang.Integer.toOctalString(1073745416);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000007010" + "'", str1, "10000007010");
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        java.lang.String str1 = java.lang.Integer.toString(24);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "24" + "'", str1, "24");
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder14 = builder9.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder18 = builder9.maxConnectionLifeTime(120000);
        boolean boolean19 = mongoClientOptions3.equals((java.lang.Object) builder9);
        com.mongodb.MongoClientOptions.Builder builder21 = builder9.connectionsPerHost(120000);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime(20000);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder28 = builder27.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder27.connectionsPerHost(1073741825);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        javax.net.SocketFactory socketFactory7 = mongoClientOptions3.getSocketFactory();
        boolean boolean8 = mongoClientOptions3.isAlwaysUseMBeans();
        java.lang.String str9 = mongoClientOptions3.toString();
        int int10 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int11 = mongoClientOptions3.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions3.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(socketFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("8869df00");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"8869df00\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        int int1 = java.lang.Integer.reverseBytes(37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 620756992 + "'", int1 == 620756992);
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        boolean boolean7 = mongoClientOptions6.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions6.getDbDecoderFactory();
        int int9 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions6);
        char[] charArray11 = mongoProperties0.password;
        mongoProperties0.setUsername("c43d9");
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        java.lang.String str18 = mongoClientOptions17.toString();
        int int19 = mongoClientOptions17.getMaxWaitTime();
        int int20 = mongoClientOptions17.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions17);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int23 = mongoProperties22.getDEFAULT_PORT();
        mongoProperties22.setHost("hi!");
        mongoProperties22.host = "";
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        java.lang.String str32 = mongoClientOptions31.toString();
        int int33 = mongoClientOptions31.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties22.builder(mongoClientOptions31);
        int int35 = mongoClientOptions31.getConnectTimeout();
        int int36 = mongoClientOptions31.getHeartbeatSocketTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.getUri();
        char[] charArray39 = mongoProperties37.password;
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean44 = mongoClientOptions43.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory45 = mongoClientOptions43.getDbDecoderFactory();
        int int46 = mongoClientOptions43.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties37.builder(mongoClientOptions43);
        java.lang.String str48 = mongoProperties37.database;
        boolean boolean49 = mongoClientOptions31.equals((java.lang.Object) str48);
        java.lang.String str50 = mongoClientOptions31.getDescription();
        int int51 = mongoClientOptions31.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions31);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str54 = mongoProperties53.host;
        org.springframework.core.env.Environment environment55 = null;
        int int56 = mongoProperties53.determinePort(environment55);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder57.build();
        boolean boolean61 = mongoClientOptions60.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory62 = mongoClientOptions60.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties53.builder(mongoClientOptions60);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions67 = builder64.build();
        int int68 = mongoClientOptions67.getMaxConnectionLifeTime();
        int int69 = mongoClientOptions67.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties53.builder(mongoClientOptions67);
        java.lang.String str71 = mongoClientOptions67.getDescription();
        boolean boolean72 = mongoClientOptions67.isAlwaysUseMBeans();
        boolean boolean73 = mongoClientOptions67.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder74 = mongoProperties0.builder(mongoClientOptions67);
        java.lang.String str75 = mongoClientOptions67.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120000 + "'", int19 == 120000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5000 + "'", int20 == 5000);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 27017 + "'", int23 == 27017);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10000 + "'", int35 == 10000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 27017 + "'", int56 == 27017);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoClientOptions67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        int int2 = java.lang.Integer.rotateRight(2947841, (-2143813376));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2947841 + "'", int2 == 2947841);
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatThreadCount((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        boolean boolean19 = mongoClientOptions17.isAutoConnectRetry();
        javax.net.SocketFactory socketFactory20 = mongoClientOptions17.getSocketFactory();
        int int21 = mongoClientOptions17.getHeartbeatThreadCount();
        int int22 = mongoClientOptions17.getConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory23 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder24 = builder13.dbDecoderFactory(dBDecoderFactory23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        int int2 = java.lang.Integer.compareUnsigned(1664, 10032);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        java.lang.String str10 = mongoProperties0.uri;
        java.lang.String str11 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        int int2 = java.lang.Integer.min(1337982976, (-536870901));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-536870901) + "'", int2 == (-536870901));
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory31 = mongoClientOptions29.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder25.dbEncoderFactory(dBEncoderFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minHeartbeatFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.connectionsPerHost(58376);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatThreadCount(53182464);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        int int1 = java.lang.Integer.numberOfLeadingZeros(66388080);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties0.determinePort(environment8);
        mongoProperties0.authenticationDatabase = "";
        mongoProperties0.port = 1440351;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        int int2 = java.lang.Integer.max(60000, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        int int2 = java.lang.Integer.divideUnsigned(46, 1359872);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("30");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 30");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions11.getDbDecoderFactory();
        int int14 = mongoClientOptions11.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions11);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.host;
        java.lang.String str18 = mongoProperties16.host;
        java.lang.Integer int19 = mongoProperties16.getPort();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean25 = mongoClientOptions23.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties16.builder(mongoClientOptions23);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties27.gridFsDatabase = "hi!";
        char[] charArray34 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties27.setPassword(charArray34);
        mongoProperties16.setPassword(charArray34);
        mongoProperties0.setPassword(charArray34);
        java.lang.String str38 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("");
        java.lang.String str41 = mongoProperties0.host;
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.build();
        boolean boolean46 = mongoClientOptions45.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory47 = mongoClientOptions45.getDbEncoderFactory();
        int int48 = mongoClientOptions45.getAcceptableLatencyDifference();
        javax.net.SocketFactory socketFactory49 = mongoClientOptions45.getSocketFactory();
        int int50 = mongoClientOptions45.getAcceptableLatencyDifference();
        org.springframework.core.env.Environment environment51 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient52 = mongoProperties0.createMongoClient(mongoClientOptions45, environment51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 15 + "'", int48 == 15);
        org.junit.Assert.assertNotNull(socketFactory49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 15 + "'", int50 == 15);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        int int2 = java.lang.Integer.sum((int) (short) 0, 811393294);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 811393294 + "'", int2 == 811393294);
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int7 = mongoProperties6.getDEFAULT_PORT();
        mongoProperties6.setHost("hi!");
        mongoProperties6.host = "";
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        java.lang.String str16 = mongoClientOptions15.toString();
        int int17 = mongoClientOptions15.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties6.builder(mongoClientOptions15);
        int int19 = mongoClientOptions15.getConnectTimeout();
        javax.net.SocketFactory socketFactory20 = mongoClientOptions15.getSocketFactory();
        boolean boolean21 = mongoClientOptions15.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.connectionsPerHost(180814862);
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder33 = builder27.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder35 = builder27.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder37 = builder27.heartbeatConnectRetryFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder39 = builder27.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder41 = builder27.heartbeatSocketTimeout(44);
        com.mongodb.MongoClientOptions.Builder builder43 = builder27.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder48 = builder44.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder52 = builder51.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder56 = builder52.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder57.build();
        boolean boolean62 = mongoClientOptions60.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory63 = mongoClientOptions60.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder64 = builder52.socketFactory(socketFactory63);
        com.mongodb.MongoClientOptions.Builder builder65 = builder44.socketFactory(socketFactory63);
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder69 = builder68.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder73 = builder69.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder74 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder76 = builder74.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions77 = builder74.build();
        boolean boolean79 = mongoClientOptions77.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory80 = mongoClientOptions77.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder81 = builder69.socketFactory(socketFactory80);
        com.mongodb.MongoClientOptions.Builder builder82 = builder44.socketFactory(socketFactory80);
        com.mongodb.MongoClientOptions.Builder builder83 = builder43.socketFactory(socketFactory80);
        com.mongodb.MongoClientOptions.Builder builder84 = builder26.socketFactory(socketFactory80);
        com.mongodb.MongoClientOptions.Builder builder86 = builder26.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(socketFactory63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoClientOptions77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(socketFactory80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.maxConnectionLifeTime(671088640);
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.maxConnectionLifeTime(40000);
        com.mongodb.MongoClientOptions.Builder builder14 = builder0.heartbeatFrequency(60000000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        java.lang.String str7 = mongoClientOptions3.getDescription();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        java.lang.String str24 = mongoProperties8.getGridFsDatabase();
        mongoProperties8.port = 120000;
        mongoProperties8.setHost("5");
        boolean boolean29 = mongoClientOptions3.equals((java.lang.Object) mongoProperties8);
        int int30 = mongoClientOptions3.getMinConnectionsPerHost();
        java.lang.String str31 = mongoClientOptions3.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1342177280 + "'", int30 == 1342177280);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        java.lang.String str1 = java.lang.Integer.toOctalString(872415232);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6400000000" + "'", str1, "6400000000");
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setHost("2216427776");
        java.lang.String str9 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties0.determinePort(environment10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.autoConnectRetry(true);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getLocalThreshold();
        int int15 = mongoClientOptions13.getMinHeartbeatFrequency();
        boolean boolean16 = mongoClientOptions13.isAutoConnectRetry();
        int int17 = mongoClientOptions13.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean13 = mongoClientOptions11.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory14 = mongoClientOptions11.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder15 = builder3.socketFactory(socketFactory14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionIdleTime(20480000);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder21 = builder20.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder23.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder38 = builder33.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder40 = builder33.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder42 = builder33.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder43.build();
        int int47 = mongoClientOptions46.getMaxConnectionLifeTime();
        int int48 = mongoClientOptions46.getMaxConnectionLifeTime();
        int int49 = mongoClientOptions46.getLocalThreshold();
        int int50 = mongoClientOptions46.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str51 = mongoClientOptions46.getRequiredReplicaSetName();
        int int52 = mongoClientOptions46.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory53 = mongoClientOptions46.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder54 = builder33.dbDecoderFactory(dBDecoderFactory53);
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions58 = builder55.build();
        boolean boolean59 = mongoClientOptions58.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory60 = mongoClientOptions58.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder61 = builder33.dbEncoderFactory(dBEncoderFactory60);
        com.mongodb.MongoClientOptions.Builder builder62 = builder28.dbEncoderFactory(dBEncoderFactory60);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties63 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str64 = mongoProperties63.host;
        mongoProperties63.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass67 = mongoProperties63.fieldNamingStrategy;
        mongoProperties63.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties70 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str71 = mongoProperties70.getUri();
        com.mongodb.MongoClientOptions.Builder builder72 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder74 = builder72.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions75 = builder72.build();
        int int76 = mongoClientOptions75.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder77 = mongoProperties70.builder(mongoClientOptions75);
        com.mongodb.MongoClientOptions.Builder builder78 = mongoProperties63.builder(mongoClientOptions75);
        int int79 = mongoClientOptions75.getConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory80 = mongoClientOptions75.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder81 = builder62.dbEncoderFactory(dBEncoderFactory80);
        com.mongodb.MongoClientOptions.Builder builder82 = builder15.dbEncoderFactory(dBEncoderFactory80);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5000 + "'", int52 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(mongoClientOptions58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(wildcardClass67);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "mongodb://localhost/test" + "'", str71, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(mongoClientOptions75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10000 + "'", int79 == 10000);
        org.junit.Assert.assertNotNull(dBEncoderFactory80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(110111100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "110111100" + "'", str1, "110111100");
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory31 = mongoClientOptions29.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder25.dbEncoderFactory(dBEncoderFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minHeartbeatFrequency(53182464);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.host;
        mongoProperties37.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass41 = mongoProperties37.fieldNamingStrategy;
        mongoProperties37.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.getUri();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        int int50 = mongoClientOptions49.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties44.builder(mongoClientOptions49);
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties37.builder(mongoClientOptions49);
        com.mongodb.ReadPreference readPreference53 = mongoClientOptions49.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder54 = builder34.readPreference(readPreference53);
        com.mongodb.MongoClientOptions.Builder builder56 = builder34.description("19");
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.acceptableLatencyDifference(35);
        com.mongodb.MongoClientOptions.Builder builder60 = builder56.maxConnectionLifeTime(100668276);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "mongodb://localhost/test" + "'", str45, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(readPreference53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        java.lang.String str1 = java.lang.Integer.toOctalString(53248);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "150000" + "'", str1, "150000");
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        int int11 = mongoClientOptions7.getLocalThreshold();
        int int12 = mongoClientOptions7.getConnectTimeout();
        com.mongodb.WriteConcern writeConcern13 = mongoClientOptions7.getWriteConcern();
        java.lang.String str14 = mongoClientOptions7.getRequiredReplicaSetName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10000 + "'", int12 == 10000);
        org.junit.Assert.assertNotNull(writeConcern13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getMaxWaitTime();
        int int9 = mongoClientOptions3.getMinHeartbeatFrequency();
        int int10 = mongoClientOptions3.getHeartbeatFrequency();
        int int11 = mongoClientOptions3.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 120000 + "'", int8 == 120000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        int int2 = java.lang.Integer.min(16777223, 803801);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 803801 + "'", int2 == 803801);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        int int7 = mongoClientOptions3.getHeartbeatSocketTimeout();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        int int9 = mongoClientOptions3.getConnectTimeout();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions3.getWriteConcern();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(writeConcern11);
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        int int1 = java.lang.Integer.highestOneBit(49922359);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33554432 + "'", int1 == 33554432);
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        int int2 = java.lang.Integer.divideUnsigned(828498432, 570425344);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.uri = "11610";
        java.lang.String str15 = mongoProperties0.authenticationDatabase;
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setPort((java.lang.Integer) 37289984);
        java.lang.String str19 = mongoProperties0.authenticationDatabase;
        java.lang.String str20 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 1306597376);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        long long1 = java.lang.Integer.toUnsignedLong(24);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        int int2 = java.lang.Integer.sum(605440, 24584435);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25189875 + "'", int2 == 25189875);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        int int1 = java.lang.Integer.bitCount(2048);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str8 = mongoProperties0.getDatabase();
        char[] charArray9 = mongoProperties0.getPassword();
        mongoProperties0.setHost("-1610612736");
        mongoProperties0.uri = "10000";
        java.lang.Integer int14 = mongoProperties0.getPort();
        java.lang.String str15 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        int int1 = java.lang.Integer.reverse((-1610547200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32773 + "'", int1 == 32773);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        int int1 = java.lang.Integer.numberOfLeadingZeros(80000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.uri;
        mongoProperties0.uri = "mongodb://localhost/test";
        char[] charArray12 = mongoProperties0.getPassword();
        mongoProperties0.port = 105;
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean19 = mongoClientOptions18.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions18.getDbDecoderFactory();
        int int21 = mongoClientOptions18.getLocalThreshold();
        boolean boolean22 = mongoClientOptions18.isAlwaysUseMBeans();
        long long23 = mongoClientOptions18.getMaxAutoConnectRetryTime();
        boolean boolean24 = mongoClientOptions18.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory25 = mongoClientOptions18.getDbEncoderFactory();
        int int26 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxConnectionIdleTime(8399619);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setPort((java.lang.Integer) 324);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.setUsername("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        java.lang.String str11 = mongoClientOptions10.toString();
        int int12 = mongoClientOptions10.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions10);
        boolean boolean14 = mongoClientOptions10.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions10.getMinConnectionsPerHost();
        com.mongodb.ReadPreference readPreference17 = mongoClientOptions10.getReadPreference();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5000 + "'", int12 == 5000);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1342177280 + "'", int16 == 1342177280);
        org.junit.Assert.assertNotNull(readPreference17);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(112807936);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "112807936" + "'", str1, "112807936");
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.connectionsPerHost(122879488);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder25 = builder24.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder30 = builder29.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.connectionsPerHost(5000);
        com.mongodb.MongoClientOptions.Builder builder33 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        int int38 = mongoClientOptions37.getMaxConnectionLifeTime();
        int int39 = mongoClientOptions37.getMaxConnectionLifeTime();
        int int40 = mongoClientOptions37.getHeartbeatSocketTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory41 = mongoClientOptions37.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder42 = builder33.dbDecoderFactory(dBDecoderFactory41);
        com.mongodb.MongoClientOptions.Builder builder43 = builder21.dbDecoderFactory(dBDecoderFactory41);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatSocketTimeout(20480000);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        int int14 = mongoClientOptions13.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions13.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions13.getLocalThreshold();
        boolean boolean17 = mongoClientOptions13.isAlwaysUseMBeans();
        java.lang.String str18 = mongoClientOptions13.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions13.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder20 = builder7.writeConcern(writeConcern19);
        com.mongodb.MongoClientOptions.Builder builder21 = builder6.writeConcern(writeConcern19);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.acceptableLatencyDifference(14);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(writeConcern19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        java.lang.Integer int3 = mongoProperties0.getPort();
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.getUri();
        char[] charArray7 = mongoProperties5.password;
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        java.lang.String str12 = mongoClientOptions11.toString();
        int int13 = mongoClientOptions11.getHeartbeatFrequency();
        int int14 = mongoClientOptions11.getConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions11.getDbDecoderFactory();
        int int16 = mongoClientOptions11.getAcceptableLatencyDifference();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties5.builder(mongoClientOptions11);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5000 + "'", int13 == 5000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.port = 27017;
        java.lang.String str11 = mongoProperties0.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.host;
        mongoProperties12.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass16 = mongoProperties12.fieldNamingStrategy;
        mongoProperties12.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str20 = mongoProperties19.getUri();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties19.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions24);
        boolean boolean28 = mongoClientOptions24.isAlwaysUseMBeans();
        int int29 = mongoClientOptions24.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder33 = builder32.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder36 = builder35.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder38 = builder35.heartbeatSocketTimeout(69);
        boolean boolean39 = mongoClientOptions24.equals((java.lang.Object) builder38);
        javax.net.SocketFactory socketFactory40 = mongoClientOptions24.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties0.builder(mongoClientOptions24);
        com.mongodb.DBEncoderFactory dBEncoderFactory42 = mongoClientOptions24.getDbEncoderFactory();
        boolean boolean43 = mongoClientOptions24.isCursorFinalizerEnabled();
        int int44 = mongoClientOptions24.getMaxConnectionLifeTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(socketFactory40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(dBEncoderFactory42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        mongoProperties0.gridFsDatabase = "11100100000000000000000000001";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int11 = mongoProperties10.getDEFAULT_PORT();
        mongoProperties10.setHost("hi!");
        mongoProperties10.host = "";
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        java.lang.String str20 = mongoClientOptions19.toString();
        int int21 = mongoClientOptions19.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties10.builder(mongoClientOptions19);
        int int23 = mongoClientOptions19.getConnectTimeout();
        int int24 = mongoClientOptions19.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory25 = mongoClientOptions19.getDbEncoderFactory();
        int int26 = mongoClientOptions19.getMinHeartbeatFrequency();
        int int27 = mongoClientOptions19.getSocketTimeout();
        int int28 = mongoClientOptions19.getMaxConnectionIdleTime();
        org.springframework.core.env.Environment environment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient30 = mongoProperties0.createMongoClient(mongoClientOptions19, environment29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 120000 + "'", int24 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 500 + "'", int26 == 500);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.minHeartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxConnectionLifeTime(11);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.connectionsPerHost(298319873);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatConnectTimeout(441108803);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        mongoProperties0.setPort((java.lang.Integer) 61000000);
        mongoProperties0.gridFsDatabase = "1100100";
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.localThreshold(20000);
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.uri;
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions11.getLocalThreshold();
        int int15 = mongoClientOptions11.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties0.builder(mongoClientOptions11);
        boolean boolean17 = mongoClientOptions11.isSocketKeepAlive();
        int int18 = mongoClientOptions11.getMaxConnectionLifeTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned(40, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.gridFsDatabase = "hi!";
        char[] charArray16 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties9.setPassword(charArray16);
        mongoProperties0.setPassword(charArray16);
        java.lang.String str19 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions23.getLocalThreshold();
        int int27 = mongoClientOptions23.getMaxConnectionIdleTime();
        int int28 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.cursorFinalizerEnabled(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        int int2 = java.lang.Integer.rotateRight(33554432, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67108864 + "'", int2 == 67108864);
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        int int2 = java.lang.Integer.remainderUnsigned(0, 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getConnectionsPerHost();
        java.lang.String str7 = mongoClientOptions3.getRequiredReplicaSetName();
        boolean boolean8 = mongoClientOptions3.isSocketKeepAlive();
        int int9 = mongoClientOptions3.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        long long1 = java.lang.Integer.toUnsignedLong(116100000);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 116100000L + "'", long1 == 116100000L);
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.setPort((java.lang.Integer) 27017);
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions15);
        int int18 = mongoClientOptions15.getSocketTimeout();
        javax.net.SocketFactory socketFactory19 = mongoClientOptions15.getSocketFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(socketFactory19);
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        boolean boolean5 = mongoClientOptions3.isAutoConnectRetry();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        int int7 = mongoClientOptions3.getMinConnectionsPerHost();
        int int8 = mongoClientOptions3.getAcceptableLatencyDifference();
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = mongoClientOptions3.getDbEncoderFactory();
        int int10 = mongoClientOptions3.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1342177280 + "'", int7 == 1342177280);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.heartbeatFrequency(4521984);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder30 = builder29.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        boolean boolean40 = mongoClientOptions38.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory41 = mongoClientOptions38.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder42 = builder30.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder43 = builder22.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder47 = builder46.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder51 = builder47.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions55 = builder52.build();
        boolean boolean57 = mongoClientOptions55.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory58 = mongoClientOptions55.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder47.socketFactory(socketFactory58);
        com.mongodb.MongoClientOptions.Builder builder60 = builder22.socketFactory(socketFactory58);
        com.mongodb.MongoClientOptions.Builder builder62 = builder22.description("16");
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.heartbeatConnectTimeout(872415232);
        com.mongodb.MongoClientOptions.Builder builder65 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions68 = builder65.build();
        boolean boolean69 = mongoClientOptions68.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory70 = mongoClientOptions68.getDbDecoderFactory();
        int int71 = mongoClientOptions68.getLocalThreshold();
        int int72 = mongoClientOptions68.getConnectionsPerHost();
        int int73 = mongoClientOptions68.getMaxConnectionLifeTime();
        int int74 = mongoClientOptions68.getLocalThreshold();
        int int75 = mongoClientOptions68.getMinConnectionsPerHost();
        int int76 = mongoClientOptions68.getConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory77 = mongoClientOptions68.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder78 = builder62.dbEncoderFactory(dBEncoderFactory77);
        com.mongodb.MongoClientOptions.Builder builder79 = builder15.dbEncoderFactory(dBEncoderFactory77);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(socketFactory41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(mongoClientOptions55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(socketFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoClientOptions68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 15 + "'", int71 == 15);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 15 + "'", int74 == 15);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1342177280 + "'", int75 == 1342177280);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10000 + "'", int76 == 10000);
        org.junit.Assert.assertNotNull(dBEncoderFactory77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.WriteConcern writeConcern8 = mongoClientOptions3.getWriteConcern();
        int int9 = mongoClientOptions3.getMinConnectionsPerHost();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int11 = mongoClientOptions3.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(writeConcern8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1342177280 + "'", int9 == 1342177280);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5000 + "'", int11 == 5000);
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        int int2 = java.lang.Integer.compare(605440, 16667143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        int int1 = java.lang.Integer.reverseBytes(26819840);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4036865 + "'", int1 == 4036865);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int4 = mongoProperties3.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        mongoProperties5.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        char[] charArray21 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties14.setPassword(charArray21);
        mongoProperties13.setPassword(charArray21);
        mongoProperties5.setPassword(charArray21);
        mongoProperties3.password = charArray21;
        mongoProperties0.password = charArray21;
        java.lang.String str27 = mongoProperties0.uri;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        int int2 = java.lang.Integer.divideUnsigned(16, 352256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        java.lang.String str1 = java.lang.Integer.toOctalString(14152);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "33510" + "'", str1, "33510");
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("111");
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.database = "803801";
        java.lang.String str17 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties4.setHost("");
        java.lang.String str7 = mongoProperties4.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAlwaysUseMBeans();
        int int13 = mongoClientOptions11.getLocalThreshold();
        int int14 = mongoClientOptions11.getSocketTimeout();
        int int15 = mongoClientOptions11.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties4.builder(mongoClientOptions11);
        int int17 = mongoClientOptions11.getConnectionsPerHost();
        javax.net.SocketFactory socketFactory18 = mongoClientOptions11.getSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(socketFactory18);
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.setGridFsDatabase("a0000000");
        java.lang.String str8 = mongoProperties0.getUri();
        java.lang.Class<?> wildcardClass9 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.connectionsPerHost(6989);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxConnectionLifeTime(1617323622);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-1006632951));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3288334345" + "'", str1, "3288334345");
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        int int1 = java.lang.Integer.reverse(393216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24576 + "'", int1 == 24576);
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        boolean boolean9 = mongoClientOptions3.isAutoConnectRetry();
        java.lang.String str10 = mongoClientOptions3.getDescription();
        int int11 = mongoClientOptions3.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-2093492383), 170910000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2201474913" + "'", str2, "2201474913");
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder11.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        boolean boolean21 = mongoClientOptions20.isAlwaysUseMBeans();
        int int22 = mongoClientOptions20.getLocalThreshold();
        int int23 = mongoClientOptions20.getSocketTimeout();
        int int24 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern25 = mongoClientOptions20.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder26 = builder16.writeConcern(writeConcern25);
        boolean boolean27 = mongoClientOptions3.equals((java.lang.Object) builder26);
        java.lang.String str28 = mongoClientOptions3.toString();
        boolean boolean29 = mongoClientOptions3.isCursorFinalizerEnabled();
        boolean boolean30 = mongoClientOptions3.isAlwaysUseMBeans();
        boolean boolean31 = mongoClientOptions3.isAutoConnectRetry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(writeConcern25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        boolean boolean5 = mongoProperties0.hasCustomCredentials();
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setAuthenticationDatabase("176");
        mongoProperties0.setGridFsDatabase("1");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        char[] charArray6 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.host;
        mongoProperties7.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass11 = mongoProperties7.fieldNamingStrategy;
        mongoProperties7.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.getUri();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties14.builder(mongoClientOptions19);
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties7.builder(mongoClientOptions19);
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions19.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions19);
        int int25 = mongoClientOptions19.getMinConnectionsPerHost();
        int int26 = mongoClientOptions19.getMaxConnectionIdleTime();
        java.lang.String str27 = mongoClientOptions19.toString();
        java.lang.Class<?> wildcardClass28 = mongoClientOptions19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1342177280 + "'", int25 == 1342177280);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        int int2 = java.lang.Integer.divideUnsigned(6144, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161 + "'", int2 == 161);
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        mongoProperties12.username = "100";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean24 = mongoClientOptions23.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions23.getDbDecoderFactory();
        int int26 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions23);
        com.mongodb.WriteConcern writeConcern29 = mongoClientOptions23.getWriteConcern();
        int int30 = mongoClientOptions23.getAcceptableLatencyDifference();
        int int31 = mongoClientOptions23.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(writeConcern29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5000 + "'", int31 == 5000);
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getSocketTimeout();
        boolean boolean16 = mongoClientOptions9.isAutoConnectRetry();
        int int17 = mongoClientOptions9.getAcceptableLatencyDifference();
        int int18 = mongoClientOptions9.getHeartbeatThreadCount();
        int int19 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("5");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.autoConnectRetry(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties17.setHost("");
        mongoProperties17.username = "100";
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.localThreshold(27017);
        java.lang.Class<?> wildcardClass25 = builder24.getClass();
        mongoProperties17.fieldNamingStrategy = wildcardClass25;
        mongoProperties17.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int30 = mongoProperties29.getDEFAULT_PORT();
        mongoProperties29.setHost("hi!");
        mongoProperties29.host = "";
        mongoProperties29.username = "100";
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        boolean boolean41 = mongoClientOptions40.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory42 = mongoClientOptions40.getDbDecoderFactory();
        int int43 = mongoClientOptions40.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties29.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties17.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.heartbeatThreadCount(67108864);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.maxWaitTime(214748364);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder51.build();
        int int53 = mongoClientOptions52.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory54 = mongoClientOptions52.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder55 = builder14.dbDecoderFactory(dBDecoderFactory54);
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder59 = builder55.minHeartbeatFrequency(1306597376);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27017 + "'", int30 == 27017);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 67108864 + "'", int53 == 67108864);
        org.junit.Assert.assertNotNull(dBDecoderFactory54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        int int2 = java.lang.Integer.divideUnsigned(0, 1140850688);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("-2023194737", 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal leading minus sign on unsigned string -2023194737.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("23360430000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"23360430000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        int int2 = java.lang.Integer.min((-1306525696), 193135264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1306525696) + "'", int2 == (-1306525696));
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int7 = mongoProperties6.getDEFAULT_PORT();
        mongoProperties6.setHost("hi!");
        mongoProperties6.host = "";
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        java.lang.String str16 = mongoClientOptions15.toString();
        int int17 = mongoClientOptions15.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties6.builder(mongoClientOptions15);
        int int19 = mongoClientOptions15.getConnectTimeout();
        javax.net.SocketFactory socketFactory20 = mongoClientOptions15.getSocketFactory();
        boolean boolean21 = mongoClientOptions15.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions15);
        java.lang.String str23 = mongoProperties0.gridFsDatabase;
        mongoProperties0.username = "mongodb://localhost/test";
        mongoProperties0.setDatabase("1p7082k");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties28.setHost("");
        mongoProperties28.username = "100";
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.localThreshold(27017);
        java.lang.Class<?> wildcardClass36 = builder35.getClass();
        mongoProperties28.fieldNamingStrategy = wildcardClass36;
        mongoProperties28.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int41 = mongoProperties40.getDEFAULT_PORT();
        mongoProperties40.setHost("hi!");
        mongoProperties40.host = "";
        mongoProperties40.username = "100";
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        boolean boolean52 = mongoClientOptions51.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory53 = mongoClientOptions51.getDbDecoderFactory();
        int int54 = mongoClientOptions51.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties40.builder(mongoClientOptions51);
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties28.builder(mongoClientOptions51);
        int int57 = mongoClientOptions51.getHeartbeatSocketTimeout();
        int int58 = mongoClientOptions51.getHeartbeatFrequency();
        org.springframework.core.env.Environment environment59 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient60 = mongoProperties0.createMongoClient(mongoClientOptions51, environment59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 27017 + "'", int41 == 27017);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 15 + "'", int54 == 15);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 20000 + "'", int57 == 20000);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5000 + "'", int58 == 5000);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.authenticationDatabase = "-129";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        int int1 = java.lang.Integer.highestOneBit((-534787520));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setHost("");
        mongoProperties0.setUsername("7fffffff");
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        boolean boolean12 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        int int1 = java.lang.Integer.reverse(469762048);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        int int1 = java.lang.Integer.reverseBytes(112);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1879048192 + "'", int1 == 1879048192);
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.socketTimeout(82595524);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.threadsAllowedToBlockForConnectionMultiplier(3);
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.maxWaitTime(469763033);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.requiredReplicaSetName("369098752");
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        int int20 = mongoClientOptions19.getAcceptableLatencyDifference();
        java.lang.String str21 = mongoClientOptions19.getRequiredReplicaSetName();
        java.lang.String str22 = mongoClientOptions19.getRequiredReplicaSetName();
        boolean boolean23 = mongoClientOptions19.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 738197504 + "'", int20 == 738197504);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "369098752" + "'", str21, "369098752");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "369098752" + "'", str22, "369098752");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties8.setHost("");
        mongoProperties8.username = "100";
        java.lang.String str13 = mongoProperties8.database;
        java.lang.Integer int14 = mongoProperties8.getPort();
        boolean boolean15 = mongoClientOptions3.equals((java.lang.Object) mongoProperties8);
        mongoProperties8.setDatabase("-1610612736");
        int int18 = mongoProperties8.getDEFAULT_PORT();
        java.lang.Integer int19 = mongoProperties8.getPort();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNull(int19);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        mongoProperties6.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass10 = mongoProperties6.fieldNamingStrategy;
        mongoProperties6.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions18);
        int int22 = mongoClientOptions18.getConnectTimeout();
        int int23 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions18);
        java.lang.String str25 = mongoProperties0.database;
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        java.lang.String str30 = mongoClientOptions29.toString();
        int int31 = mongoClientOptions29.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions29);
        boolean boolean33 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.gridFsDatabase = "7fffffff";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str37 = mongoProperties36.host;
        org.springframework.core.env.Environment environment38 = null;
        int int39 = mongoProperties36.determinePort(environment38);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean44 = mongoClientOptions43.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory45 = mongoClientOptions43.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties36.builder(mongoClientOptions43);
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.build();
        int int51 = mongoClientOptions50.getMaxConnectionLifeTime();
        int int52 = mongoClientOptions50.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties36.builder(mongoClientOptions50);
        int int54 = mongoClientOptions50.getHeartbeatFrequency();
        boolean boolean55 = mongoClientOptions50.isCursorFinalizerEnabled();
        int int56 = mongoClientOptions50.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern57 = mongoClientOptions50.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties0.builder(mongoClientOptions50);
        com.mongodb.DBDecoderFactory dBDecoderFactory59 = mongoClientOptions50.getDbDecoderFactory();
        com.mongodb.ReadPreference readPreference60 = mongoClientOptions50.getReadPreference();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 120000 + "'", int31 == 120000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27017 + "'", int39 == 27017);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5000 + "'", int54 == 5000);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1342177280 + "'", int56 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(dBDecoderFactory59);
        org.junit.Assert.assertNotNull(readPreference60);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.uri = "2162000001";
        mongoProperties0.clearPassword();
        mongoProperties0.setUri("25");
        java.lang.Class<?> wildcardClass17 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.authenticationDatabase = "test";
        boolean boolean20 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.clearPassword();
        java.lang.Integer int22 = mongoProperties0.port;
        java.lang.String str23 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        int int2 = java.lang.Integer.compare(53182464, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        int int1 = java.lang.Integer.numberOfTrailingZeros(434176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        int int1 = java.lang.Integer.signum(101100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getSocketTimeout();
        boolean boolean16 = mongoClientOptions9.isAlwaysUseMBeans();
        int int17 = mongoClientOptions9.getSocketTimeout();
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions9.getReadPreference();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(readPreference18);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-1879048157));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10010000000000000000000000100011" + "'", str1, "10010000000000000000000000100011");
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("24584435", (-1989607424));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1989607424 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.database = "144";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.gridFsDatabase = "hi!";
        char[] charArray19 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties12.setPassword(charArray19);
        mongoProperties11.setPassword(charArray19);
        java.lang.String str22 = mongoProperties11.getHost();
        boolean boolean23 = mongoProperties11.hasCustomCredentials();
        mongoProperties11.username = "27017";
        mongoProperties11.authenticationDatabase = "4294967295";
        char[] charArray28 = mongoProperties11.getPassword();
        mongoProperties0.setPassword(charArray28);
        java.lang.String str30 = mongoProperties0.host;
        mongoProperties0.username = "55";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        int int1 = java.lang.Integer.numberOfTrailingZeros(55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        int int1 = java.lang.Integer.parseUnsignedInt("416");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416 + "'", int1 == 416);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        mongoProperties0.setUri("hi!");
        java.lang.Class<?> wildcardClass9 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray10 = mongoProperties0.getPassword();
        char[] charArray11 = mongoProperties0.password;
        mongoProperties0.setUsername("4e20");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.heartbeatConnectRetryFrequency(268435461);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        int int1 = java.lang.Integer.signum(48990845);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        char[] charArray6 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        java.lang.String str11 = mongoClientOptions10.toString();
        int int12 = mongoClientOptions10.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions10);
        int int14 = mongoClientOptions10.getMaxConnectionLifeTime();
        long long15 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        int int2 = java.lang.Integer.rotateRight(80803801, (-47480831));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2107081748) + "'", int2 == (-2107081748));
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        int int1 = java.lang.Integer.parseInt("939589760");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 939589760 + "'", int1 == 939589760);
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        mongoProperties6.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass10 = mongoProperties6.fieldNamingStrategy;
        mongoProperties6.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions18);
        javax.net.SocketFactory socketFactory22 = mongoClientOptions18.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = builder3.socketFactory(socketFactory22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxWaitTime(500);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime(29);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder34 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.host;
        org.springframework.core.env.Environment environment39 = null;
        int int40 = mongoProperties37.determinePort(environment39);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        boolean boolean45 = mongoClientOptions44.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory46 = mongoClientOptions44.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties37.builder(mongoClientOptions44);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        int int52 = mongoClientOptions51.getMaxConnectionLifeTime();
        int int53 = mongoClientOptions51.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties37.builder(mongoClientOptions51);
        int int55 = mongoClientOptions51.getHeartbeatFrequency();
        boolean boolean56 = mongoClientOptions51.isCursorFinalizerEnabled();
        int int57 = mongoClientOptions51.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern58 = mongoClientOptions51.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder59 = builder36.writeConcern(writeConcern58);
        com.mongodb.MongoClientOptions.Builder builder60 = builder27.writeConcern(writeConcern58);
        com.mongodb.MongoClientOptions.Builder builder62 = builder27.threadsAllowedToBlockForConnectionMultiplier(34);
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.connectionsPerHost(764);
        com.mongodb.MongoClientOptions.Builder builder66 = builder62.socketTimeout(74579968);
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.acceptableLatencyDifference(3436);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(socketFactory22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 27017 + "'", int40 == 27017);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5000 + "'", int55 == 5000);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1342177280 + "'", int57 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMinConnectionsPerHost();
        long long12 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        int int13 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions10.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        int int2 = java.lang.Integer.sum(1258290949, 53182464);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1311473413 + "'", int2 == 1311473413);
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        int int1 = java.lang.Integer.parseInt("13");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions3.getDbEncoderFactory();
        int int6 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions3.getHeartbeatFrequency();
        int int8 = mongoClientOptions3.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5000 + "'", int7 == 5000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions9.getMaxConnectionLifeTime();
        java.lang.String str12 = mongoClientOptions9.getRequiredReplicaSetName();
        java.lang.String str13 = mongoClientOptions9.getRequiredReplicaSetName();
        int int14 = mongoClientOptions9.getMinConnectionsPerHost();
        int int15 = mongoClientOptions9.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120000 + "'", int15 == 120000);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        java.lang.String str3 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str5 = mongoProperties4.host;
        mongoProperties4.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass8 = mongoProperties4.fieldNamingStrategy;
        mongoProperties4.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.getUri();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties11.builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties4.builder(mongoClientOptions16);
        int int20 = mongoClientOptions16.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern21 = mongoClientOptions16.getWriteConcern();
        int int22 = mongoClientOptions16.getLocalThreshold();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions16.getReadPreference();
        long long24 = mongoClientOptions16.getMaxAutoConnectRetryTime();
        java.lang.String str25 = mongoClientOptions16.getRequiredReplicaSetName();
        java.lang.String str26 = mongoClientOptions16.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions16);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.host;
        java.lang.String str30 = mongoProperties28.host;
        java.lang.Integer int31 = mongoProperties28.getPort();
        mongoProperties28.setDatabase("11i71");
        mongoProperties28.port = 2147483647;
        mongoProperties28.port = 1342177280;
        boolean boolean38 = mongoClientOptions16.equals((java.lang.Object) mongoProperties28);
        mongoProperties28.setDatabase("20000000434");
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        int int45 = mongoClientOptions44.getMaxConnectionLifeTime();
        int int46 = mongoClientOptions44.getMaxConnectionLifeTime();
        int int47 = mongoClientOptions44.getLocalThreshold();
        boolean boolean48 = mongoClientOptions44.isAlwaysUseMBeans();
        int int49 = mongoClientOptions44.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory50 = mongoClientOptions44.getDbDecoderFactory();
        int int51 = mongoClientOptions44.getLocalThreshold();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient52 = mongoProperties28.createMongoClient(mongoClientOptions44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(writeConcern21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(readPreference23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("", 1832910848);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1832910848 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        int int2 = java.lang.Integer.rotateRight((-2145648384), 150994944);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2145648384) + "'", int2 == (-2145648384));
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions9.getWriteConcern();
        java.lang.String str12 = mongoClientOptions9.getDescription();
        int int13 = mongoClientOptions9.getAcceptableLatencyDifference();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions9.getReadPreference();
        boolean boolean15 = mongoClientOptions9.isAutoConnectRetry();
        int int16 = mongoClientOptions9.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.requiredReplicaSetName("10010000");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        int int27 = mongoClientOptions21.getHeartbeatConnectRetryFrequency();
        int int28 = mongoClientOptions21.getConnectionsPerHost();
        int int29 = mongoClientOptions21.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern30 = mongoClientOptions21.getWriteConcern();
        com.mongodb.DBDecoderFactory dBDecoderFactory31 = mongoClientOptions21.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder11.dbDecoderFactory(dBDecoderFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder11.cursorFinalizerEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder36 = builder34.threadsAllowedToBlockForConnectionMultiplier(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 500 + "'", int27 == 500);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(writeConcern30);
        org.junit.Assert.assertNotNull(dBDecoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int14 = mongoProperties13.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int16 = mongoProperties15.getDEFAULT_PORT();
        mongoProperties15.setHost("hi!");
        mongoProperties15.host = "";
        mongoProperties15.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties24.gridFsDatabase = "hi!";
        char[] charArray31 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties24.setPassword(charArray31);
        mongoProperties23.setPassword(charArray31);
        mongoProperties15.setPassword(charArray31);
        mongoProperties13.password = charArray31;
        mongoProperties0.password = charArray31;
        mongoProperties0.authenticationDatabase = "1c";
        java.lang.String str39 = mongoProperties0.getHost();
        java.lang.Integer int40 = mongoProperties0.getPort();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(int40);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        java.lang.Class<?> wildcardClass8 = mongoProperties6.getFieldNamingStrategy();
        java.lang.String str9 = mongoProperties6.authenticationDatabase;
        boolean boolean10 = mongoProperties6.hasCustomAddress();
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties6.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        java.lang.String str16 = mongoClientOptions15.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("");
        mongoProperties0.uri = "11i71";
        mongoProperties0.host = "101";
        java.lang.String str9 = mongoProperties0.database;
        java.lang.String str10 = mongoProperties0.uri;
        java.lang.Class<?> wildcardClass11 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11i71" + "'", str10, "11i71");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions5.getMinHeartbeatFrequency();
        boolean boolean10 = mongoClientOptions5.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.toString();
        int int16 = mongoClientOptions14.getHeartbeatFrequency();
        int int17 = mongoClientOptions14.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory18 = mongoClientOptions14.getDbEncoderFactory();
        boolean boolean19 = mongoClientOptions5.equals((java.lang.Object) mongoClientOptions14);
        int int20 = mongoClientOptions14.getAcceptableLatencyDifference();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.host;
        java.lang.Class<?> wildcardClass23 = mongoProperties21.getFieldNamingStrategy();
        java.lang.String str24 = mongoProperties21.authenticationDatabase;
        mongoProperties21.database = "";
        java.lang.Integer int27 = mongoProperties21.port;
        java.lang.Integer int28 = mongoProperties21.getPort();
        java.lang.String str29 = mongoProperties21.getHost();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        boolean boolean34 = mongoClientOptions33.isAlwaysUseMBeans();
        int int35 = mongoClientOptions33.getLocalThreshold();
        int int36 = mongoClientOptions33.getSocketTimeout();
        int int37 = mongoClientOptions33.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties21.builder(mongoClientOptions33);
        boolean boolean39 = mongoClientOptions14.equals((java.lang.Object) mongoClientOptions33);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5000 + "'", int16 == 5000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10000 + "'", int37 == 10000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1111111101011000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1111111101011000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        java.lang.Integer int20 = mongoProperties12.getPort();
        java.lang.String str21 = mongoProperties12.getHost();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        boolean boolean27 = mongoClientOptions25.equals((java.lang.Object) (-2147483648));
        int int28 = mongoClientOptions25.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory29 = mongoClientOptions25.getDbDecoderFactory();
        int int30 = mongoClientOptions25.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties12.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions25);
        com.mongodb.WriteConcern writeConcern33 = mongoClientOptions25.getWriteConcern();
        boolean boolean34 = mongoClientOptions25.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(writeConcern33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getHeartbeatFrequency();
        java.lang.String str7 = mongoClientOptions3.toString();
        java.lang.String str8 = mongoClientOptions3.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5000 + "'", int6 == 5000);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        mongoProperties0.gridFsDatabase = "17";
        mongoProperties0.gridFsDatabase = "1010";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        int int2 = java.lang.Integer.rotateLeft((-1879048192), 1071013312);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1879048192) + "'", int2 == (-1879048192));
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        int int2 = java.lang.Integer.max(478150657, 2048);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 478150657 + "'", int2 == 478150657);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getMaxConnectionLifeTime();
        boolean boolean18 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions16.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder20 = builder12.writeConcern(writeConcern19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout(1388);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.socketKeepAlive(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(writeConcern19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        int int1 = java.lang.Integer.parseInt("8");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getSocketTimeout();
        boolean boolean7 = mongoClientOptions3.isAutoConnectRetry();
        boolean boolean8 = mongoClientOptions3.isCursorFinalizerEnabled();
        boolean boolean9 = mongoClientOptions3.isAlwaysUseMBeans();
        java.lang.String str10 = mongoClientOptions3.getDescription();
        int int11 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatConnectRetryFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder0.heartbeatSocketTimeout(44);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.connectionsPerHost(805306368);
        com.mongodb.MongoClientOptions.Builder builder17 = builder14.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.uri;
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions11.getLocalThreshold();
        int int15 = mongoClientOptions11.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties0.builder(mongoClientOptions11);
        int int17 = mongoClientOptions11.getHeartbeatFrequency();
        int int18 = mongoClientOptions11.getLocalThreshold();
        boolean boolean19 = mongoClientOptions11.isAlwaysUseMBeans();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5000 + "'", int17 == 5000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder10 = builder9.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.host;
        org.springframework.core.env.Environment environment12 = null;
        int int13 = mongoProperties10.determinePort(environment12);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        boolean boolean18 = mongoClientOptions17.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties10.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions24.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties10.builder(mongoClientOptions24);
        int int28 = mongoClientOptions24.getHeartbeatFrequency();
        boolean boolean29 = mongoClientOptions24.isCursorFinalizerEnabled();
        int int30 = mongoClientOptions24.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern31 = mongoClientOptions24.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder32 = builder6.writeConcern(writeConcern31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder6.acceptableLatencyDifference(478150657);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(738197504);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.maxAutoConnectRetryTime((long) 216);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5000 + "'", int28 == 5000);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1342177280 + "'", int30 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        mongoProperties0.port = 1342177280;
        mongoProperties0.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        java.lang.Integer int20 = mongoProperties12.getPort();
        java.lang.String str21 = mongoProperties12.getHost();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        boolean boolean27 = mongoClientOptions25.equals((java.lang.Object) (-2147483648));
        int int28 = mongoClientOptions25.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory29 = mongoClientOptions25.getDbDecoderFactory();
        int int30 = mongoClientOptions25.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties12.builder(mongoClientOptions25);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties33.gridFsDatabase = "hi!";
        char[] charArray40 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties33.setPassword(charArray40);
        mongoProperties32.setPassword(charArray40);
        char[] charArray43 = mongoProperties32.getPassword();
        mongoProperties12.password = charArray43;
        mongoProperties0.password = charArray43;
        mongoProperties0.setUsername("10011100010000");
        java.lang.String str48 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "10011100010000" + "'", str48, "10011100010000");
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.database;
        java.lang.String str12 = mongoProperties0.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties13.setHost("");
        mongoProperties13.setUri("");
        mongoProperties13.uri = "11i71";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions23.getLocalThreshold();
        boolean boolean27 = mongoClientOptions23.isAlwaysUseMBeans();
        java.lang.String str28 = mongoClientOptions23.getRequiredReplicaSetName();
        int int29 = mongoClientOptions23.getMinConnectionsPerHost();
        int int30 = mongoClientOptions23.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties13.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions23);
        mongoProperties0.setGridFsDatabase("1100001");
        java.lang.Class<?> wildcardClass35 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setPort((java.lang.Integer) 10056);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1342177280 + "'", int29 == 1342177280);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(wildcardClass35);
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatThreadCount(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.host;
        mongoProperties15.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass19 = mongoProperties15.fieldNamingStrategy;
        mongoProperties15.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.getUri();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties22.builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties15.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern32 = mongoClientOptions27.getWriteConcern();
        int int33 = mongoClientOptions27.getLocalThreshold();
        com.mongodb.ReadPreference readPreference34 = mongoClientOptions27.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder35 = builder14.readPreference(readPreference34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.socketKeepAlive(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "mongodb://localhost/test" + "'", str23, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(writeConcern32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertNotNull(readPreference34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatConnectRetryFrequency(444);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectTimeout(478150657);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.heartbeatFrequency(6086926);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getConnectTimeout();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        com.mongodb.ReadPreference readPreference9 = mongoClientOptions3.getReadPreference();
        java.lang.String str10 = mongoClientOptions3.toString();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions3.getDbDecoderFactory();
        boolean boolean13 = mongoClientOptions3.equals((java.lang.Object) 16000000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(readPreference9);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.getDatabase();
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str10 = mongoProperties0.username;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1024);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000000" + "'", str1, "10000000000");
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("c43d9");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"c43d9\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        int int11 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        int int12 = mongoClientOptions7.getMaxWaitTime();
        int int13 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory14 = mongoClientOptions7.getDbDecoderFactory();
        boolean boolean15 = mongoClientOptions7.isCursorFinalizerEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder13 = builder8.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        mongoProperties14.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass18 = mongoProperties14.fieldNamingStrategy;
        mongoProperties14.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.getUri();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        int int27 = mongoClientOptions26.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties21.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties14.builder(mongoClientOptions26);
        javax.net.SocketFactory socketFactory30 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = builder13.socketFactory(socketFactory30);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions32);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str35 = mongoProperties34.host;
        org.springframework.core.env.Environment environment36 = null;
        int int37 = mongoProperties34.determinePort(environment36);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        boolean boolean42 = mongoClientOptions41.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory43 = mongoClientOptions41.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties34.builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder45.build();
        int int49 = mongoClientOptions48.getMaxConnectionLifeTime();
        int int50 = mongoClientOptions48.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties34.builder(mongoClientOptions48);
        int int52 = mongoClientOptions48.getHeartbeatFrequency();
        boolean boolean53 = mongoClientOptions48.isCursorFinalizerEnabled();
        int int54 = mongoClientOptions48.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern55 = mongoClientOptions48.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder56 = builder33.writeConcern(writeConcern55);
        com.mongodb.MongoClientOptions.Builder builder58 = builder33.acceptableLatencyDifference(1024);
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        int int63 = mongoClientOptions62.getMaxConnectionLifeTime();
        boolean boolean64 = mongoClientOptions62.isAutoConnectRetry();
        int int65 = mongoClientOptions62.getHeartbeatThreadCount();
        boolean boolean66 = mongoClientOptions62.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern67 = mongoClientOptions62.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder68 = builder33.writeConcern(writeConcern67);
        com.mongodb.MongoClientOptions.Builder builder70 = builder33.acceptableLatencyDifference(1617323622);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 27017 + "'", int37 == 27017);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5000 + "'", int52 == 5000);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1342177280 + "'", int54 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(writeConcern67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.authenticationDatabase = "333311202213000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatConnectTimeout(35);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions19.getLocalThreshold();
        int int23 = mongoClientOptions19.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions19.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder14.dbEncoderFactory(dBEncoderFactory24);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.host;
        org.springframework.core.env.Environment environment28 = null;
        int int29 = mongoProperties26.determinePort(environment28);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        boolean boolean34 = mongoClientOptions33.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory35 = mongoClientOptions33.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties26.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        int int41 = mongoClientOptions40.getMaxConnectionLifeTime();
        int int42 = mongoClientOptions40.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties26.builder(mongoClientOptions40);
        int int44 = mongoClientOptions40.getHeartbeatFrequency();
        boolean boolean45 = mongoClientOptions40.isCursorFinalizerEnabled();
        com.mongodb.ReadPreference readPreference46 = mongoClientOptions40.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder47 = builder14.readPreference(readPreference46);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.requiredReplicaSetName("2162000001");
        com.mongodb.MongoClientOptions.Builder builder51 = builder47.description("8");
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder55 = builder51.heartbeatConnectTimeout((-536870901));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatConnectTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 27017 + "'", int29 == 27017);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5000 + "'", int44 == 5000);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(readPreference46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        int int1 = java.lang.Integer.lowestOneBit(7340545);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency(1100001);
        com.mongodb.DBEncoderFactory dBEncoderFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.dbEncoderFactory(dBEncoderFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        int int1 = java.lang.Integer.parseUnsignedInt("2155896593");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2139070703) + "'", int1 == (-2139070703));
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder17 = builder9.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder19 = builder9.heartbeatConnectRetryFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder21 = builder9.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder28 = builder22.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.localThreshold(500);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.socketTimeout(10);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        int int45 = mongoClientOptions44.getMaxConnectionLifeTime();
        int int46 = mongoClientOptions44.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference47 = mongoClientOptions44.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder48 = builder38.readPreference(readPreference47);
        com.mongodb.MongoClientOptions.Builder builder49 = builder9.readPreference(readPreference47);
        com.mongodb.MongoClientOptions.Builder builder50 = builder2.readPreference(readPreference47);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.maxConnectionLifeTime(27017);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder54 = builder50.minConnectionsPerHost((-1417281280));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 500 + "'", int46 == 500);
        org.junit.Assert.assertNotNull(readPreference47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions3.getReadPreference();
        boolean boolean9 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions3.getDbEncoderFactory();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions3.getSocketFactory();
        int int12 = mongoClientOptions3.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        java.lang.String str1 = java.lang.Integer.toBinaryString(33651782);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000010111110001000110" + "'", str1, "10000000010111110001000110");
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        java.lang.String str1 = java.lang.Integer.toBinaryString(80804057);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100110100001111100011011001" + "'", str1, "100110100001111100011011001");
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        int int2 = java.lang.Integer.remainderUnsigned(137, 4720000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 137 + "'", int2 == 137);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        java.lang.String str2 = java.lang.Integer.toString(939589760, 10032);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "939589760" + "'", str2, "939589760");
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("76713021", 807862272);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 807862272 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.port = 15;
        mongoProperties0.setUsername("27017");
        java.lang.String str10 = mongoProperties0.getUri();
        mongoProperties0.setUri("80803801");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int14 = mongoProperties13.getDEFAULT_PORT();
        mongoProperties13.setHost("hi!");
        java.lang.String str17 = mongoProperties13.getUri();
        mongoProperties13.database = "mongodb://localhost/test";
        java.lang.String str20 = mongoProperties13.getMongoClientDatabase();
        java.lang.String str21 = mongoProperties13.gridFsDatabase;
        java.lang.String str22 = mongoProperties13.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties23.gridFsDatabase = "hi!";
        boolean boolean26 = mongoProperties23.hasCustomAddress();
        java.lang.String str27 = mongoProperties23.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties28.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int32 = mongoProperties31.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int34 = mongoProperties33.getDEFAULT_PORT();
        mongoProperties33.setHost("hi!");
        mongoProperties33.host = "";
        mongoProperties33.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties42.gridFsDatabase = "hi!";
        char[] charArray49 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties42.setPassword(charArray49);
        mongoProperties41.setPassword(charArray49);
        mongoProperties33.setPassword(charArray49);
        mongoProperties31.password = charArray49;
        mongoProperties28.password = charArray49;
        mongoProperties23.setPassword(charArray49);
        mongoProperties13.setPassword(charArray49);
        mongoProperties0.password = charArray49;
        java.lang.String str58 = mongoProperties0.username;
        java.lang.Class<?> wildcardClass59 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str60 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "test" + "'", str27, "test");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 27017 + "'", int32 == 27017);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 27017 + "'", int34 == 27017);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "27017" + "'", str58, "27017");
        org.junit.Assert.assertNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        mongoProperties0.setPort((java.lang.Integer) 469762048);
        java.lang.String str10 = mongoProperties0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        int int18 = mongoClientOptions14.getHeartbeatFrequency();
        boolean boolean19 = mongoClientOptions14.isCursorFinalizerEnabled();
        com.mongodb.ReadPreference readPreference20 = mongoClientOptions14.getReadPreference();
        int int21 = mongoClientOptions14.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions14.getDbDecoderFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5000 + "'", int18 == 5000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(readPreference20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500 + "'", int21 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        int int1 = java.lang.Integer.lowestOneBit(100663114);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.gridFsDatabase = "hi!";
        char[] charArray19 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties12.setPassword(charArray19);
        mongoProperties11.setPassword(charArray19);
        int int22 = mongoProperties11.getDEFAULT_PORT();
        java.lang.String str23 = mongoProperties11.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.host;
        java.lang.String str26 = mongoProperties24.host;
        java.lang.Integer int27 = mongoProperties24.getPort();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        boolean boolean33 = mongoClientOptions31.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties24.builder(mongoClientOptions31);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties35.gridFsDatabase = "hi!";
        char[] charArray42 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties35.setPassword(charArray42);
        mongoProperties24.setPassword(charArray42);
        mongoProperties11.setPassword(charArray42);
        mongoProperties0.password = charArray42;
        mongoProperties0.setPort((java.lang.Integer) 610366200);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27017 + "'", int22 == 27017);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, a, #, 4]");
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setGridFsDatabase("7fffffff");
        java.lang.String str9 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7fffffff" + "'", str9, "7fffffff");
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("3288334345", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 3288334345");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        int int1 = java.lang.Integer.lowestOneBit(67108928);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(16);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxWaitTime(15);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime(1071000000);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketTimeout(72);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxWaitTime(4720000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.heartbeatSocketTimeout(20000);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionIdleTime(5);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.acceptableLatencyDifference(32);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.description("738197504");
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.acceptableLatencyDifference(393216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        int int2 = java.lang.Integer.remainderUnsigned(10032, 486539264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10032 + "'", int2 == 10032);
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str14 = mongoProperties0.getAuthenticationDatabase();
        java.lang.Class<?> wildcardClass15 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass15);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        int int1 = java.lang.Integer.reverse(68);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 570425344 + "'", int1 == 570425344);
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("452984832");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 452984832");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.getUri();
        char[] charArray10 = mongoProperties8.password;
        char[] charArray11 = mongoProperties8.password;
        char[] charArray12 = mongoProperties8.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        mongoProperties13.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        mongoProperties13.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.getUri();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties20.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties13.builder(mongoClientOptions25);
        int int29 = mongoClientOptions25.getConnectTimeout();
        int int30 = mongoClientOptions25.getConnectTimeout();
        int int31 = mongoClientOptions25.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties8.builder(mongoClientOptions25);
        java.lang.String str33 = mongoClientOptions25.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties0.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder34.build();
        int int36 = mongoClientOptions35.getHeartbeatFrequency();
        com.mongodb.DBEncoderFactory dBEncoderFactory37 = mongoClientOptions35.getDbEncoderFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5000 + "'", int36 == 5000);
        org.junit.Assert.assertNotNull(dBEncoderFactory37);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.toString();
        int int16 = mongoClientOptions14.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties5.builder(mongoClientOptions14);
        int int18 = mongoClientOptions14.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.String str20 = mongoProperties0.getUsername();
        java.lang.String str21 = mongoProperties0.authenticationDatabase;
        mongoProperties0.authenticationDatabase = "22";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int10 = mongoProperties9.getDEFAULT_PORT();
        mongoProperties9.setHost("hi!");
        mongoProperties9.host = "";
        mongoProperties9.username = "100";
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        boolean boolean21 = mongoClientOptions20.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions20.getDbDecoderFactory();
        int int23 = mongoClientOptions20.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties9.builder(mongoClientOptions20);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties26.gridFsDatabase = "hi!";
        char[] charArray33 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties26.setPassword(charArray33);
        mongoProperties25.setPassword(charArray33);
        mongoProperties9.password = charArray33;
        mongoProperties0.setPassword(charArray33);
        java.lang.String str38 = mongoProperties0.getMongoClientDatabase();
        java.lang.Class<?> wildcardClass39 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "test" + "'", str38, "test");
        org.junit.Assert.assertNull(wildcardClass39);
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectTimeout(28);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        java.lang.String str14 = mongoClientOptions13.toString();
        int int15 = mongoClientOptions13.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.host = "2";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        char[] charArray9 = mongoProperties0.getPassword();
        mongoProperties0.database = "4000000";
        mongoProperties0.username = "97";
        mongoProperties0.clearPassword();
        java.lang.String str15 = mongoProperties0.getGridFsDatabase();
        java.lang.String str16 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2" + "'", str16, "2");
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getConnectionsPerHost();
        int int8 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions3.getLocalThreshold();
        long long10 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        int int11 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        long long12 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-2147483336));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10000000100001100100101001011110");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10000000100001100100101001011110");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.uri = "11100100000000000000000000001";
        mongoProperties0.setHost("11010");
        mongoProperties0.host = "803801";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        java.lang.String str2 = java.lang.Integer.toString(32773, (-2147483364));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32773" + "'", str2, "32773");
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.database;
        java.lang.String str12 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-804206260);
        mongoProperties0.setUri("17204400");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.getHost();
        mongoProperties0.setGridFsDatabase("test");
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.port = 34;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        java.lang.Class<?> wildcardClass26 = mongoProperties0.fieldNamingStrategy;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str28 = mongoProperties27.host;
        java.lang.String str29 = mongoProperties27.host;
        java.lang.String str30 = mongoProperties27.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str32 = mongoProperties31.host;
        mongoProperties31.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass35 = mongoProperties31.fieldNamingStrategy;
        java.lang.String str36 = mongoProperties31.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.getUri();
        char[] charArray39 = new char[] {};
        mongoProperties37.setPassword(charArray39);
        mongoProperties31.setPassword(charArray39);
        mongoProperties27.setPassword(charArray39);
        mongoProperties0.password = charArray39;
        char[] charArray44 = mongoProperties0.password;
        mongoProperties0.setUri("6b");
        java.lang.Integer int47 = mongoProperties0.getPort();
        mongoProperties0.host = "a2000000";
        int int50 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 27017 + "'", int50 == 27017);
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.getUri();
        char[] charArray10 = mongoProperties8.password;
        char[] charArray11 = mongoProperties8.password;
        char[] charArray12 = mongoProperties8.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        mongoProperties13.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        mongoProperties13.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.getUri();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties20.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties13.builder(mongoClientOptions25);
        int int29 = mongoClientOptions25.getConnectTimeout();
        int int30 = mongoClientOptions25.getConnectTimeout();
        int int31 = mongoClientOptions25.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties8.builder(mongoClientOptions25);
        java.lang.String str33 = mongoClientOptions25.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties0.builder(mongoClientOptions25);
        mongoProperties0.setGridFsDatabase("478150657");
        java.lang.String str37 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("94000001");
        mongoProperties0.setUri("11101");
        mongoProperties0.setGridFsDatabase("16000000");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        javax.net.SocketFactory socketFactory9 = mongoClientOptions3.getSocketFactory();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions3.getDbEncoderFactory();
        javax.net.SocketFactory socketFactory12 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertNotNull(socketFactory12);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        mongoProperties12.username = "100";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean24 = mongoClientOptions23.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions23.getDbDecoderFactory();
        int int26 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions23);
        boolean boolean29 = mongoProperties0.hasCustomCredentials();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.getUri();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        int int36 = mongoClientOptions35.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties30.builder(mongoClientOptions35);
        java.lang.Integer int38 = mongoProperties30.getPort();
        java.lang.String str39 = mongoProperties30.getHost();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean45 = mongoClientOptions43.equals((java.lang.Object) (-2147483648));
        int int46 = mongoClientOptions43.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory47 = mongoClientOptions43.getDbDecoderFactory();
        int int48 = mongoClientOptions43.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties30.builder(mongoClientOptions43);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties51 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties51.gridFsDatabase = "hi!";
        char[] charArray58 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties51.setPassword(charArray58);
        mongoProperties50.setPassword(charArray58);
        char[] charArray61 = mongoProperties50.getPassword();
        mongoProperties30.password = charArray61;
        mongoProperties0.setPassword(charArray61);
        mongoProperties0.setGridFsDatabase("27017");
        char[] charArray66 = mongoProperties0.getPassword();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 500 + "'", int48 == 500);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[a, a, #, 4]");
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory10 = mongoClientOptions3.getDbDecoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.socketTimeout(2147483647);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.requiredReplicaSetName("3");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(31);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(499100673);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("20040034001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20040034001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        int int1 = java.lang.Integer.numberOfTrailingZeros(376832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.toString();
        int int16 = mongoClientOptions14.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties5.builder(mongoClientOptions14);
        int int18 = mongoClientOptions14.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.String str20 = mongoProperties0.host;
        char[] charArray21 = new char[] {};
        mongoProperties0.password = charArray21;
        java.lang.String str23 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        boolean boolean28 = mongoClientOptions27.isAlwaysUseMBeans();
        int int29 = mongoClientOptions27.getLocalThreshold();
        int int30 = mongoClientOptions27.getSocketTimeout();
        int int31 = mongoClientOptions27.getConnectTimeout();
        javax.net.SocketFactory socketFactory32 = mongoClientOptions27.getSocketFactory();
        com.mongodb.ReadPreference readPreference33 = mongoClientOptions27.getReadPreference();
        int int34 = mongoClientOptions27.getHeartbeatConnectRetryFrequency();
        int int35 = mongoClientOptions27.getHeartbeatThreadCount();
        int int36 = mongoClientOptions27.getAcceptableLatencyDifference();
        org.springframework.core.env.Environment environment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient38 = mongoProperties0.createMongoClient(mongoClientOptions27, environment37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10000 + "'", int31 == 10000);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertNotNull(readPreference33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 500 + "'", int34 == 500);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        java.lang.String str1 = java.lang.Integer.toOctalString(116100000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "672705640" + "'", str1, "672705640");
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxWaitTime(4000000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout((-1962934272));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions9.getWriteConcern();
        java.lang.String str12 = mongoClientOptions9.getDescription();
        int int13 = mongoClientOptions9.getAcceptableLatencyDifference();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions9.getReadPreference();
        int int15 = mongoClientOptions9.getConnectionsPerHost();
        int int16 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        int int17 = mongoClientOptions9.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1100001 + "'", int16 == 1100001);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27017 + "'", int17 == 27017);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        javax.net.SocketFactory socketFactory7 = mongoClientOptions3.getSocketFactory();
        boolean boolean8 = mongoClientOptions3.isAlwaysUseMBeans();
        int int9 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean10 = mongoClientOptions3.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(socketFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        boolean boolean7 = mongoClientOptions3.isAutoConnectRetry();
        int int8 = mongoClientOptions3.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        javax.net.SocketFactory socketFactory7 = mongoClientOptions3.getSocketFactory();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions3.getReadPreference();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(socketFactory7);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions12.getLocalThreshold();
        boolean boolean16 = mongoClientOptions12.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions12.getSocketFactory();
        javax.net.SocketFactory socketFactory18 = mongoClientOptions12.getSocketFactory();
        int int19 = mongoClientOptions12.getMaxConnectionIdleTime();
        int int20 = mongoClientOptions12.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions12);
        mongoProperties0.username = "1";
        mongoProperties0.clearPassword();
        java.lang.String str25 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(socketFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean13 = mongoClientOptions11.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory14 = mongoClientOptions11.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder15 = builder3.socketFactory(socketFactory14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder3.socketTimeout(25);
        com.mongodb.MongoClientOptions.Builder builder19 = builder3.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder28 = builder22.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder30 = builder22.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder32 = builder22.description("test");
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.heartbeatConnectTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        int int39 = mongoClientOptions38.getMaxConnectionLifeTime();
        int int40 = mongoClientOptions38.getMaxConnectionLifeTime();
        int int41 = mongoClientOptions38.getLocalThreshold();
        int int42 = mongoClientOptions38.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory43 = mongoClientOptions38.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder44 = builder34.dbEncoderFactory(dBEncoderFactory43);
        com.mongodb.MongoClientOptions.Builder builder45 = builder21.dbEncoderFactory(dBEncoderFactory43);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder45.build();
        com.mongodb.MongoClientOptions.Builder builder48 = builder45.heartbeatFrequency(1627389952);
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.maxWaitTime(295107328);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 15 + "'", int41 == 15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder27 = builder9.socketFactory(socketFactory26);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        int int32 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int33 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int34 = mongoClientOptions31.getLocalThreshold();
        int int35 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str36 = mongoClientOptions31.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions31.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder27.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.description("22");
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.heartbeatFrequency(176);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder43.build();
        int int47 = mongoClientOptions46.getMaxConnectionLifeTime();
        int int48 = mongoClientOptions46.getMaxConnectionLifeTime();
        int int49 = mongoClientOptions46.getLocalThreshold();
        int int50 = mongoClientOptions46.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str51 = mongoClientOptions46.getRequiredReplicaSetName();
        int int52 = mongoClientOptions46.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference53 = mongoClientOptions46.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder54 = builder42.readPreference(readPreference53);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5000 + "'", int52 == 5000);
        org.junit.Assert.assertNotNull(readPreference53);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        com.mongodb.MongoClientOptions.Builder builder20 = builder15.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.host;
        mongoProperties21.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass25 = mongoProperties21.fieldNamingStrategy;
        mongoProperties21.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.getUri();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        int int34 = mongoClientOptions33.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties28.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions33);
        javax.net.SocketFactory socketFactory37 = mongoClientOptions33.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder38 = builder20.socketFactory(socketFactory37);
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        boolean boolean43 = mongoClientOptions42.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory44 = mongoClientOptions42.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder38.dbEncoderFactory(dBEncoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder10.dbEncoderFactory(dBEncoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder48 = builder10.socketKeepAlive(true);
        java.lang.Class<?> wildcardClass49 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "mongodb://localhost/test" + "'", str29, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(socketFactory37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getSocketTimeout();
        java.lang.String str16 = mongoClientOptions9.toString();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions9.getWriteConcern();
        long long18 = mongoClientOptions9.getMaxAutoConnectRetryTime();
        int int19 = mongoClientOptions9.getMaxConnectionLifeTime();
        java.lang.String str20 = mongoClientOptions9.getDescription();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMinConnectionsPerHost();
        long long12 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        int int13 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions10.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        int int10 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str11 = mongoProperties0.uri;
        char[] charArray12 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1160511488));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        boolean boolean7 = mongoClientOptions6.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions6.getDbDecoderFactory();
        int int9 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions6);
        char[] charArray11 = mongoProperties0.password;
        mongoProperties0.setUsername("c43d9");
        boolean boolean14 = mongoProperties0.hasCustomCredentials();
        java.lang.Integer int15 = mongoProperties0.getPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        int int26 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str27 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str28 = mongoProperties0.gridFsDatabase;
        java.lang.String str29 = mongoProperties0.host;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 27017 + "'", int26 == 27017);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        int int1 = java.lang.Integer.bitCount(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUri("8");
        mongoProperties0.uri = "2162000001";
        boolean boolean9 = mongoProperties0.hasCustomAddress();
        mongoProperties0.authenticationDatabase = "610366200";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str12 = mongoProperties0.uri;
        mongoProperties0.uri = "811393294";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder14 = builder9.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder18 = builder9.maxConnectionLifeTime(120000);
        boolean boolean19 = mongoClientOptions3.equals((java.lang.Object) builder9);
        com.mongodb.MongoClientOptions.Builder builder21 = builder9.connectionsPerHost(120000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder23 = builder9.minHeartbeatFrequency((-1610547200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder23 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getMaxConnectionLifeTime();
        int int29 = mongoClientOptions27.getMaxConnectionLifeTime();
        int int30 = mongoClientOptions27.getLocalThreshold();
        int int31 = mongoClientOptions27.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str32 = mongoClientOptions27.getRequiredReplicaSetName();
        int int33 = mongoClientOptions27.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference34 = mongoClientOptions27.getReadPreference();
        com.mongodb.WriteConcern writeConcern35 = mongoClientOptions27.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder36 = builder23.writeConcern(writeConcern35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5000 + "'", int33 == 5000);
        org.junit.Assert.assertNotNull(readPreference34);
        org.junit.Assert.assertNotNull(writeConcern35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAlwaysUseMBeans();
        int int9 = mongoClientOptions7.getLocalThreshold();
        int int10 = mongoClientOptions7.getSocketTimeout();
        int int11 = mongoClientOptions7.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.ReadPreference readPreference13 = mongoClientOptions7.getReadPreference();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(readPreference13);
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getSocketTimeout();
        boolean boolean7 = mongoClientOptions3.isAutoConnectRetry();
        boolean boolean8 = mongoClientOptions3.isCursorFinalizerEnabled();
        boolean boolean9 = mongoClientOptions3.isAlwaysUseMBeans();
        java.lang.String str10 = mongoClientOptions3.getDescription();
        int int11 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int12 = mongoClientOptions3.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10000 + "'", int12 == 10000);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("100000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 100000000000000000000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.uri = "11610";
        char[] charArray15 = mongoProperties0.password;
        char[] charArray16 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.host;
        mongoProperties17.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass21 = mongoProperties17.fieldNamingStrategy;
        java.lang.String str22 = mongoProperties17.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str24 = mongoProperties23.host;
        mongoProperties23.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass27 = mongoProperties23.fieldNamingStrategy;
        mongoProperties23.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.getUri();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        int int36 = mongoClientOptions35.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties30.builder(mongoClientOptions35);
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties23.builder(mongoClientOptions35);
        int int39 = mongoClientOptions35.getConnectTimeout();
        int int40 = mongoClientOptions35.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties17.builder(mongoClientOptions35);
        java.lang.String str42 = mongoProperties17.database;
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder43.build();
        java.lang.String str47 = mongoClientOptions46.toString();
        int int48 = mongoClientOptions46.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties17.builder(mongoClientOptions46);
        boolean boolean50 = mongoProperties17.hasCustomCredentials();
        mongoProperties17.gridFsDatabase = "7fffffff";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str54 = mongoProperties53.host;
        org.springframework.core.env.Environment environment55 = null;
        int int56 = mongoProperties53.determinePort(environment55);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder57.build();
        boolean boolean61 = mongoClientOptions60.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory62 = mongoClientOptions60.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties53.builder(mongoClientOptions60);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions67 = builder64.build();
        int int68 = mongoClientOptions67.getMaxConnectionLifeTime();
        int int69 = mongoClientOptions67.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties53.builder(mongoClientOptions67);
        int int71 = mongoClientOptions67.getHeartbeatFrequency();
        boolean boolean72 = mongoClientOptions67.isCursorFinalizerEnabled();
        int int73 = mongoClientOptions67.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern74 = mongoClientOptions67.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder75 = mongoProperties17.builder(mongoClientOptions67);
        java.lang.String str76 = mongoProperties17.getUri();
        java.lang.Integer int77 = mongoProperties17.port;
        com.mongodb.MongoClientOptions.Builder builder78 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder80 = builder78.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions81 = builder78.build();
        boolean boolean82 = mongoClientOptions81.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory83 = mongoClientOptions81.getDbDecoderFactory();
        int int84 = mongoClientOptions81.getLocalThreshold();
        boolean boolean85 = mongoClientOptions81.isAlwaysUseMBeans();
        com.mongodb.WriteConcern writeConcern86 = mongoClientOptions81.getWriteConcern();
        int int87 = mongoClientOptions81.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder88 = mongoProperties17.builder(mongoClientOptions81);
        org.springframework.core.env.Environment environment89 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient90 = mongoProperties0.createMongoClient(mongoClientOptions81, environment89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10000 + "'", int39 == 10000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10000 + "'", int40 == 10000);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 120000 + "'", int48 == 120000);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 27017 + "'", int56 == 27017);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoClientOptions67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5000 + "'", int71 == 5000);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1342177280 + "'", int73 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "mongodb://localhost/test" + "'", str76, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int77);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(mongoClientOptions81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 15 + "'", int84 == 15);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(writeConcern86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 5 + "'", int87 == 5);
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions10.getLocalThreshold();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str15 = mongoClientOptions10.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions10.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = builder6.socketFactory(socketFactory16);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder20 = builder19.legacyDefaults();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatConnectRetryFrequency((-1509949440));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("-1610547200", 3436);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 3436 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(52);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(34);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("1");
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.acceptableLatencyDifference(1966071808);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        java.lang.String str19 = mongoClientOptions18.toString();
        int int20 = mongoClientOptions18.getMaxWaitTime();
        int int21 = mongoClientOptions18.getConnectionsPerHost();
        java.lang.String str22 = mongoClientOptions18.getRequiredReplicaSetName();
        boolean boolean23 = mongoClientOptions18.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions18.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder14.dbEncoderFactory(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        java.lang.String str1 = java.lang.Integer.toOctalString((-804206260));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32004144514" + "'", str1, "32004144514");
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("10c8e1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10c8e1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        java.lang.String str2 = java.lang.Integer.toString(3, 1174410104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3" + "'", str2, "3");
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference(1);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.localThreshold(35);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.description("11610");
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder36 = builder30.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder42 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder45.build();
        int int49 = mongoClientOptions48.getMaxConnectionLifeTime();
        int int50 = mongoClientOptions48.getMaxConnectionLifeTime();
        int int51 = mongoClientOptions48.getLocalThreshold();
        int int52 = mongoClientOptions48.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str53 = mongoClientOptions48.getRequiredReplicaSetName();
        int int54 = mongoClientOptions48.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference55 = mongoClientOptions48.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder56 = builder42.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder57 = builder29.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder58 = builder8.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder60 = builder8.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder62 = builder8.requiredReplicaSetName("-129");
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.acceptableLatencyDifference(524288);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5000 + "'", int54 == 5000);
        org.junit.Assert.assertNotNull(readPreference55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        int int16 = mongoClientOptions12.getConnectTimeout();
        int int17 = mongoClientOptions12.getAcceptableLatencyDifference();
        java.lang.String str18 = mongoClientOptions12.getDescription();
        boolean boolean19 = mongoClientOptions12.isAutoConnectRetry();
        int int20 = mongoClientOptions12.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime(1100100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime(2240);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionIdleTime(66388080);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.socketTimeout(2147483647);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.requiredReplicaSetName("3");
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(53182464);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.acceptableLatencyDifference(536870912);
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.minConnectionsPerHost(109051904);
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.minHeartbeatFrequency(268435472);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.autoConnectRetry(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.socketKeepAlive(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int28 = mongoProperties27.getDEFAULT_PORT();
        mongoProperties27.setHost("hi!");
        mongoProperties27.host = "";
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        java.lang.String str37 = mongoClientOptions36.toString();
        int int38 = mongoClientOptions36.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties27.builder(mongoClientOptions36);
        int int40 = mongoClientOptions36.getConnectTimeout();
        javax.net.SocketFactory socketFactory41 = mongoClientOptions36.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder42 = builder26.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder43 = builder15.socketFactory(socketFactory41);
        com.mongodb.MongoClientOptions.Builder builder45 = builder15.maxAutoConnectRetryTime((long) 120000);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.heartbeatConnectRetryFrequency(10000);
        com.mongodb.DBDecoderFactory dBDecoderFactory48 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder49 = builder45.dbDecoderFactory(dBDecoderFactory48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 27017 + "'", int28 == 27017);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10000 + "'", int40 == 10000);
        org.junit.Assert.assertNotNull(socketFactory41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory7 = mongoClientOptions3.getDbEncoderFactory();
        int int8 = mongoClientOptions3.getSocketTimeout();
        int int9 = mongoClientOptions3.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions9.getMaxConnectionLifeTime();
        java.lang.String str12 = mongoClientOptions9.getRequiredReplicaSetName();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions9.getDbDecoderFactory();
        int int14 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        mongoProperties0.uri = "";
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setGridFsDatabase("65536");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        mongoProperties13.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        mongoProperties13.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.getUri();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties20.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties13.builder(mongoClientOptions25);
        javax.net.SocketFactory socketFactory29 = mongoClientOptions25.getSocketFactory();
        int int30 = mongoClientOptions25.getHeartbeatConnectRetryFrequency();
        java.lang.String str31 = mongoClientOptions25.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions25);
        boolean boolean33 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        int int2 = java.lang.Integer.max(8402945, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8402945 + "'", int2 == 8402945);
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        int int2 = java.lang.Integer.min(32773, (-1594890685));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1594890685) + "'", int2 == (-1594890685));
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder14 = builder9.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder18 = builder9.maxConnectionLifeTime(120000);
        boolean boolean19 = mongoClientOptions3.equals((java.lang.Object) builder9);
        com.mongodb.MongoClientOptions.Builder builder21 = builder9.connectionsPerHost(120000);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime(20000);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        com.mongodb.MongoClientOptions.Builder builder31 = builder26.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        boolean boolean38 = mongoClientOptions37.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions37.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder33.dbEncoderFactory(dBEncoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder23.dbEncoderFactory(dBEncoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxAutoConnectRetryTime((long) 985);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions9.getWriteConcern();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(writeConcern16);
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
        int int16 = mongoClientOptions9.getMaxWaitTime();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions9.getSocketFactory();
        boolean boolean18 = mongoClientOptions9.isAlwaysUseMBeans();
        boolean boolean19 = mongoClientOptions9.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory20 = mongoClientOptions9.getDbEncoderFactory();
        boolean boolean21 = mongoClientOptions9.isSocketKeepAlive();
        int int22 = mongoClientOptions9.getAcceptableLatencyDifference();
        int int23 = mongoClientOptions9.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 120000 + "'", int16 == 120000);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        int int7 = mongoClientOptions3.getLocalThreshold();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getHeartbeatThreadCount();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("8001d4bf", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 8001d4bf");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        int int2 = java.lang.Integer.divideUnsigned(268435461, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2684354 + "'", int2 == 2684354);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str11 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setHost("c43d9");
        java.lang.String str14 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str15 = mongoProperties0.authenticationDatabase;
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        int int7 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int8 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions3.getHeartbeatConnectTimeout();
        long long10 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        java.lang.Class<?> wildcardClass26 = mongoProperties0.fieldNamingStrategy;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str28 = mongoProperties27.host;
        java.lang.String str29 = mongoProperties27.host;
        java.lang.String str30 = mongoProperties27.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str32 = mongoProperties31.host;
        mongoProperties31.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass35 = mongoProperties31.fieldNamingStrategy;
        java.lang.String str36 = mongoProperties31.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.getUri();
        char[] charArray39 = new char[] {};
        mongoProperties37.setPassword(charArray39);
        mongoProperties31.setPassword(charArray39);
        mongoProperties27.setPassword(charArray39);
        mongoProperties0.password = charArray39;
        char[] charArray44 = mongoProperties0.password;
        mongoProperties0.host = "test";
        mongoProperties0.setDatabase("10000000000000000000000100111000");
        java.lang.String str49 = mongoProperties0.host;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "test" + "'", str49, "test");
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        int int1 = java.lang.Integer.numberOfTrailingZeros(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.String str13 = mongoProperties0.getHost();
        mongoProperties0.setUri("4e20");
        boolean boolean16 = mongoProperties0.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.host;
        java.lang.String str19 = mongoProperties17.host;
        java.lang.Integer int20 = mongoProperties17.getPort();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        boolean boolean26 = mongoClientOptions24.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties17.builder(mongoClientOptions24);
        int int28 = mongoClientOptions24.getThreadsAllowedToBlockForConnectionMultiplier();
        int int29 = mongoClientOptions24.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions24);
        java.lang.String str31 = mongoClientOptions24.getDescription();
        com.mongodb.WriteConcern writeConcern32 = mongoClientOptions24.getWriteConcern();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 120000 + "'", int29 == 120000);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(writeConcern32);
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatConnectTimeout(35);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions19.getLocalThreshold();
        int int23 = mongoClientOptions19.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions19.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder14.dbEncoderFactory(dBEncoderFactory24);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.host;
        org.springframework.core.env.Environment environment28 = null;
        int int29 = mongoProperties26.determinePort(environment28);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        boolean boolean34 = mongoClientOptions33.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory35 = mongoClientOptions33.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties26.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        int int41 = mongoClientOptions40.getMaxConnectionLifeTime();
        int int42 = mongoClientOptions40.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties26.builder(mongoClientOptions40);
        int int44 = mongoClientOptions40.getHeartbeatFrequency();
        boolean boolean45 = mongoClientOptions40.isCursorFinalizerEnabled();
        com.mongodb.ReadPreference readPreference46 = mongoClientOptions40.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder47 = builder14.readPreference(readPreference46);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.requiredReplicaSetName("2162000001");
        com.mongodb.MongoClientOptions.Builder builder51 = builder47.heartbeatConnectRetryFrequency(5000);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.maxAutoConnectRetryTime(578813952L);
        com.mongodb.MongoClientOptions.Builder builder55 = builder51.description("1102");
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.heartbeatSocketTimeout(2684354);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 27017 + "'", int29 == 27017);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5000 + "'", int44 == 5000);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(readPreference46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.uri = "10";
        char[] charArray10 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "1c";
        mongoProperties0.setGridFsDatabase("9792256");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int16 = mongoProperties15.getDEFAULT_PORT();
        mongoProperties15.setHost("hi!");
        mongoProperties15.host = "";
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        java.lang.String str25 = mongoClientOptions24.toString();
        int int26 = mongoClientOptions24.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties15.builder(mongoClientOptions24);
        int int28 = mongoClientOptions24.getConnectTimeout();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions24.getSocketFactory();
        int int30 = mongoClientOptions24.getHeartbeatConnectRetryFrequency();
        int int31 = mongoClientOptions24.getConnectionsPerHost();
        java.lang.String str32 = mongoClientOptions24.getRequiredReplicaSetName();
        int int33 = mongoClientOptions24.getMinHeartbeatFrequency();
        java.lang.String str34 = mongoClientOptions24.getRequiredReplicaSetName();
        int int35 = mongoClientOptions24.getMinHeartbeatFrequency();
        org.springframework.core.env.Environment environment36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient37 = mongoProperties0.createMongoClient(mongoClientOptions24, environment36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20000 + "'", int26 == 20000);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10000 + "'", int28 == 10000);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 500 + "'", int33 == 500);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 500 + "'", int35 == 500);
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "1100001";
        mongoProperties0.uri = "101";
        mongoProperties0.uri = "-1610612736";
        java.lang.String str15 = mongoProperties0.authenticationDatabase;
        java.lang.String str16 = mongoProperties0.getHost();
        boolean boolean17 = mongoProperties0.hasCustomCredentials();
        java.lang.String str18 = mongoProperties0.host;
        mongoProperties0.database = "352256";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions3.getConnectionsPerHost();
        int int8 = mongoClientOptions3.getSocketTimeout();
        int int9 = mongoClientOptions3.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("8000", 19584512);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 19584512 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.minHeartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxConnectionLifeTime(11);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.connectionsPerHost(298319873);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout(105906176);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.minConnectionsPerHost(11610);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-1681772544));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10011011110000100011000000000000" + "'", str1, "10011011110000100011000000000000");
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        int int1 = java.lang.Integer.reverseBytes(11101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1563099136 + "'", int1 == 1563099136);
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder11.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatSocketTimeout(1100001);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int18 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.setHost("hi!");
        mongoProperties17.host = "";
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        java.lang.String str27 = mongoClientOptions26.toString();
        int int28 = mongoClientOptions26.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties17.builder(mongoClientOptions26);
        int int30 = mongoClientOptions26.getConnectTimeout();
        javax.net.SocketFactory socketFactory31 = mongoClientOptions26.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory32 = mongoClientOptions26.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder33 = builder12.dbDecoderFactory(dBDecoderFactory32);
        com.mongodb.MongoClientOptions.Builder builder34 = builder8.dbDecoderFactory(dBDecoderFactory32);
        com.mongodb.MongoClientOptions.Builder builder36 = builder8.heartbeatFrequency(13);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.requiredReplicaSetName("21004600200");
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.connectTimeout(1798517552);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertNotNull(socketFactory31);
        org.junit.Assert.assertNotNull(dBDecoderFactory32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int8 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions6.getLocalThreshold();
        boolean boolean10 = mongoClientOptions6.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions6.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.socketFactory(socketFactory11);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder25 = builder19.acceptableLatencyDifference(5);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.requiredReplicaSetName("8");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.host;
        mongoProperties28.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass32 = mongoProperties28.fieldNamingStrategy;
        java.lang.String str33 = mongoProperties28.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        com.mongodb.MongoClientOptions.Builder builder41 = builder36.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.host;
        mongoProperties42.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass46 = mongoProperties42.fieldNamingStrategy;
        mongoProperties42.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties49 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str50 = mongoProperties49.getUri();
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder51.build();
        int int55 = mongoClientOptions54.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties49.builder(mongoClientOptions54);
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties42.builder(mongoClientOptions54);
        javax.net.SocketFactory socketFactory58 = mongoClientOptions54.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder41.socketFactory(socketFactory58);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder59.build();
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties28.builder(mongoClientOptions60);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties62 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str63 = mongoProperties62.host;
        org.springframework.core.env.Environment environment64 = null;
        int int65 = mongoProperties62.determinePort(environment64);
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions69 = builder66.build();
        boolean boolean70 = mongoClientOptions69.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory71 = mongoClientOptions69.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder72 = mongoProperties62.builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder73 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder75 = builder73.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions76 = builder73.build();
        int int77 = mongoClientOptions76.getMaxConnectionLifeTime();
        int int78 = mongoClientOptions76.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder79 = mongoProperties62.builder(mongoClientOptions76);
        int int80 = mongoClientOptions76.getHeartbeatFrequency();
        boolean boolean81 = mongoClientOptions76.isCursorFinalizerEnabled();
        int int82 = mongoClientOptions76.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern83 = mongoClientOptions76.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder84 = builder61.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder85 = builder25.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder86 = builder12.writeConcern(writeConcern83);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder88 = builder12.maxAutoConnectRetryTime((long) (-2146433022));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "mongodb://localhost/test" + "'", str50, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(socketFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 27017 + "'", int65 == 27017);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClientOptions69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(mongoClientOptions76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 5000 + "'", int80 == 5000);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1342177280 + "'", int82 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray9 = mongoProperties0.getPassword();
        java.lang.String str10 = mongoProperties0.database;
        boolean boolean11 = mongoProperties0.hasCustomCredentials();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        boolean boolean16 = mongoClientOptions15.isAlwaysUseMBeans();
        int int17 = mongoClientOptions15.getLocalThreshold();
        long long18 = mongoClientOptions15.getMaxAutoConnectRetryTime();
        int int19 = mongoClientOptions15.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder26 = builder20.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        int int39 = mongoClientOptions38.getMaxConnectionLifeTime();
        int int40 = mongoClientOptions38.getMaxConnectionLifeTime();
        int int41 = mongoClientOptions38.getLocalThreshold();
        int int42 = mongoClientOptions38.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str43 = mongoClientOptions38.getRequiredReplicaSetName();
        int int44 = mongoClientOptions38.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference45 = mongoClientOptions38.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder46 = builder32.readPreference(readPreference45);
        boolean boolean47 = mongoClientOptions15.equals((java.lang.Object) readPreference45);
        boolean boolean48 = mongoClientOptions15.isCursorFinalizerEnabled();
        int int49 = mongoClientOptions15.getHeartbeatConnectRetryFrequency();
        boolean boolean50 = mongoClientOptions15.isCursorFinalizerEnabled();
        org.springframework.core.env.Environment environment51 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient52 = mongoProperties0.createMongoClient(mongoClientOptions15, environment51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: spring.data.mongodb.port=0 and no local mongo port configuration is available");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 15 + "'", int41 == 15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5000 + "'", int44 == 5000);
        org.junit.Assert.assertNotNull(readPreference45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 500 + "'", int49 == 500);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "";
        java.lang.Integer int6 = mongoProperties0.port;
        java.lang.String str7 = mongoProperties0.database;
        java.lang.Integer int8 = mongoProperties0.getPort();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.port;
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties8.determinePort(environment10);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        boolean boolean16 = mongoClientOptions15.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions15.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties8.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        int int23 = mongoClientOptions22.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions22.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties8.builder(mongoClientOptions22);
        boolean boolean26 = mongoClientOptions22.isAutoConnectRetry();
        boolean boolean27 = mongoClientOptions22.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions22);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str30 = mongoProperties29.host;
        java.lang.String str31 = mongoProperties29.host;
        java.lang.Integer int32 = mongoProperties29.getPort();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        boolean boolean38 = mongoClientOptions36.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties29.builder(mongoClientOptions36);
        int int40 = mongoClientOptions36.getThreadsAllowedToBlockForConnectionMultiplier();
        int int41 = mongoClientOptions36.getMaxWaitTime();
        java.lang.String str42 = mongoClientOptions36.toString();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties0.builder(mongoClientOptions36);
        java.lang.String str44 = mongoProperties0.getUsername();
        java.lang.String str45 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties0.builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.heartbeatConnectTimeout(803801);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 120000 + "'", int41 == 120000);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("-1610547200", (-1033373947));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1033373947 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("43", (-1610612736));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1610612736 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.uri;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb://localhost/test" + "'", str2, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int4 = mongoProperties3.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        mongoProperties5.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        char[] charArray21 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties14.setPassword(charArray21);
        mongoProperties13.setPassword(charArray21);
        mongoProperties5.setPassword(charArray21);
        mongoProperties3.password = charArray21;
        mongoProperties0.password = charArray21;
        java.lang.String str27 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        boolean boolean32 = mongoClientOptions31.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory33 = mongoClientOptions31.getDbEncoderFactory();
        int int34 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        int int35 = mongoClientOptions31.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions31);
        int int37 = mongoClientOptions31.getMaxConnectionIdleTime();
        int int38 = mongoClientOptions31.getLocalThreshold();
        int int39 = mongoClientOptions31.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1342177280 + "'", int35 == 1342177280);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        boolean boolean18 = mongoClientOptions14.isSocketKeepAlive();
        int int19 = mongoClientOptions14.getLocalThreshold();
        java.lang.String str20 = mongoClientOptions14.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isCursorFinalizerEnabled();
        com.mongodb.MongoClient mongoClient13 = mongoProperties0.createMongoClient(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        boolean boolean18 = mongoClientOptions17.isAlwaysUseMBeans();
        int int19 = mongoClientOptions17.getLocalThreshold();
        int int20 = mongoClientOptions17.getSocketTimeout();
        int int21 = mongoClientOptions17.getConnectTimeout();
        javax.net.SocketFactory socketFactory22 = mongoClientOptions17.getSocketFactory();
        int int23 = mongoClientOptions17.getLocalThreshold();
        boolean boolean24 = mongoClientOptions17.isSocketKeepAlive();
        boolean boolean25 = mongoClientOptions17.isAlwaysUseMBeans();
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions17.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions17);
        java.lang.String str28 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mongoClient13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertNotNull(socketFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(writeConcern26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionIdleTime(5);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        java.lang.String str19 = mongoClientOptions18.toString();
        int int20 = mongoClientOptions18.getHeartbeatFrequency();
        int int21 = mongoClientOptions18.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory22 = mongoClientOptions18.getDbEncoderFactory();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions18.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = builder14.writeConcern(writeConcern23);
        com.mongodb.MongoClientOptions.Builder builder26 = builder14.connectTimeout(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5000 + "'", int20 == 5000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory22);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setPort((java.lang.Integer) 4);
        mongoProperties0.setDatabase("90");
        java.lang.String str22 = mongoProperties0.getMongoClientDatabase();
        char[] charArray23 = mongoProperties0.password;
        mongoProperties0.uri = "149159936";
        mongoProperties0.gridFsDatabase = "1000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "90" + "'", str22, "90");
        org.junit.Assert.assertNull(charArray23);
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.String str3 = mongoProperties0.gridFsDatabase;
        java.lang.String str4 = mongoProperties0.database;
        mongoProperties0.port = (-1);
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("217");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 217");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.host;
        mongoProperties11.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass15 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.getUri();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties18.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties11.builder(mongoClientOptions23);
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions23.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder28 = builder10.writeConcern(writeConcern27);
        com.mongodb.MongoClientOptions.Builder builder30 = builder10.localThreshold(15);
        com.mongodb.MongoClientOptions.Builder builder32 = builder10.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder38 = builder32.localThreshold(17210368);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.getUri();
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        int int45 = mongoClientOptions44.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties39.builder(mongoClientOptions44);
        java.lang.Integer int47 = mongoProperties39.getPort();
        java.lang.String str48 = mongoProperties39.getHost();
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder49.build();
        boolean boolean54 = mongoClientOptions52.equals((java.lang.Object) (-2147483648));
        int int55 = mongoClientOptions52.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory56 = mongoClientOptions52.getDbDecoderFactory();
        int int57 = mongoClientOptions52.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties39.builder(mongoClientOptions52);
        com.mongodb.DBEncoderFactory dBEncoderFactory59 = mongoClientOptions52.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder60 = builder38.dbEncoderFactory(dBEncoderFactory59);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(writeConcern27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "mongodb://localhost/test" + "'", str40, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 500 + "'", int57 == 500);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(dBEncoderFactory59);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime(176L);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int8 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions6.getLocalThreshold();
        int int10 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions6.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.dbEncoderFactory(dBEncoderFactory11);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(402653184);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.getUri();
        char[] charArray7 = new char[] {};
        mongoProperties5.setPassword(charArray7);
        mongoProperties0.password = charArray7;
        java.lang.String str10 = mongoProperties0.getHost();
        mongoProperties0.setGridFsDatabase("1111111111111111111111111111111");
        int int13 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(8192);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8192" + "'", str1, "8192");
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        int int1 = java.lang.Integer.highestOneBit(640);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatThreadCount(74579968);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(35);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout(369098778);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("3154444288", 1268400949);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1268400949 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxWaitTime(15);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.getUri();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties5.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean17 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory18 = mongoClientOptions16.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder19 = builder12.dbEncoderFactory(dBEncoderFactory18);
        com.mongodb.MongoClientOptions.Builder builder20 = builder4.dbEncoderFactory(dBEncoderFactory18);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions5.getMaxWaitTime();
        int int10 = mongoClientOptions5.getHeartbeatThreadCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.database = "27017";
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        int int2 = java.lang.Integer.divideUnsigned(1100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getMaxConnectionLifeTime();
        int int17 = mongoClientOptions15.getMaxConnectionLifeTime();
        int int18 = mongoClientOptions15.getLocalThreshold();
        int int19 = mongoClientOptions15.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str20 = mongoClientOptions15.getRequiredReplicaSetName();
        int int21 = mongoClientOptions15.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions15.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = builder2.dbDecoderFactory(dBDecoderFactory22);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        boolean boolean28 = mongoClientOptions27.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory29 = mongoClientOptions27.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder2.dbEncoderFactory(dBEncoderFactory29);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minHeartbeatFrequency(1795162112);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5000 + "'", int21 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        int int1 = java.lang.Integer.highestOneBit(858811187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536870912 + "'", int1 == 536870912);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.requiredReplicaSetName("333311202213000");
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        boolean boolean25 = mongoClientOptions24.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory26 = mongoClientOptions24.getDbDecoderFactory();
        int int27 = mongoClientOptions24.getLocalThreshold();
        boolean boolean28 = mongoClientOptions24.isAlwaysUseMBeans();
        long long29 = mongoClientOptions24.getMaxAutoConnectRetryTime();
        javax.net.SocketFactory socketFactory30 = mongoClientOptions24.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = builder20.socketFactory(socketFactory30);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.threadsAllowedToBlockForConnectionMultiplier(8388608);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        int int2 = java.lang.Integer.sum(67108928, 82595940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149704868 + "'", int2 == 149704868);
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10056");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        int int2 = java.lang.Integer.remainderUnsigned(116100000, 545266689);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116100000 + "'", int2 == 116100000);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        java.lang.String str15 = mongoProperties13.host;
        java.lang.Integer int16 = mongoProperties13.getPort();
        mongoProperties13.setDatabase("11i71");
        mongoProperties13.port = 2147483647;
        mongoProperties13.port = 1342177280;
        mongoProperties13.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str26 = mongoProperties25.getUri();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        int int31 = mongoClientOptions30.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties25.builder(mongoClientOptions30);
        java.lang.Integer int33 = mongoProperties25.getPort();
        java.lang.String str34 = mongoProperties25.getHost();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        boolean boolean40 = mongoClientOptions38.equals((java.lang.Object) (-2147483648));
        int int41 = mongoClientOptions38.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory42 = mongoClientOptions38.getDbDecoderFactory();
        int int43 = mongoClientOptions38.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties25.builder(mongoClientOptions38);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties45 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties46.gridFsDatabase = "hi!";
        char[] charArray53 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties46.setPassword(charArray53);
        mongoProperties45.setPassword(charArray53);
        char[] charArray56 = mongoProperties45.getPassword();
        mongoProperties25.password = charArray56;
        mongoProperties13.password = charArray56;
        mongoProperties0.setPassword(charArray56);
        mongoProperties0.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties61 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str62 = mongoProperties61.getUri();
        com.mongodb.MongoClientOptions.Builder builder63 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions66 = builder63.build();
        int int67 = mongoClientOptions66.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder68 = mongoProperties61.builder(mongoClientOptions66);
        com.mongodb.MongoClientOptions.Builder builder69 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions72 = builder69.build();
        boolean boolean73 = mongoClientOptions72.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory74 = mongoClientOptions72.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder75 = builder68.dbEncoderFactory(dBEncoderFactory74);
        com.mongodb.MongoClientOptions.Builder builder77 = builder68.connectionsPerHost(10);
        com.mongodb.MongoClientOptions mongoClientOptions78 = builder77.build();
        int int79 = mongoClientOptions78.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder80 = mongoProperties0.builder(mongoClientOptions78);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb://localhost/test" + "'", str26, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 500 + "'", int43 == 500);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[\000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "mongodb://localhost/test" + "'", str62, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(mongoClientOptions66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(mongoClientOptions72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(mongoClientOptions78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 15 + "'", int79 == 15);
        org.junit.Assert.assertNotNull(builder80);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int10 = mongoProperties9.getDEFAULT_PORT();
        mongoProperties9.setHost("hi!");
        mongoProperties9.host = "";
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        java.lang.String str19 = mongoClientOptions18.toString();
        int int20 = mongoClientOptions18.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties9.builder(mongoClientOptions18);
        int int22 = mongoClientOptions18.getConnectTimeout();
        javax.net.SocketFactory socketFactory23 = mongoClientOptions18.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder24 = builder0.socketFactory(socketFactory23);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder0.build();
        int int26 = mongoClientOptions25.getMaxConnectionLifeTime();
        int int27 = mongoClientOptions25.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertNotNull(socketFactory23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        int int2 = java.lang.Integer.rotateRight((-268435456), (-2006327552));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-268435456) + "'", int2 == (-268435456));
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("11010");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 11010");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        boolean boolean12 = mongoClientOptions11.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        char[] charArray13 = mongoProperties0.password;
        mongoProperties0.setPort((java.lang.Integer) (-47480831));
        java.lang.String str16 = mongoProperties0.host;
        java.lang.String str17 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setUri("10000000001");
        mongoProperties0.authenticationDatabase = "69";
        java.lang.String str22 = mongoProperties0.uri;
        mongoProperties0.uri = "10001000000100110000000010000000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10000000001" + "'", str22, "10000000001");
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.database;
        mongoProperties0.port = 1071000000;
        mongoProperties0.setUri("80001388");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAlwaysUseMBeans();
        int int9 = mongoClientOptions7.getLocalThreshold();
        int int10 = mongoClientOptions7.getSocketTimeout();
        int int11 = mongoClientOptions7.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions7);
        java.lang.String str13 = mongoProperties0.getHost();
        java.lang.String str14 = mongoProperties0.username;
        java.lang.String str15 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.username = "2415919104";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "test" + "'", str15, "test");
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setAuthenticationDatabase("2147483960");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11i71" + "'", str7, "11i71");
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.uri = "11610";
        java.lang.String str15 = mongoProperties0.authenticationDatabase;
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setPort((java.lang.Integer) 37289984);
        java.lang.String str19 = mongoProperties0.authenticationDatabase;
        java.lang.String str20 = mongoProperties0.getHost();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        java.lang.String str2 = java.lang.Integer.toString((-1346368000), (-2147483336));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1346368000" + "'", str2, "-1346368000");
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionIdleTime(5);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxAutoConnectRetryTime((long) (-2147478648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        int int16 = mongoClientOptions12.getConnectTimeout();
        int int17 = mongoClientOptions12.getConnectTimeout();
        int int18 = mongoClientOptions12.getConnectionsPerHost();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions12.getDbEncoderFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory20 = mongoClientOptions12.getDbEncoderFactory();
        int int21 = mongoClientOptions12.getAcceptableLatencyDifference();
        boolean boolean22 = mongoClientOptions12.isAlwaysUseMBeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertNotNull(dBEncoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions11.getDbDecoderFactory();
        int int14 = mongoClientOptions11.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions11);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.host;
        java.lang.String str18 = mongoProperties16.host;
        java.lang.Integer int19 = mongoProperties16.getPort();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean25 = mongoClientOptions23.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties16.builder(mongoClientOptions23);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties27.gridFsDatabase = "hi!";
        char[] charArray34 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties27.setPassword(charArray34);
        mongoProperties16.setPassword(charArray34);
        mongoProperties0.setPassword(charArray34);
        boolean boolean38 = mongoProperties0.hasCustomAddress();
        java.lang.String str39 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        int int2 = java.lang.Integer.sum(939589760, 13312);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 939603072 + "'", int2 == 939603072);
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        mongoProperties12.username = "100";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean24 = mongoClientOptions23.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions23.getDbDecoderFactory();
        int int26 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions23);
        java.lang.Class<?> wildcardClass29 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setGridFsDatabase("803801");
        java.lang.Integer int32 = mongoProperties0.port;
        mongoProperties0.port = 19584512;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(int32);
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int7 = mongoProperties6.getDEFAULT_PORT();
        mongoProperties6.setHost("hi!");
        mongoProperties6.host = "";
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties6.builder(mongoClientOptions17);
        java.lang.String str19 = mongoProperties6.getHost();
        mongoProperties6.setUri("4e20");
        char[] charArray28 = new char[] { ' ', '#', '4', '4', '4', ' ' };
        mongoProperties6.setPassword(charArray28);
        mongoProperties0.password = charArray28;
        java.lang.String str31 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "461436702";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " #444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " #444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , #, 4, 4, 4,  ]");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(469827712);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxWaitTime(47040);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxAutoConnectRetryTime((long) 5);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.cursorFinalizerEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder20 = builder14.heartbeatFrequency((-268435456));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAlwaysUseMBeans();
        int int9 = mongoClientOptions7.getLocalThreshold();
        int int10 = mongoClientOptions7.getSocketTimeout();
        int int11 = mongoClientOptions7.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions7);
        java.lang.String str13 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        java.lang.String str18 = mongoClientOptions17.toString();
        int int19 = mongoClientOptions17.getMaxWaitTime();
        int int20 = mongoClientOptions17.getMaxWaitTime();
        int int21 = mongoClientOptions17.getLocalThreshold();
        long long22 = mongoClientOptions17.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.autoConnectRetry(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120000 + "'", int19 == 120000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        char[] charArray13 = mongoProperties0.password;
        mongoProperties0.setPort((java.lang.Integer) (-47480831));
        java.lang.String str16 = mongoProperties0.host;
        java.lang.String str17 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setUri("10000000001");
        mongoProperties0.authenticationDatabase = "69";
        java.lang.String str22 = mongoProperties0.uri;
        mongoProperties0.setDatabase("69");
        mongoProperties0.uri = "402653184";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10000000001" + "'", str22, "10000000001");
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int10 = mongoProperties9.getDEFAULT_PORT();
        mongoProperties9.setHost("hi!");
        mongoProperties9.host = "";
        mongoProperties9.username = "100";
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        boolean boolean21 = mongoClientOptions20.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions20.getDbDecoderFactory();
        int int23 = mongoClientOptions20.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties9.builder(mongoClientOptions20);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties26.gridFsDatabase = "hi!";
        char[] charArray33 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties26.setPassword(charArray33);
        mongoProperties25.setPassword(charArray33);
        mongoProperties9.password = charArray33;
        mongoProperties0.setPassword(charArray33);
        java.lang.String str38 = mongoProperties0.getMongoClientDatabase();
        boolean boolean39 = mongoProperties0.hasCustomAddress();
        char[] charArray40 = mongoProperties0.getPassword();
        java.lang.String str41 = mongoProperties0.username;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "test" + "'", str38, "test");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        java.lang.String str2 = java.lang.Integer.toString((int) '4', 26214400);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUsername("");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray10 = mongoProperties0.password;
        mongoProperties0.database = "27";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray10);
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        boolean boolean11 = mongoClientOptions7.isSocketKeepAlive();
        int int12 = mongoClientOptions7.getLocalThreshold();
        int int13 = mongoClientOptions7.getLocalThreshold();
        int int14 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions7.getDbDecoderFactory();
        int int16 = mongoClientOptions7.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder20 = builder19.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.localThreshold((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder31 = builder23.acceptableLatencyDifference(214748364);
        boolean boolean32 = mongoClientOptions7.equals((java.lang.Object) builder31);
        int int33 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        java.lang.String str13 = mongoProperties0.username;
        mongoProperties0.setUri("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.getUri();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        int int22 = mongoClientOptions21.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties16.builder(mongoClientOptions21);
        org.springframework.core.env.Environment environment24 = null;
        int int25 = mongoProperties16.determinePort(environment24);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties26.gridFsDatabase = "hi!";
        char[] charArray33 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties26.setPassword(charArray33);
        mongoProperties26.setDatabase("hi!");
        java.lang.String str37 = mongoProperties26.getGridFsDatabase();
        char[] charArray38 = mongoProperties26.password;
        mongoProperties16.setPassword(charArray38);
        mongoProperties0.setPassword(charArray38);
        mongoProperties0.authenticationDatabase = "32000000007";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 27017 + "'", int25 == 27017);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[a, a, #, 4]");
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.toString();
        int int16 = mongoClientOptions14.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties5.builder(mongoClientOptions14);
        int int18 = mongoClientOptions14.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.String str20 = mongoProperties0.host;
        char[] charArray21 = new char[] {};
        mongoProperties0.password = charArray21;
        mongoProperties0.database = "27017";
        mongoProperties0.setPort((java.lang.Integer) 128);
        mongoProperties0.setHost("100001100110011010011");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        mongoProperties6.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass10 = mongoProperties6.fieldNamingStrategy;
        mongoProperties6.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions18);
        int int22 = mongoClientOptions18.getConnectTimeout();
        int int23 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions18);
        int int25 = mongoClientOptions18.getMaxConnectionIdleTime();
        java.lang.String str26 = mongoClientOptions18.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        int int1 = java.lang.Integer.parseUnsignedInt("11234");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11234 + "'", int1 == 11234);
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        int int2 = java.lang.Integer.rotateRight((-2147483364), (-1879048192));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483364) + "'", int2 == (-2147483364));
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUsername("");
        java.lang.String str9 = mongoProperties0.uri;
        char[] charArray10 = null;
        mongoProperties0.password = charArray10;
        boolean boolean12 = mongoProperties0.hasCustomAddress();
        java.lang.String str13 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "test" + "'", str13, "test");
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "637534208";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.setHost("");
        mongoProperties9.username = "100";
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(27017);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        mongoProperties9.fieldNamingStrategy = wildcardClass17;
        mongoProperties9.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int22 = mongoProperties21.getDEFAULT_PORT();
        mongoProperties21.setHost("hi!");
        mongoProperties21.host = "";
        mongoProperties21.username = "100";
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        boolean boolean33 = mongoClientOptions32.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory34 = mongoClientOptions32.getDbDecoderFactory();
        int int35 = mongoClientOptions32.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties9.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.heartbeatThreadCount(67108864);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.maxWaitTime(214748364);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder43.build();
        com.mongodb.MongoClientOptions.Builder builder46 = builder43.connectTimeout(6250);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder46.build();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties0.builder(mongoClientOptions47);
        mongoProperties0.clearPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27017 + "'", int22 == 27017);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        int int1 = java.lang.Integer.numberOfTrailingZeros(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        int int2 = java.lang.Integer.rotateRight(6250, 858811187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51200000 + "'", int2 == 51200000);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        int int13 = mongoClientOptions12.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120000 + "'", int13 == 120000);
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        java.lang.String str1 = java.lang.Integer.toHexString(764);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2fc" + "'", str1, "2fc");
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(69);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier(578813952);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.socketKeepAlive(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1136);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("4000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 4000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1437335554", 3407872);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 3407872 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        boolean boolean5 = mongoClientOptions3.isAutoConnectRetry();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        int int7 = mongoClientOptions3.getHeartbeatThreadCount();
        int int8 = mongoClientOptions3.getConnectTimeout();
        int int9 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int10 = mongoClientOptions3.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10000 + "'", int8 == 10000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.Integer int8 = mongoProperties0.getPort();
        mongoProperties0.database = "4294967295";
        java.lang.String str11 = mongoProperties0.getUri();
        java.lang.String str12 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("30000000027");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"30000000027\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        int int2 = java.lang.Integer.sum((-1140523008), 828498432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-312024576) + "'", int2 == (-312024576));
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatThreadCount(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.host;
        mongoProperties15.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass19 = mongoProperties15.fieldNamingStrategy;
        mongoProperties15.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.getUri();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties22.builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties15.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern32 = mongoClientOptions27.getWriteConcern();
        int int33 = mongoClientOptions27.getLocalThreshold();
        com.mongodb.ReadPreference readPreference34 = mongoClientOptions27.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder35 = builder14.readPreference(readPreference34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder41 = builder35.minConnectionsPerHost(11010);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.connectionsPerHost(101100);
        java.lang.Class<?> wildcardClass44 = builder41.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "mongodb://localhost/test" + "'", str23, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(writeConcern32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertNotNull(readPreference34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        java.lang.String str2 = java.lang.Integer.toString(578813952, 393216);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "578813952" + "'", str2, "578813952");
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.getHost();
        java.lang.Integer int6 = mongoProperties0.port;
        java.lang.String str7 = mongoProperties0.getHost();
        mongoProperties0.authenticationDatabase = "8869df00";
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties0.determinePort(environment10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties6.gridFsDatabase = "hi!";
        char[] charArray13 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties6.setPassword(charArray13);
        mongoProperties5.setPassword(charArray13);
        boolean boolean16 = mongoClientOptions3.equals((java.lang.Object) mongoProperties5);
        mongoProperties5.authenticationDatabase = "30";
        mongoProperties5.setDatabase("10000000001");
        java.lang.Integer int21 = mongoProperties5.port;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(int21);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getConnectionsPerHost();
        int int7 = mongoClientOptions3.getMinHeartbeatFrequency();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        java.lang.String str1 = java.lang.Integer.toHexString(1677721600);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64000000" + "'", str1, "64000000");
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        int int2 = java.lang.Integer.rotateLeft(2684354, 486539264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2684354 + "'", int2 == 2684354);
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        mongoProperties6.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass10 = mongoProperties6.fieldNamingStrategy;
        mongoProperties6.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions18);
        int int22 = mongoClientOptions18.getConnectTimeout();
        int int23 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions18);
        java.lang.String str25 = mongoProperties0.database;
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        java.lang.String str30 = mongoClientOptions29.toString();
        int int31 = mongoClientOptions29.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions29);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder36 = builder35.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder40 = builder36.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder42 = builder36.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatThreadCount((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.description("1");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str48 = mongoProperties47.host;
        java.lang.String str49 = mongoProperties47.host;
        java.lang.Integer int50 = mongoProperties47.getPort();
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder51.build();
        boolean boolean56 = mongoClientOptions54.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties47.builder(mongoClientOptions54);
        int int58 = mongoClientOptions54.getThreadsAllowedToBlockForConnectionMultiplier();
        int int59 = mongoClientOptions54.getMaxWaitTime();
        int int60 = mongoClientOptions54.getMinHeartbeatFrequency();
        boolean boolean61 = mongoClientOptions54.isCursorFinalizerEnabled();
        com.mongodb.DBEncoderFactory dBEncoderFactory62 = mongoClientOptions54.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder63 = builder44.dbEncoderFactory(dBEncoderFactory62);
        com.mongodb.MongoClientOptions.Builder builder64 = builder32.dbEncoderFactory(dBEncoderFactory62);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 120000 + "'", int31 == 120000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 120000 + "'", int59 == 120000);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 500 + "'", int60 == 500);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dBEncoderFactory62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        char[] charArray13 = mongoProperties0.password;
        mongoProperties0.setPort((java.lang.Integer) (-47480831));
        java.lang.String str16 = mongoProperties0.host;
        java.lang.String str17 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setUri("10000000001");
        mongoProperties0.authenticationDatabase = "69";
        java.lang.String str22 = mongoProperties0.uri;
        mongoProperties0.setDatabase("69");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str26 = mongoProperties25.host;
        java.lang.String str27 = mongoProperties25.host;
        java.lang.Integer int28 = mongoProperties25.getPort();
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        boolean boolean34 = mongoClientOptions32.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties25.builder(mongoClientOptions32);
        boolean boolean36 = mongoClientOptions32.isSocketKeepAlive();
        int int37 = mongoClientOptions32.getLocalThreshold();
        int int38 = mongoClientOptions32.getHeartbeatConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient39 = mongoProperties0.createMongoClient(mongoClientOptions32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10000000001" + "'", str22, "10000000001");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("11110110011001100110011010001001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11110110011001100110011010001001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatConnectTimeout(499100673);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.requiredReplicaSetName("1001110001000");
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1071013312");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        int int2 = java.lang.Integer.compareUnsigned(2947841, 369098778);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectRetryFrequency(2147483647);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatConnectTimeout(6086926);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency(578813952);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((-691221492));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        mongoProperties6.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass10 = mongoProperties6.fieldNamingStrategy;
        mongoProperties6.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions18);
        javax.net.SocketFactory socketFactory22 = mongoClientOptions18.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = builder3.socketFactory(socketFactory22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxWaitTime(500);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder27.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxWaitTime(64);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder38 = builder33.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.host;
        mongoProperties39.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass43 = mongoProperties39.fieldNamingStrategy;
        mongoProperties39.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str47 = mongoProperties46.getUri();
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        int int52 = mongoClientOptions51.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties46.builder(mongoClientOptions51);
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties39.builder(mongoClientOptions51);
        javax.net.SocketFactory socketFactory55 = mongoClientOptions51.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder56 = builder38.socketFactory(socketFactory55);
        com.mongodb.MongoClientOptions.Builder builder57 = builder28.socketFactory(socketFactory55);
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.heartbeatFrequency(805306368);
        com.mongodb.MongoClientOptions.Builder builder62 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder66 = builder62.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder72 = builder68.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder74 = builder72.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder75 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder77 = builder75.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions78 = builder75.build();
        boolean boolean79 = mongoClientOptions78.isAlwaysUseMBeans();
        int int80 = mongoClientOptions78.getLocalThreshold();
        int int81 = mongoClientOptions78.getSocketTimeout();
        javax.net.SocketFactory socketFactory82 = mongoClientOptions78.getSocketFactory();
        boolean boolean83 = mongoClientOptions78.isAlwaysUseMBeans();
        com.mongodb.DBDecoderFactory dBDecoderFactory84 = mongoClientOptions78.getDbDecoderFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory85 = mongoClientOptions78.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder86 = builder72.dbEncoderFactory(dBEncoderFactory85);
        com.mongodb.MongoClientOptions.Builder builder87 = builder61.dbEncoderFactory(dBEncoderFactory85);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(socketFactory22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "mongodb://localhost/test" + "'", str47, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(socketFactory55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(mongoClientOptions78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 15 + "'", int80 == 15);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(socketFactory82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory84);
        org.junit.Assert.assertNotNull(dBEncoderFactory85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        int int2 = java.lang.Integer.min((-531988736), 402767888);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-531988736) + "'", int2 == (-531988736));
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        java.lang.String str7 = mongoProperties0.username;
        java.lang.String str8 = mongoProperties0.uri;
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setUsername("1744830464");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency(1100001);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.acceptableLatencyDifference(80803801);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder35 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.maxConnectionLifeTime((int) '4');
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder43.build();
        java.lang.String str47 = mongoClientOptions46.toString();
        int int48 = mongoClientOptions46.getHeartbeatFrequency();
        int int49 = mongoClientOptions46.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory50 = mongoClientOptions46.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder51 = builder40.dbEncoderFactory(dBEncoderFactory50);
        com.mongodb.MongoClientOptions.Builder builder52 = builder39.dbEncoderFactory(dBEncoderFactory50);
        com.mongodb.MongoClientOptions.Builder builder53 = builder22.dbEncoderFactory(dBEncoderFactory50);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.socketTimeout(3);
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5000 + "'", int48 == 5000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(180814862);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "180814862" + "'", str1, "180814862");
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        char[] charArray14 = new char[] { '#', 'a', '#', '4', 'a', ' ' };
        mongoProperties0.password = charArray14;
        java.lang.String str16 = mongoProperties0.gridFsDatabase;
        mongoProperties0.host = "40000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a, #, 4, a,  ]");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        mongoProperties0.setDatabase("2200002");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1306525534));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        java.lang.String str11 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        int int27 = mongoClientOptions21.getSocketTimeout();
        java.lang.String str28 = mongoClientOptions21.toString();
        com.mongodb.WriteConcern writeConcern29 = mongoClientOptions21.getWriteConcern();
        long long30 = mongoClientOptions21.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties0.builder(mongoClientOptions21);
        char[] charArray32 = mongoProperties0.getPassword();
        java.lang.String str33 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(writeConcern29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        java.lang.String str2 = java.lang.Integer.toString(104, 6989);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "104" + "'", str2, "104");
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int4 = mongoProperties3.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        mongoProperties5.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        char[] charArray21 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties14.setPassword(charArray21);
        mongoProperties13.setPassword(charArray21);
        mongoProperties5.setPassword(charArray21);
        mongoProperties3.password = charArray21;
        mongoProperties0.password = charArray21;
        java.lang.String str27 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        boolean boolean32 = mongoClientOptions31.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory33 = mongoClientOptions31.getDbEncoderFactory();
        int int34 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        int int35 = mongoClientOptions31.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions31);
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions31.getReadPreference();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.host;
        org.springframework.core.env.Environment environment40 = null;
        int int41 = mongoProperties38.determinePort(environment40);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.build();
        boolean boolean46 = mongoClientOptions45.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory47 = mongoClientOptions45.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties38.builder(mongoClientOptions45);
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder49.build();
        int int53 = mongoClientOptions52.getMaxConnectionLifeTime();
        int int54 = mongoClientOptions52.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties38.builder(mongoClientOptions52);
        int int56 = mongoClientOptions52.getHeartbeatFrequency();
        boolean boolean57 = mongoClientOptions52.isCursorFinalizerEnabled();
        int int58 = mongoClientOptions52.getMinConnectionsPerHost();
        boolean boolean59 = mongoClientOptions31.equals((java.lang.Object) mongoClientOptions52);
        int int60 = mongoClientOptions31.getMinConnectionsPerHost();
        com.mongodb.DBDecoderFactory dBDecoderFactory61 = mongoClientOptions31.getDbDecoderFactory();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1342177280 + "'", int35 == 1342177280);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 27017 + "'", int41 == 27017);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5000 + "'", int56 == 5000);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1342177280 + "'", int58 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1342177280 + "'", int60 == 1342177280);
        org.junit.Assert.assertNotNull(dBDecoderFactory61);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        int int2 = java.lang.Integer.divideUnsigned(452984832, 637534208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency(1100001);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder27 = builder21.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder29 = builder21.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder31 = builder21.description("test");
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.heartbeatConnectTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        com.mongodb.MongoClientOptions.Builder builder41 = builder36.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.host;
        mongoProperties42.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass46 = mongoProperties42.fieldNamingStrategy;
        mongoProperties42.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties49 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str50 = mongoProperties49.getUri();
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder51.build();
        int int55 = mongoClientOptions54.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties49.builder(mongoClientOptions54);
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties42.builder(mongoClientOptions54);
        javax.net.SocketFactory socketFactory58 = mongoClientOptions54.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder41.socketFactory(socketFactory58);
        com.mongodb.MongoClientOptions.Builder builder60 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions63 = builder60.build();
        boolean boolean64 = mongoClientOptions63.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory65 = mongoClientOptions63.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder66 = builder59.dbEncoderFactory(dBEncoderFactory65);
        com.mongodb.MongoClientOptions.Builder builder67 = builder31.dbEncoderFactory(dBEncoderFactory65);
        com.mongodb.MongoClientOptions.Builder builder68 = builder20.dbEncoderFactory(dBEncoderFactory65);
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder72 = builder68.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder74 = builder72.heartbeatFrequency(53182464);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "mongodb://localhost/test" + "'", str50, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(socketFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClientOptions63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.autoConnectRetry(true);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getLocalThreshold();
        int int15 = mongoClientOptions13.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("30");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 30");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUri("10");
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.build();
        int int9 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int10 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions8.getLocalThreshold();
        int int12 = mongoClientOptions8.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions8.getDbEncoderFactory();
        int int14 = mongoClientOptions8.getSocketTimeout();
        int int15 = mongoClientOptions8.getHeartbeatFrequency();
        boolean boolean16 = mongoClientOptions8.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions8);
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions8.getReadPreference();
        int int19 = mongoClientOptions8.getHeartbeatConnectRetryFrequency();
        int int20 = mongoClientOptions8.getSocketTimeout();
        int int21 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions8.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5000 + "'", int15 == 5000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int4 = mongoProperties3.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        mongoProperties5.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        char[] charArray21 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties14.setPassword(charArray21);
        mongoProperties13.setPassword(charArray21);
        mongoProperties5.setPassword(charArray21);
        mongoProperties3.password = charArray21;
        mongoProperties0.password = charArray21;
        java.lang.String str27 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        boolean boolean32 = mongoClientOptions31.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory33 = mongoClientOptions31.getDbEncoderFactory();
        int int34 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        int int35 = mongoClientOptions31.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions31);
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions31.getReadPreference();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.host;
        org.springframework.core.env.Environment environment40 = null;
        int int41 = mongoProperties38.determinePort(environment40);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.build();
        boolean boolean46 = mongoClientOptions45.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory47 = mongoClientOptions45.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties38.builder(mongoClientOptions45);
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder49.build();
        int int53 = mongoClientOptions52.getMaxConnectionLifeTime();
        int int54 = mongoClientOptions52.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties38.builder(mongoClientOptions52);
        int int56 = mongoClientOptions52.getHeartbeatFrequency();
        boolean boolean57 = mongoClientOptions52.isCursorFinalizerEnabled();
        int int58 = mongoClientOptions52.getMinConnectionsPerHost();
        boolean boolean59 = mongoClientOptions31.equals((java.lang.Object) mongoClientOptions52);
        int int60 = mongoClientOptions52.getSocketTimeout();
        int int61 = mongoClientOptions52.getMaxConnectionLifeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1342177280 + "'", int35 == 1342177280);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 27017 + "'", int41 == 27017);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5000 + "'", int56 == 5000);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1342177280 + "'", int58 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory31 = mongoClientOptions29.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder25.dbEncoderFactory(dBEncoderFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.acceptableLatencyDifference((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder37 = builder36.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder39 = builder36.connectionsPerHost(50331745);
        com.mongodb.MongoClientOptions.Builder builder41 = builder36.maxWaitTime(65368);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(52);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.WriteConcern writeConcern12 = mongoClientOptions11.getWriteConcern();
        boolean boolean13 = mongoClientOptions11.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(writeConcern12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.localThreshold(500);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatConnectRetryFrequency(37);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.heartbeatSocketTimeout(101101);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatThreadCount((-161061274));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        java.lang.String str1 = java.lang.Integer.toOctalString(80804057);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "464174331" + "'", str1, "464174331");
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        int int1 = java.lang.Integer.parseInt("4096");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("298319873", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 298319873");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.getPort();
        char[] charArray7 = mongoProperties0.password;
        mongoProperties0.setDatabase("100");
        mongoProperties0.setHost("2684354568");
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        boolean boolean17 = mongoClientOptions15.equals((java.lang.Object) (-2147483648));
        int int18 = mongoClientOptions15.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions15.getDbDecoderFactory();
        int int20 = mongoClientOptions15.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions15);
        boolean boolean22 = mongoClientOptions15.isCursorFinalizerEnabled();
        int int23 = mongoClientOptions15.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions3.getDbEncoderFactory();
        int int6 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        int int7 = mongoClientOptions3.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder15 = builder10.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.host;
        mongoProperties16.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass20 = mongoProperties16.fieldNamingStrategy;
        mongoProperties16.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str24 = mongoProperties23.getUri();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        int int29 = mongoClientOptions28.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties23.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties16.builder(mongoClientOptions28);
        javax.net.SocketFactory socketFactory32 = mongoClientOptions28.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder33 = builder15.socketFactory(socketFactory32);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        boolean boolean38 = mongoClientOptions37.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions37.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder33.dbEncoderFactory(dBEncoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.minHeartbeatFrequency(53182464);
        boolean boolean45 = mongoClientOptions3.equals((java.lang.Object) builder42);
        com.mongodb.MongoClientOptions.Builder builder47 = builder42.minHeartbeatFrequency(10000);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        java.lang.String str52 = mongoClientOptions51.toString();
        int int53 = mongoClientOptions51.getMaxWaitTime();
        int int54 = mongoClientOptions51.getConnectionsPerHost();
        int int55 = mongoClientOptions51.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.WriteConcern writeConcern56 = mongoClientOptions51.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder57 = builder42.writeConcern(writeConcern56);
        com.mongodb.MongoClientOptions.Builder builder59 = builder42.maxConnectionLifeTime(268435461);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1342177280 + "'", int7 == 1342177280);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb://localhost/test" + "'", str24, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 120000 + "'", int53 == 120000);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertNotNull(writeConcern56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.localThreshold(500);
        com.mongodb.MongoClientOptions.Builder builder17 = builder16.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.requiredReplicaSetName("26");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        java.lang.Class<?> wildcardClass26 = mongoProperties0.fieldNamingStrategy;
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        int int37 = mongoClientOptions36.getMaxConnectionLifeTime();
        int int38 = mongoClientOptions36.getMaxConnectionLifeTime();
        java.lang.String str39 = mongoClientOptions36.getRequiredReplicaSetName();
        java.lang.String str40 = mongoClientOptions36.getRequiredReplicaSetName();
        int int41 = mongoClientOptions36.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties0.builder(mongoClientOptions36);
        int int43 = mongoClientOptions36.getMaxConnectionLifeTime();
        java.lang.String str44 = mongoClientOptions36.getDescription();
        com.mongodb.WriteConcern writeConcern45 = mongoClientOptions36.getWriteConcern();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(writeConcern45);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        char[] charArray7 = mongoProperties0.getPassword();
        mongoProperties0.setAuthenticationDatabase("2e");
        char[] charArray10 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(charArray10);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties6.gridFsDatabase = "hi!";
        char[] charArray13 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties6.setPassword(charArray13);
        mongoProperties5.setPassword(charArray13);
        boolean boolean16 = mongoClientOptions3.equals((java.lang.Object) mongoProperties5);
        long long17 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        long long18 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions3.getDbEncoderFactory();
        int int20 = mongoClientOptions3.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("17777777777");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 17777777777 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int4 = mongoProperties3.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        mongoProperties5.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        char[] charArray21 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties14.setPassword(charArray21);
        mongoProperties13.setPassword(charArray21);
        mongoProperties5.setPassword(charArray21);
        mongoProperties3.password = charArray21;
        mongoProperties0.password = charArray21;
        java.lang.String str27 = mongoProperties0.gridFsDatabase;
        java.lang.String str28 = mongoProperties0.host;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        int int1 = java.lang.Integer.bitCount((-973078528));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.setUsername("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        java.lang.String str11 = mongoClientOptions10.toString();
        int int12 = mongoClientOptions10.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions10);
        boolean boolean14 = mongoClientOptions10.isAlwaysUseMBeans();
        com.mongodb.DBEncoderFactory dBEncoderFactory15 = mongoClientOptions10.getDbEncoderFactory();
        int int16 = mongoClientOptions10.getLocalThreshold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5000 + "'", int12 == 5000);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.Integer int8 = mongoProperties0.getPort();
        java.lang.String str9 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean15 = mongoClientOptions13.equals((java.lang.Object) (-2147483648));
        int int16 = mongoClientOptions13.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions13.getDbDecoderFactory();
        int int18 = mongoClientOptions13.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions13);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.alwaysUseMBeans(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.getUri();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties22.builder(mongoClientOptions27);
        int int30 = mongoClientOptions27.getMaxConnectionLifeTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory31 = mongoClientOptions27.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder19.dbEncoderFactory(dBEncoderFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder19.heartbeatConnectTimeout(872415232);
        com.mongodb.MongoClientOptions.Builder builder36 = builder19.description("1003400100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "mongodb://localhost/test" + "'", str23, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        mongoProperties0.setUri("hi!");
        java.lang.Class<?> wildcardClass9 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str10 = mongoProperties0.getUri();
        java.lang.String str11 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1100001" + "'", str11, "1100001");
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        boolean boolean11 = mongoClientOptions7.isSocketKeepAlive();
        int int12 = mongoClientOptions7.getLocalThreshold();
        int int13 = mongoClientOptions7.getLocalThreshold();
        int int14 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions7.getDbDecoderFactory();
        boolean boolean17 = mongoClientOptions7.isSocketKeepAlive();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions7.getDbDecoderFactory();
        int int19 = mongoClientOptions7.getHeartbeatThreadCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray9 = mongoProperties0.getPassword();
        java.lang.String str10 = mongoProperties0.getDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.getUri();
        char[] charArray7 = new char[] {};
        mongoProperties5.setPassword(charArray7);
        mongoProperties0.password = charArray7;
        mongoProperties0.setPort((java.lang.Integer) 100011);
        java.lang.String str12 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime(1100100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.heartbeatThreadCount((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.description("20000");
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.heartbeatConnectRetryFrequency(1440351);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.socketTimeout(117440720);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        int int2 = java.lang.Integer.rotateRight(4521984, (-256));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4521984 + "'", int2 == 4521984);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1342177280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("80864a5e");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"80864a5e\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        int int2 = java.lang.Integer.compare(1101011, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        boolean boolean11 = mongoClientOptions7.isSocketKeepAlive();
        int int12 = mongoClientOptions7.getLocalThreshold();
        int int13 = mongoClientOptions7.getLocalThreshold();
        int int14 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions7.getDbDecoderFactory();
        boolean boolean17 = mongoClientOptions7.isSocketKeepAlive();
        int int18 = mongoClientOptions7.getConnectionsPerHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment9 = null;
        int int10 = mongoProperties0.determinePort(environment9);
        java.lang.Class<?> wildcardClass11 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = (-1006632951);
        mongoProperties0.clearPassword();
        mongoProperties0.uri = "65536";
        java.lang.String str17 = mongoProperties0.host;
        java.lang.String str18 = mongoProperties0.host;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.requiredReplicaSetName("7fffffff");
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder23 = builder15.heartbeatConnectTimeout(402653184);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties25.gridFsDatabase = "hi!";
        char[] charArray32 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties25.setPassword(charArray32);
        mongoProperties24.setPassword(charArray32);
        java.lang.String str35 = mongoProperties24.getHost();
        mongoProperties24.setHost("test");
        java.lang.String str38 = mongoProperties24.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        boolean boolean44 = mongoClientOptions42.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties24.builder(mongoClientOptions42);
        com.mongodb.WriteConcern writeConcern46 = mongoClientOptions42.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder47 = builder23.writeConcern(writeConcern46);
        com.mongodb.MongoClientOptions.Builder builder48 = builder14.writeConcern(writeConcern46);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder50 = builder14.socketTimeout((-1404006394));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(writeConcern46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-2147483648), 436207638);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2147483648" + "'", str2, "2147483648");
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        int int1 = java.lang.Integer.lowestOneBit(80100802);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        int int2 = java.lang.Integer.sum(524288, 10566);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534854 + "'", int2 == 534854);
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.requiredReplicaSetName("1388");
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.maxConnectionIdleTime(13398328);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUri("1100100");
        mongoProperties0.setUri("1");
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean15 = mongoClientOptions13.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory16 = mongoClientOptions13.getSocketFactory();
        boolean boolean17 = mongoClientOptions13.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions13);
        java.lang.Object obj19 = null;
        boolean boolean20 = mongoClientOptions13.equals(obj19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("20480000", 1388);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1388 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str14 = mongoProperties0.authenticationDatabase;
        java.lang.String str15 = mongoProperties0.gridFsDatabase;
        java.lang.String str16 = mongoProperties0.getHost();
        mongoProperties0.setDatabase("50331745");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1126503424);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000011001001010001010000000000" + "'", str1, "1000011001001010001010000000000");
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(14680065);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14680065" + "'", str1, "14680065");
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory10 = mongoClientOptions3.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions3.getDbDecoderFactory();
        int int12 = mongoClientOptions3.getMaxConnectionLifeTime();
        long long13 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        java.lang.String str14 = mongoClientOptions3.toString();
        javax.net.SocketFactory socketFactory15 = mongoClientOptions3.getSocketFactory();
        int int16 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(socketFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 500 + "'", int16 == 500);
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getConnectTimeout();
        int int17 = mongoClientOptions15.getMaxConnectionIdleTime();
        int int18 = mongoClientOptions15.getMaxWaitTime();
        boolean boolean19 = mongoClientOptions15.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120000 + "'", int18 == 120000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        int int2 = java.lang.Integer.rotateLeft(16667143, 14152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28178688) + "'", int2 == (-28178688));
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        int int1 = java.lang.Integer.reverseBytes((-312024576));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14837485 + "'", int1 == 14837485);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.acceptableLatencyDifference(5);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatThreadCount(29);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        int int1 = java.lang.Integer.reverseBytes(36700160);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12290 + "'", int1 == 12290);
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions.Builder builder1 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.connectTimeout(84674746);
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.maxConnectionIdleTime(2240);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.database = "";
        java.lang.String str5 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions9.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions9);
        int int14 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions9.getHeartbeatFrequency();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5000 + "'", int15 == 5000);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("11000110000000000000000000000000", (-1923934412));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1923934412 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        int int1 = java.lang.Integer.numberOfTrailingZeros(47040);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.database = "";
        java.lang.String str5 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions9.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions9);
        mongoProperties0.uri = "107";
        java.lang.String str16 = mongoProperties0.gridFsDatabase;
        mongoProperties0.database = "4720000";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        int int2 = java.lang.Integer.compare(176, 12173852);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        int int1 = java.lang.Integer.reverse(61000000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43206080 + "'", int1 == 43206080);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("316197090");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 316197090");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.connectionsPerHost(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        mongoProperties12.username = "100";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean24 = mongoClientOptions23.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions23.getDbDecoderFactory();
        int int26 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions23);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties29.gridFsDatabase = "hi!";
        char[] charArray36 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties29.setPassword(charArray36);
        mongoProperties28.setPassword(charArray36);
        mongoProperties12.password = charArray36;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.host;
        mongoProperties40.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass44 = mongoProperties40.fieldNamingStrategy;
        java.lang.String str45 = mongoProperties40.getDatabase();
        java.lang.String str46 = mongoProperties40.getUsername();
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.build();
        boolean boolean51 = mongoClientOptions50.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties53.gridFsDatabase = "hi!";
        char[] charArray60 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties53.setPassword(charArray60);
        mongoProperties52.setPassword(charArray60);
        boolean boolean63 = mongoClientOptions50.equals((java.lang.Object) mongoProperties52);
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties40.builder(mongoClientOptions50);
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties12.builder(mongoClientOptions50);
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder68 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions71 = builder68.build();
        int int72 = mongoClientOptions71.getMaxConnectionLifeTime();
        int int73 = mongoClientOptions71.getMaxConnectionLifeTime();
        int int74 = mongoClientOptions71.getLocalThreshold();
        int int75 = mongoClientOptions71.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str76 = mongoClientOptions71.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern77 = mongoClientOptions71.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder78 = builder65.writeConcern(writeConcern77);
        com.mongodb.MongoClientOptions.Builder builder79 = builder11.writeConcern(writeConcern77);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoClientOptions71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 15 + "'", int74 == 15);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 5 + "'", int75 == 5);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(writeConcern77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions3.getMinHeartbeatFrequency();
        int int10 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int11 = mongoClientOptions3.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("2600000000", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 2600000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        int int1 = java.lang.Integer.signum(33651782);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        char[] charArray13 = mongoProperties0.password;
        mongoProperties0.setPort((java.lang.Integer) (-47480831));
        java.lang.String str16 = mongoProperties0.host;
        java.lang.String str17 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.username = "32";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("17204400", 1073741824);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1073741824 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        java.lang.Integer int20 = mongoProperties12.getPort();
        java.lang.String str21 = mongoProperties12.getHost();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        boolean boolean27 = mongoClientOptions25.equals((java.lang.Object) (-2147483648));
        int int28 = mongoClientOptions25.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory29 = mongoClientOptions25.getDbDecoderFactory();
        int int30 = mongoClientOptions25.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties12.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions25);
        mongoProperties0.setGridFsDatabase("1000011001001010001010000000000");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean14 = mongoClientOptions13.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory15 = mongoClientOptions13.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.dbEncoderFactory(dBEncoderFactory15);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(2200002);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.connectTimeout(1617323622);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str9 = mongoProperties0.database;
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        boolean boolean15 = mongoClientOptions9.isAutoConnectRetry();
        int int16 = mongoClientOptions9.getLocalThreshold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        int int16 = mongoClientOptions12.getConnectTimeout();
        int int17 = mongoClientOptions12.getHeartbeatConnectTimeout();
        int int18 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        int int19 = mongoClientOptions12.getHeartbeatSocketTimeout();
        int int20 = mongoClientOptions12.getLocalThreshold();
        boolean boolean21 = mongoClientOptions12.isSocketKeepAlive();
        int int22 = mongoClientOptions12.getHeartbeatFrequency();
        int int23 = mongoClientOptions12.getHeartbeatConnectTimeout();
        int int24 = mongoClientOptions12.getAcceptableLatencyDifference();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5000 + "'", int22 == 5000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
        int int16 = mongoClientOptions9.getConnectionsPerHost();
        java.lang.String str17 = mongoClientOptions9.getRequiredReplicaSetName();
        int int18 = mongoClientOptions9.getMinHeartbeatFrequency();
        int int19 = mongoClientOptions9.getMaxConnectionLifeTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("11000110000000000000000000000000", 217);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 217 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 444;
        java.lang.String str16 = mongoProperties0.getMongoClientDatabase();
        char[] charArray17 = mongoProperties0.getPassword();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, a, #, 4]");
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str9 = mongoProperties0.getHost();
        java.lang.String str10 = mongoProperties0.database;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.host;
        mongoProperties11.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass15 = mongoProperties11.fieldNamingStrategy;
        java.lang.String str16 = mongoProperties11.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.getUri();
        char[] charArray19 = new char[] {};
        mongoProperties17.setPassword(charArray19);
        mongoProperties11.setPassword(charArray19);
        mongoProperties0.setPassword(charArray19);
        java.lang.String str23 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.getDatabase();
        mongoProperties0.port = 16777216;
        mongoProperties0.uri = "90";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        org.springframework.core.env.Environment environment16 = null;
        int int17 = mongoProperties14.determinePort(environment16);
        mongoProperties14.setPort((java.lang.Integer) 27017);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties14.builder(mongoClientOptions29);
        int int32 = mongoClientOptions29.getAcceptableLatencyDifference();
        com.mongodb.MongoClient mongoClient33 = mongoProperties0.createMongoClient(mongoClientOptions29);
        long long34 = mongoClientOptions29.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27017 + "'", int17 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 27017 + "'", int32 == 27017);
        org.junit.Assert.assertNotNull(mongoClient33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.threadsAllowedToBlockForConnectionMultiplier(1);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder23 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        com.mongodb.MongoClientOptions.Builder builder37 = builder32.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder39 = builder32.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int43 = mongoProperties42.getDEFAULT_PORT();
        mongoProperties42.setHost("hi!");
        mongoProperties42.host = "";
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        java.lang.String str52 = mongoClientOptions51.toString();
        int int53 = mongoClientOptions51.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties42.builder(mongoClientOptions51);
        int int55 = mongoClientOptions51.getConnectTimeout();
        javax.net.SocketFactory socketFactory56 = mongoClientOptions51.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory57 = mongoClientOptions51.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder58 = builder41.dbDecoderFactory(dBDecoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder59 = builder23.dbDecoderFactory(dBDecoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder60 = builder13.dbDecoderFactory(dBDecoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder61 = builder12.dbDecoderFactory(dBDecoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.threadsAllowedToBlockForConnectionMultiplier(69);
        com.mongodb.MongoClientOptions.Builder builder65 = builder61.socketTimeout(26);
        java.lang.Class<?> wildcardClass66 = builder61.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 27017 + "'", int43 == 27017);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20000 + "'", int53 == 20000);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10000 + "'", int55 == 10000);
        org.junit.Assert.assertNotNull(socketFactory56);
        org.junit.Assert.assertNotNull(dBDecoderFactory57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        int int2 = java.lang.Integer.compareUnsigned(35, 1102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        java.lang.String str9 = mongoProperties0.uri;
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.socketKeepAlive(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        mongoProperties14.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass18 = mongoProperties14.fieldNamingStrategy;
        java.lang.String str19 = mongoProperties14.getDatabase();
        java.lang.String str20 = mongoProperties14.getUsername();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        boolean boolean25 = mongoClientOptions24.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties27.gridFsDatabase = "hi!";
        char[] charArray34 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties27.setPassword(charArray34);
        mongoProperties26.setPassword(charArray34);
        boolean boolean37 = mongoClientOptions24.equals((java.lang.Object) mongoProperties26);
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties14.builder(mongoClientOptions24);
        com.mongodb.DBDecoderFactory dBDecoderFactory39 = mongoClientOptions24.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder11.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder11.socketKeepAlive(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str44 = mongoProperties43.host;
        mongoProperties43.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass47 = mongoProperties43.fieldNamingStrategy;
        mongoProperties43.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str51 = mongoProperties50.getUri();
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions55 = builder52.build();
        int int56 = mongoClientOptions55.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties50.builder(mongoClientOptions55);
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties43.builder(mongoClientOptions55);
        int int59 = mongoClientOptions55.getConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory60 = mongoClientOptions55.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder61 = builder11.dbDecoderFactory(dBDecoderFactory60);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder63 = builder11.threadsAllowedToBlockForConnectionMultiplier((-2145648352));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "mongodb://localhost/test" + "'", str51, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(mongoClientOptions55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10000 + "'", int59 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory60);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        int int1 = java.lang.Integer.numberOfTrailingZeros(16777216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1000101);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000101" + "'", str1, "1000101");
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(52);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.threadsAllowedToBlockForConnectionMultiplier((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder12.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder15 = builder12.socketTimeout(605440);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int17 = mongoProperties16.getDEFAULT_PORT();
        mongoProperties16.setHost("hi!");
        mongoProperties16.host = "";
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        java.lang.String str26 = mongoClientOptions25.toString();
        int int27 = mongoClientOptions25.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties16.builder(mongoClientOptions25);
        int int29 = mongoClientOptions25.getConnectTimeout();
        javax.net.SocketFactory socketFactory30 = mongoClientOptions25.getSocketFactory();
        int int31 = mongoClientOptions25.getSocketTimeout();
        java.lang.String str32 = mongoClientOptions25.getDescription();
        java.lang.String str33 = mongoClientOptions25.toString();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int35 = mongoProperties34.getDEFAULT_PORT();
        mongoProperties34.setHost("hi!");
        mongoProperties34.host = "";
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        java.lang.String str44 = mongoClientOptions43.toString();
        int int45 = mongoClientOptions43.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties34.builder(mongoClientOptions43);
        int int47 = mongoClientOptions43.getConnectTimeout();
        javax.net.SocketFactory socketFactory48 = mongoClientOptions43.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory49 = mongoClientOptions43.getDbDecoderFactory();
        int int50 = mongoClientOptions43.getHeartbeatThreadCount();
        int int51 = mongoClientOptions43.getAcceptableLatencyDifference();
        javax.net.SocketFactory socketFactory52 = mongoClientOptions43.getSocketFactory();
        boolean boolean53 = mongoClientOptions25.equals((java.lang.Object) socketFactory52);
        com.mongodb.MongoClientOptions.Builder builder54 = builder12.socketFactory(socketFactory52);
        com.mongodb.MongoClientOptions.Builder builder56 = builder12.acceptableLatencyDifference(2097152);
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.cursorFinalizerEnabled(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27017 + "'", int17 == 27017);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 27017 + "'", int35 == 27017);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10000 + "'", int47 == 10000);
        org.junit.Assert.assertNotNull(socketFactory48);
        org.junit.Assert.assertNotNull(dBDecoderFactory49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
        org.junit.Assert.assertNotNull(socketFactory52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder27 = builder9.socketFactory(socketFactory26);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.connectionsPerHost(8402945);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        com.mongodb.MongoClientOptions.Builder builder37 = builder32.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean44 = mongoClientOptions43.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory45 = mongoClientOptions43.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder46 = builder39.dbEncoderFactory(dBEncoderFactory45);
        com.mongodb.MongoClientOptions.Builder builder47 = builder27.dbEncoderFactory(dBEncoderFactory45);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.connectionsPerHost(65536);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.build();
        int int51 = mongoClientOptions50.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 65536 + "'", int51 == 65536);
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str11 = mongoProperties0.uri;
        mongoProperties0.host = "1b";
        java.lang.String str14 = mongoProperties0.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.host;
        org.springframework.core.env.Environment environment17 = null;
        int int18 = mongoProperties15.determinePort(environment17);
        java.lang.String str19 = mongoProperties15.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.getUri();
        char[] charArray22 = new char[] {};
        mongoProperties20.setPassword(charArray22);
        mongoProperties15.password = charArray22;
        mongoProperties0.password = charArray22;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2" + "'", str11, "2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1b" + "'", str14, "1b");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "test" + "'", str19, "test");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.database = "";
        java.lang.String str5 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.host;
        mongoProperties17.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass21 = mongoProperties17.fieldNamingStrategy;
        mongoProperties17.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.getUri();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties24.builder(mongoClientOptions29);
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties17.builder(mongoClientOptions29);
        com.mongodb.WriteConcern writeConcern33 = mongoClientOptions29.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder34 = builder16.writeConcern(writeConcern33);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minHeartbeatFrequency(35);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties0.builder(mongoClientOptions37);
        mongoProperties0.setDatabase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mongodb://localhost/test" + "'", str25, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(writeConcern33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        java.lang.String str1 = java.lang.Integer.toOctalString(180841879);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1261666627" + "'", str1, "1261666627");
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        java.lang.String str1 = java.lang.Integer.toOctalString(434176);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1520000" + "'", str1, "1520000");
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder13 = builder8.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        mongoProperties14.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass18 = mongoProperties14.fieldNamingStrategy;
        mongoProperties14.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.getUri();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        int int27 = mongoClientOptions26.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties21.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties14.builder(mongoClientOptions26);
        javax.net.SocketFactory socketFactory30 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = builder13.socketFactory(socketFactory30);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.acceptableLatencyDifference(74579968);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.description("b0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        mongoProperties0.uri = "22";
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str8 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions10.getLocalThreshold();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str15 = mongoClientOptions10.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions10.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions10);
        int int18 = mongoClientOptions10.getHeartbeatThreadCount();
        int int19 = mongoClientOptions10.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.setUsername("mongodb://localhost/test");
        mongoProperties0.clearPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        java.lang.Integer int1 = java.lang.Integer.getInteger("19584512");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("2149318913", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory31 = mongoClientOptions29.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder25.dbEncoderFactory(dBEncoderFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minHeartbeatFrequency(53182464);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.host;
        mongoProperties37.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass41 = mongoProperties37.fieldNamingStrategy;
        mongoProperties37.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.getUri();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        int int50 = mongoClientOptions49.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties44.builder(mongoClientOptions49);
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties37.builder(mongoClientOptions49);
        com.mongodb.ReadPreference readPreference53 = mongoClientOptions49.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder54 = builder34.readPreference(readPreference53);
        com.mongodb.MongoClientOptions.Builder builder56 = builder34.description("19");
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.acceptableLatencyDifference(35);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.socketTimeout(144);
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.maxAutoConnectRetryTime((long) 99);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "mongodb://localhost/test" + "'", str45, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(readPreference53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions10.getLocalThreshold();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str15 = mongoClientOptions10.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions10.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions10);
        mongoProperties0.username = "10010100000000000000000000000001";
        java.lang.String str20 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("101100", 27017);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 27017 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 738197504);
        mongoProperties0.authenticationDatabase = "5";
        java.lang.Class<?> wildcardClass10 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str11 = mongoProperties0.getUsername();
        boolean boolean12 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        int int2 = java.lang.Integer.rotateRight(0, 300000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        int int2 = java.lang.Integer.compare((-47480831), 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setDatabase("");
        mongoProperties0.setUri("101");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties15.gridFsDatabase = "hi!";
        char[] charArray22 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties15.setPassword(charArray22);
        mongoProperties14.setPassword(charArray22);
        java.lang.String str25 = mongoProperties14.getHost();
        boolean boolean26 = mongoProperties14.hasCustomCredentials();
        mongoProperties14.username = "27017";
        mongoProperties14.authenticationDatabase = "4294967295";
        char[] charArray31 = mongoProperties14.getPassword();
        mongoProperties0.password = charArray31;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int34 = mongoProperties33.getDEFAULT_PORT();
        mongoProperties33.setHost("hi!");
        mongoProperties33.host = "";
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        java.lang.String str43 = mongoClientOptions42.toString();
        int int44 = mongoClientOptions42.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties33.builder(mongoClientOptions42);
        int int46 = mongoClientOptions42.getConnectTimeout();
        javax.net.SocketFactory socketFactory47 = mongoClientOptions42.getSocketFactory();
        int int48 = mongoClientOptions42.getHeartbeatConnectRetryFrequency();
        int int49 = mongoClientOptions42.getMaxWaitTime();
        javax.net.SocketFactory socketFactory50 = mongoClientOptions42.getSocketFactory();
        boolean boolean51 = mongoClientOptions42.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions42);
        mongoProperties0.authenticationDatabase = "369098752";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties55 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str56 = mongoProperties55.host;
        java.lang.String str57 = mongoProperties55.host;
        java.lang.Integer int58 = mongoProperties55.getPort();
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        boolean boolean64 = mongoClientOptions62.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties55.builder(mongoClientOptions62);
        java.lang.String str66 = mongoProperties55.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties67 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int68 = mongoProperties67.getDEFAULT_PORT();
        mongoProperties67.setHost("hi!");
        mongoProperties67.host = "";
        mongoProperties67.setPort((java.lang.Integer) 0);
        java.lang.String str75 = mongoProperties67.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties76 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties76.gridFsDatabase = "hi!";
        char[] charArray83 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties76.setPassword(charArray83);
        mongoProperties67.setPassword(charArray83);
        mongoProperties55.password = charArray83;
        mongoProperties0.setPassword(charArray83);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 27017 + "'", int34 == 27017);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20000 + "'", int44 == 20000);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10000 + "'", int46 == 10000);
        org.junit.Assert.assertNotNull(socketFactory47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 500 + "'", int48 == 500);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 120000 + "'", int49 == 120000);
        org.junit.Assert.assertNotNull(socketFactory50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 27017 + "'", int68 == 27017);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[a, a, #, 4]");
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions5.getMaxWaitTime();
        int int10 = mongoClientOptions5.getHeartbeatFrequency();
        java.lang.String str11 = mongoClientOptions5.toString();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions5.getDbEncoderFactory();
        com.mongodb.ReadPreference readPreference13 = mongoClientOptions5.getReadPreference();
        int int14 = mongoClientOptions5.getMinHeartbeatFrequency();
        int int15 = mongoClientOptions5.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertNotNull(readPreference13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
    }
}

