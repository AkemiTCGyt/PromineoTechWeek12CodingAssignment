import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!"); //creates a new illegalargumentexception
		}
	}
	
	public int randomNumberSquared() { //calls the method, getRandomInt and returns that number, squared.
		int randomNum = getRandomInt();
		return randomNum * randomNum;
	}
	
	int getRandomInt() {  //method that returns a random number 1-10
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
