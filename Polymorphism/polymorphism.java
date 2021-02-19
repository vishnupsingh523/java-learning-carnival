class employee{

    static int sum(int a, int b)
    {
        return a+b;
    }

    static double sum(double a, double b)
    {
        return a+b;
    }
    
}

public class polymorphism {
    public static void main(String args[])
    {
        employee e = new employee();
        System.out.println("Int: "+e.sum(10,20));
        System.out.println("Double: "+e.sum(10.2,20.3));
    }
}
