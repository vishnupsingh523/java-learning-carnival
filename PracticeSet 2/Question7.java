public class Question7{

    public static void main(String args[]){

        char [][] arr = new char[3][1];
        arr[0] = new char[2];
        arr[2] = new char[]{'A','B'};
        // arr[1][1] = 'A'; this will throw an error;

        
        System.out.print(arr[2][1]);
        // System.out.print(arr[1][1]);
        // C : will be printed

    }
}
