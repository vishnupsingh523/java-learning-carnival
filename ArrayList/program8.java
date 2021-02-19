import java.util.ArrayList;
import java.util.Scanner;

public class program8 {

    public static void main(String args[])
    {
       int [] arr = {1,2,3,4};
       int [] arr2 = new int[2];
       arr = arr2;// Line 1
       arr = arr; // Line 2
       System.out.println(arr[1]);
    }
    
    /* options:
    A  Error in Line 1
    B. Error in line 2
    C. 4 will be printed
    D. 0 will be printed (correct)
     */
}