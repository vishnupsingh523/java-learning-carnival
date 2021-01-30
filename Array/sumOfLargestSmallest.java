import java.util.Scanner;

public class sumOfLargestSmallest {

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
        int max = arr[arr.length-1];

        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            min = arr[i];
            if(max<arr[i])
            max = arr[i];
        }
        System.out.print("\nThe Sum of largest and minimum is : "+(min+max));
    }
}
