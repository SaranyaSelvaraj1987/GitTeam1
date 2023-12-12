package methods;

public class Childclass extends BaseClass {

	public static void main(String[] args) {
		
	Childclass obj1 = new Childclass();
	obj1.add();
	obj1.add(20);
	double abc = obj1.multiply(20.6, 10);
	System.out.println("Returned value from multiply:"+abc);
	obj1.multiply(10, 10);

	}

	//child class methods with overloading concept and with static methods
	public static int multiply(int d, int e)
	{
		//checking whether local variable is taking privilage
		//d = 3;
		//e=6;
		int f = d*e;
		System.out.println("Returning value from multiply method as f to main"+f);
		return f;
		
	}
	public static double multiply(double d, int e)
	{
	double x = d*e;
	return x;	
	}
}
