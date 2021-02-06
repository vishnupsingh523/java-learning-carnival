class Rectangle{
    int len, bre;
    // here constructor is defined in which we have initialized values in len and bre
    // there used to be a default constructor which is created by compiler if we don't create any defualt cons. which initializes value 0 to its data members; otherwise it will not insert any constructor in it.
    Rectangle()
    {
        len =10;
        bre = 20;
    }
}

public class defaultCons{
    public static void main(String args[]){
        Rectangle r = new Rectangle();

        System.out.println("Len: "+r.len+"\nBre: "+r.bre);
    }
}
