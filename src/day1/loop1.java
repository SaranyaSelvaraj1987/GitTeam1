package day1;

public class loop1 {

	public static void main(String[] args) {
		System.out.println("I value is: ");
		for(int i=1;i<10;i++)
		{
			System.out.print(+i);
		}
		System.out.println("");
		for(int j=10;j>0;j--)
		{
			System.out.print(+j);
		}
		System.out.println("");
		//even number printing
		for(int k=2;k<22;k=k+2)
		{
			System.out.print(+k);
		}
		System.out.println("");
		
		//While loop
		int a=4;
		while(a<10)
		{
			System.out.println("a is:"+a);
			a++;
		}
		
		//do While logic will execute atleast once
		int b=3;
		do 
		{
			System.out.println("value"+b);	
			b++;
		}while(b<20);
	}

}
