package practice;

interface Sayable{
	void say();
}

interface Sayable1{
	int mark();
}

public class MR {
	
	 static void saysomething() {
		System.out.println("hello world");
	}
	public static int saymarks() {
		return 100;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s = MR::saysomething;
		s.say();
		Sayable1 s1 = MR::saymarks;
		System.out.println(s1.mark());
		
		/*Sayable s11 = () -> System.out.println("hello world");
		s11.say();*/ //this is using lambda function

	}

}
