public class Question8{

    enum Faculty
    {
        rk(16920), st, hk(12427);
        // here st will throw an error because it is not having paramiters
        int id;
        Faculty(){id = 10000;} 
        // : due to this it will not show any error because it is intializing starting value of id to 10000 to all you can say

        Faculty(int x){
            id = x;
        }
    }
    public static void main(String args[]){
        Faculty [] f = Faculty.values();
        System.out.println(f[1].id);

    }
}
