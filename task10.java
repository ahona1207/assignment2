import java.util.Scanner;
public class task10 {

	public static void main(String[] args) {
		//declare varriable
		double a,b,c;
		double x1,x2;
		//take input
		Scanner input = new Scanner (System.in);
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		//process
		x1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		//outputs
		System.out.println("root 1 = "+x1);
		System.out.println("root 2 = "+x2);
	}

}
