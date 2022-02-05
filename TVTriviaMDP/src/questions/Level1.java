package questions;

public class Level1 extends Question{

	public Level1() {
		super(1,0.99,1);
	}
	
	public static int Q1L1() {
		System.out.println("\nWhat is the rarest M&M color?\n");
		System.out.println("1. Blue");
		System.out.println("2. Brown");
		System.out.println("3. Red");
		System.out.println("4. Purple");
		
		return 2;
	}

}
