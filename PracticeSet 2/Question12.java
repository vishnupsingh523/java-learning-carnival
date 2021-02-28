import java.util.ArrayList;

public class Question12{

    public static void main(String args[]){
        
        ArrayList <Integer> al = new ArrayList<>(3);
        al.add(3);
        al.add(1,2);
        al.add(2,5);
        al.add(1,4);
        al.add(0,2);
        // int _1;
        // int x = 1;
        // it gives 4
        // Integer x = 1;
        // this gives false because false is not present
        // System.out.println(al.remove(x) );

        al.remove(2);

        System.out.println( al.lastIndexOf(2) );
        // it returns the highest indexof the specified element;

        // System.out.println(al.indexOf(2) );
        // This gives runtime error of exception indexoutofBound
    
    }
}
