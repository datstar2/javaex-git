package practice;

import java.util.Scanner;

public class praceticeapp {

	public static void main(String[] args) {
//		Problem01();
//		Problem02();
//		Problem03();
		Problem04();
	}
	
	public static void Problem01() {
		for (int i = 1; i <= 100; i++) {
			if( i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void Problem02 () {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num ; i++ ) {
			for(int j = 1; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
				}
				else
					System.out.print(i);
			}
		}
		
	}
	
	public static void Problem03 () {
		for (int i = 2 ; i <= 9 ; i ++) {
			for ( int j = 1; j <= 9; j ++) {
				if (j == 9) {
					System.out.println(i + "*" + j + "=" +(i*j));
				}
				else {
					System.out.print(i + "*" + j + "=" + (i*j)  + "\t" );
				}
		}
	}
	}
	
	public static void Problem04 () {
		for (int i = 1 ; i <= 10 ; i ++) {
			int j = i;
			while (j <= i + 9) {
				if (j == i + 9) {
					System.out.println(j);
				}
				else {
					System.out.print(j + "\t" );
				}
				j = j + 1;
			}
		}
	}
}


