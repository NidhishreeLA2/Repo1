package com;
@FunctionalInterface
interface check2{
	void check(String a);
}

public class Asylumcheck2 {
	static String s1 = "unstable";
	static String s2 = "unstable";
	static String s3 = "unstable";
	static String s4 = "unstable";
	static String s5 = "unstable";
	static String s6 = "unstable";
	static String s7 = "unstable";
	static String s8 = "stable";
	public static void main(String[] args) {
	
	check2 condition = (String a) -> {if (a == "unstable")
		   System.out.println("stay in hospital");
		else 
			System.out.println("Recover and go home");

};
condition.check(s1);
  
}
}