package com.javaex.oop.staticmember;

public class StaticexApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		// static 영역은 인스턴스화 하지 않아도 접근 가능
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조카운트" + StaticEx.refCount);
		
		s1 = null; // 참조 해제
		System.out.println("s1 참조 해제");
		System.out.println("참조카운트:"+StaticEx.refCount);
		// 가비지 컬렉터가 수집해준다
		System.gc(); // 가비지 컬렉터 강제 수행
		try {
			Thread.sleep(3000); // 3초대기
			System.out.println("참조카운트:" + StaticEx.refCount);
		} catch (Exception e) {
			
			
		}
	}

}
