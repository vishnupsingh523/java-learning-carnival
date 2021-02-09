// to show the working of replace() method
class replace
{
public static void main(String[] args)
{
    String s= "Welcome to java";
    String t= s.replace('o','x');
    System.out.println(t);
    String r= s.replace("to","the");
    System.out.println(r);
    System.out.println("My name is xyz".replace("My","your"));

    // compare to ignore case   
    String s1 = "TESTING";
    String s2 = "testing";
    System.out.print(s1.compareToIgnoreCase(s2));

    // lastIndexOf();
    String str = "This is the test phase";
    System.out.println(str.lastIndexOf('t', 11));

    str = "Best among the Best";
    System.out.println(str.indexOf("Best"));
    
}
}