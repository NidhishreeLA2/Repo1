package practice;




public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		form1 f = new form1();
		System.out.println(f.area(7));
		



	}
}
class form1 {
	double area(int a){
		return (3.14*a*a);
	}
	double perimeter(int a) {
		return (2*3.14*a);
	}
	form1(){
		System.out.println("print");
	}}
