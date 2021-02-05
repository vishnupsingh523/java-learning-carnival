// Using methods intializing varaibles
class LenBre{
    int len, bre;

    void insertValues(int l, int b){
        len = l;
        bre = b;
    }
    void displayInformation(){
        System.out.println("Area of Rectangle: "+(len*bre)+" meter square.");
    }
}

// main class is here
class rectangle{

    public static void main(String args[]){

        LenBre r = new LenBre();
        r.insertValues(10,20);;

        r.displayInformation();
        // s2.displayInformation();
    }
}