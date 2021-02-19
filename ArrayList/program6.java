import java.util.ArrayList;
import java.util.Scanner;

public class program6 {

    public static void main(String args[])
    {
        ArrayList <Integer> arr = new ArrayList<>(3);
        arr.add(3);
        arr.add(1,2);
        arr.add(2,5);
        arr.add(1,4);
        arr.add(0,2);
        arr.remove(2);
        // Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices)

        System.out.println( arr.lastIndexOf(2) );
        // the index of the last occurrence of the specified element in this list, or -1 if this list does not

    }
    
    /* options:
    A  1
    B. 2 (correct)
    C. Compilatin Error
    D. None of these
     */
}