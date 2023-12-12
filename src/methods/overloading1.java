package methods;

public class overloading1 {

	public static void main(String[] args) {
		overloading1 a11 = new overloading1();
		a11.employee("ABC");
		a11.employee(12.4, 10);
		a11.employee(4, 10.5);
		a11.employee(2, 6);
		a11.employee(88, 1234.7, "jkhhjk");
		
	}
	//Same method name with different signature
	
	public void employee(int a, int b)
	{
	int c = a+b;
	System.out.println("C value:"+c);
	}

	public void employee(double a, int b)
	{
	double c = a-b;
	System.out.println("C value:"+c);
	}
	
	public void employee(String g)
	{
	
	System.out.println("String value:"+g);
	}
	
	public void employee(int b, double a)
	{
	double c = a+b;
	System.out.println("C value:"+c);
	}
	
	public void employee(int b, double a, String d)
	{
	double c = a+b;
	System.out.println("C value:"+c);
	}
}
