import java.util.*;  

class animal{
    String name;
    animal(String name)
    {this.name = name;}
}
public class treeset1 {
    public static void main(String args[]){
       
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        
        System.out.println(treeSet);
        
    }

}