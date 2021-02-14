package Revising_Qudaratic_Equations;
import java.util.Scanner;
import java.lang.Math.*;
public class QuadratiEquations{
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		int a  = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		roots(a, b, c);	

	}

	static int roots(int a , int b, int c){
		if( a == 0)
			return 0;
		int d = b*b - 4*a*c;
		double sqroot = Math.sqrt(Math.abs(d));
		if (d>0){
			System.out.println("Real and Distinct");
			int root1 = (int)(-b + sqroot)/(2*a);
			int root2 = (int)(-b -  sqroot)/(2*a);
			if(root1>root2)
				System.out.print(root2+" "+root1);
			
			else
				System.out.print(root1+" "+root2);
		}
		else if(d ==0){
			System.out.println("Real and Equal");	
			int root1 = (int)(-b)/(2*a);
			System.out.print(root1+" "+root1);
		}
		else
			System.out.println("Imaginary");
		
						 
		return 0;
		}
	}
