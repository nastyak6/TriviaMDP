package player;

import java.util.Scanner;

import questions.Level1;
import questions.Level2;
import questions.Level3;
import questions.Level4;
import questions.Level5;
import questions.Level6;
import questions.Level7;
import questions.Level8;
import questions.Question;

public class Player {

	int currentLevel = 1;
	int sumRewards = 0;
	boolean continuePlay = true;

	Scanner input = new Scanner(System.in);

	void TriviaGame() {
		Question q;
		int playerAnswer;
		int correctAnswer;

		// will show the questions in order
		switch (currentLevel) {
		case 1:
			q = new Level1();
			correctAnswer = Level1.Q1L1();
			System.out.println("\nPlease submit an answer | 1 | 2 | 3 | 4 |\n");
			playerAnswer = input.nextInt();

			if (playerAnswer == correctAnswer)
				PlayerAnsweredCorrect(q);
			else
				PlayerAnsweredWrong();

			currentLevel++;
			break;
		case 2:
			q = new Level2();
			continuePlay(q);
			correctAnswer = Level2.Q1L2();
			System.out.println("\nPlease submit an answer | 1 | 2 | 3 | 4 | : ");
			playerAnswer = input.nextInt();

			if (playerAnswer == correctAnswer)
				PlayerAnsweredCorrect(q);
			else
				PlayerAnsweredWrong();
			currentLevel++;
			break;
		case 3:
			q = new Level3();
			continuePlay(q);
			correctAnswer = Level3.Q1L3();
			System.out.println("\nPlease submit an answer | 1 | 2 | 3 | 4 | : ");
			playerAnswer = input.nextInt();

			if (playerAnswer == correctAnswer)
				PlayerAnsweredCorrect(q);
			else
				PlayerAnsweredWrong();
			currentLevel++;
			break;
		case 4:
			q = new Level4();
			continuePlay(q);
			correctAnswer = Level4.Q1L4();
			System.out.println("\nPlease submit an answer | 1 | 2 | 3 | 4 | : ");
			playerAnswer = input.nextInt();

			if (playerAnswer == correctAnswer)
				PlayerAnsweredCorrect(q);
			else
				PlayerAnsweredWrong();
			currentLevel++;
			break;
		case 5:
			q = new Level5();
			continuePlay(q);
			correctAnswer = Level5.Q1L5();
			System.out.println("\nPlease submit an answer | 1 | 2 | 3 | 4 | : ");
			playerAnswer = input.nextInt();

			if (playerAnswer == correctAnswer)
				PlayerAnsweredCorrect(q);
			else
				PlayerAnsweredWrong();
			currentLevel++;
			break;
		case 6:
			q = new Level6();
			continuePlay(q);
			correctAnswer = Level6.Q1L6();
			System.out.println("\nPlease submit an answer | 1 | 2 | 3 | 4 | : ");
			playerAnswer = input.nextInt();

			if (playerAnswer == correctAnswer)
				PlayerAnsweredCorrect(q);
			else
				PlayerAnsweredWrong();
			currentLevel++;
			break;
		case 7:
			q = new Level7();
			continuePlay(q);
			correctAnswer = Level7.Q1L7();
			System.out.println("\nPlease submit an answer | 1 | 2 | 3 | 4 | : ");
			playerAnswer = input.nextInt();

			if (playerAnswer == correctAnswer)
				PlayerAnsweredCorrect(q);
			else
				PlayerAnsweredWrong();
			currentLevel++;
			break;
		case 8:
			q = new Level8();
			continuePlay(q);
			correctAnswer = Level8.Q1L8();
			System.out.println("\nPlease submit an answer | 1 | 2 | 3 | 4 | : ");
			playerAnswer = input.nextInt();

			if (playerAnswer == correctAnswer)
				PlayerAnsweredCorrect(q);
			else
				PlayerAnsweredWrong();
			currentLevel++;
			break;
			

		default:
			break;
		}
	}

	void PlayerAnsweredCorrect(Question q) {
		sumRewards += q.getReward();
		System.out.println("You are correct :)");
		System.out.println("You have won " + q.getReward() + " and have a total of " + sumRewards);

	}

	void continuePlay(Question q) {
		Scanner input2 = new Scanner(System.in);

		double winChances=q.getWinChances()*(q.getReward()+sumRewards)*0.25;
		double loseChances=(1-q.getWinChances())*sumRewards*0.75;
		System.out.println("win chances:"+winChances+" lose chances:" +loseChances);
		
		if(winChances>loseChances)
			System.out.println("The machine recommends to proceed");
		else
			System.out.println("The machine recommends to quit");
		
		System.out.println("\nYour winning chances for the next question are:"+q.getWinChances()*100+"% you will win "+q.getReward()+"$");
		
		System.out.println("If you want to quit please enter n , press enter to proceed...");

		String playerAnswer = input2.nextLine();
		if (playerAnswer.equals("n")) {
			continuePlay = false;
			System.out.println("Thank you for palying, you have won " + sumRewards);
			System.exit(0);
		}
		
		
	}

	void PlayerAnsweredWrong() {
		sumRewards = 0;
		System.out.println("You are wrong :(");
		System.out.println("You have lost all of your reward");
		System.out.println("See you next time");
		continuePlay = false;
	}

}
