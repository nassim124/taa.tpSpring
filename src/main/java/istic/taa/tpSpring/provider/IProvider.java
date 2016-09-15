package istic.taa.tpSpring.provider;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import istic.taa.tpSpring.provider.domain.IProduct;

public interface IProvider {
		
	public long getPrice (String product);
	
	public void order (int quantite, String product);
	
	public HashMap<String, IProduct> getAll();
	
}
