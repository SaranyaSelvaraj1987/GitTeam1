package methods;

public class accessnonStaticInstanceVariable {
	//Instance Variable 
	int a;

	public static void main(String[] args) {
		//Access non-static instance variable inside static method
		//System.out.println("Value"+a);  ----> Throws error since non-static cannot access without creating object
		//Creating object to access non-static instance variable
		accessnonStaticInstanceVariable o1 = new accessnonStaticInstanceVariable();
		System.out.println(o1.a);
		o1.disp();
		
	}
	//Same Instance variable can be accessed within method with out creating object
	public void disp()
	{
		System.out.println("Disp"+a);
	}

}
