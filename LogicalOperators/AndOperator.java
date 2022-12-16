package LogicalOperators;

public class AndOperator {
    public static void main(String[] args) {
        System.out.println("Do you want to play the game?");

        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("Sure!");
            System.out.println("How do I win?");
            System.out.println("Get a score higher than 90!");
        }
        int topScore = 90;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
