import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		System.out.println("Enter any integer ");
		Scanner  input = new Scanner  (System.in);
        float num= input.nextFloat();
        System.out.println("Enter another integer ");
	  char operator;
	  float result ;
        float num2= input.nextFloat();
        //taking operetor from user
        System.out.println("Enter any operator ");
       operator = input.next().charAt(0);
       switch(operator) {
       case '+':
    	   result = num + num2;
    	   System.out.println(" answer " +result );
       break;
       
       case '-':
    	   result = num - num2;
    	   System.out.println(" answer " +result );
    	   break;
       case '*':
    	   result = num * num2;
    	   System.out.println(" answer " +result );
    	   break;
       case '/':
    	   result = num/num2;
    	   System.out.println(" answer " +result );
       break;
       
       default :
    	   System.out.println(" invalid" );
       
       
       }
	
	}
}
