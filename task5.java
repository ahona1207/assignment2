import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		System.out.println("Enter any integer ");
		Scanner  input = new Scanner  (System.in);
        int n= input.nextInt();
        int i,fact=1;
        for (i=n;i>=1;i--)
        {
        	fact = fact *i;
        }
        System.out.println("factorial of = "+fact);
	}

}
