// here is the example of single level inheritance
// in which one class(child) inherits the base clss

class student
{
    int roll_no;
    String name;
}

class Result extends student
{
    void getData(int r, String n)
    {
        roll_no = r;
        name = n;
    }

    void showData()
    {
        System.out.println("Roll: "+roll_no+"\nName: "+name);
    }
}
class singleLevel
{
    public static void main(String[] args)
    {
        Result obj = new Result();
        obj.getData(11912424,"Vishwanath");
        obj.showData();
    }
}