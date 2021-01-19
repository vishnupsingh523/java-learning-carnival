// to calculate the sum of two numbers
import java.util.Scanner;

class Second{
	public static void main(String args[]){
		int a,b,c;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a = ob.nextInt();
		b = ob.nextInt();
		c = a+b;
		System.out.println("Sum of a and b is : " + c);
	}
}