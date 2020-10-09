package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Guess the number!");
        int answer = input.nextInt();
       
        if (answer == 42){
            System.out.println("Correct!");
        }
        if (answer < 42){
            System.out.println("Higher");
        }
        if (answer > 42){
            System.out.println("Lower");
        }
    }
        
        

        

    
}