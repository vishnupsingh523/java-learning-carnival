public class Question9{

    enum Faculty
    {
        // int id;
        // String name;
        // with the id and name before enum variable it was giving error after that it was not giving any error;
        rk, st, hk;
        int id; String name;
    }
    public static void main(String args[]){
        Faculty [] f = Faculty.values();
        System.out.println(f[1]);

        // compilation error
    }
}
