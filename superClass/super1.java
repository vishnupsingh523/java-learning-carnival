class person{
    int id;
    String name;

    person(int i, String n)
    {
        id = i;
        name = n;
    }
}

class employee extends person{
    float salary;

    employee(int a, String n, float s)
    {
        super(a,n);
        salary = s;
    }

    void displayData(){
        System.out.println("ID: "+id+"\nName: "+name+"\nSalary: "+salary);
    }
}

public class super1 {
    public static void main(String args[])
    {
        employee e = new employee(11912424,"Vishwanath",50000);
        e.displayData();
    }
}
