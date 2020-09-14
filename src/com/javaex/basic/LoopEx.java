package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		whileEx();
		dowhileEx();
		forEx();
		continueEx();
	}
	
	
	
		
	public static void continueEx() {
		// 루프 도중, continue를 만나면
		// 남은 코드를 실행하지 않고 다음번 루프를 수행
		
		// 1부터 100까지 루프를 돌면서 2의 배수, 3의 배수는 출력하지 않고 다음번 루프 수행
		for (int i = 1; 1 <= 100; i++) {
			System.out.print(i + " " );
		}
	}
	
	public static void guguFor() { //연습문제
		// 2단부터 9단까지의 구구표를 for문을 이요하여 출력
		
	}
	
	public static void starsFor() {
		// 아래와 같이 루프를 돌며 출력 for문 이용
		/*
		 
		 * 
		 ** 
		 ***
		 ****
		 *****
		 
		 */
	}
	
	
	
	public static void guguWhile() { //연습문제
		// 2단부터 9단까지의 구구표를 while문을 이요하여 출력
		
	}
	
	public static void starsWhile() {
		// 아래와 같이 루프를 돌며 출력 Whiler문 이용
		/*
		 
		 * 
		 ** 
		 ***
		 ****
		 *****
		 
		 */
	}
	
	
	public static void forEx() {
		// 단을 입력 받아서 해당 단의 구구표 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		
		int dan = scanner.nextInt();
		
		for (int num = 1; num <= 9; num++) {
			System.out.println(dan + " * " + num + " = " + dan * num);
		}
	}
	
	public static void dowhileEx() {
		
		int total = 0, value = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요[0이면 quit]:");
		
		
		do {
			value = scanner.nextInt();
			total += value;
		} while(value != 0);
		
		System.out.println("합계:" + total);
		scanner.close();
		
	}
	
	public static void whileEx() {
		// 단을 입력 받아서 해당 단의 구구표 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		
		int dan = scanner.nextInt();
		
		// 제어변수 
		int num = 1;
		
		while(num <= 9) {   // 9이하일 때 반복
			System.out.println(dan + " * " + num + " = " + dan * num);
			// while 문은 종료 조건을 개발자가 맞춰주어야 한다
			num++;
		}
		
		scanner.close();
	}

}
