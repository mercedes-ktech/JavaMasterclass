public class SIBTest {

    public static final String owner;
    static {
        owner = "mer";
        System.out.println("1st SIBTest static initialization block called ");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("2nd SIBTest static initialization block called ");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
