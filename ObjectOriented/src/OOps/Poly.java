package OOps;



class Parent{
	void Print()
	{
		System.out.println("Parent class");
	}
}

class subclass1 extends Parent{
	void Print() {
		System.out.println("Subclass1");
	}
}

class subclass2 extends Parent{
	void Print() {
		System.out.println("subclass2");
	}
}

public class Poly {
	public static void main(String[] args) {
		Parent a;
		a = new subclass2();
		a.Print();
		a = new subclass1();
		a.Print();
				
	}

}
