package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you start with?");
		int startAmount = in.nextInt();
		System.out.println("What is the Win Chance?");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		int winLimit = in.nextInt();
		double prob= Math.random();
		System.out.println("How Many Simulations do you want to run?");
		int totalSimulations = in.nextInt();


		for(int i = 0; i <= totalSimulations; i++) {
			while (startAmount != 0 || startAmount != winLimit) {
				if (startAmount == 0) {
					System.out.println("You are ruined");

				}
				else if (startAmount == winLimit) {
					System.out.println("You won");

				}
				else if (prob <= winChance) {
					startAmount++;

				}
				else {
					startAmount--;
				}

			}

		}

	}
}





