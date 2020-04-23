public class OperatorsChallenge {

    public static void main(String[] args) {

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;

        double sumOfVars = (firstVariable + secondVariable) * 100;
        System.out.println(sumOfVars);

        double remainderVars = sumOfVars % 40.00d;
        System.out.println(remainderVars);

        boolean isRemainderZero = remainderVars == 0 ? true : false;

        System.out.println(isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("Some remainder");


        }

    }

}
