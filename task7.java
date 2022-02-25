import java.util.Scanner;
public class task7 {

	static void isPrime(int n) //user defined method
    {
        int count=0;
        for (int i = 2; i < n; i++) 
        {
            if (n%i==0) 
            {
                count++;
                break;
            }
            else
            {
                continue;
            }
            
        }
        if (count==0) 
        {
            System.out.println("Prime");
        } 
        else 
        {
            System.out.println("Not Prime");
        }
        
    }


    //main method
    public static void main(String[] args) {
        int num=0;
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        isPrime(num);
    }
}