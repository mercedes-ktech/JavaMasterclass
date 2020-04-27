import java.util.Scanner;
import java.util.Arrays;


public class MerArrays {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(myArray)); // ???????

        char[] characters = new char[]{'1'};

        printArray(myArray);

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The averae is " + getAverage(myIntegers));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) { //if hardcoding a value instead of using .length i'll get errors if the sie of the array changes (index out of bounds)
            System.out.println("Element " + i + ". Value is " + array[i]);

        }
    }

    private static Scanner scanner = new Scanner(System.in);


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sumTotal = 0;
        for(int i = 0; i < array.length; i++) {
            sumTotal = sumTotal + array[i];
        }

        return (double) sumTotal / (double) array.length;
    }
}
