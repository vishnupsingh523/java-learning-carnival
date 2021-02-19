import java.util.ArrayList;
import java.util.Scanner;

public class program1 {

    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        
        int n=0;
        System.out.print("Enter the size of array: ");
        n = obj.nextInt();
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++)
        {
            int value = obj.nextInt();
            arr.add(value);
        }

        System.out.println("\nThe entered values are:");
        for(int i=0;i<arr.size();i++)
        System.out.println(arr.get(i));

        
        arr.clear();
        System.out.println("\nAfter using arr.clear() function, the size will be : "+arr.size());
        
    }
    
}