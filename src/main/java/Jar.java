import java.util.Scanner;
import java.util.Random;

public class Jar {
  private String itemName;
  private int maximumNumber;
  private int actual;
  private int attempts = 0;
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();
  
  public Jar(String itemName, int maximumNumber) {
    this.itemName = itemName;
    this.maximumNumber = maximumNumber;
  }
  
  public int actualNumber() {
    actual = (random.nextInt(maximumNumber)+ 1);
    return actual;
  }
  
  public void promptForGuess() {
    System.out.println("PLAYER:");
    System.out.printf("How many %s are in the jar?%nPick a number between 1 and %d: ",
                     itemName, maximumNumber);
    int guess = scanner.nextInt();
    while (guess != actual) {
      System.out.print("Your guess was incorrect. Please try again: ");
      guess = scanner.nextInt();
      attempts++;
    }
    attempts++;
    System.out.printf("You got it in %d attempts.%n",
                      attempts); 
  }
}
