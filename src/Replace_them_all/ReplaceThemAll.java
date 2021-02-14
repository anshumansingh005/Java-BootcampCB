package Replace_them_all;
import java.util.Scanner;

public class ReplaceThemAll{
	public static void main(String name[]){
		Scanner sc= new Scanner(System.in);
		long n = sc.nextLong();
		long ans=0;
		if(n==0)
			System.out.print(5);
		else{
			long mult = 1;
			while(n>0){
				long rem = n%10;
				if(rem == 0)
					rem = 5;

				ans= rem*mult + ans;
				mult = mult *10;
				n = n/10;
			}
		System.out.println(ans);
                    }
	}
}
