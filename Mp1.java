import java.util.Scanner;

public class Mp1 {

	static int counter = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Generating the first random number");
		System.out.println("****************************************************************");
		System.out.println("");
		int rand = generateNumber();

		while (true) {
			
			// This print out is here just to make it easier (possible) to guess right during testing
			System.out.println("(The Random number = " + rand +")");
			int input = getGuess(sc);
			
			boolean bol = evalGuess(input, rand);

			if (bol) {
				System.out.println("A new random numer was generated and the game will start over");
				System.out.println("****************************************************************");
				counter = 0;
				rand = generateNumber();
			} else {
				
			}

			counter++;
		}

	}

	static boolean evalGuess(int input, int rightNr) {
		

		if (input == rightNr) {
			System.out.print("Your guess was right");
			System.out.println(" and you needed " + counter + " attempts to guess it");
			System.out.println("****************************************************************");
			System.out.println();
			
			return true;

		}

		else {
			System.out.print("Your guess "+ "("+input+")" + " was too ");
			
			if (input < rightNr) {
				System.out.println("low, and this was attempt nr: "+ counter);

			} else {
				System.out.println("high, and this was attempt nr: " + counter);
			}
		}
		
		return false;

	}
	


	static int getGuess(Scanner scan) {

		System.out.println("Enter a number between 0 and 100");
		int x = scan.nextInt();

		return x;

	}

	static int generateNumber() {
		// Skapa ett random nummer mellan 0 och 100
		int randNr = (int) Math.round(Math.random() * 100);
		
		return randNr;

	}
	

}
