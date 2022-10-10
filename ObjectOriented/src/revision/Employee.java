package revision;

public class Employee implements Salary,Leaves{

	@Override
	public int casualleave() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int Sickleave() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int Earnedleave() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int Salaryamount() {
		// TODO Auto-generated method stub
		return 10000;
	}
	
	public static void main(String args[]) {
		Employee e = new Employee();
		System.out.println(e.Earnedleave());
		System.out.println(e.Salaryamount());
		
	}

}
