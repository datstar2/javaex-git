package com.javaex.basic;

public class OperatorEx {

	public static void main(String[] args) {
		arithOperEx();
	}
	
	public static void arithOperEx() {
		// 나눗셈과 나머지
		
		int a = 7;
		int b = 3;
		
		System.out.println("7 /  3?" + (a /b ));
		// int / int -> int
		System.out.println("7 / 3의 몫 -> " + ( a / b ));
		System.out.println("7 / 3의 나머지 ->" + (a % b ));
		
		// 소숫점까지 구하고자 할 때 -> 캐스팅 필요
		System.out.println(" 7 / 3 -> " + ((float)a / (float)b));
		System.out.println(" 7 / 3 -> " + ((float)a / b)); // b는 암묵적 캐스팅
		
		// 증감 연산자 : ++, --
		
		a = 10;
		b = 10;
		
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
		
	}

}
