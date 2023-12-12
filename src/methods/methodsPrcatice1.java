package methods;

public class methodsPrcatice1 {
	int x=24;
	int y = 40;
	public static void main(String[] args) {
		
		methodsPrcatice1 obj1 = new methodsPrcatice1();
		//calling method
		obj1.add();
		//calling global variable method1
		int globalX = obj1.x;
		System.out.println("Global value of X" + globalX);
		//calling global variable method2
		System.out.println("Global value of Y" + obj1.y);
	}
	
	public void add()
	{
		int a=10;
		int b =20;
		int c=a+b;
		System.out.println("addition:"+c);
	}

}
