import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		switch(num%2){
		//if num%2==0 it is even;
		case 0:
			System.out.println("number is even ");
			break;
		//num%2==1 then odd
		case 1:
			System.out.println("number is odd ");
			break;
			
		}

	}

}
