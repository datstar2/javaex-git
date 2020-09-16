package practice;

public class Goods {
	private String name;
	private int price;

	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	
	public void showinfo() {
		System.out.printf("상품이름 : %s %n", name);
		System.out.printf("상품가격 : %d %n", price);
	}
	
	public Goods() {
	}
	
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

}
