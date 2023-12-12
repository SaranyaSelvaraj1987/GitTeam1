package arrayPractice;

import java.util.ArrayList;

public class arraylist1 {

	public static void main(String[] args) {
	
		//Arraylist ->Dynamically increase the size of an array
	//add, remove and get method to extract value from particular index
		//Declaration of ArrayList
		ArrayList<String> a = new ArrayList<String>();
		a.add("Saranya");
		a.add("Leelu");
		a.add("BB");
		a.add("Bavthik");
		a.add("buffer");
		//Remove buffer
		a.remove(4);
		/*for(int i=0;i<a.size();i++)
			
		System.out.println(a.get(i));
	*/
		//Enhanced for loop for ArrayList
		for(String val:a)
		{
			if(a.contains("Bavith"))
			{
		System.out.println(val);
		}
			else
			{
				System.out.println("No");
				break;
			}
		}
		
	}
}
