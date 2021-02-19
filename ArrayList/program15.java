import java.util.ArrayList;
import java.util.Scanner;

public class program15 {
    public static void main(String args[])
    {
        char [][] arr = new char[3][];
        arr[1] = new char[2];
        arr[2] = new char[]{'A','B'}; //Line1
        arr[1][1] = 'A';           // line2
        
        System.out.println(arr[2][1]);
        // output: B
    }
    
    /* options:
    A  A
    B. B (Correct)
    C. error in Line 1
    D. Error in Line 2
     */
}