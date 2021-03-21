package Alex_shopping;
import java.util.Scanner;
public class AlexShopping {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        int T=sc.nextInt();
        for(int t=1;t<=T;t++)
        {	int moneyunits=sc.nextInt();
            int k_items=sc.nextInt();
            k_items_orNot(arr,moneyunits,k_items);
        }
    }

    public static void k_items_orNot(int [] arr,int moneyunits,int k_items)
    {	int count=0;

        for(int i=0;i<=arr.length-1;i++)
        {
            if(moneyunits%arr[i]==0)
                count++;
        }
        if(count>=k_items)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
