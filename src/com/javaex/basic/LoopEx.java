package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		whileEx();
		dowhileEx();
		forEx();
		continueEx();
		breakEx();
		randomEx();
	}
	
	public static void randomEx() {
		System.out.println(Math.random());  //  0.0이상 1.0미만의 실수값
		//  정수 난수의 공식 : (int)Math.random() * 최대값 + 최솟값
		
		// 1 ~ 45 사이의 임의의 숫자를 6개 추출해 봅시다.
		for (int i = 1; i <= 6 ; i ++) {
			System.out.print((int)(Math.random()) + 1);
			System.out.print( " ");
		}
		System.out.println();
		
		// 위의 코든 ㄴ중복 발생 가능
		
		// 중복을 허용하지 않은 6개의 난수를 뽑아보기((연습문제))
	}
	
	public static void breakEx() {
		// 루프 도중, break 문을 만나면
		// 해당 루프문을 종료하고 탈출
		
		// 1부터 증가시키면서 6과 14로 모두 나누어 떨어지는 수를 구하자
		int num = 1;
		
		while(true) {  //무한루프
			if (num % 6 == 0 && num % 14 == 0) break;
			num ++;
		}
		
		System.out.println(num);
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
		
		scanner.close();
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
