import java.util.Scanner;
public class sumOfNat{
	public static void main(String[] args){
		int i=1;
		int n,sum =0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		n = ob.nextInt();
		for(;i<=n;i++)
		sum+= i;

		System.out.println("\nThe sum of first N natural numbers is : " + sum);
	}
}