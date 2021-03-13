class Person{
    static int rollNo = 0;
    String name;

    static class Student{
        String section;
        String uniName;
        Person p = new Person();

        void getData(String Sname, String Ssection, String univ){
            p.name = Sname;
            section = Ssection;
            uniName = univ;
        }

        void showData(){
            System.out.println("Roll No : " + rollNo);
            System.out.println("Name : " + p.name);
            System.out.println("Section : " + section);
            System.out.println("University : " + uniName);
        }
    }
}

public class StaticNestedClass2{

    public static void main(String args[])
    {
        Person.Student student1 = new Person.Student();
        Person.Student student2 = new Person.Student();

        student1.getData("Vishwanath Pratap Singh", "K19PT", "LPU");
        student2.getData("Prashant Ranjan", "K19RJ", "Lovely Professional University");
        
        Person.rollNo++;
        student1.showData();
        
        System.out.println();

        Person.rollNo++;
        student2.showData();
    }
}