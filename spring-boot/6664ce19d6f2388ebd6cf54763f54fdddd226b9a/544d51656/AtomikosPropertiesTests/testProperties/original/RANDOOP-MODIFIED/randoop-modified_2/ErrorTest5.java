import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2501");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.properties;
        atomikosPropertiesTests0.testDefaultProperties();
        atomikosPropertiesTests0.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = atomikosPropertiesTests0.properties;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests5 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = atomikosPropertiesTests5.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests7 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = atomikosPropertiesTests7.properties;
        atomikosPropertiesTests5.properties = atomikosProperties8;
        java.util.Properties properties10 = atomikosPropertiesTests5.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests11 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = atomikosPropertiesTests11.properties;
        atomikosPropertiesTests11.testProperties();
        atomikosPropertiesTests11.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests15 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests15.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests17 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests17.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests19 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = atomikosPropertiesTests19.properties;
        atomikosPropertiesTests17.properties = atomikosProperties20;
        java.util.Properties properties22 = atomikosPropertiesTests17.loadDefaultSettings();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray30 = atomikosPropertiesTests15.defaultOf(properties22, strArray29);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray32 = atomikosPropertiesTests11.defaultOf(properties22, strArray31);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests33 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = atomikosPropertiesTests33.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests35 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties36 = atomikosPropertiesTests35.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests37 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests37.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests39 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties40 = atomikosPropertiesTests39.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests41 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = atomikosPropertiesTests41.properties;
        atomikosPropertiesTests39.properties = atomikosProperties42;
        java.util.Properties properties44 = atomikosPropertiesTests39.loadDefaultSettings();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray52 = atomikosPropertiesTests37.defaultOf(properties44, strArray51);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray53 = atomikosPropertiesTests33.defaultOf(properties36, strArray51);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray54 = atomikosPropertiesTests5.defaultOf(properties22, strArray51);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties55 = atomikosPropertiesTests5.properties;
        atomikosPropertiesTests0.properties = atomikosProperties55;
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("hi!", "hi!");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2502");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests2 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests2.properties;
        atomikosPropertiesTests0.properties = atomikosProperties3;
        java.util.Properties properties5 = atomikosPropertiesTests0.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests6 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = atomikosPropertiesTests6.properties;
        atomikosPropertiesTests6.testProperties();
        atomikosPropertiesTests6.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests10.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests12 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = atomikosPropertiesTests12.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests14 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = atomikosPropertiesTests14.properties;
        atomikosPropertiesTests12.properties = atomikosProperties15;
        java.util.Properties properties17 = atomikosPropertiesTests12.loadDefaultSettings();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray25 = atomikosPropertiesTests10.defaultOf(properties17, strArray24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray27 = atomikosPropertiesTests6.defaultOf(properties17, strArray26);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests28 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = atomikosPropertiesTests28.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests30 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties31 = atomikosPropertiesTests30.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests32 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests32.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests34 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties35 = atomikosPropertiesTests34.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests36 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = atomikosPropertiesTests36.properties;
        atomikosPropertiesTests34.properties = atomikosProperties37;
        java.util.Properties properties39 = atomikosPropertiesTests34.loadDefaultSettings();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray47 = atomikosPropertiesTests32.defaultOf(properties39, strArray46);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray48 = atomikosPropertiesTests28.defaultOf(properties31, strArray46);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray49 = atomikosPropertiesTests0.defaultOf(properties17, strArray46);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests50 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties51 = atomikosPropertiesTests50.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests52 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties53 = atomikosPropertiesTests52.properties;
        atomikosPropertiesTests50.properties = atomikosProperties53;
        java.util.Properties properties55 = atomikosPropertiesTests50.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests56 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = atomikosPropertiesTests56.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests58 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties59 = atomikosPropertiesTests58.properties;
        atomikosPropertiesTests56.properties = atomikosProperties59;
        atomikosPropertiesTests50.setproperties(atomikosProperties59);
        atomikosPropertiesTests0.properties = atomikosProperties59;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties63 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests64 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties65 = atomikosPropertiesTests64.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests66 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties67 = atomikosPropertiesTests66.properties;
        atomikosPropertiesTests64.properties = atomikosProperties67;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests69 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties70 = atomikosPropertiesTests69.properties;
        atomikosPropertiesTests69.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests72 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties73 = atomikosPropertiesTests72.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests74 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties75 = atomikosPropertiesTests74.properties;
        atomikosPropertiesTests72.properties = atomikosProperties75;
        atomikosPropertiesTests69.properties = atomikosProperties75;
        atomikosPropertiesTests64.properties = atomikosProperties75;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests79 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties80 = atomikosPropertiesTests79.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests81 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties82 = atomikosPropertiesTests81.properties;
        atomikosPropertiesTests79.properties = atomikosProperties82;
        atomikosPropertiesTests64.properties = atomikosProperties82;
        atomikosPropertiesTests0.properties = atomikosProperties82;
        java.util.Properties properties86 = atomikosPropertiesTests0.loadDefaultSettings();
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("", "hi!");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2503");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.properties;
        atomikosPropertiesTests0.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests0.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties4 = atomikosPropertiesTests0.properties;
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests6 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties7 = atomikosPropertiesTests6.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests8 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties9 = atomikosPropertiesTests8.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = atomikosPropertiesTests10.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests12 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties13 = atomikosPropertiesTests12.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests14 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests14.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests16 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = atomikosPropertiesTests16.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests18 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties19 = atomikosPropertiesTests18.properties;
        atomikosPropertiesTests16.properties = atomikosProperties19;
        java.util.Properties properties21 = atomikosPropertiesTests16.loadDefaultSettings();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray29 = atomikosPropertiesTests14.defaultOf(properties21, strArray28);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray30 = atomikosPropertiesTests10.defaultOf(properties13, strArray28);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray31 = atomikosPropertiesTests6.defaultOf(properties9, strArray28);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties32 = atomikosPropertiesTests6.getproperties();
        atomikosPropertiesTests0.setproperties(atomikosProperties32);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = atomikosPropertiesTests0.properties;
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("hi!", "hi!");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2504");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests2 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests2.properties;
        atomikosPropertiesTests0.properties = atomikosProperties3;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests5 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = atomikosPropertiesTests5.properties;
        atomikosPropertiesTests5.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests8 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = atomikosPropertiesTests8.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = atomikosPropertiesTests10.properties;
        atomikosPropertiesTests8.properties = atomikosProperties11;
        atomikosPropertiesTests5.properties = atomikosProperties11;
        atomikosPropertiesTests0.properties = atomikosProperties11;
        atomikosPropertiesTests0.testDefaultProperties();
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests17 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests17.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests19 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = atomikosPropertiesTests19.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests21 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = atomikosPropertiesTests21.properties;
        atomikosPropertiesTests19.properties = atomikosProperties22;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests24 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = atomikosPropertiesTests24.properties;
        atomikosPropertiesTests24.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests27 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = atomikosPropertiesTests27.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests29 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = atomikosPropertiesTests29.properties;
        atomikosPropertiesTests27.properties = atomikosProperties30;
        atomikosPropertiesTests24.properties = atomikosProperties30;
        atomikosPropertiesTests19.properties = atomikosProperties30;
        atomikosPropertiesTests17.properties = atomikosProperties30;
        atomikosPropertiesTests0.setproperties(atomikosProperties30);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests36 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = atomikosPropertiesTests36.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests38 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = atomikosPropertiesTests38.properties;
        atomikosPropertiesTests36.properties = atomikosProperties39;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests41 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = atomikosPropertiesTests41.properties;
        atomikosPropertiesTests41.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests44 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties45 = atomikosPropertiesTests44.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests46 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = atomikosPropertiesTests46.properties;
        atomikosPropertiesTests44.properties = atomikosProperties47;
        atomikosPropertiesTests41.properties = atomikosProperties47;
        atomikosPropertiesTests36.properties = atomikosProperties47;
        atomikosPropertiesTests36.testDefaultProperties();
        atomikosPropertiesTests36.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties53 = atomikosPropertiesTests36.properties;
        atomikosPropertiesTests0.properties = atomikosProperties53;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties55 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests56 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests56.testProperties();
        java.util.Properties properties58 = atomikosPropertiesTests56.loadDefaultSettings();
        java.util.Properties properties59 = atomikosPropertiesTests56.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests60 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests60.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests62 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties63 = atomikosPropertiesTests62.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests64 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties65 = atomikosPropertiesTests64.properties;
        atomikosPropertiesTests62.properties = atomikosProperties65;
        java.util.Properties properties67 = atomikosPropertiesTests62.loadDefaultSettings();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray75 = atomikosPropertiesTests60.defaultOf(properties67, strArray74);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray76 = atomikosPropertiesTests0.defaultOf(properties59, strArray74);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests77 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties78 = atomikosPropertiesTests77.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties79 = atomikosPropertiesTests77.properties;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests80 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties81 = atomikosPropertiesTests80.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests82 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties83 = atomikosPropertiesTests82.properties;
        atomikosPropertiesTests80.properties = atomikosProperties83;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties85 = atomikosPropertiesTests80.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties86 = atomikosPropertiesTests80.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties87 = atomikosPropertiesTests80.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties88 = atomikosPropertiesTests80.properties;
        atomikosPropertiesTests77.setproperties(atomikosProperties88);
        atomikosPropertiesTests0.properties = atomikosProperties88;
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("", "hi!");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2505");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests2 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests2.properties;
        atomikosPropertiesTests0.properties = atomikosProperties3;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests5 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = atomikosPropertiesTests5.properties;
        atomikosPropertiesTests5.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests8 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = atomikosPropertiesTests8.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = atomikosPropertiesTests10.properties;
        atomikosPropertiesTests8.properties = atomikosProperties11;
        atomikosPropertiesTests5.properties = atomikosProperties11;
        atomikosPropertiesTests0.properties = atomikosProperties11;
        atomikosPropertiesTests0.testDefaultProperties();
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests17 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests17.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests19 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = atomikosPropertiesTests19.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests21 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = atomikosPropertiesTests21.properties;
        atomikosPropertiesTests19.properties = atomikosProperties22;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests24 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = atomikosPropertiesTests24.properties;
        atomikosPropertiesTests24.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests27 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = atomikosPropertiesTests27.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests29 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = atomikosPropertiesTests29.properties;
        atomikosPropertiesTests27.properties = atomikosProperties30;
        atomikosPropertiesTests24.properties = atomikosProperties30;
        atomikosPropertiesTests19.properties = atomikosProperties30;
        atomikosPropertiesTests17.properties = atomikosProperties30;
        atomikosPropertiesTests0.setproperties(atomikosProperties30);
        java.util.Properties properties36 = atomikosPropertiesTests0.loadDefaultSettings();
        java.util.Properties properties37 = atomikosPropertiesTests0.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties38 = atomikosPropertiesTests0.getproperties();
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("", "");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2506");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests2 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests2.properties;
        atomikosPropertiesTests0.properties = atomikosProperties3;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests5 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = atomikosPropertiesTests5.properties;
        atomikosPropertiesTests5.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests8 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = atomikosPropertiesTests8.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = atomikosPropertiesTests10.properties;
        atomikosPropertiesTests8.properties = atomikosProperties11;
        atomikosPropertiesTests5.properties = atomikosProperties11;
        atomikosPropertiesTests0.properties = atomikosProperties11;
        atomikosPropertiesTests0.testDefaultProperties();
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests17 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests17.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests19 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = atomikosPropertiesTests19.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests21 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = atomikosPropertiesTests21.properties;
        atomikosPropertiesTests19.properties = atomikosProperties22;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests24 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = atomikosPropertiesTests24.properties;
        atomikosPropertiesTests24.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests27 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = atomikosPropertiesTests27.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests29 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = atomikosPropertiesTests29.properties;
        atomikosPropertiesTests27.properties = atomikosProperties30;
        atomikosPropertiesTests24.properties = atomikosProperties30;
        atomikosPropertiesTests19.properties = atomikosProperties30;
        atomikosPropertiesTests17.properties = atomikosProperties30;
        atomikosPropertiesTests0.setproperties(atomikosProperties30);
        java.util.Properties properties36 = atomikosPropertiesTests0.loadDefaultSettings();
        atomikosPropertiesTests0.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties38 = atomikosPropertiesTests0.getproperties();
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("", "");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2507");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties1 = atomikosPropertiesTests0.loadDefaultSettings();
        atomikosPropertiesTests0.testProperties();
        java.util.Properties properties3 = atomikosPropertiesTests0.loadDefaultSettings();
        atomikosPropertiesTests0.testProperties();
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests6 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests6.testProperties();
        atomikosPropertiesTests6.testProperties();
        java.util.Properties properties9 = atomikosPropertiesTests6.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties10 = atomikosPropertiesTests6.getproperties();
        atomikosPropertiesTests6.testProperties();
        atomikosPropertiesTests6.testProperties();
        java.util.Properties properties13 = atomikosPropertiesTests6.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests14 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = atomikosPropertiesTests14.properties;
        atomikosPropertiesTests14.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = atomikosPropertiesTests14.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests18 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests18.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests20 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = atomikosPropertiesTests20.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests22 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties23 = atomikosPropertiesTests22.properties;
        atomikosPropertiesTests20.properties = atomikosProperties23;
        java.util.Properties properties25 = atomikosPropertiesTests20.loadDefaultSettings();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray33 = atomikosPropertiesTests18.defaultOf(properties25, strArray32);
        atomikosPropertiesTests18.testProperties();
        java.util.Properties properties35 = atomikosPropertiesTests18.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests36 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = atomikosPropertiesTests36.properties;
        java.util.Properties properties38 = atomikosPropertiesTests36.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests39 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests39.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties41 = atomikosPropertiesTests39.properties;
        java.util.Properties properties42 = atomikosPropertiesTests39.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests43 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests43.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests45 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties46 = atomikosPropertiesTests45.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests47 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties48 = atomikosPropertiesTests47.properties;
        atomikosPropertiesTests45.properties = atomikosProperties48;
        java.util.Properties properties50 = atomikosPropertiesTests45.loadDefaultSettings();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray58 = atomikosPropertiesTests43.defaultOf(properties50, strArray57);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray59 = atomikosPropertiesTests36.defaultOf(properties42, strArray57);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray60 = atomikosPropertiesTests14.defaultOf(properties35, strArray57);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray61 = atomikosPropertiesTests0.defaultOf(properties13, strArray57);
        java.util.Properties properties62 = atomikosPropertiesTests0.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties63 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties65 = atomikosPropertiesTests0.getproperties();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        atomikosPropertiesTests0.testDefaultProperties();
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2508");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.properties;
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests4 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties5 = atomikosPropertiesTests4.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = atomikosPropertiesTests4.properties;
        atomikosPropertiesTests0.setproperties(atomikosProperties6);
        java.util.Properties properties8 = atomikosPropertiesTests0.loadDefaultSettings();
        java.util.Properties properties9 = atomikosPropertiesTests0.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = atomikosPropertiesTests10.getproperties();
        atomikosPropertiesTests10.testDefaultProperties();
        atomikosPropertiesTests10.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests14 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests14.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties16 = atomikosPropertiesTests14.properties;
        java.util.Properties properties17 = atomikosPropertiesTests14.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests14.properties;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests19 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = atomikosPropertiesTests19.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests21 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = atomikosPropertiesTests21.properties;
        atomikosPropertiesTests19.properties = atomikosProperties22;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = atomikosPropertiesTests19.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = atomikosPropertiesTests19.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = atomikosPropertiesTests19.getproperties();
        atomikosPropertiesTests14.properties = atomikosProperties26;
        atomikosPropertiesTests10.setproperties(atomikosProperties26);
        java.util.Properties properties29 = atomikosPropertiesTests10.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests30 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests30.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests32 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = atomikosPropertiesTests32.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests34 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties35 = atomikosPropertiesTests34.properties;
        atomikosPropertiesTests32.properties = atomikosProperties35;
        java.util.Properties properties37 = atomikosPropertiesTests32.loadDefaultSettings();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray45 = atomikosPropertiesTests30.defaultOf(properties37, strArray44);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests46 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = atomikosPropertiesTests46.properties;
        atomikosPropertiesTests46.testDefaultProperties();
        atomikosPropertiesTests46.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests50 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties51 = atomikosPropertiesTests50.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests52 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties53 = atomikosPropertiesTests52.properties;
        atomikosPropertiesTests50.properties = atomikosProperties53;
        atomikosPropertiesTests46.properties = atomikosProperties53;
        atomikosPropertiesTests30.properties = atomikosProperties53;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = atomikosPropertiesTests30.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties58 = atomikosPropertiesTests30.getproperties();
        atomikosPropertiesTests10.properties = atomikosProperties58;
        atomikosPropertiesTests0.properties = atomikosProperties58;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests61 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties62 = atomikosPropertiesTests61.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests63 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = atomikosPropertiesTests63.properties;
        atomikosPropertiesTests61.properties = atomikosProperties64;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests66 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties67 = atomikosPropertiesTests66.properties;
        atomikosPropertiesTests66.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests69 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties70 = atomikosPropertiesTests69.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests71 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties72 = atomikosPropertiesTests71.properties;
        atomikosPropertiesTests69.properties = atomikosProperties72;
        atomikosPropertiesTests66.properties = atomikosProperties72;
        atomikosPropertiesTests61.properties = atomikosProperties72;
        java.util.Properties properties76 = atomikosPropertiesTests61.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests77 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties78 = atomikosPropertiesTests77.properties;
        atomikosPropertiesTests77.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties80 = atomikosPropertiesTests77.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests81 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties82 = atomikosPropertiesTests81.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties83 = atomikosPropertiesTests81.properties;
        atomikosPropertiesTests77.setproperties(atomikosProperties83);
        atomikosPropertiesTests61.properties = atomikosProperties83;
        atomikosPropertiesTests0.properties = atomikosProperties83;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties87 = atomikosPropertiesTests0.getproperties();
        atomikosPropertiesTests0.testDefaultProperties();
        atomikosPropertiesTests0.testProperties();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        atomikosPropertiesTests0.testDefaultProperties();
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2509");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests2 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests2.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests4 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties5 = atomikosPropertiesTests4.properties;
        atomikosPropertiesTests2.properties = atomikosProperties5;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests7 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = atomikosPropertiesTests7.properties;
        atomikosPropertiesTests7.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = atomikosPropertiesTests10.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests12 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = atomikosPropertiesTests12.properties;
        atomikosPropertiesTests10.properties = atomikosProperties13;
        atomikosPropertiesTests7.properties = atomikosProperties13;
        atomikosPropertiesTests2.properties = atomikosProperties13;
        atomikosPropertiesTests0.properties = atomikosProperties13;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests0.properties;
        java.util.Properties properties19 = atomikosPropertiesTests0.loadDefaultSettings();
        atomikosPropertiesTests0.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests21 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests21.testProperties();
        java.util.Properties properties23 = atomikosPropertiesTests21.loadDefaultSettings();
        java.util.Properties properties24 = atomikosPropertiesTests21.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties25 = atomikosPropertiesTests21.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties26 = atomikosPropertiesTests21.getproperties();
        atomikosPropertiesTests21.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = atomikosPropertiesTests21.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = atomikosPropertiesTests21.properties;
        java.util.Properties properties30 = atomikosPropertiesTests21.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties31 = atomikosPropertiesTests21.getproperties();
        atomikosPropertiesTests0.properties = atomikosProperties31;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = atomikosPropertiesTests0.properties;
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("hi!", "hi!");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2510");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.properties;
        atomikosPropertiesTests0.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests0.properties;
        atomikosPropertiesTests0.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests5 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = atomikosPropertiesTests5.properties;
        atomikosPropertiesTests5.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests8 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = atomikosPropertiesTests8.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties11 = atomikosPropertiesTests10.properties;
        atomikosPropertiesTests8.properties = atomikosProperties11;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = atomikosPropertiesTests8.properties;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests14 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = atomikosPropertiesTests14.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests16 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties17 = atomikosPropertiesTests16.properties;
        atomikosPropertiesTests14.properties = atomikosProperties17;
        java.util.Properties properties19 = atomikosPropertiesTests14.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests20 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties21 = atomikosPropertiesTests20.properties;
        atomikosPropertiesTests20.testProperties();
        atomikosPropertiesTests20.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests24 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests24.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests26 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = atomikosPropertiesTests26.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests28 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = atomikosPropertiesTests28.properties;
        atomikosPropertiesTests26.properties = atomikosProperties29;
        java.util.Properties properties31 = atomikosPropertiesTests26.loadDefaultSettings();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray39 = atomikosPropertiesTests24.defaultOf(properties31, strArray38);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray41 = atomikosPropertiesTests20.defaultOf(properties31, strArray40);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests42 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = atomikosPropertiesTests42.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests44 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties45 = atomikosPropertiesTests44.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests46 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests46.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests48 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties49 = atomikosPropertiesTests48.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests50 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties51 = atomikosPropertiesTests50.properties;
        atomikosPropertiesTests48.properties = atomikosProperties51;
        java.util.Properties properties53 = atomikosPropertiesTests48.loadDefaultSettings();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray61 = atomikosPropertiesTests46.defaultOf(properties53, strArray60);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray62 = atomikosPropertiesTests42.defaultOf(properties45, strArray60);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray63 = atomikosPropertiesTests14.defaultOf(properties31, strArray60);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = atomikosPropertiesTests14.properties;
        atomikosPropertiesTests8.properties = atomikosProperties64;
        atomikosPropertiesTests5.properties = atomikosProperties64;
        atomikosPropertiesTests0.properties = atomikosProperties64;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties68 = atomikosPropertiesTests0.getproperties();
        atomikosPropertiesTests0.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests70 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties71 = atomikosPropertiesTests70.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests72 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties73 = atomikosPropertiesTests72.getproperties();
        atomikosPropertiesTests70.setproperties(atomikosProperties73);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties75 = atomikosPropertiesTests70.getproperties();
        java.util.Properties properties76 = atomikosPropertiesTests70.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties77 = atomikosPropertiesTests70.properties;
        atomikosPropertiesTests0.setproperties(atomikosProperties77);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests79 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties80 = atomikosPropertiesTests79.properties;
        atomikosPropertiesTests79.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties82 = atomikosPropertiesTests79.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties83 = atomikosPropertiesTests79.properties;
        atomikosPropertiesTests79.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties85 = atomikosPropertiesTests79.getproperties();
        atomikosPropertiesTests0.properties = atomikosProperties85;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        atomikosPropertiesTests0.testDefaultProperties();
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2511");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties1 = atomikosPropertiesTests0.loadDefaultSettings();
        atomikosPropertiesTests0.testProperties();
        atomikosPropertiesTests0.testProperties();
        java.util.Properties properties4 = atomikosPropertiesTests0.loadDefaultSettings();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        atomikosPropertiesTests0.testDefaultProperties();
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2512");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests2 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties3 = atomikosPropertiesTests2.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests4 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests4.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests6 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = atomikosPropertiesTests6.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests8 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = atomikosPropertiesTests8.properties;
        atomikosPropertiesTests6.properties = atomikosProperties9;
        java.util.Properties properties11 = atomikosPropertiesTests6.loadDefaultSettings();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray19 = atomikosPropertiesTests4.defaultOf(properties11, strArray18);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray20 = atomikosPropertiesTests0.defaultOf(properties3, strArray18);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests21 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = atomikosPropertiesTests21.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests23 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties24 = atomikosPropertiesTests23.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests25 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests25.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests27 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties28 = atomikosPropertiesTests27.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests29 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties30 = atomikosPropertiesTests29.properties;
        atomikosPropertiesTests27.properties = atomikosProperties30;
        java.util.Properties properties32 = atomikosPropertiesTests27.loadDefaultSettings();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray40 = atomikosPropertiesTests25.defaultOf(properties32, strArray39);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray41 = atomikosPropertiesTests21.defaultOf(properties24, strArray39);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests42 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = atomikosPropertiesTests42.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests44 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties45 = atomikosPropertiesTests44.properties;
        atomikosPropertiesTests42.properties = atomikosProperties45;
        java.util.Properties properties47 = atomikosPropertiesTests42.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests48 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties49 = atomikosPropertiesTests48.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests50 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties51 = atomikosPropertiesTests50.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests52 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests52.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests54 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties55 = atomikosPropertiesTests54.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests56 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties57 = atomikosPropertiesTests56.properties;
        atomikosPropertiesTests54.properties = atomikosProperties57;
        java.util.Properties properties59 = atomikosPropertiesTests54.loadDefaultSettings();
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray67 = atomikosPropertiesTests52.defaultOf(properties59, strArray66);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray68 = atomikosPropertiesTests48.defaultOf(properties51, strArray66);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray69 = atomikosPropertiesTests21.defaultOf(properties47, strArray66);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests70 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests70.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests72 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties73 = atomikosPropertiesTests72.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests74 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties75 = atomikosPropertiesTests74.properties;
        atomikosPropertiesTests72.properties = atomikosProperties75;
        java.util.Properties properties77 = atomikosPropertiesTests72.loadDefaultSettings();
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray85 = atomikosPropertiesTests70.defaultOf(properties77, strArray84);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray86 = atomikosPropertiesTests0.defaultOf(properties47, strArray84);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties87 = atomikosPropertiesTests0.properties;
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("", "hi!");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2513");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests1 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests1.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests1.properties;
        atomikosPropertiesTests0.properties = atomikosProperties3;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests5 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = atomikosPropertiesTests5.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests7 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = atomikosPropertiesTests7.properties;
        atomikosPropertiesTests5.properties = atomikosProperties8;
        java.util.Properties properties10 = atomikosPropertiesTests5.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests11 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = atomikosPropertiesTests11.properties;
        atomikosPropertiesTests11.testProperties();
        atomikosPropertiesTests11.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests15 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests15.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests17 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests17.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests19 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = atomikosPropertiesTests19.properties;
        atomikosPropertiesTests17.properties = atomikosProperties20;
        java.util.Properties properties22 = atomikosPropertiesTests17.loadDefaultSettings();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray30 = atomikosPropertiesTests15.defaultOf(properties22, strArray29);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray32 = atomikosPropertiesTests11.defaultOf(properties22, strArray31);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests33 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = atomikosPropertiesTests33.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests35 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties36 = atomikosPropertiesTests35.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests37 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests37.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests39 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties40 = atomikosPropertiesTests39.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests41 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties42 = atomikosPropertiesTests41.properties;
        atomikosPropertiesTests39.properties = atomikosProperties42;
        java.util.Properties properties44 = atomikosPropertiesTests39.loadDefaultSettings();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray52 = atomikosPropertiesTests37.defaultOf(properties44, strArray51);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray53 = atomikosPropertiesTests33.defaultOf(properties36, strArray51);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray54 = atomikosPropertiesTests5.defaultOf(properties22, strArray51);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests55 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = atomikosPropertiesTests55.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests57 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties58 = atomikosPropertiesTests57.properties;
        atomikosPropertiesTests55.properties = atomikosProperties58;
        java.util.Properties properties60 = atomikosPropertiesTests55.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests61 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties62 = atomikosPropertiesTests61.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests63 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = atomikosPropertiesTests63.properties;
        atomikosPropertiesTests61.properties = atomikosProperties64;
        atomikosPropertiesTests55.setproperties(atomikosProperties64);
        atomikosPropertiesTests5.properties = atomikosProperties64;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties68 = atomikosPropertiesTests5.getproperties();
        atomikosPropertiesTests0.properties = atomikosProperties68;
        java.util.Properties properties70 = atomikosPropertiesTests0.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties71 = atomikosPropertiesTests0.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties72 = atomikosPropertiesTests0.getproperties();
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("hi!", "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2514");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests2 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests2.getproperties();
        atomikosPropertiesTests0.setproperties(atomikosProperties3);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties5 = atomikosPropertiesTests0.getproperties();
        java.util.Properties properties6 = null;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests7 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests7.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties9 = atomikosPropertiesTests7.properties;
        java.util.Properties properties10 = atomikosPropertiesTests7.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests11 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = atomikosPropertiesTests11.getproperties();
        java.util.Properties properties13 = atomikosPropertiesTests11.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties14 = atomikosPropertiesTests11.properties;
        atomikosPropertiesTests7.setproperties(atomikosProperties14);
        atomikosPropertiesTests7.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests17 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests17.properties;
        atomikosPropertiesTests17.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = atomikosPropertiesTests17.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests21 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties22 = atomikosPropertiesTests21.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties23 = atomikosPropertiesTests21.properties;
        atomikosPropertiesTests17.setproperties(atomikosProperties23);
        java.util.Properties properties25 = atomikosPropertiesTests17.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests26 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = atomikosPropertiesTests26.properties;
        atomikosPropertiesTests26.testProperties();
        atomikosPropertiesTests26.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests30 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests30.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests32 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties33 = atomikosPropertiesTests32.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests34 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties35 = atomikosPropertiesTests34.properties;
        atomikosPropertiesTests32.properties = atomikosProperties35;
        java.util.Properties properties37 = atomikosPropertiesTests32.loadDefaultSettings();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray45 = atomikosPropertiesTests30.defaultOf(properties37, strArray44);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray47 = atomikosPropertiesTests26.defaultOf(properties37, strArray46);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray48 = atomikosPropertiesTests7.defaultOf(properties25, strArray46);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray49 = atomikosPropertiesTests0.defaultOf(properties6, strArray46);
        atomikosPropertiesTests0.testDefaultProperties();
        atomikosPropertiesTests0.testProperties();
        java.util.Properties properties52 = atomikosPropertiesTests0.loadDefaultSettings();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        atomikosPropertiesTests0.testDefaultProperties();
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2515");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties1 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests2 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties3 = atomikosPropertiesTests2.properties;
        atomikosPropertiesTests0.properties = atomikosProperties3;
        java.util.Properties properties5 = atomikosPropertiesTests0.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests6 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties7 = atomikosPropertiesTests6.properties;
        atomikosPropertiesTests6.testProperties();
        atomikosPropertiesTests6.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests10 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests10.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests12 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = atomikosPropertiesTests12.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests14 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties15 = atomikosPropertiesTests14.properties;
        atomikosPropertiesTests12.properties = atomikosProperties15;
        java.util.Properties properties17 = atomikosPropertiesTests12.loadDefaultSettings();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray25 = atomikosPropertiesTests10.defaultOf(properties17, strArray24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray27 = atomikosPropertiesTests6.defaultOf(properties17, strArray26);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests28 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = atomikosPropertiesTests28.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests30 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        java.util.Properties properties31 = atomikosPropertiesTests30.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests32 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests32.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests34 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties35 = atomikosPropertiesTests34.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests36 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = atomikosPropertiesTests36.properties;
        atomikosPropertiesTests34.properties = atomikosProperties37;
        java.util.Properties properties39 = atomikosPropertiesTests34.loadDefaultSettings();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray47 = atomikosPropertiesTests32.defaultOf(properties39, strArray46);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray48 = atomikosPropertiesTests28.defaultOf(properties31, strArray46);
        org.assertj.core.data.MapEntry<?, ?>[] wildcardMapEntryArray49 = atomikosPropertiesTests0.defaultOf(properties17, strArray46);
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests50 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties51 = atomikosPropertiesTests50.properties;
        atomikosPropertiesTests50.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests53 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties54 = atomikosPropertiesTests53.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests55 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties56 = atomikosPropertiesTests55.properties;
        atomikosPropertiesTests53.properties = atomikosProperties56;
        atomikosPropertiesTests50.properties = atomikosProperties56;
        atomikosPropertiesTests0.properties = atomikosProperties56;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests60 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties61 = atomikosPropertiesTests60.properties;
        atomikosPropertiesTests60.testDefaultProperties();
        atomikosPropertiesTests60.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties64 = atomikosPropertiesTests60.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties65 = atomikosPropertiesTests60.properties;
        atomikosPropertiesTests0.properties = atomikosProperties65;
        java.util.Properties properties67 = atomikosPropertiesTests0.loadDefaultSettings();
        java.util.Properties properties68 = atomikosPropertiesTests0.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties69 = atomikosPropertiesTests0.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties70 = atomikosPropertiesTests0.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests71 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties72 = atomikosPropertiesTests71.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests73 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties74 = atomikosPropertiesTests73.properties;
        atomikosPropertiesTests71.properties = atomikosProperties74;
        atomikosPropertiesTests71.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests77 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties78 = atomikosPropertiesTests77.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties79 = atomikosPropertiesTests77.properties;
        atomikosPropertiesTests71.setproperties(atomikosProperties79);
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties81 = atomikosPropertiesTests71.properties;
        atomikosPropertiesTests0.setproperties(atomikosProperties81);
        atomikosPropertiesTests0.testProperties();
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("", "");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2516");
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests0 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties2 = atomikosPropertiesTests0.properties;
        atomikosPropertiesTests0.testProperties();
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests5 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties6 = atomikosPropertiesTests5.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests7 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties8 = atomikosPropertiesTests7.properties;
        atomikosPropertiesTests5.properties = atomikosProperties8;
        atomikosPropertiesTests5.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests11 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties12 = atomikosPropertiesTests11.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties13 = atomikosPropertiesTests11.properties;
        atomikosPropertiesTests5.setproperties(atomikosProperties13);
        atomikosPropertiesTests0.setproperties(atomikosProperties13);
        atomikosPropertiesTests0.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests17 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties18 = atomikosPropertiesTests17.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests19 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties20 = atomikosPropertiesTests19.properties;
        atomikosPropertiesTests17.properties = atomikosProperties20;
        atomikosPropertiesTests17.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests23 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties24 = atomikosPropertiesTests23.properties;
        atomikosPropertiesTests23.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests26 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties27 = atomikosPropertiesTests26.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests28 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties29 = atomikosPropertiesTests28.properties;
        atomikosPropertiesTests26.properties = atomikosProperties29;
        atomikosPropertiesTests23.properties = atomikosProperties29;
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests32 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        atomikosPropertiesTests32.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties34 = atomikosPropertiesTests32.properties;
        java.util.Properties properties35 = atomikosPropertiesTests32.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosPropertiesTests atomikosPropertiesTests36 = new org.springframework.boot.jta.atomikos.AtomikosPropertiesTests();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties37 = atomikosPropertiesTests36.getproperties();
        java.util.Properties properties38 = atomikosPropertiesTests36.loadDefaultSettings();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties39 = atomikosPropertiesTests36.properties;
        atomikosPropertiesTests32.setproperties(atomikosProperties39);
        atomikosPropertiesTests23.properties = atomikosProperties39;
        atomikosPropertiesTests23.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties43 = atomikosPropertiesTests23.properties;
        atomikosPropertiesTests17.setproperties(atomikosProperties43);
        atomikosPropertiesTests17.testDefaultProperties();
        atomikosPropertiesTests17.testDefaultProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties47 = atomikosPropertiesTests17.properties;
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties48 = atomikosPropertiesTests17.getproperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties49 = atomikosPropertiesTests17.properties;
        atomikosPropertiesTests17.testProperties();
        org.springframework.boot.jta.atomikos.AtomikosProperties atomikosProperties51 = atomikosPropertiesTests17.getproperties();
        atomikosPropertiesTests0.properties = atomikosProperties51;
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        atomikosPropertiesTests0.assertProperty("", "");
    }
}

