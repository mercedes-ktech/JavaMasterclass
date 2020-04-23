import org.w3c.dom.ls.LSOutput;

public class Methods {

    public static void main(String[] args) {

        //calculateScore(true, 800, 5, 100);
        displayHighScorePosition("Mer", 1);
        System.out.println(calculateHighScorePosition(1000));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }

        return -1; //this won't be executed if gameOver is true and the if block code i executed.

    }


    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {

        int position;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;

    }

}

