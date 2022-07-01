import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment5 = builder2.build();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment1 = builder0.build();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size((long) (byte) -1);
        com.metamx.druid.client.DataSegment.Builder builder4 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder0.size((long) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment7 = builder6.build();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.dataSource("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment7 = builder6.build();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.metamx.druid.client.DataSegment.Builder builder6 = builder0.metrics((java.util.List<java.lang.String>) strList4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment7 = builder0.build();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.size((long) (byte) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.size((long) 10);
        com.metamx.druid.client.DataSegment.Builder builder12 = builder6.version("");
        com.metamx.druid.client.DataSegment.Builder builder14 = builder6.dataSource("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment15 = builder14.build();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.size((-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder6.build();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder0.version("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment5 = builder4.build();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.size((long) (byte) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder8.build();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment7 = builder6.build();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder8.size((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder8.build();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size((long) (byte) -1);
        com.metamx.druid.client.DataSegment.Builder builder4 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder0.size((long) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder0.version("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder8.build();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.size((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment7 = builder4.build();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment7 = builder4.build();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder6.build();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder0.size((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment5 = builder0.build();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.dataSource("");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder12 = builder6.size((long) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment13 = builder6.build();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.dataSource("");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder8.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder12 = builder10.size((long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment13 = builder12.build();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        com.metamx.druid.client.DataSegment.Builder builder6 = builder0.metrics((java.util.List<java.lang.String>) strList4);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder0.version("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder10.build();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.size((-1L));
        com.metamx.druid.client.DataSegment.Builder builder12 = builder6.size((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment13 = builder6.build();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size(1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment5 = builder2.build();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.size((long) (byte) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.size((long) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder10.build();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.size((long) (byte) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder6.build();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder0.size(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder0.build();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.dataSource("");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.version("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder6.build();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size((long) (byte) -1);
        com.metamx.druid.client.DataSegment.Builder builder4 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder0.size((long) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder8.size((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder8.build();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder4.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder4.build();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder0.size(0L);
        com.metamx.druid.client.DataSegment.Builder builder10 = builder0.version("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder0.build();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.version("");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder4.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.size((-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder10.build();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size((long) (byte) -1);
        com.metamx.druid.client.DataSegment.Builder builder4 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder6 = builder0.size((long) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.version("");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder8.size((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder10.build();
    }
}

