// to show the working of variable 
class classVariable
{	
	static int count; // class variable
	int regNumber;
	String name;
	
	void display(){
		count++;
		System.out.println("\nReg: " + regNumber);
		System.out.println("Name: " + name);
	}

	public static void main(String args[]){
		classVariable obj = new classVariable();
		classVariable obj1 = new classVariable();
		
		obj.regNumber = 11912424;
		obj.name = "Vishwanath";
		obj.display();

		obj1.regNumber = 11912502;
		obj1.name = "Aditya";
		obj1.display();

		System.out.println("\nTotal number of Students : " + count);
	}
}