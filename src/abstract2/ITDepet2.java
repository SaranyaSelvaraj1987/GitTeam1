package abstract2;

public abstract class ITDepet2 implements Employee {

	@Override
	public  abstract void salary();

	@Override
	public void goodies() {
		System.out.println("Goodies are given from ITDet");
	}

	@Override
	public void task() {
		System.out.println("Tasks are assigned from ITDet");
		
	}

}
