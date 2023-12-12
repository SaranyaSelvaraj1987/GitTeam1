package methods;

public class methodOverridingParent {
	
	public void display()
	{
		System.out.println("Parent class method");
	}
	public static int add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition from Parent clas:"+c);
		return c;
	}
}


