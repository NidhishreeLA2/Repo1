package practice;

public class Dog extends Animal implements Animal1,Animal2{
    
	
	Dog(){
		System.out.println("I am dog");
	}
	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "bow bow";
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public String breed() {
		// TODO Auto-generated method stub
		return "bull dog";
	}

	@Override
	public String activeness() {
		// TODO Auto-generated method stub
		return "active";
	}
	
	public static void main(String args[]) {
		Dog d = new Dog();
		d.breed();
	}

}
