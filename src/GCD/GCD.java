package GCD;
import java.util.Scanner;
public class GCD{
	static int gcd(int N1, int N2){
		if(N2 == 0)
			return N1;
		else 
			return gcd(N2, N1%N2);
	}
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		System.out.print(gcd(N1, N2));
        }
}

