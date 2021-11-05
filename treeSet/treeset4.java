import java.util.*;  

class animal{
    String name;
    animal(String name)
    {this.name = name;}
}
public class treeset4{
    public static void main(String args[]){
       
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
    
        Iterator itr = treeSet.iterator();
        
        while(itr.hasNext())
        System.out.println(itr.next());

        System.out.println("Check 40: "+treeSet.contains(40));
        System.out.println("Lowest Value: "+treeSet.first());
        System.out.println("Lower than 40: "+treeSet.lower(40));
        
    }

}