// here is the example of multilevel level inheritance
// in which one class(child) inherits the base class and
// there is one more child class which inherits the child class of the base class
/*   | base  class |
    ------||--------
     | child class |
     -----||--------
     | child class |
    
*/

class Student
{
    int roll_no;
    String name;
}

class Performance extends Student
{
    int marks, overallPercentage;
    void getPerformance(int m, int p)
    {
        marks = m;
        overallPercentage = p;
    }

    void showPerformance()
    {
        System.out.println("Marks: "+marks+"\nPercentage: "+overallPercentage+" %");
    }
}

class Result extends Performance
{
    void getData(int r, String n)
    {
        roll_no = r;
        name = n;
    }

    void showData()
    {
        System.out.println("Roll: "+roll_no+"\nName: "+name);
        // the alternate method of using the showPerformance() funciton in the showData fucntion
        // showPerformance();
    }
}
class MultiLevel
{
    public static void main(String[] args)
    {
        Result obj = new Result();
        // using the data members of Main base class : means base class of Performance;
        obj.getData(11912424,"Vishwanath");
        // calling the base class of result
        obj.getPerformance(99, 99);
        obj.showData();
        obj.showPerformance();
    }
}