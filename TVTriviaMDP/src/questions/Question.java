package questions;

public class Question{
	
	
	int level;
	double winChances;
	int reward;
	

//constructor
	public Question(int level, double winChances, int reward) {
		this.level=level;
		this.winChances=winChances;
		this.reward=reward;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public double getWinChances() {
		return winChances;
	}


	public void setWinChances(double winChances) {
		this.winChances = winChances;
	}


	public int getReward() {
		return reward;
	}


	public void setReward(int reward) {
		this.reward = reward;
	}
	

	
}
