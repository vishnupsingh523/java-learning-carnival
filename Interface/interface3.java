interface Polygon{
    void getArea();

    default void getParimeter(int ... sides){};
}

class Triangle implements Polygon{
    
    double b, h;

    Triangle(double b, double h)
    {
        this.b = b;
        this.h = h;
    }
    public void getArea(){
        System.out.println("Area is: " + (0.5*b*h));
    }

    public void getParimeter(int ...sides)
    {
        int parimeter = 0;
        for(int x:sides)
        parimeter +=x;

        System.out.println("Parimeter is  : " + parimeter);
    }


}

public class interface3{
    public static void main(String args[]){
        
        Polygon p = new Triangle(12.43, 34.54);
        p.getArea();
        p.getParimeter(12,43,23,1);
    }
}
