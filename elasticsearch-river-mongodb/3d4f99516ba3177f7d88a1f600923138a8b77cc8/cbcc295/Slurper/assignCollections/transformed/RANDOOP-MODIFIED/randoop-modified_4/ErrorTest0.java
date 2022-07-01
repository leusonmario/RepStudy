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
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = basicDBObject0.getInt("connect_timeout");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = basicDBObject1.getDouble("2.12.4");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        boolean boolean2 = basicDBObject0.equals((java.lang.Object) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = basicDBObject0.getDouble("ssl");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = basicDBObject7.getInt("secondary_read_preference");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        java.util.Date date5 = basicDBObject0.getDate("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = basicDBObject0.getLong("ssl");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        boolean boolean2 = basicDBObject0.equals((java.lang.Object) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = basicDBObject0.getDouble("2.12.4");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject("32", (java.lang.Object) basicDBObject2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = basicDBObject2.getDouble("include_fields");
    }
}

