package Rain_water_trapping;

import java.util.Scanner;

public class RainWater {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=1;i<=t;i++){
                int n=sc.nextInt();
                int[] arr =new int [n];
                for(int j=1;j<=n;j++){
                    arr[j-1]=sc.nextInt();
                }
                water(arr);

            }
        }
        public static void water(int[] arr){
            int[] left =new int [arr.length];
            left[0]=arr[0];
            int leftmax=arr[0];
            int res=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>leftmax){
                    leftmax=arr[i];
                }
                left[i]=leftmax;
            }
            int[] right =new int[arr.length];
            int rightmax=arr[arr.length-1];
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>rightmax){
                    rightmax=arr[i];
                }
                right[i]=rightmax;
            }
            for(int i=0;i<arr.length;i++){
                res=res+Math.min(left[i],right[i])-arr[i];
            }
            System.out.println(res);
        }
}