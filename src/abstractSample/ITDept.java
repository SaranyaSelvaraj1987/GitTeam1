package abstractSample;

public abstract class ITDept implements Employee{

	@Override
	//Cannot give from ITdept as it is part of HR, salary method is becoming abstract class
	//Also abstract class cannot create object
	public abstract void salary();

	@Override
	public void goodies() {
		System.out.println("Goodies are given from ITDet");
	}

	@Override
	public void task() {
		System.out.println("Tasks are assigned from ITDet");
		
	}
	public void try1()
	{
		System.out.println("Try for Git");
	}
	
	

}
