package com.javaex.api.objectclass.v1;

//	Object 클래스
public class Point {
	//	필드
	protected int x;	//	자식 클래스에 접근 권한 허용
	protected int y;

	//	생성자
	public Point(int x, int y) {
		System.out.println("Point 의 생성자");
		
		this.x = x;
		this.y = y;
	}
	
	//	Getter / Setter
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//	메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
	
	public void draw(boolean bDraw) {
		//	메서드 오버로딩
		String message = String.format("점[x=%d, y=%d]을", x, y);
		message += bDraw ? "그렸습니다.": "지웠습니다";
		
		System.out.println(message);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}









