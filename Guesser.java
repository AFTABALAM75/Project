
import java.util.Scanner;

class guesser1 {
	int Guessernum;

	public int takeNumberguesser() {
		System.out.println("Gusser guess a Number");
		Scanner Scan = new Scanner(System.in);
		Guessernum = Scan.nextInt();

		return Guessernum;
	}

}

class Player {
	int playernum;

	public int takeNumberPlayer() {
		System.out.println("player guess a Number");
		Scanner Scan = new Scanner(System.in);
		playernum = Scan.nextInt();

		return playernum;
	}
}

class Umpire {
	int numfromGuesser;
	int numfromPlayer1;
	int numfromplayer2;
	int numfromplayer3;

	void CollectfromGuesser() {
		guesser1 g = new guesser1();
		numfromGuesser = g.takeNumberguesser();

	}

	void Collectfromplayer() {
		Player P1 = new Player();
		numfromPlayer1 = P1.takeNumberPlayer();

		Player P2 = new Player();
		numfromplayer2 = P1.takeNumberPlayer();

		Player P3 = new Player();
		numfromplayer3 = P3.takeNumberPlayer();
	}

	void compare() {
		if (numfromPlayer1 == numfromGuesser) {
			if (numfromplayer2 == numfromGuesser && numfromplayer3 == numfromGuesser) {
				System.out.println("All Players won the game");
			} else if (numfromplayer2 == numfromGuesser) {
				System.out.println("only Player1 and Player2 won the game");
			} else if (numfromplayer3 == numfromGuesser) {
				System.out.println("Player1 and Player3 won the game");
			} else {
				System.out.println("Only Player1 won the game");

			}
		}

		else if (numfromplayer2 == numfromGuesser) {
			if (numfromplayer3 == numfromGuesser) {
				System.out.println("Only Player 2 and 3 won the game");
			} else {
				System.out.println("Only player 2 won the game");

			}
		}

		else if (numfromplayer3 == numfromGuesser) {
			System.out.println("only player3 won the game");

		} else
			System.out.println("No Player won the Game");
	}
}

public class Guesser {

	public static void main(String[] args) {
		Umpire U = new Umpire();
		U.CollectfromGuesser();
		U.Collectfromplayer();
		U.compare();

	}

}
