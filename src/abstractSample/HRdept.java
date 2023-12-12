package abstractSample;

public class HRdept extends ITDept {

	public static void main(String[] args) {
		ITDept ob = new HRdept();
		ob.salary();
		ob.task();
		ob.goodies();
		
	}

	@Override
	public void salary() {
		System.out.println("Salary is from HRDept");
	}

}
