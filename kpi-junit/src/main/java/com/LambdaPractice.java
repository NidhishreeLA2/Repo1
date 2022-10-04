package com;

interface MathOperation {
	int operation(int a, int b);

}

public class LambdaPractice {
	
	private int operate(int a, int b, MathOperation mathoperation) {
		return mathoperation.operation(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaPractice tester = new LambdaPractice();
        MathOperation addition = (int a,int b) -> a+b;
		
		MathOperation subtraction = (a,b) -> a-b;
		
		MathOperation multiplication = (a,b) -> {return a*b;};
		
		MathOperation division = (int a,int b) -> a/b;
		
		MathOperation modulo = (a,b) -> a%b;
		
		System.out.println(tester.operate(8, 2, addition));
		System.out.println(tester.operate(8, 2, subtraction));
		System.out.println(tester.operate(8, 2, multiplication));
		System.out.println(tester.operate(8, 2, division));
		System.out.println(tester.operate(8, 2, modulo));
		
	}

	}


