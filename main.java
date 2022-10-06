import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int numberOfTries =0;
			int selectedNumber = -1;
			int randomNumber = (int) Math.round(Math.random()*100);
			System.out.println("Write a number. \n___________");
			while (isTheNumberCorrect(randomNumber, selectedNumber)) {
				selectedNumber = sc.nextInt();
				numberOfTries++;
				System.out.println(returnMessage(selectedNumber, randomNumber, numberOfTries));
			}
			System.out.println("___________ \nDo you want to play again? \n1. Yes \n2. No");
			if (sc.nextInt()==2) {
				System.out.println("Ok, bye.");
				break;
			}
		}
		
	}
	static boolean isTheNumberCorrect(int i, int x) {
		if (i == x) {
			return false;
		}else {
			return true;
		}
	}
	static String returnMessage(int i, int x,int y) {
		if (!isTheNumberCorrect(i, x)) {
			return ("Well done! \nYou got it after " + y + " tries!");
		}else if (i>x) {
			return("Lower");
		}else {
			return ("Higher");
		}
	}

}
