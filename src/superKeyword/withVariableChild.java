package superKeyword;

public class withVariableChild extends withVariableBase {
	 int a =400;

	public static void main(String[] args) {
		
		withVariableChild ob12 = new withVariableChild();
		ob12.call2();
	}
	public void call2()
	{
		System.out.println("I am in Child class:"+super.a);
	}

}
