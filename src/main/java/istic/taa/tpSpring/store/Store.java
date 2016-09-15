package istic.taa.tpSpring.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import istic.taa.tpSpring.bank.Ibanque;
import istic.taa.tpSpring.provider.IProvider;

@Component
public class Store implements IStore{

	@Autowired
	private Ibanque iBanque;

	@Autowired
	private IProvider iFournisseur;
	
	public long getPrice(String product) {
		return iFournisseur.getPrice(product);
	}

	public boolean isAvailable(String product) {
		return iFournisseur.getAll().get(product).getAvailableQuantity()!=0;
	}

	public void oneShotOrder(String product, int quantity) {
		System.err.println("you have ordred "+quantity + " of "+ product);
	}

	public void addItemToCart(String product) {
		System.err.println(product + " has been added to cart ");
		
	}

	public void pay() {
		iBanque.transfert("Nassim", 15, "Amazon");
		
	}


}
