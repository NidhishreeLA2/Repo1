package practice;

public class Cat extends Animal implements Animal1,Animal2 {
	
	Cat(){
		System.out.println("I am cat");
	}

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "meow meow";
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "white";
	}

	@Override
	public String breed() {
		// TODO Auto-generated method stub
		return "persian";
	}

	@Override
	public String activeness() {
		// TODO Auto-generated method stub
		return "lazy";
	}
	
	public static void main(String args[]) {
		Cat c = new Cat();
		c.color();
		c.legs();
	}

}
