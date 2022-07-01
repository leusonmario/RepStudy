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
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        basicJanitorMonkeyContext0.monkeyRegion = "us-west-1";
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        java.lang.String str4 = basicJanitorMonkeyContext0.ownerEmailDomain;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = janitorEmailBuilder5.buildEmailBody("Janitor Monkey Notification for hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        basicJanitorMonkeyContext0.ccEmails = strArray3;
        com.netflix.simianarmy.janitor.JanitorEmailBuilder janitorEmailBuilder5 = basicJanitorMonkeyContext0.janitorEmailBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = janitorEmailBuilder5.buildEmailBody("hi!");
    }
}

