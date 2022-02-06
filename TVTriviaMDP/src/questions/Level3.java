package questions;

public class Level3 extends Question{

	public Level3() {
		super(3,0.8,10);
		sReward=6;
	}

	
	public static int Q1L3() {
		System.out.println("What percentage of peanuts is found in a standard jar of peanut butter?\n");
		System.out.println("1. 10%");
		System.out.println("2. 30%");
		System.out.println("3. 60%");
		System.out.println("4. 90%");
		
		return 4;
	}
}
