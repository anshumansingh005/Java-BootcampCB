import java.util.Scanner;
class Main{
public static void main(String args[]){
int i,j;
Scanner scan=new Scanner(System.in);

int rows=scan.nextInt();
i=1; 
while(i<=rows){
j=i; 
    while(j<=rows){
       System.out.print("*");
        j++;
    }
j=1; 
    while(j<=(2*i-2)){
       System.out.print(" ");
        j++;
    }
    j=i; 
    while(j<=rows){
       System.out.print("*");
        j++;
    }
    System.out.print("\n");
     i++;
}
    
    i=1; 
while(i<=rows){
j=1; 
    while(j<=i){
       System.out.print("*");
        j++;
    }
    j=(2*i-2); 
    while(j<(2*rows-2)){
       System.out.print(" ");
        j++;
    }
    j=1; 
    while(j<=i){
       System.out.print("*");
        j++;
    }
    System.out.print("\n");
     i++;
    }
    }
    }
