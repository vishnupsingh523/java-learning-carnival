import java.util.ArrayList;
import java.util.Scanner;

public class program3 {

    public static void main(String args[])
    {
        ArrayList <Integer> arr = new ArrayList<>(3);
        
        arr.add(3);
        arr.add(1,2);
        arr.add(2,5);
        arr.add(1,4);
        int x=1;
        System.out.println(arr.remove(x));
    }
    
    /* options:
    A  -1
    B. false
    C. 4 (correct)
    D. None of These
     */
}