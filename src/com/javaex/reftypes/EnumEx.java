package com.javaex.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		enumEx1();
		enumEx2();

	}
	
	public static void enumEx2() {
		String day = "FRIDAY";
		Week dayEnum = Week.valueOf(day); // String -> Week 변환
		String act;
		
		switch (dayEnum) {
		case SUNDAY:
			act = "휴식";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			act = "열공 후 불금";
			break;
		case SATURDAY:
			act = "방전";
			break;
		default:
			act = "?";
		}
		System.out.println(day + "예는" + act);
	}
	
	
	
	public static void enumEx1() {
		//열거 상수 활용하기
		Week today = Week.TUESDAY;
		System.out.printf("Today is %s(%d)%n", 
				today.name(),
				today.ordinal());
	
		// 문자열 -> 열거 객체로 변환
		String day = "FRIDAY";
		Week obj = Week.valueOf(day);
	
	}

}
