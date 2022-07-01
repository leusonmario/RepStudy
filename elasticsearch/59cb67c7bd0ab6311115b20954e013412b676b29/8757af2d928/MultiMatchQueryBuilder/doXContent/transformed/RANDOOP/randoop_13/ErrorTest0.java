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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder0 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.Float float1 = multiMatchQueryBuilder0.gettieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = multiMatchQueryBuilder0.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = multiMatchQueryBuilder3.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference4.equals(null)", !bytesReference4.equals(null));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder0 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.String str1 = multiMatchQueryBuilder0.getminimumShouldMatch();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery2 = multiMatchQueryBuilder0.zeroTermsQuery;
        multiMatchQueryBuilder0.setuseDisMax((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = multiMatchQueryBuilder0.getuseDisMax();
        java.lang.Boolean boolean6 = multiMatchQueryBuilder0.getuseDisMax();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = multiMatchQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference7.equals(null)", !bytesReference7.equals(null));
    }
}

