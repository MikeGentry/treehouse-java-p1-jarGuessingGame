public class GuessingGame {
    public static void main(String[] args) {
      Jar jar = new Jar();
      jar.promptForItem();
      jar.totalPossibleItems();
      jar.actualNumber();
      jar.promptForGuess();
    }
}
