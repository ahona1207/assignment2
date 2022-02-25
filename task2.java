import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
    int num = input.nextInt();
    int i,count = 0;
    for(i=2;i<num;i++) {
    	if(num%i==0) {
    		count++;
    		break;
    	}
    }
    	if (count == 0) {
    		System.out.println("it is  prime");
    	}
    	
    	else {
    		System.out.println("it is not prime");
    	}
    
	}

}
