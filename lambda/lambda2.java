interface A{
    void calculate(int ...x);
}

public class lambda2{

    public static void main(String args[])
    {
        A arr = (int ...x)->{
            int sum = 0;
            int largest = x[0];
            for (int value : x) {
                sum+= value;
                if(largest<value)
                    largest = value;
            }
            
            System.out.println("Average: "+ (sum/x.length));
            System.out.println("Sum: "+ sum);
            System.out.println("Largest: "+ largest);
        };

        arr.calculate(1,2,3,4,5,6,7,8,9,10);
    }
}