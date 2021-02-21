public class equals
{
    public static void main(String[] args) {
        Integer i = new Integer("10");
        Float f = new Float("10.1");
        System.out.println(i.equals(f));
        System.out.println(i.equals(i));
    }
}