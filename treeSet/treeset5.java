import java.util.*;  

class animal{
    String name;
    animal(String name)
    {this.name = name;}

    public String toString(){
        return name;
    }
}
public class treeset5{
    public static void main(String args[]){
       
        animal a = new animal("Vishwanath");
        animal b = new animal("Aditya");
        animal c= new animal("Nischal");

        Set<animal> treeSet = new TreeSet<animal>(new Comparator<animal>(){
            public int compare(animal a, animal b){
                return a.name.compareTo(b.name);
            }
        });
        treeSet.add(a);
        treeSet.add(b);
        treeSet.add(c);
    
        System.out.println(treeSet);
        Iterator itr = treeSet.iterator();
        
        // while(itr.hasNext())
        // System.out.println(itr.next());

    }

}