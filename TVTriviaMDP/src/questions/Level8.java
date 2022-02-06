package questions;

public class Level8 extends Question{
	public Level8() {
		super(8,0.3,5000);
		sReward=1666;
	}

	
	public static int Q1L8() {
		System.out.println("What is the most expensive spice (by weight) in the world?\n");
		System.out.println("1. Vanilla");
		System.out.println("2. Saffron");
		System.out.println("3. Cardamom");
		System.out.println("4. Clove");
		
		return 2;
	}

}
