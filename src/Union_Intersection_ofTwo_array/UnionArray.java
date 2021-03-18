package Union_Intersection_ofTwo_array;
import java.util.Arrays;
import java.util.Scanner;
public class UnionArray {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int size1, size2;
        size1 = sc.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++)
            array1[i] = sc.nextInt();
        size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++)
            array2[i] = sc.nextInt();
        union(array1, size1, array2,size2);
        intersection(array1 ,array2);

    }
    public static void union(int[] array1, int size1, int[] array2, int size2) {
        //int si = size1 + size2;
        int[] array3 = new int[size1 + size2];

        if (size1 >= 0)
            System.arraycopy(array1, 0, array3, 0, size1);

        if (size2 >= 0)
            System.arraycopy(array2, 0, array3, size1, size2);

        Arrays.sort(array3);
        int j = 0;
        for (int i = 0; i < array3.length - 1; i++) {
            if (array3[i] != array3[i + 1]) {
                array3[j] = array3[i];
                j++;
            }
        }
        array3[j] = array3[array3.length - 1];
        for (int i = 0; i <= j; i++)
            System.out.println(array3[i]+" ");
        System.out.println();
   }
    public static void intersection(int[] array1, int[] array2){
        for (int k : array1)
            for (int i : array2)
                if (k == i)
                    System.out.println(i);
    }
}