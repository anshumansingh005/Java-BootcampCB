package Maximum_circular_sum;

import java.util.*;
public class MaximumCircularSum {
    public static int kadane(int[] a) {
        int sum = a[0];
        int max = a[0];
        for(int i = 1; i< a.length; i++) {
            sum = Math.max(sum + a[i], a[i]);
            if(sum > max)
                max = sum;
        }

        return max;
    }
    public static int circularMaxSum(int[] a){
        int ceNonWrapping  = kadane(a);
        int totalSum = 0;
        for(int i = 0; i <a.length ; i++) {
            totalSum += a[i];
            a[i] = -a[i];
        }
        int ncelementsSum = kadane(a);
        int ceWrapping  = totalSum + ncelementsSum;
        return Math.max(ceNonWrapping, ceWrapping);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            System.out.println(circularMaxSum(a));
            testCase--;
        }

    }
}


