package istic.taa.tpSpring.provider.domain;

public class Product implements IProduct{


	int quantity;
	long Price;
	
	public Product (int quantity, long price){
		this.quantity=quantity;
		this.Price=price;
	}
	public long getPrice() {
		return this.Price;
	}

	public int getAvailableQuantity() {
		return this.quantity;
	}

}
