package com.javaex.oop.goodsv2;

public class GoodsApp {

	public static void main(String[] args) {
		// 사용(참조)
		Goods notebook = new Goods();
		// 필드에 우회 접근
		notebook.setName("LG Gram");
		notebook.setPrice(1600000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone SE");
		smartphone.setPrice(600000);
		
		
		// 출력
		notebook.showInfo();
		smartphone.showInfo();
	}
}
