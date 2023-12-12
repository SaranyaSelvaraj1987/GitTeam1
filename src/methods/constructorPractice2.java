package methods;

public class constructorPractice2 {

	//Instance variable defined
	String name;
	int age;
	double weight;
	int x=5;
	
	//Constructor defined and used Instance variables
	public constructorPractice2(String name, int age, double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public static void main(String[] args) {
		constructorPractice2 obj1 = new constructorPractice2("Saran",35,46.5);
		obj1.m1();
		constructorPractice2 obj2 = new constructorPractice2("Leelu",40,65);
		obj2.m1();
		
	}

	//method defined for usage of contructor in different ways
	public void m1()
	{
		int x = 10;
		System.out.println("Name"+name+","+"Age"+age+"Weight"+weight);
	}
}
