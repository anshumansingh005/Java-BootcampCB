package Print_Primes;
import java.util.Scanner;
import java.lang.Math;

public class PrintPrimes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] prime = new boolean[N];
		
		for(int i = 0; i< prime.length; i++)
			prime[i] = true;
		
		int i = 2;
		while(i < Math.sqrt(N)){
			if(prime[i] == true){
				for(int j = (i*i); j<N; j++)
					prime[j] = false;
				
			} i++;
		}
		for(int k = 2; k<prime.length; k++)
			if(prime[k] == true
				System.out.println(i);
	}

}
