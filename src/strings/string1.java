package strings;

public class string1 {

	public static void main(String[] args) {

		String name ="Hi I am Leelu";
		if(name.endsWith("Hi"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		String country = "I am learning";
		Boolean a = country.contains("am");
		System.out.println("Contains:"+a);
		
		//split
		String Description = "Yes this is-right and correct";
		String[] b=Description.split("-");
		for(int i=0;i<Description.length();i++)
			//System.out.println(b[i]);
			if(b[i].contains("right"))
			{
			String newS = b[i];
			System.out.println("COntains right:"+newS);
			String[] newS2 = newS.split(" ");
			for(int j=0;j<newS2.length;j++)
			{
			System.out.println("Splitted:"+newS2[j]);
					
			if(newS2[j].equals("right"))
			{
			String fetch = newS2[j];
			System.out.println("fetched string:"+fetch);
			break;
			}
			}
			}
//charAt
		String character = "gujjikgtedgj";
		
		System.out.println(character.charAt(3));
		
	}

}
