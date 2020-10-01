package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number 1-5 to hear a fact about dogs");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("3 dogs survived the sinking of the titanic.");
        }
        if (number == 2) {
            System.out.println("A bloodhound's sense of smell can be used as evidence in court.");
        }
        if (number == 3) {
            System.out.println("Dogs have 3 eyelids");
        }
        if (number == 4) {
            System.out.println("a dog's nose print is as unique as a human fingerprint");
        }
        if (number == 5) {
            System.out.println("when dogs curl up, it's not only to keep warm, but also to protect vital organs.");
        }


    } 
}