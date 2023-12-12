package methods;

public class BaseClass {

	public static void main(String[] args) {

		
		
	}
	//Inheritance Base class with Overloading concept - add method with 2 different signature 
	public void add()
	{
		int a=10;
		int b = 20;
		int c = a+b;
		System.out.println("Addtion from BaseClass method of empty signature:"+c);
	}

	public void add(int a)
	{
		//
		a=5;
		int b = 20;
		int c = a+b;
		System.out.println("Addtion from BaseClass method with 1 signature:"+c);
	}
}
