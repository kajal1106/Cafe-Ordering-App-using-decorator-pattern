package CafeApp;

public class Order implements OrderInterface {
	String item;
	float price;
	
	public Order(String items, float cost) {
		item =items;
		price = cost;
	}
	@Override
	public String items() {
		// TODO Auto-generated method stub
		return " "+item+" added to the order!";
	}
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return price;
	}
}
