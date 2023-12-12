package abstract2;

public class HRDept extends ITDepet2 {

	public static void main(String[] args) {
		HRDept obj1 = new HRDept();
		obj1.salary();
		obj1.task();
		obj1.goodies();
	}

	@Override
	public void salary() {
		int sal1 = 10000000;
		int sal2 = 300000000;
		System.out.println("sal1"+sal1+" Sal2"+sal2);
	}

}
