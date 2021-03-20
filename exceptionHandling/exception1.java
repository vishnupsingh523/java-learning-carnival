import java.util.Scanner;

public class exception1{

    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4};

        
        System.out.print("Enter the index: ");
        int neg = ob.nextInt();

        try{
            
            System.out.println("Array: "+ arr[neg]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index is negative. Please enter any positive index.");
        }
        catch(Exception e){
            System.out.print("Error");
        }
    }

}