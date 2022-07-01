import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        boolean boolean4 = indexMetaData0.isSameUUID("index.blocks.read");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.version.upgraded");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        int int9 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap11 = indexMetaData0.getCustoms();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap12 = indexMetaData0.getCustoms();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertNotNull(strImmutableOpenMap12);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getCreationDate();
        org.apache.lucene.util.Version version2 = indexMetaData0.getMinimumCompatibleVersion();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.version((long) (-1));
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.numberOfReplicas((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("current version [0] is different than the one provided [1]");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.removeAlias("index.uuid");
        int int18 = builder15.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder15.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder22.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder22.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder25.numberOfReplicas((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder25.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder29.creationDate(0L);
        java.lang.String str32 = builder29.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder34.removeAllAliases();
        int int36 = builder35.numberOfShards();
        java.lang.String str37 = builder35.index();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder39.removeAlias("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder41.removeAlias("");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state44 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte45 = state44.id();
        byte byte46 = state44.id();
        byte byte47 = state44.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder43.state(state44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder35.state(state44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder29.state(state44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder20.state(state44);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = builder13.state(state44);
        long long53 = builder52.version();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
        org.junit.Assert.assertNull(version2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "index.creation_date" + "'", str32, "index.creation_date");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "index.version.upgraded" + "'", str37, "index.version.upgraded");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + state44 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state44.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 0 + "'", byte46 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) 0 + "'", byte47 == (byte) 0);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
    }
}

