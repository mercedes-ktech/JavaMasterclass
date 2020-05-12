import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription()); //get the description of the Location with key "loc"
            break;
        }

        Map<String, Integer> exits = locations.get(loc).getExits(); //creates a new reference to
        System.out.print("Available exits are ");
        for(String exit: exits.keySet()) {
            System.out.print(exit + ", ");
        }
        System.out.println();

        String direction = scanner.nextLine().toUpperCase(); //user enters "direction"
        if(direction.length() > 1) { //if direction is more than 1 character
            String[] words = direction.split(" "); //split the string into an array called "words"
            for(String word: words) { //for each word in the array words
                if(vocabulary.containsKey(word)) { //if the vocabulary map contains the "word" as a key
                    direction = vocabulary.get(word); //then the direction is reassigned to the value of the key "word"
                    break;
                }
            }
        }

        if(exits.containsKey(direction)) { //if the exits map contains the value of the variable "direction" as a key
            loc = exits.get(direction); //then the variable loc is set to the value of the key "direction"

        } else {
            System.out.println("You cannot go in that direction");
        }
    }

}
