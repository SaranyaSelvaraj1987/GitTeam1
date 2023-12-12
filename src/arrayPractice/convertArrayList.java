package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayList {

	public static void main(String[] args) {
		//Normal Array
		String[] name = {"AA,BB,CC,DD,EE"};
		//To convert into ArrayList
		List<String> a11 = Arrays.asList(name);
		//a11.remove(0);   ----> This is not possible, since converted arralylist list is of fixed size. 
		//To resolve this,need to convert or move converted Arraylost into new ArrayList and then now you can add or remove values.
		ArrayList<String> a11new = new ArrayList<>(a11);
		a11new.add("ZZ");
		for(String a11val:a11new)
		{
		System.out.println(a11val);	
		}
	}

}
