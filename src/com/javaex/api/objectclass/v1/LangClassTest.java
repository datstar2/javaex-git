package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		// Java의 최상위 클래스는 object -> 기본적으로 사용할 수 있다
		System.out.println("객체 정보:" + p.getClass());
		System.out.println("객체 식별 정수:" + p.hashCode()); // 기본적으로는 메모리 주소 값
		// 참조 타입의 == : hash code 의 비교
		System.out.println("toString:" + p.toString());
		System.out.println("p 객체:" + p.toString());
	}

}
