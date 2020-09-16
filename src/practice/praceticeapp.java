package practice;

import java.util.Scanner;

public class praceticeapp {

	public static void main(String[] args) {
//		Problem01();
//		Problem02();
//		Problem03();
//		Problem04();
//		Problem05();
//		Problem06();
//		Problem07();
		Problem08();
		
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
	
	public static void Problem05 () {
		System.out.println("숫자를 입력하세요");
		int num[] = new int [5];
		int max = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0 ; i < num.length ; i++) {
			System.out.print("숫자: ");
			num[i] = scanner.nextInt();
		}
		
		for (int j = 0 ; j < num.length-1 ; j++) {
			max = (num[j] > num[j+1])? num[j] : num[j+1];
		}
		
		System.out.printf("최대값은 %d입니다.", max);
	}
	
	public static void Problem06 () {
		int num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			for(int i = 0; i <= num ; i++) {
				sum += i % 2 == 0? i : 0;
			}
		}
		else {
			for(int i = 0; i <= num ; i++) {
				sum += i % 2 == 0? 0 : i;
			}
		}
		
		System.out.printf("결과값: %d", sum);
	}
	
	public static void Problem07 () {
		String gameExit = "y";
		while(gameExit != "n") {
			int inPPut;
			double dvalue = Math.random();
			int keyNum = (int)(dvalue*100+1);
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.print(">>");
				inPPut = scanner.nextInt();
					if ( inPPut < keyNum) {
						System.out.println("더 높게");
					}
					else if ( inPPut > keyNum) {
						System.out.println("더 낮게");
					}
					else {
						break;
					}
			}
			System.out.println("맞았습니다.");
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			gameExit = scanner.nextLine();
			System.out.print(gameExit);
			}
	}
	
	public static void Problem08 () {
		int balance = 0, choicer = 0;
		while(choicer != 4) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.print("선택>");
			Scanner scanner = new Scanner(System.in);
			choicer = scanner.nextInt();
			switch(choicer) {
			case 1:
				System.out.print("입금액>");
				int deposit = scanner.nextInt();
				balance = balance + deposit;
				continue;
			case 2:
				System.out.print("출금액>");
				int withdraw = scanner.nextInt();
				balance = balance - withdraw;
				continue;
			case 3:
				System.out.printf("잔고액>%d %n", balance);
				continue;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}
	}
}
	

		

