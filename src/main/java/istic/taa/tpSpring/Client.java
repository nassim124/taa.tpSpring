package istic.taa.tpSpring;

import istic.taa.tpSpring.client.IClient;
import istic.taa.tpSpring.client.IRun;
import istic.taa.tpSpring.clientServices.ILane;
import istic.taa.tpSpring.clientServices.IfastLane;
import istic.taa.tpSpring.clientServices.IjustHaveLook;

import java.lang.Runnable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Client implements IClient, CommandLineRunner {

 
	@Autowired
	private IfastLane ifastLane;
	@Autowired
	private ILane iLane;
	@Autowired
	private IjustHaveLook look;

	
	public void run(String... args) throws Exception {
		System.out.println("start");
		iLane.pay();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Client.class, args);
	}
}
