// to show the initilization of 2 D array
import java.util.Scanner;
class JaggedRagged{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][];
        arr[0] = new int [2];
        arr[1] = new int [4];
        arr[2] = new int [3];

        System.out.println("Enter the elements of Jagged Arrays:");

        for(int i=0;i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            arr[i][j] = obj.nextInt();
        }
        
        System.out.println("\nThe Elements of Jagged array are :");
        for(int i=0;i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            System.out.print(arr[i][j]+" ");
            
            System.out.println();
        }
    }
}