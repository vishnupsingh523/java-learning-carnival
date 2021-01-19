import java.util.Scanner;
public class table
{
public static void main(String[] args) {
	
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n = ob.nextInt();
	
	int i=1;
	while(i<=10)
	{
		System.out.println(n + " x " + i + " = " + n*i);
		i++;
	}
	
// loop will get stuck infinte
i++;
}
}
