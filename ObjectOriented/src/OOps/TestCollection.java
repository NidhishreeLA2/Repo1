package OOps;
import java.util.ArrayList;
public class TestCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList();
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		list3.add("b");
		list3.add("c");
		list3.add("c");
		list3.add("c");
		list3.add("d");
		list3.add("d");
		list3.add("d");
		list3.add("d");
		list.add("b");
		list.add("n");
		//list2.add(1);
		//System.out.println(list.get(0)); //gives the item at index position 0
		//System.out.println(list2);
		for(int i =0;i < list.size(); i++) {
			if (list.get(i)=="b")
			System.out.println(i);
		}
		// TODO Auto-generated method stub
        for (int j = 0; j<10;j++) {
        	list2.add(j);
        }
        System.out.println(list3);
	}
}    
