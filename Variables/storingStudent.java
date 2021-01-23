// to show the working of local variable 
class storingStudent
{	
	int regNumber;
	String name;
	
	void display(){
		System.out.println("Reg: " + regNumber);
		System.out.println("Name: " + name);
	}

	public static void main(String args[]){
		storingStudent obj = new storingStudent();
		storingStudent obj1 = new storingStudent();
		
		obj.regNumber = 11912424;
		obj.name = "Vishwanath";
		obj.display();

		obj1.regNumber = 11912502;
		obj1.name = "Aditya";
		obj1.display();
	}
}