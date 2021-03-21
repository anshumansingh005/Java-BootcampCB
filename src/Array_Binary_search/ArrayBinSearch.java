package Array_Binary_search;
import java.util.Scanner;
public class ArrayBinSearch {

    public static int binary_search(int[]arr,int n,int m){
        int s=0;
        int e=arr.length-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(arr[mid]==m) {
                return mid;
            }
            else if(arr[mid]<m) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();

        int r=binary_search(arr,n,m);
        System.out.print(r);
    }
}