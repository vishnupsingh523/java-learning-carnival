
// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.
import java.util.Scanner;
public class discount{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Number of quantity:");
        int quantity = s.nextInt();
        System.out.println("Enter the amount : ");
        Float a = s.nextFloat();

        if(a*quantity > 1000){

            float discount = (float)(a-a/10);
            System.out.println("Total Cost after adding 10% DISCOUNT :" + (float)(discount*quantity));
        }else{
            System.out.println("the amount : " +(float)(quantity*a) );
        }


    }
}