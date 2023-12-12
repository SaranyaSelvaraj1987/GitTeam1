package methods;

public class constructorSample {

	public static void main(String[] args) {
		constructorSample ob = new constructorSample(10,11);
		
	}
	//Constructor
	public constructorSample()
	{
		System.out.println("Hi Constructor");
	}
	//Constructor overloading with different signature
	//type of signature
	public constructorSample(int a, int b)
	{
	int c = a+b;
	System.out.println("C balue is:"+c);
	}
	//number of signature
	public constructorSample(double g, int b)
	{
		double f = g+b;
		System.out.println("f balue is:"+f);	
	}
	//order of signature
	public constructorSample(int b,double g)
	{
		double i = b+g;
		System.out.println("i balue is:"+i);		
	}
}
