package day1;

public class dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a1;//Declartion
		a1=true;//Intitalization
		boolean a2=false;//declaration and initialization at same line
		
		System.out.println("Boolean a1 is "+a1);
		System.out.println("Boolean a2 is "+a2);
		
		char b1='M';
		System.out.println("char b1 is "+b1);
		//char also accepts numbers as value and print its unicode value 
		char b2=65;
		System.out.println("char b2's unicode value is "+b2);
		
		int c1 = 12;
		System.out.println("Integer c1's value is "+c1);
		
		long d1 = 12000000;
		System.out.println("long d1's value is "+d1);
		
		float e1 = 12.34f;
		System.out.println("float e1's value is "+e1);
		double e2 = 12.45;
		System.out.println("double e2's value is "+e2);
		float e3 = (float) 11.38;//converting float value forcefully to double here.
		System.out.println("converted double but declared as float e3's value is "+e3);
		int e4 = (int)22.56;//converting double value to integer and value stores as 22 only.
		System.out.println("int e4's value is "+e4);
		
		
		}

}
