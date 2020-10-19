package app;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Would you like to make an inside or outside bet?");
        String inOrOut = input.nextLine();

        if (inOrOut.equals("inside")){
            System.out.println("What number would you like to bet on?");
            int insideNum = input.nextInt();
            System.out.println("How much would you like to bet?");
            int bet1 = input.nextInt();
            System.out.println("You will bet $" + bet1 + " on " + insideNum + ".");
        }
        if (inOrOut.equals("outside")){
                System.out.println("Would you like to bet on even, odd, black, or red?");
                String outsideChoice = input.nextLine();

                if (outsideChoice.equals("even")){
                    System.out.println("How much would you like to bet?");
                }

                if (outsideChoice.equals("odd")){
                    System.out.println("How much would you like to bet?");
                }

                if (outsideChoice.equals("black")){
                    System.out.println("How much would you like to bet?");
                }

                if (outsideChoice.equals("red")){
                    System.out.println("How much would you like to bet?");
                }
            }
        
        
        
        
        
        
        
        Random rnd = new Random();
         
        int n1 = rnd.nextInt(35);
        
         
    }
    
}