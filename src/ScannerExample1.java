

  import java.util.InputMismatchException;
import java.util.Scanner;
 
public class ScannerExample1 {
    public static void main(String[] args) {
        // Initiate a new Scanner
        Scanner userInputScanner = new Scanner(System.in);
 
        // Testing nextLine();
        System.out.print("\nWhat is your name? ");
        String name = userInputScanner.nextLine();
 
        // Testing nextInt();
        boolean validInput = false;
        int numberOfCats = 0;
        while (!validInput) {
            System.out.print("How many cats do you have? ");
            try {
                numberOfCats = userInputScanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                userInputScanner.nextLine();
            }
        }
 
        // Testing nextDouble();
        validInput = false;
        double moneyInWallet = 0.0;
        while (!validInput) {
            System.out.print("How much money is in your wallet? $");
            try {
                moneyInWallet = userInputScanner.nextDouble();
                userInputScanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                validInput = false;
                userInputScanner.nextLine();
            }
        }
 
        System.out.println("\nHello " + name + "! You have " + numberOfCats
                + (numberOfCats > 1 ? " cats" : "cat")
                + " and $" + moneyInWallet + " in your wallet.\n");
    }
}
