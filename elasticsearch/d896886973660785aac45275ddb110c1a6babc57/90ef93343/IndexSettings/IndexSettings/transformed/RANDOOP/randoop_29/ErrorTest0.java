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
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.removeAlias("index.blocks.read");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("archived.");
        int int2 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder4.creationDate(1L);
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.settings.Settings settings9 = settings7.getAsSettings("hi!");
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap13 = settings11.getGroups("index.uuid");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "", "hi!", "index.uuid", "index.version.created" };
        java.lang.String[] strArray23 = settings11.getAsArray("", strArray21, (java.lang.Boolean) false);
        java.lang.String[] strArray25 = settings7.getAsArray("index.version.minimum_compatible", strArray21, (java.lang.Boolean) false);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder4.settings(settings7);
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings27.getGroups("index.uuid");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "", "hi!", "index.uuid", "index.version.created" };
        java.lang.String[] strArray39 = settings27.getAsArray("", strArray37, (java.lang.Boolean) false);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder4.settings(settings27);
        java.lang.String str42 = settings27.get("index.shadow_replicas");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings43 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean45 = indexScopedSettings43.isPrivateSetting("index.");
        boolean boolean47 = indexScopedSettings43.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings49 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap51 = settings49.getGroups("index.uuid");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!", "", "hi!", "index.uuid", "index.version.created" };
        java.lang.String[] strArray61 = settings49.getAsArray("", strArray59, (java.lang.Boolean) false);
        indexScopedSettings43.validate("index.shadow_replicas", settings49);
        org.elasticsearch.common.settings.Setting<?> wildcardSetting64 = indexScopedSettings43.get("index.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData65 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int66 = indexMetaData65.getNumberOfShards();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings67 = new org.elasticsearch.common.settings.IndexScopedSettings(settings27, indexScopedSettings43, indexMetaData65);
        boolean boolean69 = indexMetaData65.isSameUUID("index.version.created_string");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap70 = indexMetaData65.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap71 = indexMetaData65.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData65);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder74 = builder72.version((long) (short) -1);
        int int75 = builder72.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData76 = builder72.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData77 = builder72.build();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = builder3.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.numberOfShards((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder3.removeAlias("");
    }
}

