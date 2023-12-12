package day1;

public class condition {

	public static void main(String[] args) {
		String browser = "chrome";
		if(browser.equals("chrome"))
		{
			System.out.println("Execute");
		}
		//EqualIgnoreCase
		String browser2="firefox";
		if(browser2.equalsIgnoreCase("FireFox"))
				{
			System.out.println("Execute2");
				}
		
		//Nested if
		String newItem="Code";
		if(newItem.equalsIgnoreCase("Vanhusen"))
		{
			System.out.println("Vanhusen taken");
		}
		else if(newItem.equalsIgnoreCase("Nyke"))
		{
			System.out.println("Nyke Selected");
		}
		else
		{
			System.out.println("Default brand");
		}
		
		//Switch statement
		int m=3;
		switch(m)
		{
		case 1:
			System.out.println("First Case");
		break;
		case 2:
			System.out.println("Second Case");
		break;
		case 3:
			System.out.println("Third Case");
		break;
		}
	}

}
