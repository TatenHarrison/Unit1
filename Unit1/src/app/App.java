package app;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int bets = 10;
        boolean retrybet = false;
        int insideNum;
        int bet1;
        String outsideChoice;
        int bet2;
        int bet3;
        int bet4;
        int numBets = 0;
        boolean win = false;

        int betss[] = new int[10];
        String betType2[] = new String[10];
        String betType[] = { "even", "odd", "red", "black" };

        

        for (int i = 0; i < betss.length; i++) {
            if (retrybet == false) {
                System.out.println("Would you like to make an inside or outside bet?");
                String inOrOut = input.nextLine();
                int black[] = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
                int red[] = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
                int odd[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
                int even[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};

                if (inOrOut.equals("inside")) {
                    System.out.println("What number would you like to bet on?");
                    betType2[i] = input.nextLine();
                    System.out.println("How much would you like to bet?");
                    betss[i] = input.nextInt();
                    input.nextLine();
                    System.out.println("You will bet $" + betss[i] + " on " + betType2[i] + ".");
                    numBets++;

                }
                if (inOrOut.equals("outside")) {
                    System.out.println("Would you like to bet on even, odd, black, or red?");
                    betType2[i] = input.nextLine();
                    numBets++;

                    if (betType2[i].equals("even")) {
                        System.out.println("How much would you like to bet?");
                        betss[i] = input.nextInt();
                        input.nextLine();
                        System.out.println("You will bet $" + betss[i] + " on even.");

                    }
                    if (betType2[i].equals("odd")) {
                        System.out.println("How much would you like to bet?");
                        betss[i] = input.nextInt();
                        input.nextLine();
                        System.out.println("You will bet $" + betss[i] + " on odd.");

                    }
                    if (betType2[i].equals("black")) {
                        System.out.println("How much would you like to bet?");
                        betss[i] = input.nextInt();
                        input.nextLine();
                        System.out.println("You will bet $" + betss[i] + " on black.");

                    }

                }
                System.out.println("Would you like to make another bet?");
                String retry = input.nextLine();
                if (retry.equals("no")) {
                    retrybet = true;
                }

            }
        }
        if (retrybet == true) {
            for (int i = 0; i < numBets; i++) {
                System.out.println("You bet $" + betss[i] + " on " + betType2[i]);
                }
            }
            Random rnd = new Random();
            int n1 = rnd.nextInt(37);
            System.out.println("The number was " + n1 + ".");
            for (int i = 0; i < betss.length; i++) {
                if (n1 == betss[i]) {
                    win = true;
                }
            }
            if (win == true) {
                    System.out.println("You win!");
                } 
            else {
                    System.out.println("You lose...");
                }
            
        }

    }

