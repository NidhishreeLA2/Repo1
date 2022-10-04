package com;

import java.util.ArrayList;
import java.util.List;

interface testforeach1{
	void print(List test);
}

public class gamess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> gamesList = new ArrayList<String>();
		
		gamesList.add("football");
		gamesList.add("Hockey");
		gamesList.add("foosball");
		gamesList.add("tennis");
		gamesList.add("basketball");
		gamesList.add("polo");
		

		
	    gamesList.forEach(games -> System.out.println(games));
		//testforeach1 tfe = games -> System.out.println(games);
		//tfe.print(gamesList);

	}

}
