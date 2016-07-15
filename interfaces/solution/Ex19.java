package interfaces.solution;

import java.util.*;

interface Game {
	void play();
}

interface GameFactory {
	Game getGame();
}

class CoinGame implements Game {
	private Random rand = new Random(47);

	public void play() {
		if (rand.nextInt(2) == 0) {
			System.out.println("coin is front");
		} else {
			System.out.println("coin is back");
		}
	}

	public static void main(String[] args) {
		CoinGame g1 = new CoinGame();
		for (int i = 0; i < 5; i++)
			g1.play();
	}
}

class DiceGame implements Game {
	private Random rand = new Random(47);

	public void play() {
		int val = rand.nextInt(6) + 1;
		switch (val) {
		case 1:
			System.out.println("dice is " + val);
			break;
		case 2:
			System.out.println("dice is " + val);
			break;
		case 3:
			System.out.println("dice is " + val);
			break;
		case 4:
			System.out.println("dice is " + val);
			break;
		case 5:
			System.out.println("dice is " + val);
			break;
		case 6:
			System.out.println("dice is " + val);
			break;
		default:
			System.out.println("Game err");
		}
	}

	public static void main(String[] args) {

		DiceGame g2 = new DiceGame();
		for (int i = 0; i < 15; i++)
			g2.play();
	}
}

class CoinGameFactory implements GameFactory {
	public CoinGame getGame() {
		return new CoinGame();
	}
}

class DiceGameFactory implements GameFactory {
	public DiceGame getGame() {
		return new DiceGame();
	}
}

public class Ex19 {
	public static void playGame(GameFactory gf) {
		Game g = gf.getGame();
		for (int i = 0; i < 10; i++)
			g.play();
	}

	public static void main(String[] args) {
		playGame(new CoinGameFactory());
		playGame(new DiceGameFactory());
	}
}
