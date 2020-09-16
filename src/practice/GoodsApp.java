package practice;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.setName("LG그램");
		notebook.setPrice(400000);
		notebook.showinfo();
		
		
		Goods camera = new Goods();
		camera.setName("삼성");
		camera.setPrice(50000);
		camera.showinfo();
		
		
		Goods shoes = new Goods("금강제화", 500000);
		
		shoes.showinfo();
		
		

	}

}
