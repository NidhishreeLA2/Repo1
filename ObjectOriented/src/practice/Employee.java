package practice;

public class Employee {
	
	int Salary;
	int id;
	

	Employee(){
		
	}
	
	Employee(int a,int b){
		this.Salary = a;
		this.id = b;
		System.out.println(Salary);
		
	}
	
	Employee(int id,String name, String address){
		
	}
	public static void main(String args[]) {
		Employee e = new Employee(12345,89);
		
	}
}
