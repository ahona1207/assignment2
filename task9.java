import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		System.out.println("Enter any character ");
		Scanner  input = new Scanner  (System.in);
        char ch = input.next().charAt(0);
        if (ch >= 65 && ch<=90) {
        	System.out.println("It is a letter  ");
        }
        else  if (ch >= 97 && ch<=122) {
        	System.out.println("It is a letter  ");
        }
        else  if (ch >= 48 && ch<=57) {
        	System.out.println("It is a digit  ");
        }
        else 
         {
             	System.out.println("It is a symbol  ");
             }
        
	}

}
