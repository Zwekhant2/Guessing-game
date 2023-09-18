import java.util.Random;
import java.util.Scanner;
public class Gg {

	public static void main(String[] args) {
		String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah"};
		Random random = new Random();
		String correctName = names[random.nextInt(names.length)];
		String guess = "";
		int guessCount = 0;
		Scanner scanner = new Scanner(System.in);
		while (!guess.equals(correctName)) {
			System.out.println("Guess a name: ");
			guess = scanner.nextLine();
			if (guess.equalsIgnoreCase("quit")) {
				System.out.println("You quit the game.");
				break;
			}
			guessCount++;
			if (guess.equals(correctName)) {
				System.out.println("Congratulation! You guessed the name '" + correctName + "' correctly.");
				System.out.println("You made " + guessCount + "guesses.");
			}
			else {
				int hintLength = Math.min(guessCount, correctName.length());
				String hint = correctName.substring(0, hintLength);
				System.out.println("Wrong guess! Here's a hint: " + hint);
			}
		  }
			scanner.close();
	}	

}
