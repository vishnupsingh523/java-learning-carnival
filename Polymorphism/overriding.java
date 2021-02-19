class person{
    static int sum(int a, int b)
    {
        System.out.print("Person: ");
        return a+b;
    }
}
class employee extends person{

    static int sum(int a, int b)
    {
        System.out.print("Employee: ");
        return a+b;
    }
}

public class overriding {
    public static void main(String args[])
    {
        employee e = new employee();
        System.out.println(e.sum(10,20));
        
    }
}
