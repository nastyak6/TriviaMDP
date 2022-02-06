package questions;

public class Level5 extends Question{
	public Level5() {
		super(5,0.6,100);
		sReward=66;
	}

	
	public static int Q1L5() {
		System.out.println("What are the top two most popular spices in the world?\n");
		System.out.println("1. Paprika and Cumin");
		System.out.println("2. Sugar and Honey");
		System.out.println("3. Salt and Viniger");
		System.out.println("4. Pepper and Mustard");
		
		return 4;
	}

}
