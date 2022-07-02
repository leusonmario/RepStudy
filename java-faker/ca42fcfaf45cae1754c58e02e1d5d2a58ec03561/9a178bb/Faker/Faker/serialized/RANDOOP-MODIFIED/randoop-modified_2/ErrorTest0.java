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
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance54();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter10 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale11 = serializedObjectSupporter10.deserializeObjectLocale30();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter10.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = serializedObjectSupporter10.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface14 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService9, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService13);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14)", fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness24();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService8();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter6 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale7 = serializedObjectSupporter6.deserializeObjectLocale30();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter6.deserializeObjectFaker48();
        com.github.javafaker.Book book9 = serializedObjectSupporter6.deserializeObjectBook21();
        com.github.javafaker.Book book10 = serializedObjectSupporter6.deserializeObjectBook13();
        java.util.Locale locale11 = serializedObjectSupporter6.deserializeObjectLocale114();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter6.deserializeObjectDateAndTime15();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = serializedObjectSupporter6.deserializeObjectFakeValuesService44();
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface14 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService5, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService13);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14)", fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter4 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale5 = serializedObjectSupporter4.deserializeObjectLocale30();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter4.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter4.deserializeObjectPhoneNumber33();
        java.util.Locale locale8 = serializedObjectSupporter4.deserializeObjectLocale112();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter4.deserializeObjectDateAndTime26();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter4.deserializeObjectDateAndTime21();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter4.deserializeObjectFaker75();
        com.github.javafaker.Company company12 = serializedObjectSupporter4.deserializeObjectCompany41();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = serializedObjectSupporter4.deserializeObjectFakeValuesService9();
        com.github.javafaker.service.FakeValuesServiceInterface fakeValuesServiceInterface14 = com.github.javafaker.Faker.createProxiedFakeValuesService((com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService3, (com.github.javafaker.service.FakeValuesServiceInterface) fakeValuesService13);
        org.junit.Assert.assertTrue("Contract failed: fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14)", fakeValuesServiceInterface14.equals(fakeValuesServiceInterface14));
    }
}

