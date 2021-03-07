interface Shape{
    int l = 12, b = 34; // public static and final
    void calcArea(); // method is public and default
    default void message(){
        System.out.println("Welcome to the Shape Interface.");
    }
}

class Rectangle implements Shape{

    public void calcArea(){
        System.out.println("Area of rectangle is : "+ (l*b));
    }
}
class Circle implements Shape{

    double r;
    Circle(double r)
    {
        this.r = r;
    }
    
    public void calcArea(){
        System.out.println("Area of Circle : "+(3.14*r*r));
    }
}

public class interface2{
    public static void main(String args[]){
        
        Shape s = new Rectangle();
        s.message();
        s.calcArea();

        s = new Circle(23.45);
        s.calcArea();
    }
}
