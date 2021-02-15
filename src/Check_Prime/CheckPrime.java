package Check_Prime;
import java.util.Scanner;
import Java.lang.Math;
 
public class CheckPrime{
	public static boolean isPrime(int n){
		if(n<=1)
		return false;
		if(n<=3)
		return true;
		if(n % 2 ==0 || n%3 ==0)
			return false;
		for(int i  = 5; i*i <=n ; i +=6){
				if(n % i == 0||n%(i +2) ==0)
					return false;
			}
			return true;
			
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
		   System.out.println(0);
		if(isPrime(n))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");	

	}

}
