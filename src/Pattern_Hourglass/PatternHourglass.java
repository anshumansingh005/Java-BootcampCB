package Pattern_Hourglass;
import java.util.Scanner;
public class PatternHourglass {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
int nst = (2*n)+1;
int nsp=0;
int val = n;

int row = 1;
int nr=(2*n)+1;
while(row<=nr) {
	for(int csp=1;csp<=nsp;csp++) {
		System.out.print("   ");
	}
	for(int cst=1;cst<=nst;cst++) {
		if(cst==(nst/2)+1) {
			val=0;
			System.out.print(val + "  ");
			val++;
		}else {
			System.out.print(val + "  ");
			if(cst<=nst/2) {
				val--;
			}else {
				val++;
			}
		}
	}
	System.out.println();
	if(row<=n) {
		nsp++;
		nst-=2;
		}else {
		nsp--;
		nst+=2;
		}
		if(row<=n) {
			val-=2;
		}else if(row==n+1) {
			val=1;
		}else {
			val=val;
		}
	row++;
}

    }

	}

