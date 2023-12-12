package methods;

public class methodOverridingChild extends methodOverridingParent{

	public static void main(String[] args) {
		//child class object referring to child class -> will call child class
		methodOverridingChild ob = new methodOverridingChild();
		ob.display();
		
		
		//in case of overloadng, it has both parent and child class methods of different signature. 
		ob.add(20.6, 20.9);
		ob.add(2, 5);
		
		//child class object referring to parent class -> will call only child class, since override concept.
		methodOverridingParent ob1 = new methodOverridingChild();
		ob1.display();//from child class in case of overriding
		ob1.add(10, 10);//from parent class in case of overloading 
		//Parent clas object referring to child class -> will call parent class method
		methodOverridingParent ob2 = new methodOverridingParent();
		ob2.display();
		
	}
	
public void display()
{
	System.out.println("Display from child class");
}

public void display(int a)
{
	System.out.println("Display from child class with diff signature");
}

public static double add(double a, double b)
{
	double c = a+b;
	System.out.println("Add from child class:"+c);
	return c;
}
}
