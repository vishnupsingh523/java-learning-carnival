//program to show the working of switch case
import java.util.Scanner;

public class switchCase
{
public static void main(String[] args) {
String s = newString();
Scanner ob = new Scanner(System.in);
System.out.println("Enter the String ADD/SUB");
s = ob.nextLine();
switch(s)
{
case "ADD":
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thrusday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Invalid case");
}



}
}