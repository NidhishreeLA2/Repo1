package OOps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
public class TestCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		list3.add("b");
		list3.add("c");
		list3.add("c");
		list3.add("c");
		//System.out.println(list3);
		
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("b");
		set.add("c");
		set.add("c");
		set.add("c");
		System.out.println(set);
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		hm.put("b", 4);
		
		System.out.println(hm);
		System.out.println(hm.get("a"));

	}

}
