import java.util.Scanner;

public class comparingStrings{
    public static void main(String args[]){
        
        String s = "Vishwanath";
        String n = "Aditya";

        // equals(str) returns boolean value if the string is equal to its argument or not.
        System.out.println("Strings Equal or not : "+s.equals(n));

        System.out.println("Compares:"+s.compareTo(n));        
        System.out.println(s.charAt(8));


    }
}
