package app;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {      
       
        int chips = 100;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Would you like to make an inside or outside bet?");
        String inOrOut = input.nextLine();

        if (inOrOut.equals("inside")){
            System.out.println("What number would you like to bet on?");
            int insideNum = input.nextInt();
            System.out.println("How much would you like to bet?");
            int bet1 = input.nextInt();
            System.out.println("You will bet $" + bet1 + " on " + insideNum + ".");

            Random rnd = new Random();
            int n1 = rnd.nextInt(37);

            System.out.println("The number was " + n1 + ".");
            if (n1 == bet1){
                System.out.println("Your bet was correct!");
            }
            else{
                System.out.println("Your bet on " + bet1 + " was incorrect...");
            }
        }
        if (inOrOut.equals("outside")){
                System.out.println("Would you like to bet on even, odd, black, or red?");
                String outsideChoice = input.nextLine();

                if (outsideChoice.equals("even")){
                    System.out.println("How much would you like to bet?");
                    int bet2 = input.nextInt();
                    System.out.println("You will bet $" + bet2 + " on even.");

                    Random rnd = new Random();
                    int n2 = rnd.nextInt(37);
                    System.out.println("The number was " + n2 + ".");

                    if (n2 % 2 == 0){
                        System.out.println("Your bet was correct!");
                    }
                    else{
                        System.out.println("Your bet on even was incorrect...");
                     }
                    }
                if (outsideChoice.equals("odd")){
                    System.out.println("How much would you like to bet?");
                    int bet3 = input.nextInt();
                    System.out.println("You will bet $" + bet3 + " on odd.");

                    Random rnd = new Random();
                    int n3 = rnd.nextInt(37);
                    System.out.println("The number was " + n3 + ".");

                    if (n3 % 2 == 0){
                        System.out.println("Your bet was incorrect...");
                    }
                    else{
                        System.out.println("Your bet was correct!");
                    }

                }
                if (outsideChoice.equals("black")){
                    System.out.println("How much would you like to bet?");
                    int bet4 = input.nextInt();
                    System.out.println("You will bet $" + bet4 + " on black.");

                    Random rnd = new Random();
                    int n4 = rnd.nextInt(37);
                    System.out.println("The number was " + n4 + ".");
                }
         }
         System.out.println("Would you like to spin again?");
         String again = input.nextLine();
         if (again.equals("yes")){

         }
         else{
             System.out.println("You cashed out with $" + chips + ".");
         }


         
    }
    
}