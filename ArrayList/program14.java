import java.util.ArrayList;
import java.util.Scanner;

public class program14 {
    public static void main(String args[])
    {
        ArrayList <Integer> arr = new ArrayList<>(3);
        arr.add(3);
        arr.add(1,2);
        arr.add(2,5);
        arr.add(1,4);
        arr.add(0,1);
        arr.remove(3);
        System.out.println(arr.get(1));
        // output: 3
    }
    
    /* options:
    A  0
    B. 1
    C. IndexOutOfBoundsException
    D. None of these (correct)
     */
}