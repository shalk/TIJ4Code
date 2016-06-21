package reusing.solution;
import static net.mindview.util.Print.*;
class Game {
	Game(int i){
		print("Game init");
	}
}
class BoardGame extends Game {
	BoardGame(int i){
		super(i);
		print("BoardGame init");
	}
}
class Chess extends BoardGame {
	Chess(){
		super(11);
		print("Chess init");
	}
	
}
public class Ex6 {
	public static void main(String[] args){
		Chess ob = new Chess();
	}
}
