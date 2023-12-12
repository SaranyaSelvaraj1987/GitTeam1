package methods;

public class constructorPractice {

	//Variables declared to be used multiple times with different values with the help of constructor
	int age1;
	double weight;
	
	public constructorPractice(int age1, double weight)
	{
		this.age1=age1;
		this.weight=weight;
	}
	
	public static void main(String[] args) {
		
		constructorPractice obj1 = new constructorPractice(25, 35.5);
		obj1.display();
		constructorPractice obj2 = new constructorPractice(35, 40.6);
		obj2.display();
	
	}

	public void display()
	{
			System.out.println("Age from display"+age1);
			System.out.println("Weight from display"+weight);
	}

}
