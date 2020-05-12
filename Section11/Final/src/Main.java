public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        int pw = 174312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(524988);
        password.letMeIn(45789);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(174312);

        System.out.println("************************");
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
