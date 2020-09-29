package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =new Scanner(System.in);

        System.out.println("How many times do they say the word bee in the bee movie?");
        int answer1 = input.nextInt();
        if (answer1 == 174) {
            System.out.println("You are correct!");
        } else {
            System.out.println("You are incorrect...");
        }

        System.out.println("What is 8-4?");
        int answer2 = input.nextInt();
        if (answer2 == 4) {
            System.out.println("Good job, you are a smart.");
        } else {
            System.out.println("You are wrong, because if you take away the 4, it's no longer there, so all that is left is an 8.");
        }

        System.out.println("Would you like a hard-boiled egg?");
        String answer3 = input.nextLine();
        if (answer3.equals("no")) {
            System.out.println("Good");
        } else {
            System.out.println("How dare you");
        }

        System.out.println("Who do you main in Smash Bros. Ultimate?");
        String answer4 = input.nextLine();
        if (answer4.equals("Little Mac")) {
            System.out.println("I'm not mad, just dissapointed...");
        } else {
            System.out.println("Cool.");
        }

        System.out.println("Apple or Samsung?");
        String answer5 = input.nextLine();
        if (answer5.equals("Apple")) {
            System.out.println("Nice");
        } else {
            System.out.println("no.");
        }


    } 
}