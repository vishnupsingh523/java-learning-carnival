import java.util.ArrayList;

public class program28{
    public static void main(String[] args)
    {
        ArrayList <Integer> arr = new ArrayList<>(3);

        arr.add(3);
        arr.add(1,2);
        arr.add(2,5);
        arr.add(1,4);
        Integer x=1;
        System.out.println(arr.remove(x));
        // output : false
    }

    /**
     * A -1
     * B false (correct)
     * C 4
     * D None of These
     */
}
