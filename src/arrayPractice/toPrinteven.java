package arrayPractice;

public class toPrinteven {

	public static void main(String[] args) {

		int[] a = {1,2,4,6,8,9,10,15,16,18,20};
		int[] b = new int[10];
		System.out.println("Multiple of 2:");
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
			System.out.println(+a[i]);
		
		}
	}

}
