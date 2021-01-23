// to show the working of local variable 
class instanceVariable
{	
	int regNumber; // this is the instance variable

	public static void main(String args[]){
		instanceVariable obj = new instanceVariable();
		instanceVariable obj1 = new instanceVariable();
		
		System.out.println("Before update: " + obj.regNumber);
		obj.regNumber = 11912424;
		System.out.println("After update: " + obj.regNumber);

		System.out.println("Before update: " + obj1.regNumber);
		obj1.regNumber = 11912502;
		System.out.println("After update: " + obj1.regNumber);
	}
}