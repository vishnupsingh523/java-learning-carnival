// to show the working of local variable 
class method
{	
	int displayX(){
		int x = 100; // local variable of displayX()
		return x;
	}

	public static void main(String args[]){
		method obj = new method();
		
		System.out.println(obj.displayX());// displaying the value of x
	}
}