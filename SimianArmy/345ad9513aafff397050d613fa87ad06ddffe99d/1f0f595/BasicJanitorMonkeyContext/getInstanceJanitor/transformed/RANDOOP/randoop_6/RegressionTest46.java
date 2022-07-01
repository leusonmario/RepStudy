import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

    public static boolean debug = false;

    @Test
    public void test23001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23001");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(monkeyRecorder19);
    }

    @Test
    public void test23002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23002");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine20;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = null;
        basicJanitorContext7.recorder = monkeyRecorder23;
        java.lang.String str25 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder29 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = null;
        basicJanitorContext7.recorder = monkeyRecorder30;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker32 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration33 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker34 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker34;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(janitorRuleEngine22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(monkeyConfiguration28);
        org.junit.Assert.assertNull(monkeyRecorder29);
        org.junit.Assert.assertNull(janitorResourceTracker32);
        org.junit.Assert.assertNull(monkeyConfiguration33);
    }

    @Test
    public void test23003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23003");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null;
        basicJanitorContext7.calendar = monkeyCalendar14;
        java.lang.String str16 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker22;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(janitorCrawler20);
        org.junit.Assert.assertNull(monkeyConfiguration21);
    }

    @Test
    public void test23004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23004");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        java.lang.String str19 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null;
        basicJanitorContext7.calendar = monkeyCalendar20;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.janitorCrawler();
        java.lang.String str24 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null;
        basicJanitorContext7.config = monkeyConfiguration26;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(monkeyCalendar25);
        org.junit.Assert.assertNull(janitorResourceTracker28);
    }

    @Test
    public void test23005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23005");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = null;
        basicJanitorContext7.recorder = monkeyRecorder23;
        java.lang.String str25 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(monkeyConfiguration26);
    }

    @Test
    public void test23006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23006");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        basicJanitorContext7.crawler = janitorCrawler22;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorResourceTracker24);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertNull(monkeyConfiguration26);
    }

    @Test
    public void test23007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23007");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        basicJanitorContext7.config = monkeyConfiguration13;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = basicJanitorContext7.ruleEngine;
        basicJanitorContext7.region = "";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(janitorRuleEngine16);
    }

    @Test
    public void test23008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23008");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = null;
        basicJanitorContext7.crawler = janitorCrawler20;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker23;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        basicJanitorContext7.recorder = monkeyRecorder25;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(janitorRuleEngine22);
        org.junit.Assert.assertNull(monkeyConfiguration27);
    }

    @Test
    public void test23009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23009");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine20;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = null;
        basicJanitorContext7.recorder = monkeyRecorder23;
        java.lang.String str25 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = null;
        basicJanitorContext7.config = monkeyConfiguration28;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker31 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(janitorRuleEngine22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(janitorResourceTracker30);
        org.junit.Assert.assertNull(janitorResourceTracker31);
    }

    @Test
    public void test23010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23010");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null;
        basicJanitorContext7.calendar = monkeyCalendar18;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null;
        basicJanitorContext7.calendar = monkeyCalendar24;
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
    }

    @Test
    public void test23011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23011");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.configuration();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        basicJanitorContext7.calendar = monkeyCalendar22;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = null;
        basicJanitorContext7.recorder = monkeyRecorder26;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
    }

    @Test
    public void test23012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23012");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = null;
        basicJanitorContext7.recorder = monkeyRecorder23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null;
        basicJanitorContext7.calendar = monkeyCalendar25;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        basicJanitorContext7.calendar = monkeyCalendar28;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler31 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorRuleEngine21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(monkeyRecorder27);
        org.junit.Assert.assertNull(monkeyConfiguration30);
        org.junit.Assert.assertNull(janitorCrawler31);
    }

    @Test
    public void test23013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23013");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker13;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        basicJanitorContext7.recorder = monkeyRecorder19;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine24;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.configuration();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(janitorRuleEngine22);
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertNull(monkeyConfiguration26);
    }

    @Test
    public void test23014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23014");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        java.lang.String str17 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.ruleEngine;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertNull(janitorRuleEngine24);
        org.junit.Assert.assertNull(janitorRuleEngine27);
    }

    @Test
    public void test23015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23015");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null;
        basicJanitorContext7.calendar = monkeyCalendar24;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertNull(janitorRuleEngine26);
        org.junit.Assert.assertNull(monkeyConfiguration27);
    }

    @Test
    public void test23016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23016");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null;
        basicJanitorContext7.config = monkeyConfiguration21;
        java.lang.String str23 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        basicJanitorContext7.config = monkeyConfiguration25;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = null;
        basicJanitorContext7.config = monkeyConfiguration27;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(monkeyConfiguration24);
    }

    @Test
    public void test23017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23017");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext7.recorder;
        basicJanitorContext7.region = "";
        java.lang.String str13 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder;
        java.lang.String str20 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyRecorder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23018");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine21;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null;
        basicJanitorContext7.calendar = monkeyCalendar26;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyRecorder19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertNull(janitorRuleEngine28);
    }

    @Test
    public void test23019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23019");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.crawler;
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertNull(janitorCrawler19);
    }

    @Test
    public void test23020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23020");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine22;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine29;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorResourceTracker26);
        org.junit.Assert.assertNull(janitorResourceTracker27);
        org.junit.Assert.assertNull(monkeyConfiguration28);
    }

    @Test
    public void test23021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23021");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        basicJanitorContext7.crawler = janitorCrawler18;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(monkeyRecorder24);
    }

    @Test
    public void test23022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23022");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext7.config = monkeyConfiguration11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(janitorResourceTracker19);
    }

    @Test
    public void test23023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23023");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        java.lang.String str17 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = null;
        basicJanitorContext7.recorder = monkeyRecorder22;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine25 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorContext7.calendar();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(janitorRuleEngine25);
        org.junit.Assert.assertNull(janitorResourceTracker26);
        org.junit.Assert.assertNull(monkeyCalendar27);
    }

    @Test
    public void test23024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23024");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker12;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null;
        basicJanitorContext7.recorder = monkeyRecorder16;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder();
        basicJanitorContext7.region = "";
        java.lang.String str24 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyCalendar14);
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23025");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.config;
        basicJanitorContext7.region = "hi!";
        java.lang.String str18 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyCalendar14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(monkeyRecorder19);
    }

    @Test
    public void test23026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23026");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.crawler;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
    }

    @Test
    public void test23027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23027");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyRecorder14);
    }

    @Test
    public void test23028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23028");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = null;
        basicJanitorContext7.recorder = monkeyRecorder12;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        basicJanitorContext7.calendar = monkeyCalendar16;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyConfiguration11);
    }

    @Test
    public void test23029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23029");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        java.lang.String str15 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        basicJanitorContext7.config = monkeyConfiguration16;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar();
        java.lang.String str24 = basicJanitorContext7.region;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine28;
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyCalendar23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(janitorRuleEngine27);
    }

    @Test
    public void test23030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23030");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        basicJanitorContext7.config = monkeyConfiguration14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null;
        basicJanitorContext7.calendar = monkeyCalendar18;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = null;
        basicJanitorContext7.recorder = monkeyRecorder24;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = basicJanitorContext7.calendar;
        java.lang.String str29 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertNull(monkeyCalendar28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test23031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23031");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        basicJanitorContext7.config = monkeyConfiguration16;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        basicJanitorContext7.recorder = monkeyRecorder19;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyConfiguration21);
    }

    @Test
    public void test23032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23032");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar;
        basicJanitorContext7.region = "";
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(monkeyCalendar23);
    }

    @Test
    public void test23033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23033");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker9;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = null;
        basicJanitorContext7.crawler = janitorCrawler13;
        java.lang.String str15 = basicJanitorContext7.region;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.janitorRuleEngine();
        java.lang.Class<?> wildcardClass18 = basicJanitorContext7.getClass();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23034");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null;
        basicJanitorContext7.config = monkeyConfiguration21;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        basicJanitorContext7.config = monkeyConfiguration24;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker26;
        basicJanitorContext7.region = "";
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorResourceTracker23);
    }

    @Test
    public void test23035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23035");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker22;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        basicJanitorContext7.recorder = monkeyRecorder25;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine28;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler30 = null;
        basicJanitorContext7.crawler = janitorCrawler30;
        java.lang.String str32 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorRuleEngine24);
        org.junit.Assert.assertNull(monkeyCalendar27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test23036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23036");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext7.calendar = monkeyCalendar17;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker19;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertNull(monkeyRecorder16);
    }

    @Test
    public void test23037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23037");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
    }

    @Test
    public void test23038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23038");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        basicJanitorContext7.recorder = monkeyRecorder19;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = basicJanitorContext7.janitorResourceTracker();
        java.lang.String str25 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = null;
        basicJanitorContext7.recorder = monkeyRecorder26;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration29 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(janitorResourceTracker24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(janitorResourceTracker28);
        org.junit.Assert.assertNull(monkeyConfiguration29);
    }

    @Test
    public void test23039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23039");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        basicJanitorContext7.calendar = monkeyCalendar13;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        basicJanitorContext7.calendar = monkeyCalendar15;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = null;
        basicJanitorContext7.config = monkeyConfiguration20;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        java.lang.String str26 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(janitorCrawler19);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(janitorRuleEngine27);
    }

    @Test
    public void test23040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23040");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext7.recorder;
        basicJanitorContext7.region = "";
        java.lang.String str13 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(janitorCrawler17);
    }

    @Test
    public void test23041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23041");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine20;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        basicJanitorContext7.crawler = janitorCrawler22;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = monkeyConfiguration26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyRecorder24);
        org.junit.Assert.assertNull(monkeyRecorder25);
        org.junit.Assert.assertNull(monkeyConfiguration26);
    }

    @Test
    public void test23042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23042");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        java.lang.String str22 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyCalendar24);
    }

    @Test
    public void test23043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23043");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = null;
        basicJanitorContext7.recorder = monkeyRecorder26;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler28 = null;
        basicJanitorContext7.crawler = janitorCrawler28;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(monkeyConfiguration24);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertNull(monkeyConfiguration30);
        org.junit.Assert.assertNull(monkeyRecorder31);
    }

    @Test
    public void test23044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23044");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null;
        basicJanitorContext7.calendar = monkeyCalendar10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        basicJanitorContext7.config = monkeyConfiguration13;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        basicJanitorContext7.recorder = monkeyRecorder15;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = null;
        basicJanitorContext7.recorder = monkeyRecorder21;
        java.lang.String str23 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = null;
        basicJanitorContext7.recorder = monkeyRecorder24;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23045");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.resourceTracker;
        java.lang.String str18 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23046");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(janitorResourceTracker17);
    }

    @Test
    public void test23047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23047");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker13;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        java.lang.String str19 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null;
        basicJanitorContext7.config = monkeyConfiguration23;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(monkeyRecorder25);
        org.junit.Assert.assertNull(janitorRuleEngine26);
    }

    @Test
    public void test23048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23048");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker22;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        basicJanitorContext7.recorder = monkeyRecorder25;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder29 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler30 = null;
        basicJanitorContext7.crawler = janitorCrawler30;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorRuleEngine24);
        org.junit.Assert.assertNull(monkeyCalendar27);
        org.junit.Assert.assertNull(monkeyConfiguration28);
        org.junit.Assert.assertNull(monkeyRecorder29);
    }

    @Test
    public void test23049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23049");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        java.lang.String str19 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        java.lang.String str23 = basicJanitorContext7.region();
        java.lang.String str24 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        basicJanitorContext7.recorder = monkeyRecorder25;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = null;
        basicJanitorContext7.recorder = monkeyRecorder28;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(monkeyConfiguration27);
    }

    @Test
    public void test23050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23050");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(monkeyConfiguration21);
    }

    @Test
    public void test23051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23051");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        basicJanitorContext7.crawler = janitorCrawler15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(janitorResourceTracker18);
    }

    @Test
    public void test23052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23052");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        java.lang.String str17 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null;
        basicJanitorContext7.config = monkeyConfiguration23;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker25;
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorResourceTracker22);
    }

    @Test
    public void test23053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23053");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        basicJanitorContext7.config = monkeyConfiguration12;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine17;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = null;
        basicJanitorContext7.crawler = janitorCrawler20;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine22;
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23054");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        java.lang.String str15 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine16;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine23;
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(janitorCrawler19);
        org.junit.Assert.assertNull(monkeyRecorder22);
    }

    @Test
    public void test23055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23055");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.janitorRuleEngine();
        java.lang.String str14 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        basicJanitorContext7.calendar = monkeyCalendar15;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        basicJanitorContext7.recorder = monkeyRecorder17;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorRuleEngine13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23056");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        basicJanitorContext7.config = monkeyConfiguration14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyCalendar16);
    }

    @Test
    public void test23057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23057");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        java.lang.String str17 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        basicJanitorContext7.crawler = janitorCrawler18;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null;
        basicJanitorContext7.calendar = monkeyCalendar21;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar();
        java.lang.String str24 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker25;
        java.lang.String str27 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        basicJanitorContext7.calendar = monkeyCalendar28;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker30 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker30;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(monkeyCalendar23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test23058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23058");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        basicJanitorContext7.recorder = monkeyRecorder13;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        basicJanitorContext7.calendar = monkeyCalendar15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        java.lang.String str20 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(janitorRuleEngine21);
    }

    @Test
    public void test23059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23059");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = basicJanitorContext0.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        basicJanitorContext0.resourceTracker = janitorResourceTracker3;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler5 = basicJanitorContext0.crawler;
        basicJanitorContext0.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder8 = null;
        basicJanitorContext0.recorder = monkeyRecorder8;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext0.resourceTracker;
        java.lang.Class<?> wildcardClass11 = basicJanitorContext0.getClass();
        org.junit.Assert.assertNull(janitorRuleEngine1);
        org.junit.Assert.assertNull(monkeyConfiguration2);
        org.junit.Assert.assertNull(janitorCrawler5);
        org.junit.Assert.assertNull(janitorResourceTracker10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23060");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine26;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker28;
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(monkeyCalendar25);
    }

    @Test
    public void test23061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23061");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorContext0.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null;
        basicJanitorContext0.recorder = monkeyRecorder2;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine4 = null;
        basicJanitorContext0.ruleEngine = janitorRuleEngine4;
        java.lang.String str6 = basicJanitorContext0.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = basicJanitorContext0.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext0.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = basicJanitorContext0.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = basicJanitorContext0.ruleEngine;
        org.junit.Assert.assertNull(monkeyCalendar1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(monkeyRecorder7);
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(janitorCrawler9);
        org.junit.Assert.assertNull(janitorRuleEngine10);
    }

    @Test
    public void test23062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23062");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext7.config = monkeyConfiguration11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.janitorCrawler();
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        basicJanitorContext7.crawler = janitorCrawler22;
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(janitorCrawler21);
    }

    @Test
    public void test23063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23063");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = null;
        basicJanitorContext7.crawler = janitorCrawler23;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler26 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyRecorder25);
        org.junit.Assert.assertNull(janitorCrawler26);
        org.junit.Assert.assertNull(monkeyConfiguration27);
    }

    @Test
    public void test23064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23064");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        java.lang.String str17 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null;
        basicJanitorContext7.calendar = monkeyCalendar18;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = null;
        basicJanitorContext7.recorder = monkeyRecorder26;
        java.lang.String str28 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration29 = null;
        basicJanitorContext7.config = monkeyConfiguration29;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker31 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(janitorResourceTracker31);
    }

    @Test
    public void test23065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23065");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker12;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyConfiguration18);
    }

    @Test
    public void test23066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23066");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        java.lang.String str15 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null;
        basicJanitorContext7.config = monkeyConfiguration21;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        basicJanitorContext7.recorder = monkeyRecorder25;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler28 = basicJanitorContext7.crawler;
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(janitorResourceTracker27);
        org.junit.Assert.assertNull(janitorCrawler28);
    }

    @Test
    public void test23067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23067");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        java.lang.String str21 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(janitorRuleEngine16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
    }

    @Test
    public void test23068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23068");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        basicJanitorContext8.crawler = janitorCrawler9;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext8.config = monkeyConfiguration11;
        basicJanitorContext8.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        basicJanitorContext8.crawler = janitorCrawler15;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext8.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        basicJanitorContext8.crawler = janitorCrawler18;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext8.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext8.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext8.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext8.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor24 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(monkeyCalendar23);
    }

    @Test
    public void test23069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23069");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyConfiguration24);
        org.junit.Assert.assertNull(monkeyCalendar25);
        org.junit.Assert.assertNull(monkeyRecorder26);
    }

    @Test
    public void test23070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23070");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        basicJanitorContext7.crawler = janitorCrawler15;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker17;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorRuleEngine21);
    }

    @Test
    public void test23071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23071");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine21;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine23;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        basicJanitorContext7.recorder = monkeyRecorder25;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorContext7.configuration();
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = null;
        basicJanitorContext7.recorder = monkeyRecorder31;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorResourceTracker27);
        org.junit.Assert.assertNull(monkeyConfiguration28);
    }

    @Test
    public void test23072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23072");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        basicJanitorContext7.recorder = monkeyRecorder13;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        basicJanitorContext7.calendar = monkeyCalendar22;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(janitorResourceTracker25);
    }

    @Test
    public void test23073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23073");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.resourceTracker;
        java.lang.String str16 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23074");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        java.lang.String str23 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(monkeyRecorder25);
    }

    @Test
    public void test23075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23075");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.janitorRuleEngine();
        java.lang.String str23 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker24;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(janitorRuleEngine22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23076");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine22;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine29;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorResourceTracker26);
        org.junit.Assert.assertNull(janitorResourceTracker27);
        org.junit.Assert.assertNull(janitorRuleEngine28);
    }

    @Test
    public void test23077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23077");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        basicJanitorContext7.crawler = janitorCrawler15;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        java.lang.String str20 = basicJanitorContext7.region;
        java.lang.Class<?> wildcardClass21 = basicJanitorContext7.getClass();
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23078");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        basicJanitorContext7.config = monkeyConfiguration22;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker24;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = null;
        basicJanitorContext7.config = monkeyConfiguration27;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(monkeyCalendar26);
    }

    @Test
    public void test23079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23079");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(janitorCrawler19);
    }

    @Test
    public void test23080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23080");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = null;
        basicJanitorContext7.recorder = monkeyRecorder11;
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(janitorCrawler9);
        org.junit.Assert.assertNull(janitorRuleEngine10);
    }

    @Test
    public void test23081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23081");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null;
        basicJanitorContext7.calendar = monkeyCalendar19;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        java.lang.String str24 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine25 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        basicJanitorContext7.calendar = monkeyCalendar28;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyConfiguration21);
        org.junit.Assert.assertNull(janitorRuleEngine22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(janitorRuleEngine25);
        org.junit.Assert.assertNull(monkeyConfiguration26);
        org.junit.Assert.assertNull(monkeyCalendar27);
    }

    @Test
    public void test23082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23082");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        basicJanitorContext7.calendar = monkeyCalendar11;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker17;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null;
        basicJanitorContext7.calendar = monkeyCalendar19;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertNull(janitorCrawler16);
    }

    @Test
    public void test23083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23083");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        basicJanitorContext7.recorder = monkeyRecorder15;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        basicJanitorContext7.crawler = janitorCrawler18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyCalendar20);
    }

    @Test
    public void test23084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23084");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine21;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        java.lang.String str26 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler29 = null;
        basicJanitorContext7.crawler = janitorCrawler29;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(janitorResourceTracker27);
        org.junit.Assert.assertNull(janitorRuleEngine28);
    }

    @Test
    public void test23085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23085");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        java.lang.String str19 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        java.lang.String str23 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorRuleEngine21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(monkeyConfiguration24);
        org.junit.Assert.assertNull(monkeyRecorder25);
        org.junit.Assert.assertNull(monkeyRecorder26);
    }

    @Test
    public void test23086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23086");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        java.lang.String str20 = basicJanitorContext7.region;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker24;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = null;
        basicJanitorContext7.recorder = monkeyRecorder28;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertNull(monkeyRecorder26);
        org.junit.Assert.assertNull(janitorCrawler27);
        org.junit.Assert.assertNull(monkeyRecorder30);
    }

    @Test
    public void test23087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23087");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null;
        basicJanitorContext7.calendar = monkeyCalendar10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        basicJanitorContext7.recorder = monkeyRecorder17;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(janitorRuleEngine16);
    }

    @Test
    public void test23088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23088");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker12;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        basicJanitorContext7.config = monkeyConfiguration14;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        java.lang.String str18 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23089");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine16;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(janitorResourceTracker18);
    }

    @Test
    public void test23090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23090");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        basicJanitorContext7.config = monkeyConfiguration14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        basicJanitorContext7.config = monkeyConfiguration16;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorRuleEngine21);
    }

    @Test
    public void test23091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23091");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null;
        basicJanitorContext7.calendar = monkeyCalendar20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
    }

    @Test
    public void test23092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23092");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertNull(monkeyConfiguration26);
    }

    @Test
    public void test23093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23093");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.janitorCrawler();
        java.lang.String str24 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23094");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = null;
        basicJanitorContext7.recorder = monkeyRecorder21;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null;
        basicJanitorContext7.calendar = monkeyCalendar25;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyCalendar23);
        org.junit.Assert.assertNull(monkeyConfiguration24);
        org.junit.Assert.assertNull(monkeyRecorder27);
    }

    @Test
    public void test23095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23095");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null;
        basicJanitorContext7.calendar = monkeyCalendar14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        basicJanitorContext7.calendar = monkeyCalendar16;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.crawler;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null;
        basicJanitorContext7.calendar = monkeyCalendar21;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = basicJanitorContext7.janitorResourceTracker();
        java.lang.String str25 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(monkeyCalendar23);
        org.junit.Assert.assertNull(janitorResourceTracker24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(monkeyRecorder26);
        org.junit.Assert.assertNull(janitorCrawler27);
    }

    @Test
    public void test23096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23096");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine25 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine25;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker27;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar29 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine30 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine30;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine32 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine32;
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(monkeyCalendar29);
    }

    @Test
    public void test23097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23097");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        java.lang.String str22 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyRecorder24);
    }

    @Test
    public void test23098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23098");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.crawler;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = null;
        basicJanitorContext7.crawler = janitorCrawler25;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker28;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler30 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration31 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder32 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar33 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine34 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar35 = null;
        basicJanitorContext7.calendar = monkeyCalendar35;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(monkeyRecorder24);
        org.junit.Assert.assertNull(janitorRuleEngine27);
        org.junit.Assert.assertNull(janitorCrawler30);
        org.junit.Assert.assertNull(monkeyConfiguration31);
        org.junit.Assert.assertNull(monkeyRecorder32);
        org.junit.Assert.assertNull(monkeyCalendar33);
        org.junit.Assert.assertNull(janitorRuleEngine34);
    }

    @Test
    public void test23099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23099");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar;
        java.lang.String str25 = basicJanitorContext7.region();
        basicJanitorContext7.region = "hi!";
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test23100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23100");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker22;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorRuleEngine26);
        org.junit.Assert.assertNull(janitorResourceTracker27);
        org.junit.Assert.assertNull(monkeyCalendar28);
        org.junit.Assert.assertNull(janitorRuleEngine29);
    }

    @Test
    public void test23101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23101");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        java.lang.String str11 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorResourceTracker19);
    }

    @Test
    public void test23102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23102");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        java.lang.String str22 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = basicJanitorContext7.resourceTracker;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration29 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = null;
        basicJanitorContext7.recorder = monkeyRecorder30;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker32 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker32;
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(janitorResourceTracker24);
        org.junit.Assert.assertNull(janitorCrawler27);
        org.junit.Assert.assertNull(monkeyCalendar28);
        org.junit.Assert.assertNull(monkeyConfiguration29);
    }

    @Test
    public void test23103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23103");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        basicJanitorContext8.crawler = janitorCrawler9;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext8.config = monkeyConfiguration11;
        basicJanitorContext8.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        basicJanitorContext8.crawler = janitorCrawler15;
        basicJanitorContext8.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext8.recorder;
        java.lang.String str20 = basicJanitorContext8.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext8.resourceTracker = janitorResourceTracker21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext8.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        basicJanitorContext8.resourceTracker = janitorResourceTracker24;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = null;
        basicJanitorContext8.recorder = monkeyRecorder26;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = null;
        basicJanitorContext8.ruleEngine = janitorRuleEngine28;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar30 = basicJanitorContext8.calendar;
        java.lang.String str31 = basicJanitorContext8.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler32 = basicJanitorContext8.crawler;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker33 = null;
        basicJanitorContext8.resourceTracker = janitorResourceTracker33;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor35 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyRecorder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(monkeyCalendar30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(janitorCrawler32);
    }

    @Test
    public void test23104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23104");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = null;
        basicJanitorContext7.crawler = janitorCrawler16;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine20;
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyCalendar13);
    }

    @Test
    public void test23105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23105");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        java.lang.String str17 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        basicJanitorContext7.crawler = janitorCrawler22;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(janitorResourceTracker24);
    }

    @Test
    public void test23106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23106");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = null;
        basicJanitorContext7.crawler = janitorCrawler23;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        basicJanitorContext7.recorder = monkeyRecorder25;
        org.junit.Assert.assertNull(monkeyRecorder18);
    }

    @Test
    public void test23107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23107");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        basicJanitorContext7.calendar = monkeyCalendar13;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        basicJanitorContext7.calendar = monkeyCalendar15;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        java.lang.String str20 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker24;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(monkeyRecorder23);
    }

    @Test
    public void test23108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23108");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        basicJanitorContext7.calendar = monkeyCalendar22;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = null;
        basicJanitorContext7.recorder = monkeyRecorder26;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        basicJanitorContext7.calendar = monkeyCalendar28;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler30 = null;
        basicJanitorContext7.crawler = janitorCrawler30;
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(monkeyRecorder25);
    }

    @Test
    public void test23109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23109");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null;
        basicJanitorContext7.config = monkeyConfiguration21;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(janitorResourceTracker20);
    }

    @Test
    public void test23110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23110");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        basicJanitorContext7.crawler = janitorCrawler18;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
    }

    @Test
    public void test23111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23111");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorRuleEngine15);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
    }

    @Test
    public void test23112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23112");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
    }

    @Test
    public void test23113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23113");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        basicJanitorContext7.calendar = monkeyCalendar22;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine24;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler28 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorCrawler28);
        org.junit.Assert.assertNull(janitorResourceTracker29);
    }

    @Test
    public void test23114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23114");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null;
        basicJanitorContext7.calendar = monkeyCalendar23;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler29 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertNull(janitorResourceTracker28);
        org.junit.Assert.assertNull(janitorCrawler29);
        org.junit.Assert.assertNull(monkeyRecorder30);
    }

    @Test
    public void test23115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23115");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = basicJanitorContext0.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration2 = basicJanitorContext0.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        basicJanitorContext0.resourceTracker = janitorResourceTracker3;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        basicJanitorContext0.config = monkeyConfiguration5;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        basicJanitorContext0.recorder = monkeyRecorder7;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext0.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker10 = basicJanitorContext0.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorRuleEngine1);
        org.junit.Assert.assertNull(monkeyConfiguration2);
        org.junit.Assert.assertNull(monkeyRecorder9);
        org.junit.Assert.assertNull(janitorResourceTracker10);
    }

    @Test
    public void test23116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23116");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler28 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(janitorRuleEngine24);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertNull(janitorResourceTracker26);
        org.junit.Assert.assertNull(monkeyCalendar27);
        org.junit.Assert.assertNull(janitorCrawler28);
    }

    @Test
    public void test23117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23117");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        basicJanitorContext8.crawler = janitorCrawler9;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext8.config = monkeyConfiguration11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext8.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext8.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext8.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext8.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext8.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext8.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        basicJanitorContext8.recorder = monkeyRecorder19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext8.crawler = janitorCrawler21;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor23 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(janitorRuleEngine15);
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
    }

    @Test
    public void test23118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23118");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        basicJanitorContext8.crawler = janitorCrawler9;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext8.config = monkeyConfiguration11;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext8.recorder();
        java.lang.String str14 = basicJanitorContext8.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext8.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext8.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext8.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext8.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext8.ruleEngine;
        java.lang.String str20 = basicJanitorContext8.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext8.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext8.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext8.janitorCrawler();
        java.lang.String str24 = basicJanitorContext8.region;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor25 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23119");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar1 = basicJanitorContext0.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder2 = null;
        basicJanitorContext0.recorder = monkeyRecorder2;
        basicJanitorContext0.region = "hi!";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = null;
        basicJanitorContext0.calendar = monkeyCalendar6;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = basicJanitorContext0.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder9 = basicJanitorContext0.recorder();
        org.junit.Assert.assertNull(monkeyCalendar1);
        org.junit.Assert.assertNull(janitorRuleEngine8);
        org.junit.Assert.assertNull(monkeyRecorder9);
    }

    @Test
    public void test23120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23120");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        java.lang.String str14 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        basicJanitorContext7.recorder = monkeyRecorder15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = null;
        basicJanitorContext7.config = monkeyConfiguration20;
        basicJanitorContext7.region = "hi!";
        java.lang.String str24 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test23121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23121");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext7.config = monkeyConfiguration11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.janitorCrawler();
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        java.lang.String str22 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyRecorder19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(janitorCrawler24);
    }

    @Test
    public void test23122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23122");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        java.lang.String str19 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.ruleEngine;
        java.lang.String str22 = basicJanitorContext7.region;
        java.lang.String str23 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null;
        basicJanitorContext7.calendar = monkeyCalendar25;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null;
        basicJanitorContext7.recorder = monkeyRecorder27;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine29;
        java.lang.String str31 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler32 = null;
        basicJanitorContext7.crawler = janitorCrawler32;
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorRuleEngine21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(monkeyRecorder24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test23123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23123");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.crawler;
        java.lang.String str11 = basicJanitorContext7.region();
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        basicJanitorContext7.recorder = monkeyRecorder18;
        java.lang.String str20 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine21;
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test23124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23124");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        java.lang.String str15 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = null;
        basicJanitorContext7.crawler = janitorCrawler16;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        basicJanitorContext7.crawler = janitorCrawler18;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        java.lang.String str21 = basicJanitorContext7.region();
        java.lang.String str22 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = null;
        basicJanitorContext7.recorder = monkeyRecorder26;
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(monkeyCalendar23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(janitorResourceTracker25);
    }

    @Test
    public void test23125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23125");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        java.lang.String str24 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = null;
        basicJanitorContext7.recorder = monkeyRecorder27;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(monkeyRecorder25);
        org.junit.Assert.assertNull(monkeyCalendar26);
        org.junit.Assert.assertNull(janitorResourceTracker29);
        org.junit.Assert.assertNull(monkeyRecorder30);
    }

    @Test
    public void test23126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23126");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder();
        java.lang.String str21 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine22;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null;
        basicJanitorContext7.calendar = monkeyCalendar24;
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23127");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        java.lang.String str18 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker25;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler28 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(janitorCrawler20);
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(monkeyConfiguration27);
        org.junit.Assert.assertNull(janitorCrawler28);
        org.junit.Assert.assertNull(janitorRuleEngine29);
    }

    @Test
    public void test23128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23128");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine22;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = null;
        basicJanitorContext7.calendar = monkeyCalendar27;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration29 = null;
        basicJanitorContext7.config = monkeyConfiguration29;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar33 = basicJanitorContext7.calendar;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(monkeyConfiguration24);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertNull(monkeyRecorder26);
        org.junit.Assert.assertNull(monkeyCalendar33);
    }

    @Test
    public void test23129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23129");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext7.calendar = monkeyCalendar17;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        basicJanitorContext7.config = monkeyConfiguration19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.crawler;
        basicJanitorContext7.region = "";
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(janitorCrawler23);
    }

    @Test
    public void test23130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23130");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        java.lang.String str14 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        java.lang.String str17 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = null;
        basicJanitorContext7.config = monkeyConfiguration20;
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23131");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext7.config = monkeyConfiguration11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine16;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.resourceTracker;
        java.lang.String str19 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23132");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        java.lang.String str24 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.configuration();
        basicJanitorContext7.region = "";
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(monkeyConfiguration25);
    }

    @Test
    public void test23133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23133");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        java.lang.String str15 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        basicJanitorContext7.calendar = monkeyCalendar16;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23134");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        java.lang.String str20 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorContext7.recorder();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(monkeyRecorder22);
        org.junit.Assert.assertNull(monkeyCalendar25);
        org.junit.Assert.assertNull(monkeyRecorder26);
    }

    @Test
    public void test23135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23135");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        basicJanitorContext8.crawler = janitorCrawler9;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext8.config = monkeyConfiguration11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext8.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext8.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext8.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        basicJanitorContext8.calendar = monkeyCalendar16;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext8.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext8.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext8.calendar;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext8.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor22 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(janitorRuleEngine21);
    }

    @Test
    public void test23136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23136");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        java.lang.String str11 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine13;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null;
        basicJanitorContext7.calendar = monkeyCalendar20;
        java.lang.Class<?> wildcardClass22 = basicJanitorContext7.getClass();
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23137");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker18;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = null;
        basicJanitorContext7.recorder = monkeyRecorder23;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(monkeyRecorder22);
    }

    @Test
    public void test23138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23138");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine13;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        basicJanitorContext7.calendar = monkeyCalendar15;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        java.lang.String str18 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = monkeyCalendar21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(monkeyCalendar21);
    }

    @Test
    public void test23139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23139");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        java.lang.String str23 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker24;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null;
        basicJanitorContext7.calendar = monkeyCalendar26;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23140");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = null;
        basicJanitorContext7.recorder = monkeyRecorder22;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(janitorRuleEngine24);
    }

    @Test
    public void test23141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23141");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        basicJanitorContext7.config = monkeyConfiguration25;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = basicJanitorContext7.recorder;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(monkeyRecorder27);
    }

    @Test
    public void test23142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23142");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine12;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine17;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(monkeyCalendar21);
    }

    @Test
    public void test23143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23143");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(janitorResourceTracker22);
    }

    @Test
    public void test23144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23144");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext7.recorder;
        basicJanitorContext7.region = "";
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine22;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar;
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(janitorCrawler19);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyConfiguration21);
        org.junit.Assert.assertNull(monkeyCalendar24);
    }

    @Test
    public void test23145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23145");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorContext7.calendar();
        java.lang.String str15 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null;
        basicJanitorContext7.calendar = monkeyCalendar19;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null;
        basicJanitorContext7.calendar = monkeyCalendar25;
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyCalendar14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(monkeyConfiguration21);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(janitorRuleEngine24);
    }

    @Test
    public void test23146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23146");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        basicJanitorContext7.calendar = monkeyCalendar16;
        java.lang.String str18 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.janitorResourceTracker();
        java.lang.Class<?> wildcardClass20 = basicJanitorContext7.getClass();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23147");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        basicJanitorContext7.config = monkeyConfiguration13;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext7.calendar = monkeyCalendar17;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        basicJanitorContext7.recorder = monkeyRecorder19;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(janitorResourceTracker11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
    }

    @Test
    public void test23148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23148");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        basicJanitorContext8.crawler = janitorCrawler9;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext8.config;
        java.lang.String str12 = basicJanitorContext8.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext8.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext8.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext8.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext8.calendar;
        java.lang.String str18 = basicJanitorContext8.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        basicJanitorContext8.config = monkeyConfiguration19;
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor21 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23149");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        basicJanitorContext7.recorder = monkeyRecorder18;
        java.lang.String str20 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(monkeyCalendar25);
        org.junit.Assert.assertNull(janitorResourceTracker26);
    }

    @Test
    public void test23150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23150");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = null;
        basicJanitorContext7.recorder = monkeyRecorder22;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        basicJanitorContext7.crawler = janitorCrawler27;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(monkeyConfiguration21);
        org.junit.Assert.assertNull(janitorResourceTracker24);
        org.junit.Assert.assertNull(monkeyRecorder25);
        org.junit.Assert.assertNull(monkeyConfiguration26);
    }

    @Test
    public void test23151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23151");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null;
        basicJanitorContext7.calendar = monkeyCalendar25;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(monkeyRecorder24);
    }

    @Test
    public void test23152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23152");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine16;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(janitorRuleEngine13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(janitorCrawler19);
        org.junit.Assert.assertNull(monkeyConfiguration22);
    }

    @Test
    public void test23153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23153");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(monkeyRecorder23);
    }

    @Test
    public void test23154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23154");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        java.lang.String str15 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null;
        basicJanitorContext7.config = monkeyConfiguration23;
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
    }

    @Test
    public void test23155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23155");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar;
        java.lang.String str17 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23156");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        basicJanitorContext7.config = monkeyConfiguration16;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        basicJanitorContext7.config = monkeyConfiguration22;
        basicJanitorContext7.region = "hi!";
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(janitorRuleEngine15);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(janitorResourceTracker19);
    }

    @Test
    public void test23157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23157");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.config;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(monkeyConfiguration21);
    }

    @Test
    public void test23158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23158");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
    }

    @Test
    public void test23159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23159");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        basicJanitorContext8.crawler = janitorCrawler9;
        java.lang.String str11 = basicJanitorContext8.region();
        basicJanitorContext8.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null;
        basicJanitorContext8.resourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext8.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = null;
        basicJanitorContext8.crawler = janitorCrawler18;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext8.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext8.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext8.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext8.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext8.janitorResourceTracker();
        basicJanitorContext8.region = "";
        java.lang.String str28 = basicJanitorContext8.region();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor29 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(janitorRuleEngine24);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test23160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23160");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        java.lang.String str14 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(monkeyConfiguration17);
    }

    @Test
    public void test23161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23161");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorContext7.calendar();
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        basicJanitorContext7.recorder = monkeyRecorder17;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = monkeyConfiguration22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyCalendar14);
        org.junit.Assert.assertNull(monkeyRecorder19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(monkeyConfiguration21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
    }

    @Test
    public void test23162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23162");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        java.lang.String str14 = basicJanitorContext7.region();
        java.lang.String str15 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyRecorder19);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
    }

    @Test
    public void test23163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23163");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder();
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        basicJanitorContext7.config = monkeyConfiguration22;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.ruleEngine;
        java.lang.String str25 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder27 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(janitorRuleEngine24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(janitorRuleEngine26);
        org.junit.Assert.assertNull(monkeyRecorder27);
        org.junit.Assert.assertNull(janitorRuleEngine28);
        org.junit.Assert.assertNull(janitorRuleEngine29);
    }

    @Test
    public void test23164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23164");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.config;
        java.lang.String str26 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.resourceTracker;
        java.lang.Class<?> wildcardClass28 = basicJanitorContext7.getClass();
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(monkeyConfiguration24);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(janitorResourceTracker27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test23165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23165");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = basicJanitorContext7.crawler;
        java.lang.String str26 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(janitorResourceTracker24);
        org.junit.Assert.assertNull(janitorCrawler25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(janitorResourceTracker27);
    }

    @Test
    public void test23166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23166");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine27;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine29;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker31 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(monkeyConfiguration24);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertNull(janitorResourceTracker26);
        org.junit.Assert.assertNull(janitorResourceTracker31);
    }

    @Test
    public void test23167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23167");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        java.lang.String str20 = basicJanitorContext7.region;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = null;
        basicJanitorContext7.crawler = janitorCrawler25;
        java.lang.String str27 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(janitorCrawler23);
        org.junit.Assert.assertNull(janitorRuleEngine24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test23168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23168");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar();
        java.lang.String str23 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null;
        basicJanitorContext7.calendar = monkeyCalendar26;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = basicJanitorContext7.recorder;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(monkeyRecorder28);
    }

    @Test
    public void test23169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23169");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        basicJanitorContext7.recorder = monkeyRecorder13;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine17;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        basicJanitorContext7.recorder = monkeyRecorder19;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        java.lang.String str24 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(janitorRuleEngine21);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23170");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        java.lang.String str17 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.configuration();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null;
        basicJanitorContext7.config = monkeyConfiguration23;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        basicJanitorContext7.config = monkeyConfiguration25;
        basicJanitorContext7.region = "hi!";
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
    }

    @Test
    public void test23171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23171");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        java.lang.String str17 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null;
        basicJanitorContext7.config = monkeyConfiguration23;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder;
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(monkeyRecorder25);
    }

    @Test
    public void test23172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23172");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = null;
        basicJanitorContext7.recorder = monkeyRecorder22;
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(janitorCrawler21);
    }

    @Test
    public void test23173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23173");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = null;
        basicJanitorContext7.config = monkeyConfiguration30;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine32 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine32;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker34 = basicJanitorContext7.janitorResourceTracker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = janitorResourceTracker34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(monkeyRecorder22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertNull(janitorResourceTracker26);
        org.junit.Assert.assertNull(janitorRuleEngine27);
        org.junit.Assert.assertNull(monkeyConfiguration28);
        org.junit.Assert.assertNull(janitorResourceTracker29);
        org.junit.Assert.assertNull(janitorResourceTracker34);
    }

    @Test
    public void test23174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23174");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        basicJanitorContext7.config = monkeyConfiguration14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null;
        basicJanitorContext7.calendar = monkeyCalendar18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null;
        basicJanitorContext7.calendar = monkeyCalendar20;
        basicJanitorContext7.region = "hi!";
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
    }

    @Test
    public void test23175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23175");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker22;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker24;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorResourceTracker26);
    }

    @Test
    public void test23176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23176");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.config;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null;
        basicJanitorContext7.calendar = monkeyCalendar18;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        basicJanitorContext7.crawler = janitorCrawler22;
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertNull(monkeyRecorder21);
    }

    @Test
    public void test23177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23177");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.configuration();
        java.lang.String str17 = basicJanitorContext7.region;
        java.lang.String str18 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar;
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(monkeyCalendar19);
    }

    @Test
    public void test23178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23178");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext7.config = monkeyConfiguration11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext7.calendar = monkeyCalendar17;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null;
        basicJanitorContext7.calendar = monkeyCalendar23;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = null;
        basicJanitorContext7.calendar = monkeyCalendar26;
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(monkeyRecorder19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(janitorCrawler25);
    }

    @Test
    public void test23179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23179");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        basicJanitorContext7.recorder = monkeyRecorder14;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar;
        java.lang.String str18 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = basicJanitorContext7.recorder();
        basicJanitorContext7.region = "";
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(janitorRuleEngine16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(monkeyRecorder19);
    }

    @Test
    public void test23180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23180");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler26 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = null;
        basicJanitorContext7.calendar = monkeyCalendar27;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine29;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler31 = null;
        basicJanitorContext7.crawler = janitorCrawler31;
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(janitorCrawler26);
    }

    @Test
    public void test23181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23181");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine29;
        java.lang.String str31 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertNull(monkeyCalendar26);
        org.junit.Assert.assertNull(monkeyConfiguration27);
        org.junit.Assert.assertNull(janitorRuleEngine28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test23182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23182");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext7.calendar = monkeyCalendar17;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertNull(janitorRuleEngine21);
    }

    @Test
    public void test23183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23183");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = null;
        basicJanitorContext7.crawler = janitorCrawler20;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
    }

    @Test
    public void test23184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23184");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.janitorCrawler();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.crawler;
        java.lang.String str23 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler28 = basicJanitorContext7.crawler;
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorCrawler19);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(janitorCrawler25);
        org.junit.Assert.assertNull(monkeyCalendar26);
        org.junit.Assert.assertNull(monkeyConfiguration27);
        org.junit.Assert.assertNull(janitorCrawler28);
    }

    @Test
    public void test23185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23185");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine25 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine26 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(monkeyRecorder22);
        org.junit.Assert.assertNull(monkeyCalendar23);
        org.junit.Assert.assertNull(monkeyRecorder24);
        org.junit.Assert.assertNull(janitorRuleEngine25);
        org.junit.Assert.assertNull(janitorRuleEngine26);
    }

    @Test
    public void test23186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23186");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration28 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker29 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine31 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration32 = basicJanitorContext7.config;
        java.lang.String str33 = basicJanitorContext7.region;
        java.lang.String str34 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(monkeyRecorder22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertNull(janitorResourceTracker26);
        org.junit.Assert.assertNull(janitorRuleEngine27);
        org.junit.Assert.assertNull(monkeyConfiguration28);
        org.junit.Assert.assertNull(janitorResourceTracker29);
        org.junit.Assert.assertNull(monkeyRecorder30);
        org.junit.Assert.assertNull(janitorRuleEngine31);
        org.junit.Assert.assertNull(monkeyConfiguration32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test23187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23187");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration8 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar9 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = null;
        basicJanitorContext7.calendar = monkeyCalendar11;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker13;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyConfiguration8);
        org.junit.Assert.assertNull(monkeyCalendar9);
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(janitorCrawler15);
    }

    @Test
    public void test23188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23188");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null;
        basicJanitorContext7.calendar = monkeyCalendar18;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar;
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(monkeyCalendar23);
    }

    @Test
    public void test23189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23189");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.crawler;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = null;
        basicJanitorContext7.crawler = janitorCrawler25;
        java.lang.String str27 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        basicJanitorContext7.calendar = monkeyCalendar28;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler30 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder31 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker32 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar33 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker34 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker34;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(monkeyRecorder24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(janitorCrawler30);
        org.junit.Assert.assertNull(monkeyRecorder31);
        org.junit.Assert.assertNull(janitorResourceTracker32);
        org.junit.Assert.assertNull(monkeyCalendar33);
    }

    @Test
    public void test23190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23190");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        java.lang.String str20 = basicJanitorContext7.region;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.janitorResourceTracker();
        java.lang.String str24 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23191");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        basicJanitorContext7.recorder = monkeyRecorder18;
        java.lang.String str20 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null;
        basicJanitorContext7.config = monkeyConfiguration26;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = null;
        basicJanitorContext7.recorder = monkeyRecorder28;
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertNull(janitorResourceTracker15);
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(monkeyCalendar25);
    }

    @Test
    public void test23192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23192");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
    }

    @Test
    public void test23193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23193");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker18;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker23;
        java.lang.String str25 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test23194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23194");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
    }

    @Test
    public void test23195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23195");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        basicJanitorContext7.config = monkeyConfiguration13;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        java.lang.String str19 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        basicJanitorContext7.config = monkeyConfiguration24;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(monkeyCalendar23);
    }

    @Test
    public void test23196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23196");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker13;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        java.lang.String str19 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null;
        basicJanitorContext7.config = monkeyConfiguration23;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder28 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder29 = basicJanitorContext7.recorder();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(janitorCrawler25);
        org.junit.Assert.assertNull(monkeyRecorder28);
        org.junit.Assert.assertNull(monkeyRecorder29);
    }

    @Test
    public void test23197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23197");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = basicJanitorContext7.recorder;
        basicJanitorContext7.region = "";
        java.lang.String str13 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar;
        java.lang.String str20 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(monkeyRecorder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23198");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine22;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine25 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyConfiguration24);
        org.junit.Assert.assertNull(janitorRuleEngine25);
    }

    @Test
    public void test23199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23199");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        java.lang.String str19 = basicJanitorContext7.region();
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        basicJanitorContext7.calendar = monkeyCalendar22;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = null;
        basicJanitorContext7.calendar = monkeyCalendar27;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine29 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration30 = null;
        basicJanitorContext7.config = monkeyConfiguration30;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(monkeyConfiguration26);
        org.junit.Assert.assertNull(janitorRuleEngine29);
    }

    @Test
    public void test23200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23200");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker13;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder19 = null;
        basicJanitorContext7.recorder = monkeyRecorder19;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine24;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = null;
        basicJanitorContext7.config = monkeyConfiguration26;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler28 = null;
        basicJanitorContext7.crawler = janitorCrawler28;
        basicJanitorContext7.region = "hi!";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(janitorRuleEngine22);
        org.junit.Assert.assertNull(janitorCrawler23);
    }

    @Test
    public void test23201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23201");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = null;
        basicJanitorContext7.config = monkeyConfiguration17;
        java.lang.String str19 = basicJanitorContext7.region();
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        basicJanitorContext7.config = monkeyConfiguration25;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertNull(janitorCrawler24);
    }

    @Test
    public void test23202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23202");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        basicJanitorContext7.calendar = monkeyCalendar22;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null;
        basicJanitorContext7.calendar = monkeyCalendar25;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration29 = basicJanitorContext7.config;
        java.lang.String str30 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(janitorResourceTracker27);
        org.junit.Assert.assertNull(janitorRuleEngine28);
        org.junit.Assert.assertNull(monkeyConfiguration29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test23203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23203");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        basicJanitorContext7.config = monkeyConfiguration14;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker17;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null;
        basicJanitorContext7.calendar = monkeyCalendar21;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(janitorRuleEngine23);
    }

    @Test
    public void test23204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23204");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = null;
        basicJanitorContext7.config = monkeyConfiguration23;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar25 = null;
        basicJanitorContext7.calendar = monkeyCalendar25;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = basicJanitorContext7.janitorRuleEngine();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = janitorRuleEngine27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(janitorRuleEngine27);
    }

    @Test
    public void test23205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23205");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        java.lang.String str18 = basicJanitorContext7.region();
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
    }

    @Test
    public void test23206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23206");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine21;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        java.lang.String str25 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(janitorResourceTracker26);
    }

    @Test
    public void test23207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23207");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        basicJanitorContext7.config = monkeyConfiguration13;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = null;
        basicJanitorContext7.config = monkeyConfiguration18;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(janitorResourceTracker20);
    }

    @Test
    public void test23208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23208");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = null;
        basicJanitorContext7.recorder = monkeyRecorder21;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = null;
        basicJanitorContext7.recorder = monkeyRecorder24;
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorRuleEngine23);
    }

    @Test
    public void test23209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23209");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder();
        java.lang.String str15 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        java.lang.String str20 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null;
        basicJanitorContext7.config = monkeyConfiguration21;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(janitorCrawler23);
    }

    @Test
    public void test23210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23210");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(janitorRuleEngine15);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
    }

    @Test
    public void test23211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23211");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext7.calendar = monkeyCalendar17;
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyRecorder15);
        org.junit.Assert.assertNull(janitorCrawler16);
    }

    @Test
    public void test23212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23212");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker9;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = null;
        basicJanitorContext7.crawler = janitorCrawler13;
        java.lang.String str15 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        basicJanitorContext7.calendar = monkeyCalendar16;
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23213");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler9 = null;
        basicJanitorContext8.crawler = janitorCrawler9;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext8.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = null;
        basicJanitorContext8.config = monkeyConfiguration12;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext8.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext8.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        basicJanitorContext8.config = monkeyConfiguration16;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext8.calendar();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor19 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(monkeyCalendar18);
    }

    @Test
    public void test23214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23214");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = null;
        basicJanitorContext7.crawler = janitorCrawler21;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine25 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder26 = basicJanitorContext7.recorder;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(janitorResourceTracker24);
        org.junit.Assert.assertNull(janitorRuleEngine25);
        org.junit.Assert.assertNull(monkeyRecorder26);
    }

    @Test
    public void test23215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23215");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = null;
        basicJanitorContext7.recorder = monkeyRecorder21;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyCalendar23);
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertNull(monkeyConfiguration26);
    }

    @Test
    public void test23216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23216");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext7.calendar;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine17;
        java.lang.String str19 = basicJanitorContext7.region();
        java.lang.String str20 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23217");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        java.lang.String str14 = basicJanitorContext7.region();
        java.lang.String str15 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker17;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(janitorRuleEngine21);
        org.junit.Assert.assertNull(janitorResourceTracker22);
    }

    @Test
    public void test23218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23218");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        basicJanitorContext7.recorder = monkeyRecorder17;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        basicJanitorContext7.region = "hi!";
        org.junit.Assert.assertNull(monkeyCalendar14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorRuleEngine19);
    }

    @Test
    public void test23219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23219");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker28 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertNull(janitorResourceTracker26);
        org.junit.Assert.assertNull(monkeyConfiguration27);
        org.junit.Assert.assertNull(janitorResourceTracker28);
    }

    @Test
    public void test23220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23220");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null;
        basicJanitorContext7.calendar = monkeyCalendar19;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = null;
        basicJanitorContext7.crawler = janitorCrawler24;
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertNull(monkeyConfiguration23);
    }

    @Test
    public void test23221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23221");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine19;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker22;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine24 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = null;
        basicJanitorContext7.recorder = monkeyRecorder25;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar27 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine28 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine28;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker32 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine33 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar34 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration35 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration36 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorRuleEngine24);
        org.junit.Assert.assertNull(monkeyCalendar27);
        org.junit.Assert.assertNull(janitorResourceTracker32);
        org.junit.Assert.assertNull(janitorRuleEngine33);
        org.junit.Assert.assertNull(monkeyCalendar34);
        org.junit.Assert.assertNull(monkeyConfiguration35);
        org.junit.Assert.assertNull(monkeyConfiguration36);
    }

    @Test
    public void test23222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23222");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(janitorResourceTracker15);
    }

    @Test
    public void test23223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23223");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = null;
        basicJanitorContext7.recorder = monkeyRecorder13;
        java.lang.String str15 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(janitorCrawler16);
        org.junit.Assert.assertNull(monkeyRecorder17);
    }

    @Test
    public void test23224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23224");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine9 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = null;
        basicJanitorContext7.recorder = monkeyRecorder14;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = null;
        basicJanitorContext7.crawler = janitorCrawler16;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorRuleEngine9);
        org.junit.Assert.assertNull(monkeyCalendar10);
        org.junit.Assert.assertNull(monkeyConfiguration11);
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorRuleEngine13);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(janitorCrawler19);
    }

    @Test
    public void test23225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23225");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        java.lang.String str9 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine10;
        java.lang.String str12 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(janitorCrawler14);
    }

    @Test
    public void test23226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23226");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = basicJanitorContext7.crawler;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertNull(monkeyCalendar24);
        org.junit.Assert.assertNull(janitorCrawler25);
    }

    @Test
    public void test23227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23227");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = null;
        basicJanitorContext7.crawler = janitorCrawler23;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker27 = basicJanitorContext7.janitorResourceTracker();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertNull(monkeyConfiguration25);
        org.junit.Assert.assertNull(monkeyCalendar26);
        org.junit.Assert.assertNull(janitorResourceTracker27);
    }

    @Test
    public void test23228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23228");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        java.lang.String str14 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext7.janitorRuleEngine();
        basicJanitorContext7.region = "hi!";
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.ruleEngine;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(janitorRuleEngine15);
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertNull(janitorRuleEngine22);
    }

    @Test
    public void test23229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23229");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        java.lang.String str14 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.resourceTracker;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(monkeyCalendar15);
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(monkeyCalendar22);
        org.junit.Assert.assertNull(janitorResourceTracker23);
        org.junit.Assert.assertNull(monkeyRecorder24);
    }

    @Test
    public void test23230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23230");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar10 = null;
        basicJanitorContext7.calendar = monkeyCalendar10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = null;
        basicJanitorContext7.config = monkeyConfiguration13;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        basicJanitorContext7.recorder = monkeyRecorder15;
        java.lang.String str17 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine20;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertNull(janitorCrawler19);
    }

    @Test
    public void test23231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23231");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker19 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine21 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker23;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.resourceTracker;
        java.lang.String str26 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine27;
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorResourceTracker19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(janitorRuleEngine21);
        org.junit.Assert.assertNull(monkeyRecorder22);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test23232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23232");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine18;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = basicJanitorContext7.janitorCrawler();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(janitorCrawler20);
    }

    @Test
    public void test23233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23233");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        java.lang.String str11 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration12 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.ruleEngine;
        java.lang.String str14 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        basicJanitorContext7.recorder = monkeyRecorder17;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(monkeyConfiguration12);
        org.junit.Assert.assertNull(janitorRuleEngine13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(janitorCrawler15);
        org.junit.Assert.assertNull(janitorRuleEngine16);
    }

    @Test
    public void test23234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23234");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar11 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar12 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = null;
        basicJanitorContext7.recorder = monkeyRecorder18;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(monkeyCalendar11);
        org.junit.Assert.assertNull(monkeyCalendar12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(monkeyRecorder15);
    }

    @Test
    public void test23235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23235");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine16 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine16;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        basicJanitorContext7.calendar = monkeyCalendar22;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorRuleEngine13);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(monkeyCalendar21);
    }

    @Test
    public void test23236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23236");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyCalendar18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyCalendar20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(janitorRuleEngine22);
    }

    @Test
    public void test23237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23237");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration11 = null;
        basicJanitorContext7.config = monkeyConfiguration11;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        java.lang.String str14 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        basicJanitorContext7.calendar = monkeyCalendar15;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorContext7.configuration();
        org.junit.Assert.assertNull(janitorCrawler10);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(monkeyCalendar17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyConfiguration20);
    }

    @Test
    public void test23238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23238");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker20;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker23;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration25 = null;
        basicJanitorContext7.config = monkeyConfiguration25;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine27 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorCrawler17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyRecorder22);
        org.junit.Assert.assertNull(janitorRuleEngine27);
    }

    @Test
    public void test23239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23239");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null;
        basicJanitorContext7.calendar = monkeyCalendar20;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = null;
        basicJanitorContext7.crawler = janitorCrawler22;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar24 = null;
        basicJanitorContext7.calendar = monkeyCalendar24;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyCalendar19);
    }

    @Test
    public void test23240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23240");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        basicJanitorContext7.crawler = janitorCrawler15;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = basicJanitorContext7.recorder;
        java.lang.String str18 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = null;
        basicJanitorContext7.calendar = monkeyCalendar19;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = null;
        basicJanitorContext7.config = monkeyConfiguration21;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration23 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = null;
        basicJanitorContext7.recorder = monkeyRecorder24;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorContext7.calendar;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(monkeyRecorder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(monkeyConfiguration23);
        org.junit.Assert.assertNull(monkeyCalendar26);
    }

    @Test
    public void test23241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23241");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler10 = null;
        basicJanitorContext7.crawler = janitorCrawler10;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine12 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder13 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = null;
        basicJanitorContext7.config = monkeyConfiguration14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = null;
        basicJanitorContext7.config = monkeyConfiguration16;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        java.lang.String str19 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.janitorCrawler();
        java.lang.String str23 = basicJanitorContext7.region();
        org.junit.Assert.assertNull(janitorResourceTracker8);
        org.junit.Assert.assertNull(janitorResourceTracker9);
        org.junit.Assert.assertNull(janitorRuleEngine12);
        org.junit.Assert.assertNull(monkeyRecorder13);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(monkeyCalendar21);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23242");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext7.recorder;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar21 = null;
        basicJanitorContext7.calendar = monkeyCalendar21;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler23 = null;
        basicJanitorContext7.crawler = janitorCrawler23;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.resourceTracker;
        java.lang.String str26 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration27 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyRecorder18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(janitorResourceTracker20);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(monkeyConfiguration27);
    }

    @Test
    public void test23243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23243");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = null;
        basicJanitorContext7.calendar = monkeyCalendar14;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = null;
        basicJanitorContext7.calendar = monkeyCalendar16;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler18 = basicJanitorContext7.crawler;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine20 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine22 = basicJanitorContext7.janitorRuleEngine();
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(janitorCrawler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(janitorRuleEngine20);
        org.junit.Assert.assertNull(janitorResourceTracker21);
        org.junit.Assert.assertNull(janitorRuleEngine22);
    }

    @Test
    public void test23244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23244");
        com.netflix.simianarmy.client.aws.AWSClient aWSClient0 = null;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine2 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler3 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar5 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration6 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder7 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine2, janitorCrawler3, janitorResourceTracker4, monkeyCalendar5, monkeyConfiguration6, monkeyRecorder7);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker9 = null;
        basicJanitorContext8.resourceTracker = janitorResourceTracker9;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext8.recorder;
        basicJanitorContext8.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext8.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext8.config = monkeyConfiguration15;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext8.calendar = monkeyCalendar17;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext8.calendar();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker20 = basicJanitorContext8.janitorResourceTracker();
        // The following exception was thrown during execution in test generation
        try {
            com.netflix.simianarmy.aws.janitor.InstanceJanitor instanceJanitor21 = new com.netflix.simianarmy.aws.janitor.InstanceJanitor(aWSClient0, (com.netflix.simianarmy.janitor.AbstractJanitor.Context) basicJanitorContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(monkeyRecorder14);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(janitorResourceTracker20);
    }

    @Test
    public void test23245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23245");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = null;
        basicJanitorContext7.crawler = janitorCrawler17;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.janitorCrawler();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler22 = basicJanitorContext7.crawler;
        java.lang.String str23 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler24 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler25 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker26;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar28 = null;
        basicJanitorContext7.calendar = monkeyCalendar28;
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorCrawler19);
        org.junit.Assert.assertNull(janitorCrawler22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(janitorCrawler24);
        org.junit.Assert.assertNull(janitorCrawler25);
    }

    @Test
    public void test23246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23246");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        java.lang.String str13 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine18 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null;
        basicJanitorContext7.calendar = monkeyCalendar20;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(janitorResourceTracker14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyRecorder16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(janitorRuleEngine18);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertNull(monkeyRecorder22);
        org.junit.Assert.assertNull(janitorRuleEngine23);
        org.junit.Assert.assertNull(monkeyConfiguration24);
    }

    @Test
    public void test23247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23247");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder12 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = null;
        basicJanitorContext7.recorder = monkeyRecorder16;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = null;
        basicJanitorContext7.calendar = monkeyCalendar18;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = null;
        basicJanitorContext7.recorder = monkeyRecorder20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder24 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker26 = basicJanitorContext7.resourceTracker;
        org.junit.Assert.assertNull(monkeyRecorder12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertNull(monkeyConfiguration15);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertNull(monkeyRecorder24);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertNull(janitorResourceTracker26);
    }

    @Test
    public void test23248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23248");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext7.calendar = monkeyCalendar17;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar20 = null;
        basicJanitorContext7.calendar = monkeyCalendar20;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker22 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = basicJanitorContext7.calendar();
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(janitorRuleEngine15);
        org.junit.Assert.assertNull(janitorResourceTracker16);
        org.junit.Assert.assertNull(janitorCrawler19);
        org.junit.Assert.assertNull(janitorResourceTracker22);
        org.junit.Assert.assertNull(monkeyCalendar23);
    }

    @Test
    public void test23249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23249");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = basicJanitorContext7.calendar();
        java.lang.String str14 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = null;
        basicJanitorContext7.recorder = monkeyRecorder15;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder17 = null;
        basicJanitorContext7.recorder = monkeyRecorder17;
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(monkeyCalendar13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23250");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar13 = null;
        basicJanitorContext7.calendar = monkeyCalendar13;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = null;
        basicJanitorContext7.calendar = monkeyCalendar15;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine19 = basicJanitorContext7.ruleEngine;
        java.lang.String str20 = basicJanitorContext7.region;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar23 = null;
        basicJanitorContext7.calendar = monkeyCalendar23;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine25 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine25;
        basicJanitorContext7.region = "";
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(janitorRuleEngine19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23251");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        java.lang.String str10 = basicJanitorContext7.region();
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine13 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine14;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration16 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext7.resourceTracker;
        java.lang.String str18 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        basicJanitorContext7.config = monkeyConfiguration19;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder21 = basicJanitorContext7.recorder();
        java.lang.String str22 = basicJanitorContext7.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine23 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine23;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder25 = basicJanitorContext7.recorder();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(janitorRuleEngine13);
        org.junit.Assert.assertNull(monkeyConfiguration16);
        org.junit.Assert.assertNull(janitorResourceTracker17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(monkeyRecorder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(monkeyRecorder25);
    }

    @Test
    public void test23252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23252");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker8 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker8;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker12 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker13 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration14 = basicJanitorContext7.configuration();
        java.lang.String str15 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = basicJanitorContext7.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar18 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = null;
        basicJanitorContext7.config = monkeyConfiguration19;
        org.junit.Assert.assertNull(janitorResourceTracker12);
        org.junit.Assert.assertNull(janitorResourceTracker13);
        org.junit.Assert.assertNull(monkeyConfiguration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(monkeyCalendar16);
        org.junit.Assert.assertNull(janitorRuleEngine17);
        org.junit.Assert.assertNull(monkeyCalendar18);
    }

    @Test
    public void test23253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23253");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler13 = basicJanitorContext7.crawler;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext7.ruleEngine;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration15 = null;
        basicJanitorContext7.config = monkeyConfiguration15;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine17 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine17;
        java.lang.String str19 = basicJanitorContext7.region;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder;
        java.lang.String str21 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar22 = null;
        basicJanitorContext7.calendar = monkeyCalendar22;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration24 = null;
        basicJanitorContext7.config = monkeyConfiguration24;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorContext7.calendar;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler27 = null;
        basicJanitorContext7.crawler = janitorCrawler27;
        org.junit.Assert.assertNull(janitorCrawler12);
        org.junit.Assert.assertNull(janitorCrawler13);
        org.junit.Assert.assertNull(janitorRuleEngine14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(monkeyCalendar26);
    }

    @Test
    public void test23254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23254");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder11 = basicJanitorContext7.recorder;
        basicJanitorContext7.region = "hi!";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker15 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker15;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar17 = null;
        basicJanitorContext7.calendar = monkeyCalendar17;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration19 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler20 = null;
        basicJanitorContext7.crawler = janitorCrawler20;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = null;
        basicJanitorContext7.config = monkeyConfiguration22;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker24 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker24;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorContext7.config;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyRecorder11);
        org.junit.Assert.assertNull(janitorCrawler14);
        org.junit.Assert.assertNull(monkeyConfiguration19);
        org.junit.Assert.assertNull(monkeyConfiguration26);
    }

    @Test
    public void test23255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23255");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        basicJanitorContext7.region = "";
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler14 = null;
        basicJanitorContext7.crawler = janitorCrawler14;
        java.lang.String str16 = basicJanitorContext7.region();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker21 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker21;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker23 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker23;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker25 = basicJanitorContext7.resourceTracker;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar26 = basicJanitorContext7.calendar();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(janitorResourceTracker25);
        org.junit.Assert.assertNull(monkeyCalendar26);
    }

    @Test
    public void test23256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23256");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = null;
        basicJanitorContext7.config = monkeyConfiguration10;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = null;
        basicJanitorContext7.crawler = janitorCrawler12;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler15 = null;
        basicJanitorContext7.crawler = janitorCrawler15;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker18 = basicJanitorContext7.janitorResourceTracker();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler19 = null;
        basicJanitorContext7.crawler = janitorCrawler19;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler21 = basicJanitorContext7.janitorCrawler();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder22 = basicJanitorContext7.recorder;
        org.junit.Assert.assertNull(monkeyCalendar14);
        org.junit.Assert.assertNull(monkeyConfiguration17);
        org.junit.Assert.assertNull(janitorResourceTracker18);
        org.junit.Assert.assertNull(janitorCrawler21);
        org.junit.Assert.assertNull(monkeyRecorder22);
    }

    @Test
    public void test23257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23257");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler8 = null;
        basicJanitorContext7.crawler = janitorCrawler8;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration10 = basicJanitorContext7.config;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker11 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker11;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration13 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker14 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker14;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker16 = null;
        basicJanitorContext7.resourceTracker = janitorResourceTracker16;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration18 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar19 = basicJanitorContext7.calendar();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder20 = basicJanitorContext7.recorder();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration21 = basicJanitorContext7.config;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration22 = basicJanitorContext7.configuration();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder23 = basicJanitorContext7.recorder();
        java.lang.String str24 = basicJanitorContext7.region;
        org.junit.Assert.assertNull(monkeyConfiguration10);
        org.junit.Assert.assertNull(monkeyConfiguration13);
        org.junit.Assert.assertNull(monkeyConfiguration18);
        org.junit.Assert.assertNull(monkeyCalendar19);
        org.junit.Assert.assertNull(monkeyRecorder20);
        org.junit.Assert.assertNull(monkeyConfiguration21);
        org.junit.Assert.assertNull(monkeyConfiguration22);
        org.junit.Assert.assertNull(monkeyRecorder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }
}

