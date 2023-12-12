package methods;
//Non - Static Method
public class eligibilityCheck {

	public static void main(String[] args) {
//Creating object for class-age and accessing methods and global variables inside other class- Non Static method
		age a1 = new age();
			a1.senior();
			a1.junior();
			System.out.println("Global"+a1.PersonGlobalage);
	}

}
