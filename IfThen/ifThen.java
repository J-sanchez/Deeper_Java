package IfThen;

public class ifThen {
    public static void main(String[] args) {
        System.out.println("Hello, are you an alien?");

        boolean isAlien = false;
        if (isAlien == false) {
            //Adding a semicolon, closes the line of code, but the following line will execute as if there is no boolean. we can use code blocks for more than one statement
            System.out.println("I am not an alien, I am a computer.");
            System.out.println("I am scared of aliens.");
        }
    }
}
