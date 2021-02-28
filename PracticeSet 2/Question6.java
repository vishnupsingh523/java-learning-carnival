public class Question6{

    public static void main(String args[]){
        
        // int [][] arr = {
        //     {10,20},
        //     {11,21,31},
        //     {} // line1
        // };
        
        // System.out.println(arr[2].length);
        // ArrayIndexOutOfBoundsException will be thrown
    
        String [] arr = new String[3];
        arr[0] = "";
        arr[2] = ""+10;

        // int arr1[] = new int[]{1,2,3};
        // System.out.println(arr.length);
        // prints the lenght of the array arr and no error is there
        System.out.println(arr[1]);
        // null : prints and no error is there
    }
}
