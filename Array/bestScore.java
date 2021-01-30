// to show the initilization of 2 D array
import java.util.Scanner;
class bestScore{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of students:");
        n = obj.nextInt();
        int marks[] = new int[n];

        int max = -1;
        System.out.println("Enter the marks of "+n+" STUDENTS:");

        for(int i=0;i<marks.length;i++)
        {
            marks[i] = obj.nextInt();
            if(max<marks[i])
            max = marks[i];
        }

        for(int i=0;i<marks.length; i++)
        {
            if(marks[i]>= max-10)
            System.out.println("Student "+i+" Score is "+marks[i]+" and grade is A");
            else if(marks[i]>= max-20)
            System.out.println("Student "+i+" Score is "+marks[i]+" and grade is B");
            else if(marks[i]>= max-30)
            System.out.println("Student "+i+" Score is "+marks[i]+" and grade is C");
            else if(marks[i]>= max-40)
            System.out.println("Student "+i+" Score is "+marks[i]+" and grade is D");
            else
            System.out.println("Student "+i+" Score is "+marks[i]+" and grade is F");
        }
        
    }

}