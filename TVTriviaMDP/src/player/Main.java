package player;


public class Main {

	
	public static void main(String[] args) {
		Player a=new Player();
		a.MDP();
		System.out.println("Lets begin");
		while(a.continuePlay==true)
			a.TriviaGame();
	}
	
}


