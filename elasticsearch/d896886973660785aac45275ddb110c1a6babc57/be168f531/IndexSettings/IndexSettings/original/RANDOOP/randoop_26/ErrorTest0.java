import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("archived.");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.requireFilters();
        int int4 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = builder5.build();
        int int7 = builder5.getRoutingNumShards();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = builder5.mapping("primary_terms");
    }
}

