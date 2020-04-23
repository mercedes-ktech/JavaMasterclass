public class DigitSumChallenge {

    public static int sumDigits(int number) {

        int sumOfDigits = 0;

        if (number >= 10) {

            int numberTemp = number;

            for (int i = 0; i < String.valueOf(number).length(); i++) {
                System.out.println("number is: " + numberTemp); //125 12

                int extractLowestDigit = numberTemp % 10; //5 2
                int discardLowestDigit = numberTemp / 10; //12 1

                sumOfDigits += extractLowestDigit; //5 7
                numberTemp = (int) discardLowestDigit; //12 1

            }

            return sumOfDigits;


        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("sum of digits is " + sumDigits(1258));
    }


}

//Write a method with the name sumDigits that has one int parameter called number
//If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value
//Then numbers 0-9 have 1 digit so we don't want to process them. Also we don't want to process negative numbers, so also return -1 for negative numbers
//For example calling the method sumDigits(125) should return 8
//Calling the method sumDigits(1) should return -1 as per requirements described above
//Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments

//Use n % 10 to extract the least significant digit
//Use n = n / 10 to discard the least significant digit
//