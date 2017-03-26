import java.util.Scanner;
import java.util.Random;

public class Jar {
  private String jarItem;
  private int maxItems;
  private int actual;
  private int attempts = 0;
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();
  
  public String promptForItem() {
    System.out.print("Administrator, what type of item is in the jar? ");
    String itemInput = scanner.nextLine();
    jarItem = itemInput;
    return jarItem;
  }
  
  public int totalPossibleItems() {
    System.out.printf("Administrator, how many total %s can fit in the jar? ",
                     jarItem);
    int total = scanner.nextInt();
    maxItems = total;
    return maxItems;
  }
  
  public int actualNumber() {
    actual = (random.nextInt(maxItems)) + 1;
    return actual;
  }
  
  public void promptForGuess() {
    System.out.printf("Player: How many %s are in the jar?%nPick a number between 1 and %d: ",
                     jarItem, maxItems);
    int guess = scanner.nextInt();
    while (guess != actual) {
      System.out.print("Your guess was incorrect. Please try again: ");
      guess = scanner.nextInt();
      attempts++;
    }
    attempts++;
    System.out.printf("You got it in %d attempt(s).%n",
                      attempts);
    
  }
}
