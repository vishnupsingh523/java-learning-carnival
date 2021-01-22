import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		int i=0;
		int n, rev =0;
		Scanner ob = new Scanner(System.in);
		System.out.println("----------------- Palindrome ------------\n\n");
		System.out.println("Enter the value of N : ");
		n = ob.nextInt();

		for(i=n;i>0;i =i/10)
		{
			rev = rev*10 + i%10;
		}
		if(rev == n)
		{
			System.out.println("The number is a Palindrome.");
		}
		else{
		System.out.println("The number is not a Palindrome.");
		}
		
	}
}