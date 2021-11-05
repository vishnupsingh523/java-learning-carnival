import java.util.*;  

class animal{
    String name;
    animal(String name)
    {this.name = name;}
}
public class treeset3{
    public static void main(String args[]){
       
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
    
        Iterator itr = treeSet.iterator();
        
        while(itr.hasNext())
        System.out.println(itr.next());

        System.out.println("Lowest Value: "+treeSet.pollFirst());
        
    }

}