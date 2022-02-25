import java.util.Random;

public class task8 {

	public static void main(String[] args) {
		Random rand = new Random();
		int number,i;
		for(i=1;i<=16;i++) {
			number=rand.nextInt(17) +5;
			System.out.println("random number "+number);
		}
		
	}

}
