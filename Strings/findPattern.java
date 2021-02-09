import java.util.Scanner;

public class findPattern{
    public static void main(String args[]){
        
        String str = new String();
        Scanner obj = new Scanner(System.in);
        
        String check = new String();
        System.out.print("Enter a string : ");
        str = obj.nextLine();
        
        System.out.print("Enter the pattern : ");
        check = obj.nextLine();

        String a = new String();
        for(int i=0;i<str.length()-check.length();i++)
        {
            a = str.substring(i,i+check.length());
            if(a==check)
            {
                System.out.println("Successfully found !!");
                break;
            }
        }
   }
}
