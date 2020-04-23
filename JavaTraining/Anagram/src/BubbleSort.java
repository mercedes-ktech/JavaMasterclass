import java.util.Arrays;

public class BubbleSort {

    //procedure
    public static void sortInPlace(char[] characters) {  //in place means that I'm modifying the input and I'm not creating a new thing and returning that new thing

        boolean wasThereAChange;
        //char newChar; BAD PRACTICE TO HAVE NON INITIALIZED VARIABLES

        do {
            wasThereAChange = false;

            for (int i = 0; i < (characters.length - 1); i++) {
                if (characters[i] > characters[i + 1]) {

                    char newChar = characters[i];
                    characters[i] = characters[i + 1];
                    characters[i + 1] = newChar;
                    wasThereAChange = true;
                }
            }
        } while (wasThereAChange);

    }


    public static char[] swap(char[] c, int i) {

        char[] characters = Arrays.copyOf(c, c.length);
        char newChar = characters[i];
        characters[i] = characters[i + 1];
        characters[i + 1] = newChar;

        return characters;
    }

    //create a new method that sorts but not in-place

//function
    public static char[] sort(char[] characters) {

        char[] tempCharacters = Arrays.copyOf(characters, characters.length);

        boolean wasThereChange = false;

        do {
            wasThereChange = false;

            for(int i = 0; i < (tempCharacters.length - 1); i++) {

                if(tempCharacters[i] > tempCharacters[i+1]) {

                    tempCharacters = swap(tempCharacters, i);
                    System.out.println(tempCharacters);
                    wasThereChange = true;

                }
            }
        } while(wasThereChange);

        return tempCharacters;
    }

}

















//        while (wasThereAChange) {
//
//            wasThereAChange = false;
//
//            for (int i = 0; i < (charsSorted.length - 1); i++) {
//                if (charsSorted[i] > charsSorted[i + 1]) {
//
//                    newChar = charsSorted[i];
//                    charsSorted[i] = charsSorted[i + 1];
//                    charsSorted[i + 1] = newChar;
//                    wasThereAChange = true;
//                }
//
//            }
//
//        }
