public class Question1 {
    public static void main(String args[]){
        int [] arr = {1,2,3,4};
        int [] arr2 = new int[2];

        arr = arr2; // line1
        arr = arr; // line2
        System.out.println(arr[1]); // line 3
        // arr[3] // arrayIndexOutof boundsException;
    }
}
