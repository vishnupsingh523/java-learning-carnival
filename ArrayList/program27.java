import java.util.ArrayList;

public class program27{
    public static void main(String[] args)
    {
        ArrayList <Integer> arr = new ArrayList<>(3);

        arr.add(3);
        arr.add(1,2);
        arr.add(2,5);
        arr.add(1,4);
        arr.clear();
        System.out.print(arr.get(0));
        // output : IndexOutOfBoundsException means runtime error;
    }

    /**
     * A 0
     * B null
     * C Compilation error
     * D Runtime Error (correct)
     */
}
