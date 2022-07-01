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
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment7 = builder6.build();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.binaryVersion((java.lang.Integer) 1);
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment5 = builder4.build();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment7 = builder2.build();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment5 = builder2.build();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.binaryVersion((java.lang.Integer) 100);
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder12 = builder10.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder14 = builder12.binaryVersion((java.lang.Integer) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment15 = builder14.build();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder2.metrics((java.util.List<java.lang.String>) strList5);
        com.metamx.druid.client.DataSegment.Builder builder9 = builder7.version("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment10 = builder7.build();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.binaryVersion((java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder8.build();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment3 = builder2.build();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.binaryVersion((java.lang.Integer) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder6.build();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment1 = builder0.build();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.size((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder6.build();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.binaryVersion((java.lang.Integer) 100);
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder12 = builder10.binaryVersion((java.lang.Integer) 10);
        com.metamx.druid.client.DataSegment.Builder builder14 = builder12.size(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment15 = builder14.build();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.binaryVersion((java.lang.Integer) 100);
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder12 = builder10.binaryVersion((java.lang.Integer) 10);
        com.metamx.druid.client.DataSegment.Builder builder14 = builder12.size((long) (byte) 10);
        com.metamx.druid.client.DataSegment.Builder builder16 = builder14.binaryVersion((java.lang.Integer) 10);
        com.metamx.druid.client.DataSegment.Builder builder18 = builder14.size(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment19 = builder18.build();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.size((long) (short) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder8.build();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.binaryVersion((java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment9 = builder8.build();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        com.metamx.druid.client.DataSegment.Builder builder7 = builder2.metrics((java.util.List<java.lang.String>) strList5);
        com.metamx.druid.client.DataSegment.Builder builder9 = builder7.version("");
        com.metamx.druid.client.DataSegment.Builder builder11 = builder9.dataSource("");
        com.metamx.druid.client.DataSegment.Builder builder13 = builder11.dataSource("");
        com.metamx.druid.client.DataSegment.Builder builder15 = builder13.binaryVersion((java.lang.Integer) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment16 = builder15.build();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.binaryVersion((java.lang.Integer) 100);
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder12 = builder10.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder14 = builder12.dataSource("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment15 = builder14.build();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.size((long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment3 = builder0.build();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.binaryVersion((java.lang.Integer) 100);
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.binaryVersion((java.lang.Integer) 0);
        com.metamx.druid.client.DataSegment.Builder builder12 = builder10.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder14 = builder12.dataSource("");
        com.metamx.druid.client.DataSegment.Builder builder16 = builder14.size(10L);
        com.metamx.druid.client.DataSegment.Builder builder18 = builder16.dataSource("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment19 = builder16.build();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder4 = builder2.size((long) ' ');
        com.metamx.druid.client.DataSegment.Builder builder6 = builder2.size((long) (short) 100);
        com.metamx.druid.client.DataSegment.Builder builder8 = builder6.dataSource("hi!");
        com.metamx.druid.client.DataSegment.Builder builder10 = builder6.size((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment11 = builder6.build();
    }
}

