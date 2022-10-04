package com;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

interface testforeach{
	void print(List test);
}



public class Asylumcheck {
	

	/*public String asycheck() {
		return a.get("B1");
		
	}*/
	
	
	public static void main(String[] args) {
		
		List<String> gamesList = new ArrayList<String>();
		
		gamesList.add("football");
		gamesList.add("Hockey");
		/*HashMap<String,String> a = new HashMap<String,String>();
		a.put("B1","unstable");
		a.put("B2","unstable");
		a.put("B3","unstable");
		a.put("B4","unstable");
		a.put("M1","unstable");
		a.put("M2","unstable");
		a.put("M3","unstable");
		a.put("M4","unstable");*/
		
	    gamesList.forEach(games -> System.out.println(games));
		testforeach tfe = games -> System.out.println(games);
}
}