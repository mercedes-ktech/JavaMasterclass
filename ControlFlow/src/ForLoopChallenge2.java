public class ForLoopChallenge2 {

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int primeCounter = 0;

            for (int i = 10; i < 50; i++) {

                if (isPrime(i)) {
                    System.out.println(i + " is a prime number");
                    primeCounter++;
                    System.out.println("prime counter = " + primeCounter);

                    if(primeCounter == 3) {
                        System.out.println("exiting for loop");
                        break;
                    }
                }
            }

    }

}
//create a for statement using any range of numbers
//determine if the number is a prime number using the isPrime method
//if it is a prime number, print it out AND increment a count of the
//number of prime number found
//if that count is 3, exit the for loop
//hint: use the break; statement to exit
