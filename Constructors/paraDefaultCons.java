class student{
    int roll;
    String name;

    student(){
        roll = 1;
        name = "Vishwanath";
    }

    student(int r, String n)
    {
        roll = r;
        name = n;
    }

    void showData()
    {
        System.out.println("Roll number: "+roll);
        System.out.println("Name: "+name);
    }
}

public class paraDefaultCons{
    public static void main(String args[]){
        
        student s1 = new student();
        student s2 = new student(2, "Aditya");
        s1.showData();
        s2.showData();
    }
}
