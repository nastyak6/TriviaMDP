package questions;

public class Level6 extends Question{
	public Level6() {
		super(6,0.5,500);
		sReward=166;
	}

	
	public static int Q1L6() {
		System.out.println("Which famous soft drink was invented in 1892?\n");
		System.out.println("1. Orange Juice");
		System.out.println("2. Fanta");
		System.out.println("3. Coca Cola");
		System.out.println("4. Sprite");
		
		return 3;
	}

}
