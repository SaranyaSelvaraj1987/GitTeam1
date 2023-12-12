package superKeyword;

public class withConstructorChild extends withConstructorParent {

	public static void main(String[] args) {
		//Constructor executes immedietely when the object creates. 
		withConstructorChild o1 = new withConstructorChild("aintvalue");

	}

	public withConstructorChild()
	{
		System.out.println("Child");
	}
	
	//Additional contrcuctor with some parameter to differentiate 
	public withConstructorChild(String aint)
	{
		super(aint);
		System.out.println("Child:"+aint);
	}
}
