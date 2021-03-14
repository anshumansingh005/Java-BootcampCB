package Square_pyramid;

import java.util.Scanner;

public class SquarePyramid{
	public static void printnums(int n){
		int i, j,num;
		for(i=0; i<n; i++){
			num=1;
			for(j=0; j<=i; j++){
				System.out.print(num*num+ " ");
				num++;
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printnums(n);
	}
}

