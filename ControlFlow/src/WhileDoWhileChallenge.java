public class WhileDoWhileChallenge {

    public static boolean isEvenNumber(int number) {

        return (number % 2) == 0;
    }

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int totalEvenNumbers = 0;

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                continue;

            } else if (isEvenNumber(number)) {
                System.out.println("Even number "+ number);
                totalEvenNumbers++;
                if (totalEvenNumbers == 5) {
                    break;
                }
            }

        }
        System.out.println("Total number of even numbers is "+totalEvenNumbers);

    }



}


//Create a method called isEvenNumber that takes a parameter of type int
//Its purpose is to determine if the argument passed to the method is an even number or not.
//Return true if an even number, otherwise return false.

//Modify the while code above
//Make it also record the total number of even numbers it has found
//and break once 5 are found
//and at the end display the total number of even numbers