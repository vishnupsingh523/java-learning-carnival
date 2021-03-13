class calculator{
    int a, b;
    class calculate{
        void add(int x, int y)
        {
            a = x;
            b = y;
            System.out.println("Sum: "+(a+b));
        }

        void sub(int x, int y)
        {
            a = x;
            b = y;
            System.out.println("Sub: "+(a-b));
        }

        void mul(int x, int y)
        {
            a = x;
            b = y;
            System.out.println("mul: "+(a*b));
        }
    }
}
public class nonStaticNestedClass{

    public static void main(String args[])
    {
        calculator obj = new calculator();

        calculator.calculate cal = obj.new calculate();

        cal.add(10, 23);
        cal.sub(23, 34);
        cal.mul(39, 32);

       
    }

}