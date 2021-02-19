// to show the working of abstract class
abstract class Shape
{
int l,b;
double r;
abstract void area();
}

class Rectangle extends Shape
{
Rectangle(int x,int y)
{
    l=x;
    b=y;
    }
    void area()
    {
        System.out.println("Area is rec is "+ (l*b));
    }
}
class Circle extends Shape
{
    Circle(double y)
    {
        r=y;
    }
    void area()
    {
        System.out.println("Area of circle is "+ (3.14*r*r));
    }
}

public class abstractClass
{
    public static void main(String[] args) {
        Shape s;// Null
        s= new Rectangle(12,34);
        s.area();
        s= new Circle(34.56);
        s.area();
    }
}