class person{
    int id;
    String name;

    void getData(int i, String n)
    {
        id = i;
        name = n;
    }
}

class employee extends person{
    float salary;

    employee(int a, String n, float s)
    {
        // here super keyword is used to call the function of the base class
        super.getData(a, n);;
        salary = s;
    }

    void displayData(){
        System.out.println("ID: "+id+"\nName: "+name+"\nSalary: "+salary);
    }
}

public class superMethod {
    public static void main(String args[])
    {
        employee e = new employee(11912424,"Vishwanath",50000);
        e.displayData();
    }
}
