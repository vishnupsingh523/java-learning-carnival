class student{
    int id;
    String name;
}

// main class is here
class obj1{

    public static void main(String args[]){

        student s1 = new student();
        s1.id = 11912424;
        s1.name = "Vishwanath";
        System.out.println("ID: "+s1.id+"\nNAME: "+s1.name);
    }
}