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

class student extends person{

    void sum()
    {//using super to acces base's function
        System.out.print("student\n");
    }
}

public class dynamicDispatch {
    public static void main(String args[])
    {
        person per = new employee();
        per.sum();
        per = new person();
        per.sum();

        per = new student();
        per.sum();
    }
}
