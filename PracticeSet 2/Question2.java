public class Question2 {
    public static void main(String args[]){
        int [] arr = {1,2,3,4};
        int [] arr2 = new int[2];
        arr2 = arr;
        arr2[3] = 5;
        System.out.print(arr[3]);
        // arr[3]  = 5 will be printed
    }
}
