public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);
        int myNewResult = result;
        System.out.println();
        System.out.println("my new result = " + myNewResult);

        result = result -1;
        System.out.println(result);
        System.out.println(myNewResult);

        result++;
        System.out.println(result);

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("Is an alien!");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the highest score");
        }

        int secondTopScore = 85;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println();
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("challenge");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;


    }

}
