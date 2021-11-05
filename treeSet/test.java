import java.io.IOException;
import java.util.*;

class My{
    public String test(){
        try{
            System.out.print("One");
            return "";

        }
        finally{
            System.out.print("Two");
        }
    }
}


public class test {
    public static void main(String args[])
    {
        ArrayList ob = new ArrayList();
        ob.add("A");
        ob.ensureCapacity(3);
        System.out.println(ob.size());
    }
}
