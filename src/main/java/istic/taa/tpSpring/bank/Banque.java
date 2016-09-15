package istic.taa.tpSpring.bank;

import org.springframework.stereotype.Component;


@Component
public class Banque implements Ibanque{

	public void transfert(String idClient, long amount, String adresse) {
		System.err.println("transfert completed :" + amount +" from "+ idClient+" to "+ adresse);
	}


	
}
