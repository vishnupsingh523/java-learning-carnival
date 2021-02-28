import java.util.ArrayList;

public class Question11{

    public static void main(String args[]){
        
        ArrayList <Integer> al = new ArrayList<>(3);
        al.add(3);
        al.add(1,2);
        al.add(2,5);
        al.add(1,4);
        // int x = 1;
        // it gives 4
        // Integer x = 1;
        // this gives false because false is not present
        // System.out.println(al.remove(x) );

        al.clear();

        System.out.println(al.get(0) );

        // This gives runtime error of exception indexoutofBound
    
    }
}
