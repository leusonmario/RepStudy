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
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment1 = builder0.build();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment1 = builder0.build();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.metamx.druid.client.DataSegment.Builder builder5 = builder0.dimensions((java.util.List<java.lang.String>) strList3);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder0.size((long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment8 = builder0.build();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.metamx.druid.client.DataSegment.Builder builder5 = builder0.dimensions((java.util.List<java.lang.String>) strList3);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder0.size((long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment8 = builder7.build();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.metamx.druid.client.DataSegment.Builder builder5 = builder0.dimensions((java.util.List<java.lang.String>) strList3);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder0.size((long) (short) 1);
        com.metamx.druid.client.DataSegment.Builder builder9 = builder7.size((long) (short) 1);
        com.metamx.druid.client.DataSegment.Builder builder11 = builder9.version("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment12 = builder11.build();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.metamx.druid.client.DataSegment.Builder builder5 = builder0.dimensions((java.util.List<java.lang.String>) strList3);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder0.size((long) (short) 1);
        com.metamx.druid.client.DataSegment.Builder builder9 = builder7.size((long) (short) 1);
        com.metamx.druid.client.DataSegment.Builder builder11 = builder9.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment12 = builder11.build();
    }
}

