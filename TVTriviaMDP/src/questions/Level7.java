package questions;

public class Level7 extends Question{
	public Level7() {
		super(7,0.4,1000);
		sReward=666;
	}

	
	public static int Q1L7() {
		System.out.println("How much caffeine needs to be taken out of coffee for it to be described as decaffeinated?\n");
		System.out.println("1. At least 97%");
		System.out.println("2. At least 89%");
		System.out.println("3. At least 76%");
		System.out.println("4. At least 65%");
		
		return 1;
	}

}
