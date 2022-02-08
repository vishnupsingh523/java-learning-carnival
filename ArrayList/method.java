import java.util.ArrayList;
public class method{
    public static void main(String[] args){
        ArrayList list1 = new ArrayList();

        list1.add("One");
        list1.add(2);
        list1.add("three");
        list1.add("three");
        list1.add('c');

        System.out.println("arraylist: "+list1);
        // generic version
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(100);
        list2.add(200);
        // list2.add("one"); this will not work
        System.out.println("List 2 : "+list2);
    }
}