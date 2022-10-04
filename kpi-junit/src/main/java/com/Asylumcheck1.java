package com;


public class Asylumcheck1 {
	static String s1 = "unstable";
	static String s2 = "unstable";
	static String s3 = "unstable";
	static String s4 = "unstable";
	static String m1 = "unstable";
	static String m2 = "unstable";
	static String m3 = "unstable";
	static String m4 = "stable";
	
	public void check(String a) {
		if (a == "unstable")
		   System.out.println("stay in hospital");
		else 
			System.out.println("Recover and go home");
	}
	public static void main(String[] args) {
		Asylumcheck1 a1 = new Asylumcheck1();
		a1.check(m4);

}
}