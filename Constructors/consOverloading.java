class sum{
    sum(int x, int y){
        System.out.println("Sum of Integers is : "+(x+y));
    }
    
    sum(double x, double y){
        System.out.println("Sum of Double is : "+(x+y));
    }
}

public class consOverloading{
    public static void main(String args[]){
        
        sum s1 = new sum(10,20);
        sum s2 = new sum(25.23,12.23);
    }
}
