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
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment3 = builder0.build();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment3 = builder2.build();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.metamx.druid.client.DataSegment.Builder builder5 = builder0.dimensions((java.util.List<java.lang.String>) strList3);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder5.version("http://s3.amazonaws.com//?torrent");
        com.metamx.druid.client.DataSegment.Builder builder9 = builder7.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.metamx.druid.client.DataSegment.Builder builder15 = builder10.dimensions((java.util.List<java.lang.String>) strList13);
        com.metamx.druid.client.DataSegment.Builder builder16 = builder9.metrics((java.util.List<java.lang.String>) strList13);
        com.metamx.druid.client.DataSegment.Builder builder17 = new com.metamx.druid.client.DataSegment.Builder();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.metamx.druid.client.DataSegment.Builder builder22 = builder17.dimensions((java.util.List<java.lang.String>) strList20);
        com.metamx.druid.client.DataSegment.Builder builder23 = builder16.metrics((java.util.List<java.lang.String>) strList20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment24 = builder23.build();
    }
}

