package istic.taa.tpSpring.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import istic.taa.tpSpring.provider.IProvider;
import istic.taa.tpSpring.provider.domain.IProduct;

@RestController
@RequestMapping("/api")
public class RestServices {
	
	@Autowired
	IProvider provider;
	
	
	@RequestMapping("/product")
	public
	@ResponseBody
	String ping() {
    	return "rice price : "+ provider.getPrice("riz");
	}
	

}
