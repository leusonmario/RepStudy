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
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale106();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale132();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Hacker hacker4 = serializedObjectSupporter0.deserializeObjectHacker65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode62();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime9();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService7();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Code code9 = serializedObjectSupporter8.deserializeObjectCode63();
        com.github.javafaker.Book book10 = serializedObjectSupporter8.deserializeObjectBook63();
        com.github.javafaker.Name name11 = serializedObjectSupporter8.deserializeObjectName79();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = serializedObjectSupporter8.deserializeObjectFakeValuesService44();
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface13 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService7, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService12);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface13.equals(fakeValuesServiceInterface13)", fakeValuesServiceInterface13.equals(fakeValuesServiceInterface13));
    }
}

