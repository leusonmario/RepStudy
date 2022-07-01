import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.slf4j.Logger logger0 = null;
        quickdt.experiments.OutOfTimeCrossValidatorRunner.logger = logger0;
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        quickdt.experiments.OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new quickdt.experiments.OutOfTimeCrossValidatorRunner();
        java.lang.Class<?> wildcardClass1 = outOfTimeCrossValidatorRunner0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.slf4j.Logger logger0 = quickdt.experiments.OutOfTimeCrossValidatorRunner.logger;
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(0, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((-1), (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(10, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) '#', (int) '#');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 1, 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder(100, (-1));
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        quickdt.predictiveModels.PredictiveModelBuilder predictiveModelBuilder2 = quickdt.experiments.OutOfTimeCrossValidatorRunner.getRandomForestBuilder((int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = predictiveModelBuilder2.getClass();
        org.junit.Assert.assertNotNull(predictiveModelBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

