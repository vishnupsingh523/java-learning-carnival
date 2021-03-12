@FunctionalInterface
interface A{
    int calculate(int x);
}

public class lambda implements B{

    public static void main(String args[])
    {
        A cube = (int x)->{return (x*x*x); };
        A square = (int x)->{return (x*x); };

        System.out.println("Cube: "+ cube.calculate(10));
        System.out.println("Square: "+ square.calculate(10));
    }
}