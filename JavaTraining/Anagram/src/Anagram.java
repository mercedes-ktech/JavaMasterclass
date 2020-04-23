import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        boolean result = false;

        if (a.length() == b.length()) {

            String aNew = a.toLowerCase();
            String bNew = b.toLowerCase();

            char[] aList = aNew.toCharArray();
            char[] bList = bNew.toCharArray();

            //Arrays.sort(aList);
            //Arrays.sort(bList);
            System.out.println("before " + Arrays.toString(aList));

            BubbleSort.sortInPlace(aList);
            BubbleSort.sortInPlace(bList);

            System.out.println("after " + Arrays.toString(aList));

            result = Arrays.equals(aList, bList);


//        if (Arrays.equals(aListSorted, bListSorted)) {
//            result = true;
//        } else {
//            result = false;
//        }
        }
        return result;
    }


    //test 1: input = [], then output []
    //test 2: already sorted array
    //test 3: single value {1}

    //c can't be empty
    //i < c.length - 1


    public static void main(String[] args) {

        //System.out.println(isAnagram("amsadf", "ma"));
        //System.out.println(BubbleSort.swap(new char[]{'b', 'c', 'a'}, 2));
        //char[] characters = new char[]{};
        //TEST FIXTURE
        char[] characters = new char[]{'1'};
        //EXPECTED OUTPUT
        char[] expected = new char[]{'1'};
        //CALL FUNCTIONALITY
        char[] answer = BubbleSort.sort(characters);
        //ASSERTION
        System.out.println("test results " + (new String(expected)).equals(new String(answer)));

        //System.out.println("unsorted version " + new String(characters));
        //System.out.println("Answer " + new String(answer));
    }

}