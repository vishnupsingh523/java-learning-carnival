// to show the initilization of 2 D array
import java.util.Scanner;
class SmallestElement{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of Elements:");
        n = obj.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the value of "+n+" Elements:");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = obj.nextInt();
        }

        int min = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            min = arr[i];
        }
        System.out.print("\nThe Smallest Element is : "+min);
    }

}