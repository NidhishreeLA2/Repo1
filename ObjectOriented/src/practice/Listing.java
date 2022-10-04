package practice;
import java.util.ArrayList;
import java.util.List;

public class Listing {
	
	
	public static void main(String[] args) {
	Listing l = new Listing();
	Listing l1 = new Listing();
	ArrayList<Listing> lt = new ArrayList<Listing>();
	lt.add(l);
	lt.add(l1);
	
	lt.forEach(items -> System.out.println(items));
	/*IntA i = items -> System.out.println(items);
	i.print(lt);*/
	
	

}
}