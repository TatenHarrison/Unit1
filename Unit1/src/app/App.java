package app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a color");
        String color = input.nextLine();

        System.out.println("enter a number");
        int number = input.nextInt();

        int count = 0;

    
        while (count < number) {
            System.out.println("the count is " + count);
            count = count + 1;
        }

        System.out.println("count finished");

        while (color == "red"){
            System.out.println("the color is " + color);
            color = "green";
        }

        System.out.println("color finished");
    }
}