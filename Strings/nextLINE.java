import java.util.Scanner;

public class nextLINE{
    public static void main(String args[]){
        
        String s = new String();
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a string : ");

        s = obj.nextLine();

        System.out.println("\nEntered string is : "+s);


    }
}
