package arrayPractice;

public class twoDarray {

	public static void main(String[] args) {
		
		String name[][]=new String[2][3];
		name[0][0]="AA";
		name[0][1]="BB";
		name[1][0]="CC";
		name[1][1]="DD";
		name[1][2]="EE";
		System.out.println("Random Value:"+name[1][2]);
		//To print all 2d values
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("2d Values:"+i+j+":"+name[i][j]);
			}
		}
	}

}
