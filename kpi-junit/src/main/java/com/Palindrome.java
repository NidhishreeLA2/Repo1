package com;

public class Palindrome {
	public int pal(int n) {
		int r,sum =0,temp;
		temp = n;
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n=n/10;
			
		}
		if (temp == sum) {
			System.out.println("pallindrome");
			return 1;}
		else {
			System.out.println("not a pallindrome");
			return 0;}
	}
	
	

}
