package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = input.nextLine();

        System.out.println("enter a movie");
        String movie = input.nextLine();

        System.out.println("enter an adjective");
        String adjective = input.nextLine();

        System.out.println("enter another name");
        String name2 = input.nextLine();

        System.out.println(name + "'s favorite movie is " + movie + ". They watch it every day with their " + adjective + " friend, " + name2 + ".");


    } 
}