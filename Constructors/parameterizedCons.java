class Rectangle{
    int len, bre;
    // here constructor is defined in which we have initialized values in len and bre
    // there used to be a default constructor which is created by compiler if we don't create any defualt cons. which initializes value 0 to its data members; otherwise it will not insert any constructor in it.
    Rectangle(int l, int b)
    {
        len =l;
        bre = b;
    }
}

public class parameterizedCons{
    public static void main(String args[]){
        // we will give the values to the constructor at the time of initialization of object 
        // and if we want to use constructor again we can.
        Rectangle r = new Rectangle(30,20);
        Rectangle r1 = new Rectangle();
        System.out.println(r1.bre);

        System.out.println("Len: "+r.len+"\nBre: "+r.bre);
    }
}
