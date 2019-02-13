package card;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Hand myHand = new Hand();
    Hand dealerHand = new Hand();

    public Menu() {
        
        
        System.out.println("=========================");
        System.out.println("My hand is:");
        System.out.println("=========================");
        myHand.printHand(myHand.hand);
        System.out.println("=========================");

        System.out.println("And the Dealers first card is: ");
        System.out.println("=========================");

        dealerHand.printFirstCard(dealerHand.hand);
        System.out.println("=========================");
        System.out.println(" ");
        System.out.println("Do you want another card?");
        System.out.println(" ");
        System.out.println("You can write either AddCard, NewCards, Stay, or NewGame.   OOPS CASE SENSITIV AND NO SPACES ");
        while (true) {
            mainMenu();
        }

    }

    public void mainMenu() {

        String choice = null;
        choice = readText();

        switch (choice) {
            case "NewCards":
                break;
            case "AddCard":
                System.out.println("=========================");
                myHand.addCard();
                System.out.println("=========================");
                myHand.printHand(myHand.hand);
                System.out.println("=========================");
                dealerHand.printFirstCard(dealerHand.hand);
                System.out.println(myHand.checkScore());
                
                break;
            case "NewGame":
                new CardGame();
                break;
            case "Stay":
                System.out.println("=========================");
                dealerHand.dealerActions(dealerHand.hand);
                System.out.println(myHand.checkScores(dealerHand));
                System.out.println("=========================");
                dealerHand.printHand(dealerHand.hand);
                System.out.println("=========================");
                break;
            case "Exit":
                System.exit(0);
                break;
            default:
                break;
        }

    }

    private int readNumber() {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();

        return number;
    }

    private String readText() {
        String s = null;
        try {
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Oops fel inmatning!");
        }
        return s;
    }



}
