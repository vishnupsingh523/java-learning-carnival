// to show the working of 1-D arrays
import java.util.Scanner;

class array{
 
    public static void main(String args[]){

        int [] arr; // declaring an array but no memory allocated yet
        int n; // size of the array
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        
        n = obj.nextInt();
        arr = new int[n]; // allocating the memory to the array

        System.out.println("Enter the value of "+n+" elements :");

        for(int i = 0;i<arr.length;i++)
        arr[i] = obj.nextInt();

        System.out.println("\nThe elements of array are : \n");
        for(int i=0;i<arr.length;i++)
        System.out.println("--> "+arr[i]);
    }
}