package Pair_of_roses;
import java.util.Arrays;
import java.util.Scanner;
public class PairRoses {
        static Scanner scn = new Scanner(System.in);
        public static void main(String[] args) {
            int t = scn.nextInt();
            while(t>0) {
                int[] arr = takeInput();
                int target = scn.nextInt();
                pairOfRoses(arr, target);
                t--;
            }
        }
        public static int[] takeInput() {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            return arr;
        }
    public static void pairOfRoses(int[] arr,int  target) {
            Arrays.sort(arr);
            int i = 0, j = arr.length - 1, k = 0, l = 0;
            while (i < j) {
                if (arr[i] + arr[j] > target)
                    j--;
                else if (arr[i] + arr[j] < target)
                    i++;
                else {
                    k=arr[i];l=arr[j];
                    i++;
                    j--;
                }
            }
            System.out.println("Deepak should buy roses whose prices are "+k+" and "+l+".");
        }
}


