package card;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Hand myHand = new Hand();
    Hand dealerHand = new Hand();

    public Menu() { // The menu that displays the text
        
        
        System.out.println("=========================");
        System.out.println("My hand is:");
        System.out.println("=========================");
        myHand.printHand(myHand.hand);//Prints Players hand to the screen in text ex. Eight of diamonds.
        System.out.println("=========================");

        System.out.println("And the Dealers first card is: ");
        System.out.println("=========================");

        dealerHand.printFirstCard(dealerHand.hand); //Prints the first card of the dealers hand in text
        System.out.println("=========================");
        System.out.println(" ");
        System.out.println("Do you want another card?");
        System.out.println(" ");
        System.out.println("You can write either AddCard, NewCards, Stay, or NewGame.   OOPS CASE SENSITIV AND NO SPACES ");
        while (true) {
            mainMenu();
        }

    }

    public void mainMenu() { //Menu in which you can choose what to do!

        String choice = null;
        choice = readText();

        switch (choice) {
            case "NewCards":
                //does nothing at the moment!
                break;
            case "AddCard": //Adds a new card to the player hand and checks if you lost
                System.out.println("=========================");
                myHand.addCard(); // Adds the card
                System.out.println("=========================");
                myHand.printHand(myHand.hand);// Prints your hand in text
                System.out.println("=========================");
                dealerHand.printFirstCard(dealerHand.hand);
                System.out.println(myHand.checkScore());//Checks your score to see if you are over 21, if you are you loose
                
                break;
            case "NewGame": // starts a new game
                new CardGame();
                break;
            case "Stay": //stay with your current cards and lets the dealer play his hand out.
                System.out.println("=========================");
                dealerHand.dealerActions(dealerHand.hand); //Dealer take cards until on 17 or over 21
                System.out.println(myHand.checkScores(dealerHand)); //if dealer is between 17 and 21 its checks who card values are highest
                System.out.println("=========================");
                dealerHand.printHand(dealerHand.hand);//Prints whole dealer hand in text
                System.out.println("=========================");
                break;
            case "Exit": // Exits the program
                System.exit(0);
                break;
            default:
                break;
        }

    }

    public static int readNumber() { //Method to take input from player

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();

        return number;
    }

    public String readText() {//Method to take input from player with try catch
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
