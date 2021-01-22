import java.util.Scanner;
public class reverseOfNumber{
	public static void main(String[] args){
		int i=0;
		int n, rev =0;
		Scanner ob = new Scanner(System.in);
		System.out.println("----------------- Reverse of Number ------------\n\n");
		System.out.println("Enter the value of N : ");
		n = ob.nextInt();

		for(i=n;i>0;i =i/10)
		{
			rev = rev*10 + i%10;
		}

		if(rev == n)
		{
			System.out.println("The reverse is : " + rev);

		
	}
}