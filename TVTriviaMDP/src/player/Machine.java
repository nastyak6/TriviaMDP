package player;

import java.util.Random;
import java.util.Scanner;

import questions.Level1;
import questions.Question;

public class Machine {

	int currentLevel = 1;
	int sumRewards = 0;
	boolean continuePlay = true;

	Scanner input = new Scanner(System.in);

	void TriviaGame() {
		Question q;
		int machineAnswer;
		int correctAnswer;
		switch (currentLevel) {
		case 1:
			q = new Level1();
			correctAnswer = Level1.Q1L1();

			break;

		case 2:

			break;

		default:
			break;
		}
	}

	private class RandomItem {
		private int[] numbers = { 1, 2, 3, 4 };
		private double[] probs;
		private Random rand;

		public RandomItem(int[] numbers, double[] probs) {
			this.numbers = numbers;
			this.probs = probs;
			rand = new Random();
		}

		public int random() {
			double p = rand.nextDouble();
			double sum = 0.0;
			int i = 0;
			while (sum < p) {
				sum += probs[i];
				i++;
			}
			return numbers[i - 1];
		}
	}

}
