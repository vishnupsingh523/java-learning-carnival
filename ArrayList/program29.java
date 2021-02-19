import java.util.ArrayList;

public class program29{
    public static void main(String[] args)
    {
        String [] arr = new String[3];
        arr[0] = ""; // line1
        arr[2] = 10+"1"; 
        System.out.println(arr[0].length); // line2
        // output : error in line 2
    }

    /**
     * A 1
     * B 2
     * C Error in Line 1
     * D Error in lIne 2 (correct)
     */
}
