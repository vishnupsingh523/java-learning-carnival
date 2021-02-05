class student{
    int id;
    String name;

    void instertRecord(int r, String n){
        id = r;
        name = n;
    }
    void displayInformation(){
        System.out.println("ID: "+id+"\nNAME: "+name);
    }
}

// main class is here
class obj2{

    public static void main(String args[]){

        student s1 = new student();
        s1.instertRecord(11912424,"Vishwanath");
        // System.out.println("ID: "+s1.id+"\nNAME: "+s1.name);
    
        student s2 = new student();
        s2.instertRecord(11910525,"Aditya Singh");
        // System.out.println("ID: "+s2.id+"\nNAME: "+s2.name);

        s1.displayInformation();
        s2.displayInformation();
    }
}