package Calculate_the_sum;
import java.util.Scanner;

public class CalculateSum {
    public static int[] makeArray(int[] a,int n,int x){

        int[] output = new int[n];

        for(int i=0 ; i < n ; i++){
            int j=i-x;

            if(j>=0){
                output[i]= a[i] + a[i-x];
            }
            else{
                output[i]=a[i]+ a[n-x+i];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n ; i++){
            a[i]=scn.nextInt();
        }

        int q=scn.nextInt();
        int[] ptr=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            ptr[i]=a[i];
        }
        while(q-->0){
            int x=scn.nextInt();
            ptr=makeArray(ptr,n,x);
        }
        long  sum=0;
        for(int i=0 ; i < n ;i++){
            sum+= ptr[i] ;
            sum%=(1000000007);
        }
        System.out.println(sum );
    }
}