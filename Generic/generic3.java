public class generic3 {

    static <T> void showData(T var){
        System.out.println(var +" "+ var.getClass());
    }
    public static void main(String args[]){
        
        showData("String is here");
    }

}