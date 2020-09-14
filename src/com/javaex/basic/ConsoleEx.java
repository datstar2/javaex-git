package com.javaex.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
			consoleInputEx();
	}
	
	public static void consoleInputEx( ) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름은? ");
		String name = scanner.next(); //문자열 입력
		int age = scanner.nextInt();//정수 입력
		
		System.out.println("이름은" + name + ", 나이는" + age);
		
		scanner.close();
	}
	
	public static void consoleOutputEx() {
		// System.out : 표준 출력
		// System.err : 표준 에러
		//		print : 개행 안함
		//		println : 개행함
		//		printf : 포매팅 출력 -> String에서 정리
		
		System.out.print("Hello "); // 개행 안함
		System.out.println("Java"); // 개행 함
		
		// 이스케이프 문자
		System.out.println("Hello\nJava"); // \n 개행문자
		System.out.println("Hello\tJava");// \t 탭문자
		String message = "Hello, \"Java\"";  // \"
		System.out.println(message);
		
		
		// 윈도우 경우, 경로 구분자가 \
		
		String filename = "C:\\myfolder\\myfile.txt";
		System.out.println(filename);
	}

}