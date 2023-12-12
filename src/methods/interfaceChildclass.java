package methods;

public class interfaceChildclass implements interfacePractice{

	public static void main(String[] args) {
		//1. Creating object of Child class and referenc of Child class--Valid
		interfaceChildclass ob22 = new interfaceChildclass();
		//2. Create reference of Base class and object of child class --Valid
		interfacePractice ob23 = new interfaceChildclass();
		//3. Create reference to Base class and object to Base class - invalid 
		//interfaceChildclass ob23 = new interfacePractice();
		//4. Create reference to Child class and Base class object 
		//interfaceChildclass ob45 =new interfacePractice();
		
		
	}

	public void mult()
	{
		System.out.println("interface mult");
	}
	@Override
	public void add() {
	System.out.println("interface add");	
	}

	@Override
	public void sub() {
		System.out.println("interface sub");
		
	}

}
