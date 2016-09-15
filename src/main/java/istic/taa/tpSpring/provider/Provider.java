package istic.taa.tpSpring.provider;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import istic.taa.tpSpring.provider.domain.IProduct;
import istic.taa.tpSpring.provider.domain.Product;


@Component
public class Provider implements IProvider{

	private HashMap<String, IProduct> productList;

	
	public Provider(){
		
		Product p = new Product (15, 40);
		productList= new HashMap<String, IProduct>();
		this.productList.put("riz", p);
	}

	public long getPrice(String product) {
		return productList.get(product).getPrice();
	}

	public void order(int quantite, String product) {
		System.err.println("you have ordered :"+ quantite+ " of "+ product);
	}
	
	
	public HashMap<String, IProduct> getAll(){
		return productList;
	}

}
