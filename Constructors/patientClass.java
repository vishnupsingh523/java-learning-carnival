class patient{
    int age;
    String patient_name;
    String contact_number;

    patient(int a,String n, String c){
        age = a;
        patient_name = n;
        contact_number = c;
    }

    void showData(){
        System.out.println("\nName: "+patient_name+"\nAge: "+age+"Contact Number: "+contact_number);
    }
}

public class patientClass{
    public static void main(String args[]){
        
        patient p1 = new patient(18,"Vishwanath","8928340197");
        
        patient p2 = new patient(20,"Aditya Singh", "22343252511");

        p1.showData();
        p2.showData();
    }
}
