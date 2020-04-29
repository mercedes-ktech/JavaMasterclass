/* -Write a method called reverse() with an int array as a parameter.

        -The method should not return any value. In other words, the method is allowed to modify the array parameter.

        -In main() test the reverse() method and print the array both reversed and non-reversed.

        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

*/

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {

        for(int i = 0; i < array.length/2; i++) {
            int tempInt = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = tempInt;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] intArray = new int[]{2, 4, 7, 9, 8};
        System.out.println("Before reversing: " + Arrays.toString(intArray));
        reverse(intArray);
    }

}
