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
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment3 = builder0.build();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.metamx.druid.client.DataSegment.Builder builder0 = com.metamx.druid.client.DataSegment.builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.version("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment3 = builder2.build();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.metamx.druid.client.DataSegment.Builder builder0 = new com.metamx.druid.client.DataSegment.Builder();
        com.metamx.druid.client.DataSegment.Builder builder2 = builder0.dataSource("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.metamx.druid.client.DataSegment dataSegment3 = builder2.build();
    }
}

