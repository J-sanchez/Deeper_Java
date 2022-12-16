package LogicalOperators;

public class AndOperator {
    public static void main(String[] args) {
        System.out.println("Do you want to play the game?");

        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("Sure!");
            System.out.println("How do I win?");
            System.out.println("Get a highscore of 100!");
        }
        int topScore = 100;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }
    }
}
