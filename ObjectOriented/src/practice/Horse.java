package practice;

public class Horse {

	String color1() {
		return "brown";
	}
	
	public static void main(String args[]) {
		Animal1 n = new Horse()::color1;
		System.out.println(n.color());
	}
}
