package methods;

public class returnValues {

	public static void main(String[] args) {
		returnValues obj1 = new returnValues();
		double d = obj1.add(20.5, 10);
		System.out.println(+d);
		
	}
	
	public double add(double a, int b)
	{
		double c = a+b;
		return c;
	}

}
