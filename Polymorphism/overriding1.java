class person{
    void sum(int a, int b)
    {
        System.out.print("Person\n");
    }
}
class employee extends person{

    void sum(int a, int b)
    {//using super to acces base's function
        super.sum(20,30);
        System.out.print("Employee");
    }
}

public class overriding1 {
    public static void main(String args[])
    {
        employee e = new employee();
        e.sum(10, 20);
        
    }
}
