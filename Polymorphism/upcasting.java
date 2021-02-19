class person{
    void sum()
    {
        System.out.print("Person\n");
    }
}
class employee extends person{

    void sum()
    {//using super to acces base's function
        System.out.print("Employee\n");
    }
}

public class upcasting {
    public static void main(String args[])
    {
        person per = new employee();
        per.sum();
        per = new person();
        per.sum();
    }
}
