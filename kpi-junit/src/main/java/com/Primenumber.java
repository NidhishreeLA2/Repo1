package com;

public class Primenumber {
	public int check(int a) {
		
		int flag = 0;
		if (a==0|a==1) {
			System.out.println("not a prime number");
		}
		else {
			for (int i = 2; i< a;i++) {
				if(a % i == 0) {
					
				flag = 1;
				break;
					
					
				}
			
		}
		
		}
			
		
	
		if (flag == 1) {
			System.out.println("not Prime number");
			return 0;
			
		}
		else {
			System.out.println("Prime number");
			return 1;
		}
		
	}
}


