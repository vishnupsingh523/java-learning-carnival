import java.util.ArrayList;
import java.util.Comparator;

public class addMethod{
    public static void main(String[] args){
        ArrayList<String> states = new ArrayList<String>();

        // using . add() method to add elements in arrayList
        // to add in desired index use this sytanx:
        states.add(0,"Bihar");
        states.add("Rajasthan");
        states.add("Uttar Pradesh");
        states.add("Jammu and Kashmir");
        states.add("GOa");

        System.out.println(states);
        // using .get() method to get an element of ArrayList
        String st = states.get(3);
        System.out.println("Get State: "+st);
        // using .size() to print the sizeof the states
        System.out.println("Size: "+states.size());
        // .indexOf() is used to get the index of an elment;
        // .contains() is used to check if a given element exists or not.
        // .remove() is used to delete element from arraylist and returns the deleted element
// .sort(Comparator.naturalOrder()); is used to sort the arraylsit
        states.sort(Comparator.naturalOrder());
        System.out.println("After Sorting: "+states);
        
    }
}