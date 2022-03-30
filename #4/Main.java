import java.util.Scanner;

public class Main {
   private static Scanner scnr = new Scanner(System.in);
   
   public static void main(String[] args) {
      Mastermind game = new Mastermind();

     do {
         displayHeader();
         game.makeNewSecret();
         int correctDigits = 0;
         
         while (correctDigits != 4) {
            int guess = getUserGuess();
            correctDigits = game.guess(guess);
            
            displayFeedback(correctDigits);
         }  
      
         congratulateUser();
      } while (playAnotherGame());
   }
   
   public static void displayHeader() {
      System.out.println("----- MASTERMIND -----");
      System.out.println("Guess the 4 digit number!");
      System.out.println();
   }
   
   public static boolean playAnotherGame() {
      System.out.print("Play again (y/n) : ");
      
      return scnr.next().equals("y");
   }
   
   public static int getUserGuess() {
      System.out.print("Enter guess : ");
      
      return scnr.nextInt();
   }
   
   public static void displayFeedback(int correctDigits) {
      System.out.printf("You got %d correct.\n", correctDigits);
   }
   
   public static void congratulateUser() {
      System.out.println("\nCongratulations!");
   }
}
