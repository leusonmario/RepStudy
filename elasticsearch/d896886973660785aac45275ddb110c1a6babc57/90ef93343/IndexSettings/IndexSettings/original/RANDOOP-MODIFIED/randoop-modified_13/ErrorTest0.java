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
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData2 = indexMetaData0.mapping("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData3);
        boolean boolean5 = indexMetaData0.equals((java.lang.Object) builder4);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData6.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap10 = indexMetaData9.getCustoms();
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData9, settings11);
        org.elasticsearch.index.IndexSettings indexSettings13 = new org.elasticsearch.index.IndexSettings(indexMetaData8, settings11);
        org.elasticsearch.index.IndexSettings indexSettings14 = new org.elasticsearch.index.IndexSettings(indexMetaData6, settings11);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.settings.Settings> settingsSetting15 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_ROUTING_REQUIRE_GROUP_SETTING;
        org.elasticsearch.common.settings.Settings settings16 = indexSettings14.getValue(settingsSetting15);
        org.elasticsearch.index.IndexSettings indexSettings17 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings16);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData19 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = builder20.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = builder20.build();
    }
}

