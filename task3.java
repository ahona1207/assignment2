import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i,j;
		System.out.println("Enter any number ");
	int num=input.nextInt();
	for(i=1;i<=num;i++) {
		
		for(j=1;j<=10;j++) {
			System.out.println(i+"x" +  j +  " = " + (i*  j) ); 
		}
		
	}
	
	}
}