import java.util.Random;

public class random {

	public static void main(String[] args) {
		int start=0;
		int end=99;
		Random random = new Random();
		int randomNumber = random.nextInt(end+1-start)+start;
		System.out.println(randomNumber);

	}

}
