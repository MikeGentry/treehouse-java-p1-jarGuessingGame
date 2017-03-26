import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("ADMINISTRATOR INPUT:");
      System.out.print("What type of item is in the jar? ");
      String itemName = scanner.nextLine();
      System.out.printf("What is the maximum amount of %s? ",
                     itemName);
      int maximumNumber = scanner.nextInt();
      
      Jar jar = new Jar(itemName, maximumNumber);
    }
}
