package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numberOne = input.nextInt();
        System.out.println("Enter another number");
        int numberTwo = input.nextInt();

        while (numberOne <= numberTwo) {
            System.out.println(numberOne);
            numberOne = numberOne + 2;
        }

      

        
        

        
    }
    
}