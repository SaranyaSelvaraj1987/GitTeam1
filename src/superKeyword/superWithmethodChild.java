package superKeyword;

public class superWithmethodChild extends superWithmethodBase  {

	public static void main(String[] args) {
		superWithmethodChild j1 = new superWithmethodChild();
		//Calls Child class method without super keyword
		j1.method2();
		
		
	}
	public void method1()
	{
		System.out.println("I am Child class method");
	}
	public void method2()
	{
	super.method1();	
	}
	
}
