import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i,num;
		System.out.println("Enter any number ");
         num = input.nextInt();
         for(i=1;i<=num;i++) {
     	 if (num%i==0)
     	 {
     		System.out.println( i+"  ");
     	 }
         }
	}

}
